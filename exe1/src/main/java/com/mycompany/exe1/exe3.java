package com.mycompany.exe1;


public class exe3 {
   String X = "Olá";
   String Y = "Mundo";

    public exe3() {
    }
   
   public String getX(){
       return X;
   }
   public void setX(String X){
       this.X = X;
   }
    public String getY(){
       return Y;
   }
   public void setY(String Y){
       this.Y = Y;
   }
   
   public void mostrar(){
       System.out.println(X +" "+Y);
   }
}
