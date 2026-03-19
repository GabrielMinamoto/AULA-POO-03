package AULA05_exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[10];
    static Scanner e = new Scanner(System.in);
    static int index;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("""
                    1 - Cadastrar bilhete
                    2 - Carregar bilhete
                    3 - Consultar Saldo
                    4 - Passar na catraca
                    5 - Finalizar
                    """);
            opcao=e.nextInt();

            switch (opcao){
                case 1:
                    cadastrarBilhete();
                    break;
                case 2:
                    carregarBilhete();
                    break;
                case 3:
                    consultarBilhete();
                    break;
                    case 4:
                        passarCatraca();
                        break;
                case 5:
                    System.out.println("Obrigado por usar nosso app!");
                    break;
                default:
                    System.out.println("Escolha uma opção válida: ");
                    opcao=e.nextInt();
            }
            System.out.println("\n ----------------------------");
        }while (opcao != 5);

    }

    private static void passarCatraca() {
        BilheteUnico b = pesquisa();
        if (b != null){
            if (b.passarNaCatraca() == false){
                System.out.println("Saldo Insuficiente!");
            }
            System.out.println("Saldo atual R$ " + b.saldo);
        }

    }

    private static void consultarBilhete() {
        DecimalFormat fMoeda = new DecimalFormat("#, ## R$ 0.00");
        BilheteUnico b = pesquisa();
        if (b != null){
            System.out.println("Seu saldo é de: " + fMoeda.format(b.saldo));
        }
    }

    private static void carregarBilhete() {
        double valor;
        BilheteUnico b = pesquisa();
        if (b != null){
            System.out.println("Digite o valor para carregar o bilhete: ");
            valor = e.nextDouble();
            b.carregar(valor);

            System.out.println("Seu bilhete foi carregado!");
        }else {
            System.out.println("Bilhete não cadastrado! Utilize a opção 1!");
        }
    }

    public static void cadastrarBilhete(){
        String nome;
        long cpf;
        String tipoTarifa;
        if (index < bilhete.length){

            System.out.println("Digite seu nome: ");
            nome = e.next();
            System.out.println("Digite seu cpf: ");
            cpf = e.nextLong();
            System.out.println("Digite seu tipo de tarifa (estudante | professor | comum): ");
            tipoTarifa=e.next();
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));
            index++;
        }else {
            System.out.println("ERRO, procure um posto de atendimento!");
        }
    }

//    sem o static ele pensa que o metodo faz parte de um objeto
    public static BilheteUnico pesquisa(){
        long cpf;
        System.out.println("Qual o CPF para pesquisa? ");
        cpf = e.nextLong();
        for (int i = 0; i < index; i++) {
            if (bilhete[i].usuario.cpf == cpf){
                return bilhete[i];
            }

        }
        System.out.println("CPF não encontrado");
        return null;
    }

}