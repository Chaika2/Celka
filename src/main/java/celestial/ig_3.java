/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.il_3;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ig_3
extends rrr_3<iB_2> {
    public ig_3() {
        this(200);
    }

    public ig_3(int n) {
        super(n);
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_catch);
    }

    public static void id_class(iB_2 iB_23) {
        boolean bl;
        Optional<List<iB_2>> optional = iB_23.SF().id_byte(il_3.id_catch);
        if (optional.isPresent() && (bl = optional.get().stream().anyMatch(iB_22 -> iB_22.BC().equals(aI_2.id_import)))) {
            ig_3.id_break(iB_23);
        }
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        ig_3.id_class(iB_22);
    }

    public static void id_break(iB_2 iB_22) {
        iB_22.SF().id_class(il_3.id_char, true, 600L);
    }
}

