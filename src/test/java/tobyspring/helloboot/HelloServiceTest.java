package tobyspring.helloboot;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloServiceTest {

  @Test
  void simpleHelloService() {
    SimpleHelloService simpleHelloService = new SimpleHelloService();

    String ret = simpleHelloService.sayHello("Test");

    assertThat(ret).isEqualTo("Hello Test");
  }

  @Test
  void decoratorHelloService() {
    HelloDecorator decorator = new HelloDecorator(name -> name);

    String ret = decorator.sayHello("Test");

    assertThat(ret).isEqualTo("*Test*");
  }
}