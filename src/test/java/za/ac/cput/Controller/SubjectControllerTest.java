package za.ac.cput.Controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Factory.SubjectFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer. MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SubjectControllerTest {
    private static Subject subject = SubjectFactory.createSubject("ADP","APPDEV","12:00","MON");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/subject";

    @Test
    void a_create(){
        String url = baseURL + "/create";
        ResponseEntity<Subject> postResponse = restTemplate.postForEntity(url, subject, Subject.class);
        assertNotNull(postResponse);
        assertNotNull((postResponse).getBody());
        subject = postResponse.getBody();
        System.out.println("Saved data: "+subject);
        assertEquals(subject.getSubjectCode(),postResponse.getBody().getSubjectCode());
    }

    @Test
    void b_read(){
        String url = baseURL + "/read/" + subject.getSubjectCode();
        System.out.println("URL: " + url);
        ResponseEntity<Subject> response = restTemplate.getForEntity(url, Subject.class);
        //assertEquals(subject.getSubjectCode(), response.getBody().getSubjectCode());
    }

    @Test
    void c_update(){
        Subject updated = new Subject.SubjectBuilder().copy(subject).setSubjectName("INFOSYS").build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updated);
        ResponseEntity<Subject> response = restTemplate.postForEntity(url, updated, Subject.class);
        assertNotNull(response.getBody());
    }

    @Test
    void d_delete(){
        String url = baseURL + "/delete";
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }

    @Test
    void e_getAll(){
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show ALL:");
        System.out.println(response);
        System.out.println(response.getBody());
    }

}