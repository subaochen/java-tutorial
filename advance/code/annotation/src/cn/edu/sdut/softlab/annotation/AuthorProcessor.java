package cn.edu.sdut.softlab.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * Created by subaochen on 17-4-8.
 */
@SupportedAnnotationTypes("cn.edu.sdut.softlab.annotation.Author")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class AuthorProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        for (Element elem : roundEnvironment.getElementsAnnotatedWith(Author.class)) {
            Author author = elem.getAnnotation(Author.class);
            String message = "annotation found in " + elem.getSimpleName()
                    + " with author " + author;
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, message);
        }
        return false; // no further processing of this annotation type
    }
}
