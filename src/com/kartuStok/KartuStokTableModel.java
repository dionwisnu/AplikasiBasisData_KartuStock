/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kartuStok;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dion Wisnu
 */
public class KartuStokTableModel extends AbstractTableModel {
    private List<KartuStok> ks = new ArrayList<KartuStok>();

    public KartuStokTableModel(List<KartuStok> kartustok) {
        this.ks = kartustok;
    }

    
    
    public void deleteKartuStok(int row) {
        ks.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateKartuStock(int row, KartuStok kartustok) {
        ks.set(row, kartustok);
        fireTableRowsUpdated(row, row);
    }

    public void addKartuStock(KartuStok kartustok) {
        ks.add(kartustok);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    public int getRowCount() {
        return ks.size();
    }

    public int getColumnCount() {
        return 6;
    }
    

    public Object getValueAt(int rowIndex, int columnIndex) {
        KartuStok kartu = ks.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return kartu.getTanggal();
            case 1:
                return kartu.getNoBukti();
            case 2:
                return kartu.getKeterangan();
            case 3:
                return kartu.getMasuk();
            case 4:
                return kartu.getKeluar();
            case 5:
                return kartu.getSaldo();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "TANGGAL";
            case 1:
                return "NO BUKTI";
            case 2:
                return "KETERANGAN";
            case 3:
                return "MASUK";
            case 4:
                return "KELUAR";
            case 5:
                return "SALDO";
            default:
                return "";
        }
    }
}
