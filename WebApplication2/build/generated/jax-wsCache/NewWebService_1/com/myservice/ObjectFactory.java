
package com.myservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.myservice package. 
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

    private final static QName _Email_QNAME = new QName("http://myservice.com/", "email");
    private final static QName _EmailResponse_QNAME = new QName("http://myservice.com/", "emailResponse");
    private final static QName _First_QNAME = new QName("http://myservice.com/", "first");
    private final static QName _FirstResponse_QNAME = new QName("http://myservice.com/", "firstResponse");
    private final static QName _Last_QNAME = new QName("http://myservice.com/", "last");
    private final static QName _LastResponse_QNAME = new QName("http://myservice.com/", "lastResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link EmailResponse }
     * 
     */
    public EmailResponse createEmailResponse() {
        return new EmailResponse();
    }

    /**
     * Create an instance of {@link First }
     * 
     */
    public First createFirst() {
        return new First();
    }

    /**
     * Create an instance of {@link FirstResponse }
     * 
     */
    public FirstResponse createFirstResponse() {
        return new FirstResponse();
    }

    /**
     * Create an instance of {@link Last }
     * 
     */
    public Last createLast() {
        return new Last();
    }

    /**
     * Create an instance of {@link LastResponse }
     * 
     */
    public LastResponse createLastResponse() {
        return new LastResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Email }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "email")
    public JAXBElement<Email> createEmail(Email value) {
        return new JAXBElement<Email>(_Email_QNAME, Email.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "emailResponse")
    public JAXBElement<EmailResponse> createEmailResponse(EmailResponse value) {
        return new JAXBElement<EmailResponse>(_EmailResponse_QNAME, EmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link First }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "first")
    public JAXBElement<First> createFirst(First value) {
        return new JAXBElement<First>(_First_QNAME, First.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "firstResponse")
    public JAXBElement<FirstResponse> createFirstResponse(FirstResponse value) {
        return new JAXBElement<FirstResponse>(_FirstResponse_QNAME, FirstResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Last }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "last")
    public JAXBElement<Last> createLast(Last value) {
        return new JAXBElement<Last>(_Last_QNAME, Last.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "lastResponse")
    public JAXBElement<LastResponse> createLastResponse(LastResponse value) {
        return new JAXBElement<LastResponse>(_LastResponse_QNAME, LastResponse.class, null, value);
    }

}
