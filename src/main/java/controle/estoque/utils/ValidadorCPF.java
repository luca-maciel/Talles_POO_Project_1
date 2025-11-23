package controle.estoque.utils;

import controle.estoque.exceptions.CPFInvalidoException;

public class ValidadorCPF {
    public static void validar(String cpf) {
        if (cpf == null) throw  new CPFInvalidoException("CPF nulo");
        String s = cpf.replaceAll("\\D", "");
        if (s.length() != 11) throw new CPFInvalidoException("Tamanho do CPF inválido");
        boolean todosIguais = true;
        for (int i = 1; i < s.length(); i++) if (s.charAt(i) != s.charAt(0)) {todosIguais = false; break; }
        if (todosIguais) throw new CPFInvalidoException("CPF inválido");
    }
}