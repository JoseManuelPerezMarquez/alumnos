/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos1ºDAW;

/**
 *
 * @author JoseManuel
 */
public class Alumno {
    private String nombre="LIBRE";
    private String apellidos;
    private String direccion;
    private String telefono;
    private String curso;
    private String [] modulos;

    public Alumno(String nombre, String apellidos, String direccion, String telefono, String curso, String[] modulos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.curso = curso;
        this.modulos = modulos;
    }

    public Alumno() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getModulos() {
        return modulos;
    }

    public void setModulos(String[] modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "\nnombre=" + nombre + "\napellidos=" + apellidos + "\ndireccion=" + direccion + "\ntelefono=" + telefono + "\ncurso=" + curso + "\nmodulos=" + modulos + '}';
    }
    
    
}
