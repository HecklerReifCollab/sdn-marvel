package com.thehecklers.sdnmarvel.comicIssue;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ComicIssueRepo extends Neo4jRepository<ComicIssue, Long> {

    ComicIssue findByName(@Param("name") String name);

    Iterable<ComicIssue> findByNameLike(@Param("name") String name);

    @Query("MATCH (c:Character)<-[r:INCLUDES]-(i:ComicIssue) RETURN c,r,i LIMIT {limit}")
    Collection<ComicIssue> graph(@Param("limit") int limit);
}