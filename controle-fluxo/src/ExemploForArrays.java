public class ExemploForArrays {
    public static void main(String[] args) {
        
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x < alunos.length; x++){

            System.out.println("O aluno do indice x=" + x+ " é " + alunos [x]);

            /*tambem pode ser abreviado assim: for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + alunos);
            */

            
        }
    }
}
