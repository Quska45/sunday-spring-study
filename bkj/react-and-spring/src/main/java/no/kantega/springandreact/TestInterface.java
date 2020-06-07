package no.kantega.springandreact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestInterface extends JpaRepository<Test, Long> {
	
}
