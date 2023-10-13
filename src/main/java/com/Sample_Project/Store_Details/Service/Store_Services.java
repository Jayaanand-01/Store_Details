package com.Sample_Project.Store_Details.Service;

import com.Sample_Project.Store_Details.Entity.Store;
import com.Sample_Project.Store_Details.Repository.Store_Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Store_Services {
    @Autowired
    private Store_Repositories sr1;
    //Contructor
    public void  saveOrUpdate(Store sr2)
    {
        sr1.save(sr2);
    }
    public List<Store>getAllStores()
    {

        return (List<Store>) sr1.findAll();
    }
    public Optional<Store> getStoreById(Long id) {
        return sr1.findById(id);
    }

    public Store createOrUpdateStore(Store store) {

        return sr1.save(store);
    }

    public Store update(Store store) {
        return sr1.save(store);
    }

    public void deleteStore(Long id) {
        sr1.deleteById(id);
    }
}
