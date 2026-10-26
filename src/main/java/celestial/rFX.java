/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.rVL;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class rFX
implements ruS_2<At_1> {
    private rqA_2 id_class;
    private rqL_2 id_break;
    private int id_byte;
    private float id_protected;
    private float id_throws;

    public rqL_2 id_byte() {
        return this.id_break;
    }

    public rFX() {
    }

    public rFX(rqA_2 rqA_22, rqL_2 rqL_22, an_3 an_32, float f, float f2) {
        Validate.notNull((Object)rqA_22, (String)"sound", (Object[])new Object[0]);
        this.id_class = rqA_22;
        this.id_break = rqL_22;
        this.id_byte = an_32.V();
        this.id_protected = f;
        this.id_throws = f2;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = (rqA_2)rVL.id_short.id_class(ruu_32.id_case());
        this.id_break = ruu_32.id_class(rqL_2.class);
        this.id_byte = ruu_32.id_case();
        this.id_protected = ruu_32.readFloat();
        this.id_throws = ruu_32.readFloat();
    }

    public rqA_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(rVL.id_short.id_class(this.id_class));
        ruu_32.id_class(this.id_break);
        ruu_32.id_protected(this.id_byte);
        ruu_32.writeFloat(this.id_protected);
        ruu_32.writeFloat(this.id_throws);
    }

    public float id_throws() {
        return this.id_protected;
    }

    public float id_case() {
        return this.id_throws;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

