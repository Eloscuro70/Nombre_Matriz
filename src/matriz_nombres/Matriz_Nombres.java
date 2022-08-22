package matriz_nombres;
import java.util.Scanner;

public class Matriz_Nombres {

    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      String[][] elementos = new String[4][4];

              
              System.out.println("Digite la Matríz: ");
              for(int i=0; i<4; i++){
                  for(int j=0; j<4; j++){
                      System.out.println("Matríz ["+i+"]["+j+"]: ");
                      elementos[i][j] = entrada.next();
                  }
              }
        
        System.out.println("/n La matríz es : ");
      for(int i=0; i<4; i++){//número de filas
          for(int j=0; j<4; j++){//número de columnas
              System.out.println(elementos[i][j]);
          }
          System.out.println("");
      
      }
    }
}
    

