package com.expamle.demo.topic;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
                new Topic("spring1","spring Framework1", "Description"),
                new Topic("spring2","spring Framework2", "Description"),
                new Topic("spring3","spring Framework3", "Description")
        );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic( String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
