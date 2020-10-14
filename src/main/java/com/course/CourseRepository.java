package com.course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
// should done in CrudRepository
public interface CourseRepository extends JpaRepository<Course,String > {

    public List<Course> findByTopicId(String topicId);
}
