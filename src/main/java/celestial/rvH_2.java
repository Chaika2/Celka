/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvH_2
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;
    private int id_byte;

    public int id_byte() {
        return this.id_break;
    }

    public rvH_2() {
    }

    public rvH_2(int n, int n2, int n3) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readUnsignedByte();
        this.id_break = ruu_32.id_case();
        this.id_byte = ruu_32.readInt();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.id_protected(this.id_break);
        ruu_32.writeInt(this.id_byte);
    }

    public int id_break() {
        return this.id_class;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

