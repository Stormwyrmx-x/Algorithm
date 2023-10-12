package com.weng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassMate
{
    private String name;
    private Integer age;
    private Double chineseScore;
    private Double mathScore;
    private Double englishScore;
}
