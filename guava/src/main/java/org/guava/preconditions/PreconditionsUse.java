package org.guava.preconditions;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkElementIndex;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkPositionIndex;
import static com.google.common.base.Preconditions.checkPositionIndexes;
import static com.google.common.base.Preconditions.checkState;

public class PreconditionsUse {

	public static void testPrecondition(String name, int i) {
		// 检查参数
		checkArgument(i > 0, "数字必须大于0");

		// 检查非空
		checkNotNull(name, "%s不能为空", "姓名");

		// 检查index(index < 0) || (index >= size)
		checkElementIndex(4, name.length(), "姓名长度不能小于5");
		// 检验position(index < 0) || (index > size)
		checkPositionIndex(6, name.length(), "姓名长度不能小于6");
		// 检验范围positions(start < 0) || (end < start) || (end > size)
		checkPositionIndexes(3, 7, name.length());
		
		// 检验状态
		boolean state = false;
		checkState(state);
	}

	public static void main(String[] args) {
		try {
			testPrecondition(null, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			testPrecondition(null, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			testPrecondition("1234", 1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			testPrecondition("12345", 1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			testPrecondition("123456", 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			testPrecondition("1234567", 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
