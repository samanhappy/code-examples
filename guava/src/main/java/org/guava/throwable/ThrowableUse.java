package org.guava.throwable;

import java.io.IOException;

import com.google.common.base.Throwables;

public class ThrowableUse {

	public static void main(String[] args) throws IOException {
		try {
			int i = 1/0;
			System.out.println(i);
		} catch (Throwable t) {

			// 获取异常源
			Throwables.getRootCause(t).printStackTrace();

			// 获取异常原因链
			Throwables.getCausalChain(t);

			// 获取堆栈字符串信息
			System.out.println(Throwables.getStackTraceAsString(t));

			// 如果Throwable是Error或RuntimeException，直接抛出；否则把Throwable包装成RuntimeException抛出
			Throwables.propagate(t);

			// Throwable类型为X才抛出
			Throwables.propagateIfInstanceOf(t, IOException.class);

			// Throwable类型为Error或RuntimeException才抛出
			Throwables.propagateIfPossible(t);

			// Throwable类型为X, Error或RuntimeException才抛出
			Throwables.propagateIfPossible(t, IOException.class);
			Throwables.propagateIfPossible(t, IOException.class, NullPointerException.class);

		}
	}

}
