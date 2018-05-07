package com.example.demo.controller;

import com.example.demo.entities.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/{name}",method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Create user")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "All work"),
            @ApiResponse(code = 404, message = "Not found")
    })
    public User getUser(@PathVariable String name) {
        return new User(name, 12);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public User putUser() {
        return new User("Put", 12);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ApiOperation(value = "Create user")
    public User postUser(@RequestBody String name) {
        return new User(name, 12);
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
    public User deleteUser() {
        return new User("Delete", 12);
    }
}
