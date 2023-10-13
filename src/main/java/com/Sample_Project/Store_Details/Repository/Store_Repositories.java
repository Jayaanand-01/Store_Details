package com.Sample_Project.Store_Details.Repository;

import com.Sample_Project.Store_Details.Entity.Store;
import com.Sample_Project.Store_Details.Service.Store_Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Store_Repositories extends CrudRepository<Store,Long> {
}
