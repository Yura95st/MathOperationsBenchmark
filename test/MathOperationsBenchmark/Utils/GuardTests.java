package MathOperationsBenchmark.Utils;

import org.junit.Test;

public class GuardTests
{
	@Test(expected = IllegalArgumentException.class)
	public void MoreOrEqualToZero_DoubleNumberIsLessThanZero_ThrowsIllegalArgumentException()
	{
		double number = -1.0;
		Guard.moreOrEqualToZero(number, "number");
	}

	@Test
	public void MoreOrEqualToZero_DoubleNumberisMoreOrEqualToZero_DoesNotThrowAnyException()
	{
		double number = 0.0;
		
		Guard.moreOrEqualToZero(number, "number");
		
		number = 1.0;
		
		Guard.moreOrEqualToZero(number, "number");
	}

	@Test(expected = IllegalArgumentException.class)
	public void MoreOrEqualToZero_IntegerNumberIsLessThanZero_ThrowsIllegalArgumentException()
	{
		int number = -1;
		Guard.moreOrEqualToZero(number, "number");
	}

	@Test
	public void MoreOrEqualToZero_IntegerNumberisMoreOrEqualToZero_DoesNotThrowAnyException()
	{
		int number = 0;
		
		Guard.moreOrEqualToZero(number, "number");
		
		number = 1;
		
		Guard.moreOrEqualToZero(number, "number");
	}

	@Test
	public void NotNull_ObjectIsNotNull_DoesNotThrowAnyException()
	{
		Object tempObject = new Object();

		Guard.notNull(tempObject, "tempObject");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void NotNull_ObjectIsNull_ThrowsIllegalArgumentException()
	{
		Object tempObject = null;

		Guard.notNull(tempObject, "tempObject");
	}
}
