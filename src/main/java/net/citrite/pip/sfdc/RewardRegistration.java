package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.time.LocalDate;

public class RewardRegistration implements Serializable {

	private static final long serialVersionUID = -1528041913511392459L;
	
	private String Registration_ID;
	private String Incentive_Type;
	private LocalDate Reward_Submitted_Date;
	private Boolean BackendApplicable_Flag;
	private Boolean FrontendApplicable_Flag;
	private LocalDate Initial_Submitted_Date;

	public String getRegistration_ID() {
		return this.Registration_ID;
	}

	public void setRegistration_ID(String Registration_ID) {
		this.Registration_ID = Registration_ID;
	}

	public String getIncentive_Type() {
		return this.Incentive_Type;
	}

	public void setIncentive_Type(String Incentive_Type) {
		this.Incentive_Type = Incentive_Type;
	}

	public LocalDate getReward_Submitted_Date() {
		return this.Reward_Submitted_Date;
	}

	public void setReward_Submitted_Date(LocalDate Reward_Submitted_Date) {
		this.Reward_Submitted_Date = Reward_Submitted_Date;
	}

	public Boolean isBackendApplicable_Flag() {
		return this.BackendApplicable_Flag;
	}

	public Boolean getBackendApplicable_Flag() {
		return this.BackendApplicable_Flag;
	}

	public void setBackendApplicable_Flag(Boolean BackendApplicable_Flag) {
		this.BackendApplicable_Flag = BackendApplicable_Flag;
	}

	public Boolean isFrontendApplicable_Flag() {
		return this.FrontendApplicable_Flag;
	}

	public Boolean getFrontendApplicable_Flag() {
		return this.FrontendApplicable_Flag;
	}

	public void setFrontendApplicable_Flag(Boolean FrontendApplicable_Flag) {
		this.FrontendApplicable_Flag = FrontendApplicable_Flag;
	}

	public LocalDate getInitial_Submitted_Date() {
		return this.Initial_Submitted_Date;
	}

	public void setInitial_Submitted_Date(LocalDate Initial_Submitted_Date) {
		this.Initial_Submitted_Date = Initial_Submitted_Date;
	}

	public RewardRegistration(String Registration_ID, String Incentive_Type, LocalDate Reward_Submitted_Date, Boolean BackendApplicable_Flag, Boolean FrontendApplicable_Flag, LocalDate Initial_Submitted_Date) {
		this.Registration_ID = Registration_ID;
		this.Incentive_Type = Incentive_Type;
		this.Reward_Submitted_Date = Reward_Submitted_Date;
		this.BackendApplicable_Flag = BackendApplicable_Flag;
		this.FrontendApplicable_Flag = FrontendApplicable_Flag;
		this.Initial_Submitted_Date = Initial_Submitted_Date;
	}

	public RewardRegistration() {
	}

}