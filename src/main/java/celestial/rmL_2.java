/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AH;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmL_2
implements ruS_2<AH> {
    private int id_class;

    public rmL_2() {
    }

    public rmL_2(int n) {
        this.id_class = n;
    }

    @Override
    public void id_class(AH aH) {
        aH.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
    }
}

