   import javax.persistence.EntityManager;
   import javax.persistence.EntityManagerFactory;
   import javax.persistence.Persistence;

   import com.glassestore.entity.Users;

		public class UsersTest{

			public static void main(String[] args) {
				
				Users user1 = new Users();
				user1.setEmail("sabrine@codejava.net");
				user1.setFullName("Sabrine");
				user1.setPassword("helloworld");
				
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GlassesStoreWebsite");
				EntityManager entityManager = entityManagerFactory.createEntityManager();

				entityManager.getTransaction().begin();
				
				entityManager.persist(user1);
				entityManager.getTransaction().commit();
				entityManager.close();
				entityManagerFactory.close();
				
				System.out.println("A users object was persisted");

			}

}