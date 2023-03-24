package facade;

/**
 * @author osw
 * 퍼싸드 facedeHome
 * 복잡한 서브시스템을 통합관리함.
 * 클라이언트에서 쉽게 사용가능.
 */
public class Client {

	public static void main(String[] args) {
		FacadeHome fh = new FacadeHome(new Movice(), new Screen());
		fh.watchMovie("타짜");
	}
}
