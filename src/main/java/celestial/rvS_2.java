/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvS_2
implements ruS_2<At_1> {
    private int id_class;
    private short id_break;
    private boolean id_byte;

    public short id_byte() {
        return this.id_break;
    }

    public rvS_2() {
    }

    public rvS_2(int n, short s, boolean bl) {
        this.id_class = n;
        this.id_break = s;
        this.id_byte = bl;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readUnsignedByte();
        this.id_break = ruu_32.readShort();
        this.id_byte = ruu_32.readBoolean();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.writeShort(this.id_break);
        ruu_32.writeBoolean(this.id_byte);
    }

    public int id_break() {
        return this.id_class;
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

