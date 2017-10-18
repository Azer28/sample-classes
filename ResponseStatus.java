/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stream.api.adapter.taksihelpers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Azer F. Mehdiyev (Azar.mehdiyev@unibank.az)
 */
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ResponseStatus {
    
    private String code;
    private String message;
    
//    public static class ResponseStatusBuilder {
//        
//        private
//        public ResponseStatusBuilder code(String code) {
//            return this;
//        }
//    }
    
    public ResponseStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public ResponseStatus() {
        
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
