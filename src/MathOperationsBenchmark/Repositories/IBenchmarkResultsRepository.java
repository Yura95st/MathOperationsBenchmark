package MathOperationsBenchmark.Repositories;

import MathOperationsBenchmark.Models.BenchmarkResult;

public interface IBenchmarkResultsRepository
{
	/**
	 * Adds the item.
	 *
	 * @param item
	 *            the item
	 */
	void addItem(BenchmarkResult item);

	/**
	 * Generate results table.
	 *
	 * @return the string representation of the results table
	 */
	String generateResultsTable();
	
	/**
	 * Removes the item.
	 *
	 * @param item
	 *            the item
	 */
	void removeItem(BenchmarkResult item);
}
