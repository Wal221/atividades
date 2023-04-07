package testesEmpresas;

public class VerificaPalavraMaior {
    public static void main(String[] args) {
        String str = "Hoje bomdia teste";
        String[] palavras = str.split(" ");// o metodo split separa uma palava de uma String usando
                                                 // o "regex" de separação nesse caso o " " ou seja
                                                 // e como se a cada palavra separada por espaço e uma posição
                                           // do meu vetor de String , por isso um String de vetor o recebe outra String
                                            // com split. Pra resumir o meu vetor palavras esta assim: "palavras:["hoje", "bomdia","teste"]"
        
        String maiorPalavra = palavras[0]; // Inicializa com a primeira palavra

        for (int i = 1; i < palavras.length; i++) { // Começa com o segundo elemento do array
            String palavra = palavras[i];
            if (palavra.length() > maiorPalavra.length()) {
                maiorPalavra = palavra;
            }
        }

        System.out.println("A maior palavra é: " + maiorPalavra);
    }
}
