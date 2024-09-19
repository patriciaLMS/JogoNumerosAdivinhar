import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        
        do{

        String textBloc = """ 


            Bem-Vindos ao Jogo de Adivinhação
            Tente adivinhar um número entre 1 a 100. Você tem 5 tentativas.

            Digite:
            - 'A' para digitar um número de 1 a 100
            - 'B' para jogar novamente
            - 'S' para sair
            """;
            System.out.println(textBloc);
            int numAleatorio = random.nextInt(101);

            char opcao = ler.nextLine().charAt(0);


             if(opcao == 'S' || opcao == 's'){
               System.out.println("Saindo do jogo...");
                
                break;
                
                
            }

            else if(opcao == 'B'|| opcao == 'b'){
                continue;
            }


            for (int i = 1; i < 6; i++) {
                

            

            if (opcao == 'A'|| opcao == 'a') {

                    System.out.println("Digite um número de 1 a 100: tentativa " + i);
                    int numEscolhido = ler.nextInt();
                    ler.nextLine(); //

                    if(numAleatorio == numEscolhido){
                        System.out.println("PARABÉNS!!! Você acertou." + " Você precisou de " + i +" tentativas até acertar.");
                        break;

                    

                    } 


                    else if(numAleatorio > numEscolhido){
                        System.out.println("O número sorteado é maior que esse...");

                        if(i == 5){
                            System.out.println("Suas 5 tentativas acabaram!!! Tente Novamente.");
                            break;
                        }
                    }

                    else if(numAleatorio < numEscolhido) {
                        System.out.println("O número sorteado é menor do que esse...");
                        
                     if(i == 5){
                            System.out.println("Suas 5 tentativas acabaram!!! Tente Novamente.");
                            break;
                        }
                    }

            }
        }

    }while (true);



            

            







        
        
       
        


    }
}
