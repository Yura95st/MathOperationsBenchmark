package MathOperationsBenchmark.Utils;

public class Guard
{
	/**
	 * Checks if the specified argument is more or equal to zero.
	 *
	 * @param argument
	 *            the argument to test
	 * @param argumentName
	 *            the argument's name
	 */
	public static void isMoreOrEqualToZero(double argument, String argumentName)
	{
		if (argument < 0)
		{
			throw new IllegalArgumentException(String.format(
				"Argument can't be less, than 0: %1$s", argumentName));
		}
	}

	/**
	 * Checks if the specified argument is more or equal to zero.
	 *
	 * @param argument
	 *            the argument to test
	 * @param argumentName
	 *            the argument's name
	 */
	public static void isMoreOrEqualToZero(int argument, String argumentName)
	{
		if (argument < 0)
		{
			throw new IllegalArgumentException(String.format(
				"Argument can't be less, than 0: %1$s", argumentName));
		}
	}
	
	/**
	 * Checks if the specified argument is not null.
	 *
	 * @param argument
	 *            the argument to test
	 * @param argumentName
	 *            the argument's name
	 */
	public static void isNotNull(Object argument, String argumentName)
	{
		if (argument == null)
		{
			throw new IllegalArgumentException(String.format(
				"Argument can't be null: %1$s", argumentName));
		}
	}
}
