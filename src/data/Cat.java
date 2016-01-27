/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author HT
 */
public class Cat extends Pet{

    public Cat(String name, double weight) {
        super(name, weight);
    }
 
    @Override
    public int run() {
        return 6969;
    }
}
