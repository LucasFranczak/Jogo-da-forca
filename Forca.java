import java.util.Scanner;

public class Forca {
    
    /**
     * 
     */
    public static void main(){
        String palavra ="bicicleta";
        String letrasUsadas = "";
        String palavraAdivinhada = "";
        int MAX_TENTATIVAS = 10;

        for(int i = 0; 1 < palavra.length(); i++ ){ // cria a palavra a ser adivinhada com traços
            palavraAdivinhada += "_";

            for(int tentativas = 0; ; tentativas ++){ // verifica numero de tentativas
                if (tentativas == MAX_TENTATIVAS){
                    System.out.printf(" Foram %d tentativas, a palavra era %s", MAX_TENTATIVAS, palavra);
                    System.exit(0);
                }

                System.out.printf("Rodada %d. Até agora adivinhadas: %s. Qual a sua proxima letra?%n", tentativas, palavraAdivinhada);

                char letraTentada = new Scanner(System.in).next().charAt(0);
                if (letrasUsadas.indexOf(letraTentada)>= 0){; // caso a letra usada esteja em letras tentados, sera uma letra repetida
                    System.out.printf("A letra %c ja foi tentada %n", letraTentada);
                } else {
                    letrasUsadas += letraTentada;
                    
                    if(palavra.indexOf(letraTentada) >= 0){
                        palavraAdivinhada = "";

                        for(int j = 0; j < palavra.length(); j++){

                            palavraAdivinhada += letraTentada.indexOf(palavra.charAt(j)) >=0 ? palavra.charAt(j): "_";   
                        }

                        if(palavraAdivinhada.contains("_")){
                            System.out.printf("Muito bom!", null);
                        }
                    }
                }

            }
        }

    }
}
