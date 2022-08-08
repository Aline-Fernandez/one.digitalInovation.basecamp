package Digital.Inovation.dio;

public class Main {

    public static void main(String[] args){
        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Saudação
        System.out.println("\nExercicio Saudação");
        Saudacao.obterSaudacao(9);
        Saudacao.obterSaudacao(14);
        Saudacao.obterSaudacao(1);

        //Empréstimo
        System.out.println("\nExercicios emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
