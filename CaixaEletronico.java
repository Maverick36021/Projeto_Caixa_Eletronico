//projeto caixa eletrônico
package pjCaixaEletronico;
import java.util.Scanner;
public class CaixaEletronico
{
	public static void main(String[] args) {
		Metodosaque s1 = new Metodosaque();
		s1.setNota2(100);s1.setNota5(100);s1.setNota10(100);s1.setNota20(100);
		s1.setNota50(100);s1.setNota100(100);s1.setNota200(100);
		int saldo=1000,i=0,j=0;
		int usuario = 1234, senha = 123456;
		Scanner sc = new Scanner(System.in);
		while(j<3){
		    System.out.println("Digite o seu usuario: ");
		    int login = sc.nextInt();
		if(login!=usuario){
		    System.out.println("Usuario Invalido !!!");
		    j++;
		}else{
		    System.out.println("Digite sua senha: ");
		    int senhaUsuario= sc.nextInt();
		    if(senhaUsuario!=senha){
		        System.out.println("Senha invalida");
		        System.out.println("Após 3 tentativas erradas o usuario sera bloqueado !!!");
		        
		}else{
		    while(i<5){
		        System.out.println("          Digite o numero da opção desejada          ");
		        System.out.println("1 - Saque \n2 - deposito \n3 - visualizar o saldo \n4 - sair");
		        int opcao = sc.nextInt();
		        if(opcao==1){
		            System.out.println("Digite o valor do saque: ");
		            int valorSaque = sc.nextInt();
		            if(valorSaque>saldo){
		                System.out.println("Saldo insuficiente!!!");
		                i++;
		            }else if(valorSaque==3 || valorSaque==1 || valorSaque==0) {
		    			System.out.println("O caixa só trabalha com notas de: R$2-R$5-R$10-R$20-R$50-R$100 E R$200 \nDigite um valor valido!!!");
		    		}else{
		                saldo=saldo-valorSaque;
		                s1.sacar(valorSaque);
		                System.out.println("Saque efetuado");
		                i++;
		            }
		        }else if(opcao==2){
		            System.out.println("Digite o valor do deposito: ");
		            int valorDeposito = sc.nextInt();
		            saldo=saldo+valorDeposito;
		            i++;
		        }else if(opcao==3){
		            System.out.println("Saldo atual: R$"+saldo);
		            i++;
		        }else if(opcao==4){
		            System.out.println("Seção encerrada !!! ");
		            i=5;
		            j=5;
		        }else{
		            System.out.println("Opção invalida !!!");
		            i++;
		        }
		    }
		    	System.out.println("Sua seção espirou faça login novamente se quiser acessar o sistema!!!");
		    i=0;
		    
		}
		    }
		}j++;
		sc.close();
		}
}
