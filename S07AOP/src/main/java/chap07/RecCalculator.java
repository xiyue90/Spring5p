package chap07;

public class RecCalculator implements Calculator {//재귀호출

	@Override
	public long factorial(long num) {
//System.out.printf("factorial(%d)\n",num);
		System.out.printf("RE.factorial(%d)\n",num);
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
	}

}
