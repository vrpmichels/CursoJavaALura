package br.com.bytebank.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

    
    public static void main(String[] args) throws IOException{

        //FLuxo de Entrada com Arquivo
        
        InputStream fis = new FileInputStream("lorem2.txt"); //Entrada de um arquivo binario
        Reader isr = new InputStreamReader(fis);  //tranformando bit e bytes em caracteres 
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null){   /// ler arquivo linha por linha
           
            System.out.println(linha);
            linha = br.readLine();

        }

        

        br.close();

    }
    
}

