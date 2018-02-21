package com.modzo.container

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@RunWith(SpringRunner)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class ContainerApplicationTests {

    @Test
    void contextLoads() {

    }

}
