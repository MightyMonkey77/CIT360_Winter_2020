/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360acp;

import java.util.HashMap;

/**
 *
 * @author azhra
 */
public class controller {
    
    HashMap<String,handler> handlerMap = new HashMap();
    
    public void handleRequest(String command, Object data) {
        handler miscHandler = handlerMap.get(command);
        if(miscHandler !=null) {
            miscHandler.handleIt(data);
        }
    }
    
    public void addCommand(String newCommand, handler newHandler) {
        handlerMap.put(newCommand, newHandler);
    }
}
