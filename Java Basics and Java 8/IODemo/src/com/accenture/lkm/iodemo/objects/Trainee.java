package com.accenture.lkm.iodemo.objects;

import java.io.Serializable;
import java.util.Date;

// marker interface
public class Trainee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String traineeName;
	private transient int traineeAge;
	private Date joiningDate;

	/**
	 * @param traineeName
	 * @param traineeAge
	 * @param joiningDate
	 */
	public Trainee(String traineeName, int traineeAge, Date joiningDate) {
		this.traineeName = traineeName;
		this.traineeAge = traineeAge;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Trainee [traineeName=" + traineeName + ", traineeAge=" + traineeAge + ", joiningDate=" + joiningDate
				+ "]";
	}

}
