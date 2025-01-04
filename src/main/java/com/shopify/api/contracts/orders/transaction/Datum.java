
package com.shopify.api.contracts.orders.transaction;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "object",
    "amount",
    "application_fee",
    "balance_transaction",
    "captured",
    "created",
    "currency",
    "failure_code",
    "failure_message",
    "fraud_details",
    "livemode",
    "metadata",
    "outcome",
    "paid",
    "payment_intent",
    "payment_method",
    "payment_method_details",
    "refunded",
    "source",
    "status"
})
public class Datum implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("object")
    private String object;
    @JsonProperty("amount")
    private long amount;
    @JsonProperty("application_fee")
    private Object applicationFee;
    @JsonProperty("balance_transaction")
    private Object balanceTransaction;
    @JsonProperty("captured")
    private boolean captured;
    @JsonProperty("created")
    private long created;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("failure_code")
    private Object failureCode;
    @JsonProperty("failure_message")
    private Object failureMessage;
    @JsonProperty("fraud_details")
    private FraudDetails fraudDetails;
    @JsonProperty("livemode")
    private boolean livemode;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("outcome")
    private Outcome outcome;
    @JsonProperty("paid")
    private boolean paid;
    @JsonProperty("payment_intent")
    private String paymentIntent;
    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("payment_method_details")
    private PaymentMethodDetails paymentMethodDetails;
    @JsonProperty("refunded")
    private boolean refunded;
    @JsonProperty("source")
    private Object source;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8614844834196073518L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param balanceTransaction
     * @param status
     * @param applicationFee
     * @param failureMessage
     * @param captured
     * @param object
     * @param outcome
     * @param paymentMethodDetails
     * @param currency
     * @param id
     * @param amount
     * @param fraudDetails
     * @param paid
     * @param refunded
     * @param source
     * @param created
     * @param paymentIntent
     * @param livemode
     * @param failureCode
     * @param paymentMethod
     * @param metadata
     */
    public Datum(String id, String object, long amount, Object applicationFee, Object balanceTransaction, boolean captured, long created, String currency, Object failureCode, Object failureMessage, FraudDetails fraudDetails, boolean livemode, Metadata metadata, Outcome outcome, boolean paid, String paymentIntent, String paymentMethod, PaymentMethodDetails paymentMethodDetails, boolean refunded, Object source, String status) {
        super();
        this.id = id;
        this.object = object;
        this.amount = amount;
        this.applicationFee = applicationFee;
        this.balanceTransaction = balanceTransaction;
        this.captured = captured;
        this.created = created;
        this.currency = currency;
        this.failureCode = failureCode;
        this.failureMessage = failureMessage;
        this.fraudDetails = fraudDetails;
        this.livemode = livemode;
        this.metadata = metadata;
        this.outcome = outcome;
        this.paid = paid;
        this.paymentIntent = paymentIntent;
        this.paymentMethod = paymentMethod;
        this.paymentMethodDetails = paymentMethodDetails;
        this.refunded = refunded;
        this.source = source;
        this.status = status;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Datum withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    public Datum withObject(String object) {
        this.object = object;
        return this;
    }

    @JsonProperty("amount")
    public long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Datum withAmount(long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("application_fee")
    public Object getApplicationFee() {
        return applicationFee;
    }

    @JsonProperty("application_fee")
    public void setApplicationFee(Object applicationFee) {
        this.applicationFee = applicationFee;
    }

    public Datum withApplicationFee(Object applicationFee) {
        this.applicationFee = applicationFee;
        return this;
    }

    @JsonProperty("balance_transaction")
    public Object getBalanceTransaction() {
        return balanceTransaction;
    }

    @JsonProperty("balance_transaction")
    public void setBalanceTransaction(Object balanceTransaction) {
        this.balanceTransaction = balanceTransaction;
    }

    public Datum withBalanceTransaction(Object balanceTransaction) {
        this.balanceTransaction = balanceTransaction;
        return this;
    }

    @JsonProperty("captured")
    public boolean isCaptured() {
        return captured;
    }

    @JsonProperty("captured")
    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    public Datum withCaptured(boolean captured) {
        this.captured = captured;
        return this;
    }

    @JsonProperty("created")
    public long getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(long created) {
        this.created = created;
    }

    public Datum withCreated(long created) {
        this.created = created;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Datum withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("failure_code")
    public Object getFailureCode() {
        return failureCode;
    }

    @JsonProperty("failure_code")
    public void setFailureCode(Object failureCode) {
        this.failureCode = failureCode;
    }

    public Datum withFailureCode(Object failureCode) {
        this.failureCode = failureCode;
        return this;
    }

    @JsonProperty("failure_message")
    public Object getFailureMessage() {
        return failureMessage;
    }

    @JsonProperty("failure_message")
    public void setFailureMessage(Object failureMessage) {
        this.failureMessage = failureMessage;
    }

    public Datum withFailureMessage(Object failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    @JsonProperty("fraud_details")
    public FraudDetails getFraudDetails() {
        return fraudDetails;
    }

    @JsonProperty("fraud_details")
    public void setFraudDetails(FraudDetails fraudDetails) {
        this.fraudDetails = fraudDetails;
    }

    public Datum withFraudDetails(FraudDetails fraudDetails) {
        this.fraudDetails = fraudDetails;
        return this;
    }

    @JsonProperty("livemode")
    public boolean isLivemode() {
        return livemode;
    }

    @JsonProperty("livemode")
    public void setLivemode(boolean livemode) {
        this.livemode = livemode;
    }

    public Datum withLivemode(boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Datum withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonProperty("outcome")
    public Outcome getOutcome() {
        return outcome;
    }

    @JsonProperty("outcome")
    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

    public Datum withOutcome(Outcome outcome) {
        this.outcome = outcome;
        return this;
    }

    @JsonProperty("paid")
    public boolean isPaid() {
        return paid;
    }

    @JsonProperty("paid")
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Datum withPaid(boolean paid) {
        this.paid = paid;
        return this;
    }

    @JsonProperty("payment_intent")
    public String getPaymentIntent() {
        return paymentIntent;
    }

    @JsonProperty("payment_intent")
    public void setPaymentIntent(String paymentIntent) {
        this.paymentIntent = paymentIntent;
    }

    public Datum withPaymentIntent(String paymentIntent) {
        this.paymentIntent = paymentIntent;
        return this;
    }

    @JsonProperty("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Datum withPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    @JsonProperty("payment_method_details")
    public PaymentMethodDetails getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    @JsonProperty("payment_method_details")
    public void setPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
    }

    public Datum withPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
        return this;
    }

    @JsonProperty("refunded")
    public boolean isRefunded() {
        return refunded;
    }

    @JsonProperty("refunded")
    public void setRefunded(boolean refunded) {
        this.refunded = refunded;
    }

    public Datum withRefunded(boolean refunded) {
        this.refunded = refunded;
        return this;
    }

    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public Datum withSource(Object source) {
        this.source = source;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Datum withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Datum withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("object", object).append("amount", amount).append("applicationFee", applicationFee).append("balanceTransaction", balanceTransaction).append("captured", captured).append("created", created).append("currency", currency).append("failureCode", failureCode).append("failureMessage", failureMessage).append("fraudDetails", fraudDetails).append("livemode", livemode).append("metadata", metadata).append("outcome", outcome).append("paid", paid).append("paymentIntent", paymentIntent).append("paymentMethod", paymentMethod).append("paymentMethodDetails", paymentMethodDetails).append("refunded", refunded).append("source", source).append("status", status).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(balanceTransaction).append(status).append(applicationFee).append(failureMessage).append(captured).append(object).append(outcome).append(paymentMethodDetails).append(currency).append(amount).append(id).append(fraudDetails).append(paid).append(refunded).append(source).append(created).append(additionalProperties).append(paymentIntent).append(livemode).append(failureCode).append(paymentMethod).append(metadata).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return new EqualsBuilder().append(balanceTransaction, rhs.balanceTransaction).append(status, rhs.status).append(applicationFee, rhs.applicationFee).append(failureMessage, rhs.failureMessage).append(captured, rhs.captured).append(object, rhs.object).append(outcome, rhs.outcome).append(paymentMethodDetails, rhs.paymentMethodDetails).append(currency, rhs.currency).append(amount, rhs.amount).append(id, rhs.id).append(fraudDetails, rhs.fraudDetails).append(paid, rhs.paid).append(refunded, rhs.refunded).append(source, rhs.source).append(created, rhs.created).append(additionalProperties, rhs.additionalProperties).append(paymentIntent, rhs.paymentIntent).append(livemode, rhs.livemode).append(failureCode, rhs.failureCode).append(paymentMethod, rhs.paymentMethod).append(metadata, rhs.metadata).isEquals();
    }

}
