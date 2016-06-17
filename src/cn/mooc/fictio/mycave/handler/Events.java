package cn.mooc.fictio.mycave.handler;

import cn.mooc.fictio.mycave.domain.Person;

public class Events {
	//被攻击
	public Person event_1(Person p){
		if(p.getAttackLenth()<30){
			p.setBloodLength(p.getBloodLength()-30);
			if(p.getBloodLength()>0){
				System.out.println("不小心遭受毒蛇攻击,经过搏斗,您不幸负伤");
			}else{
				System.out.println("不小心遭受毒蛇偷袭,经过搏斗,您不幸遇难");
			}
		}else{
			p.setAttackLenth(p.getAttackLenth()+5);
			System.out.println("不小心遭遇毒蛇进攻,经过搏斗,您成功斩杀毒蛇");
		}
		return p;
	}
	//被攻击
	public Person event_2(Person p){
		if(p.getAttackLenth()<60){
			p.setBloodLength(p.getBloodLength()-30);
			if(p.getBloodLength()>0){
				System.out.println("惊动骷髅怪物,经过搏斗,您不幸负伤");
			}else{
				System.out.println("惊动骷髅怪物,经过搏斗,您不幸遇难");
			}
		}else{
			p.setAttackLenth(p.getAttackLenth()+5);
			System.out.println("惊动骷髅怪物,经过搏斗,您成功斩杀骷髅怪");
		}
		return p;
	}
	//遭遇机关
	public Person event_3(Person p){		
		p.setBloodLength(p.getBloodLength()-10);
		if(p.getBloodLength()>0){
			System.out.println("不幸遭遇洞穴中机关,您不幸负伤");
		}else{
			System.out.println("惊动骷髅怪物,经过搏斗,您不幸遇难");
		}
		
		return p;
	}
	//血量恢复
	public Person event_4(Person p){
		p.setBloodLength(p.getBloodLength()+20);
		System.out.println("发现黑玉断续膏,你的身体情况得到很大的回复");
		return p;
	}
	//血量恢复
	public Person event_5(Person p){
		p.setBloodLength(p.getBloodLength()+10);
		System.out.println("发现陈年红牛,你的身体情况得到一定的回复");
		return p;
	}
	
	//攻击增加
	public Person event_6(Person p){
		p.setAttackLenth(p.getAttackLenth()+40);
		System.out.println("发现莽牯朱蛤,你的内力得到大力提升,");
		return p;
	}
	
	//攻击增加
	public Person event_7(Person p){
		p.setAttackLenth(p.getAttackLenth()+20);
		System.out.println("发现木剑一柄,你的攻击力得到一定的提升,");
		return p;
	}
	
	//被攻击
	public Person event_8(Person p){
		if(p.getAttackLenth()<20){
			p.setBloodLength(p.getBloodLength()-10);
			if(p.getBloodLength()>0){
				System.out.println("不小心遭受毒蜘蛛攻击,经过搏斗,您不幸负伤");
			}else{
				System.out.println("不小心遭受毒蜘蛛暗算,经过搏斗,您不幸遇难");
			}
		}else{
			p.setAttackLenth(p.getAttackLenth()+5);
			System.out.println("不小心遭遇毒蜘蛛进攻,经过搏斗,您成功踩死毒蜘蛛");
		}
		return p;
	}
}
