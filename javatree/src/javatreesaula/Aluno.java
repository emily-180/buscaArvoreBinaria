package javatreesaula;

public class Aluno implements Comparable<Aluno>{
    private int matricula;
    private String name;
    
    public Aluno(int matricula,  String name){
        this.matricula = matricula;
        this.name = name;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(Aluno outro){
        return Integer.compare(this.matricula, outro.matricula);
    }
    @Override
    public String toString(){
        return "Matricula: "+this.matricula+" Nome:"+this.name+"]";
    }
}
