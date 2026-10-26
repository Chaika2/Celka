/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmb_3;
import celestial.ruu_3;

public class rms_3
implements rmb_3<Boolean> {
    @Override
    public Boolean id_class(Boolean bl) {
        return bl;
    }

    @Override
    public Boolean id_class(ruu_3 ruu_32) {
        return ruu_32.readBoolean();
    }

    @Override
    public void id_class(ruu_3 ruu_32, Boolean bl) {
        ruu_32.writeBoolean(bl);
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

