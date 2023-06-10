package dto.reviewDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectDTO {

    private long id;

    private String name;

    private String description;

    private String workedFor;
}
