package test;

import entities.Patient;
import org.glassfish.jersey.client.ClientConfig;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class PatientClientTest {

	private static String baseURI = "http://localhost:8080/MyWebsite/rest/patients";

	@Before
	public void init() {}



	private static void testDelete() {
		WebTarget target = getWebTarget();
		String productId = "3";
		Response response = target.path(productId).request()
				.delete(Response.class);
		System.out.println(response);		
	}

	private static void testUpdate() {
		WebTarget target = getWebTarget();
		Patient patient = new Patient();
		String productId = "4";
		Response response = target.path(productId).request()
				.put(Entity.entity(patient, MediaType.APPLICATION_JSON), Response.class);
		System.out.println(response);		
	}

	static WebTarget getWebTarget() {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		
		return client.target(baseURI);		
	}
	@Test
	public void testList() {
		WebTarget target = getWebTarget();
		
		String response = target.request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		System.out.println(response);		
	}

	static void testGet() {
		WebTarget target = getWebTarget();
		String productId = "1";
		Patient patient = target.path(productId)
							.request().accept(MediaType.APPLICATION_JSON)
							.get(Patient.class);

		System.out.println(patient);
	}
	
	static void testAdd() {
		WebTarget target = getWebTarget();
		Patient patient = new Patient();
		Response response = target.request()
				.post(Entity.entity(patient, MediaType.APPLICATION_JSON), Response.class);
		
		System.out.println(response.getLocation().toString());
	}
}
