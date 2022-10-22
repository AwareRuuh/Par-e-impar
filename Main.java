import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner (System.in);
  int num1, num2, num3, num4;
    System.out.print("Insira um número inteiro: ");
    num1 = sc1.nextInt();
    System.out.print("Insira mais um número: ");
    num2 = sc1.nextInt();
    num3 = 10;
    num4 = 5;
  //Par ou ímpar
    if(num1 % 2 == 0)
      System.out.println("Par: " + num1);

    else
      System.out.println("Ímpar: " + num1);

      if (num2 % 2 == 0)
        System.out.println("Par: " + num2);

      else
        System.out.println("Ímpar: " + num2);
    
        if (num3 % 2 == 0)
          System.out.println("O número já escolhido par é: " + num3);

        else
          System.out.println("O número já escolhido ímpar é: " + num3);

          if (num4 % 2 == 0)
            System.out.println("O número já escolhido par é: " + num4);

          else
            System.out.println("O número já escolhido ímpar é: " + num4);
  }
}