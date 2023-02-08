package Employee;

import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
class EmployeeNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(EmployeeNotFoundException ex) {
		return ex.getMessage();
	}

	/*@ResponseStatus(HttpStatus.OK)
	public void handleFormRequest (@RequestBody MultiValueMap<String, String> formParams) {
		System.out.println("parámetros recibidos correctamente" + formParams);
	}*/
}
