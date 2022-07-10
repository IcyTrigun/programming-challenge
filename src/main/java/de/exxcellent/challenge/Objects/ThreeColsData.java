package de.exxcellent.challenge.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ThreeColsData {

    @Getter
    @Setter
    private String valueCol;

    @Getter
    @Setter
    private int intValue1Col;

    @Getter
    @Setter
    private int intValue2Col;

}
