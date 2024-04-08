package View;

import Controller.FilaController;
import Model.Cliente;
import Model.Fila;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FilaController FC = new FilaController();
        Fila filaP = new Fila();
        Fila fila = new Fila();
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        boolean check = false;

        System.out.println("Insira o nome: ");
        cliente.nome = scan.next();
        int opc = 0;

        while(opc != 9) {
            System.out.print("1 - nova senha  \n 2 - nova senha prioritária \n 3 - Chamar Atendimento \n 9 - Encerrar \n Escolha uma opção: " );
            opc = scan.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Insira a senha: ");
                    cliente.numero = scan.nextInt();
                    fila = FC.inserirSenha(fila, cliente);
                    break;
                case 2:
                    System.out.println("Insira a senha: ");
                    cliente.numero = scan.nextInt();
                    filaP = FC.inserirSenha(filaP, cliente);
                    break;
                case 3: FC.chamarSenha(fila, filaP);
                        while(!fila.isEmpty()) {
                            fila.remove();
                        }
                        while(!filaP.isEmpty()){
                            filaP.remove();
                        }
                break;
                default:
                    System.out.println("Opção errada");
                    break;
            }
        }
    }
}
