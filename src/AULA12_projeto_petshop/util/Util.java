package AULA12_projeto_petshop.util;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Util {
        public void menu() {

            int opcao = 1;

            String aux = "";
            aux += "[1] Cadastrar animal\n";
            aux += "[2] Registrar serviço\n";
            aux += "[3] Calcular conta total\n";
            aux += "[4] Exibir relatório\n";
            aux += "[5] Finalizar\n";

            do {

                //        tratamento de exceção
                try{
                    opcao = parseInt(showInputDialog(aux));
                }catch (NumberFormatException e){
                    showMessageDialog(null, " IRROU PAE! ESCOLHE ESSA MERDA DIREITO, NUMERO ENTERO PAE (1 A CINCO)!\n" + e);
                }

                opcao = parseInt(showInputDialog(aux));
            } while (opcao != 5);
        }
    }
