public class HeapdumpTest {
  @GetMapping("/test")
  public void test() {
    var stack = new Stack<String>();
	int mb = 1024 * 1024;
	var runtime = Runtime.getRuntime();
	log.info("Free Memory = {} Max Memory = {} totalMemory = {}",
	  runtime.freeMemory() / mb, runtime.maxMemory() / mb,
	  runtime.totalMemory() / mb);
	IntStream.range(1, Integer.MAX_VALUE).forEach((i) -> stack.push("입력" + i));
	}
}
