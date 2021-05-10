package bg.infosys.daeu.ws.wsbg.regix.responses.tr.actualstate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import bg.infosys.daeu.ws.wsbg.regix.requests.tr.AddemptionOfTraderType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.AddressType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.CapitalAmountType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.DetailsType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.LegalFormType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.MandateType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.NKIDType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.NonMonetaryDepositsType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.SeatType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.SharesType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.StatusType;
import bg.infosys.daeu.ws.wsbg.regix.requests.tr.SubjectOfActivityType;


@XmlRootElement(name = "ActualStateResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualStateResponseType", namespace = "http://egov.bg/RegiX/AV/TR/ActualStateResponse", propOrder = {
    "status",
    "uic",
    "company",
    "legalForm",
    "transliteration",
    "seat",
    "seatForCorrespondence",
    "subjectOfActivity",
    "subjectOfActivityNKID",
    "wayOfManagement",
    "wayOfRepresentation",
    "termsOfPartnership",
    "termOfExisting",
    "specialConditions",
    "hiddenNonMonetaryDeposit",
    "sharePaymentResponsibility",
    "concededEstateValue",
    "cessationOfTrade",
    "addemptionOfTrader",
    "addemptionOfTraderSeatChange",
    "funds",
    "shares",
    "minimumAmount",
    "depositedFunds",
    "nonMonetaryDeposits",
    "buyBackDecision",
    "boardOfDirectorsMandate",
    "administrativeBoardMandate",
    "boardOfManagersMandate",
    "boardOfManagers2Mandate",
    "leadingBoardMandate",
    "supervisingBoardMandate",
    "supervisingBoard2Mandate",
    "controllingBoardMandate",
    "details",
    "dataValidForDate"
})
public class ActualStateResponseType {

    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "UIC")
    protected String uic;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "LegalForm")
    protected LegalFormType legalForm;
    @XmlElement(name = "Transliteration")
    protected String transliteration;
    @XmlElement(name = "Seat")
    protected SeatType seat;
    @XmlElement(name = "SeatForCorrespondence")
    protected AddressType seatForCorrespondence;
    @XmlElement(name = "SubjectOfActivity")
    protected SubjectOfActivityType subjectOfActivity;
    @XmlElement(name = "SubjectOfActivityNKID")
    protected NKIDType subjectOfActivityNKID;
    @XmlElement(name = "WayOfManagement")
    protected String wayOfManagement;
    @XmlElement(name = "WayOfRepresentation")
    protected String wayOfRepresentation;
    @XmlElement(name = "TermsOfPartnership")
    protected String termsOfPartnership;
    @XmlElement(name = "TermOfExisting")
    protected String termOfExisting;
    @XmlElement(name = "SpecialConditions")
    protected String specialConditions;
    @XmlElement(name = "HiddenNonMonetaryDeposit")
    protected String hiddenNonMonetaryDeposit;
    @XmlElement(name = "SharePaymentResponsibility")
    protected String sharePaymentResponsibility;
    @XmlElement(name = "ConcededEstateValue")
    protected String concededEstateValue;
    @XmlElement(name = "CessationOfTrade")
    protected String cessationOfTrade;
    @XmlElement(name = "AddemptionOfTrader")
    protected String addemptionOfTrader;
    @XmlElement(name = "AddemptionOfTraderSeatChange")
    protected AddemptionOfTraderType addemptionOfTraderSeatChange;
    @XmlElement(name = "Funds")
    protected CapitalAmountType funds;
    @XmlElement(name = "Shares")
    protected SharesType shares;
    @XmlElement(name = "MinimumAmount")
    protected CapitalAmountType minimumAmount;
    @XmlElement(name = "DepositedFunds")
    protected CapitalAmountType depositedFunds;
    @XmlElement(name = "NonMonetaryDeposits")
    protected NonMonetaryDepositsType nonMonetaryDeposits;
    @XmlElement(name = "BuyBackDecision")
    protected String buyBackDecision;
    @XmlElement(name = "BoardOfDirectorsMandate")
    protected MandateType boardOfDirectorsMandate;
    @XmlElement(name = "AdministrativeBoardMandate")
    protected MandateType administrativeBoardMandate;
    @XmlElement(name = "BoardOfManagersMandate")
    protected MandateType boardOfManagersMandate;
    @XmlElement(name = "BoardOfManagers2Mandate")
    protected MandateType boardOfManagers2Mandate;
    @XmlElement(name = "LeadingBoardMandate")
    protected MandateType leadingBoardMandate;
    @XmlElement(name = "SupervisingBoardMandate")
    protected MandateType supervisingBoardMandate;
    @XmlElement(name = "SupervisingBoard2Mandate")
    protected MandateType supervisingBoard2Mandate;
    @XmlElement(name = "ControllingBoardMandate")
    protected MandateType controllingBoardMandate;
    @XmlElement(name = "Details")
    protected DetailsType details;
    @XmlElement(name = "DataValidForDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataValidForDate;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the uic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIC() {
        return uic;
    }

    /**
     * Sets the value of the uic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIC(String value) {
        this.uic = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFormType }
     *     
     */
    public LegalFormType getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFormType }
     *     
     */
    public void setLegalForm(LegalFormType value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteration(String value) {
        this.transliteration = value;
    }

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     */
    public void setSeat(SeatType value) {
        this.seat = value;
    }

    /**
     * Gets the value of the seatForCorrespondence property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getSeatForCorrespondence() {
        return seatForCorrespondence;
    }

    /**
     * Sets the value of the seatForCorrespondence property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setSeatForCorrespondence(AddressType value) {
        this.seatForCorrespondence = value;
    }

    /**
     * Gets the value of the subjectOfActivity property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectOfActivityType }
     *     
     */
    public SubjectOfActivityType getSubjectOfActivity() {
        return subjectOfActivity;
    }

    /**
     * Sets the value of the subjectOfActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectOfActivityType }
     *     
     */
    public void setSubjectOfActivity(SubjectOfActivityType value) {
        this.subjectOfActivity = value;
    }

    /**
     * Gets the value of the subjectOfActivityNKID property.
     * 
     * @return
     *     possible object is
     *     {@link NKIDType }
     *     
     */
    public NKIDType getSubjectOfActivityNKID() {
        return subjectOfActivityNKID;
    }

    /**
     * Sets the value of the subjectOfActivityNKID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NKIDType }
     *     
     */
    public void setSubjectOfActivityNKID(NKIDType value) {
        this.subjectOfActivityNKID = value;
    }

    /**
     * Gets the value of the wayOfManagement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayOfManagement() {
        return wayOfManagement;
    }

    /**
     * Sets the value of the wayOfManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayOfManagement(String value) {
        this.wayOfManagement = value;
    }

    /**
     * Gets the value of the wayOfRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayOfRepresentation() {
        return wayOfRepresentation;
    }

    /**
     * Sets the value of the wayOfRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayOfRepresentation(String value) {
        this.wayOfRepresentation = value;
    }

    /**
     * Gets the value of the termsOfPartnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfPartnership() {
        return termsOfPartnership;
    }

    /**
     * Sets the value of the termsOfPartnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfPartnership(String value) {
        this.termsOfPartnership = value;
    }

    /**
     * Gets the value of the termOfExisting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermOfExisting() {
        return termOfExisting;
    }

    /**
     * Sets the value of the termOfExisting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermOfExisting(String value) {
        this.termOfExisting = value;
    }

    /**
     * Gets the value of the specialConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialConditions() {
        return specialConditions;
    }

    /**
     * Sets the value of the specialConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialConditions(String value) {
        this.specialConditions = value;
    }

    /**
     * Gets the value of the hiddenNonMonetaryDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenNonMonetaryDeposit() {
        return hiddenNonMonetaryDeposit;
    }

    /**
     * Sets the value of the hiddenNonMonetaryDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenNonMonetaryDeposit(String value) {
        this.hiddenNonMonetaryDeposit = value;
    }

    /**
     * Gets the value of the sharePaymentResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePaymentResponsibility() {
        return sharePaymentResponsibility;
    }

    /**
     * Sets the value of the sharePaymentResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePaymentResponsibility(String value) {
        this.sharePaymentResponsibility = value;
    }

    /**
     * Gets the value of the concededEstateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcededEstateValue() {
        return concededEstateValue;
    }

    /**
     * Sets the value of the concededEstateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcededEstateValue(String value) {
        this.concededEstateValue = value;
    }

    /**
     * Gets the value of the cessationOfTrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCessationOfTrade() {
        return cessationOfTrade;
    }

    /**
     * Sets the value of the cessationOfTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCessationOfTrade(String value) {
        this.cessationOfTrade = value;
    }

    /**
     * Gets the value of the addemptionOfTrader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddemptionOfTrader() {
        return addemptionOfTrader;
    }

    /**
     * Sets the value of the addemptionOfTrader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddemptionOfTrader(String value) {
        this.addemptionOfTrader = value;
    }

    /**
     * Gets the value of the addemptionOfTraderSeatChange property.
     * 
     * @return
     *     possible object is
     *     {@link AddemptionOfTraderType }
     *     
     */
    public AddemptionOfTraderType getAddemptionOfTraderSeatChange() {
        return addemptionOfTraderSeatChange;
    }

    /**
     * Sets the value of the addemptionOfTraderSeatChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddemptionOfTraderType }
     *     
     */
    public void setAddemptionOfTraderSeatChange(AddemptionOfTraderType value) {
        this.addemptionOfTraderSeatChange = value;
    }

    /**
     * Gets the value of the funds property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalAmountType }
     *     
     */
    public CapitalAmountType getFunds() {
        return funds;
    }

    /**
     * Sets the value of the funds property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalAmountType }
     *     
     */
    public void setFunds(CapitalAmountType value) {
        this.funds = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link SharesType }
     *     
     */
    public SharesType getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesType }
     *     
     */
    public void setShares(SharesType value) {
        this.shares = value;
    }

    /**
     * Gets the value of the minimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalAmountType }
     *     
     */
    public CapitalAmountType getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalAmountType }
     *     
     */
    public void setMinimumAmount(CapitalAmountType value) {
        this.minimumAmount = value;
    }

    /**
     * Gets the value of the depositedFunds property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalAmountType }
     *     
     */
    public CapitalAmountType getDepositedFunds() {
        return depositedFunds;
    }

    /**
     * Sets the value of the depositedFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalAmountType }
     *     
     */
    public void setDepositedFunds(CapitalAmountType value) {
        this.depositedFunds = value;
    }

    /**
     * Gets the value of the nonMonetaryDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link NonMonetaryDepositsType }
     *     
     */
    public NonMonetaryDepositsType getNonMonetaryDeposits() {
        return nonMonetaryDeposits;
    }

    /**
     * Sets the value of the nonMonetaryDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonMonetaryDepositsType }
     *     
     */
    public void setNonMonetaryDeposits(NonMonetaryDepositsType value) {
        this.nonMonetaryDeposits = value;
    }

    /**
     * Gets the value of the buyBackDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyBackDecision() {
        return buyBackDecision;
    }

    /**
     * Sets the value of the buyBackDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyBackDecision(String value) {
        this.buyBackDecision = value;
    }

    /**
     * Gets the value of the boardOfDirectorsMandate property.
     * 
     * @return
     *     possible object is
     *     {@link MandateType }
     *     
     */
    public MandateType getBoardOfDirectorsMandate() {
        return boardOfDirectorsMandate;
    }

    /**
     * Sets the value of the boardOfDirectorsMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateType }
     *     
     */
    public void setBoardOfDirectorsMandate(MandateType value) {
        this.boardOfDirectorsMandate = value;
    }

    /**
     * Gets the value of the administrativeBoardMandate property.
     * 
     * @return
     *     possible object is
     *     {@link MandateType }
     *     
     */
    public MandateType getAdministrativeBoardMandate() {
        return administrativeBoardMandate;
    }

    /**
     * Sets the value of the administrativeBoardMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateType }
     *     
     */
    public void setAdministrativeBoardMandate(MandateType value) {
        this.administrativeBoardMandate = value;
    }

    /**
     * Gets the value of the boardOfManagersMandate property.
     * 
     * @return
     *     possible object is
     *     {@link MandateType }
     *     
     */
    public MandateType getBoardOfManagersMandate() {
        return boardOfManagersMandate;
    }

    /**
     * Sets the value of the boardOfManagersMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateType }
     *     
     */
    public void setBoardOfManagersMandate(MandateType value) {
        this.boardOfManagersMandate = value;
    }

    /**
     * Gets the value of the boardOfManagers2Mandate property.
     * 
     * @return
     *     possible object is
     *     {@link MandateType }
     *     
     */
    public MandateType getBoardOfManagers2Mandate() {
        return boardOfManagers2Mandate;
    }

    /**
     * Sets the value of the boardOfManagers2Mandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateType }
     *     
     */
    public void setBoardOfManagers2Mandate(MandateType value) {
        this.boardOfManagers2Mandate = value;
    }

    /**
     * Gets the value of the leadingBoardMandate property.
     * 
     * @return
     *     possible object is
     *     {@link MandateType }
     *     
     */
    public MandateType getLeadingBoardMandate() {
        return leadingBoardMandate;
    }

    /**
     * Sets the value of the leadingBoardMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateType }
     *     
     */
    public void setLeadingBoardMandate(MandateType value) {
        this.leadingBoardMandate = value;
    }

    /**
     * Gets the value of the supervisingBoardMandate property.
     * 
     * @return
     *     possible object is
     *     {@link MandateType }
     *     
     */
    public MandateType getSupervisingBoardMandate() {
        return supervisingBoardMandate;
    }

    /**
     * Sets the value of the supervisingBoardMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateType }
     *     
     */
    public void setSupervisingBoardMandate(MandateType value) {
        this.supervisingBoardMandate = value;
    }

    /**
     * Gets the value of the supervisingBoard2Mandate property.
     * 
     * @return
     *     possible object is
     *     {@link MandateType }
     *     
     */
    public MandateType getSupervisingBoard2Mandate() {
        return supervisingBoard2Mandate;
    }

    /**
     * Sets the value of the supervisingBoard2Mandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateType }
     *     
     */
    public void setSupervisingBoard2Mandate(MandateType value) {
        this.supervisingBoard2Mandate = value;
    }

    /**
     * Gets the value of the controllingBoardMandate property.
     * 
     * @return
     *     possible object is
     *     {@link MandateType }
     *     
     */
    public MandateType getControllingBoardMandate() {
        return controllingBoardMandate;
    }

    /**
     * Sets the value of the controllingBoardMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateType }
     *     
     */
    public void setControllingBoardMandate(MandateType value) {
        this.controllingBoardMandate = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link DetailsType }
     *     
     */
    public DetailsType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailsType }
     *     
     */
    public void setDetails(DetailsType value) {
        this.details = value;
    }

    /**
     * Gets the value of the dataValidForDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidForDate() {
        return dataValidForDate;
    }

    /**
     * Sets the value of the dataValidForDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidForDate(XMLGregorianCalendar value) {
        this.dataValidForDate = value;
    }

}