package net.ds5.digishop5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.ds5.digishop5.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}