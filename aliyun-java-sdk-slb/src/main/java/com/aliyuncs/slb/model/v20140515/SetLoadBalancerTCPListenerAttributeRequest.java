/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetLoadBalancerTCPListenerAttributeRequest extends RpcAcsRequest<SetLoadBalancerTCPListenerAttributeResponse> {
	
	public SetLoadBalancerTCPListenerAttributeRequest() {
		super("Slb", "2014-05-15", "SetLoadBalancerTCPListenerAttribute", "slb");
	}

	private Integer healthCheckConnectTimeout;

	private Long resourceOwnerId;

	private String healthCheckURI;

	private String description;

	private Integer unhealthyThreshold;

	private Integer healthyThreshold;

	private String aclStatus;

	private String scheduler;

	private String aclType;

	private String masterSlaveServerGroup;

	private Integer establishedTimeout;

	private Integer maxConnection;

	private Integer persistenceTimeout;

	private String vpcIds;

	private String vServerGroupId;

	private String aclId;

	private Integer listenerPort;

	private String healthCheckType;

	private String resourceOwnerAccount;

	private Integer bandwidth;

	private String healthCheckDomain;

	private String ownerAccount;

	private String synProxy;

	private Long ownerId;

	private String tags;

	private String loadBalancerId;

	private String masterSlaveServerGroupId;

	private Integer healthCheckInterval;

	private Integer healthCheckConnectPort;

	private String healthCheckHttpCode;

	private String vServerGroup;

	public Integer getHealthCheckConnectTimeout() {
		return this.healthCheckConnectTimeout;
	}

	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		this.healthCheckConnectTimeout = healthCheckConnectTimeout;
		if(healthCheckConnectTimeout != null){
			putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
		if(healthCheckURI != null){
			putQueryParameter("HealthCheckURI", healthCheckURI);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
		if(unhealthyThreshold != null){
			putQueryParameter("UnhealthyThreshold", unhealthyThreshold.toString());
		}
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
		if(healthyThreshold != null){
			putQueryParameter("HealthyThreshold", healthyThreshold.toString());
		}
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
		if(aclStatus != null){
			putQueryParameter("AclStatus", aclStatus);
		}
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		if(scheduler != null){
			putQueryParameter("Scheduler", scheduler);
		}
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
		if(aclType != null){
			putQueryParameter("AclType", aclType);
		}
	}

	public String getMasterSlaveServerGroup() {
		return this.masterSlaveServerGroup;
	}

	public void setMasterSlaveServerGroup(String masterSlaveServerGroup) {
		this.masterSlaveServerGroup = masterSlaveServerGroup;
		if(masterSlaveServerGroup != null){
			putQueryParameter("MasterSlaveServerGroup", masterSlaveServerGroup);
		}
	}

	public Integer getEstablishedTimeout() {
		return this.establishedTimeout;
	}

	public void setEstablishedTimeout(Integer establishedTimeout) {
		this.establishedTimeout = establishedTimeout;
		if(establishedTimeout != null){
			putQueryParameter("EstablishedTimeout", establishedTimeout.toString());
		}
	}

	public Integer getMaxConnection() {
		return this.maxConnection;
	}

	public void setMaxConnection(Integer maxConnection) {
		this.maxConnection = maxConnection;
		if(maxConnection != null){
			putQueryParameter("MaxConnection", maxConnection.toString());
		}
	}

	public Integer getPersistenceTimeout() {
		return this.persistenceTimeout;
	}

	public void setPersistenceTimeout(Integer persistenceTimeout) {
		this.persistenceTimeout = persistenceTimeout;
		if(persistenceTimeout != null){
			putQueryParameter("PersistenceTimeout", persistenceTimeout.toString());
		}
	}

	public String getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(String vpcIds) {
		this.vpcIds = vpcIds;
		if(vpcIds != null){
			putQueryParameter("VpcIds", vpcIds);
		}
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		if(vServerGroupId != null){
			putQueryParameter("VServerGroupId", vServerGroupId);
		}
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
		if(aclId != null){
			putQueryParameter("AclId", aclId);
		}
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putQueryParameter("ListenerPort", listenerPort.toString());
		}
	}

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
		if(healthCheckType != null){
			putQueryParameter("HealthCheckType", healthCheckType);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
		if(healthCheckDomain != null){
			putQueryParameter("HealthCheckDomain", healthCheckDomain);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getSynProxy() {
		return this.synProxy;
	}

	public void setSynProxy(String synProxy) {
		this.synProxy = synProxy;
		if(synProxy != null){
			putQueryParameter("SynProxy", synProxy);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public String getMasterSlaveServerGroupId() {
		return this.masterSlaveServerGroupId;
	}

	public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
		this.masterSlaveServerGroupId = masterSlaveServerGroupId;
		if(masterSlaveServerGroupId != null){
			putQueryParameter("MasterSlaveServerGroupId", masterSlaveServerGroupId);
		}
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
		if(healthCheckInterval != null){
			putQueryParameter("HealthCheckInterval", healthCheckInterval.toString());
		}
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
		if(healthCheckConnectPort != null){
			putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort.toString());
		}
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
		if(healthCheckHttpCode != null){
			putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
		}
	}

	public String getVServerGroup() {
		return this.vServerGroup;
	}

	public void setVServerGroup(String vServerGroup) {
		this.vServerGroup = vServerGroup;
		if(vServerGroup != null){
			putQueryParameter("VServerGroup", vServerGroup);
		}
	}

	@Override
	public Class<SetLoadBalancerTCPListenerAttributeResponse> getResponseClass() {
		return SetLoadBalancerTCPListenerAttributeResponse.class;
	}

}
