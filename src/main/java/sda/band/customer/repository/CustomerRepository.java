package sda.band.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.band.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
