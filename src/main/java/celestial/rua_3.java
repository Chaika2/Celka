/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmb_3;
import celestial.ruu_3;

public class rua_3
implements rmb_3<Float> {
    @Override
    public Float id_class(Float f) {
        return f;
    }

    @Override
    public Float id_class(ruu_3 ruu_32) {
        return Float.valueOf(ruu_32.readFloat());
    }

    @Override
    public void id_class(ruu_3 ruu_32, Float f) {
        ruu_32.writeFloat(f.floatValue());
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

