/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rVL;
import celestial.rfH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.xd_3;
import java.io.IOException;

public class rZV
implements ruS_2<At_1> {
    private rfH_2 id_class;
    private int id_break;
    private int id_byte;
    private xd_3 id_protected;

    public int id_byte() {
        return this.id_break;
    }

    public rZV() {
    }

    public rZV(rfH_2 rfH_22, xd_3 xd_32, int n, int n2) {
        this.id_class = rfH_22;
        this.id_protected = xd_32;
        this.id_break = n;
        this.id_byte = n2;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
        this.id_break = ruu_32.readUnsignedByte();
        this.id_byte = ruu_32.readUnsignedByte();
        this.id_protected = rVL.id_strictfp.id_class(ruu_32.id_case());
    }

    public rfH_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.writeByte(this.id_break);
        ruu_32.writeByte(this.id_byte);
        ruu_32.id_protected(rVL.id_strictfp.id_class(this.id_protected));
    }

    public xd_3 id_throws() {
        return this.id_protected;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

