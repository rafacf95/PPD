package testes;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class EscreveArquivo {
    private String caminho;
    private boolean acrescentar = false;


    public EscreveArquivo (String caminho){
        this.caminho = caminho;
    }   
    
    public EscreveArquivo (String caminho, boolean acrescentar){
        this.caminho = caminho;
        this.acrescentar = acrescentar;
    }
    
    public void Escrever(String texto) throws IOException{
        FileWriter escreve = new FileWriter (caminho, acrescentar);
        PrintWriter imprime = new PrintWriter(escreve);
        imprime.printf("%s" + "%n", texto);
        imprime.close();
        
    }
}
