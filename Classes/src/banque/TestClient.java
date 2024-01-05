package banque;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClient {
	@Test
	void testGetPrenom()
	{
		Client client = new Client("Lincoln", "Abraham", "Washington", 238);
		assertEquals(client.getPrenom(), "Abraham");
	}

	@Test
	void testGetNom()
	{
		Client client = new Client("Lincoln", "Abraham", "Washington", 238);
		assertEquals(client.getNom(), "Lincoln");
	}
	
	@Test
	void testGetville()
	{
		Client client = new Client("Lincoln", "Abraham", "Washington", 238);
		assertEquals(client.getVille(), "Washington");
	}
	
	@Test
	void testGetAge()
	{
		Client client = new Client("Lincoln", "Abraham", "Washington", 238);
		assertEquals(client.getAge(), 238);
	}
	
	
	
	@Test
	void testSetPrenom()
	{
		Client client = new Client("Lincoln", "Abraham", "Washington", 238);
		client.setPrenom("Jean");
		assertEquals(client.getPrenom(), "Jean");
	}
	
	@Test
	void testSetNom()
	{
		Client client = new Client("Lincoln", "Abraham", "Washington", 238);
		client.setNom("Michel");
		assertEquals(client.getNom(), "Michel");
	}
	
	@Test
	void testSetville()
	{
		Client client = new Client("Lincoln", "Abraham", "Washington", 238);
		client.setVille("Paris");
		assertEquals(client.getVille(), "Paris");
	}
	
	@Test
	void testSetAge()
	{
		Client client = new Client("Lincoln", "Abraham", "Washington", 238);
		client.setAge(20);
		assertEquals(client.getAge(), 20);
	}
	
}
