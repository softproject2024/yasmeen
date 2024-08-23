/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yasmeen.softwareproject;

import java.util.ArrayList;


public class Account {
protected int age;
protected int password;
protected String name;
protected String email;
protected int phone;
protected String type;
protected ArrayList<String>messages;
public Account(String name,int age,String email,int phone,String type,int password){
 this.age=age;
 this.email= email;
 this.phone=phone;
 this.name= name;
 this.type= type;
 messages=new ArrayList<>();
 this.password=password;

}
public void setname(String name){
    this.name=name;
}
public void setage(int age){
    this.age=age;
}
public void setphone(int phone){
    this.phone=phone;
}
public void setpassword(int password){
    this.password=password;
}
public int getpassword(){
   return password; 
}
public ArrayList messages(){
    return messages;
}

public String gettype(){
    return type;
}
public String getname(){
    return name;
}   
public String getemail(){
    return email;
}
public int getphone(){
    return phone;
}
public int getage(){
    return age;
}
}
