/*
 * Generated by JasperReports - 05/11/14 23:29
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;

import net.sf.jasperreports.engine.*;
import java.util.*;
import net.sf.jasperreports.engine.data.*;


/**
 *
 */
public class Laporan_1415204954550_478306 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_REPORT_TIME_ZONE = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_URL_HANDLER_FACTORY = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillField field_SATUAN = null;
    private JRFillField field_JUMLAH_MIN = null;
    private JRFillField field_KODE_BARANG = null;
    private JRFillField field_JUMLAH_MAX = null;
    private JRFillField field_RITEL_SEBELUM_PPN = null;
    private JRFillField field_KATEGORI = null;
    private JRFillField field_BELI_SEBELUM_PPN = null;
    private JRFillField field_RITEL_SETELAH_PPN = null;
    private JRFillField field_BELI_SETELAH_PPN = null;
    private JRFillField field_NAMA_BARANG = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;


    /**
     *
     */
    public void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    private void initParams(Map pm)
    {
        parameter_IS_IGNORE_PAGINATION = (JRFillParameter)pm.get("IS_IGNORE_PAGINATION");
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_REPORT_PARAMETERS_MAP = (JRFillParameter)pm.get("REPORT_PARAMETERS_MAP");
        parameter_REPORT_RESOURCE_BUNDLE = (JRFillParameter)pm.get("REPORT_RESOURCE_BUNDLE");
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_REPORT_DATA_SOURCE = (JRFillParameter)pm.get("REPORT_DATA_SOURCE");
        parameter_REPORT_TIME_ZONE = (JRFillParameter)pm.get("REPORT_TIME_ZONE");
        parameter_REPORT_CLASS_LOADER = (JRFillParameter)pm.get("REPORT_CLASS_LOADER");
        parameter_REPORT_URL_HANDLER_FACTORY = (JRFillParameter)pm.get("REPORT_URL_HANDLER_FACTORY");
        parameter_REPORT_VIRTUALIZER = (JRFillParameter)pm.get("REPORT_VIRTUALIZER");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
        parameter_REPORT_SCRIPTLET = (JRFillParameter)pm.get("REPORT_SCRIPTLET");
    }


    /**
     *
     */
    private void initFields(Map fm)
    {
        field_SATUAN = (JRFillField)fm.get("SATUAN");
        field_JUMLAH_MIN = (JRFillField)fm.get("JUMLAH_MIN");
        field_KODE_BARANG = (JRFillField)fm.get("KODE_BARANG");
        field_JUMLAH_MAX = (JRFillField)fm.get("JUMLAH_MAX");
        field_RITEL_SEBELUM_PPN = (JRFillField)fm.get("RITEL_SEBELUM_PPN");
        field_KATEGORI = (JRFillField)fm.get("KATEGORI");
        field_BELI_SEBELUM_PPN = (JRFillField)fm.get("BELI_SEBELUM_PPN");
        field_RITEL_SETELAH_PPN = (JRFillField)fm.get("RITEL_SETELAH_PPN");
        field_BELI_SETELAH_PPN = (JRFillField)fm.get("BELI_SETELAH_PPN");
        field_NAMA_BARANG = (JRFillField)fm.get("NAMA_BARANG");
    }


    /**
     *
     */
    private void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
        variable_COLUMN_NUMBER = (JRFillVariable)vm.get("COLUMN_NUMBER");
        variable_REPORT_COUNT = (JRFillVariable)vm.get("REPORT_COUNT");
        variable_PAGE_COUNT = (JRFillVariable)vm.get("PAGE_COUNT");
        variable_COLUMN_COUNT = (JRFillVariable)vm.get("COLUMN_COUNT");
    }


    /**
     *
     */
    public Object evaluate(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 8 : 
            {
                value = (java.lang.String)(((java.lang.String)field_KODE_BARANG.getValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)(((java.lang.String)field_NAMA_BARANG.getValue()));
                break;
            }
            case 10 : 
            {
                value = (java.lang.Boolean)(((java.lang.String)field_RITEL_SETELAH_PPN.getValue()));
                break;
            }
            case 11 : 
            {
                value = (java.lang.String)(((java.lang.String)field_RITEL_SETELAH_PPN.getValue()));
                break;
            }
            case 12 : 
            {
                value = (java.lang.Boolean)(((java.lang.String)field_BELI_SETELAH_PPN.getValue()));
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)(((java.lang.String)field_BELI_SETELAH_PPN.getValue()));
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateOld(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 8 : 
            {
                value = (java.lang.String)(((java.lang.String)field_KODE_BARANG.getOldValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)(((java.lang.String)field_NAMA_BARANG.getOldValue()));
                break;
            }
            case 10 : 
            {
                value = (java.lang.Boolean)(((java.lang.String)field_RITEL_SETELAH_PPN.getOldValue()));
                break;
            }
            case 11 : 
            {
                value = (java.lang.String)(((java.lang.String)field_RITEL_SETELAH_PPN.getOldValue()));
                break;
            }
            case 12 : 
            {
                value = (java.lang.Boolean)(((java.lang.String)field_BELI_SETELAH_PPN.getOldValue()));
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)(((java.lang.String)field_BELI_SETELAH_PPN.getOldValue()));
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateEstimated(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 8 : 
            {
                value = (java.lang.String)(((java.lang.String)field_KODE_BARANG.getValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)(((java.lang.String)field_NAMA_BARANG.getValue()));
                break;
            }
            case 10 : 
            {
                value = (java.lang.Boolean)(((java.lang.String)field_RITEL_SETELAH_PPN.getValue()));
                break;
            }
            case 11 : 
            {
                value = (java.lang.String)(((java.lang.String)field_RITEL_SETELAH_PPN.getValue()));
                break;
            }
            case 12 : 
            {
                value = (java.lang.Boolean)(((java.lang.String)field_BELI_SETELAH_PPN.getValue()));
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)(((java.lang.String)field_BELI_SETELAH_PPN.getValue()));
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}
