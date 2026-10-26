/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvN_2
implements ruS_2<At_1> {
    private int id_class;
    private double id_break;
    private double id_byte;
    private double id_protected;
    private byte id_throws;
    private byte id_case;
    private boolean id_catch;

    public double id_byte() {
        return this.id_break;
    }

    public rvN_2() {
    }

    public rvN_2(an_3 an_32) {
        this.id_class = an_32.V();
        this.id_break = an_32.rx();
        this.id_byte = an_32.re();
        this.id_protected = an_32.BO();
        this.id_throws = (byte)(((Float)an_32.id_throws[15]).floatValue() * 256.0f / 360.0f);
        this.id_case = (byte)(((Float)an_32.id_throws[16]).floatValue() * 256.0f / 360.0f);
        this.id_catch = an_32.BL();
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
        this.id_throws = ruu_32.readByte();
        this.id_case = ruu_32.readByte();
        this.id_catch = ruu_32.readBoolean();
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
        ruu_32.writeByte(this.id_throws);
        ruu_32.writeByte(this.id_case);
        ruu_32.writeBoolean(this.id_catch);
    }

    public double id_throws() {
        return this.id_protected;
    }

    public byte id_catch() {
        return this.id_case;
    }

    public byte id_case() {
        return this.id_throws;
    }

    public double id_protected() {
        return this.id_byte;
    }

    public boolean id_private() {
        return this.id_catch;
    }
}

