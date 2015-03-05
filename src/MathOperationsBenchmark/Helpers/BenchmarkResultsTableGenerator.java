package MathOperationsBenchmark.Helpers;

import java.util.List;

import MathOperationsBenchmark.Models.BenchmarkResult;
import MathOperationsBenchmark.Utils.Guard;

public class BenchmarkResultsTableGenerator implements
IBenchmarkResultsTableGenerator
{
	private String[] _tableHeaderCaptions;
	
	private int[] _tableColumnWidths;
	
	private int _columnsCount;

	private int _histogramMaxWidth = 25;
	
	private double _operationsCountMaxValue;
	
	private Character _tableCellDelimiterCharacter = '|';

	private Character _tableHistogramCellCharacter = 'x';

	private Character _tableLineCharacter = '-';
	
	private Character _tableSpaceCharacter = ' ';
	
	public BenchmarkResultsTableGenerator()
	{
		this._tableHeaderCaptions = new String[] {
			"DataType", "MathOperation", "OperationsCount", "Percentage",
			"Histogram"
		};
		
		this._columnsCount = this._tableHeaderCaptions.length;

		this._tableColumnWidths = new int[this._columnsCount];
	}
	
	@Override
	public String generateResultsTable(List<BenchmarkResult> resultsList)
	{
		Guard.notNull(resultsList, "resultsList");
		
		for (BenchmarkResult benchmarkResult : resultsList)
		{
			this.updateOperationsCountMaxValue(benchmarkResult);
			this.updateColumnWidths(benchmarkResult);
		}

		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(this.getTableHeader());
		
		for (BenchmarkResult result : resultsList)
		{
			stringBuilder.append(System.lineSeparator());
			stringBuilder.append(this.getTableRow(result));
		}

		return stringBuilder.toString();
	}

	private String getCellContent(int columnIndex,
		BenchmarkResult benchmarkResult)
	{
		String cellContent = "";
		
		switch (columnIndex)
		{
			case 0:
			{
				cellContent = String.valueOf(benchmarkResult.getDataType());
				break;
			}
			case 1:
			{
				cellContent = String
						.valueOf(benchmarkResult.getMathOperation());
				break;
			}
			case 2:
			{
				cellContent = String.valueOf(benchmarkResult
					.getOperationsCount());
				break;
			}
			case 3:
			{
				cellContent = Math.ceil(benchmarkResult.getOperationsCount()
					/ this._operationsCountMaxValue * 100)
					+ "%";
				break;
			}
			case 4:
			{
				cellContent = this.getHistogramString(benchmarkResult);
				break;
			}

			default:
			{
				cellContent = "Empty";
				break;
			}
		}
		
		return cellContent;
	}
	
	private String getHistogramString(BenchmarkResult benchmarkResult)
	{
		int count = (int) Math.ceil(benchmarkResult.getOperationsCount()
			/ this._operationsCountMaxValue * this._histogramMaxWidth);
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < count; i++)
		{
			stringBuilder.append(this._tableHistogramCellCharacter);
		}
		
		return stringBuilder.toString();
	}
	
	private String getTableCell(int columnIndex, String cellContent)
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		if (columnIndex == 0)
		{
			stringBuilder.append(this._tableCellDelimiterCharacter);
		}

		stringBuilder.append(this._tableSpaceCharacter);
		stringBuilder.append(cellContent);
		
		int numberOfSpacesToAppend = this._tableColumnWidths[columnIndex]
				- cellContent.length();

		for (int i = 0; i < numberOfSpacesToAppend; i++)
		{
			stringBuilder.append(this._tableSpaceCharacter);
		}
		
		stringBuilder.append(this._tableSpaceCharacter);
		stringBuilder.append(this._tableCellDelimiterCharacter);
		
		return stringBuilder.toString();
	}
	
	private String getTableHeader()
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(this.getTableLine());
		stringBuilder.append(System.lineSeparator());
		
		for (int i = 0; i < this._columnsCount; i++)
		{
			stringBuilder.append(this.getTableCell(i, this._tableHeaderCaptions[i]));
		}

		stringBuilder.append(System.lineSeparator());
		
		stringBuilder.append(this.getTableLine());
		
		return stringBuilder.toString();
	}
	
	private String getTableLine()
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		int tableWidth = 4 + 3 * (this._columnsCount - 1);
		
		for (int maxColumnWidth : this._tableColumnWidths)
		{
			tableWidth += maxColumnWidth;
		}

		for (int i = 0; i < tableWidth; i++)
		{
			stringBuilder.append(this._tableLineCharacter);
		}
		
		return stringBuilder.toString();
	}
	
	private String getTableRow(BenchmarkResult benchmarkResult)
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < this._columnsCount; i++)
		{
			stringBuilder.append(this.getTableCell(i,
				this.getCellContent(i, benchmarkResult)));
		}
		
		return stringBuilder.toString();
	}

	private void updateColumnWidths(BenchmarkResult benchmarkResult)
	{
		for (int i = 0; i < this._columnsCount; i++)
		{
			String cellContent = this.getCellContent(i, benchmarkResult);

			this._tableColumnWidths[i] = Math
					.max(
						this._tableColumnWidths[i],
						Math.max(this._tableHeaderCaptions[i].length(),
							cellContent.length()));
		}
	}
	
	private void updateOperationsCountMaxValue(BenchmarkResult benchmarkResult)
	{
		this._operationsCountMaxValue = Math.max(this._operationsCountMaxValue,
			benchmarkResult.getOperationsCount());
	}
}