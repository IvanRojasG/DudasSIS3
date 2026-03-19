/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uned.introSIS.dominio;

/**
 *
 * @author ivan
 */
public class Mascota {
    private Integer id;
    private String nombre;
    private String especie;
    private String color;
    private String  sexo;
    private Integer edad;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
