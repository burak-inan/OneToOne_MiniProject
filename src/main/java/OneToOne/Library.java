package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Library {
    @Id
    private int id;
    private String expiration_date;
    @OneToOne(mappedBy = "libraryCard")
    private Student student;

    public Library(int id, String expiration_date) {
        this.id = id;
        this.expiration_date = expiration_date;
    }

    public Library(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", expiration_date='" + expiration_date + '\'' +
                '}';
    }
}
