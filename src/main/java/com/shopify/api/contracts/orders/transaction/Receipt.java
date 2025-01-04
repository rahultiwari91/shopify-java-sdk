
package com.shopify.api.contracts.orders.transaction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "gift_card_id",
    "gift_card_last_characters",
    "id",
    "object",
    "amount",
    "amount_capturable",
    "amount_received",
    "canceled_at",
    "cancellation_reason",
    "capture_method",
    "charges",
    "confirmation_method",
    "created",
    "currency",
    "last_payment_error",
    "livemode",
    "metadata",
    "next_action",
    "payment_method",
    "payment_method_types",
    "source",
    "status"
})
public class Receipt implements Serializable
{

    @JsonProperty("gift_card_id")
    private long giftCardId;
    @JsonProperty("gift_card_last_characters")
    private String giftCardLastCharacters;
    @JsonProperty("id")
    private String id;
    @JsonProperty("object")
    private String object;
    @JsonProperty("amount")
    private long amount;
    @JsonProperty("amount_capturable")
    private long amountCapturable;
    @JsonProperty("amount_received")
    private long amountReceived;
    @JsonProperty("canceled_at")
    private Object canceledAt;
    @JsonProperty("cancellation_reason")
    private Object cancellationReason;
    @JsonProperty("capture_method")
    private String captureMethod;
    @JsonProperty("charges")
    private Charges charges;
    @JsonProperty("confirmation_method")
    private String confirmationMethod;
    @JsonProperty("created")
    private long created;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("last_payment_error")
    private Object lastPaymentError;
    @JsonProperty("livemode")
    private boolean livemode;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("next_action")
    private Object nextAction;
    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("payment_method_types")
    private List<String> paymentMethodTypes = new ArrayList<String>();
    @JsonProperty("source")
    private Object source;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4907441770428453174L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Receipt() {
    }

    /**
     * 
     * @param amountCapturable
     * @param nextAction
     * @param charges
     * @param status
     * @param cancellationReason
     * @param lastPaymentError
     * @param giftCardId
     * @param object
     * @param currency
     * @param id
     * @param amount
     * @param amountReceived
     * @param canceledAt
     * @param paymentMethodTypes
     * @param source
     * @param created
     * @param giftCardLastCharacters
     * @param livemode
     * @param captureMethod
     * @param paymentMethod
     * @param confirmationMethod
     * @param metadata
     */
    public Receipt(long giftCardId, String giftCardLastCharacters, String id, String object, long amount, long amountCapturable, long amountReceived, Object canceledAt, Object cancellationReason, String captureMethod, Charges charges, String confirmationMethod, long created, String currency, Object lastPaymentError, boolean livemode, Metadata metadata, Object nextAction, String paymentMethod, List<String> paymentMethodTypes, Object source, String status) {
        super();
        this.giftCardId = giftCardId;
        this.giftCardLastCharacters = giftCardLastCharacters;
        this.id = id;
        this.object = object;
        this.amount = amount;
        this.amountCapturable = amountCapturable;
        this.amountReceived = amountReceived;
        this.canceledAt = canceledAt;
        this.cancellationReason = cancellationReason;
        this.captureMethod = captureMethod;
        this.charges = charges;
        this.confirmationMethod = confirmationMethod;
        this.created = created;
        this.currency = currency;
        this.lastPaymentError = lastPaymentError;
        this.livemode = livemode;
        this.metadata = metadata;
        this.nextAction = nextAction;
        this.paymentMethod = paymentMethod;
        this.paymentMethodTypes = paymentMethodTypes;
        this.source = source;
        this.status = status;
    }

    @JsonProperty("gift_card_id")
    public long getGiftCardId() {
        return giftCardId;
    }

    @JsonProperty("gift_card_id")
    public void setGiftCardId(long giftCardId) {
        this.giftCardId = giftCardId;
    }

    public Receipt withGiftCardId(long giftCardId) {
        this.giftCardId = giftCardId;
        return this;
    }

    @JsonProperty("gift_card_last_characters")
    public String getGiftCardLastCharacters() {
        return giftCardLastCharacters;
    }

    @JsonProperty("gift_card_last_characters")
    public void setGiftCardLastCharacters(String giftCardLastCharacters) {
        this.giftCardLastCharacters = giftCardLastCharacters;
    }

