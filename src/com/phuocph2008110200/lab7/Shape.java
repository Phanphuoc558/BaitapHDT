/*
# Ngày Tạo: 25 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab7;

public class Shape {
    private String music;
    protected boolean click = false;
    protected void click(){
        click = !click;
	}
    protected void playSound(){
        if(click ==true){
            System.out.println("Phát ra file âm thanh "+music);
        }	
    }
    protected void rotate(){
        if(click==true){
            System.out.println("Xoay 360 độ quanh theo chiều kim đồng hồ");
        }
    }
    protected Shape(String m){
        music = m;
    }
    public void setMusic(String music) {
        this.music = music;
    }
    public String getMusic() {
        return music;
    }
    public Shape(){

    }
}
