package me.arkantrust.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import me.arkantrust.movies.model.Movie;
import java.util.Optional;


public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    Optional<Movie> findByImdbId(String imdbId);

}
