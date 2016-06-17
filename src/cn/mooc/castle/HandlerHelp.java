package cn.mooc.castle;

public class HandlerHelp extends Handler {
	//bye和help不需要game对象,所以可以继承父类的空参构造方法
	public HandlerHelp(){
		super();
	}

	@Override
	public void doCmd(String word) {
		System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
	}

}
