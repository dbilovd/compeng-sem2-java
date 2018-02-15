@RestController
class SampleGroovyApp {

	@RequestMapping("/grove")
	String home () {
		return "You're at Home";
	}
}