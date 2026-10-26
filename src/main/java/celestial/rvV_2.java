/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rgP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvV_2
implements ruS_2<At_1> {
    private rgP_2 id_class;
    private rgP_2 id_break;

    public rgP_2 id_byte() {
        return this.id_break;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws();
        this.id_break = ruu_32.id_throws();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
    }

    public rgP_2 id_break() {
        return this.id_class;
    }
}

