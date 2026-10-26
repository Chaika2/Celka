/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.aA_2;
import celestial.an_3;
import celestial.iX_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEB;
import celestial.rYB;
import celestial.rjU_2;
import celestial.rrEm_1;
import celestial.rrEr_1;
import celestial.rrEs_1;
import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

public class rBq_1<T extends rEB>
extends rBk_1 {
    private final T id_class;

    public rBq_1(T t) {
        this.id_class = t;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    private void id_class(rrEr_1 rrEr_12) {
        if (rrEr_12.id_this()) {
            HashSet hashSet = Sets.newHashSet();
            List<rEB> list = ((rYB)((rEB)this.id_class).id_throws[7]).id_class(rEB.class, ((an_3)this.id_class).rN().id_class(16.0), rEB2 -> !rEB2.sd() && rrEs_1.id_class(rEB2, rrEr_12));
            hashSet.addAll(list);
            for (rEB rEB3 : hashSet) {
                rrEr_12.id_class(rrEr_12.id_implements(), rEB3, null, true);
            }
        }
    }

    @Override
    public boolean id_class() {
        return ((is_3)this.id_class).I_() == null && !((an_3)this.id_class).BP() && ((rEB)this.id_class).sd() && !((rEB)this.id_class).sx().id_class() && !((rrEm_1)((rYB)((rEB)this.id_class).id_throws[7])).id_throw(((an_3)this.id_class).Bs());
    }

    @Override
    public boolean id_break() {
        return ((rEB)this.id_class).sd() && !((rEB)this.id_class).sx().id_class() && (rYB)((rEB)this.id_class).id_throws[7] instanceof rrEm_1 && !((rrEm_1)((rYB)((rEB)this.id_class).id_throws[7])).id_throw(((an_3)this.id_class).Bs());
    }

    @Override
    public void id_throws() {
        if (((rEB)this.id_class).sd()) {
            rjU_2 rjU_22;
            rrEr_1 rrEr_12 = ((rEB)this.id_class).sx();
            if ((Integer)((rEB)this.id_class).id_throws[41] % 20 == 0) {
                this.id_class(rrEr_12);
            }
            if (!((aA_2)this.id_class).id_catch() && (rjU_22 = iX_2.id_break(this.id_class, 15, 4, rjU_2.id_protected(rrEr_12.id_continue()))) != null) {
                ((is_3)this.id_class).id_public().id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, 1.0);
            }
        }
    }
}

