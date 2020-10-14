package com.expamle.demo.topic;

import com.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Course,String > {
    
}
