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

package org.f1x.api.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum StandInstDbType implements org.f1x.api.message.types.ByteEnum {
	OTHER((byte)'0'),
	DTC_SID((byte)'1'),
	THOMSON_ALERT((byte)'2'),
	A_GLOBAL_CUSTODIAN((byte)'3'),
	ACCOUNTNET((byte)'4');

	private final byte code;

	StandInstDbType (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static StandInstDbType parse(String s) {
		switch(s) {
			case "0" : return OTHER;
			case "1" : return DTC_SID;
			case "2" : return THOMSON_ALERT;
			case "3" : return A_GLOBAL_CUSTODIAN;
			case "4" : return ACCOUNTNET;
		}
		return null;
	}

}