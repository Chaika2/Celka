/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.au_3;
import celestial.iB_2;
import celestial.il_3;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class io_3
extends rrr_3<au_3> {
    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_void, il_3.id_private);
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, au_3 au_32) {
        au_32.SF().id_byte(il_3.id_private).ifPresent(list -> this.id_class(au_32, (List<iB_2>)list));
    }

    private void id_class(au_3 au_33, List<iB_2> list) {
        Optional<au_3> optional = list.stream().filter(iB_22 -> iB_22.BC() == au_33.BC()).map(iB_22 -> (au_3)iB_22).filter(au_32 -> !au_32.n_()).findFirst();
        au_33.SF().id_class(il_3.id_void, optional);
    }
}

