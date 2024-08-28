/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yasmeen.softwareproject;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Owneraccount extends Account{
    private ArrayList<Store> stores;
    public Owneraccount(String name, int age, String email, int phone,int password) {
        super(name, age, email, phone,"Owner",password);
        stores=new ArrayList<>();
    }
    public void addstore(String storename,String cityname){
       stores.add(new Store(storename,cityname));
    }
public ArrayList<Store> getStores(){
        return stores;
}


}
