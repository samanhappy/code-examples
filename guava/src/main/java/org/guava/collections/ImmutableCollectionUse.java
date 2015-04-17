package org.guava.collections;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

public class ImmutableCollectionUse {

	/*
	 * 不可变对象有很多优点，包括：
	 * 
	 * 当对象被不可信的库调用时，不可变形式是安全的；
	 * 
	 * 不可变对象被多个线程调用时，不存在竞态条件问题
	 * 
	 * 不可变集合不需要考虑变化，因此可以节省时间和空间。所有不可变的集合都比它们的可变形式有更好的内存利用率（分析和测试细节）；
	 * 
	 * 不可变对象因为有固定不变，可以作为常量来安全使用
	 */
	public static void main(String[] args) {

		// 创建不可变集合,final集合最佳伴侣
		final ImmutableSet<String> set = ImmutableSet.of("1", "2", "3");

		// 拷贝不可变集合,接收Collection参数,创建对象的不可变拷贝是一项很好的防御性编程技巧
		ImmutableSet.copyOf(new HashSet<String>());
		ImmutableSortedSet.copyOf(new HashSet<String>());

		// builder
		ImmutableSet.<Color> builder().addAll(new HashSet<Color>()).add(new Color(0, 191, 255)).build();

		// asList返回的列表视图通常比一般的列表平均性能更好，比如，在底层集合支持的情况下，它总是使用高效的contains方法
		System.out.println(set.asList());

		// 所有Guava不可变集合的实现都不接受null值,如果你需要在不可变集合中使用null，请使用JDK中的Collections.unmodifiableXXX方法
		Collections.unmodifiableList(new ArrayList<String>());
	}

}
