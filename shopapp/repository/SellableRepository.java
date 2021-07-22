package com.sda.javaAdvanced.shopapp.repository;

import com.sda.javaAdvanced.shopapp.model.Sellable;

import java.util.Optional;

public interface SellableRepository<T extends Sellable> {

    void add(T item);

    Optional<T> search(String id);

    void remove(String id);

    Optional<T> findByName(String name);

}
