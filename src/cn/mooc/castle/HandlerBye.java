package cn.mooc.castle;

public class HandlerBye extends Handler {
	//bye和help不需要game对象,所以可以继承父类的空参构造方法
	public HandlerBye(){
		super();
	}
	@Override
	public boolean isBye() {
		return true;
	}
}
