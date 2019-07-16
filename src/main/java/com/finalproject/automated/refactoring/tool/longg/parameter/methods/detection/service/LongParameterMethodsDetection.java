package com.finalproject.automated.refactoring.tool.longg.parameter.methods.detection.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

public interface LongParameterMethodsDetection {

    void detect(@NonNull MethodModel methodModel, @NonNull Long threshold);

    void detect(@NonNull List<MethodModel> methodModels, @NonNull Long threshold);
}
