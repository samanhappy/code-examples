package org.guava.collections;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.TreeRangeSet;

public class OthersUse {

	public static void main(String[] args) {
		// ClassToInstanceMap是一种特殊的Map：它的键是类型，而值是符合键所指类型的对象
		ClassToInstanceMap<Number> numberDefaults = MutableClassToInstanceMap.create();
		numberDefaults.putInstance(Integer.class, Integer.valueOf(0));
		numberDefaults.putInstance(Float.class, Float.valueOf(1.1f));
		System.out.println(numberDefaults);

		// RangeSet描述了一组不相连的、非空的区间。当把一个区间添加到可变的RangeSet时，所有相连的区间会被合并，空区间会被忽略
		RangeSet<Integer> rangeSet = TreeRangeSet.create();
		System.out.println(rangeSet);
		rangeSet.add(Range.closed(1, 10)); // {[1,10]}
		System.out.println(rangeSet);
		rangeSet.add(Range.closedOpen(11, 15));// 不相连区间:{[1,10], [11,15)}
		System.out.println(rangeSet);
		rangeSet.add(Range.closedOpen(15, 20)); // 相连区间; {[1,10], [11,20)}
		System.out.println(rangeSet);
		rangeSet.add(Range.openClosed(0, 0)); // 空区间; {[1,10], [11,20)}
		System.out.println(rangeSet);
		rangeSet.remove(Range.open(5, 10)); // 分割[1, 10]; {[1,5],
											// [10,10],[11,20)}
		System.out.println(rangeSet);

		// RangeMap描述了”不相交的、非空的区间”到特定值的映射。和RangeSet不同，RangeMap不会合并相邻的映射，即便相邻的区间映射到相同的值
		RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
		System.out.println(rangeMap);
		rangeMap.put(Range.closed(1, 10), "foo"); // {[1,10] => "foo"}
		System.out.println(rangeMap);
		rangeMap.put(Range.open(3, 6), "bar"); // {[1,3] => "foo", (3,6) =>
		System.out.println(rangeMap); // "bar", [6,10] => "foo"}
		rangeMap.put(Range.open(10, 20), "foo"); // {[1,3] => "foo", (3,6) =>
		System.out.println(rangeMap); // "bar", [6,10] => "foo",
		// (10,20) => "foo"}
		rangeMap.remove(Range.closed(5, 11)); // {[1,3] => "foo", (3,5) =>
												// "bar", (11,20) => "foo"}
		System.out.println(rangeMap);
	}
}
