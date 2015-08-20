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
public enum LastLiquidityInd implements org.f1x.api.message.types.ByteEnum {
	ADDED_LIQUIDITY((byte)'1'),
	REMOVED_LIQUIDITY((byte)'2'),
	LIQUIDITY_ROUTED_OUT((byte)'3');

	private final byte code;

	LastLiquidityInd (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static LastLiquidityInd parse(String s) {
		switch(s) {
			case "1" : return ADDED_LIQUIDITY;
			case "2" : return REMOVED_LIQUIDITY;
			case "3" : return LIQUIDITY_ROUTED_OUT;
		}
		return null;
	}

}