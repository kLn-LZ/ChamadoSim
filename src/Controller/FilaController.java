package Controller;

import Model.Cliente;
import Model.Fila;

import static java.lang.String.valueOf;

public class FilaController {

    Cliente cliente;


    public FilaController() {

    }


    public Fila inserirSenha(Fila filaEscolhida, Object cliente) {

        filaEscolhida.insert(cliente);
        System.out.println("Cliente inserido na fila");
        return filaEscolhida;
    }

    private void removerSenha(Fila filaEscolhida) {

        if(!filaEscolhida.isEmpty()) {
            String senha;
            try {
                senha = valueOf(filaEscolhida.remove());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            System.out.println("Senha a ser atendida: " + senha);

        } else {
            System.out.println("Não há senhas na fila");
        }

    }


    public void chamarSenha(Fila fila, Fila filaPrioritaria ) {

            int i = 0;

            while(!filaPrioritaria.isEmpty() || !fila.isEmpty()){
                while(i < 4) {
                    if (!filaPrioritaria.isEmpty()) {
                        removerSenha(filaPrioritaria);
                    }
                    i++;
                }
                if(!fila.isEmpty()) {
                    removerSenha((fila));

                }


            }




    }



}
