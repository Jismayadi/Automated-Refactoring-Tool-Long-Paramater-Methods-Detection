package com.finalproject.automated.refactoring.tool.longg.parameter.methods.detection.service.implementation;

import com.finalproject.automated.refactoring.tool.longg.parameter.methods.detection.service.LongParameterMethodsDetection;
import com.finalproject.automated.refactoring.tool.model.CodeSmellName;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

@Service
public class LongParameterMethodsDetectionImpl implements LongParameterMethodsDetection {

    private static final Integer FIRST_INDEX = 0;

    @Override
    public MethodModel detect(@NonNull MethodModel methodModel, @NonNull Long threshold) {
        try {
            return detect(Collections.singletonList(methodModel), threshold)
                    .get(FIRST_INDEX);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public List<MethodModel> detect(@NonNull List<MethodModel> methodModel, @NonNull Long threshold) {
        return methodModel.stream()
                .filter(methodModels -> isLongParameterMethods(methodModels, threshold))
                .collect(Collectors.toList());
    }

    public Boolean isLongParameterMethods(MethodModel methodModel , Long threshold){
        return methodModel.getParameters().size() > threshold;
    }
}
