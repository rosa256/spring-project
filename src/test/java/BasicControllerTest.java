import com.example.DemoApplication;
import com.example.personal.demo.Controllers.BasicController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DemoApplication.class)
@WebMvcTest(BasicController.class)
// Tworzy sie caly kontekst springowy #
            // Skonfiguruje dodatkowe elementy które będą potrzebne, takie jak mockMvc
public class BasicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getHelloTest() throws Exception{
        mockMvc
                .perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello WhiteStock!")))
        .andDo(print());
    }
}
