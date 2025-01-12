package compound.chapter03;

/**
 * 데코레이터로 감싸고 있으나 실수로 감싸지 않는 부분이 생김
 * 그래서 객체 생성을 한곳으로 몰아서 사용하기로함..
 * 
 * 당연하게 팩토리 패턴을 쓰면됨
 */
public class   MainTest {
    public static void main(String[] args) {
        DuckSimulator duck = new DuckSimulator();
        duck.simulate();
        System.out.println("오리 소리:" + duck.getCount());
    }
}
