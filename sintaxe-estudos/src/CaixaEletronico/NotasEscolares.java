package CaixaEletronico;

public class NotasEscolares {
    public static void main(String[] args) {
        int nota = 9;

        if(nota >= 7){
            System.out.println("Aprovado");
        }else if(nota >=5 && nota < 7){
            System.out.println("Prova recueração");
        }else{
            System.out.println("Reprovado");
        }
    }
}
