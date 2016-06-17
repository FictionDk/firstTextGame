package cn.mooc.castle;

import java.util.HashMap;

public class Room {
	//房间描述
    private String description;
    //该房间连接房间列表<方向,房间>
    private HashMap<String, Room> exits = new HashMap<String, Room>();
    
    public Room(String description) 
    {
        this.description = description;
    }
    
    public void setExit(String dirctory,Room room){
    	this.exits.put(dirctory, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc(){
    	StringBuilder sb = new StringBuilder();
    	for(String dir:exits.keySet()){
    		sb.append(dir);
    		sb.append(' ');
    	}
    	return sb.toString();
    }
    
    public Room getExit(String desc){
    	return exits.get(desc);
    }
    
    
}
