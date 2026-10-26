/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZU
implements ruS_2<At_1> {
    private int id_class;

    public rZU() {
    }

    public rZU(int n) {
        this.id_class = n;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readUnsignedByte();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
    }
}

