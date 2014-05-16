package test.app18;

public @interface ClassInformation {
	String author();
	double version() default 1.0;
	Dependon dependon();
}