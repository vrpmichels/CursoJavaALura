package br.com.bytebank.java.io.teste;

//import java.io.BufferedWriter;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//mport java.io.Writer;
import java.io.PrintStream;

public class TesteEscrita3 {
  public static void main(String[] args) throws IOException {

  //Fluxo de Entrada com Arquivo
  //  OutputStream fos = new FileOutputStream("lorem2.txt");
  //  Writer osw = new OutputStreamWriter(fos);
  //  BufferedWriter bw = new BufferedWriter(osw);

   //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
     
   PrintStream ps = new PrintStream("lorem2.txt");
   
      ps.println("Vini123");
      ps.println();
      ps.println("teeeeeSTE");
    
   }
}
    

