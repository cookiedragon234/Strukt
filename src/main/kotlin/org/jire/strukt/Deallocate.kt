/*
 *    Copyright 2016-2017 Thomas G. Nappo (Jire)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package org.jire.strukt

fun deallocate(pointer: Long) = UNSAFE.freeMemory(pointer)

fun deallocate(vararg pointers: Long) {
	for (pointer in pointers)
		UNSAFE.freeMemory(pointer)
}

operator fun <T : Strukt> T.unaryMinus() {
	deallocate(pointer)
}