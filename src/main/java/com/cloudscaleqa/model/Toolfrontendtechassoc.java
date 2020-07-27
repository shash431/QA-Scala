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
 * Toolfrontendtechassoc generated by hbm2java
 */
@Entity
@Table(name = "toolfrontendtechassoc")
public class Toolfrontendtechassoc implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8517009303842455867L;
	private Integer id;
	private Tool tool;
	private Fronendtech fronendtech;

	public Toolfrontendtechassoc() {
	}

	public Toolfrontendtechassoc(Tool tool, Fronendtech fronendtech) {
		this.tool = tool;
		this.fronendtech = fronendtech;
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
	@JoinColumn(name = "FTVal", nullable = false)
	public Fronendtech getFronendtech() {
		return this.fronendtech;
	}

	public void setFronendtech(Fronendtech fronendtech) {
		this.fronendtech = fronendtech;
	}

}
