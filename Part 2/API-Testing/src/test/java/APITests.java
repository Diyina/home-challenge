
import builder.PetBuilder;
import io.restassured.RestAssured;

import io.restassured.response.Response;
import model.Pet;
import model.Status;
import org.junit.jupiter.api.*;
import response.PetResponse;

import java.net.HttpURLConnection;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class APITests {

    private static final Integer id = 100;
    private static final String name = "Miku";
    private static final Status available = Status.available;
    private static final Status sold = Status.sold;

    @BeforeAll
    public static void setup(){
        RestAssured.baseURI = "https://petstore3.swagger.io/api/v3";
    }

    @Test
    @Order(1)
    public void createPet(){
        Pet pet = new PetBuilder().id(id).name(name).status(available).build();
        Response response = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(pet)
                .when()
                .post("/pet")
                .then()
                .extract().response();

        PetResponse petResponse = response.getBody().as(PetResponse.class);
        Assertions.assertEquals(HttpURLConnection.HTTP_OK, response.statusCode());
        Assertions.assertEquals("Miku", petResponse.getName());
        Assertions.assertEquals(available, petResponse.getStatus());
    }

    @Test
    @Order(2)
    public void updatePet(){
        Pet pet = new PetBuilder().id(id).name(name).status(sold).build();
        Response response = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(pet)
                .when()
                .put("/pet")
                .then()
                .extract().response();
        PetResponse petResponse = response.getBody().as(PetResponse.class);

        Assertions.assertEquals(HttpURLConnection.HTTP_OK, response.statusCode());
        Assertions.assertEquals("Miku", petResponse.getName());
        Assertions.assertEquals(sold, petResponse.getStatus());
    }

    @Test
    @Order(2)
    public void deletePet(){
        Response response = RestAssured.given()
                .header("Content-type", "application/json")
                .when()
                .delete("/pet/"+id)
                .then()
                .extract().response();

        Assertions.assertEquals(HttpURLConnection.HTTP_OK, response.statusCode());
        Assertions.assertEquals("Pet deleted", response.getBody().asString());
    }
}