package com.todeb.oturker.coursemanagementapplication.model.dto;

import com.todeb.oturker.coursemanagementapplication.model.LangOptions;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter

public class CourseDTO {
    private String title;
    private String details;
    private double price;
    private int quota;
    private int numberOfPeopleBought;
    private int countOfReview;
    private double point;
    private List<String> keywords;
    private List<LangOptions> langOptions;
}
