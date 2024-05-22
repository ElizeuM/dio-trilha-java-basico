public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;

        if(nota >= 7)
            System.out.println("Aprovado");
          //condição encandeada deve sempre estar entre if e else.  
        else if (nota >=5 && nota < 7)
        System.out.println("Prova Recuperação");

        else
            System.out.println("Reprovado");
    }
}
