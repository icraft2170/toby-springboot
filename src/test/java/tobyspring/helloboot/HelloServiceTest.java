package tobyspring.helloboot;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloServiceTest {

  @Test
  void simpleHelloService() {
    SimpleHelloService simpleHelloService = new SimpleHelloService();

    String res = simpleHelloService.sayHello("Test");

    assertThat(res).isEqualTo("Hello Test");
  }
}