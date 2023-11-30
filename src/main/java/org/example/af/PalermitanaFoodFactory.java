package org.example.af;

public class PalermitanaFoodFactory extends AbstractFoodFactory {

	@Override
	public Pizza createPizza(PizzaType type) {
		switch(type) {
		case CASERECCIA :
			return new PalermitanaCasereccia();
		case MARINARA:
			return new PalermitanaMarinara();
			default:
				throw new PizzaNotSupportedException(); // :)
		}
	}

	@Override
	public Arancino createArancino(ArancinoType type) {
		switch(type) {
		case PISTACCHIO :
			return new PalermitanaArancinaAlPistacchio();
		case RAGU:
			return new PalermitanaArancinaAlRagu();
		case MELANZANE:
			return new PalermitanaArancinaAlleMelanzane();
			default:
				throw new ArancinoNotSupportedException(); // :)
		}
	}

}
