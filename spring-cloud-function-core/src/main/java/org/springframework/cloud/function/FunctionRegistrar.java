/*
 * Copyright 2016 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      https://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.function;

import org.springframework.cloud.function.registry.FileSystemFunctionRegistry;

/**
 * @author Mark Fisher
 */
public class FunctionRegistrar {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("USAGE: java FunctionRegistrar functionName functionBody");
			System.exit(1);
		}
		FileSystemFunctionRegistry registry = new FileSystemFunctionRegistry();
		registry.register(args[0], args[1]);
	}
}
