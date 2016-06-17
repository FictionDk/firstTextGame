package cn.mooc.castle;

public class HandlerGo extends Handler {

	//通过构造函数,在对象创建过程中,将game对象传递进来
	public HandlerGo(Game game){
		super(game);
	}

	@Override
	public void doCmd(String word) {
		//调用game对象中的goRoom方法
		//此种方法其实是加强了Game和Handler之间的耦合
		game.goRoom(word);
	}

}
