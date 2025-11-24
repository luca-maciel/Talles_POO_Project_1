package controle.estoque.utils;

import java.io.*;
import java.util.ArrayList;

public class Serializador {
    public static <T> void salvar(T obj, String nomeArquivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            out.writeObject(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> T carregar(String nomeArquivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (T) in.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}