/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.At_1;
import celestial.rVL;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class rvt_3
implements ruS_2<At_1> {
    private rqA_2 id_class;
    private rqL_2 id_break;
    private int id_byte;
    private int id_protected;
    private int id_throws;
    private float id_case;
    private float id_catch;

    public rqL_2 id_byte() {
        return this.id_break;
    }

    public rvt_3() {
    }

    public rvt_3(rqA_2 rqA_22, rqL_2 rqL_22, double d, double d2, double d3, float f, float f2) {
        Validate.notNull((Object)rqA_22, (String)"sound", (Object[])new Object[0]);
        this.id_class = rqA_22;
        this.id_break = rqL_22;
        this.id_byte = (int)(d * 8.0);
        this.id_protected = (int)(d2 * 8.0);
        this.id_throws = (int)(d3 * 8.0);
        this.id_case = f;
        this.id_catch = f2;
    }

    @Override
    public void id_class(rqA_2 rqA_22) {
        this.id_class = rqA_22;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = (rqA_2)rVL.id_short.id_class(ruu_32.id_case());
        this.id_break = ruu_32.id_class(rqL_2.class);
        this.id_byte = ruu_32.readInt();
        this.id_protected = ruu_32.readInt();
        this.id_throws = ruu_32.readInt();
        this.id_case = ruu_32.readFloat();
        this.id_catch = ruu_32.readFloat();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(rVL.id_short.id_class(this.id_class));
        ruu_32.id_class(this.id_break);
        ruu_32.writeInt(this.id_byte);
        ruu_32.writeInt(this.id_protected);
        ruu_32.writeInt(this.id_throws);
        ruu_32.writeFloat(this.id_case);
        ruu_32.writeFloat(this.id_catch);
    }

    public rqA_2 id_break() {
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

