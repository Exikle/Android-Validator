package com.throrinstudio.android.common.libs.validator.validator.nonedittext;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import com.throrinstudio.android.common.libs.validator.AbstractValidator;

/**
 * TODO
 *
 * @author Dixon D'Cunha (Exikle)
 */
public class OneSelectedValidator extends AbstractValidator {

    /**
     * TODO
     *
     * @param c
     * @param errorMessageRes
     */
    public OneSelectedValidator(Context c, int errorMessageRes) {
        super(c, errorMessageRes);
    }

    @Override
    public boolean isValid(String value) {
        return true;
    }

    public boolean hasOneChecked(RadioGroup rg) {
        int x = rg.getCheckedRadioButtonId();
        return x != -1;
    }

    public boolean hasOneChecked(CheckBox cb) {
        return cb.isChecked();
    }

}
