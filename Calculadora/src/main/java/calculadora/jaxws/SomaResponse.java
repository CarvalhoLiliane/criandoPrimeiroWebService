
package calculadora.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.4.4
 * Fri Dec 23 22:17:20 BRT 2022
 * Generated source version: 3.4.4
 */

@XmlRootElement(name = "somaResponse", namespace = "http://calculadora/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somaResponse", namespace = "http://calculadora/")

public class SomaResponse {

    @XmlElement(name = "return")
    private java.lang.Double _return;

    public java.lang.Double getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.Double new_return)  {
        this._return = new_return;
    }

}

