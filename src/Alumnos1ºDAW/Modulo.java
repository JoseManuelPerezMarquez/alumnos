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
public class Modulo {
    private String nombre;
    private String curso;
    private double nota;

    public Modulo(String nombre, String curso, double nota) {
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }

    public Modulo() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Modulo{" + "\nnombre=" + nombre + "\ncurso=" + curso + "\nnota=" + nota + '}';
    }
    
    
    
}
