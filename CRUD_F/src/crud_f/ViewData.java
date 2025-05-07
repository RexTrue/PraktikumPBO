/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_f;

/**
 *
 * @author Lab Informatika
 */
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class ViewData {
    //membuat variabel untuk menyimpam baris keberapa yang dipilih 
    //user memilih salah satu data yang ada di tabel
    
    Integer baris;
    
    List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    
    JLabel header = new JLabel("Selamat Datang!");
    JButton tombolTambah = new JButton ("Tambah Mahasiswa");
    JButton tombolEdit = new JButton ("Edit Mahasiswa");
    JButton tombolHapus = new JButton ("Hapus Mahasiswa");
    
    JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    
    String namaKolom[] = {"ID", "Nama", "NIM"};
    
    public ViewData(){
        table model = new DefaultTableModel(namaKolom, 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        
        setTitle("Daftar Mahasiswa");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(552, 540);
        
        add(header);
        add(tombolTambah);
        add(tombolEdit);
        add(tombolHapus);
    }
}
