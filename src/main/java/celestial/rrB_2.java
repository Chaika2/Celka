/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.il_3;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rrB_2
extends rrr_3<iB_2> {
    private List<iB_2> id_byte(iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_private).orElse(Lists.newArrayList());
    }

    private List<iB_2> id_class(iB_2 iB_22) {
        return this.id_byte(iB_22).stream().filter(this::id_break).collect(Collectors.toList());
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_implements);
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        iB_22.SF().id_class(il_3.id_implements, this.id_class(iB_22));
    }

    private boolean id_break(iB_2 iB_22) {
        return iB_22.BC() == aI_2.D && iB_22.n_();
    }
}

