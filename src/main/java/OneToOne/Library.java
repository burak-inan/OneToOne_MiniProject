package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Library {
    @Id
    private int id;
    private String expiration_date;
    @OneToOne(mappedBy = "libraryCard") // we used variable name for mapping, column name doesn't work in her
    private Student student;


    //Constructors
    // We didn't use student object in the constructor. Because we will create library objects first
    // Then we assigned our library objects to inside student objects in this project
    public Library(int id, String expiration_date) {
        this.id = id;
        this.expiration_date = expiration_date;
    }

    // When we created constructor, default constructor is removed automatically.
    // That is why we create empty one if necessary
    public Library(){

    }


    // getter--setter
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


    // toString
    // We removed student object in it. Otherwise, it will throw RTE
    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", expiration_date='" + expiration_date + '\'' +
                '}';
    }
}
