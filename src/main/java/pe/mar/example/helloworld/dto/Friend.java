package pe.mar.example.helloworld.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Friend {
	int seq;
	String name;
	String group;
	Timestamp create;
	Timestamp update;
}
