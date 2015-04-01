package MathOperationsBenchmark;

import java.util.ArrayList;
import java.util.List;

import MathOperationsBenchmark.Enums.DataType;
import MathOperationsBenchmark.Enums.MathOperation;
import MathOperationsBenchmark.Models.BenchmarkResult;

public class MathOperationsTester implements IMathOperationsTester
{
	private final int _tacts = 1000000;

	public MathOperationsTester()
	{
	}

	@Override
	public List<BenchmarkResult> run()
	{
		List<BenchmarkResult> results = new ArrayList<BenchmarkResult>();

		results.add(this.testAdditionOnIntegerDataType());
		results.add(this.testSubtractionOnIntegerDataType());
		results.add(this.testMultiplicationOnIntegerDataType());
		results.add(this.testDivisionOnIntegerDataType());

		results.add(this.testAdditionOnLongDataType());
		results.add(this.testSubtractionOnLongDataType());
		results.add(this.testMultiplicationOnLongDataType());
		results.add(this.testDivisionOnLongDataType());

		results.add(this.testAdditionOnFloatDataType());
		results.add(this.testSubtractionOnFloatDataType());
		results.add(this.testMultiplicationOnFloatDataType());
		results.add(this.testDivisionOnFloatDataType());

		results.add(this.testAdditionOnDoubleDataType());
		results.add(this.testSubtractionOnDoubleDataType());
		results.add(this.testMultiplicationOnDoubleDataType());
		results.add(this.testDivisionOnDoubleDataType());

		return results;
	}

	private long getEmptyLoopOnDoubleDataType()
	{
		double a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 = i;
			a2 = a1;
			a3 = a2;
			a4 = a3;
			a5 = a4;
			a6 = a5;
			a7 = a6;
			a8 = a7;
			a9 = a8;
			a10 = a9;
			a11 = a10;
			a12 = a11;
			a13 = a12;
			a14 = a13;
			a15 = a14;
			a16 = a15;
			a17 = a16;
			a18 = a17;
			a19 = a18;
			a20 = a19;
			a21 = a20;
		}

		endTime = System.nanoTime();

		long result = endTime - startTime;

