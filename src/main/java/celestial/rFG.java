/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFG
implements ruS_2<At_1> {
    private float id_class;
    private int id_break;
    private int id_byte;

    public int id_byte() {
        return this.id_break;
    }

    public rFG() {
    }

    public rFG(float f, int n, int n2) {
        this.id_class = f;
        this.id_break = n;
        this.id_byte = n2;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readFloat();
        this.id_byte = ruu_32.id_case();
        this.id_break = ruu_32.id_case();
    }

    public float id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeFloat(this.id_class);
        ruu_32.id_protected(this.id_byte);
        ruu_32.id_protected(this.id_break);
    }

    public int id_protected() {
        return this.id_byte;
    }
}

