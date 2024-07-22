package core;
//1.variable-->we cannot change value
//2.method/function->we cannot override
//3.class-> we cannot inherit

final class FinalCall{
	final int i=1;
	final public void chagne() {
//		i++;
		System.out.println(i);
	}
}
class XYZ extends FinalCall{
	public void chagne() {
		System.out.println("child");
	}
}
public class P019_FinalKeyword {
	public static void main(String[] args) {
		FinalCall f = new FinalCall();
		f.chagne();
	}
}
