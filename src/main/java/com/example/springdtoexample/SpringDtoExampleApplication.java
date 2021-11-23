package com.example.springdtoexample;

import com.example.springdtoexample.model.Location;
import com.example.springdtoexample.model.User;
import com.example.springdtoexample.repository.LocationRepository;
import com.example.springdtoexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDtoExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDtoExampleApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Spain");
		location.setDescription("Spain is a good place for live");
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Edu");
		user1.setLastName("Lorenzo");
		user1.setEmail("edulorenzo@correo.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("user2");
		user2.setLastName("lastName2");
		user2.setEmail("user2@correo.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);

	}

}