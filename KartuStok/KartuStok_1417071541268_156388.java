/*
 * Generated by JasperReports - 27/11/14 13:59
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
public class KartuStok_1417071541268_156388 extends JREvaluator
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
    private JRFillField field_NO32BUKTI = null;
    private JRFillField field_SALDO = null;
    private JRFillField field_KETERANGAN = null;
    private JRFillField field_TANGGAL = null;
    private JRFillField field_MASUK = null;
    private JRFillField field_KELUAR = null;
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
        field_NO32BUKTI = (JRFillField)fm.get("NO BUKTI");
        field_SALDO = (JRFillField)fm.get("SALDO");
        field_KETERANGAN = (JRFillField)fm.get("KETERANGAN");
        field_TANGGAL = (JRFillField)fm.get("TANGGAL");
        field_MASUK = (JRFillField)fm.get("MASUK");
        field_KELUAR = (JRFillField)fm.get("KELUAR");
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
                value = (java.lang.String)(((java.lang.String)field_TANGGAL.getValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)(((java.lang.String)field_NO32BUKTI.getValue()));
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(((java.lang.String)field_KETERANGAN.getValue()));
                break;
            }
            case 11 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_MASUK.getValue()));
                break;
            }
            case 12 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_KELUAR.getValue()));
                break;
            }
            case 13 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_SALDO.getValue()));
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
                value = (java.lang.String)(((java.lang.String)field_TANGGAL.getOldValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)(((java.lang.String)field_NO32BUKTI.getOldValue()));
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(((java.lang.String)field_KETERANGAN.getOldValue()));
                break;
            }
            case 11 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_MASUK.getOldValue()));
                break;
            }
            case 12 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_KELUAR.getOldValue()));
                break;
            }
            case 13 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_SALDO.getOldValue()));
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
                value = (java.lang.String)(((java.lang.String)field_TANGGAL.getValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)(((java.lang.String)field_NO32BUKTI.getValue()));
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(((java.lang.String)field_KETERANGAN.getValue()));
                break;
            }
            case 11 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_MASUK.getValue()));
                break;
            }
            case 12 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_KELUAR.getValue()));
                break;
            }
            case 13 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_SALDO.getValue()));
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}
