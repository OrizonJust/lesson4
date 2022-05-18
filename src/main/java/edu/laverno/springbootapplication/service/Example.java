package edu.laverno.springbootapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Example {

    private final Application app;

    @Autowired
    public Example (Application app) {
        this.app = app;
    }

    public String test() {
        return app.getVersion();
    }
}
