package cn.mooc.castle;

public class Handler {
	protected Game game;
	public Handler(){}
	public Handler(Game game){
		this.game = game;
	}
	
	public void doCmd(String word){}

	public boolean isBye() {
		
		return false;
	};
	

}
