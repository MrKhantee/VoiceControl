package com.scut.vc.weather;

import java.io.Serializable;
/**
 * 
 * @author Administrator
 *��ȡ��ǰ����ָ��������
 *cy ��ʾ����ָ��
 *yd ��ʾ�˶�ָ��
 *kt ��ʾ�յ�ָ��
 *gm ��ʾ��ðָ��
 *feel ��ʾ���ָ��
 *Direction  ����
 *Weather  ����״��
 *Temp    �¶�
 */
public class LifeCurrentCondition implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String dayWeather;
	private String nightWeather;
	private String dayTemp;
	private String nightTemp;
	private String dayDirection;
	private String nightDirection;
	private String cy;
	private String yd;
	private String kt;
	private String gm;
	private String feel;

	public LifeCurrentCondition(){
		
	}
	
	
	public String getCY()
	{
		return cy;
	}
	
	public void setCY(String cy)
	{
		this.cy = cy;
		
	}
	public String getYD()
	{
		return yd;
	}
	
	public void setYD(String yd)
	{
		this.yd = yd;
		
	}
	public String getKT()
	{
		return kt;
	}
	
	public void setKT(String kt)
	{
		this.kt = kt;
		
	}
	public String getGM()
	{
		return gm;
	}
	
	public void setGM(String gm)
	{
		this.gm = gm;
		
	}
	public String getFEEL()
	{
		return feel;
	}
	
	public void setFEEL(String feel)
	{
		this.feel= feel;
		
	}
	public void setDayWeather(String dayWeather){
		this.dayWeather = dayWeather;
	}
	
	public String getDayWeather(){
		return dayWeather;
	}
	
	public void setNightWeather(String nightWeather){
		this.nightWeather =nightWeather;
	}
	
	public String getNightWeather(){
		return nightWeather;
	}
	
	public void setDayTemp(String dayTemp){
		this.dayTemp = dayTemp;
	}
	
	public String getDayTemp(){
		return dayTemp;
	}
	
	public void setNightTemp(String nightTemp){
		this.nightTemp = nightTemp;
	}
	
	public String getNightTemp(){
		return nightTemp;
	}
	
	public void setDayDirection(String dayDirection){
		this.dayDirection = dayDirection;
	}
	
	public String getDayDirection(){
		return dayDirection;
	}
	public void setNightDirection(String nightDirection){
		this.nightDirection = nightDirection;
	}
	
	public String getNightDirection(){
		return nightDirection;
	}
	
	public String[] listString()
	{
		String[] str = new String[11];

		str[0] = "����ָ��:"+cy;
		str[1] = "�˶�ָ��:"+yd;
		str[2] = "��ðָ��:" +gm;
		str[3] = "�յ�ָ��:" +kt;
		str[4] = "���ָ����" + feel;
		str[5] = "���죺 " + dayWeather;
		str[6] = "���ϣ� " + nightWeather;
		str[7] = " " + dayTemp + "��";
		str[8] = " " + nightTemp + "��";
		str[9] = " " + dayDirection;
		str[10] = " " + nightDirection;
		return str;
		
	}
	
	
	
}



