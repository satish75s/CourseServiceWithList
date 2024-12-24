package com.course.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {

	private int courseId;
	private String name;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date startDate;
	private double fees;
	private boolean isCertificateAvailable;
}
