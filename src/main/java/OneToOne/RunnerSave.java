package OneToOne;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {

        Library card1= new Library(101,"10.11.2023");
        Library card2= new Library(102,"15.12.2023");
        Library card3= new Library(103,"19.08.2023");

        Student student1= new Student(1001,"Burak","Inan",card1);
        Student student2= new Student(1002,"Aykut","Caliskan",card2);
        Student student3= new Student(1003,"Fatih","Yorulmaz",card3);




        Configuration con= new Configuration().
                addAnnotatedClass(Student.class).
                addAnnotatedClass(Library.class).
                configure("hibernate.cfg.xml");

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx= session.beginTransaction();

        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(card1);
        session.save(card2);
        session.save(card3);

        tx.commit();
        session.close();
        sf.close();

    }
}