		return result;
	}

	private long getEmptyLoopOnFloatDataType()
	{
		float a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 = i;
			a2 = a1;
			a3 = a2;
			a4 = a3;
			a5 = a4;
			a6 = a5;
			a7 = a6;
			a8 = a7;
			a9 = a8;
			a10 = a9;
			a11 = a10;
			a12 = a11;
			a13 = a12;
			a14 = a13;
			a15 = a14;
			a16 = a15;
			a17 = a16;
			a18 = a17;
			a19 = a18;
			a20 = a19;
			a21 = a20;
		}

		endTime = System.nanoTime();

		long result = endTime - startTime;

		return result;
	}

	private long getEmptyLoopOnIntegerDataType()
	{
		int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 = i;
			a2 = a1;
			a3 = a2;
			a4 = a3;
			a5 = a4;
			a6 = a5;
			a7 = a6;
			a8 = a7;
			a9 = a8;
			a10 = a9;
			a11 = a10;
			a12 = a11;
			a13 = a12;
			a14 = a13;
			a15 = a14;
			a16 = a15;
			a17 = a16;
			a18 = a17;
			a19 = a18;
			a20 = a19;
			a21 = a20;
		}

		endTime = System.nanoTime();

		long result = endTime - startTime;

		return result;
	}

	private long getEmptyLoopOnLongDataType()
	{
		long a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 = i;
			a2 = a1;
			a3 = a2;
			a4 = a3;
			a5 = a4;
			a6 = a5;
			a7 = a6;
			a8 = a7;
			a9 = a8;
			a10 = a9;
			a11 = a10;
			a12 = a11;
			a13 = a12;
			a14 = a13;
			a15 = a14;
			a16 = a15;
			a17 = a16;
			a18 = a17;
			a19 = a18;
			a20 = a19;
			a21 = a20;
		}

		endTime = System.nanoTime();

		long result = endTime - startTime;

		return result;
	}

	private BenchmarkResult testAdditionOnDoubleDataType()
	{
		double a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 += 2.0;
			a2 += a1;
			a3 += a2;
			a4 += a3;
			a5 += a4;
			a6 += a5;
			a7 += a6;
			a8 += a7;
			a9 += a8;
			a10 += a9;
			a11 += a10;
			a12 += a11;
			a13 += a12;
			a14 += a13;
			a15 += a14;
			a16 += a15;
			a17 += a16;
			a18 += a17;
			a19 += a18;
			a20 += a19;
			a21 += a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnDoubleDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Double, MathOperation.Addition, result);

		return benchmarkResult;
	}

	private BenchmarkResult testAdditionOnFloatDataType()
	{
		float a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 += 2.0;
			a2 += a1;
			a3 += a2;
			a4 += a3;
			a5 += a4;
			a6 += a5;
			a7 += a6;
			a8 += a7;
			a9 += a8;
			a10 += a9;
			a11 += a10;
			a12 += a11;
			a13 += a12;
			a14 += a13;
			a15 += a14;
			a16 += a15;
			a17 += a16;
			a18 += a17;
			a19 += a18;
			a20 += a19;
			a21 += a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnFloatDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Float, MathOperation.Addition, result);

		return benchmarkResult;
	}

	private BenchmarkResult testAdditionOnIntegerDataType()
	{
		int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 += 2;
			a2 += a1;
			a3 += a2;
			a4 += a3;
			a5 += a4;
			a6 += a5;
			a7 += a6;
			a8 += a7;
			a9 += a8;
			a10 += a9;
			a11 += a10;
			a12 += a11;
			a13 += a12;
			a14 += a13;
			a15 += a14;
			a16 += a15;
			a17 += a16;
			a18 += a17;
			a19 += a18;
			a20 += a19;
			a21 += a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnIntegerDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Integer, MathOperation.Addition,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testAdditionOnLongDataType()
	{
		long a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 += 2;
			a2 += a1;
			a3 += a2;
			a4 += a3;
			a5 += a4;
			a6 += a5;
			a7 += a6;
			a8 += a7;
			a9 += a8;
			a10 += a9;
			a11 += a10;
			a12 += a11;
			a13 += a12;
			a14 += a13;
			a15 += a14;
			a16 += a15;
			a17 += a16;
			a18 += a17;
			a19 += a18;
			a20 += a19;
			a21 += a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnLongDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Long, MathOperation.Addition, result);

		return benchmarkResult;
	}

	private BenchmarkResult testDivisionOnDoubleDataType()
	{
		double a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 /= 2;
			a2 /= a1;
			a3 /= a2;
			a4 /= a3;
			a5 /= a4;
			a6 /= a5;
			a7 /= a6;
			a8 /= a7;
			a9 /= a8;
			a10 /= a9;
			a11 /= a10;
			a12 /= a11;
			a13 /= a12;
			a14 /= a13;
			a15 /= a14;
			a16 /= a15;
			a17 /= a16;
			a18 /= a17;
			a19 /= a18;
			a20 /= a19;
			a21 /= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnDoubleDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Double, MathOperation.Division, result);

		return benchmarkResult;
	}

	private BenchmarkResult testDivisionOnFloatDataType()
	{
		float a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 /= 2;
			a2 /= a1;
			a3 /= a2;
			a4 /= a3;
			a5 /= a4;
			a6 /= a5;
			a7 /= a6;
			a8 /= a7;
			a9 /= a8;
			a10 /= a9;
			a11 /= a10;
			a12 /= a11;
			a13 /= a12;
			a14 /= a13;
			a15 /= a14;
			a16 /= a15;
			a17 /= a16;
			a18 /= a17;
			a19 /= a18;
			a20 /= a19;
			a21 /= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnFloatDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Float, MathOperation.Division, result);

		return benchmarkResult;
	}

	private BenchmarkResult testDivisionOnIntegerDataType()
	{
		int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 1; i <= this._tacts; i++)
		{
			a1 = this._tacts / i;
			a2 = a1 / i;
			a3 = a2 / i;
			a4 = a3 / i;
			a5 = a4 / i;
			a6 = a5 / i;
			a7 = a6 / i;
			a8 = a7 / i;
			a9 = a8 / i;
			a10 = a9 / i;
			a11 = a10 / i;
			a12 = a11 / i;
			a13 = a12 / i;
			a14 = a13 / i;
			a15 = a14 / i;
			a16 = a15 / i;
			a17 = a16 / i;
			a18 = a17 / i;
			a19 = a18 / i;
			a20 = a19 / i;
			a21 = a20 / i;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnIntegerDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Integer, MathOperation.Division,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testDivisionOnLongDataType()
	{
		long a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 1; i <= this._tacts; i++)
		{
			a1 = this._tacts / i;
			a2 = a1 / i;
			a3 = a2 / i;
			a4 = a3 / i;
			a5 = a4 / i;
			a6 = a5 / i;
			a7 = a6 / i;
			a8 = a7 / i;
			a9 = a8 / i;
			a10 = a9 / i;
			a11 = a10 / i;
			a12 = a11 / i;
			a13 = a12 / i;
			a14 = a13 / i;
			a15 = a14 / i;
			a16 = a15 / i;
			a17 = a16 / i;
			a18 = a17 / i;
			a19 = a18 / i;
			a20 = a19 / i;
			a21 = a20 / i;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnLongDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Long, MathOperation.Division, result);

		return benchmarkResult;
	}

	private BenchmarkResult testMultiplicationOnDoubleDataType()
	{
		double a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 *= 2;
			a2 *= a1;
			a3 *= a2;
			a4 *= a3;
			a5 *= a4;
			a6 *= a5;
			a7 *= a6;
			a8 *= a7;
			a9 *= a8;
			a10 *= a9;
			a11 *= a10;
			a12 *= a11;
			a13 *= a12;
			a14 *= a13;
			a15 *= a14;
			a16 *= a15;
			a17 *= a16;
			a18 *= a17;
			a19 *= a18;
			a20 *= a19;
			a21 *= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnDoubleDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Double, MathOperation.Multiplication,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testMultiplicationOnFloatDataType()
	{
		float a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 *= 2;
			a2 *= a1;
			a3 *= a2;
			a4 *= a3;
			a5 *= a4;
			a6 *= a5;
			a7 *= a6;
			a8 *= a7;
			a9 *= a8;
			a10 *= a9;
			a11 *= a10;
			a12 *= a11;
			a13 *= a12;
			a14 *= a13;
			a15 *= a14;
			a16 *= a15;
			a17 *= a16;
			a18 *= a17;
			a19 *= a18;
			a20 *= a19;
			a21 *= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnFloatDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Float, MathOperation.Multiplication,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testMultiplicationOnIntegerDataType()
	{
		int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 *= 2;
			a2 *= a1;
			a3 *= a2;
			a4 *= a3;
			a5 *= a4;
			a6 *= a5;
			a7 *= a6;
			a8 *= a7;
			a9 *= a8;
			a10 *= a9;
			a11 *= a10;
			a12 *= a11;
			a13 *= a12;
			a14 *= a13;
			a15 *= a14;
			a16 *= a15;
			a17 *= a16;
			a18 *= a17;
			a19 *= a18;
			a20 *= a19;
			a21 *= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnIntegerDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Integer, MathOperation.Multiplication,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testMultiplicationOnLongDataType()
	{
		long a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 *= 2;
			a2 *= a1;
			a3 *= a2;
			a4 *= a3;
			a5 *= a4;
			a6 *= a5;
			a7 *= a6;
			a8 *= a7;
			a9 *= a8;
			a10 *= a9;
			a11 *= a10;
			a12 *= a11;
			a13 *= a12;
			a14 *= a13;
			a15 *= a14;
			a16 *= a15;
			a17 *= a16;
			a18 *= a17;
			a19 *= a18;
			a20 *= a19;
			a21 *= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnLongDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Long, MathOperation.Multiplication,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testSubtractionOnDoubleDataType()
	{
		double a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 -= 2.0;
			a2 -= a1;
			a3 -= a2;
			a4 -= a3;
			a5 -= a4;
			a6 -= a5;
			a7 -= a6;
			a8 -= a7;
			a9 -= a8;
			a10 -= a9;
			a11 -= a10;
			a12 -= a11;
			a13 -= a12;
			a14 -= a13;
			a15 -= a14;
			a16 -= a15;
			a17 -= a16;
			a18 -= a17;
			a19 -= a18;
			a20 -= a19;
			a21 -= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnDoubleDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Double, MathOperation.Subtraction,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testSubtractionOnFloatDataType()
	{
		float a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 -= 2.0;
			a2 -= a1;
			a3 -= a2;
			a4 -= a3;
			a5 -= a4;
			a6 -= a5;
			a7 -= a6;
			a8 -= a7;
			a9 -= a8;
			a10 -= a9;
			a11 -= a10;
			a12 -= a11;
			a13 -= a12;
			a14 -= a13;
			a15 -= a14;
			a16 -= a15;
			a17 -= a16;
			a18 -= a17;
			a19 -= a18;
			a20 -= a19;
			a21 -= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnFloatDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Float, MathOperation.Subtraction,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testSubtractionOnIntegerDataType()
	{
		int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 -= 2;
			a2 -= a1;
			a3 -= a2;
			a4 -= a3;
			a5 -= a4;
			a6 -= a5;
			a7 -= a6;
			a8 -= a7;
			a9 -= a8;
			a10 -= a9;
			a11 -= a10;
			a12 -= a11;
			a13 -= a12;
			a14 -= a13;
			a15 -= a14;
			a16 -= a15;
			a17 -= a16;
			a18 -= a17;
			a19 -= a18;
			a20 -= a19;
			a21 -= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnIntegerDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Integer, MathOperation.Subtraction,
				result);

		return benchmarkResult;
	}

	private BenchmarkResult testSubtractionOnLongDataType()
	{
		long a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 =
			9, a10 = 10, a11 = 11, a12 = 12, a13 = 13, a14 = 14, a15 = 15, a16 =
			16, a17 = 17, a18 = 18, a19 = 19, a20 = 20, a21 = 21;

		long startTime, endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < this._tacts; i++)
		{
			a1 -= 2;
			a2 -= a1;
			a3 -= a2;
			a4 -= a3;
			a5 -= a4;
			a6 -= a5;
			a7 -= a6;
			a8 -= a7;
			a9 -= a8;
			a10 -= a9;
			a11 -= a10;
			a12 -= a11;
			a13 -= a12;
			a14 -= a13;
			a15 -= a14;
			a16 -= a15;
			a17 -= a16;
			a18 -= a17;
			a19 -= a18;
			a20 -= a19;
			a21 -= a20;
		}

		endTime = System.nanoTime();

		double result =
			((double) this._tacts)
				/ (endTime - startTime - this.getEmptyLoopOnLongDataType());

		BenchmarkResult benchmarkResult =
			new BenchmarkResult(DataType.Long, MathOperation.Subtraction,
				result);

		return benchmarkResult;
	}
}
