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

}
