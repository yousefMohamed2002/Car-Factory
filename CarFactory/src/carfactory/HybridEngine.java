/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carfactory;

/**
 *
 * @author youse
 */
public class HybridEngine extends Engine{

    @Override
    public void updateCarSpeed(int CurrentCarSpeed) {
        if(CurrentCarSpeed<50){
            System.out.println("Hyprid: Using Electric Engine....");
        }else{
            System.out.println("Hyprid: Using Gas Engine ......");
        }
    }
    
    
}
