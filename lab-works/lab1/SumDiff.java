class SumDiff{
	public void sum(int a, int b){
		int sum = a+b;
		System.out.println("The sum is :"+sum);
	}
	public void Diff(int c, int d){
		int diff = c-d;
		System.out.println("The difference is :"+diff);
	}
	public static void main(String[] args){
	SumDiff sd = new SumDiff();
	sd.sum(4,3);
	sd.Diff(5,4);
	}
}