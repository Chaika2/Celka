/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rRO;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFE
implements ruS_2<At_1> {
    private rRO id_class;
    private boolean id_break;

    public rRO id_byte() {
        return this.id_class;
    }

    public rFE() {
    }

    public rFE(rRO rRO2, boolean bl) {
        this.id_class = rRO2;
        this.id_break = bl;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = rRO.id_class(ruu_32.readUnsignedByte());
        this.id_break = ruu_32.readBoolean();
    }

    public boolean id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class.id_class());
        ruu_32.writeBoolean(this.id_break);
    }
}

