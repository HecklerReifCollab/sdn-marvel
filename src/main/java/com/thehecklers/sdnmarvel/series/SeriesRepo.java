package com.thehecklers.sdnmarvel.series;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SeriesRepo extends Neo4jRepository<Series, Long> {

}
