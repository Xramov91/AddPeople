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
public class AddPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        People p1 = new People("Саша", 21);
        People p2 = new People("Антон",15);
        Logic log = new Logic();
//        log.add("Миша", 2);
//        log.add("Маша", 9);
//        log.add("Сережа", 8);
//        log.add("Кирилл", 14);
        People arPeople[] = new People[2];
        
        arPeople[0] = p1;
        arPeople[1] = p2;
       log.addAr(arPeople);
   //   log.info();
//System.out.println(arPeople[0].getname());
//System.out.println(arPeople[1].getname());
//log.infoAr();
//log.infoC();
log.info();
//log.infoC();

    }
    
}
