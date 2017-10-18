/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stream.api.adapter.taksihelpers;

import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Azer F. Mehdiyev (Azar.mehdiyev@unibank.az)
 */
@XmlRootElement(name = "statusResponse")
@XmlAccessorType(XmlAccessType.NONE)
public class ResponsePayTaxi {
    @XmlElement
    ResponseStatus status;
    Map<String, String> map;
    
    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    
    public static void main(String[] args) throws PropertyException, JAXBException {
        JAXBContext jaxbcontext = JAXBContext.newInstance(ResponsePayTaxi.class);
        Marshaller jaxbMarshaller = jaxbcontext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ResponseStatus rs = new ResponseStatus("code", "message");
        ResponsePayTaxi rpt = new ResponsePayTaxi();
        rpt.setStatus(rs);
        jaxbMarshaller.marshal(rpt, System.out);
    }
    
}
