package facade;

public class Movice {
	
	public void startMovice(String name) {
		if(name == null) {
			System.out.println("영화 제목이 없어.");
			return;
		}
		
		System.out.println("영화 시작합니다 제목은 = "+ name);
	}

}
