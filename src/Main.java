import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        //inicizilaiza pilha e fila

        int opcao = -1;

        //menu

        do {
            System.out.println("\nGerenciamento de atendimento");
            System.out.println("1 - Adicionar solicitação ao histórico");
            System.out.println("2 - Remover solicitação do histórico");
            System.out.println("3 - Exibir histórico");
            System.out.println("4 - Adicionar cliente à fila");
            System.out.println("5 - Atender próximo cliente");
            System.out.println("6 - Exibir fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try { //se nao inserir valor valido
                opcao = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida!");
                opcao = -1;
            }

            //chama funcoes dependendo da opcao selecionada

            switch (opcao) {
                case 1:
                    System.out.print("ID da solicitação: ");
                    String ids = sc.nextLine();
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();
                    System.out.print("Data e hora: ");
                    String data = sc.nextLine();
                    pilha.adicionar(ids, desc, data);
                    break;

                case 2:
                    pilha.remover();
                    break;

                case 3:
                    pilha.consultar();
                    break;

                case 4:
                    System.out.print("ID do cliente: ");
                    String idc = sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Motivo do atendimento: ");
                    String motivo = sc.nextLine();
                    fila.adicionar(idc, nome, motivo);
                    break;

                case 5:
                    fila.remover();
                    break;

                case 6:
                    fila.consultar();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}