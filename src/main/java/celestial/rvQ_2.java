/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.rYB;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvQ_2
implements ruS_2<At_1> {
    private int id_class;
    private byte id_break;

    public rvQ_2() {
    }

    public rvQ_2(an_3 an_32, byte by) {
        this.id_class = an_32.V();
        this.id_break = by;
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
        this.id_class = ruu_32.readInt();
        this.id_break = ruu_32.readByte();
    }

    public byte id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeInt(this.id_class);
        ruu_32.writeByte(this.id_break);
    }
}

