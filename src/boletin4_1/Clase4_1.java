package boletin4_1;

import javax.swing.JOptionPane;

public class Clase4_1 {
    
    public static float PonerDatos(){
        String res= JOptionPane.showInputDialog("Introduzca el numero : ");
        float num= Float.parseFloat(res);
        return num;    
    }
    public static void OperarNum(float num){
        if(num<=500){
            System.out.println("Cantidade " + num);
            System.out.println("Incremento " + (num *0.5));
            System.out.println("Cantidade final " + num *1.5);
        }
            else if (num<=1000&&num>500){
            System.out.println("Cantidade " + num);
            System.out.println("Incremento " + num*0.07);
            System.out.println("Cantidade final " + num *1.07);
            }
            else if (num<=5000&&num>1000){
            System.out.println("Cantidade " + num);
            System.out.println("Incremento " + num*0.15);
            System.out.println("Cantidade final " + num *1.15);
                    }
            else {
            System.out.println("Cantidade " + num);
            System.out.println("Disminucion " + num*0.03);
            System.out.println("Cantidade final " + (num - (num *0.03)));
}
}
}
