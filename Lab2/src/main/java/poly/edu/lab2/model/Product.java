package poly.edu.lab2.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
String name;
Double price;
}
