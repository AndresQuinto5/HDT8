
public class Paciente implements Comparable<Paciente>{

    /*Atributos
    Estos atributos son los que va a tener el paciente para poder entrar a la cola de prioridad*/
    private String nombre;
    private String diagnostico;
    private char codigoE;

    /*Este sera nuestro onstructor*/
    public Paciente(String nombre, String diagnostico, char codigoE) {
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.codigoE = codigoE;
    }

    public Paciente(){
        nombre = "Juan";
        diagnostico = "nada serio";
        codigoE = 1001;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDiagnostico() {
        return diagnostico;

    }
    public void setDiagnostico(String diagnostico) {
        this.nombre = diagnostico;
    }

    public char getCodigoE() {
        return codigoE;

    }
    public void setCodigoE(char codigoE) {
        this.codigoE = codigoE;
    }



}