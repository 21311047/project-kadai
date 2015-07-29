package UserRegister.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by KAJIWARAYutaka on 2015/04/18.
 */
@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @javax.persistence.Id
    private int id;
    private String name;
}
