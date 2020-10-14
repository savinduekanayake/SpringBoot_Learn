package com.expamle.demo.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring1","spring Framework1", "Description"),
                new Topic("spring2","spring Framework2", "Description"),
                new Topic("spring3","spring Framework3", "Description")
        );
    }

}
