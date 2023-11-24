package pjCaixaEletronico;
public class Metodosaque
{
	private int nota200,nota100,nota50,nota20,nota10,nota5,nota2;// declarar a quantidade de notas armazenadas com o metodo set. ex: nota200=100;
	private int qntNotas2=0;
	public void sacar(int x){// x recebe o valor do saque
		while(x%5>=1) {
			x=x-2;
			qntNotas2++;
		}
		if(qntNotas2>0) {
			System.out.println(qntNotas2+" Nota(s) de R$2,00");
			qntNotas2=0;
		}
		
	    if((x==200 || x==202 || x>=205) && (x/200<=this.nota200 && x%200!=1)){
	        int qntNotas200=x/200;
	        x=x-qntNotas200*200;
	        this.nota200=this.nota200-qntNotas200;
	        System.out.println(qntNotas200+" Nota(s) de R$ 200,00");
	    }
	    if((x==100 || x==102 || x>=105) && (x/100<=this.nota100 && x%100!=1)){
	        int qntNotas100 = x/100;
	        x=x-qntNotas100*100;
	        this.nota100=this.nota100-qntNotas100;
	        System.out.println(qntNotas100+" Nota(s) de R$ 100,00");
	    }
	    
	    if((x==50 || x==52 || x>=55) && (x/50<=this.nota50 && x%50!=1)){
	        int qntNotas50 = x/50;
	        x=x-qntNotas50*50;
	        this.nota50=this.nota50-qntNotas50;
	        System.out.println(qntNotas50+" Nota(s) de R$ 50,00");
	    }
	    
	    if((x==20 || x==22 || x>=25) && (x/20<=this.nota20 && x%20!=1)){
	        int qntNotas20 = x/20;
	        x=x-qntNotas20*20;
	        this.nota20=this.nota20-qntNotas20;
	        System.out.println(qntNotas20+" Nota(s) de R$ 20,00");
	    }
	    
	    if((x==10 || x==12 || x>=15 ) && (x/10<=this.nota10 && x%10!=1)){
	        int qntNotas10 = x/10;
	        x=x-qntNotas10*10;
	        this.nota10=this.nota10-qntNotas10;
	        System.out.println(qntNotas10+" Nota(s) de R$ 10,00");
	    }
	    
	    if((x==5 || x==7 || x==9) && (x/5<=this.nota5 && x%5!=1)){
	        int qntNotas5 = x/5;
	        x=x-qntNotas5*5;
	        this.nota5=this.nota5-qntNotas5;
	        System.out.println(qntNotas5+" Nota(s) de R$ 5,00");
	    }
	    
	}

	public int getNota200() {
		return nota200;
	}

	public void setNota200(int nota200) {
		this.nota200 = nota200;
	}

	public int getNota100() {
		return nota100;
	}

	public void setNota100(int nota100) {
		this.nota100 = nota100;
	}

	public int getNota50() {
		return nota50;
	}

	public void setNota50(int nota50) {
		this.nota50 = nota50;
	}

	public int getNota20() {
		return nota20;
	}

	public void setNota20(int nota20) {
		this.nota20 = nota20;
	}

	public int getNota10() {
		return nota10;
	}

	public void setNota10(int nota10) {
		this.nota10 = nota10;
	}

	public int getNota5() {
		return nota5;
	}

	public void setNota5(int nota5) {
		this.nota5 = nota5;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
}

	
