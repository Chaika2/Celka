/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rzd_3;
import celestial.rzk_3;
import com.google.common.collect.Sets;
import java.util.Set;

public class rzW_2 {
    private final Set<rzd_3<?>> id_class = Sets.newIdentityHashSet();
    private final Set<rzd_3<?>> id_break = Sets.newIdentityHashSet();

    public rzk_3 id_class() {
        return new rzk_3(this.id_class, this.id_break);
    }

    public rzW_2 id_class(rzd_3<?> rzd_32) {
        if (this.id_break.contains(rzd_32)) {
            throw new IllegalArgumentException("Parameter " + rzd_32.id_class() + " is already optional");
        }
        this.id_class.add(rzd_32);
        return this;
    }

    public rzW_2 id_break(rzd_3<?> rzd_32) {
        if (this.id_class.contains(rzd_32)) {
            throw new IllegalArgumentException("Parameter " + rzd_32.id_class() + " is already required");
        }
        this.id_break.add(rzd_32);
        return this;
    }
}

