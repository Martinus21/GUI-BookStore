package com.data;

import com.data.entity.DataBarang;
import com.data.repository.DataBarangRepository;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DataBukuController implements Initializable {

    @FXML
    private JFXTextField dataKodeBuku;
    @FXML
    private JFXTextField dataJudulBuku;
    @FXML
    private JFXTextField dataPenulisBuku;
    @FXML
    private JFXTextField dataPenerbitBuku;
    @FXML
    private JFXTextField dataTahunBuku;
    @FXML
    private JFXTextField dataHargaJual;
    @FXML
    private JFXButton dataSimpan;

    @FXML
    private TableView<DataBarang> tableView;

    @FXML
    void HandleSimpan(ActionEvent event) {
        DataBarangRepository.addBarang(new DataBarang(dataKodeBuku.getText(), dataJudulBuku.getText(), dataPenulisBuku.getText(), dataPenerbitBuku.getText(), dataTahunBuku.getText(), dataHargaJual.getText()));
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableColumn<DataBarang,String> kodeBuku = new TableColumn<DataBarang, String>("Kode Buku");
        kodeBuku.setMinWidth(100);
        kodeBuku.setCellValueFactory(new PropertyValueFactory<DataBarang, String>("kodeBuku"));


        TableColumn<DataBarang,String> judulBuku = new TableColumn<DataBarang, String>("Judul");
        judulBuku.setMinWidth(100);
        judulBuku.setCellValueFactory(new PropertyValueFactory<DataBarang, String>("judulBuku"));


        TableColumn<DataBarang,String> penulisBuku = new TableColumn<DataBarang, String>("Penulis");
        penulisBuku.setMinWidth(100);
        penulisBuku.setCellValueFactory(new PropertyValueFactory<DataBarang, String>("penulisBuku"));


        TableColumn<DataBarang,String> penerbitBuku = new TableColumn<DataBarang, String>("Penerbit");
        penerbitBuku.setMinWidth(100);
        penerbitBuku.setCellValueFactory(new PropertyValueFactory<DataBarang, String>("penerbitBuku"));


        TableColumn<DataBarang,String> tahunBuku = new TableColumn<DataBarang, String>("Tahun Penerbit");
        tahunBuku.setMinWidth(100);
        tahunBuku.setCellValueFactory(new PropertyValueFactory<DataBarang, String>("tahunBuku"));


        TableColumn<DataBarang,String> hargaBuku = new TableColumn<DataBarang, String>("Harga Buku");
        hargaBuku.setMinWidth(100);
        hargaBuku.setCellValueFactory(new PropertyValueFactory<DataBarang, String>("hargaBuku"));


        tableView.setItems(DataBarangRepository.getAlldataBarangRepo());
        tableView.getColumns().addAll(kodeBuku, judulBuku, penulisBuku, penerbitBuku, tahunBuku, hargaBuku);
    }

}