    public Receipt withGiftCardLastCharacters(String giftCardLastCharacters) {
        this.giftCardLastCharacters = giftCardLastCharacters;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Receipt withId(String id) {
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

    public Receipt withObject(String object) {
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

    public Receipt withAmount(long amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("amount_capturable")
    public long getAmountCapturable() {
        return amountCapturable;
    }

    @JsonProperty("amount_capturable")
    public void setAmountCapturable(long amountCapturable) {
        this.amountCapturable = amountCapturable;
    }

    public Receipt withAmountCapturable(long amountCapturable) {
        this.amountCapturable = amountCapturable;
        return this;
    }

    @JsonProperty("amount_received")
    public long getAmountReceived() {
        return amountReceived;
    }

    @JsonProperty("amount_received")
    public void setAmountReceived(long amountReceived) {
        this.amountReceived = amountReceived;
    }

    public Receipt withAmountReceived(long amountReceived) {
        this.amountReceived = amountReceived;
        return this;
    }

    @JsonProperty("canceled_at")
    public Object getCanceledAt() {
        return canceledAt;
    }

    @JsonProperty("canceled_at")
    public void setCanceledAt(Object canceledAt) {
        this.canceledAt = canceledAt;
    }

    public Receipt withCanceledAt(Object canceledAt) {
        this.canceledAt = canceledAt;
        return this;
    }

    @JsonProperty("cancellation_reason")
    public Object getCancellationReason() {
        return cancellationReason;
    }

    @JsonProperty("cancellation_reason")
    public void setCancellationReason(Object cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Receipt withCancellationReason(Object cancellationReason) {
        this.cancellationReason = cancellationReason;
        return this;
    }

    @JsonProperty("capture_method")
    public String getCaptureMethod() {
        return captureMethod;
    }

    @JsonProperty("capture_method")
    public void setCaptureMethod(String captureMethod) {
        this.captureMethod = captureMethod;
    }

    public Receipt withCaptureMethod(String captureMethod) {
        this.captureMethod = captureMethod;
        return this;
    }

    @JsonProperty("charges")
    public Charges getCharges() {
        return charges;
    }

    @JsonProperty("charges")
    public void setCharges(Charges charges) {
        this.charges = charges;
    }

    public Receipt withCharges(Charges charges) {
        this.charges = charges;
        return this;
    }

    @JsonProperty("confirmation_method")
    public String getConfirmationMethod() {
        return confirmationMethod;
    }

    @JsonProperty("confirmation_method")
    public void setConfirmationMethod(String confirmationMethod) {
        this.confirmationMethod = confirmationMethod;
    }

    public Receipt withConfirmationMethod(String confirmationMethod) {
        this.confirmationMethod = confirmationMethod;
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

    public Receipt withCreated(long created) {
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

    public Receipt withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("last_payment_error")
    public Object getLastPaymentError() {
        return lastPaymentError;
    }

    @JsonProperty("last_payment_error")
    public void setLastPaymentError(Object lastPaymentError) {
        this.lastPaymentError = lastPaymentError;
    }

    public Receipt withLastPaymentError(Object lastPaymentError) {
        this.lastPaymentError = lastPaymentError;
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

    public Receipt withLivemode(boolean livemode) {
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

    public Receipt withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonProperty("next_action")
    public Object getNextAction() {
        return nextAction;
    }

    @JsonProperty("next_action")
    public void setNextAction(Object nextAction) {
        this.nextAction = nextAction;
    }

    public Receipt withNextAction(Object nextAction) {
        this.nextAction = nextAction;
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

    public Receipt withPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    @JsonProperty("payment_method_types")
    public List<String> getPaymentMethodTypes() {
        return paymentMethodTypes;
    }

    @JsonProperty("payment_method_types")
    public void setPaymentMethodTypes(List<String> paymentMethodTypes) {
        this.paymentMethodTypes = paymentMethodTypes;
    }

    public Receipt withPaymentMethodTypes(List<String> paymentMethodTypes) {
        this.paymentMethodTypes = paymentMethodTypes;
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

    public Receipt withSource(Object source) {
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

    public Receipt withStatus(String status) {
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

    public Receipt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("giftCardId", giftCardId).append("giftCardLastCharacters", giftCardLastCharacters).append("id", id).append("object", object).append("amount", amount).append("amountCapturable", amountCapturable).append("amountReceived", amountReceived).append("canceledAt", canceledAt).append("cancellationReason", cancellationReason).append("captureMethod", captureMethod).append("charges", charges).append("confirmationMethod", confirmationMethod).append("created", created).append("currency", currency).append("lastPaymentError", lastPaymentError).append("livemode", livemode).append("metadata", metadata).append("nextAction", nextAction).append("paymentMethod", paymentMethod).append("paymentMethodTypes", paymentMethodTypes).append("source", source).append("status", status).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amountCapturable).append(nextAction).append(charges).append(status).append(cancellationReason).append(lastPaymentError).append(giftCardId).append(object).append(currency).append(amount).append(id).append(amountReceived).append(canceledAt).append(paymentMethodTypes).append(source).append(created).append(additionalProperties).append(giftCardLastCharacters).append(livemode).append(captureMethod).append(paymentMethod).append(confirmationMethod).append(metadata).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Receipt) == false) {
            return false;
        }
        Receipt rhs = ((Receipt) other);
        return new EqualsBuilder().append(amountCapturable, rhs.amountCapturable).append(nextAction, rhs.nextAction).append(charges, rhs.charges).append(status, rhs.status).append(cancellationReason, rhs.cancellationReason).append(lastPaymentError, rhs.lastPaymentError).append(giftCardId, rhs.giftCardId).append(object, rhs.object).append(currency, rhs.currency).append(amount, rhs.amount).append(id, rhs.id).append(amountReceived, rhs.amountReceived).append(canceledAt, rhs.canceledAt).append(paymentMethodTypes, rhs.paymentMethodTypes).append(source, rhs.source).append(created, rhs.created).append(additionalProperties, rhs.additionalProperties).append(giftCardLastCharacters, rhs.giftCardLastCharacters).append(livemode, rhs.livemode).append(captureMethod, rhs.captureMethod).append(paymentMethod, rhs.paymentMethod).append(confirmationMethod, rhs.confirmationMethod).append(metadata, rhs.metadata).isEquals();
    }

}
