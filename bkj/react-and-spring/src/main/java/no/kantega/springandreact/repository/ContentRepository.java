package no.kantega.springandreact.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import no.kantega.springandreact.collection.Content;

public interface ContentRepository extends MongoRepository<Content, String> {
 
}