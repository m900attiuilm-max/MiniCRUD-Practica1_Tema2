package modelo.vo;

public class PersonaVO {
    private int cod;
    private String nombre;
    private double sueldo;
    private String email;
     private String categoria;

    public PersonaVO() {

    }

    public PersonaVO(int cod, String nombre, double sueldo, String email,  String categoria) {
        this.cod = cod;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.email = email;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return cod;
    }

    public void setCodigo(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

 public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }



    @Override
    public String toString() {
        return "PersonaVO{" + "cod=" + cod + ", nombre=" + nombre + ", sueldo=" + sueldo    + '}';
    }

}
