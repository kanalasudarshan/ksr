package com.ksr.admin.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ksr.admin.dto.UserDTO;

public class UserEntityValidator implements Validator {
	public boolean supports(Class<?> paramClass) {
        return UserDTO.class.equals(paramClass);
    }
 
    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.required");
         
        UserDTO userDTO = (UserDTO) obj;
        /*if(userDTO.getId() <=0){
            errors.rejectValue("id", "negativeValue", new Object[]{"'id'"}, "id can't be negative");
        }
         */
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "gender.required");
    }
}
