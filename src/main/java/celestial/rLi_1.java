/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.rLY;
import celestial.rVL;
import celestial.rqO_2;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class rLi_1 {
    private final String id_class;
    private final ImmutableList<rLY> id_break;

    public rLi_1(String string, rLY ... rLYArray) {
        this.id_class = string;
        this.id_break = ImmutableList.copyOf((Object[])rLYArray);
    }

    public rLi_1(rLY ... rLYArray) {
        this((String)null, rLYArray);
    }

    public List<rLY> id_class() {
        return this.id_break;
    }

    public static rLi_1 id_class(String string) {
        return rVL.id_double.id_class(rqO_2.id_break(string));
    }

    public boolean id_break() {
        if (!this.id_break.isEmpty()) {
            for (rLY rLY2 : this.id_break) {
                if (!rLY2.id_class().id_class()) continue;
                return true;
            }
        }
        return false;
    }

    public String id_break(String string) {
        return string + (this.id_class == null ? rVL.id_double.id_break(this).id_break() : this.id_class);
    }
}

