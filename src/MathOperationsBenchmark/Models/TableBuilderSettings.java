package MathOperationsBenchmark.Models;

public class TableBuilderSettings
{
	private Character _cellDelimiterCharacter;
	
	private Character _lineCharacter;

	private Character _spaceCharacter;

	public TableBuilderSettings()
	{
		this._cellDelimiterCharacter = '|';
		this._lineCharacter = '-';
		this._spaceCharacter = ' ';
	}

	/**
	 * Gets the cell delimiter character.
	 *
	 * @return the cell delimiter character
	 */
	public Character getCellDelimiterCharacter()
	{
		return this._cellDelimiterCharacter;
	}

	/**
	 * Gets the line character.
	 *
	 * @return the line character
	 */
	public Character getLineCharacter()
	{
		return this._lineCharacter;
	}

	/**
	 * Gets the space character.
	 *
	 * @return the space character
	 */
	public Character getSpaceCharacter()
	{
		return this._spaceCharacter;
	}

	/**
	 * Sets the cell delimiter character.
	 *
	 * @param cellDelimiterCharacter the new cell delimiter character
	 */
	public void setCellDelimiterCharacter(Character cellDelimiterCharacter)
	{
		this._cellDelimiterCharacter = cellDelimiterCharacter;
	}

	/**
	 * Sets the line character.
	 *
	 * @param lineCharacter the new line character
	 */
	public void setLineCharacter(Character lineCharacter)
	{
		this._lineCharacter = lineCharacter;
	}

	/**
	 * Sets the space character.
	 *
	 * @param spaceCharacter the new space character
	 */
	public void setSpaceCharacter(Character spaceCharacter)
	{
		this._spaceCharacter = spaceCharacter;
	}
}
