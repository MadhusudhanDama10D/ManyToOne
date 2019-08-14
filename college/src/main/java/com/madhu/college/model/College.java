package com.madhu.college.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "newcollege")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cId;

	private String cName;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Department department;

	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "College [cId=" + cId + ", cName=" + cName + ", department=" + department + "]";
	}

}
