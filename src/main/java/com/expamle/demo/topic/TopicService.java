package com.expamle.demo.topic;

import com.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private CourseRepository courseRepository;

    private List<Topic> topics = Arrays.asList(
                new Topic("spring1","spring Framework1", "Description"),
                new Topic("spring2","spring Framework2", "Description"),
                new Topic("spring3","spring Framework3", "Description")
        );

    public List<Topic> getAllTopics() {

        return topics;
    }

    public Topic getTopic( String id) {
//        return courseRepository.getOne(id)
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i=0; i< topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
