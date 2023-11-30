package org.example.af;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class AbstractFoodFactory {
     public abstract Pizza createPizza(PizzaType type);
     public abstract Arancino createArancino(ArancinoType type);
     
     private static AbstractFoodFactory instance;
     
     public static AbstractFoodFactory getInstance() {
    	 return instance;
     }
     
     static {
    	 Properties props = new Properties();
         try(FileInputStream fis = new FileInputStream("factory.config")) {
        	 props.load(fis);
        	 String className = props.getProperty("factoryClass");
        	 instance = (AbstractFoodFactory)Class.forName(className).newInstance();
         } catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			instance = new CataneseFoodFactory();
		}
     }
     
     
}
