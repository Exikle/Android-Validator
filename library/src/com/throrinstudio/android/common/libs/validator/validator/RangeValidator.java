package com.throrinstudio.android.common.libs.validator.validator;

import android.content.Context;

import com.throrinstudio.android.common.libs.validator.AbstractValidator;
import com.throrinstudio.android.common.libs.validator.R;

/**
 * Validates whether the given value is between a range of values
 *
 * @author Dixon D'Cunha (Exikle)
 */
public class RangeValidator extends AbstractValidator {

    /**
     * Default error message if none specified
     */
    private static final int DEFAULT_ERROR_MESSAGE_RESOURCE = R.string.validator_range;
    /**
     * The start of the range
     */
    final double START_RANGE;
    /**
     * The end of the range
     */
    final double END_RANGE;

    public RangeValidator(Context c, double start, double end) {
        super(c, DEFAULT_ERROR_MESSAGE_RESOURCE);
        START_RANGE = start;
        END_RANGE = end;
    }

    /**
     * @param context
     * @param start           of the range
     * @param end             of the range
     * @param errorMessageRes
     */
    public RangeValidator(Context c, double start, double end,
                          int errorMessageRes) {
        super(c, errorMessageRes);
        START_RANGE = start;
        END_RANGE = end;
    }

    /**
     * @param context
     * @param start           of the range
     * @param end             of the range
     * @param errorMessageRes
     */
    public RangeValidator(Context c, double start, double end,
                          String errorMessage) {
        super(c, errorMessage);
        START_RANGE = start;
        END_RANGE = end;
    }

    /**
     * Checks is value is between given range
     *
     * @return true if between range; false if outside of range
     */
    @Override
    public boolean isValid(String value) {
        if (value != null && value.length() > 0) {
            double inputedSize = Double.parseDouble(value);
            return inputedSize >= START_RANGE
                    && inputedSize <= END_RANGE;
        } else
            return false;
    }
}