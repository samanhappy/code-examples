package org.guava.collections;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TableUse {
	
	public static void main(String[] args) {
		// 多个键做索引,Table有两个支持所有类型的键：”行”和”列”
		Table<Double, Double, String> address = HashBasedTable.create();
		address.put(110.8, 87.6, "江苏南京"); 
		address.put(110.8, 90.6, "江苏苏州"); 
		address.put(112.8, 87.6, "北京市"); 
		System.out.println(address);
		
		// 用Map<R, Map<C, V>>表现Table<R, C, V>
		System.out.println(address.rowMap());
		// 行集合
		System.out.println(address.rowKeySet());
		// 用Map<C, V>返回给定”行”的所有列
		System.out.println(address.row(110.8));
		
		// 对应的列访问方法
		System.out.println(address.columnMap());
		System.out.println(address.columnKeySet());
		System.out.println(address.column(87.6));
	}

}
