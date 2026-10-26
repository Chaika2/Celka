/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 */
package celestial;

import celestial.rQs_1;
import celestial.rWo_1;
import celestial.rzd_3;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class rzk_3 {
    private final Set<rzd_3<?>> id_class;
    private final Set<rzd_3<?>> id_break;

    public rzk_3(Set<rzd_3<?>> set, Set<rzd_3<?>> set2) {
        this.id_class = ImmutableSet.copyOf(set);
        this.id_break = ImmutableSet.copyOf((Collection)Sets.union(set, set2));
    }

    public String toString() {
        return "[" + Joiner.on((String)", ").join(this.id_break.stream().map(rzd_32 -> (this.id_class.contains(rzd_32) ? "!" : "") + rzd_32.id_class()).iterator()) + "]";
    }

    public Set<rzd_3<?>> id_class() {
        return this.id_class;
    }

    public void id_class(rQs_1 rQs_12, rWo_1 rWo_12) {
        Set<rzd_3<?>> set = rWo_12.id_class();
        Sets.SetView setView = Sets.difference(set, this.id_break);
        if (!setView.isEmpty()) {
            rQs_12.id_class("Parameters " + (Set)setView + " are not provided in this context");
        }
    }

    public Set<rzd_3<?>> id_break() {
        return this.id_break;
    }
}

