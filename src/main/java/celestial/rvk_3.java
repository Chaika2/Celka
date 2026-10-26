/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ruu_3;
import celestial.rvJ_2;
import java.io.IOException;

public class rvk_3
extends rvJ_2 {
    public rvk_3() {
        this.id_implements = true;
    }

    public rvk_3(int n, short s, short s2, short s3, boolean bl) {
        super(n);
        this.id_break = s;
        this.id_byte = s2;
        this.id_protected = s3;
        this.id_catch = bl;
        this.id_implements = true;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        super.id_class(ruu_32);
        this.id_break = ruu_32.readShort();
        this.id_byte = ruu_32.readShort();
        this.id_protected = ruu_32.readShort();
        this.id_catch = ruu_32.readBoolean();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        super.id_break(ruu_32);
        ruu_32.writeShort(this.id_break);
        ruu_32.writeShort(this.id_byte);
        ruu_32.writeShort(this.id_protected);
        ruu_32.writeBoolean(this.id_catch);
    }
}

