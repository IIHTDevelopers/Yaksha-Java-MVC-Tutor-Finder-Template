package com.yaksha.training.tutor.entity;

public class Tutor {

	private Long id;

	private String name;

	private String subject;

	private String description;

	private Integer duration;

	private Double price;

	public Tutor() {
	}

	public Tutor(Long id, String name, String subject, String description, Integer duration, Double price) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.description = description;
		this.duration = duration;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tutor{" + "id=" + id + ", name='" + name + '\'' + ", subject='" + subject + '\'' + ", description='"
				+ description + '\'' + ", duration=" + duration + ", price=" + price + '}';
	}
}
