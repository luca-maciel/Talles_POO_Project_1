package controle.estoque.utils;

import controle.estoque.entitites.Fornecedor;
import java.io.*;
import java.util.ArrayList;

public class ArquivoUtils {

    public static ArrayList<Fornecedor> lerFornecedores(String caminho) {
        ArrayList<Fornecedor> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");

                if (dados.length < 5) continue;

                Fornecedor f = new Fornecedor(
                        Integer.parseInt(dados[0]),
                        dados[1],
                        dados[2],
                        dados[3],
                        dados[4],
                        dados.length > 5 ? dados[5] : ""
                );

                lista.add(f);
            }

        } catch (Exception e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }

        return lista;
    }
}