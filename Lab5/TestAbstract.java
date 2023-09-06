/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import Lab5.Triangle;
import Lab5.Rectangle;
import Lab5.Shape;
import java.util.*;

/**
 *
 * @author Dell
 */
public class TestAbstract {
    public static void main(String[] args) {
//        creating object abstract class
//        Shape s=new Shape();
       Shape r = new Rectangle(2, 3.4);
         r.area();
        Shape t = new Triangle(4, 5.2);
        t.area();

    }
}
