package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass10 {
	public static void main(String[] args) {
		
		Department d1 = new Department("영업부", "대전");
		
		/*
		 * 위의 부서에서 근무하는 사원(Employee) 객체 3개를 만들어서 그 참조값 3개를 
		 * 배열에 순서대로 담아보세요.  
		 */
		
		// Employee 객체 3개 생성 
		Employee emp1 = new Employee("홍길동", 1000, d1);
		Employee emp2 = new Employee("이순신", 2000, d1);
		Employee emp3 = new Employee("장난감", 3000, d1);
		
		// Employee 배열에 담기 
		Employee[] emps = {emp1, emp2, emp3};
		emp1.printInfo();	
		System.out.println("--------");
		emp2.printInfo();
		System.out.println("--------");
		emp3.printInfo();
		
		System.out.println("----for 문 이용----");
		// 배열에 담는 다른 방법
		// Employee[] emps = new Employee[3];
		// emps[0]=emp1;
		// emps[1]=emp2;
		// emps[2]=emp3;	
		
		// for 문 이용해서 Employee[]에 담긴 Employee 객체의 .printInfo() 메소드를 순서대로 호출하기 
		for(int i=0; i<emps.length; i++) {
			
		// i번째 방에 있는 Employee 객체의 참조값 얻어내기 
		Employee tmp = emps[i];
		
		// 메소드 호출
		tmp.printInfo();
		}
		
		// 줄인 표현 
		System.out.println("----줄임 표현----");
		for(Employee tmp : emps) {
			tmp.printInfo();
		}
		}	
	}