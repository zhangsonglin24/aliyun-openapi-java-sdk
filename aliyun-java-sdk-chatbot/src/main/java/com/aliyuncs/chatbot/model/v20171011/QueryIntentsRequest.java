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

package com.aliyuncs.chatbot.model.v20171011;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryIntentsRequest extends RpcAcsRequest<QueryIntentsResponse> {
	
	public QueryIntentsRequest() {
		super("Chatbot", "2017-10-11", "QueryIntents", "beebot");
	}

	private String intentName;

	private Integer pageSize;

	private Long dialogId;

	private Integer pageNumber;

	public String getIntentName() {
		return this.intentName;
	}

	public void setIntentName(String intentName) {
		this.intentName = intentName;
		if(intentName != null){
			putQueryParameter("IntentName", intentName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getDialogId() {
		return this.dialogId;
	}

	public void setDialogId(Long dialogId) {
		this.dialogId = dialogId;
		if(dialogId != null){
			putQueryParameter("DialogId", dialogId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<QueryIntentsResponse> getResponseClass() {
		return QueryIntentsResponse.class;
	}

}
