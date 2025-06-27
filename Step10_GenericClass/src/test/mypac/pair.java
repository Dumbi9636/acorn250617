package test.mypac;

// Generic 클래스는 2개 이상일수도 있다. 
public class pair<K, V> {
	
	//월드
	private K key;
	private V value;
	
	//생성자
	public pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	//메소드
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
