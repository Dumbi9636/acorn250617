package test.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel{
	Image missile2Image;           // 새로운 미사일 이미지
	Image itemImage;               // 아이템 이미지
	
	int itemX = -100, itemY = -100; // 아이템 좌표 (-100이면 화면 밖)
	boolean itemVisible = false;

	long lastItemTime = 0;         // 마지막 아이템 생성 시간
	final long ITEM_INTERVAL = 20_000; // 1분마다 아이템 등장

	boolean powerMode = false;     // 파워업 활성 여부
	long powerStartTime = 0;       // 파워업 시작 시간
	final long POWER_DURATION = 10_000; // 10초 지속
	
	boolean missVisible = false;      // MISS 메시지 표시 여부
	long missTime = 0;                // MISS 발생 시간
	final long MISS_DISPLAY_DURATION = 1000; // 1초 표시
	
	// 점수를 저장할 필드
	int score = 0; 
	
	//필요한 필드 정의
	Image backImage, missImage; //monsterImage;
	
	// 몬스터 생성 주기 
	private long lastMonsterTime = 0; // 마지막 몬스터 생성 시간 기록
	private final long MONSTER_INTERVAL = 500; // 0.5초 간격
	
	// 드래곤의 좌표
	int unitX=0;
	int unitY=0;
	
	// 배경1의 y 좌표, 배경 2의 y 좌표 
	int back1Y=0, back2Y= -800;            
	
	// 몬스터 ArrayList 객체 
	List<Monster> monsterList = new ArrayList<>();
	
	// Missile 객체를 누적시킬 ArrayList 객체
	List<Missile>missList = new ArrayList<>();
	
	// 드래곤 Image 객체를 저장할 방 2개짜리 배열 객체 미리 준비
	Image[] unitImgs = new Image[2];
	
	// 드래곤이미지 인덱스
	int unitIndex;  // 선언만 하면 0으로 초기화 
	
	// 메소드 호출 횟수를 누적할 필드
	int count; 
	
	Image monsterImage;
	
	//생성자
	public GamePanel() {
		//무언가 준비 작업 ... 
		
		// Panel 의 크기 설정  width:500, height:800
		setPreferredSize(new Dimension(500, 800));
		
		// src/images/unit1.png 파일의 위치를 URL 객체로 얻어내기 
		//URL url=getClass().getResource("/images/unit1.png");
		//unitImage = new ImageIcon(url).getImage();
		// src/images/unit1.png 파일을 로딩해서 Image 객체로 만들기
		
		// 미사일 이미지 , 아이템 이미지 
		missile2Image = new ImageIcon(getClass().getResource("/images/mi1.png")).getImage();  
		itemImage = new ImageIcon(getClass().getResource("/images/item.png")).getImage();  
		
		// 드래곤이미지
		unitImgs[0] = new ImageIcon(getClass().getResource("/images/unit1.png")).getImage(); 
		unitImgs[1] = new ImageIcon(getClass().getResource("/images/unit2.png")).getImage(); 
		
		// 배경이미지
		backImage = new ImageIcon(getClass().getResource("/images/backbg.png")).getImage(); 
		
		// 미사일이미지
		missImage = new ImageIcon(getClass().getResource("/images/mi2.png")).getImage();
		
		// 몬스터이미지
		monsterImage = new ImageIcon(getClass().getResource("/images/juck1.png")).getImage(); 
		
		MouseMotionAdapter adapter = new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// 마우스의 좌표
				int x = e.getX();
				int y = e.getY();
				// 테스트로 출력해보기
				//System.out.println(x+" | "+y);
				// 마우스의 좌표를 unit 의 좌표에 반영하기
				unitX=x;
				unitY=y;
			}
	};
		// 마우스 움직임을 처리하기 위한 code
		addMouseMotionListener(adapter);
		
		// Panel 이 포커스 받을 수 있도록(key event 처리를 위해)
		setFocusable(true);
		
		// 바로 포커스 주기 
		requestFocusInWindow();
		
		// 키보드 입력 처리
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 만일 space 바를 누르면
				if(e.getKeyCode() == 32) {
					//missile 객체를 생성해서 현재 unit 의 좌표를 담은 다음 List 에 누적시키기 
					Missile m = new Missile(unitX, unitY);
					missList.add(m);
				}
			}
		});
		
		// Panel 이 10/1000 초 마다 다시 그려지게 하기 위한 타이머 설정 
		Timer timer = new Timer(10, (e)->{
			// Panel 객체의 repaint() 메소드를 호출(결과적으로 painComponent 메소드가 다시 호출된다)
			repaint();
			
			long currentTime = System.currentTimeMillis();
			
			  // 0.5초마다 몬스터 1마리 생성
		    if (currentTime - lastMonsterTime > MONSTER_INTERVAL) {
		        int x = (int)(Math.random() * 450);
		        int y = (int)(Math.random() * 200);
		        monsterList.add(new Monster(x, y));
		        lastMonsterTime = currentTime;
		    }
		 // 1분마다 아이템 생성
		    long now = System.currentTimeMillis();
		    if (!itemVisible && now - lastItemTime > ITEM_INTERVAL) {
		        itemX = (int)(Math.random() * 450);
		        itemY = -50;
		        itemVisible = true;
		        lastItemTime = now;
		    }

		});
		timer.start();
	}
	// Panel 에 무언가를 그릴때 호출되는 메소드 
	// Panel 이 초기화 될때 한번 호출되고 그다음에는 repaint() 라는 메소드가 호출될때 마다 다시 호출된다.
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// 파워업 시간 체크 (10초 지나면 종료)
		if (powerMode) {
		    long elapsed = System.currentTimeMillis() - powerStartTime;
		    if (elapsed > POWER_DURATION) {
		        powerMode = false;
		    }
		}
		
		// 아이템 이동 및 획득 처리
		if (itemVisible) {
		    itemY += 5;
		    
		    // 유닛 충돌 감지
		    if (itemY + 30 >= unitY - 50 && itemY <= unitY + 50 &&
		        itemX + 30 >= unitX - 50 && itemX <= unitX + 50) {
		        itemVisible = false;
		        powerMode = true;
		        powerStartTime = System.currentTimeMillis();
		    }
		    
		    // 아래로 사라지면 아이템 제거
		    if (itemY > getHeight()) {
		        itemVisible = false;
		    }

		    // 아이템 그리기
		    g.drawImage(itemImage, itemX, itemY, 30, 30, this);
		}
		
		// 모든 몬스터의 y 좌표를 아래로 이동
		for (Monster m : monsterList) {
		    m.setY(m.getY() + 5); // 한 프레임당 5픽셀씩 아래로 이동
		}
		
		
		// 배경 이미지 먼저 그리기
		g.drawImage(backImage, 0, back1Y,  500, 800, this);
		g.drawImage(backImage, 0, back2Y, 500, 800, this);
		// 몬스터 그리기
		for(Monster m : monsterList) {
		    g.drawImage(monsterImage, m.getX(), m.getY(), 70, 70, this);
		}
		// 유닛 충돌 또는 화면 아래쪽 벗어났는지 확인
		for (Monster m : monsterList) {
		    int ex = m.getX();
		    int ey = m.getY();

		    // 몬스터가 유닛에 닿았을 경우 (단순 충돌 박스)
		    if (ey + 50 >= unitY - 50 && ey <= unitY + 50 &&
		        ex + 50 >= unitX - 50 && ex <= unitX + 50) {
		        m.setRemove(true);
		        score = Math.max(0, score - 1); // 점수 차감 (최소 0)
		        missVisible = true; // MISS 알림 띄우기
		        missTime = System.currentTimeMillis();
		    }

		    // 몬스터가 화면 아래로 벗어남
		    if (ey > getHeight()) {
		        m.setRemove(true);
		        score = Math.max(0, score - 1);
		        missVisible = true;
		        missTime = System.currentTimeMillis();
		    }
		}
		// 미사일-몬스터 충돌 감지 및 제거 처리
		for(Missile missile : missList) {
		    for(Monster monster : monsterList) {
		        int mx = missile.getX();
		        int my = missile.getY();
		        int ex = monster.getX();
		        int ey = monster.getY();

		        // 간단한 충돌 판정 (사각형 겹침 확인)
		        if(mx >= ex && mx <= ex + 50 && my >= ey && my <= ey + 50) {
		            missile.setRemove(true);
		            monster.setRemove(true);
		            score++; // 🎯 몬스터 제거 시 점수 증가!
		        
		        }
		    }
		}
		// 반복문 돌면서 미사일 이미지 모두 그리기
		for (int i = 0; i < missList.size(); i++) {
		    Missile tmp = missList.get(i);
		    Image currentMissileImage = powerMode ? missile2Image : missImage;
		    g.drawImage(currentMissileImage, tmp.getX() - 15, tmp.getY() - 20, 30, 40, this);
		}
		//메소드의 매개변수에 전달되는 Graphics 객체를 Panel 에 그림을 그릴수 있는 도구이다
		g.drawImage(unitImgs[unitIndex], unitX-50, unitY-50, 100, 100, this);
		
		// 테스트로 미사일의 갯수 표시 
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("count:" + count, 10, 20);
		// 메소드 호출할 카운트를 증가시키기
		count++;
		
		// 점수 표시 (중앙, 크게)
		g.setColor(Color.blue);
		g.setFont(new Font("Arial", Font.BOLD, 50));

		// 점수 문자열 만들기
		String scoreText = "score: " + score;

		// 텍스트 길이에 따라 중앙 정렬 계산
		int textWidth = g.getFontMetrics().stringWidth(scoreText);
		int x = (getWidth() - textWidth) / 2;
		int y = 100;

		g.drawString(scoreText, x, y);
		if(count % 10 == 0 ) {
			// 드래곤 unitIndex 1 증가
			unitIndex++;
			//만일 존재하지 않는 인덱스라면
			if(unitIndex == 2) {
				// 인덱스를 다시 0으로 변경한다.
				unitIndex = 0;
			}
		} 
		
		
		
		// 모든 미사일의 y 좌표를 감소시켜서 미사일이 위로 이동하도록한다.
		for(Missile tmp : missList) {
			//현재 y 좌표에서 10증가 시킨 값
			int resultY = tmp.getY()-13;
			// 해당 객체에 다시 넣어준다.
			tmp.setY(resultY);
			
			// 만일 위쪽으로 화면을 벗어난 미사일 객체라면 
			if(tmp.getY() <= -20) {
				// 제거하도록 표시해둔다
				tmp.setRemove(true);
			}
		}
		// 반복문 돌면서 List 에서 제거할 Missile 객체는 제거한다. 
		for(int i=0; i<missList.size(); i++) {
			// i 번째 missile 객체
			Missile tmp = missList.get(i);
			//만일 i 번째 미사일 객체가 제거할 객체라면
			if(tmp.isRemove()) {
				// List 에서 i 번째 item을 제거한다
				missList.remove(i);
			}
		}
		
		
		back1Y += 5;
		back2Y += 5;
		// 만일 배경1이 아래쪽으로 벗어난다면 
		if(back1Y >= 800) {
			// -800 의 좌표로 다시 보낸다
			back1Y = -800;
		}
		// 만일 배경2가 아래쪽으로 벗어난다면 
		if(back2Y >= 800) {
			// -800의 좌표로 다시 보낸다 
			back2Y = -800;
		}
		
	//	// 제거 대상 몬스터 제거
		for (int i = 0; i < monsterList.size(); i++) {
		    if (monsterList.get(i).isRemove()) {
		        monsterList.remove(i);
		        i--; // remove 했을 때 인덱스 보정
		    }
		}
		// MISS 메시지 보여주기
		if (missVisible) {
		    long now = System.currentTimeMillis();
		    if (now - missTime < MISS_DISPLAY_DURATION) {
		        g.setColor(Color.red);
		        g.setFont(new Font("Arial", Font.BOLD, 40));
		        String missText = "MISS!";
		        int missWidth = g.getFontMetrics().stringWidth(missText);
		        g.drawString(missText, (getWidth() - missWidth) / 2, 160);
		    } else {
		        missVisible = false; // 1초 후 메시지 숨김
		    }
		}
	}
}