package fun.bdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckPasswordTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_should_be_a_secure_password() {
		Assert.assertTrue(CheckPassword.isSecure("12345The!!"));
	}
	
	@Test
	public void should_be_insecure_with_not_enough_characters() {
		Assert.assertFalse(CheckPassword.isSecure("1244"));
	}
	
	@Test
	public void should_be_insecure_with_no_numbers_with_8_characters() {
		Assert.assertFalse(CheckPassword.isSecure("abcdedfg"));
	}

	@Test
	public void should_be_insecure_with_only_numbers() {
		Assert.assertFalse(CheckPassword.isSecure("12345678"));
	}
}
