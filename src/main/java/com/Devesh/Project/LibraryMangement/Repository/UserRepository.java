package com.Devesh.Project.LibraryMangement.Repository;

import com.Devesh.Project.LibraryMangement.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
