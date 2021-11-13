package aplicacao;

import entidades.Medico;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
       System.out.println("Informe o CRM: ");
       int crm = sc.nextInt();
       
       System.out.println("Informe o nome: ");
       String nome = sc.next();
       
       System.out.println("Informe o salário: ");
       double salario = sc.nextDouble();
       // Cria o objeto da classe Medico
       // Passando os parâmetros
       Medico medico = new Medico(crm, nome, salario);
       // Imprime os dados da classe
       System.out.println(medico.toString());
       
       sc.close();
    }
  
}
