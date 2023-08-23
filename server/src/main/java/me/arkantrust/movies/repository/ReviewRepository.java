package me.arkantrust.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import me.arkantrust.movies.model.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
