public class CondicaoTernaria {
    public static void main(String[] args) {

        //ABREVIAÇÃO DO BLOCO ENCANDEADO 
        
        int nota = 3;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota<7 ? "Recupareção" : "Reprovado";
        System.out.println(resultado);
    }
}