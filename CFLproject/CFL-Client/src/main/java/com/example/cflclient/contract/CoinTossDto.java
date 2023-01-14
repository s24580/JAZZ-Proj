
package com.example.cflclient.contract;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coin_toss_winner",
    "coin_toss_winner_election"
})
@Generated("jsonschema2pojo")
public class CoinTossDto {

    @JsonProperty("coin_toss_winner")
    private String coinTossWinner;
    @JsonProperty("coin_toss_winner_election")
    private String coinTossWinnerElection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coin_toss_winner")
    public String getCoinTossWinner() {
        return coinTossWinner;
    }

    @JsonProperty("coin_toss_winner")
    public void setCoinTossWinner(String coinTossWinner) {
        this.coinTossWinner = coinTossWinner;
    }

    @JsonProperty("coin_toss_winner_election")
    public String getCoinTossWinnerElection() {
        return coinTossWinnerElection;
    }

    @JsonProperty("coin_toss_winner_election")
    public void setCoinTossWinnerElection(String coinTossWinnerElection) {
        this.coinTossWinnerElection = coinTossWinnerElection;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
