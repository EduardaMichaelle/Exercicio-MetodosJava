public class Main {
    public static void main(String[] args) {
        
        // Calculadora
        System.out.println("Exercicio calculadora:\n");
        Calculadora.soma(5,5);
        Calculadora.subtracao(5,5);
        Calculadora.multiplicacao(5,5);
        Calculadora.divisao(5,5);

        //Mensagem 
        System.out.println("\nExercicio mensagem:\n");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo 
        System.out.println("\nExercicio emprestimo:\n");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
