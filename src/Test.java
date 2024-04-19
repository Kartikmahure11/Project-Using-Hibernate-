import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class Test {

	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");

		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		  Student s1=new Student("","");
		  
	  s1.setSid(106);
	  session.delete(s1);
		 
	      session.save(s1);
		  
	      
	     //
	      
// 	Query q= session.createQuery("from model.Student");
// 	List<Student> sl=(List<Student>)q.getResultList();
// 	
//		for(Student x: sl)
//		{
//		System.out.println(x);
//		}
		
		
		
		
		tx.commit();
		session.close();
		
		System.out.println("Data Deleted Sucessfully");
		
		
	}

}
