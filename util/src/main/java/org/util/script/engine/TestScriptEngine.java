package org.util.script.engine;

import javax.script.Bindings;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestScriptEngine
{
    public static void main(String[] args) throws ScriptException
    {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
        Compilable compilable = (Compilable) engine;
        Bindings bindings = engine.createBindings(); //Local级别的Binding
        String script = "function add(基本工资,op2){if (基本工资<0){ return 0;}else{ return 基本工资+op2;}} add(基本工资, b)"; //定义函数并调用
        CompiledScript JSFunction = compilable.compile(script); //解析编译脚本函数
        bindings.put("基本工资", -1);
        bindings.put("b", 2); //通过Bindings加入参数
        Object result = JSFunction.eval(bindings);
        System.out.println(result); //调用缓存着的脚本函数对象，Bindings作为参数容器传入
    }
}
