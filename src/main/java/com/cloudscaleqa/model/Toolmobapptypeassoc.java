package com.cloudscaleqa.model;

// Generated Jan 25, 2018 1:06:55 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Toolmobapptypeassoc generated by hbm2java
 */
@Entity
@Table(name = "toolmobapptypeassoc")
public class Toolmobapptypeassoc implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4820860256187380169L;
	private Integer id;
	private Tool tool;
	private Mobileapptype mobileapptype;

	public Toolmobapptypeassoc() {
	}

	public Toolmobapptypeassoc(Tool tool, Mobileapptype mobileapptype) {
		this.tool = tool;
		this.mobileapptype = mobileapptype;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TVal", nullable = false)
	public Tool getTool() {
		return this.tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAPPVal", nullable = false)
	public Mobileapptype getMobileapptype() {
		return this.mobileapptype;
	}

	public void setMobileapptype(Mobileapptype mobileapptype) {
		this.mobileapptype = mobileapptype;
	}

}
