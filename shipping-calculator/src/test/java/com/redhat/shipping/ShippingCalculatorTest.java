package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

   @Test

   public void onNARegionTheCostIs100() {
		ShippingCalculator calculator = new ShippingCalculator();
		int calculatedCost = calculator.costForRegion("NA");
	      // assertEquals(100, (new ShippingCalculator()).costForRegion("NA"));
		assertEquals(100, calculatedCost);
   }

   @Test

   public void canCalculateTheCostForARegion() {

	       ShippingCalculator calculator = new ShippingCalculator();



	           assertEquals(0, calculator.costForRegion("A Region"));

   }


   @Test

   public void onLATAMRegionTheCostIs200() {

	       ShippingCalculator calculator = new ShippingCalculator();

	       int calculatedCost = calculator.costForRegion("LATAM");
		assertEquals(200, calculatedCost);

   }

   @Test

   public void onEMEARegionTheCostIs300() {
	       ShippingCalculator calculator = new ShippingCalculator();
	        int calculatedCost = calculator.costForRegion("EMEA");
		assertEquals(300, calculatedCost);
   }
}
