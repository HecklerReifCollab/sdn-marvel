package com.thehecklers.sdnmarvel.story;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface StoryRepo extends Neo4jRepository<Story, Long> {
}
