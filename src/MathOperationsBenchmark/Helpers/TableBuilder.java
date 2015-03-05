package MathOperationsBenchmark.Helpers;

import MathOperationsBenchmark.Models.TableBuilderSettings;
import MathOperationsBenchmark.Utils.Guard;

public class TableBuilder implements ITableBuilder
{
	private String[] _headerCaptions;
	
	private int[] _columnWidths;
	
	private int _columnsCount;
	
	private TableBuilderSettings _settings;
	
	public TableBuilder(int columnsCount, TableBuilderSettings settings)
	{
		Guard.moreThanZero(columnsCount, "columnsCount");
		Guard.notNull(settings, "settings");
		
		this._columnsCount = columnsCount;
		this._settings = settings;
	}
	
	@Override
	public String buildTable()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContent(Iterable<Iterable<String>> content)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHeaderCaptions(Iterable<String> headerCaptions)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSettings(TableBuilderSettings settings)
	{
		// TODO Auto-generated method stub
		
	}
	
}
