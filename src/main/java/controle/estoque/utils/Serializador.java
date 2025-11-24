package controle.estoque.utils;

import java.io.*;
import java.util.ArrayList;

public class Serializador {

    public static <T> void salvar(ArrayList<T> lista, String arquivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(arquivo)))) {

            out.writeObject(lista);

        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo " + arquivo + ": " + e.getMessage());
        }
    }

    public static <T> ArrayList<T> carregar(String arquivo) {
        File f = new File(arquivo);
        if (!f.exists()) return new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(arquivo)))) {

            return (ArrayList<T>) in.readObject();

        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivo " + arquivo + ": " + e.getMessage());
            return new ArrayList<>();
        }
    }
}