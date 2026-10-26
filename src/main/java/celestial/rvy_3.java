/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rfH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvy_3
implements ruS_2<At_1> {
    private rfH_2 id_class;

    public rvy_3() {
    }

    public rvy_3(rfH_2 rfH_22) {
        this.id_class = rfH_22;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public rfH_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }
}

