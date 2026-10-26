/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rle_3;
import com.google.common.collect.Lists;
import java.util.Collection;

public class rlT_2 {
    public static final rlT_2 id_class = new rlT_2();
    private final Collection<rle_3> id_break = Lists.newCopyOnWriteArrayList();

    public void id_class(rle_3 rle_32) {
        this.id_break.add(rle_32);
    }

    public void id_class() {
        this.id_break.clear();
    }

    public void id_break() {
        this.id_break.forEach(rle_3::id_break);
        this.id_break.removeIf(rle_3::id_implements);
    }
}

