package kodlamaio.HRMS.core.abstracts;

public interface EmailValidatorService {
	boolean checkedEmailSyntax(String email);
	int sendEmailValidator();
	boolean reciveEmailValidator (int validatorCode);
}
