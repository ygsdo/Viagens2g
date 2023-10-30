import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto    Construtor
        Turista mochileiro = new Turista();
        
        // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista();
        mochileira.setNome("Tomas");
        
        // Atribuição indireta
        String nome = JOptionPane.showInputDialog("Entre com o nome:");
        mochileira.setNome(nome);
        System.out.println("O nome do objeto é :" + mochileira.getNome());

        // Fazer o mesmo para capturar o cpf deste objeto
        String cpf = JOptionPane.showInputDialog("Digite seu cpf:");
        mochileira.setCpf(cpf);
        System.out.println("CPF sem validação " + mochileira.getCpf());

        // Novo objeto
        nome = JOptionPane.showInputDialog("Qual seu nome: ");
        
        // Criando objeto com construtor recebendo nome
        Turista outroTurista = new Turista();
        System.out.println("O nome deste turista é :" + outroTurista.getNome());
        
        // Fazer o recebimento do cpf para este turista
        cpf = JOptionPane.showInputDialog("Digite seu cpf:");
        Object Validacao = new Object();
        if(validacao.cpf(cpf))
            outroTurista.setCpf(cpf);
        else
            System.out.println("CPF inválido!");
        System.out.println("O cpf digitado foi: " + cpf);


    }
}