import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o dia inicial: ");
        int dia1 = ler.nextInt();
        System.out.println("Digite o mês inicial: ");
        int mes1 = ler.nextInt();
        System.out.println("Digite o ano inicial: ");
        int ano1 = ler.nextInt();

       
        System.out.println("\nPara saber a diferença de datas\nDigite o dia: ");
        int dia2 = ler.nextInt();
        System.out.println("Digite o mês: ");
        int mes2 = ler.nextInt();
        System.out.println("Digite o ano final: ");
        int ano2 = ler.nextInt();

        int idade = ano2 - ano1;
        int somameses = mes2 - mes1;
        int somadias = dia2 - dia1;

int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

if (somadias < 0) {
    int mesAnterior = mes2 - 1;
    if (mesAnterior == 0) {
        mesAnterior = 12;
    }
    
    somadias += diasPorMes[mesAnterior];
    somameses--;
}

if (somameses < 0) {
    somameses += 12;
}
        switch (somameses) {
            case 0:
                if (somadias < 0) {
                    idade--;
                }
                break;
            case 1:
                if (somadias < 0) {
                    idade--;
                }
                break;
            case -11:
                idade--;
                break;
            default:
                if (somameses < 0) {
                    idade--;
                }
                break;
            }
                System.out.println(idade + " anos, " + somameses + " meses e " + somadias + " dias.");
        } 
    }
