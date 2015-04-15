package org.guava.ordering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;

public class OrderingUse {

	public static void main(String[] args) {

		// 1.自然排序比较器
		System.out.println(Ordering.natural().compare("a", "b"));

		// 2.以字符串形式字典排序器
		System.out.println(Ordering.usingToString().compare(2, "b"));

		// 3.1 Comparator转化Ordering
		Ordering.from(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return 0;
			}
		});

		// 3.2 new Ordering
		new Ordering<String>() {
			@Override
			public int compare(String paramT1, String paramT2) {
				return 0;
			}
		};

		// 1. 相反排序
		System.out.println(Ordering.natural().reverse().compare(1, 2));
		// 2. null排序
		System.out.println(Ordering.natural().nullsFirst().compare("", null));
		System.out.println(Ordering.natural().nullsLast().compare("", null));
		// 3. 合成另一个比较器，以处理当前排序器中的相等情况
		Ordering.natural().compound(Ordering.usingToString());
		// 4. 基于处理类型T的排序器，返回该类型的可迭代对象Iterable<T>的排序器
		Ordering.natural().lexicographical();
		// 5. 对集合中元素调用Function，再按返回值用当前排序器排序
		// 当阅读链式调用产生的排序器时，应该从后往前读
		Ordering.natural().nullsFirst().onResultOf(new Function<Foo, String>() {
			public String apply(Foo foo) {
				return foo.sortedBy;
			}
		});

		// 1. 比较大小
		Ordering.natural().compare(1, 2);
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// 2. 获取可迭代对象中最大/最小的k个元素
		System.out.println(Ordering.natural().greatestOf(list.iterator(), 3));
		System.out.println(Ordering.natural().leastOf(list.iterator(), 3));
		// 3. 判断可迭代对象是否已按排序器排序：允许/不允许有排序值相等的元素
		System.out.println(Ordering.natural().isOrdered(list));
		System.out.println(Ordering.natural().isStrictlyOrdered(list));
		// 4. 返回排序后的集合可变/不可变拷贝
		System.out.println(Ordering.natural().sortedCopy(list));
		System.out.println(Ordering.natural().immutableSortedCopy(list));
		// 5. 返回最大/最小值
		System.out.println(Ordering.natural().min(1, 2, 3));
		System.out.println(Ordering.natural().max(1, 2, 3, 4));
		System.out.println(Ordering.natural().min(list));
		System.out.println(Ordering.natural().max(list));
		// 6. 二分搜索
		System.out.println(Ordering.natural().binarySearch(list, 4));
		System.out.println(Ordering.natural().binarySearch(list, 10));

	}
}

class Foo {
	String sortedBy;
	int notSortedBy;
}