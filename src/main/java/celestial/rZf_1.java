/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rfH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZf_1
implements ruS_2<At_1> {
    private int id_class;
    private rfH_2 id_break;
    private int id_byte;

    public rfH_2 id_byte() {
        return this.id_break;
    }

    public rZf_1() {
    }

    public rZf_1(int n, rfH_2 rfH_22, int n2) {
        this.id_class = n;
        this.id_break = rfH_22;
        this.id_byte = n2;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_byte();
        this.id_byte = ruu_32.readUnsignedByte();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.writeByte(this.id_byte);
    }

    public int id_protected() {
        return this.id_byte;
    }
}

