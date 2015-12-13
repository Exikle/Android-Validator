package com.throrinstudio.android.common.libs.validator.validator;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import com.throrinstudio.android.common.libs.validator.AbstractValidator;

/**
 * TODO
 *
 * @author Dixon D'Cunha (Exikle)
 */
public class RadioGroupSelectedValidator extends AbstractValidator {

    private final int NONE_SELECTED = -1;

    /**
     * TODO
     *
     * @param c
     * @param errorMessageRes
     */
    public RadioGroupSelectedValidator(Context c, int errorMessageRes) {
        super(c, errorMessageRes);
    }

    @Override
    public boolean isValid(String value) {
        return true;
    }

    public boolean hasOneChecked(RadioGroup radioGroup) {
        int amountChecked = radioGroup.getCheckedRadioButtonId();
        return (amountChecked != NONE_SELECTED);
    }

    public boolean hasOneChecked(CheckBox checkBox) {
        return checkBox.isChecked();
    }

}
