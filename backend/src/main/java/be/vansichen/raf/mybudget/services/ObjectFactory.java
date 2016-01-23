
package be.vansichen.raf.mybudget.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.vansichen.raf.mybudget.services package. 
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

    private final static QName _BudgetPlan_QNAME = new QName("", "budget-plan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.vansichen.raf.mybudget.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BudgetPlan }
     * 
     */
    public BudgetPlan createBudgetPlan() {
        return new BudgetPlan();
    }

    /**
     * Create an instance of {@link OnetimePlannedExpence }
     * 
     */
    public OnetimePlannedExpence createOnetimePlannedExpence() {
        return new OnetimePlannedExpence();
    }

    /**
     * Create an instance of {@link MonthlyPlannedIncome }
     * 
     */
    public MonthlyPlannedIncome createMonthlyPlannedIncome() {
        return new MonthlyPlannedIncome();
    }

    /**
     * Create an instance of {@link MonthlyPlannedExpense }
     * 
     */
    public MonthlyPlannedExpense createMonthlyPlannedExpense() {
        return new MonthlyPlannedExpense();
    }

    /**
     * Create an instance of {@link OnetimePlannedIncome }
     * 
     */
    public OnetimePlannedIncome createOnetimePlannedIncome() {
        return new OnetimePlannedIncome();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "budget-plan")
    public JAXBElement<BudgetPlan> createBudgetPlan(BudgetPlan value) {
        return new JAXBElement<BudgetPlan>(_BudgetPlan_QNAME, BudgetPlan.class, null, value);
    }

}
