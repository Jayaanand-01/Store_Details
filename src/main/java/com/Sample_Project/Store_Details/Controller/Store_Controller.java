package com.Sample_Project.Store_Details.Controller;

import com.Sample_Project.Store_Details.Entity.Store;
import com.Sample_Project.Store_Details.Service.Store_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/stores")
public class Store_Controller {
    private Store_Services store1;

    @Autowired
    public Store_Controller(Store_Services store1) {

        this.store1 = store1;
    }

    @GetMapping
    public List<Store> getAllStores() {
        return store1.getAllStores();
    }

    @GetMapping("/{id}")
    public Optional<Store> getStoreById(@PathVariable Long id) {
        return store1.getStoreById(id);
    }

    @PostMapping("post")
    public Store createStore(@RequestBody Store store) {

        return store1.createOrUpdateStore(store);
    }

    @PutMapping("update")
    public Store updateStore(@RequestBody Store store) {

        return store1.update(store);
    }
    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable Long id) {

        store1.deleteStore(id);
    }
}
