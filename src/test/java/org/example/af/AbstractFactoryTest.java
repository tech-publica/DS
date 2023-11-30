package org.example.af;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractFactoryTest {

    @Test
    public void testFactory() {
        AbstractFoodFactory factory = AbstractFoodFactory.getInstance();
        Pizza pizza = factory.createPizza(PizzaType.MARINARA);
        Arancino arancino = factory.createArancino(ArancinoType.PISTACCHIO);
        assertEquals(PalermitanaMarinara.class, pizza.getClass());
        assertEquals(PalermitanaArancinaAlPistacchio.class, arancino.getClass());
    }

}
