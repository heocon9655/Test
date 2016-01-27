/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package use;

import data.Cat;
import data.Pet;

/**
 *
 * @author HT
 */
public class Main {
    public static void main(String[] args){
        Pet pet = new Pet("Ngao", 50) {

            @Override
            public int run() {
                return 6868;
            }
        };
        System.out.println("Run at spd: " + pet.run());
        
        Pet cat = new Pet("Meo", 3) {

            @Override
            public int run() {
               return 6789;
            }
        };
        System.out.println("Run at spd: " + pet.run());
    }
    
    Pet kitty = new Cat("kitty", 5);
    
}
