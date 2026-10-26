/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.rLR;
import celestial.rYB;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFr_1
implements ruS_2<At_1> {
    private int id_class;
    private rLR id_break;

    public rFr_1() {
    }

    public rFr_1(int n, rLR rLR2) {
        this.id_class = n;
        this.id_break = rLR2;
    }

    public an_3 id_class(rYB rYB2) {
        return rYB2.id_break(this.id_class);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = rLR.id_class(ruu_32.readUnsignedByte());
    }

    public rLR id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.writeByte(rLR.id_class(this.id_break));
    }
}

