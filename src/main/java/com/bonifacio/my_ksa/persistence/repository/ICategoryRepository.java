package com.bonifacio.my_ksa.persistence.repository;

import com.bonifacio.my_ksa.persistence.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICategoryRepository extends JpaRepository<Category, UUID> {
}
