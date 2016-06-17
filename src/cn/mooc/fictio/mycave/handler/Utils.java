package cn.mooc.fictio.mycave.handler;

import cn.mooc.fictio.mycave.domain.Cave;
import cn.mooc.fictio.mycave.domain.Person;

//静态方法类
public class Utils {
	//go方法
	public static Cave Go(String dir,Cave currCave){
		Cave nextCave = currCave.getCaveByDir(dir);
		if(nextCave == null){
			System.out.println("那边没有路,你撞了包");
		}else{
			currCave = nextCave;
		}
		return currCave;
	}
	
	//help方法
	public static void help(Person p){
		System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
        System.out.println("攻击力:"+p.getAttackLenth()+":血量="+p.getBloodLength());
	}
	//随机遭遇
	public static Person randomEvent(Person p){
		Events event = new Events();
		double d = Math.random();
		int i = (int)(d*10);
		System.out.println("Utils :i="+i);
		switch (i) {
		case 1:
			p = event.event_1(p);
			break;
		case 2:
			p = event.event_2(p);
			break;
		case 3:
			p = event.event_3(p);
			break;
		case 4:
			p = event.event_4(p);
			break;
		case 5:
			p = event.event_5(p);
			break;
		case 6:
			p = event.event_6(p);
			break;
		case 7:
			p = event.event_6(p);
			break;
		case 8:
			p = event.event_6(p);
			break;

		default:
			break;
		}
		return p;
	}
	

}
