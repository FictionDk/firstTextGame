package cn.mooc.fictio.mycave.handler;

import java.util.Scanner;

import cn.mooc.fictio.mycave.domain.Cave;
import cn.mooc.fictio.mycave.domain.Person;

public class Game {
	private Cave currCave;
	private Person person;
	
	public Game(){
		creatCave();
		person = new Person();
	}
	
	public void creatCave(){
		//创造房间,初始化房间的两个元素,描述和出口
		Cave entry,lobby,path1,strCave,stonCave,smallCave,bigCave,path2;
		entry = new Cave("一个不知名洞口");
		lobby = new Cave("一个宽敞明亮的大型洞穴");
		path1 = new Cave("一个幽暗的天然地道,路边依稀可见动物尸骨和残骸");
		strCave = new Cave("一个奇怪洞室,带有一张石床");
		smallCave = new Cave("一个小型洞窟,上方隐约有亮光");
		stonCave = new Cave("一个带有石像的洞窟,有地下河经过");
		bigCave = new Cave("空荡荡的一个大洞穴,中央有一个巨大的石台,似乎被人用过");
		path2 = new Cave("一个宽大的走道,明显有凿痕");
		
		entry.setExits("east", lobby);		
		lobby.setExits("east", path2);		
		lobby.setExits("south", path1);
		path2.setExits("east", bigCave);
		path2.setExits("west", lobby);
		path1.setExits("north", lobby);
		path1.setExits("south", strCave);
		strCave.setExits("north", path1);
		strCave.setExits("east", smallCave);
		smallCave.setExits("west", strCave);
		smallCave.setExits("north", stonCave);
		stonCave.setExits("south", smallCave);
		stonCave.setExits("north",bigCave);
		bigCave.setExits("west", path2);
		bigCave.setExits("south", stonCave);
		
		currCave = entry;
	}
	
	public void welcome(){
		System.out.println("欢迎你来到伏虎洞探险");
		System.out.println("这是一个基于翁恺老师课程作业的无聊游戏");
		System.out.println("需要帮助,请输入help");
		showCurrCave();
	}

	public void showCurrCave() {
		System.out.println(currCave.show());
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.welcome();
		game.play();
		System.out.println("你回首一笑,深藏功与名");
	}

	private void play() {
		Scanner in = new Scanner(System.in);
		while(true){
			String line = in.nextLine();
			String[] words = line.split(" +");
			if(words.length==1){
				if("help".equals(words[0]))
					Utils.help(person);
				else if("bye".equals(words[0]))
					break;
				else
					System.out.println("输入命令错误");
			}else{
				currCave = Utils.Go(words[1], currCave);
				showCurrCave();
				person = Utils.randomEvent(person);
				if(person.getBloodLength()<0){
					break;
				}
			}
		}
		in.close();
	}

}
