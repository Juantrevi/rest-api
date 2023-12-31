package com.springf.restapi;

public class Course {
    private long id;
    private String name;
    private String description;

    public Course(){
    }
    public Course(long id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return "Course{" + "Id= " + id + ", Name= '" + name + '\'' + ", Description= '" + description + '\'' + '}';
    }
}
