package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
    @Id
    private int id;
    private String first_name;
    private String last_name;
    @OneToOne
    @JoinColumn(name = "library_card_id")
    private Library libraryCard;

    public Student(int id, String first_name, String last_name, Library libraryCard) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.libraryCard = libraryCard;
    }

    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Library getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(Library libraryCard) {
        this.libraryCard = libraryCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", libraryCard=" + libraryCard +
                '}';
    }
}
