package com.Devesh.Project.LibraryMangement.Repository;

import com.Devesh.Project.LibraryMangement.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book,Integer> {
}
