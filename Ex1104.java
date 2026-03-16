/*
Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. Cda item possui um nome,
preço unitário e quantidade, separados por vírgula. Você deve gerar um nome arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do arquivo de origem, contendo apenas o nome e valor total
para aquele item.
 */

import java.io.*;
import java.util.Scanner;

public class Ex1104 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Lucas\\Desktop";
        File file = new File(path + "\\teste.csv");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String string = sc.nextLine();
                String[] parts = string.split(",");
                File out = new File(path + "\\out\\summary.csv");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(out, true))){
                    Float total = Float.parseFloat(parts[1]) * Float.parseFloat(parts[2]);
                    bw.write(parts[0] + ",");
                    bw.write(String.valueOf(total));
                    bw.newLine();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }


    }
}
