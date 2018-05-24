package com.cts.oopsassignment;

public class EmployeeDetails {
	// tostring
	private int id, phoneNo, Salery;
	private String name, Desigination;

	public EmployeeDetails(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public EmployeeDetails(int id, String name, String Desigination) {
		this(id, name);
		this.Desigination = Desigination;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Desigination == null) ? 0 : Desigination.hashCode());
		result = prime * result + Salery;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phoneNo;
		return result;
	}

	public String getDesigination() {
		return Desigination;
	}

	public void setDesigination(String desigination) {
		this.Desigination = desigination;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getSalery() {
		return Salery;
	}

	public void setSalery(int salery) {
		this.Salery = salery;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
			if (Desigination == null) {
			if (other.Desigination != null)
				return false;
		} else if (!Desigination.equals(other.Desigination))
			return false;
		if (Salery != other.Salery)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", phoneNo=" + phoneNo + ", Salery=" + Salery + ", name=" + name
				+ ", Desigination=" + Desigination + "]" ;
	}
	
}
