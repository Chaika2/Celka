/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LV;
import celestial.mV_2;
import celestial.mf_3;
import celestial.rYG;
import celestial.rqM_2;
import java.util.Comparator;

public class mj_3
extends LV<mV_2> {
    public final /* synthetic */ mf_3 id_class;

    public mj_3(mf_3 mf_32) {
        this.id_class = mf_32;
        super(mf_32.id_volatile, mf_32.id_package, mf_32.id_int, 40, mf_32.id_int - 37, 16);
        mf_32.id_catch.id_throws().stream().sorted(Comparator.comparing(entry -> ((rqM_2)entry.getKey()).id_class().toString())).forEach(entry -> this.id_break(new mV_2(this, (rYG)entry.getValue())));
    }

    @Override
    public void id_class(mV_2 mV_22) {
        super.id_class(mV_22);
        if (mV_22 != null) {
            this.id_class.id_implements = mV_22.id_break;
        }
        this.id_class.id_finally();
    }

    @Override
    protected boolean id_class() {
        return this.id_class.id_catch() == this;
    }
}

