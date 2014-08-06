package com.throrinstudio.android.common.libs.validator.validator;

import android.content.Context;

import com.throrinstudio.android.common.libs.validator.AbstractValidator;

/**
 * Just a mock validator to use as a coding place holder. Always returns true.
 *
 * @author Dixon D'Cunha (Exikle)
 */
public class MockValidator extends AbstractValidator {

    /**
     * Sets the error as "NO ERROR"
     */
    private static final String DEFAULT_ERROR_MESSAGE_RESOURCE = "NO ERROR";

    public MockValidator(Context c) {
        super(c, DEFAULT_ERROR_MESSAGE_RESOURCE);
    }

    public MockValidator(Context c, String errorMessage) {
        super(c, errorMessage);
    }

    public MockValidator(Context c, int errorMessageId) {
        super(c, errorMessageId);
    }

    @Override
    public boolean isValid(String value) {
        return true;
    }

}
