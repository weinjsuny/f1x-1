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
public enum RegistStatus implements org.f1x.api.message.types.ByteEnum {
	ACCEPTED((byte)'A'),
	REJECTED((byte)'R'),
	HELD((byte)'H'),
	REMINDER((byte)'N');

	private final byte code;

	RegistStatus (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static RegistStatus parse(String s) {
		switch(s) {
			case "A" : return ACCEPTED;
			case "R" : return REJECTED;
			case "H" : return HELD;
			case "N" : return REMINDER;
		}
		return null;
	}

}