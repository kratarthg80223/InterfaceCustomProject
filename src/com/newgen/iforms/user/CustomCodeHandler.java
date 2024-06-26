package com.newgen.iforms.user;

import com.newgen.commonlogger.NGUtil;
import java.util.Locale;
import java.io.File;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import com.newgen.iforms.EControl;
import com.newgen.iforms.custom.IFormReference;
import com.newgen.iforms.FormDef;
import com.newgen.iforms.custom.IFormServerEventHandler;
import com.newgen.iforms.custom.IFormCustomHooks;
import com.newgen.webclientcodebase.model.WorkdeskModel;
import org.json.simple.JSONArray;

public class CustomCodeHandler extends IFormCustomHooks implements IFormServerEventHandler
{    
    @Override
    public void beforeFormLoad(final FormDef arg0, final IFormReference arg1) {
        // Code here will get executed on opening of form and application
        
    }
    
    @Override
    public String executeCustomService(final FormDef arg0, final IFormReference arg1, final String arg2, final String arg3, final String arg4) {
        return null;
    }
    
    @Override
    public JSONArray executeEvent(final FormDef arg0, final IFormReference arg1, final String arg2, final String arg3) {
        return null;
    }
    
    @Override
    public String generateHTML(final EControl arg0) {
        return null;
    }
    
    @Override
    public String getCustomFilterXML(final FormDef arg0, final IFormReference arg1, final String arg2) {
        return null;
    }
    
    @Override
    public boolean introduceWorkItemInSpecificProcess(final IFormReference arg0, final String arg1) {
        return false;
    }
    
    @Override
    public String introduceWorkItemInWorkFlow(final IFormReference arg0, final HttpServletRequest arg1, final HttpServletResponse arg2) {
        return null;
    }
    
    @Override
    public String introduceWorkItemInWorkFlow(final IFormReference arg0, final HttpServletRequest arg1, final HttpServletResponse arg2, final WorkdeskModel arg3) {
        return null;
    }
    
    @Override
    public String onChangeEventServerSide(final IFormReference arg0, final String arg1) {
        return null;
    }
    
    @Override
    public String postHookExportToPDF(final IFormReference arg0, final File arg1) {
        return null;
    }
    
    @Override
    public void postHookOnDocumentUpload(final IFormReference arg0, final String arg1, final String arg2, final File arg3, final int arg4) {
        
    }
    
    public void postHookOnDocumentUpload(final IFormReference arg0, final String arg1, final String arg2, final int arg3, final int arg4) {
        
    }
    
    @Override
    public String setMaskedValue(final String arg0, final String arg1) {
        return arg1;
    }
    
    @Override
    public void updateDataInWidget(final IFormReference arg0, final String arg1) {
        
    }
    
    @Override
    public String validateDocumentConfiguration(final String arg0, final String arg1, final File arg2, final Locale arg3) {
        
        return "";
    }
    
    @Override
    public JSONArray validateSubmittedForm(final FormDef arg0, final IFormReference arg1, final String arg2) {
        
        return null;
    }
    
    @Override
    public String executeServerEvent(IFormReference ifr, String eventOriginator, String eventType, String eventData) {
        NGUtil.writeConsoleLog("", "InterfaceViewer", "executeServerEvent triggered..");
        return "";
    }
    
   
    @Override
    public void postHookOnDocumentOperations(IFormReference objReference, String controlId, String docType, int docImageIndex, String operationType) {

    }

    @Override
    public String getUserNameInPortal(final IFormReference arg1) {
        // Code here will get executed on opening of form and application
        return "";
    }
    
}