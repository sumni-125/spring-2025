package com.acorn.prac.fruits;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
CREATE TABLE fruits (
    fruit_name VARCHAR2(50) NOT NULL,  -- 과일 이름
    color VARCHAR2(30),                -- 색깔
    CONSTRAINT pk_fruits PRIMARY KEY (fruit_name)
  );
*/

@AllArgsConstructor
@Data
public class Fruit {
	private String fruit_name;
	private String color;
	
	public Fruit() {
		
	}
}
