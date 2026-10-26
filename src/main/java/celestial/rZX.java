/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rZO;
import celestial.ruu_3;
import java.io.IOException;

public class rZX
extends rZO {
    public rZX() {
        this.id_catch = true;
        this.id_private = true;
    }

    public rZX(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.id_class = d;
        this.id_break = d2;
        this.id_byte = d3;
        this.id_protected = f;
        this.id_throws = f2;
        this.id_case = bl;
        this.id_private = true;
        this.id_catch = true;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readDouble();
        this.id_break = ruu_32.readDouble();
        this.id_byte = ruu_32.readDouble();
        this.id_protected = ruu_32.readFloat();
        this.id_throws = ruu_32.readFloat();
        super.id_class(ruu_32);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeDouble(this.id_class);
        ruu_32.writeDouble(this.id_break);
        ruu_32.writeDouble(this.id_byte);
        ruu_32.writeFloat(this.id_protected);
        ruu_32.writeFloat(this.id_throws);
        super.id_break(ruu_32);
    }
}

