/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmg_3
implements ruS_2<rmH_2> {
    private int id_class;
    private short id_break;
    private boolean id_byte;

    public short id_byte() {
        return this.id_break;
    }

    public rmg_3() {
    }

    public rmg_3(int n, short s, boolean bl) {
        this.id_class = n;
        this.id_break = s;
        this.id_byte = bl;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readByte();
        this.id_break = ruu_32.readShort();
        this.id_byte = ruu_32.readByte() != 0;
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.writeShort(this.id_break);
        ruu_32.writeByte(this.id_byte ? 1 : 0);
    }
}

