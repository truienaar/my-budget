
package be.vansichen.raf.mybudget.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monthly-planned-income" type="{}MonthlyPlannedIncome" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onetime-planned-income" type="{}OnetimePlannedIncome" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="monthly-planned-expense" type="{}MonthlyPlannedExpense" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onetime-planned-expence" type="{}OnetimePlannedExpence" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="year" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="account" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initial-balance" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetPlan", propOrder = {
    "monthlyPlannedIncome",
    "onetimePlannedIncome",
    "monthlyPlannedExpense",
    "onetimePlannedExpence"
})
public class BudgetPlan {

    @XmlElement(name = "monthly-planned-income")
    protected List<MonthlyPlannedIncome> monthlyPlannedIncome;
    @XmlElement(name = "onetime-planned-income")
    protected List<OnetimePlannedIncome> onetimePlannedIncome;
    @XmlElement(name = "monthly-planned-expense")
    protected List<MonthlyPlannedExpense> monthlyPlannedExpense;
    @XmlElement(name = "onetime-planned-expence")
    protected List<OnetimePlannedExpence> onetimePlannedExpence;
    @XmlAttribute(name = "year", required = true)
    protected short year;
    @XmlAttribute(name = "account", required = true)
    protected String account;
    @XmlAttribute(name = "initial-balance", required = true)
    protected float initialBalance;

    /**
     * Gets the value of the monthlyPlannedIncome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyPlannedIncome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyPlannedIncome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthlyPlannedIncome }
     * 
     * 
     */
    public List<MonthlyPlannedIncome> getMonthlyPlannedIncome() {
        if (monthlyPlannedIncome == null) {
            monthlyPlannedIncome = new ArrayList<MonthlyPlannedIncome>();
        }
        return this.monthlyPlannedIncome;
    }

    /**
     * Gets the value of the onetimePlannedIncome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onetimePlannedIncome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnetimePlannedIncome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnetimePlannedIncome }
     * 
     * 
     */
    public List<OnetimePlannedIncome> getOnetimePlannedIncome() {
        if (onetimePlannedIncome == null) {
            onetimePlannedIncome = new ArrayList<OnetimePlannedIncome>();
        }
        return this.onetimePlannedIncome;
    }

    /**
     * Gets the value of the monthlyPlannedExpense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyPlannedExpense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyPlannedExpense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthlyPlannedExpense }
     * 
     * 
     */
    public List<MonthlyPlannedExpense> getMonthlyPlannedExpense() {
        if (monthlyPlannedExpense == null) {
            monthlyPlannedExpense = new ArrayList<MonthlyPlannedExpense>();
        }
        return this.monthlyPlannedExpense;
    }

    /**
     * Gets the value of the onetimePlannedExpence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onetimePlannedExpence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnetimePlannedExpence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnetimePlannedExpence }
     * 
     * 
     */
    public List<OnetimePlannedExpence> getOnetimePlannedExpence() {
        if (onetimePlannedExpence == null) {
            onetimePlannedExpence = new ArrayList<OnetimePlannedExpence>();
        }
        return this.onetimePlannedExpence;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public short getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(short value) {
        this.year = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the initialBalance property.
     * 
     */
    public float getInitialBalance() {
        return initialBalance;
    }

    /**
     * Sets the value of the initialBalance property.
     * 
     */
    public void setInitialBalance(float value) {
        this.initialBalance = value;
    }

}
