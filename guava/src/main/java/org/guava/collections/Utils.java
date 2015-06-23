package org.guava.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;

public class Utils {

	public static void main(String[] args) {

		List<String> list = Lists.newArrayList();
		Map<String, String> map = Maps.newHashMap();
		List<String> list1 = Lists.newArrayList("1", "2", "3");

		List<String> exactly100 = Lists.newArrayListWithCapacity(100);
		List<String> approx100 = Lists.newArrayListWithExpectedSize(100);
		Set<String> approx100Set = Sets.newHashSetWithExpectedSize(100);

		// 串联多个iterables的懒视图
		Iterable<Integer> iterable = Iterables.concat(Ints.asList(1, 2, 3, 4), Ints.asList(4, 5, 6));
		System.out.println(iterable);

		// 返回对象在iterable中出现的次数
		System.out.println(Iterables.frequency(iterable, 4));

		// 把iterable按指定大小分割，得到的子集都不能进行修改操作
		System.out.println(Iterables.partition(iterable, 3));

		// 返回iterable的第一个元素，若iterable为空则返回默认值
		System.out.println(Iterables.getFirst(iterable, 0));

		// 返回iterable的最后一个元素，若iterable为空则抛出NoSuchElementException
		System.out.println(Iterables.getLast(iterable, 0));

		// 如果两个iterable中的所有元素相等且顺序一致，返回true
		System.out.println(Iterables.elementsEqual(iterable, iterable));

		// 返回iterable的不可变视图
		System.out.println(Iterables.unmodifiableIterable(iterable));

		// 限制iterable的元素个数限制给定值
		System.out.println(Iterables.limit(iterable, 4));

		// 获取iterable中唯一的元素，如果iterable为空或有多个元素，则快速失败
		System.out.println(Iterables.getOnlyElement(Ints.asList(1)));

		Iterables.addAll(list, list1);
		System.out.println(list);

		System.out.println(Iterables.contains(list, "1"));

		Iterables.removeAll(list, list1);
		System.out.println(list);

		// 集合交集
		Iterables.retainAll(list1, Lists.newArrayList("3", "4", "5"));
		System.out.println(list1);

		System.out.println(Iterables.size(list1));

		System.out.println(Iterables.toArray(list1, String.class));

		System.out.println(Iterables.isEmpty(list1));

		System.out.println(Iterables.get(list1, 0));

		System.out.println(Iterables.toString(list1));

		// FluentIterable：处理Iterable，链式风格调用
		list1.add("4");
		list1.add("5");
		Iterable<String> fluentIterable = FluentIterable.from(list1).transform(new Function<String, String>() {
			public String apply(String paramF) {
				return paramF.equals("3") ? "---" : paramF;
			};
		});
		System.out.println(fluentIterable);
		
		System.out.println(Lists.partition(list1, 2));
		
		System.out.println(Lists.reverse(list1));

	}

}
