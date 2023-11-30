package org.example.af;

public class CataneseFoodFactory extends AbstractFoodFactory {

	@Override
	public Pizza createPizza(PizzaType type) {
		switch(type) {
		case CASERECCIA :
			return new CataneseCasereccia();
		case MARINARA:
			return new CataneseMarinara();
			default:
				throw new PizzaNotSupportedException(); // :)
		}
		
	}

	@Override
	public Arancino createArancino(ArancinoType type) {
		switch(type) {
		case PISTACCHIO :
			return new CataneseArancinoAlPistacchio();
		case RAGU:
			return new CataneseArancinoAlRagu();
		case MELANZANE:
			return new CataneseArancinoAlleMelanzane();
			default:
				throw new ArancinoNotSupportedException(); // :)
		}
	}

}
