/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.*;
/**
 *
 * @author conne
 */
public class TestUserprofile {
    public static void main(String args[]){
        String name;
        String actor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're creating a UserProfile. Enter Your name, and then your favourite actor:");
        name = scanner.next();
        actor = scanner.next();
        UserProfile newuser = new UserProfile(name, actor);
        System.out.println("Your UserProfile has been created");
    }
    
}
