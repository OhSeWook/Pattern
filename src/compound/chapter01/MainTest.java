package compound.chapter01;

/**
 * 전혀 다른 인터페이스가 주워졌을떄 필요한것은??
 * Goose가 주워짐 하지만 오리는 Quackable 인터페이시를 사용해야함.
 *
 * 그래서 필요한것은 어뎁터 페턴으로 연결시켜줌...
 */
public class MainTest {
    public static void main(String[] args) {
        DuckSimulator duck = new DuckSimulator();
        duck.simulate();
    }
}
