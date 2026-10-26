/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rZO;
import celestial.ruu_3;
import java.io.IOException;

public class rZJ
extends rZO {
    public rZJ() {
        this.id_private = true;
    }

    public rZJ(float f, float f2, boolean bl) {
        this.id_protected = f;
        this.id_throws = f2;
        this.id_case = bl;
        this.id_private = true;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_protected = ruu_32.readFloat();
        this.id_throws = ruu_32.readFloat();
        super.id_class(ruu_32);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeFloat(this.id_protected);
        ruu_32.writeFloat(this.id_throws);
        super.id_break(ruu_32);
    }
}

