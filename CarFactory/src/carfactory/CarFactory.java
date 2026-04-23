/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carfactory;

import java.util.Scanner;

/**
 *
 * @author youse
 */
public class CarFactory {
    public static car createCar(String type) {
        if (type.equalsIgnoreCase("Gas")) return new car(new GasEngine());
        if (type.equalsIgnoreCase("Electric")) return new car(new ElectricEngine());
        if (type.equalsIgnoreCase("Hybrid")) return new car(new HybridEngine());
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        car MyCar =CarFactory.createCar("Hybrid");
        MyCar.Start();
        MyCar.accelerate();
        MyCar.accelerate();
        MyCar.accelerate();
        
        MyCar.Brake();
        MyCar.Brake();
        MyCar.Brake();
        MyCar.stop();
        ElectricEngine Engine =new ElectricEngine();
        MyCar.replaceEngine(Engine);
      
        
    }
    
}
