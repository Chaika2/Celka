/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rhx_3;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZG
implements ruS_2<rmH_2> {
    private boolean id_class;

    public rZG() {
    }

    public rZG(rhx_3 rhx_32) {
        this.id_class = rhx_32.id_break;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        byte by = ruu_32.readByte();
        this.id_class = (by & 2) != 0;
    }

    public boolean id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        int n = 0;
        if (this.id_class) {
            n = (byte)(n | 2);
        }
        ruu_32.writeByte(n);
    }
}

