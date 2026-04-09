package AULA08_exemploAplicacao;

//para importar todos os metodos dentro dessa classe static precisa usar "*"
import javax.swing.*;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Exemplo01 {
    public static void main(String[] args) {
//        METODOS STATICOS
//        JOptionPane.showConfirmDialog()
//        showMessageDialog(null, "OLA");
//        showInputDialog("Digite seu nome: ");
//        showConfirmDialog(null, "Presença confirmada?");

        int valor1, valor2, resultado;
//        showInputDialog("Digite o valor: ") -> retorna string
//        para converter o input para inteiro -> Integer (classe do inteiro) + . + parseInt()
        valor1 = parseInt(showInputDialog("Digite o valor: "));
        valor2 = parseInt(showInputDialog("Digite o valor 2: "));
        resultado = valor1 + valor2;
        showMessageDialog(null, "resultado = " + resultado);


    }
}
