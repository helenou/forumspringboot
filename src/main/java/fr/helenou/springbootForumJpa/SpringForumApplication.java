package fr.helenou.springbootForumJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.helenou.springbootForumJpa.beans.Address;
import fr.helenou.springbootForumJpa.beans.User;
import fr.helenou.springbootForumJpa.repositories.UserRepository;

@SpringBootApplication
@EnableJpaRepositories("fr.helenou.springbootForumJpa.repositories")
public class SpringForumApplication {

	
	@Autowired
    private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringForumApplication.class, args);
	}
	
	
	//@Override
    public void run(String... args) throws Exception {
        

        // Insert 2 new users in the database
        Address address1 = new Address("74 Allée du Golf", 59170, "Croix");
        User user1 = new User("Rajee Venice", "0784253498", "rajeev@callicoder.com", "rajeecoder", "pwd123", address1);
        userRepository.save(user1);
        	System.out.println("user1: " +user1.toString() +" saved");
        
        Address address2 = new Address("1245 Champs Elysées", 75000, "Paris");
        User user2 = new User("Rachi Da", "0914562013", "rachida@gouv.fr", "rachidati", "passRAchi9", address2);
        userRepository.save(user2);
        
        Address address3 = new Address("1245 Champs Elysées", 75000, "Paris");
        User user3 = new User("Emmanuel Macron", "0800123148", "boss@gouv.fr", "emacron", "pfze49", address3);
        //user3.setAddress(address3); // don't work with lombok now
        userRepository.save(user2);
        	System.out.println("user2+3: " +user2.toString() +"\n " +user3.toString()+" saved");
       
        
        // count users
        userRepository.count();
       
        // List users
       userRepository.findAll();
       
       //List<User> allByZip = userRepository.
       //findByZipAddress(75000);
        System.out.println("findByMobile(\"0800123148\") returned "+userRepository.findByMobile("0800123148").toString());
       
        // Remove the user1
        userRepository.delete(user1);
        // REcount users
        userRepository.count();
        // RE-List users
        userRepository.findAll();

        List<User> resultFindAllU = userRepository.findAll();
        		for(User singleUsr: resultFindAllU) {
        			System.out.println(singleUsr.getClass() + singleUsr.toString());
        			//findByCodePostal(resultFindAllU, 75000);  // find HOWTO
        		}
        //countByCodePostal(75000); // not implemented
        
    }

}
