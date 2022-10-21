package k8s.microserviceb.datasource.dao;

import k8s.microserviceb.datasource.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StudentsDAO {
    public static Student[] students = {
            new Student("Aicha", "GL5", "Security", 2),
            new Student("Amal", "GL5", "DevOps", 1),
            new Student("Ali", "GL5", "DevOps", 2),
            new Student("Youssef", "GL5", "Security", 2),
            new Student("Chaima", "GL5", "DevOps", 1),
            new Student("Aziz", "GL5", "DevOps", 1),
            new Student("Hazem", "GL5", "DevOps", 1),
            new Student("Ahmed", "GL5", "DevOps", 1),
            new Student("Wala", "GL5", "Security", 2),
            new Student("Baha", "GL5", "Security", 2),
            new Student("Nour", "GL5", "DevOps", 1),
            new Student("Ramez", "GL5", "DevOps", 1),
            new Student("Mohamed", "GL5", "DevOps", 2),
            new Student("Mehdi", "GL5", "DevOps", 1),
            new Student("Wissem", "GL5", "DevOps", 1),
            new Student("Chaima", "GL5", "DevOps", 1),
            new Student("Essia", "GL5", "Security", 2),
            new Student("Riheme", "GL5", "DevOps", 1),
            new Student("Souha", "GL5", "DevOps", 1),
            new Student("Sinda", "GL5", "DevOps", 1),
            new Student("Mohamed", "GL5", "Security", 2),
            new Student("Souheil", "GL5", "DevOps", 1),
            new Student("Mouheb", "GL5", "DevOps", 1),
            new Student("Aziz", "GL5", "DevOps", 1),
            new Student("Aymen", "GL5", "DevOps", 1),
            new Student("Rihab", "GL5", "DevOps", 1),
            new Student("Yasmine", "GL5", "DevOps", 1),
            new Student("Ghassen", "GL5", "DevOps", 1),
            new Student("Amira", "GL5", "DevOps", 1),
            new Student("Yosra", "GL5", "DevOps", 1),
            new Student("Maryem", "GL5", "DevOps", 1),
            new Student("Hamdi", "GL5", "Security", 2),
            new Student("Melek", "GL5", "DevOps", 1),
            new Student("Bochra", "GL5", "DevOps", 1),
            new Student("Amine", "GL5", "DevOps", 1),
            new Student("Maissa", "GL5", "Security", 2),
            new Student("Dorra", "GL5", "Security", 2),
            new Student("Ahmed", "GL5", "DevOps", 1),
            new Student("Fatma", "GL5", "DevOps", 2),
            new Student("Amine", "GL5", "DevOps", 1),
            new Student("Mahdi", "GL5", "DevOps", 1),
            new Student("Anas", "GL5", "DevOps", 1),
            new Student("Hamza", "GL5", "DevOps", 2),
            new Student("Mayssa", "GL5", "Security", 2),
            new Student("Youssef", "GL5", "DevOps", 1),
            new Student("Rami", "GL5", "DevOps", 2),
            new Student("Zied", "GL5", "Security", 2),
            new Student("Oumaima", "GL5", "DevOps", 2),
            new Student("Marwen", "GL5", "Security", 2),
            new Student("Zeineb", "GL5", "DevOps", 2),
            new Student("Yassine", "GL5", "Security", 2),
            new Student("Ramzi", "GL5", "DevOps", 2),
            new Student("Hamza", "GL5", "DevOps", 2),
            new Student("Marouen", "GL5", "DevOps", 2),
            new Student("Wadhah", "GL5", "DevOps", 2),
            new Student("Tahar", "GL5", "DevOps", 2),
            new Student("Wassime", "GL5", "DevOps", 2),
            new Student("Karim", "GL5", "Security", 1),
            new Student("Amal", "GL5", "DevOps", 2),
            new Student("Chouaib", "GL5", "DevOps", 2),
            new Student("Khalil", "GL5", "DevOps", 2),
            new Student("Amine", "GL5", "Security", 2),
            new Student("Tesnime", "GL5", "DevOps", 2),
            new Student("Wafa", "GL5", "DevOps", 1),
            new Student("Chadha", "GL5", "DevOps", 2),
            new Student("Fares", "GL5", "DevOps", 2),
            new Student("Ghassen", "GL5", "DevOps", 1),
            new Student("Cyrine", "GL5", "Security", 2),
            new Student("Eddine", "GL5", "DevOps", 2),
            new Student("Oussama", "GL5", "DevOps", 1),
            new Student("Rami", "GL5", "DevOps", 2)
    };

    public static Student[] getStudents() {
        return students;
    }

    public static List<Student> getStudents(String name, String classLevel, String option, int group) {
        ArrayList<Student> s = new ArrayList<>();
        for (Student student : students) {
            boolean good = true;
            if (name != "") {
                good = good && (student.getName().toLowerCase(Locale.ROOT).equals(name.toLowerCase(Locale.ROOT)));
            }
            if (classLevel != "") {
                good = good && (student.getClassLevel().toLowerCase(Locale.ROOT).equals(classLevel.toLowerCase(Locale.ROOT)));
            }
            if (option != "") {
                good = good && (student.getOption().toLowerCase(Locale.ROOT).equals(option.toLowerCase(Locale.ROOT)));
            }
            if (group != 0) {
                good = good && (student.getGroup() == group);
            }
            if (good) {
                s.add(student);
            }
        }

        return s;
    }
}
