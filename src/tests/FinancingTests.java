package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

/* - Construtor
      	• Deve criar o objeto com os dados corretos quando os dados forem válidos
      	• Deve lançar IllegalArgumentException quando os dados não forem válidos
*/
	@Test
	public void constructorShouldCreatedObjectWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());	
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenValidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
		
	}
	
/* - setTotalAmount
		• Deve atualizar o valor quando os dados forem válidos
		• Deve lançar IllegalArgumentException quando os dados não forem válidos
*/
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		 
		// arrage
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setTotalAmount(90000.0);
		
		// assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());

	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
		
	}
	
/* - setIncome
 		• Deve atualizar o valor quando os dados forem válidos
    	• Deve lançar IllegalArgumentException quando os dados não forem válidos
*/
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		 
		// arrage
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setIncome(2100.0);
		
		// assert
		Assertions.assertEquals(2100.0, f.getIncome());

	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1900.0);
		});
		
	}
	
/* - setMonths
    	• Deve atualizar o valor quando os dados forem válidos
    	• Deve lançar IllegalArgumentException quando os dados não forem válidos
*/
	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		 
		// arrage
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setMonths(81);
		
		// assert
		Assertions.assertEquals(81, f.getMonths());

	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(79);
		});
		
	}

/* - entry
		• Deve calcular corretamente o valor da entrada
*/
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, f.entry());
		
	}
	
/* - quota
	• Deve calcular corretamente o valor da prestação
*/
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000.0, f.quota());
		
	}
	
	

}

















