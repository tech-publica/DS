package strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();

		mallard.quack();
		rubberDuckie.quack();
		decoy.quack();
   
		model.fly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.fly();
	}
}
