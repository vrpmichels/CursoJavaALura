package br.com.bytebank.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {



        //FLuxo de Entrada com Arquivo
        
        InputStream fis = new FileInputStream("lorem.txt"); //Entrada de um arquivo binario
        Reader isr = new InputStreamReader(fis);  //tranformando bit e bytes em caracteres 
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null){   /// ler arquivo linha por linha
           
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();

        }


        //Fluxo de Entrada com Arquivo
      

        br.close();
        bw.close();
}
}
