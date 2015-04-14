package org.guava.objects;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class ObjectsUse implements Comparable<ObjectsUse> {

	private String name;

	private String age;

	public int compareTo(ObjectsUse that) {
		// 编写compareTo方法
		return ComparisonChain.start().compare(this.name, that.name, Ordering.natural().nullsLast())
				.compare(this.age, that.age, Ordering.natural().nullsLast()).result();
	}

	@Override
	public String toString() {
		// 编写toString方法
		return MoreObjects.toStringHelper(this).add("name", name).toString();
	}

	public static void main(String[] args) {

		// equal判断不用处理null
		System.out.println(Objects.equal(null, ""));

		// 计算hashcode
		System.out.println(Objects.hashCode(1, "", 3L, 0.5));

		System.out.println(new ObjectsUse());

		System.out.println(new ObjectsUse().compareTo(new ObjectsUse()));
		
		// 获取第一个非null值
		System.out.println(MoreObjects.firstNonNull("1", "2"));
		System.out.println(MoreObjects.firstNonNull(null, "2"));
		System.out.println(MoreObjects.firstNonNull("1", null));
		System.out.println(MoreObjects.firstNonNull(null, null));
	}

}
