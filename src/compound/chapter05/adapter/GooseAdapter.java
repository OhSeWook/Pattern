package compound.chapter05.adapter;

import compound.chapter05.duck.Goose;
import compound.chapter05.duck.Quackable;

/**
 * 다른 인터페이스가 왔을떄 필요한것은??
 * 어뎁터 패턴
 */
public class GooseAdapter implements Quackable {

    private Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.sound();
    }
}
