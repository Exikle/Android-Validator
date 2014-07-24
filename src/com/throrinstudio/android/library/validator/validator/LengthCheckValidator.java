package com.throrinstudio.android.common.libs.validator.validator;

import android.content.Context;

import com.throrinstudio.android.common.libs.validator.AbstractValidator;
import com.throrinstudio.android.common.libs.validator.R;

/**
 * Checks if the length of the text in the edit text is between a min/max.
 * 
 * @author Dixon D'Cunha (Exikle)
 */
public class LengthCheckValidator extends AbstractValidator {

	/**
	 * Default error message if none specified.
	 */
	private static final int DEFAULT_ERROR_MESSAGE_RESOURCE = R.string.validator_len;

	/**
	 * The minimum length of the word.
	 */
	private int min;

	/**
	 * The maximum length of the word.
	 */
	private int max;

	/**
	 * Create validator that match text length with a default error message.
	 * 
	 * @param c
	 * @param minLength
	 * @param maxLength
	 */
	public LengthCheckValidator(Context c, int minLength,
			int maxLength) {
		super(c, DEFAULT_ERROR_MESSAGE_RESOURCE);
		min = minLength;
		max = maxLength;
	}

	/**
	 * Create validator that match text length.
	 * 
	 * @param c
	 * @param minLength
	 * @param maxLength
	 * @param errorMessageRes
	 */
	public LengthCheckValidator(Context c, int minLength,
			int maxLength, int errorMessageRes) {
		super(c, errorMessageRes);
		min = minLength;
		max = maxLength;
	}

	/**
	 * Create validator that match text length.
	 * 
	 * @param c
	 * @param minLength
	 * @param maxLength
	 * @param errorMessage
	 */
	public LengthCheckValidator(Context c, int minLength,
			int maxLength, String errorMessage) {
		super(c, errorMessage);
		min = minLength;
		max = maxLength;
	}

	@Override
	public boolean isValid(String value) {
		int length = value.length();
		return length >= min && length <= max;
	}

}
