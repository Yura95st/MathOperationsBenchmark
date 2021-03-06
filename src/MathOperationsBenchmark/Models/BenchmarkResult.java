package MathOperationsBenchmark.Models;

import MathOperationsBenchmark.Enums.DataType;
import MathOperationsBenchmark.Enums.MathOperation;
import MathOperationsBenchmark.Utils.Guard;

public class BenchmarkResult
{
	private DataType _dataType;

	private MathOperation _mathOperation;
	
	private double _operationsCount;

	public BenchmarkResult(DataType dataType, MathOperation mathOperation,
		double operationsCount)
	{
		Guard.notNull(dataType, "dataType");
		Guard.notNull(mathOperation, "mathOperation");
		Guard.moreOrEqualToZero(operationsCount, "operationsCount");

		this._dataType = dataType;
		this._mathOperation = mathOperation;
		this._operationsCount = operationsCount;
	}

	/**
	 * Gets the data type.
	 *
	 * @return the data type
	 */
	public DataType getDataType()
	{
		return this._dataType;
	}

	/**
	 * Gets the math operation.
	 *
	 * @return the math operation
	 */
	public MathOperation getMathOperation()
	{
		return this._mathOperation;
	}

	/**
	 * Gets the operations count.
	 *
	 * @return the operations count
	 */
	public double getOperationsCount()
	{
		return this._operationsCount;
	}
}
