package com.finalproject.automated.refactoring.tool.longg.parameter.methods.detection.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

import java.util.List;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

public interface LongParameterMethodsDetection {

    MethodModel detect(@lombok.NonNull MethodModel methodModel , @NonNull Long threshold);

    List<MethodModel> detect(@lombok.NonNull List<MethodModel> methodModel , @NonNull Long threshold);
}
