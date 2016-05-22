/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addpeople;

/**
 *
 * @author Alex
 */
public class People {
    private int age;
    private String name;
    private static int kol=0;
    public People (String name1, int age1){
        age = age1;
        name = name1;
        kol++;
    }
    public People(){
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public int getKol(){
        return kol;
    }
    
}
