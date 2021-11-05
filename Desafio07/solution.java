import java.io.IOException;
import java.util.Scanner;

public class Main {
 
      public static double sum(double...values) {
       double result = 0;
       for (double value:values)
         result += value;
       return result;
     }
 
    public static void main(String[] args) throws IOException {
 
      Scanner input = new Scanner(System.in);
      
       //escreva o seu código aqui
      var competidores = input.nextInt();
      
      for (int i = 0; i < competidores; i++) {
          var nome = input.next();
  
          double[] lista = new double[7];
          var notaMultiplicadora = input.nextDouble();
  
          for (int j = 0; j < 7; j++){
              var nota = input.nextDouble();
              lista[j] = nota;
          }

          double maiorNota = lista[0];
          double menorNota = lista[0];
          
          for (int k = 0; k < lista.length; k++) {
             if (maiorNota < lista[k]) {
                maiorNota = lista[k];
             }
             
             if (menorNota > lista[k]) {
                menorNota = lista[k];
             }
          }
        
          double sum = sum(lista); 
          var total = sum - maiorNota - menorNota;

          System.out.println(String.format(nome + " %.2f ", total * notaMultiplicadora));

      } 
    }
}
