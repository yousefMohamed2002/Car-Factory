/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carfactory;

/**
 *
 * @author youse
 */
public abstract class Engine {
  protected int InternSpeed;

 
  public  void IncreaseInternalSpeed(){
      this.InternSpeed++;
  }
  public  void DecreaseInternalSpeed(){
      if(InternSpeed>0){
          this.InternSpeed--;
      }
  }
  public  int getInternalSpeed(){
           return InternSpeed;
          }
  public abstract void updateCarSpeed(int CurrentCarSpeed);
  


    
}
