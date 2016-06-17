package cn.mooc.fictio.mycave.domain;

public class Person {
	private int bloodLength = 100;
	private int attackLenth = 20;
	private String name;
	/**
	 * @return the bloodLength
	 */
	public int getBloodLength() {
		return bloodLength;
	}
	/**
	 * @param bloodLength the bloodLength to set
	 */
	public void setBloodLength(int bloodLength) {
		this.bloodLength = bloodLength;
	}
	/**
	 * @return the attackLenth
	 */
	public int getAttackLenth() {
		return attackLenth;
	}
	/**
	 * @param attackLenth the attackLenth to set
	 */
	public void setAttackLenth(int attackLenth) {
		this.attackLenth = attackLenth;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [姓名=" + name + ", 攻击力="
				+ attackLenth + ", 当前血量=" + bloodLength + "]";
	}
	
}
