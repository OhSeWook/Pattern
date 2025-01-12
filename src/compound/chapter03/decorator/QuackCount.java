package compound.chapter03.decorator;

import compound.chapter03.duck.Quackable;
import lombok.Getter;

@Getter
public class QuackCount implements Quackable {
    public static int count;
    private Quackable quack;
    public QuackCount(Quackable quack) {
        count = 0;
        this.quack = quack;
    }
    public void quack() {
        count++;
        quack.quack();
    }
}
