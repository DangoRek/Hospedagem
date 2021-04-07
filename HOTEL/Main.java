import java.util.Scanner;

class QuickStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos quartos deseja alocar:");
        int num = sc.nextInt();
        Quartos[] locacao = new Quartos[10];
        int i;
        sc.nextLine();

        for(i=0; i<num; i++){
            System.out.println("Quarto"+i);
            System.out.println("Digite o Nome do locador:");
            String nome = sc.nextLine();
            System.out.println("Digite o Email do locador:");
            String email = sc.nextLine();
            System.out.println();
            locacao[i] = new Quartos(nome, email);
        }

        for(i=0; i<num; i++){
            System.out.println(locacao[i]);
        }

        sc.close();
    }
}