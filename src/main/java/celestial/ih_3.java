/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.an_3;
import celestial.is_3;
import com.google.common.collect.Lists;
import java.util.List;

public class ih_3 {
    private final is_3 id_class;
    private final List<an_3> id_break = Lists.newArrayList();
    private final List<an_3> id_byte = Lists.newArrayList();

    public ih_3(is_3 is_32) {
        this.id_class = is_32;
    }

    public void id_class() {
        this.id_break.clear();
        this.id_byte.clear();
    }

    public boolean id_class(an_3 an_32) {
        if (this.id_break.contains(an_32)) {
            return true;
        }
        if (this.id_byte.contains(an_32)) {
            return false;
        }
        boolean bl = this.id_class.id_while(an_32);
        if (bl) {
            this.id_break.add(an_32);
        } else {
            this.id_byte.add(an_32);
        }
        return bl;
    }
}

