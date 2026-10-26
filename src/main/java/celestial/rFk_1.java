/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rhd_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.UUID;

public class rFk_1
implements ruS_2<At_1> {
    private int id_class;
    private UUID id_break;
    private double id_byte;
    private double id_protected;
    private double id_throws;
    private byte id_case;
    private byte id_catch;

    public UUID id_byte() {
        return this.id_break;
    }

    public rFk_1() {
    }

    public rFk_1(rhd_3 rhd_32) {
        this.id_class = rhd_32.V();
        this.id_break = rhd_32.sv().getId();
        this.id_byte = rhd_32.rx();
        this.id_protected = rhd_32.re();
        this.id_throws = rhd_32.BO();
        this.id_case = (byte)(((Float)rhd_32.id_throws[15]).floatValue() * 256.0f / 360.0f);
        this.id_catch = (byte)(((Float)rhd_32.id_throws[16]).floatValue() * 256.0f / 360.0f);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_private();
        this.id_byte = ruu_32.readDouble();
        this.id_protected = ruu_32.readDouble();
        this.id_throws = ruu_32.readDouble();
        this.id_case = ruu_32.readByte();
        this.id_catch = ruu_32.readByte();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.writeDouble(this.id_byte);
        ruu_32.writeDouble(this.id_protected);
        ruu_32.writeDouble(this.id_throws);
        ruu_32.writeByte(this.id_case);
        ruu_32.writeByte(this.id_catch);
    }

    public double id_throws() {
        return this.id_protected;
    }

    public byte id_catch() {
        return this.id_case;
    }

    public double id_case() {
        return this.id_throws;
    }

    public double id_protected() {
        return this.id_byte;
    }

    public byte id_private() {
        return this.id_catch;
    }
}

