package edu.laverno.springbootapplication.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ExampleTest {

    @MockBean
    private Application app;

    @Autowired
    private Example example;

    @Test
    public void test() {
        given(this.app.getVersion()).willReturn("1.0");

        assertEquals("1.0", example.test());
    }
}
