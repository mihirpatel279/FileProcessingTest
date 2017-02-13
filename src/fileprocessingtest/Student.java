/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprocessingtest;

/**
 *
 * @author Mihir
 */
public class Student {
    
    private int id;
    private String name;
    private String course;
    
    public Student( int i , String n , String c)
    {
        id = i;
        name = n;
        course = c;
    }

    public Student()
    {
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
    
}
