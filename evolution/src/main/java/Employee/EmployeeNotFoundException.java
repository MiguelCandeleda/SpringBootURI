package Employee;

class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException(Long id) {
		super("No se puede encontrar al empleado " + id);
	}
}
