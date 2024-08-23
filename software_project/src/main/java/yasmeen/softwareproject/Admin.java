/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yasmeen.softwareproject;

/**
 *
 * @author Hp
 */
public class Admin extends Account{
    
    public Admin(String name, int age, String email, int phone,int password) {
        super(name, age, email, phone,"Admin",password);
    }
    
}
