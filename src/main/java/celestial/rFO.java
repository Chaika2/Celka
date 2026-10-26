/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rsP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFO
implements ruS_2<At_1> {
    private int id_class;
    private double id_break;
    private double id_byte;
    private double id_protected;
    private int id_throws;

    public double id_byte() {
        return this.id_break;
    }

    public rFO() {
    }

    public rFO(rsP_2 rsP_22) {
        this.id_class = rsP_22.V();
        this.id_break = rsP_22.rx();
        this.id_byte = rsP_22.re();
        this.id_protected = rsP_22.BO();
        this.id_throws = rsP_22.id_protected();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.readDouble();
        this.id_byte = ruu_32.readDouble();
        this.id_protected = ruu_32.readDouble();
        this.id_throws = ruu_32.readShort();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.writeDouble(this.id_break);
        ruu_32.writeDouble(this.id_byte);
        ruu_32.writeDouble(this.id_protected);
        ruu_32.writeShort(this.id_throws);
    }

    public double id_throws() {
        return this.id_protected;
    }

    public int id_case() {
        return this.id_throws;
    }

    public double id_protected() {
        return this.id_byte;
    }
}

