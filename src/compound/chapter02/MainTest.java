package compound.chapter02;

/**
 * 오리떼가 낸 꽥 소리의 총 횟수를 알고싶음..
 * 단 오리 클래스는 그대로 두고..'
 *
 * 객체 그대로의기능에 추가 기능을 넣고 싶을때 데코레이터를 쓰면됨..
 */
public class MainTest {
    public static void main(String[] args) {
        DuckSimulator duck = new DuckSimulator();
        duck.simulate();
        System.out.println("오리 소리:" + duck.getCount());
    }
}
