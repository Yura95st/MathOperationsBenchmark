package MathOperationsBenchmark;

import java.util.ArrayList;
import java.util.List;

import MathOperationsBenchmark.Enums.DataType;
import MathOperationsBenchmark.Enums.MathOperation;
import MathOperationsBenchmark.Models.BenchmarkResult;

public class MathOperationsTester implements IMathOperationsTester
{
	private int _tacts = 10000000;
	
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
	
	private BenchmarkResult testAdditionOnDoubleDataType()
	{
		double[] variables = new double[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] += 2;
			variables[1] += variables[0];
			variables[2] += variables[1];
			variables[3] += variables[2];
			variables[4] += variables[3];
			variables[5] += variables[4];
			variables[6] += variables[5];
			variables[7] += variables[6];
			variables[8] += variables[7];
			variables[9] += variables[8];
			variables[10] += variables[9];
			variables[11] += variables[10];
			variables[12] += variables[11];
			variables[13] += variables[12];
			variables[14] += variables[13];
			variables[15] += variables[14];
			variables[16] += variables[15];
			variables[17] += variables[16];
			variables[18] += variables[17];
			variables[19] += variables[18];
			variables[20] += variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Double,
			MathOperation.Addition, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testAdditionOnFloatDataType()
	{
		float[] variables = new float[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] += 2;
			variables[1] += variables[0];
			variables[2] += variables[1];
			variables[3] += variables[2];
			variables[4] += variables[3];
			variables[5] += variables[4];
			variables[6] += variables[5];
			variables[7] += variables[6];
			variables[8] += variables[7];
			variables[9] += variables[8];
			variables[10] += variables[9];
			variables[11] += variables[10];
			variables[12] += variables[11];
			variables[13] += variables[12];
			variables[14] += variables[13];
			variables[15] += variables[14];
			variables[16] += variables[15];
			variables[17] += variables[16];
			variables[18] += variables[17];
			variables[19] += variables[18];
			variables[20] += variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Float,
			MathOperation.Addition, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testAdditionOnIntegerDataType()
	{
		int[] variables = new int[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] += 2;
			variables[1] += variables[0];
			variables[2] += variables[1];
			variables[3] += variables[2];
			variables[4] += variables[3];
			variables[5] += variables[4];
			variables[6] += variables[5];
			variables[7] += variables[6];
			variables[8] += variables[7];
			variables[9] += variables[8];
			variables[10] += variables[9];
			variables[11] += variables[10];
			variables[12] += variables[11];
			variables[13] += variables[12];
			variables[14] += variables[13];
			variables[15] += variables[14];
			variables[16] += variables[15];
			variables[17] += variables[16];
			variables[18] += variables[17];
			variables[19] += variables[18];
			variables[20] += variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Integer,
			MathOperation.Addition, result);
		
		return benchmarkResult;
	}

	private BenchmarkResult testAdditionOnLongDataType()
	{
		long[] variables = new long[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] += 2;
			variables[1] += variables[0];
			variables[2] += variables[1];
			variables[3] += variables[2];
			variables[4] += variables[3];
			variables[5] += variables[4];
			variables[6] += variables[5];
			variables[7] += variables[6];
			variables[8] += variables[7];
			variables[9] += variables[8];
			variables[10] += variables[9];
			variables[11] += variables[10];
			variables[12] += variables[11];
			variables[13] += variables[12];
			variables[14] += variables[13];
			variables[15] += variables[14];
			variables[16] += variables[15];
			variables[17] += variables[16];
			variables[18] += variables[17];
			variables[19] += variables[18];
			variables[20] += variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Long,
			MathOperation.Addition, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testDivisionOnDoubleDataType()
	{
		double[] variables = new double[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] /= 2;
			variables[1] /= variables[0];
			variables[2] /= variables[1];
			variables[3] /= variables[2];
			variables[4] /= variables[3];
			variables[5] /= variables[4];
			variables[6] /= variables[5];
			variables[7] /= variables[6];
			variables[8] /= variables[7];
			variables[9] /= variables[8];
			variables[10] /= variables[9];
			variables[11] /= variables[10];
			variables[12] /= variables[11];
			variables[13] /= variables[12];
			variables[14] /= variables[13];
			variables[15] /= variables[14];
			variables[16] /= variables[15];
			variables[17] /= variables[16];
			variables[18] /= variables[17];
			variables[19] /= variables[18];
			variables[20] /= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Double,
			MathOperation.Division, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testDivisionOnFloatDataType()
	{
		float[] variables = new float[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] /= 2;
			variables[1] /= variables[0];
			variables[2] /= variables[1];
			variables[3] /= variables[2];
			variables[4] /= variables[3];
			variables[5] /= variables[4];
			variables[6] /= variables[5];
			variables[7] /= variables[6];
			variables[8] /= variables[7];
			variables[9] /= variables[8];
			variables[10] /= variables[9];
			variables[11] /= variables[10];
			variables[12] /= variables[11];
			variables[13] /= variables[12];
			variables[14] /= variables[13];
			variables[15] /= variables[14];
			variables[16] /= variables[15];
			variables[17] /= variables[16];
			variables[18] /= variables[17];
			variables[19] /= variables[18];
			variables[20] /= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Float,
			MathOperation.Division, result);
		
		return benchmarkResult;
	}

	private BenchmarkResult testDivisionOnIntegerDataType()
	{
		int[] variables = new int[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 1; i <= this._tacts; i++)
		{
			variables[0] = this._tacts / i;
			variables[1] = variables[0] / i;
			variables[2] = variables[1] / i;
			variables[3] = variables[2] / i;
			variables[4] = variables[3] / i;
			variables[5] = variables[4] / i;
			variables[6] = variables[5] / i;
			variables[7] = variables[6] / i;
			variables[8] = variables[7] / i;
			variables[9] = variables[8] / i;
			variables[10] = variables[9] / i;
			variables[11] = variables[10] / i;
			variables[12] = variables[11] / i;
			variables[13] = variables[12] / i;
			variables[14] = variables[13] / i;
			variables[15] = variables[14] / i;
			variables[16] = variables[15] / i;
			variables[17] = variables[16] / i;
			variables[18] = variables[17] / i;
			variables[19] = variables[18] / i;
			variables[20] = variables[19] / i;
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Integer,
			MathOperation.Division, result);
		
		return benchmarkResult;
	}

	private BenchmarkResult testDivisionOnLongDataType()
	{
		long[] variables = new long[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 1; i <= this._tacts; i++)
		{
			variables[0] = this._tacts / i;
			variables[1] = variables[0] / i;
			variables[2] = variables[1] / i;
			variables[3] = variables[2] / i;
			variables[4] = variables[3] / i;
			variables[5] = variables[4] / i;
			variables[6] = variables[5] / i;
			variables[7] = variables[6] / i;
			variables[8] = variables[7] / i;
			variables[9] = variables[8] / i;
			variables[10] = variables[9] / i;
			variables[11] = variables[10] / i;
			variables[12] = variables[11] / i;
			variables[13] = variables[12] / i;
			variables[14] = variables[13] / i;
			variables[15] = variables[14] / i;
			variables[16] = variables[15] / i;
			variables[17] = variables[16] / i;
			variables[18] = variables[17] / i;
			variables[19] = variables[18] / i;
			variables[20] = variables[19] / i;
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Long,
			MathOperation.Division, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testMultiplicationOnDoubleDataType()
	{
		double[] variables = new double[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] *= 2;
			variables[1] *= variables[0];
			variables[2] *= variables[1];
			variables[3] *= variables[2];
			variables[4] *= variables[3];
			variables[5] *= variables[4];
			variables[6] *= variables[5];
			variables[7] *= variables[6];
			variables[8] *= variables[7];
			variables[9] *= variables[8];
			variables[10] *= variables[9];
			variables[11] *= variables[10];
			variables[12] *= variables[11];
			variables[13] *= variables[12];
			variables[14] *= variables[13];
			variables[15] *= variables[14];
			variables[16] *= variables[15];
			variables[17] *= variables[16];
			variables[18] *= variables[17];
			variables[19] *= variables[18];
			variables[20] *= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Double,
			MathOperation.Multiplication, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testMultiplicationOnFloatDataType()
	{
		float[] variables = new float[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] *= 2;
			variables[1] *= variables[0];
			variables[2] *= variables[1];
			variables[3] *= variables[2];
			variables[4] *= variables[3];
			variables[5] *= variables[4];
			variables[6] *= variables[5];
			variables[7] *= variables[6];
			variables[8] *= variables[7];
			variables[9] *= variables[8];
			variables[10] *= variables[9];
			variables[11] *= variables[10];
			variables[12] *= variables[11];
			variables[13] *= variables[12];
			variables[14] *= variables[13];
			variables[15] *= variables[14];
			variables[16] *= variables[15];
			variables[17] *= variables[16];
			variables[18] *= variables[17];
			variables[19] *= variables[18];
			variables[20] *= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Float,
			MathOperation.Multiplication, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testMultiplicationOnIntegerDataType()
	{
		int[] variables = new int[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] *= 2;
			variables[1] *= variables[0];
			variables[2] *= variables[1];
			variables[3] *= variables[2];
			variables[4] *= variables[3];
			variables[5] *= variables[4];
			variables[6] *= variables[5];
			variables[7] *= variables[6];
			variables[8] *= variables[7];
			variables[9] *= variables[8];
			variables[10] *= variables[9];
			variables[11] *= variables[10];
			variables[12] *= variables[11];
			variables[13] *= variables[12];
			variables[14] *= variables[13];
			variables[15] *= variables[14];
			variables[16] *= variables[15];
			variables[17] *= variables[16];
			variables[18] *= variables[17];
			variables[19] *= variables[18];
			variables[20] *= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Integer,
			MathOperation.Multiplication, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testMultiplicationOnLongDataType()
	{
		long[] variables = new long[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] *= 2;
			variables[1] *= variables[0];
			variables[2] *= variables[1];
			variables[3] *= variables[2];
			variables[4] *= variables[3];
			variables[5] *= variables[4];
			variables[6] *= variables[5];
			variables[7] *= variables[6];
			variables[8] *= variables[7];
			variables[9] *= variables[8];
			variables[10] *= variables[9];
			variables[11] *= variables[10];
			variables[12] *= variables[11];
			variables[13] *= variables[12];
			variables[14] *= variables[13];
			variables[15] *= variables[14];
			variables[16] *= variables[15];
			variables[17] *= variables[16];
			variables[18] *= variables[17];
			variables[19] *= variables[18];
			variables[20] *= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Long,
			MathOperation.Multiplication, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testSubtractionOnDoubleDataType()
	{
		double[] variables = new double[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] -= 2;
			variables[1] -= variables[0];
			variables[2] -= variables[1];
			variables[3] -= variables[2];
			variables[4] -= variables[3];
			variables[5] -= variables[4];
			variables[6] -= variables[5];
			variables[7] -= variables[6];
			variables[8] -= variables[7];
			variables[9] -= variables[8];
			variables[10] -= variables[9];
			variables[11] -= variables[10];
			variables[12] -= variables[11];
			variables[13] -= variables[12];
			variables[14] -= variables[13];
			variables[15] -= variables[14];
			variables[16] -= variables[15];
			variables[17] -= variables[16];
			variables[18] -= variables[17];
			variables[19] -= variables[18];
			variables[20] -= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Double,
			MathOperation.Subtraction, result);
		
		return benchmarkResult;
	}
	
	private BenchmarkResult testSubtractionOnFloatDataType()
	{
		float[] variables = new float[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] -= 2;
			variables[1] -= variables[0];
			variables[2] -= variables[1];
			variables[3] -= variables[2];
			variables[4] -= variables[3];
			variables[5] -= variables[4];
			variables[6] -= variables[5];
			variables[7] -= variables[6];
			variables[8] -= variables[7];
			variables[9] -= variables[8];
			variables[10] -= variables[9];
			variables[11] -= variables[10];
			variables[12] -= variables[11];
			variables[13] -= variables[12];
			variables[14] -= variables[13];
			variables[15] -= variables[14];
			variables[16] -= variables[15];
			variables[17] -= variables[16];
			variables[18] -= variables[17];
			variables[19] -= variables[18];
			variables[20] -= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Float,
			MathOperation.Subtraction, result);
		
		return benchmarkResult;
	}

	private BenchmarkResult testSubtractionOnIntegerDataType()
	{
		int[] variables = new int[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] -= 2;
			variables[1] -= variables[0];
			variables[2] -= variables[1];
			variables[3] -= variables[2];
			variables[4] -= variables[3];
			variables[5] -= variables[4];
			variables[6] -= variables[5];
			variables[7] -= variables[6];
			variables[8] -= variables[7];
			variables[9] -= variables[8];
			variables[10] -= variables[9];
			variables[11] -= variables[10];
			variables[12] -= variables[11];
			variables[13] -= variables[12];
			variables[14] -= variables[13];
			variables[15] -= variables[14];
			variables[16] -= variables[15];
			variables[17] -= variables[16];
			variables[18] -= variables[17];
			variables[19] -= variables[18];
			variables[20] -= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Integer,
			MathOperation.Subtraction, result);
		
		return benchmarkResult;
	}

	private BenchmarkResult testSubtractionOnLongDataType()
	{
		long[] variables = new long[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21
		};

		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < this._tacts; i++)
		{
			variables[0] -= 2;
			variables[1] -= variables[0];
			variables[2] -= variables[1];
			variables[3] -= variables[2];
			variables[4] -= variables[3];
			variables[5] -= variables[4];
			variables[6] -= variables[5];
			variables[7] -= variables[6];
			variables[8] -= variables[7];
			variables[9] -= variables[8];
			variables[10] -= variables[9];
			variables[11] -= variables[10];
			variables[12] -= variables[11];
			variables[13] -= variables[12];
			variables[14] -= variables[13];
			variables[15] -= variables[14];
			variables[16] -= variables[15];
			variables[17] -= variables[16];
			variables[18] -= variables[17];
			variables[19] -= variables[18];
			variables[20] -= variables[19];
		}
		
		endTime = System.nanoTime();
		
		double result = ((double) this._tacts) / (endTime - startTime);
		
		BenchmarkResult benchmarkResult = new BenchmarkResult(DataType.Long,
			MathOperation.Subtraction, result);
		
		return benchmarkResult;
	}
}
