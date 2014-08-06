package com.throrinstudio.android.common.libs.validator.validator;

import android.content.Context;

import com.throrinstudio.android.common.libs.validator.AbstractValidator;
import com.throrinstudio.android.common.libs.validator.R;

/**
 * Checks if the text in the editText matches another text.
 *
 * @author Dixon D'Cunha (Exikle)
 */
public class TextMatchValidator extends AbstractValidator {

    /**
     * Default error message if none specified.
     */
    private static final int DEFAULT_ERROR_MESSAGE_RESOURCE = R.string.validator_len;

    /**
     * String that the text must match
     */
    private String toMatch;

    public TextMatchValidator(Context c, String str) {
        super(c, DEFAULT_ERROR_MESSAGE_RESOURCE);
        toMatch = str;
    }

    public TextMatchValidator(Context c, int errorMessageRes,
                              String str) {
        super(c, errorMessageRes);
        toMatch = str;
    }

    public TextMatchValidator(Context c, String errorMessage,
                              String str) {
        super(c, errorMessage);
        toMatch = str;
    }

    @Override
    public boolean isValid(String value) {
        return toMatch.equals(value);
    }

}
