package Java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address{
    private String state;
    private String city;
    private String houseAddress;
    private int pinCode;

}