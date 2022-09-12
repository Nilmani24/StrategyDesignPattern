import com.strategy.*;

public class Main {

    public static void main(String[] args) {
	  Duck duck  = new MallardDuck();
      duck.setFlyBehaviour(new FlyWithWings());
      duck.setQuackBehaviour(new Quack());
      duck.display();
      duck.performFly();
      duck.performQuack();



      Duck duck1 = new RubberDuck();
      duck1.setFlyBehaviour(new FlyNoWay());
      duck1.setQuackBehaviour(new Mute());
      duck1.display();
      duck1.performQuack();
      duck1.performFly();

    }
}
