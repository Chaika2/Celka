/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rma_3
implements ruS_2<rmH_2> {
    private float id_class;
    private float id_break;
    private boolean id_byte;
    private boolean id_protected;

    public float id_byte() {
        return this.id_break;
    }

    public rma_3() {
    }

    public rma_3(float f, float f2, boolean bl, boolean bl2) {
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = bl;
        this.id_protected = bl2;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readFloat();
        this.id_break = ruu_32.readFloat();
        byte by = ruu_32.readByte();
        this.id_byte = (by & 1) > 0;
        this.id_protected = (by & 2) > 0;
    }

    public float id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeFloat(this.id_class);
        ruu_32.writeFloat(this.id_break);
        byte by = 0;
        if (this.id_byte) {
            by = (byte)(by | 1);
        }
        if (this.id_protected) {
            by = (byte)(by | 2);
        }
        ruu_32.writeByte(by);
    }

    public boolean id_throws() {
        return this.id_protected;
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

