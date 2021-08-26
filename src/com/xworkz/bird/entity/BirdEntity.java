package com.xworkz.bird.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="bird")
public class BirdEntity implements Serializable{
    @Column(name = "B_ID")
    @Id
	private int id;
    @Column(name="B_NAME")
	private String name;
    @Column(name="B_HOUSENAME")
	private String houseName;
    @Column(name="B_BREED")
	private String breed;
    @Column(name="B_TYPE")
	private String type;
    @Column(name="B_FOOD")
	private String food;
    @Column(name="B_Gender")
	private String gender;
    @Column(name="B_NEST")
	private boolean nest;
    @Column(name="B_COLOUR")
	private String color;
    @Column(name="B_HOLESIZE")
	private String holeSize;
	
	public BirdEntity() {
		// TODO Auto-generated constructor stub
	}

	public BirdEntity(int id, String name, String houseName, String breed, String type, String food, String gender,
			boolean nest, String color, String holeSize) {
		super();
		this.id = id;
		this.name = name;
		this.houseName = houseName;
		this.breed = breed;
		this.type = type;
		this.food = food;
		this.gender = gender;
		this.nest = nest;
		this.color = color;
		this.holeSize = holeSize;
	}

	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", houseName=" + houseName + ", breed=" + breed + ", type="
				+ type + ", food=" + food + ", gender=" + gender + ", nest=" + nest + ", color=" + color + ", holeSize="
				+ holeSize + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isNest() {
		return nest;
	}

	public void setNest(boolean nest) {
		this.nest = nest;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHoleSize() {
		return holeSize;
	}

	public void setHoleSize(String holeSize) {
		this.holeSize = holeSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((holeSize == null) ? 0 : holeSize.hashCode());
		result = prime * result + ((houseName == null) ? 0 : houseName.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (nest ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BirdEntity other = (BirdEntity) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (holeSize == null) {
			if (other.holeSize != null)
				return false;
		} else if (!holeSize.equals(other.holeSize))
			return false;
		if (houseName == null) {
			if (other.houseName != null)
				return false;
		} else if (!houseName.equals(other.houseName))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nest != other.nest)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
