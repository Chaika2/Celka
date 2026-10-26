/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rfH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvw_3
implements ruS_2<At_1> {
    private int id_class;
    private rfH_2 id_break;
    private int id_byte;
    private boolean id_protected;

    public int id_byte() {
        return this.id_class;
    }

    public rvw_3() {
    }

    public rvw_3(int n, rfH_2 rfH_22, int n2, boolean bl) {
        this.id_class = n;
        this.id_break = rfH_22.id_int();
        this.id_byte = n2;
        this.id_protected = bl;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readInt();
        this.id_break = ruu_32.id_byte();
        this.id_byte = ruu_32.readInt();
        this.id_protected = ruu_32.readBoolean();
    }

    public boolean id_break() {
        return this.id_protected;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeInt(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.writeInt(this.id_byte);
        ruu_32.writeBoolean(this.id_protected);
    }

    public rfH_2 id_throws() {
        return this.id_break;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

