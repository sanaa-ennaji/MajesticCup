package org.sanaa.brif10.majesticcup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import javax.xml.transform.Result;

public interface ResultRepository extends MongoRepository<Result, Long> {
}
