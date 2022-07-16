package tdcc.lab.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Category implements Serializable {
    private String categoryId;
    private String name;
    private String description;
}
