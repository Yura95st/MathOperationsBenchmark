package MathOperationsBenchmark.Helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import MathOperationsBenchmark.Models.TableBuilderSettings;
import MathOperationsBenchmark.Utils.Guard;

public class TableBuilder implements ITableBuilder
{
	private int _columnsCount;

	private int[] _columnWidths;

	private List<String[]> _content;
	
	private String[] _headerCaptions;

	private TableBuilderSettings _settings;

	public TableBuilder(int columnsCount, TableBuilderSettings settings)
	{
		Guard.moreThanZero(columnsCount, "columnsCount");
		Guard.notNull(settings, "settings");

		this._columnsCount = columnsCount;
		this._settings = settings;
		
		this._headerCaptions = new String[columnsCount];
		this._content = new ArrayList<String[]>();

		this._columnWidths = new int[columnsCount];
	}

	@Override
	public String buildTable()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<List<String>> getContent()
	{
		List<List<String>> result = new ArrayList<List<String>>();

		for (String[] tableRow : this._content)
		{
			result.add(Arrays.asList(tableRow));
		}

		return result;
	}

	@Override
	public List<String> getHeaderCaptions()
	{
		return Arrays.asList(this._headerCaptions);
	}

	@Override
	public void setContent(Iterable<Iterable<String>> content)
	{
		Guard.notNull(content, "content");

		// Clear the content list
		this._content.clear();

		for (Iterable<String> row : content)
		{
			String[] tableRow = new String[this._columnsCount];

			if (row != null)
			{
				int i = 0;
				Iterator<String> iterator = row.iterator();

				while (i < this._columnsCount && iterator.hasNext())
				{
					tableRow[i] = iterator.next();
					i++;
				}

				this._content.add(tableRow);
			}
		}
	}
	
	@Override
	public void setHeaderCaptions(Iterable<String> headerCaptions)
	{
		Guard.notNull(headerCaptions, "headerCaptions");

		// Clear the headerCaptions array
		Arrays.fill(this._headerCaptions, null);

		int i = 0;
		Iterator<String> iterator = headerCaptions.iterator();

		while (i < this._columnsCount && iterator.hasNext())
		{
			this._headerCaptions[i] = iterator.next();
			i++;
		}
	}
	
	@Override
	public void setSettings(TableBuilderSettings settings)
	{
		Guard.notNull(settings, "settings");

		this._settings = settings;
	}

}
