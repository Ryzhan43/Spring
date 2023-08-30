package com.mryzhan.repository;

import com.mryzhan.entity.User;
import com.mryzhan.enums.Role;
import com.mryzhan.enums.UserRole;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface AccountRepository extends JpaRepository<User, Long> {


    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state

    List<User> findAllByAccountDetails_CountryOrAccountDetails_State(String country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<User> findAllByAccountDetails_AgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<User> findAllByAccountDetails_Role(Role role);

    //Write a derived query to list all accounts between a range of ages
    List<User> findAllByAccountDetails_AgeBetween(Integer age1, Integer age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<User> findAllByAccountDetails_AddressStartingWith(String pattern);

    //Write a derived query to sort the list of accounts with age
    List<User> findAllByOrderByAccountDetails_Age();
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
    @Query("SELECT u FROM UserAccount u")
    List<User> readAllAccounts();

    //Write a JPQL query to list all admin accounts
    @Query("SELECT u FROM UserAccount u WHERE u.accountDetails.role In (com.mryzhan.enums.UserRole.ADMIN)")
    List<User> readAllAdminAccounts();

    //Write a JPQL query to sort all accounts with age
    @Query("SELECT u FROM UserAccount u ORDER BY u.accountDetails.age DESC")
    List<User> readAllAccountsSortedByAge();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "select * from user_account u1_0 join account_details a1_0 on a1_0.id=u1_0.account_details_id where a1_0.age<47", nativeQuery = true)
    //@Query("SELECT u FROM UserAccount u WHERE u.accountDetails.age < ?1")
    List<User> readAllByAgeLessThanNative(Integer age);


    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    @Query(value = "select * from user_account where name ILIKE concat('%', ?1, '%')" +
            "OR address ILIKE concat('%', ?1, '%')" +
            "OR country ILIKE concat('%', ?1, '%')" +
            "OR state ILIKE concat('%', ?1, '%')" +
            "OR city ILIKE concat('%', ?1, '%')",nativeQuery = true)
    List<User> retrieveAllAccountsThatContain(String value);

}
