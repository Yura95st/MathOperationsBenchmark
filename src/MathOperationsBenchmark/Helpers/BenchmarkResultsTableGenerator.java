package MathOperationsBenchmark.Helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import MathOperationsBenchmark.Models.BenchmarkResult;
import MathOperationsBenchmark.Models.TableBuilderSettings;
import MathOperationsBenchmark.Utils.Guard;

public class BenchmarkResultsTableGenerator implements
		IBenchmarkResultsTableGenerator
{
	private Character _histogramCharacter = 'x';
	
	private int _histogramMaxWidth = 25;

	private double _operationsCountMaxValue = 0;

	private ITableBuilder _tableBuilder;

	public BenchmarkResultsTableGenerator()
	{
		String[] headerCaptions = new String[] {
			"DataType", "MathOperation", "OperationsCount", "Percentage",
			"Histogram"
		};

		TableBuilderSettings tableBuilderSettings = new TableBuilderSettings();
		
		this._tableBuilder = new TableBuilder(headerCaptions.length,
			tableBuilderSettings);

		this._tableBuilder.setHeaderCaptions(Arrays.asList(headerCaptions));
	}

	@Override
	public String generateResultsTable(
		List<BenchmarkResult> benchmarkResultsList)
	{
		Guard.notNull(benchmarkResultsList, "benchmarkResultsList");
		
		this._operationsCountMaxValue = 0;
		
		for (BenchmarkResult benchmarkResult : benchmarkResultsList)
		{
			this._operationsCountMaxValue = Math.max(
				this._operationsCountMaxValue,
				benchmarkResult.getOperationsCount());
		}

		List<Iterable<String>> tableContent = new ArrayList<Iterable<String>>();
		
		for (BenchmarkResult benchmarkResult : benchmarkResultsList)
		{
			tableContent.add(this.getTableRow(benchmarkResult));
		}

		this._tableBuilder.setContent(tableContent);
		
		return this._tableBuilder.buildTable();
	}

	private String getHistogramString(double operationsCount)
	{
		int count = (int) Math.ceil(operationsCount
			/ this._operationsCountMaxValue * this._histogramMaxWidth);

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < count; i++)
		{
			stringBuilder.append(this._histogramCharacter);
		}

		return stringBuilder.toString();
	}

	private List<String> getTableRow(BenchmarkResult benchmarkResult)
	{
		List<String> tableRow = new ArrayList<String>();

		tableRow.add(benchmarkResult.getDataType().name());

		tableRow.add(benchmarkResult.getMathOperation().name());

		tableRow.add(String.format("%1$.2f * 10^9", benchmarkResult.getOperationsCount()));
		
		int percentage = (int) Math.ceil(benchmarkResult
			.getOperationsCount() / this._operationsCountMaxValue * 100);

		tableRow.add(String.format("%1$d%%", percentage));

		tableRow.add(this.getHistogramString(benchmarkResult
				.getOperationsCount()));

		return tableRow;
	}
}