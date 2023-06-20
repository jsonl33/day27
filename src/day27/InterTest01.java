package day27;

interface IColor{
	int RED = 1;
	public static final int GREEN = 2;
	public static final int BLUE = 3;
	
	void setColor (int c);
	public abstract int getColor();
}

abstract class AbsColor implements IColor{
	int color = GREEN;
	
	@Override
	public void setColor(int c){
		color = c;
	}
}

class SubClass15 extends AbsColor{
	@Override
	public int getColor() {
		return color;
	}
}

public class InterTest01 {
	public static void main(String[] args) {
		SubClass15 sub = new SubClass15();
		sub.setColor(IColor.BLUE);
		System.out.println(sub.getColor());
	}
}
