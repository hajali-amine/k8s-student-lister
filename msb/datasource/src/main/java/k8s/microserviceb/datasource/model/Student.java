package k8s.microserviceb.datasource.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    @Setter(onMethod = @__(@JsonSetter(value = "class")))
    @Getter(onMethod = @__(@JsonGetter(value = "class")))
    private String classLevel;
    private String option;
    private int group;
}
