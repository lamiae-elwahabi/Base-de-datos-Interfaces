/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elWahabi.formpersonas.model;

/**
 *
 * @author Lamiae
 */
public class Persona {

    //Propiedades
    private String nombre;
    private Integer edad;
    private String sexo;

    //Constructor
    public Persona(String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edadnum, Sexo sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodo que me devuelve la consulta String
    @Override
    public String toString() {
        return getNombre() + ", " + getEdad() + ", " + getSexo();
    }
}
