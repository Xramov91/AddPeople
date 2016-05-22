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
public class Logic {
public Logic(){
}
private int i = 0;
static int c = 0;


People ar[]=new People[500];
public void add(String name, int age){
    ar[i] = new People(name, age);
    i++;
}
public void info(){
    for(int i=0;i<2;i++){
        System.out.println(ar[i].getname() + ", "  +ar[i].getage());
    }
}
public void addAr(People p[]){
ar = p;
}
//void infoC(){
//    System.out.println(c+"  i="+i);
//}
//void infoAr(){
//    for(int t=0;t<i;t++){
//    System.out.println(ar[t]);
//    }
//}
}
