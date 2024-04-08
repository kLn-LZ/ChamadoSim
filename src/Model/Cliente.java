package Model;

import static java.lang.String.valueOf;

public class Cliente {

    public  int numero;
    public  String nome;

    @Override
    public String toString() {
        String ret = "Senha número " + valueOf(numero) + "será atendida";
        return ret;
    }

}
