package MathOperationsBenchmark.Helpers;

import java.util.List;

import MathOperationsBenchmark.Models.BenchmarkResult;

public interface IBenchmarkResultsTableGenerator
{
	String generateResultsTable(List<BenchmarkResult> resultsList);
}
