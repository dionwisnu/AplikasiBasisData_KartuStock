package com.barang;

import com.kategoriBarang.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dalvins
 */
public class BarangTableModel extends AbstractTableModel {

    private List<Barang> kategoris = new ArrayList<Barang>();

    public BarangTableModel(List<Barang> kategoris) {
        this.kategoris = kategoris;
    }

    public void deleteKategori(int row) {
        kategoris.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateKategori(int row, Barang kategori) {
        kategoris.set(row, kategori);
        fireTableRowsUpdated(row, row);
    }

    public void addKategori(Barang kategori) {
        kategoris.add(kategori);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    public int getRowCount() {
        return kategoris.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Barang b = kategoris.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getKodeBarang();
            case 1:
                return b.getNamaBarang();
            case 2:
                return b.getRitelSetelahPpn();
            case 3:
                return b.getBeliSetelahPpn();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE KATEGORI";
            case 1:
                return "NAMA KATEGORI";
            case 2:
                return "HARGA JUAL";
            case 3:
                return "HARGA BELI";
            default:
                return "";
        }
    }
}
