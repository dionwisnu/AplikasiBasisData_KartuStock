package com.kategoriBarang;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dion Wisnu
 */
public class KategoriTableModel extends AbstractTableModel {

    private List<KategoriBarang> kategoris = new ArrayList<KategoriBarang>();

    public KategoriTableModel(List<KategoriBarang> kategoris) {
        this.kategoris = kategoris;
    }

    public void deleteKategori(int row) {
        kategoris.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateKategori(int row, KategoriBarang kategori) {
        kategoris.set(row, kategori);
        fireTableRowsUpdated(row, row);
    }

    public void addKategori(KategoriBarang kategori) {
        kategoris.add(kategori);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    public int getRowCount() {
        return kategoris.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        KategoriBarang b = kategoris.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getKodeKategori();
            case 1:
                return b.getNamaKategori();
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
            default:
                return "";
        }
    }
}
