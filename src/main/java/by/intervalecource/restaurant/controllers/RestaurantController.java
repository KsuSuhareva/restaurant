package by.intervalecource.restaurant.controllers;

import by.intervalecource.restaurant.model.Visitor;
import by.intervalecource.restaurant.service.restaurant.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant/")
public class RestaurantController {
    private final RestaurantService service;

    @PostMapping("feed")
    public Visitor feed(@RequestBody Visitor visitor) {
        System.out.println("Что предпочитаете, " + visitor.getName() + " ?");
        service.feed(visitor);
        return visitor;
    }

}

