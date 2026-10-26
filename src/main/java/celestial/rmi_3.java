/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmi_3
implements ruS_2<rmH_2> {
    private rfH_2 id_class;
    private int id_break;
    private boolean id_byte;

    public int id_byte() {
        return this.id_break;
    }

    public rmi_3() {
    }

    public rmi_3(rfH_2 rfH_22, int n, boolean bl) {
        this.id_class = rfH_22;
        this.id_break = n;
        this.id_byte = bl;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
        this.id_break = ruu_32.id_case();
        this.id_byte = ruu_32.readBoolean();
    }

    public rfH_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_protected(this.id_break);
        ruu_32.writeBoolean(this.id_byte);
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

