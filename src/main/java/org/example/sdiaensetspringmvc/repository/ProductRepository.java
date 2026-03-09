package org.example.sdiaensetspringmvc.repository;

import org.example.sdiaensetspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
