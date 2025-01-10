package com.curso.java.aula52.labs;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break; // Sai do loop após adicionar o contato
            }
        }
        if (cheia) {
            throw new AgendaCheiaException();
        }
    }

    public int consultaContadoPorNome(String nome) throws ContatoNaoExisteException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        // Lançar exceção após o loop se o contato não for encontrado
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) {
            if (c != null) {
                s += c.toString() + "\n";
            }
        }
        return s;
    }
}
