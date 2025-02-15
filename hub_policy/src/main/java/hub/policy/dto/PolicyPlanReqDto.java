package hub.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import hub.policy.entities.PolicyType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PolicyPlanReqDto {
	  @JsonProperty(access = Access.READ_ONLY)
	  private Long policyPlanId;
	  private String policyPlanName;
	  private String description;
	  private double premium;
	  private double coverageAmount;
	  private int duration;
	  @JsonProperty(access = Access.READ_ONLY)
	  private PolicyType policyType;
	  
}
