import java.io.Serializable;

public class Paciente implements Serializable {
    private String sintomas;
    private String diagnostico;

    public Paciente(String sintomas, String diagnostico) {
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
}