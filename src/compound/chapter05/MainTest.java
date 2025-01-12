package compound.chapter05;

/**
 * 오리 객체 들을 컬렉션으로 관리받길 원함..
 *
 * 컴포지트 패턴 사용 composite
 * 트리 구조 이기때문에 composite Flock에 Quackable를 상속받아야함.
 */
public class   MainTest {
    public static void main(String[] args) {
        DuckSimulator duck = new DuckSimulator();
        duck.simulate();
        System.out.println(duck.getCount());
    }
}
