//projeto caixa eletrônico
package pjCaixaEletronico;
import java.util.Scanner;
public class CaixaEletronico
{
	public static void main(String[] args) {
		int notas200=100;int notas50=100;int notas10=100;int notas2=100;
		int notas100=100;int notas20=100;int notas5=100;int saldo=1000,i=0,j=0;
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
		            }else{
		                saldo=saldo-valorSaque;
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
		    }i++;
		    
		}
		    }
		}j++;
		sc.close();
		}
}
