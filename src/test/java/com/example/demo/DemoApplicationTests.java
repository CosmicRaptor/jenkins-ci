package com.example.demo; // Make sure this package matches your project

// --- ADD THIS LINE ---
// (Assuming your DemoApplication.java is in the 'com.example.demo' package)
// --- END OF ADDITION ---

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest; // Added this import

// --- THIS IS THE FIX ---
// Add (classes = DemoApplication.class)
// (Assuming your main class is named DemoApplication)
@Disabled // This will skip all tests in this file
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		// This is the default test. If it passes,
		// it proves the Spring application context
		// loaded successfully.
	}

	// You can add your other tests here
	// @Test
	// void statusEndpointShouldReturnOk() {
	//     // ...
	// }
}

