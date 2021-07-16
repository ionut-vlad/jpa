package com.math;

import java.util.ArrayList;
import java.util.List;

public class StudentsManager {

    private List<Student> students;
    
    public void initMethod() { 
        // do some data reading
    }
    
    public List<Student> getStudentsWithMaxScore() {
        List<Student>  outputStudents = new ArrayList<>();
        float max = getMaxScore();
        for(Student student :students ) { 
            if ( student.getAverageScore() == max ) { 
                outputStudents.add(student);
            }
        }
        return outputStudents;
    }
    
    private float getMaxScore() { 
        float max = 0;
        
        for(Student student :students ) { 
            if ( student.getAverageScore() > max ) { 
                max = student.getAverageScore();
            }
        }
        return max;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
