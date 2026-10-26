/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjO_2;
import celestial.rmb_3;
import celestial.ruu_3;

public class ruj_3
implements rmb_3<rjO_2> {
    @Override
    public rjO_2 id_class(rjO_2 rjO_22) {
        return rjO_22;
    }

    @Override
    public rjO_2 id_class(ruu_3 ruu_32) {
        return new rjO_2(ruu_32.readFloat(), ruu_32.readFloat(), ruu_32.readFloat());
    }

    @Override
    public void id_class(ruu_3 ruu_32, rjO_2 rjO_22) {
        ruu_32.writeFloat(rjO_22.id_break());
        ruu_32.writeFloat(rjO_22.id_byte());
        ruu_32.writeFloat(rjO_22.id_protected());
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

