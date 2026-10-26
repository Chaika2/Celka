/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.ryT_2;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class ryt_3 {
    private final List<String> id_class = Lists.newArrayList();

    public ryt_3 id_class(String string) {
        this.id_class.add(string);
        return this;
    }

    public ryT_2 id_class(Writer writer) throws IOException {
        return new ryT_2(writer, this.id_class);
    }
}

