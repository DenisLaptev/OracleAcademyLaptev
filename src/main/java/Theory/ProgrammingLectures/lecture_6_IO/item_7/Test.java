package Theory.ProgrammingLectures.lecture_6_IO.item_7;

import java.io.Serializable;

/**
 * Created by Kovantonlenko on 12/1/2015.
 */
public class Test implements Serializable {
    public String field = "test";

    @Override
    public String toString() {
        return "Test{" +
                "field='" + field + '\'' +
                '}';
    }
}
