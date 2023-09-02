

public class Turma {
    private int id;
    private int idDisciplina;
    private String turno;
    private int idProfessor;
    private String semestre;

 //construtor
    public Turma(int id, int idDisciplina, String turno, int idProfessor, String semestre) {
        //super();
        this.id = id;
        this.idDisciplina = idDisciplina;
        this.turno = turno;
        this.idProfessor = idProfessor;
        this.semestre = semestre;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdDisciplina() {
        return idDisciplina;
    }
    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public int getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String toString() {
        return "\n|| \t ID Turma: " + id +  "\t| ID Disciplina: " + idDisciplina  + "\t| Turno: " + turno + "\t| Id Professor: " + idProfessor + "\t| Semestre: " + semestre + " ||";
    }
}