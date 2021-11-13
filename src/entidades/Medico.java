package entidades;

public class Medico {

    private int crm;
    private String nome;
    private double salario;

    public Medico() {

    }

    public Medico(int crm, String nome, double salario) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nDados do Medico" 
                + "\nCRM: " + crm
                + "\nNome= " + nome
                + "\nSalario= " + salario;

    }

}
