package UserRegister.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by KAJIWARAYutaka on 2015/05/09.
 */
@Data
public class StudentForm {
    @NotNull
    @Size(min = 1,max= 128)
    private String name;
    @NotNull
    private Integer id;
}
