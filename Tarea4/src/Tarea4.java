
public class Tarea4 {

  public static void main(String[] args) {
    
    int[] numeros = new int[30];
    int[] vecesNumeros = new int[10];
    
    for (int i = 0; i < 30; i++) {
      numeros[i] = (int)(Math.random()*10+1);
      
      switch (numeros[i]) {
        case 1: vecesNumeros[0]++;
        break;
        case 2: vecesNumeros[1]++;
        break;
        case 3: vecesNumeros[2]++;
        break;
        case 4: vecesNumeros[3]++;
        break;
        case 5: vecesNumeros[4]++;
        break;
        case 6: vecesNumeros[5]++;
        break;
        case 7: vecesNumeros[6]++;
        break;
        case 8: vecesNumeros[7]++;
        break;
        case 9: vecesNumeros[8]++;
        break;
        case 10: vecesNumeros[9]++;
        break;
      }
    }
    
    for(int j = 1; j <= 10; j++) {
      System.out.println("El número " + j + " aparece " + vecesNumeros[j-1] + " veces");
    }

  }

}