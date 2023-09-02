import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nome;
        String sigla;
        int periodo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados da Disciplina: ");
        System.out.print("\tNome da Disciplina: ");
        nome = sc.next();

        System.out.print("\tSigla: ");
        sigla = sc.next();

        System.out.print("\tPeríodo: ");
        periodo = sc.nextInt();

        //instanciando objeto disciplina
        Disciplina disciplina = new Disciplina(nome, sigla, periodo);
        

        
        System.out.println("Digite os dados do aluno:");
        System.out.print("\tNome: ");
        String nomeAluno = sc.next();
        System.out.print("\tMatrícula: ");
        String matriculaAluno = sc.next();
        System.out.print("\tEmail: ");
        String emailAluno = sc.next();
        System.out.print("\tIdade: ");
        int idadeAluno = sc.nextInt();


        //instanciando objeto aluno
        Aluno aluno = new Aluno(nomeAluno, matriculaAluno, emailAluno, idadeAluno);
                
        System.out.println("\nDigite os dados da turma:");
        System.out.println("\tId Turma: ");
        int idTurma = sc.nextInt();
        System.out.print("\tId Disciplina: ");
        int idDisciplinaTurma = sc.nextInt();
        System.out.print("\tTurno: ");
        String turnoTurma = sc.next();
        
        System.out.println("\tId Professor: ");
        
        int idProfessorTurma = sc.nextInt();
        System.out.print("\tSemestre: ");
        String semestreTurma = sc.next();

        //instanciando objeto Turma
        Turma turma = new Turma(idTurma, idDisciplinaTurma, turnoTurma, idProfessorTurma, semestreTurma);

        //exibindo os dados
        System.out.println(disciplina.toString() + "\n");
        System.out.println(aluno.toString());
        System.out.println(turma.toString());

        sc.close();

       
        //acesso com get e set

        //aluno.setNome(nomeAluno);
        //aluno.setMatricula(matriculaAluno);
        //aluno.setEmail(emailAluno);
        //aluno.setIdade(idadeAluno);
        
        
        //System.out.println("Disciplina: " + disciplina.toString());
        //System.out.println("Dados do aluno criado:");
        //System.out.println("Nome: " + aluno.getNome());
        //System.out.println("Matrícula: " + aluno.getMatricula());
        //System.out.println("Email: " + aluno.getEmail());
        //System.out.println("Idade: " + aluno.getIdade());


    }
}

