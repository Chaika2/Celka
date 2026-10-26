/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rNA;
import celestial.rNL;
import celestial.rWg_1;
import celestial.rzL_2;
import celestial.rzN_2;
import celestial.rzc_3;
import celestial.rzk_3;
import com.google.common.collect.Lists;
import java.util.List;

public class rzA_2
implements rWg_1<rzA_2> {
    private final List<rzN_2> id_class = Lists.newArrayList();
    private final List<rNL> id_break = Lists.newArrayList();
    private rzk_3 id_byte = rzL_2.id_break;

    @Override
    public /* synthetic */ Object id_class(rNA rNA2) {
        return this.id_break(rNA2);
    }

    public rzA_2 id_class() {
        return this;
    }

    public rzA_2 id_class(rzc_3 rzc_32) {
        this.id_class.add(rzc_32.id_break());
        return this;
    }

    public rzA_2 id_class(rzk_3 rzk_32) {
        this.id_byte = rzk_32;
        return this;
    }

    public rzA_2 id_break(rNA rNA2) {
        this.id_break.add(rNA2.id_case());
        return this;
    }

    public rzL_2 id_break() {
        return new rzL_2(this.id_byte, this.id_class.toArray(new rzN_2[0]), this.id_break.toArray(new rNL[0]));
    }

    @Override
    public /* synthetic */ Object id_protected() {
        return this.id_class();
    }
}

