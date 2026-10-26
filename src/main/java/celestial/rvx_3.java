/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ruu_3;
import celestial.rvJ_2;
import java.io.IOException;

public class rvx_3
extends rvJ_2 {
    public rvx_3() {
        this.id_private = true;
    }

    public rvx_3(int n, byte by, byte by2, boolean bl) {
        super(n);
        this.id_throws = by;
        this.id_case = by2;
        this.id_private = true;
        this.id_catch = bl;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        super.id_class(ruu_32);
        this.id_throws = ruu_32.readByte();
        this.id_case = ruu_32.readByte();
        this.id_catch = ruu_32.readBoolean();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        super.id_break(ruu_32);
        ruu_32.writeByte(this.id_throws);
        ruu_32.writeByte(this.id_case);
        ruu_32.writeBoolean(this.id_catch);
    }
}

