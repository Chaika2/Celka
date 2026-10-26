/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFy_1
implements ruS_2<At_1> {
    private rfH_2 id_class;
    private int id_break;
    private rcd_3 id_byte;

    public int id_byte() {
        return this.id_break;
    }

    public rFy_1() {
    }

    public rFy_1(rfH_2 rfH_22, int n, rcd_3 rcd_32) {
        this.id_class = rfH_22;
        this.id_break = n;
        this.id_byte = rcd_32;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
        this.id_break = ruu_32.readUnsignedByte();
        this.id_byte = ruu_32.id_implements();
    }

    public rfH_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.writeByte((byte)this.id_break);
        ruu_32.id_class(this.id_byte);
    }

    public rcd_3 id_protected() {
        return this.id_byte;
    }
}

