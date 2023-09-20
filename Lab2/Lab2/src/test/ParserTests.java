package test;

import static org.junit.Assert.fail;

import java.io.StringReader;

import lexer.Lexer;

import org.junit.Test;

import parser.Parser;

public class ParserTests {
	private void runtest(String src) {
		runtest(src, true);
	}

	private void runtest(String src, boolean succeed) {
		Parser parser = new Parser();
		try {
			parser.parse(new Lexer(new StringReader(src)));
			if(!succeed) {
				fail("Test was supposed to fail, but succeeded");
			}
		} catch (beaver.Parser.Exception e) {
			if(succeed) {
				e.printStackTrace();
				fail(e.getMessage());
			}
		} catch (Throwable e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testEmptyModule() {
		runtest("module Test { }");
	}
	
	@Test
	public void testModuleImports() {
		runtest("module Test {" + "import module1;" + "import module2;" + "}");
	}

	@Test
	public void testModuleTypeDecl() {
		runtest("module Test {" + "public type int = \"INT\";" + "type float = \"FLOAT\";" + "}");
	}

	@Test
	public void testModuleFieldDecl() {
		runtest("module Test {" + "public boolean field1;" + "int[] field2;" + "}");
	}

	@Test
	public void testModuleEmptyFuncDecl() {
		runtest("module Test {" + "public void func() {}" + "}");
	}

	@Test
	public void testModuleParamFuncDecl() {
		runtest("module Test {" + "public void func(boolean param) {}" + "}");
	}

	@Test
	public void testModuleParamListFuncDecl() {
		runtest("module Test {" + "public void func(int param1, boolean param2) {}" + "}");
	}

	@Test
	public void testModuleWhileIfFuncDecl() {
		runtest("module Test {" + "public int func(int param) {" + " while(param < 10)"
				+ " if(param%2 == 0) {param = param+1;}"
				+ "	else {param = param*2;}" 
				+ " return param;"
				+ "}" + "}");
	}

}
