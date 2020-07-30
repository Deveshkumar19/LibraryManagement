package com.Devesh.Project.LibraryMangement.Service;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy={})
//@ReportAsSingleViolation
@Pattern(regexp=UserNameValidation.PATTERN,message="Allows combination of following characters :[a-zA-Z]")
//@Size(min=3, max=10)
public @interface UserNameValidation {

    String PATTERN="^[a-zA-Z]*$";
    String message() default "Invalid User Name" ;
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
