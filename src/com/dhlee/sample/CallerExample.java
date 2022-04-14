package com.dhlee.sample;

// not found in module-info
//import com.dhlee.common.internal.InternalUtils;
import com.dhlee.common.string.StringUtils;

public class CallerExample {
	public static void main(String[] args) {
		System.out.println(StringUtils.replace("Hello java module name", "name", "dhlee"));
		// not found in module-info
//		System.out.println(InternalUtils.replace("Hello java module name", "name", "dhlee"));
	}
}
