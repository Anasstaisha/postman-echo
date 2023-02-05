import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class test {
    @Test
    void shouldSendReRequestBody() {
        given()
                .baseUri("https://postman-echo.com")
                .body("22.02.1997")

                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("22.02.1997"));
    }
}
