package testes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import java.io.FileWriter;

public class Servidor02 {

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta e aguardando conexões...");

        Socket cliente = servidor.accept();
        System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

        Scanner entrada = new Scanner(cliente.getInputStream());

        EscreveArquivo arq = new EscreveArquivo("teste.txt", true);
        String texto;
       
        while (entrada.hasNextLine()) {
            texto = entrada.nextLine();
            System.out.println(texto);
            arq.Escrever(texto);
            
            if(texto.equals("sair")){
                break;
            }
            
        }
        entrada.close();
        servidor.close();
    }
}
