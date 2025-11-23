package controle.estoque.utils;

import java.io.*;

public class Serializador {
    public static void salvar(Object obj, String arquivo) throws IOException {
        new File("data").mkdirs();

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("data/" + arquivo))) {
                out.writeObject(obj);
        }
    }

    public static Object carregar(String arquivo) throws IOException, ClassNotFoundException {
        File file = new File("data/" + arquivo);
        if (!file.exists()) return null;

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(file))) {
                return in.readObject();
        }
    }
}