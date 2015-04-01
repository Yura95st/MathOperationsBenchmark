package MathOperationsBenchmark;

import java.util.List;

import MathOperationsBenchmark.Helpers.BenchmarkResultsTableGenerator;
import MathOperationsBenchmark.Helpers.IBenchmarkResultsTableGenerator;
import MathOperationsBenchmark.Models.BenchmarkResult;

public class Main
{
	public static void main(String[] args)
	{
		IMathOperationsTester mathOperationsTester = new MathOperationsTester();

		IBenchmarkResultsTableGenerator resultsTableGenerator =
			new BenchmarkResultsTableGenerator();

		List<BenchmarkResult> benchmarkResults;

		for (int i = 0; i < 1; i++)
		{
			benchmarkResults = mathOperationsTester.run();

			System.out.println(resultsTableGenerator
					.generateResultsTable(benchmarkResults));
		}
	}
}
