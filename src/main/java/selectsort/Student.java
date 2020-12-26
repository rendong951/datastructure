package selectsort;

public class Student implements Comparable<Student>{

    private String name;

    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }

    @Override
    public boolean equals(Object student){
        if(this == student){
            return true;
        }
        if(student == null){
            return false;
        }
        if(student.getClass() != this.getClass()){
            return false;
        }

        Student another = (Student) student;
        return another.score == this.score;
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s, score: %d)", name, score);
    }

}
