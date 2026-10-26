/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AH;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmF_2
implements ruS_2<AH> {
    private rgP_2 id_class;

    public rmF_2() {
    }

    public rmF_2(rgP_2 rgP_22) {
        this.id_class = rgP_22;
    }

    @Override
    public void id_class(AH aH) {
        aH.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = rgB_2.id_break(ruu_32.id_throws(262144));
    }

    public rgP_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }
}

