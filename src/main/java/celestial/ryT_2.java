/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringEscapeUtils
 */
package celestial;

import celestial.ryt_3;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;

public class ryT_2 {
    private final Writer id_class;
    private final int id_break;

    public ryT_2(Writer writer, List<String> list) throws IOException {
        this.id_class = writer;
        this.id_break = list.size();
        this.id_class(list.stream());
    }

    private static String id_class(Object object) {
        return StringEscapeUtils.escapeCsv((String)(object != null ? object.toString() : "[null]"));
    }

    private void id_class(Stream<?> stream) throws IOException {
        this.id_class.write(stream.map(ryT_2::id_class).collect(Collectors.joining(",")) + "\r\n");
    }

    public void id_class(Object ... objectArray) throws IOException {
        if (objectArray.length != this.id_break) {
            throw new IllegalArgumentException("Invalid number of columns, expected " + this.id_break + ", but got " + objectArray.length);
        }
        this.id_class(Stream.of(objectArray));
    }

    public static ryt_3 id_class() {
        return new ryt_3();
    }
}

