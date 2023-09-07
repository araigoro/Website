package com.example.demo.form.Validation;

import jakarta.validation.GroupSequence;

/**
 * バリデーションの順番を定義
 */
@GroupSequence({ ValidBlank.class, ValidLength.class, ValidPattern.class })
public interface ValidOrder {

}
