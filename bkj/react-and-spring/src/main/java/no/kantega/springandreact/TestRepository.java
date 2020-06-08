package no.kantega.springandreact;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface TestRepository extends Repository<Test, Integer> {
	public List<Test> findAll();
}
