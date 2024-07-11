package com.example.robotejemplo.data;

public class Robot {
    private long id;
    private String name;
    private String descripcion;
    private String group;
    private int participation;
    private int functions;

    public Robot(){
        this.id = 0;
        this.name = "Unkown";
        this.descripcion = "None";
        this.group = "N/A";
        this.participation = 0;
        this.functions = 0;
    }

    public Robot(long id, String name, String descripcion, String group, int participation, int functions) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.group = group;
        this.participation = participation;
        this.functions = functions;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getParticipation() {
        return participation;
    }

    public void setParticipation(int participation) {
        this.participation = participation;
    }

    public int getFunctions() {
        return functions;
    }

    public void setFunctions(int functions) {
        this.functions = functions;
    }


    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", group='" + group + '\'' +
                ", participation=" + participation +
                ", functions='" + functions + '\'' +
                '}';
    }
}
