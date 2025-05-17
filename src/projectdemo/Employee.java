/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

/**
 *
 * @author George
 */
public class Employee {
    private String name;
    private int level;
    private String branch;

    public Employee(String name, int level, String branch) {
        this.name = name;
        this.level = level;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getBranch() {
        return branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    
    
}
