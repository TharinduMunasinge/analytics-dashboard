/**
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
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
package org.wso2.carbon.analytics.dashboard.restapi;

/**
 * The Class Constants Contains the constants used by rest apis.
 */
public class Constants {

	public static final long MILLISECONDSPERSECOND = 1000;

	/**
	 * Instantiates a new constants.
	 */
	private Constants() {
	}

	/**
	 * The Class Status.
	 */
	public static final class Status {

		/** The Constant CREATED. */
		public static final String CREATED = "created";
		/** The Constant FAILED. */
		public static final String FAILED = "failed";

		/** The Constant SUCCESS. */
		public static final String SUCCESS = "success";

		/** The Constant NON_EXISTENT. */
		public static final String NON_EXISTENT = "non-existent";

		/**
		 * Instantiates a new status.
		 */
		private Status() {
		}
	}

    /**
     * The Class ResourcePath.
     */
    public static final class ResourcePath {

        /** Token generator method name. */
        public static final String GENERATE_TOKEN = "generate_token";
        
        /** The Constant root context. */
        public static final String ROOT_CONTEXT = "/";

		/** The Constant tables. */
		public static final String TABLES = "tables";

		/** The Constant table_exists. */
		public static final String TABLE_EXISTS = "table_exists";

		/** The Constant records. */
		public static final String RECORDS = "records";

		/** The Constant search. */
		public static final String SEARCH = "search";

		/** The Constant search_count. */
		public static final String SEARCH_COUNT = "search_count";

		public static final String INDEXING_DONE = "indexing_done";

    }
}
