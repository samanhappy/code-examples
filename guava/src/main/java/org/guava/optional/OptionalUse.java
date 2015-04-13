package org.guava.optional;

import com.google.common.base.Optional;

public class OptionalUse {

	/*
	 * 返回一个Optional对象会迫使调用者思考返回的引用缺失的情形
	 */
	public static Optional<String> getOptional() {
		return Optional.absent();
	}

	/*
	 * 得到一个非null对象.
	 */
	public static String getNoneNullStr(String str) {
		return Optional.fromNullable(str).or("");
	}

	public static void main(String[] args) {
		Optional<String> opt = OptionalUse.getOptional();
		// 获取引用前先判断
		if (opt.isPresent()) {
			String str = opt.get();
			System.out.println(str);
		}
		// 得到一个非null对象
		String noneNullStr = opt.or("empty str");
		System.out.println(noneNullStr);
	}

}
