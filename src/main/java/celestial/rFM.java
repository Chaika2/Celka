/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rdn_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFM
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;
    private rdn_3 id_byte = rdn_3.id_break;

    public int id_byte() {
        return this.id_break;
    }

    public rFM() {
    }

    public rFM(int n, int n2, rdn_3 rdn_32) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = rdn_32.id_implements();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readByte();
        this.id_break = ruu_32.readShort();
        this.id_byte = ruu_32.id_extends();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.writeShort(this.id_break);
        ruu_32.id_class(this.id_byte);
    }

    public int id_break() {
        return this.id_class;
    }

    public rdn_3 id_protected() {
        return this.id_byte;
    }
}

