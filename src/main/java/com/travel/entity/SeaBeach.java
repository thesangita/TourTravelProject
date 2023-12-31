package com.travel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeaBeach extends Destinations {
	
	private boolean coralOrNot;
	
	@Column(length = 50, nullable = true)
	private String waveStrength;
}