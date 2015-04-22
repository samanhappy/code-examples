package org.guava.collections;

import com.google.common.collect.BoundType;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultiset;
import com.google.common.collect.TreeMultiset;

public class MultiSetUse {

	public static void main(String[] args) {

		// 以HashMultiset为例，对应JDK中HashMap的各种实现
		Multiset<String> mset = HashMultiset.create();

		mset.add("str");
		// 增加给定元素在Multiset中的计数
		mset.add("str", 1);
		// 返回集合元素的总个数（包括重复的元素）
		System.out.println(mset.size());
		// Multiset中不重复元素的集合，类型为Set<E>
		System.out.println(mset.elementSet().size());
		// 和Map的entrySet类似，返回Set<Multiset.Entry<E>>，其中包含的Entry支持getElement()和getCount()方法
		System.out.println(mset.entrySet().size());
		// 给定元素在Multiset中的计数
		System.out.println(mset.count("str"));

		// 减少给定元素在Multiset中的计数
		mset.remove("str", 2);
		System.out.println(mset.count("str"));

		// 设置给定元素在Multiset中的计数，不可以为负数
		mset.setCount("str", 5);
		System.out.println(mset.count("str"));

		// 元素count-1
		mset.remove("str");
		System.out.println(mset.count("str"));
		mset.remove("str");
		System.out.println(mset.count("str"));

		// 高效地获取指定范围的子集
		SortedMultiset<String> smset = TreeMultiset.create();
		smset.add("str1");
		smset.add("str1");
		smset.add("str1");
		smset.add("str2");
		smset.add("str2");
		smset.add("str3");
		smset.add("str4");
		smset.add("str5");
		System.out.println(smset.subMultiset("str1", BoundType.CLOSED, "str4", BoundType.OPEN));

		// 不可变集合
		ImmutableSortedMultiset<String> ismset = ImmutableSortedMultiset.copyOf(smset);
		System.out.println(ismset);
	}
}
