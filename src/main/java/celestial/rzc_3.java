/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rNA;
import celestial.rNL;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWK;
import celestial.rWg_1;
import celestial.rWj_1;
import celestial.rzE_2;
import celestial.rzG_2;
import celestial.rzN_2;
import celestial.rzV_2;
import com.google.common.collect.Lists;
import java.util.List;

public class rzc_3
implements rWg_1<rzc_3>,
rWj_1<rzc_3> {
    private final List<rzE_2> id_class = Lists.newArrayList();
    private final List<rQz_1> id_break = Lists.newArrayList();
    private final List<rNL> id_byte = Lists.newArrayList();
    private rWK id_protected = new rzV_2(1.0f);
    private rzV_2 id_throws = new rzV_2(0.0f, 0.0f);

    public rzc_3 id_class(rzG_2<?> rzG_22) {
        this.id_class.add(rzG_22.id_break());
        return this;
    }

    @Override
    public /* synthetic */ Object id_class(rQQ rQQ2) {
        return this.id_break(rQQ2);
    }

    @Override
    public /* synthetic */ Object id_class(rNA rNA2) {
        return this.id_break(rNA2);
    }

    public rzc_3 id_class(rWK rWK2) {
        this.id_protected = rWK2;
        return this;
    }

    public rzc_3 id_class() {
        return this;
    }

    public rzc_3 id_break(rNA rNA2) {
        this.id_byte.add(rNA2.id_case());
        return this;
    }

    public rzN_2 id_break() {
        if (this.id_protected == null) {
            throw new IllegalArgumentException("Rolls not set");
        }
        return new rzN_2(this.id_class.toArray(new rzE_2[0]), this.id_break.toArray(new rQz_1[0]), this.id_byte.toArray(new rNL[0]), this.id_protected, this.id_throws);
    }

    public rzc_3 id_break(rQQ rQQ2) {
        this.id_break.add(rQQ2.build());
        return this;
    }

    @Override
    public /* synthetic */ Object id_protected() {
        return this.id_class();
    }
}

