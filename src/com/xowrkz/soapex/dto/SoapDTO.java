package com.xowrkz.soapex.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.xowrkz.soapex.constant.SoapType;
@Entity
@Table(name = "soap")
public class SoapDTO {
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_BA")
	private String brandAmbassador;
	@Column(name = "s_odour")
	private String odiur;
	@Column(name = "s_certified")
	private boolean certified;
	@Column(name = "s_antiBacteria")
	private boolean antiBacteria;
	@Column(name = "s_type")
	private SoapType type;
  public SoapDTO(){
		
	}
public SoapDTO(int id, String brandAmbassador, String odiur, boolean certified, boolean antiBacteria, SoapType type) {
	super();
	this.id = id;
	this.brandAmbassador = brandAmbassador;
	this.odiur = odiur;
	this.certified = certified;
	this.antiBacteria = antiBacteria;
	this.type = type;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrandAmbassador() {
	return brandAmbassador;
}
public void setBrandAmbassador(String brandAmbassador) {
	this.brandAmbassador = brandAmbassador;
}
public String getOdiur() {
	return odiur;
}
public void setOdiur(String odiur) {
	this.odiur = odiur;
}
public boolean isCertified() {
	return certified;
}
public void setCertified(boolean certified) {
	this.certified = certified;
}
public boolean isAntiBacteria() {
	return antiBacteria;
}
public void setAntiBacteria(boolean antiBacteria) {
	this.antiBacteria = antiBacteria;
}
public SoapType getType() {
	return type;
}
public void setType(SoapType type) {
	this.type = type;
}
@Override
public String toString() {
	return "SoapDTO [id=" + id + ", brandAmbassador=" + brandAmbassador + ", odiur=" + odiur + ", certified="
			+ certified + ", antiBacteria=" + antiBacteria + ", type=" + type + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (antiBacteria ? 1231 : 1237);
	result = prime * result + ((brandAmbassador == null) ? 0 : brandAmbassador.hashCode());
	result = prime * result + (certified ? 1231 : 1237);
	result = prime * result + id;
	result = prime * result + ((odiur == null) ? 0 : odiur.hashCode());
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
	SoapDTO other = (SoapDTO) obj;
	if (antiBacteria != other.antiBacteria)
		return false;
	if (brandAmbassador == null) {
		if (other.brandAmbassador != null)
			return false;
	} else if (!brandAmbassador.equals(other.brandAmbassador))
		return false;
	if (certified != other.certified)
		return false;
	if (id != other.id)
		return false;
	if (odiur == null) {
		if (other.odiur != null)
			return false;
	} else if (!odiur.equals(other.odiur))
		return false;
	if (type != other.type)
		return false;
	return true;
}

}
