public class Tester {
	private static int valEqualsCnt = 0;
	private static int memEqualsCnt = 0;
	private static int tieCnt = 0;
	private static int exeMethodCnt = 0;
	public static boolean valEquals(Object o1, Object o2) {
		if(o1.equals(o2)) {
			System.out.println((++valEqualsCnt) + " valEquals passed");
			return true;
		}
		System.out.println((++valEqualsCnt) + " valEquals failed");
		return false;
	}
	public static boolean valEquals(Object o1, Object o2, String message) {
		if(valEquals(o1,o2)) {
			return true;
		}
		System.out.println(message + "\n");
		return false;
	}
	public static boolean memEquals(Object o1, Object o2) {
		if(o1 == o2) {
			System.out.println((++memEqualsCnt) + " memEquals passed");
			return true;
		}
		System.out.println((++memEqualsCnt) + " memEquals failed");
		return false;
	}
	public static boolean memEquals(Object o1, Object o2, String message) {
		if(memEquals(o1,o2)) {
			return true;
		}
		System.out.println(message + "\n");
		return false;
	}
	public static boolean tie(long maxMili, exeMethod m) {
		long initMillis = System.currentTimeMillis();
		m.Method();
		long res = maxMili - initMillis;
		if(res >= 0) {
			System.out.println("tie " + ++tieCnt + " passed with execution time: " + res + " miliSeconds");
			return true;
		}
		System.out.println("tie " + ++tieCnt + "failed with " + (-res) + " excess time");
		return false;
	}
	public static void exeCondition(boolean cond, exeMethod m) {
		if(cond) {
			m.Method();
			System.out.println("exeMethod" + ++exeMethodCnt + " passed");
		}else {
			System.out.println("exeMethod" + ++exeMethodCnt + " failed");
		}
	}
}
