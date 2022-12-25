
package calculadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculadora package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Divide_QNAME = new QName("http://calculadora/", "divide");
    private final static QName _DivideResponse_QNAME = new QName("http://calculadora/", "divideResponse");
    private final static QName _Multiplica_QNAME = new QName("http://calculadora/", "multiplica");
    private final static QName _MultiplicaResponse_QNAME = new QName("http://calculadora/", "multiplicaResponse");
    private final static QName _Soma_QNAME = new QName("http://calculadora/", "soma");
    private final static QName _SomaResponse_QNAME = new QName("http://calculadora/", "somaResponse");
    private final static QName _Subtrai_QNAME = new QName("http://calculadora/", "subtrai");
    private final static QName _SubtraiResponse_QNAME = new QName("http://calculadora/", "subtraiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link Multiplica }
     * 
     */
    public Multiplica createMultiplica() {
        return new Multiplica();
    }

    /**
     * Create an instance of {@link MultiplicaResponse }
     * 
     */
    public MultiplicaResponse createMultiplicaResponse() {
        return new MultiplicaResponse();
    }

    /**
     * Create an instance of {@link Soma }
     * 
     */
    public Soma createSoma() {
        return new Soma();
    }

    /**
     * Create an instance of {@link SomaResponse }
     * 
     */
    public SomaResponse createSomaResponse() {
        return new SomaResponse();
    }

    /**
     * Create an instance of {@link Subtrai }
     * 
     */
    public Subtrai createSubtrai() {
        return new Subtrai();
    }

    /**
     * Create an instance of {@link SubtraiResponse }
     * 
     */
    public SubtraiResponse createSubtraiResponse() {
        return new SubtraiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplica }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora/", name = "multiplica")
    public JAXBElement<Multiplica> createMultiplica(Multiplica value) {
        return new JAXBElement<Multiplica>(_Multiplica_QNAME, Multiplica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora/", name = "multiplicaResponse")
    public JAXBElement<MultiplicaResponse> createMultiplicaResponse(MultiplicaResponse value) {
        return new JAXBElement<MultiplicaResponse>(_MultiplicaResponse_QNAME, MultiplicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soma }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora/", name = "soma")
    public JAXBElement<Soma> createSoma(Soma value) {
        return new JAXBElement<Soma>(_Soma_QNAME, Soma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SomaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora/", name = "somaResponse")
    public JAXBElement<SomaResponse> createSomaResponse(SomaResponse value) {
        return new JAXBElement<SomaResponse>(_SomaResponse_QNAME, SomaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtrai }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Subtrai }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora/", name = "subtrai")
    public JAXBElement<Subtrai> createSubtrai(Subtrai value) {
        return new JAXBElement<Subtrai>(_Subtrai_QNAME, Subtrai.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtraiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubtraiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora/", name = "subtraiResponse")
    public JAXBElement<SubtraiResponse> createSubtraiResponse(SubtraiResponse value) {
        return new JAXBElement<SubtraiResponse>(_SubtraiResponse_QNAME, SubtraiResponse.class, null, value);
    }

}
