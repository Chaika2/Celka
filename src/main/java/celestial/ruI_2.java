/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmb_3;
import celestial.ruu_3;

public class ruI_2
implements rmb_3<Byte> {
    @Override
    public Byte id_class(Byte by) {
        return by;
    }

    @Override
    public Byte id_class(ruu_3 ruu_32) {
        return ruu_32.readByte();
    }

    @Override
    public void id_class(ruu_3 ruu_32, Byte by) {
        ruu_32.writeByte(by.byteValue());
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

