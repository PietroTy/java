public class App {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 20;
        aluno.IRA = 8.5;

        Aluno aluno2 = new Aluno();
        aluno.nome = "Rodrigo";
        aluno.idade = 21;
        aluno.IRA = 9.0;

        aluno.porFavorSeApresente();
        aluno2.porFavorSeApresente();
    }


}
