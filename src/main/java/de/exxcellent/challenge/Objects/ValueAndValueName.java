package de.exxcellent.challenge.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ValueAndValueName {

    @Getter
    @Setter
    private int intValue;

    @Getter
    @Setter
    private String valueName;
}
