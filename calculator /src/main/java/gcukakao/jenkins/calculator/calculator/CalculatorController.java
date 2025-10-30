package gcukakao.jenkins.calculator.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    String sum(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(calculator.add(a, b));
    }

    @RequestMapping("/subtract")
    String subtract(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(calculator.subtract(a, b));
    }

    @RequestMapping("/multiply")
    String multiply(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(calculator.multiply(a, b));
    }

    @RequestMapping("/divide")
    String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(calculator.divide(a, b));
    }
}