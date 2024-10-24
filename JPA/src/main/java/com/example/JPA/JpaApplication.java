package com.example.JPA;

import com.example.JPA.Model.Author;
import com.example.JPA.Repo.AuthorRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);

		// Get the repository bean from the context
		AuthorRepo repo = context.getBean(AuthorRepo.class);

//		// Manually create Author instances
//		Author a1 = new Author();
//		a1.setId(101);
//		a1.setFirstName("Shivam");
//		a1.setLastName("Tomar");
//		a1.setAge(20);
//		a1.setEmail("ss93134041@gmail.com");
//
//		Author a2 = new Author();
//		a2.setId(102);
//		a2.setFirstName("Priya");
//		a2.setLastName("Sharma");
//		a2.setAge(40);
//		a2.setEmail("priya.sharma@gmail.com");
//
//		Author a3 = new Author();
//		a3.setId(103);
//		a3.setFirstName("Rahul");
//		a3.setLastName("Patel");
//		a3.setAge(21);
//		a3.setEmail("rahul.p@gmail.com");
//
//		// Save the authors using the repository
//		repo.save(a1);
//		repo.save(a2);
//		repo.save(a3);
	}
}
