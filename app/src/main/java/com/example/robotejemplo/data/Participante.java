package com.example.robotejemplo.data;

public class Participante {
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String grupo;

    public Participante() {
        this.id = 0;
        this.nombre = "Unkown";
        this.apellido = "Unkown";
        this.email = "Unkown";
        this.grupo = "N/A";
    }

    public Participante(long id, String nombre, String apellido, String email, String grupo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.grupo = grupo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", grupo='" + grupo + '\'' +
                '}';
    }

}
