import java.util.Scanner;

 public class App {

    // Início do Programa
    public static void main(String[] args) throws Exception {

        // Declaração de Variaveis
        double salario_Bruto;
        double salario_Liquido;
        double inss;
        double sindicato;
        double imposto_Renda;
        double valor_Hora;
        double horas_Trabalhadas;

        // Solicitação de Dados
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Informe quanto você ganha por hora: " );
        valor_Hora = teclado.nextDouble();
        System.out.println ("Informe quantas horas você trabalha no mês: " );
        horas_Trabalhadas = teclado.nextDouble();
        teclado.close();

        // Calcular salário_Bruto, salário_Liquido e Descontos
        salario_Bruto = valor_Hora * horas_Trabalhadas;
        imposto_Renda = salario_Bruto * 0.11;
        inss = salario_Bruto * 0.08;
        sindicato = salario_Bruto * 0.05;
        salario_Liquido = salario_Bruto - imposto_Renda - inss - sindicato;

        // Exibir a Respsta Para o Usuário
        System.out.println ("Seu salário bruto é R$"+ salario_Bruto);
        System.out.println ("O valor do imposto de renda foi R$"+ imposto_Renda);
        System.out.println ("Você pagou para o inss R$"+ inss);
        System.out.println ("Você pagou para o sindicato R$"+ sindicato);
        System.out.println ("Seu salário liquido é R$"+ salario_Liquido);

    }
}
