package clase.principal;

import java.util.Scanner;


public class ClasePrincipal {
   public static void main(String[] args) {
      Pila obj=new Pila ();
      Scanner op=new Scanner (System.in);
      int opcion;
      do{
         System.out.println("*********Opciones*********");
         System.out.println("1.-Ingresa los elementos");
         System.out.println("2.-Elimina los elementos");
         System.out.println("3.-Mostrar los elementos");
         System.out.println("4.-Salir");
         System.out.println("ingresar una opción");
         opcion=op.nextInt();
                  
                switch(opcion){
                     case 1:
                          obj.Insertar();
                          break;
                      case 2:
                          obj.Eliminar();
                          break;
                      case 3:
                          obj.Mostrar();
                          break;
                      case 4:
                          break;
                      default:
                          System.out.println("ingrese una opción valida");
                  }
      }while (opcion !=4);
    }
}
