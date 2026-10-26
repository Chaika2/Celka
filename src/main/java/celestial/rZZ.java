/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRO;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZZ
implements ruS_2<rmH_2> {
    private rRO id_class;

    public rZZ() {
    }

    public rZZ(rRO rRO2) {
        this.id_class = rRO2;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = rRO.id_class(ruu_32.readUnsignedByte());
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    public rRO id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class.id_class());
    }
}

