package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class RunnerFetch {
    public static void main(String[] args) {

        Configuration con= new Configuration().
                addAnnotatedClass(Student.class).
                addAnnotatedClass(Library.class).
                configure("hibernate.cfg.xml");

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx= session.beginTransaction();

        String hqlQuery1= "FROM Student";
        List<Student> studentList= session.createQuery(hqlQuery1).getResultList();


        String hqlQuery2= "FROM Library";
        List<Library> cardList= session.createQuery(hqlQuery2).getResultList();

        System.out.println("================= Student Table ==================");
        for (Student std: studentList){
            System.out.println(std);
        }
        System.out.println(studentList.get(1).getLibraryCard());


        System.out.println("================= Library Table ==================");
        for (Library card: cardList){
            System.out.println(card);
        }
        System.out.println(cardList.get(1).getStudent());



        tx.commit();
        session.close();
        sf.close();

    }
}
