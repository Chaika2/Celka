/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZj_1
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;

    public int id_byte() {
        return this.id_break;
    }

    public rZj_1() {
    }

    public rZj_1(an_3 an_32, int n) {
        this.id_class = an_32.V();
        this.id_break = n;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.readUnsignedByte();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.writeByte(this.id_break);
    }

    public int id_break() {
        return this.id_class;
    }
}

