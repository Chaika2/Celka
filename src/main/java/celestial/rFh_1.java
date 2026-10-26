/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.iB_2;
import celestial.rVL;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.UUID;

public class rFh_1
implements ruS_2<At_1> {
    private int id_class;
    private UUID id_break;
    private int id_byte;
    private double id_protected;
    private double id_throws;
    private double id_case;
    private int id_catch;
    private int id_private;
    private int id_implements;
    private byte id_finally;
    private byte id_extends;
    private byte id_native;

    public UUID id_byte() {
        return this.id_break;
    }

    public rFh_1() {
    }

    public rFh_1(iB_2 iB_22) {
        this.id_class = iB_22.V();
        this.id_break = iB_22.ro();
        this.id_byte = rVL.id_transient.id_class(iB_22.BC());
        this.id_protected = iB_22.rx();
        this.id_throws = iB_22.re();
        this.id_case = iB_22.BO();
        this.id_finally = (byte)(((Float)iB_22.id_throws[15]).floatValue() * 256.0f / 360.0f);
        this.id_extends = (byte)(((Float)iB_22.id_throws[16]).floatValue() * 256.0f / 360.0f);
        this.id_native = (byte)(((Float)iB_22.id_private[25]).floatValue() * 256.0f / 360.0f);
        double d = 3.9;
        rjU_2 rjU_22 = iB_22.rv();
        double d2 = rfU_2.id_class(rjU_22.id_break, -3.9, 3.9);
        double d3 = rfU_2.id_class(rjU_22.id_byte, -3.9, 3.9);
        double d4 = rfU_2.id_class(rjU_22.id_protected, -3.9, 3.9);
        this.id_catch = (int)(d2 * 8000.0);
        this.id_private = (int)(d3 * 8000.0);
        this.id_implements = (int)(d4 * 8000.0);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_private();
        this.id_byte = ruu_32.id_case();
        this.id_protected = ruu_32.readDouble();
        this.id_throws = ruu_32.readDouble();
        this.id_case = ruu_32.readDouble();
        this.id_finally = ruu_32.readByte();
        this.id_extends = ruu_32.readByte();
        this.id_native = ruu_32.readByte();
        this.id_catch = ruu_32.readShort();
        this.id_private = ruu_32.readShort();
        this.id_implements = ruu_32.readShort();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.id_protected(this.id_byte);
        ruu_32.writeDouble(this.id_protected);
        ruu_32.writeDouble(this.id_throws);
        ruu_32.writeDouble(this.id_case);
        ruu_32.writeByte(this.id_finally);
        ruu_32.writeByte(this.id_extends);
        ruu_32.writeByte(this.id_native);
        ruu_32.writeShort(this.id_catch);
        ruu_32.writeShort(this.id_private);
        ruu_32.writeShort(this.id_implements);
    }

    public double id_throws() {
        return this.id_protected;
    }

    public int id_finally() {
        return this.id_implements;
    }

    public double id_catch() {
        return this.id_case;
    }

    public byte id_extends() {
        return this.id_finally;
    }

    public double id_case() {
        return this.id_throws;
    }

    public int id_implements() {
        return this.id_private;
    }

    public int id_protected() {
        return this.id_byte;
    }

    public int id_private() {
        return this.id_catch;
    }

    public byte id_volatile() {
        return this.id_native;
    }

    public byte id_native() {
        return this.id_extends;
    }
}

