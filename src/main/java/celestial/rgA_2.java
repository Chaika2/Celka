/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rgS_2;
import com.google.common.collect.Lists;
import java.util.List;

public class rgA_2 {
    private final List<rgS_2> id_class = Lists.newArrayList();

    public rgS_2 id_class() {
        if (this.id_class.isEmpty()) {
            return null;
        }
        return this.id_class.size() == 1 ? this.id_class.get(0) : rgS_2.id_class(this.id_class);
    }

    public void id_class(rgS_2 rgS_22) {
        this.id_class.add(rgS_22);
    }

    public rgS_2 id_break() {
        rgS_2 rgS_22 = this.id_class();
        return rgS_22 != null ? rgS_22 : rgS_2.id_break;
    }
}

