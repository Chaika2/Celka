/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rjU_2;
import celestial.rqL_2;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvI_2
implements ruS_2<At_1> {
    private rqO_2 id_class;
    private rqL_2 id_break;
    private int id_byte;
    private int id_protected = Integer.MAX_VALUE;
    private int id_throws;
    private float id_case;
    private float id_catch;

    public rqL_2 id_byte() {
        return this.id_break;
    }

    public rvI_2() {
    }

    public rvI_2(rqO_2 rqO_22, rqL_2 rqL_22, rjU_2 rjU_22, float f, float f2) {
        this.id_class = rqO_22;
        this.id_break = rqL_22;
        this.id_byte = (int)(rjU_22.id_break * 8.0);
        this.id_protected = (int)(rjU_22.id_byte * 8.0);
        this.id_throws = (int)(rjU_22.id_protected * 8.0);
        this.id_case = f;
        this.id_catch = f2;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_volatile();
        this.id_break = ruu_32.id_class(rqL_2.class);
        this.id_byte = ruu_32.readInt();
        this.id_protected = ruu_32.readInt();
        this.id_throws = ruu_32.readInt();
        this.id_case = ruu_32.readFloat();
        this.id_catch = ruu_32.readFloat();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.writeInt(this.id_byte);
        ruu_32.writeInt(this.id_protected);
        ruu_32.writeInt(this.id_throws);
        ruu_32.writeFloat(this.id_case);
        ruu_32.writeFloat(this.id_catch);
    }

    public rqO_2 id_break() {
        return this.id_class;
    }

    public double id_throws() {
        return (float)this.id_protected / 8.0f;
    }

    public float id_catch() {
        return this.id_case;
    }

    public double id_case() {
        return (float)this.id_throws / 8.0f;
    }

    public double id_protected() {
        return (float)this.id_byte / 8.0f;
    }

    public float id_private() {
        return this.id_catch;
    }
}

