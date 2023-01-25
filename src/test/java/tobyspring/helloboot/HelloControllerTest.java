package tobyspring.helloboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {

  @Test
  void helloController() {
    HelloController controller = new HelloController(name -> name);

    String ret = controller.hello("Test");

    assertThat(ret).isEqualTo("Test");
  }

  @Test
  void failsHelloController() {
    HelloController controller = new HelloController(name -> name);

    Assertions
        .assertThatThrownBy(() -> controller.hello(null))
        .isInstanceOf(IllegalArgumentException.class);

    Assertions
        .assertThatThrownBy(() -> controller.hello(""))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
