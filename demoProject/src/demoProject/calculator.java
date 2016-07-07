package demoProject;

public interface calculator {
	public Integer add(Integer val1,Integer val2);
	public Integer subtract(Integer val1,Integer val2);
	public Long multiply(Integer val1,Integer val2);
	public Integer divide(Integer val1,Integer val2) throws ArithmeticException;
}
