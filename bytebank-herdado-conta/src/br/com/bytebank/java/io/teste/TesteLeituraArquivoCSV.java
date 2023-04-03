package br.com.bytebank.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraArquivoCSV {

    public static void main(String[] arg) throws Exception{

        Scanner scanner = new Scanner(new File("contas.csv"));
 
        while(scanner.hasNext()){
            String linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            String valorFormatado = String.format("%s - %d, %d %s : %f", valor1 + valor2 + valor3 + valor4 + valor5);  //formatação de valores melhora a legebilidade 
            System.out.println(valorFormatado);

            linhaScanner.close();

            System.out.println();
            

           //String[] valores = linha.split(",");
           //System.out.println(Arrays.toString(valores));
           //System.out.println(valores[3]); //possivel acessar o valor desejado
    
            scanner.close();
        }
 


    }
    
    
    
}
