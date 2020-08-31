package testes;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente02 {
    public static void main(String[] args) throws UnknownHostException, IOException {
         Socket cliente = new Socket("127.0.0.1", 12345);
         System.out.println("O cliente se conectou ao servidor!");

         Scanner teclado = new Scanner(System.in);
         PrintStream saida = new PrintStream(cliente.getOutputStream());
         
         String texto;

         while (teclado.hasNextLine()) {
            texto = teclado.nextLine();
            saida.println(texto);
            
            if(texto.equals("sair")){
                break;
            }
           
         }

         saida.close();
         teclado.close();
      }
}
