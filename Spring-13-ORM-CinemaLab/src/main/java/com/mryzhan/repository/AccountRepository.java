package com.mryzhan.repository;

import com.mryzhan.entity.UserAccount;
import com.mryzhan.enums.Role;
import com.mryzhan.enums.UserRole;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<UserAccount, Long> {


    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state

    List<UserAccount> findAllByAccountDetails_CountryOrAccountDetails_State(String country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<UserAccount> findAllByAccountDetails_AgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<UserAccount> findAllByAccountDetails_Role(Role role);

    //Write a derived query to list all accounts between a range of ages
    List<UserAccount> findAllByAccountDetails_AgeBetween(Integer age1, Integer age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<UserAccount> findAllByAccountDetails_AddressStartingWith(String pattern);

    //Write a derived query to sort the list of accounts with age
    List<UserAccount> findAllByOrderByAccountDetails_Age();
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
    @Query("SELECT u FROM UserAccount u")
    List<UserAccount> readAllAccounts();

    //Write a JPQL query to list all admin accounts
    @Query("SELECT u FROM UserAccount u WHERE u.accountDetails.role In (com.mryzhan.enums.UserRole.ADMIN)")
    List<UserAccount> readAllAdminAccounts();

    //Write a JPQL query to sort all accounts with age
    @Query("SELECT u FROM UserAccount u ORDER BY u.accountDetails.age DESC")
    List<UserAccount> readAllAccountsSortedByAge();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "select * from user_account u1_0 join account_details a1_0 on a1_0.id=u1_0.account_details_id where a1_0.age<47", nativeQuery = true)
    //@Query("SELECT u FROM UserAccount u WHERE u.accountDetails.age < ?1")
    List<UserAccount> readAllByAgeLessThanNative(Integer age);


    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city

    //Write a native query to read all accounts with an age lower than a specific value


}
