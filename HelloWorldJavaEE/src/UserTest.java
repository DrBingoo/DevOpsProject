import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	private User newUser;
	private String name = "bingo";
	private String password = "12345";
	private String email = "bingo@gmail.com";
	private String language = "English";

	@BeforeEach
	void setUp() throws Exception {
		newUser = new User(name, password, email, language);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetName() {
		assertEquals(newUser.getName(), name);
	}

	@Test
	void testSetName() {
		newUser.setName("new name");
		assertEquals(newUser.getName(), "new name");
	}

	@Test
	void testGetPassword() {
		assertEquals(newUser.getPassword(), password);
	}

	@Test
	void testSetPassword() {
		newUser.setPassword("new password");
		assertEquals(newUser.getPassword(), "new password");
	}

	@Test
	void testGetEmail() {
		assertEquals(newUser.getEmail(), email);
	}

	@Test
	void testSetEmail() {
		newUser.setEmail("new@gmail.com");
		assertEquals(newUser.getEmail(), "new@gmail.com");
	}

	@Test
	void testGetLanguage() {
		assertEquals(newUser.getLanguage(), language);
	}

	@Test
	void testSetLanguage() {
		newUser.setLanguage("Chinese");
		assertEquals(newUser.getLanguage(), "Chinese");
	}

}
