/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carfactory;

/**
 *
 * @author youse
 */
public class car {
   
        private Engine engine; 
        private int CurrentSpeed=0;

    public car(Engine engine) {
        this.engine = engine;
    }
     public void replaceEngine(Engine NewEngine){
         this.engine=NewEngine;
         System.out.println("Engine Replaced Successfully");
         
     }
     public void Start(){
         this.CurrentSpeed=0;
         System.out.println("Car Started At 0 Speed");
     }
     public void stop(){
         if(CurrentSpeed==0)
         {
             System.out.println("Car Stopped");
         }else{
             System.out.println("can't Stop speed must be zero !");
         }
     }
     public  void accelerate(){
         if(CurrentSpeed+20<=200){
             CurrentSpeed+=20;
             for (int i=0;i<20;i++) engine.IncreaseInternalSpeed();
             engine.updateCarSpeed(CurrentSpeed);
              System.out.println("Speed "+ CurrentSpeed+" Km/h");
             
         }
     }
     
     public  void Brake(){
         if(CurrentSpeed-20>=0){
             CurrentSpeed-=20;
             for (int i=0;i<20;i++) engine.DecreaseInternalSpeed();
             engine.updateCarSpeed(CurrentSpeed);
              System.out.println("Speed "+ CurrentSpeed+" Km/h");
             
         }
     }
     
     
    }
    
    

