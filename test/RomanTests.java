import junit.framework.Assert;

import org.junit.Test;


public class RomanTests {

	@Test
	public void should_return_I_for_1(){
		Assert.assertEquals("I", Roman.convertDecimalToRoman(1));
	}
	
	@Test
	public void should_return_II_for_2(){
		Assert.assertEquals("II", Roman.convertDecimalToRoman(2));
	}

	@Test
	public void should_return_III_for_3(){
		Assert.assertEquals("III", Roman.convertDecimalToRoman(3));
	}
	
	@Test
	public void should_return_IV_for_4(){
		Assert.assertEquals("IV", Roman.convertDecimalToRoman(4));
	}

	@Test
	public void should_return_V_for_5(){
		Assert.assertEquals("V", Roman.convertDecimalToRoman(5));
	}
	
	@Test
	public void should_return_VI_for_6(){
		Assert.assertEquals("VI", Roman.convertDecimalToRoman(6));
	}

	@Test
	public void should_return_VII_for_7(){
		Assert.assertEquals("VII", Roman.convertDecimalToRoman(7));
	}
	
	@Test
	public void should_return_VIII_for_8(){
		Assert.assertEquals("VIII", Roman.convertDecimalToRoman(8));
	}

	@Test
	public void should_return_IX_for_9(){
		Assert.assertEquals("IX", Roman.convertDecimalToRoman(9));
	}
	
	@Test
	public void should_return_X_for_10(){
		Assert.assertEquals("X", Roman.convertDecimalToRoman(10));
	}

	@Test
	public void should_return_XI_for_11(){
		Assert.assertEquals("XI", Roman.convertDecimalToRoman(11));
	}
	
	@Test
	public void should_return_XII_for_12(){
		Assert.assertEquals("XII", Roman.convertDecimalToRoman(12));
	}
	
	@Test
	public void should_return_XX_for_20(){
		Assert.assertEquals("XX", Roman.convertDecimalToRoman(20));
	}
	
	@Test
	public void should_return_XL_for_40(){
		Assert.assertEquals("XL", Roman.convertDecimalToRoman(40));
	}

	@Test
	public void should_return_XLII_for_42(){
		Assert.assertEquals("XLII", Roman.convertDecimalToRoman(42));
	}

	@Test
	public void should_return_XLV_for_45(){
		Assert.assertEquals("XLV", Roman.convertDecimalToRoman(45));
	}
	
	@Test
	public void should_return_XC_for_90(){
		Assert.assertEquals("XC", Roman.convertDecimalToRoman(90));
	}

}
