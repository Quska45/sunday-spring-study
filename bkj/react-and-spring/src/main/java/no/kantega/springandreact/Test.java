package no.kantega.springandreact;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "no.kantega.springandreact")
@Entity
@Table(name="test")
public class Test implements Serializable{
	@Column(name="test")
	private String test;
}
