/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360collection;

/**
 *
 * @author azhra
 */
public class animal {
    
    private final String name;
    private final String color;
    private final String nickName;
    private final double age;
    
    public animal(String name, String color, String nickName, double age) {
        
        this.name = name;
        this.color = color;
        this.nickName = nickName;
        this.age = age;
    }
  
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getNickName() {
        return nickName;
    }
        
    public double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "animal{" + "name=" + name + ", color=" + color + ", nickName=" + nickName + ", age=" + age + '}';
    }

    

    
    
    
    
}
