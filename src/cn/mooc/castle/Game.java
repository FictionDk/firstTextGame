package cn.mooc.castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private static HashMap<String, Handler> handlers = new HashMap<String, Handler>();
        
    public Game() 
    {
    	handlers.put("bye",  new HandlerBye());
    	handlers.put("help", new HandlerHelp());
    	//在构造的同时,将当期game对象传递至go中
    	handlers.put("go", new HandlerGo(this));
        createRooms();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;  
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口
        outside.setExit("east",lobby);
        outside.setExit("south",study);
        outside.setExit("west",pub);
        study.setExit("east", bedroom);
        study.setExit("north", outside);
        bedroom.setExit("west", study);
        pub.setExit("east", outside);
        lobby.setExit("west", outside);

        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        showCurrRoom();
    }

	private void showCurrRoom() {
		System.out.println("现在你在" + currentRoom);
        System.out.print("出口有：");
        System.out.println(currentRoom.getExitDesc());
	}

	//用户命令
    public void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom; 
            showCurrRoom();
        }
    }
    
	private static void play() {
		Scanner in = new Scanner(System.in);
		while ( true ) {
        		String line = in.nextLine();
        		String[] words = line.split(" ");
        		//实现传递一个参数,返回一个类对象,进而实现一个参数实现一个方法
        		Handler handler = handlers.get(words[0]);
        		String value = "";
        		//若是bye或者help,传递空参进入doCmd
        		if(words.length>1){
        			value = words[1];
        		}
        		if(handler!=null){
        			//对应的对象调用对应对象的doCmd命令
        			handler.doCmd(value);
        			if(handler.isBye()){
        				break;
        			}
        		}		
        }
		in.close();
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.printWelcome();
        play();
        System.out.println("感谢您的光临。再见！");
	}
}
