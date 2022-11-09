package springBoot.Database.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import springBoot.Database.topic.TopicData;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	
	private TopicData topicData;

	public Course() {
	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topicData = new TopicData(topicId, "", "");
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public TopicData getTopicData() {
		return topicData;
	}

	public void setTopicData(TopicData topicData) {
		this.topicData = topicData;
	}

	
}
