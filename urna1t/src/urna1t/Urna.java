package urna1t;
import java.util.Scanner;

public class Urna {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		
		int idade,v, vt, confirm, i;
		float porcentagem, b, l, t, c;
		b = l = t = c = vt = 0;
		i=vt;
		System.out.println("Digite o limite de votos");
		i=scan.nextInt();
		while(vt<i) {
		             System.out.println("Informe a sua idade: ");
		              idade = scan.nextInt();
		
		              if(idade>=18 && idade<=64) {
			                   System.out.println("Voto Obrigátorio");
			
		              } else if(idade==16 ||idade==17 || idade>=65) {
			                   System.out.println("Voto Facultativo");
			
		              } else {
		                      System.out.println("Voto não permitido");
		                      continue;
		}
		
	
		
		
		
		System.out.println("Digite o número do seu candidato a presidente(bolsonaro(22),lula(13),simone(15) ou ciro(12))");
		v = scan.nextInt();
		
		switch (v){
		case 12:
			    System.out.println("O candidato selecionado é Ciro Gomes, deseja votar nele?(Se sim digite 1)");
			    confirm=scan.nextInt();
			    
			    if(confirm==1) {
			    	         c++;
			    	         vt++;
			    	         
			    	         System.out.println("Voto Confirmado em Ciro Gomes!");
			    	         
			    }else {
			    	System.out.println("Escolha em quem votar");
			    }
			    
		break;
		
		case 22:
			  System.out.println("O candidato selecionado é Jair Bolsonaro, deseja votar nele?(Se sim digite 1)");
			    confirm=scan.nextInt();
			    
			    if(confirm==1) {
			    	         b++;
			    	         vt++;
			    	         
			    	         System.out.println("Voto Confirmado em Jair Bolsonaro!");
			    	         
			    }else {
			    	System.out.println("Escolha em quem votar");
			    }
			    
		break;
		
		case 15:
			  System.out.println("A candidata selecionada é Simone Tebet, deseja votar nela?(Se sim digite 1)");
			    confirm=scan.nextInt();
			    
			    if(confirm==1) {
			    	         t++;
			    	         vt++;
			    	         
			    	         System.out.println("Voto Confirmado em Simone Tebet");
			    	         
			    }else {
			    	System.out.println("Escolha em quem votar");
			    }
			    
		break;
		
		case 13:
			  System.out.println("O candidato selecionado é Lula, deseja votar nele?(Se sim digite 1)");
			    confirm=scan.nextInt();
			    
			    if(confirm==1) {
			    	         l++;
			    	         vt++;
			    	         
			    	         System.out.println("Voto Confirmado em Lula!");
			    	         
			    }else {
			    	System.out.println("Escolha em quem votar");
			    }
			    
		break;
		default:
			System.out.println("Deseja votar nulo? se sim digite 1");
			confirm=scan.nextInt();
			
			if(confirm==1) {
				System.out.println("Voto Nulo Confirmado");
				vt++;
				
			}
			
			
			
			
			
			
		}
		}
		
		System.out.println("Fim da eleição com uma quantidade de "  + vt + " votos");
		if(l>b && l>t & l>c) {
			porcentagem=(l/i)*100;
			System.out.println("O presidente eleito é Lula com um total de: " + l + " votos, ou seja " + porcentagem + "% dos votos totais");
		}else if(b>l && b>t && b>c) {
			porcentagem=(b/i)*100;
			System.out.println("O presidente eleito é Jair Bolsonaro com um total de: " + b + " votos, ou seja " + porcentagem + "% dos votos totais");
		}else if(c>l && c>t && c>b) {
			porcentagem=(c/i)*100;
			System.out.println("O presidente eleito é Ciro Gomes com um total de: " + c + " votos, ou seja " + porcentagem + "% dos votos totais");
		}else if(t>l && t>b && t>c) {
			porcentagem=(t/i)*100;
			System.out.println("A presidenta eleita é Simone Tebet com um total de: " + t + " votos, ou seja " + porcentagem + "% dos votos totais");
		}else {
			System.out.println("Votação inconclusiva, aguardar novas instruções");
		}

	}

}
