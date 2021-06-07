package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Comparator {

    class Student {
        private final int id;
        private final String name;
        private final double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCGPA() {
            return cgpa;
        }
    }

    class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getCGPA() == o2.getCGPA()) {
                if(o1.getName().equals(o2.getName())) {
                    return Integer.compare(o2.getID(), o1.getID());
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
            return Double.compare(o2.getCGPA(), o1.getCGPA());
        }
    }

}
