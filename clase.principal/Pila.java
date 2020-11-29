package clase.principal;

import java.util.Scanner;

public class Pila {
    Scanner leer=new Scanner(System.in);
    int pilaNumerica[]=new int [5];
    int tope=-1;
    
    public void Insertar(){
        if (tope>=pilaNumerica.length-1){
            System.out.println("La pila esta llena");
        }else{
            tope+=1;
            System.out.println("Ingrese el dato");
            pilaNumerica[tope]=leer.nextInt();
       }
    }
    
    public void Eliminar(){
        if(tope==-1){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Se a eliminado un elemento de la pila");
            pilaNumerica[tope]=0;
            tope--;
        }
    }
    public void Mostrar(){
        for(int tope=4; tope>=0;tope--){
            System.out.println("Datos de la pila:"+pilaNumerica[tope]);
        }
    }
}
