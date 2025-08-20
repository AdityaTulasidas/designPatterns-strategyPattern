package com.patterns.adapter;

import com.patterns.adapter.model.Bird;
import com.patterns.adapter.model.BirdAdapter;
import com.patterns.adapter.model.Duck;
import com.patterns.adapter.model.Sparrow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adapter-demo")
public class AdapterPatternDemoController {

    @GetMapping
    public String demoAdapterPattern() {
        StringBuilder sb = new StringBuilder();

        Duck duck = new Duck();
        sb.append("Duck: ");
        duck.fly();
        duck.makeSound();
        sb.append("<br>");

        Sparrow sparrow = new Sparrow();
        Bird birdAdapter = new BirdAdapter(sparrow);
        sb.append("Sparrow (as Bird): ");
        birdAdapter.fly();
        birdAdapter.makeSound();
        sb.append("<br>");

        return "Check the console for output. Adapter Pattern demo executed.";
    }
}

