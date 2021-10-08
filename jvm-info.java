public class jvm {
  
	private static final long MB = 1048576L;

	public static long getTotalMemory() {
		return Runtime.getRuntime().totalMemory() / MB;
	}

	public static long getFreeMemory() {
		return Runtime.getRuntime().freeMemory() / MB;
	}

	public static long getUsedMemory() {
		return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / MB;
	}

	public static long getMaxMemory() {
		return Runtime.getRuntime().maxMemory() / MB;
	}

	public static String getVMName() {
		return System.getProperty("java.vm.name");
	}

	public static int getAvailableProcessors() {
		return Runtime.getRuntime().availableProcessors();
	}
}
