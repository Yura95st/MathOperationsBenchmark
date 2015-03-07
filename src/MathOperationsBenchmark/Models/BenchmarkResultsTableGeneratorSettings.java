package MathOperationsBenchmark.Models;

import MathOperationsBenchmark.Utils.Guard;

public class BenchmarkResultsTableGeneratorSettings
{
	private Character _histogramCharacter;

	private int _histogramWidth;
	
	public BenchmarkResultsTableGeneratorSettings()
	{
		this._histogramCharacter = 'x';
		this._histogramWidth = 25;
	}

	/**
	 * Gets the histogram character.
	 *
	 * @return the histogram character
	 */
	public Character getHistogramCharacter()
	{
		return this._histogramCharacter;
	}

	/**
	 * Gets the histogram width.
	 *
	 * @return the histogram width
	 */
	public int getHistogramWidth()
	{
		return this._histogramWidth;
	}

	/**
	 * Sets the histogram character.
	 *
	 * @param histogramCharacter
	 *            the new histogram character
	 */
	public void setHistogramCharacter(Character histogramCharacter)
	{
		this._histogramCharacter = histogramCharacter;
	}

	/**
	 * Sets the histogram width.
	 *
	 * @param histogramWidth
	 *            the new histogram width
	 */
	public void setHistogramWidth(int histogramWidth)
	{
		Guard.moreThanZero(histogramWidth, "histogramWidth");

		this._histogramWidth = histogramWidth;
	}
}
