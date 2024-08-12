import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        // Receber informações do atleta
        String nome = JOptionPane.showInputDialog("Digite o nome do atleta:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do atleta:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do atleta (em metros):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do atleta (em kg):"));

        // Calcular o IMC usando o método da classe AtletaUtils
        double imc = calcularIMC(peso, altura);

        // Exibir caderneta
        String mensagem = "Caderneta do Atleta\n"
                        + "-------------------\n"
                        + "Nome: " + nome + "\n"
                        + "Idade: " + idade + " anos\n"
                        + "Peso: " + peso + " kg\n"
                        + "IMC: " + String.format("%.2f", imc) + "\n";

        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}

    

