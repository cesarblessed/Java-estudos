public class MinhaClasse {
    public static void main(String[] args){
    
    String nome = "Cesar";
    String sobrenome = "Paula";

    String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobreNome){
        return "Resultado: " + nome.concat(" ").concat(sobreNome);
    }
}
