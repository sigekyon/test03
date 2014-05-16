package test.app18;

public @interface Dependon {
	String value() default "sample22.lib.Util";
	String description() default "";
}