package cn.mooc.fictio.mycave.domain;

import java.util.HashMap;

public class Cave {
	//该房间的描述
	private String description;
	//该房间的出口
	private HashMap<String, Cave> exits = new HashMap<String, Cave>();
	//使用描述来初始化洞穴
	public Cave(String desc){
		this.description = desc;
	}
	
	//基本的set/get方法
	public String getDescription() {
		return description;
	}
	//获取房间出口
	public String getExits() {
		StringBuilder sb = new StringBuilder();
		for(String key : exits.keySet()){
			sb.append(key);
			sb.append(' ');
		}
		return sb.toString();
	}
	//设置房间出口
	public void setExits(String dictoray, Cave cave) {
		this.exits.put(dictoray, cave);
	}
	//通过方向获取对应的洞穴
	public Cave getCaveByDir(String dir){
		return exits.get(dir);
	}
	//显示当前洞穴以及方向
	public String show() {
		return "[当前处于" + description + ", 出口方向有" + this.getExits() + "]";
	}

	@Override
	public String toString() {
		return this.description;
	}
}
