package projetovotação;
import java.util.Scanner;

public class ProjetoVotação {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        Candidato c1 = new Candidato();
        Candidato c2 = new Candidato();
        Candidato c3 = new Candidato();
        Candidato c4 = new Candidato();
        
        c1.nomeCandidato = "Luís";
        c1.numVoto = 1;
        c2.nomeCandidato = "Marcelo";
        c2.numVoto = 2;
        c3.nomeCandidato = "Guilherme";
        c3.numVoto = 3;
        c4.nomeCandidato = "André";
        c4.numVoto = 4;
        
        
        do{
            mostrarMenu();
            opcao = ler.nextInt();
            switch(opcao){
                case 1:
                    c1.votar(opcao);
                    break;
                case 2:
                    c2.votar(opcao);
                    break;
                case 3:
                    c3.votar(opcao);
                    break;
                case 4:
                    c4.votar(opcao);
                    break;
                case 5:
                    System.out.println("Número de votos de Luís: "+c1.contadorVoto);
                    System.out.println("Número de votos de Marcelo: "+c2.contadorVoto);
                    System.out.println("Número de votos de Guilherme: "+c3.contadorVoto);
                    System.out.println("Número de votos de André: "+c4.contadorVoto);
            }
        }while(opcao!=0);
        if (c1.contadorVoto>c2.contadorVoto && c1.contadorVoto>c3.contadorVoto && c1.contadorVoto>c4.contadorVoto){ 
                System.out.println();
                System.out.println("Luís venceu!");
            }else if (c2.contadorVoto>c1.contadorVoto && c2.contadorVoto>c3.contadorVoto && c2.contadorVoto>c4.contadorVoto){
                System.out.println();
                System.out.println("Marcelo venceu!");                
            }else if (c3.contadorVoto>c1.contadorVoto && c3.contadorVoto>c2.contadorVoto && c3.contadorVoto>c4.contadorVoto){
                System.out.println();
                System.out.println("Guilherme venceu!");                
            }else if (c4.contadorVoto>c1.contadorVoto && c4.contadorVoto>c2.contadorVoto && c4.contadorVoto>c3.contadorVoto){
                System.out.println();
                System.out.println("André venceu!");                
            }else{
                System.out.println();
                System.out.println("Houve empate! Eleição sem vencedores");                
            }
        
    

    }
    public static void mostrarMenu(){
           System.out.println("Menu para votação:");
            System.out.println("1-> Luís");
            System.out.println("2-> Marcelo");
            System.out.println("3-> Guilherme");
            System.out.println("4-> André");
            System.out.println("5-> Resultado parcial");
            System.out.println("0-> Sair");
            System.out.println("Digite uma opção: ");
       } 
    }


class Candidato {
    public String nomeCandidato;
    public int numVoto;
    protected int contadorVoto=0;
    
    public boolean votar(int opcao){
        
        if(this.numVoto == opcao){
            System.out.println("Voto realizado com sucesso!!!");
            contadorVoto++;
            return true;
        }else{
            System.out.println("Não tem esse candidato.");
            return false;
        }
    }  
    
}
