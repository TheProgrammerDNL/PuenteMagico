public class PuenteMagico {
   
   //Inputs
   static int n = 4;
   static int m = 3;
   static char puente[] = new char [n + m + 1];
   
   //N y M
   //A y R
   public static void main(String args[]) {
      
      //Asignación de valores
      for (int i = 0; i < n; i++) {
         puente[i] = 'A';
      }
      
      puente[n] = '_';
      
      for (int i = n+1; i < puente.length; i++) {
         puente[i] = 'R';
      }
      
      imprimir();
   }
   
   
   
   
   
   
   
   
   
   private static void imprimir() {
      for (int i = 0; i < puente.length; i++) {
         System.out.print(puente[i]);
      }
   }
   
   private static void desplazar() {
      
   }
   
   private static void brincar() {
   
   }
}