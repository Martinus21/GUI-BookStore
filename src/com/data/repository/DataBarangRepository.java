package com.data.repository;

import com.data.entity.DataBarang;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataBarangRepository {
    private static ObservableList<DataBarang> dataBarangRepo = FXCollections.observableArrayList();

    public static ObservableList<DataBarang> getAlldataBarangRepo(){
        return DataBarangRepository.dataBarangRepo;
    }

    public static void addBarang(DataBarang barang){
        DataBarangRepository.dataBarangRepo.add(barang);
    }
}
