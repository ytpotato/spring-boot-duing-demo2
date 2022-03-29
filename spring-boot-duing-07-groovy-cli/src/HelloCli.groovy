@Controller
@Grab("org.springframework.boot:spring-boot-starter-thymeleaf:2.2.0.RELEASE")
@Grab("org.webjars:jquery:3.4.1")

/*
* java -jar hello-cli.jar 启动打包的程序
*/
class HelloCli {
    @RequestMapping("/")
    String home(Model model) {
        model.addAttribute("name","hello world")
        return "welcome"
    }
}
