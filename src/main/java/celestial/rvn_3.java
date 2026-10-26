/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvn_3
implements ruS_2<At_1> {
    private double id_class;
    private double id_break;
    private double id_byte;
    private float id_protected;
    private float id_throws;

    public double id_byte() {
        return this.id_break;
    }

    public rvn_3() {
    }

    public rvn_3(an_3 an_32) {
        this.id_class = an_32.rx();
        this.id_break = an_32.re();
        this.id_byte = an_32.BO();
        this.id_protected = ((Float)an_32.id_throws[15]).floatValue();
        this.id_throws = ((Float)an_32.id_throws[16]).floatValue();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readDouble();
        this.id_break = ruu_32.readDouble();
        this.id_byte = ruu_32.readDouble();
        this.id_protected = ruu_32.readFloat();
        this.id_throws = ruu_32.readFloat();
    }

    public double id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeDouble(this.id_class);
        ruu_32.writeDouble(this.id_break);
        ruu_32.writeDouble(this.id_byte);
        ruu_32.writeFloat(this.id_protected);
        ruu_32.writeFloat(this.id_throws);
    }

    public float id_throws() {
        return this.id_protected;
    }

    public float id_case() {
        return this.id_throws;
    }

    public double id_protected() {
        return this.id_byte;
    }
}

