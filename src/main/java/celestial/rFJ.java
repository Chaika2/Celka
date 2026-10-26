/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.rVL;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.UUID;

public class rFJ
implements ruS_2<At_1> {
    private int id_class;
    private UUID id_break;
    private double id_byte;
    private double id_protected;
    private double id_throws;
    private int id_case;
    private int id_catch;
    private int id_private;
    private int id_implements;
    private int id_finally;
    private aI_2<?> id_extends;
    private int id_native;

    public UUID id_byte() {
        return this.id_break;
    }

    public rFJ(an_3 an_32, aI_2<?> aI_22, int n, rfH_2 rfH_22) {
        this(an_32.V(), an_32.ro(), rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), ((Float)an_32.id_throws[16]).floatValue(), ((Float)an_32.id_throws[15]).floatValue(), aI_22, n, an_32.rv());
    }

    public rFJ(an_3 an_32, int n) {
        this(an_32.V(), an_32.ro(), an_32.rx(), an_32.re(), an_32.BO(), ((Float)an_32.id_throws[16]).floatValue(), ((Float)an_32.id_throws[15]).floatValue(), an_32.BC(), n, an_32.rv());
    }

    public rFJ() {
    }

    public rFJ(int n, UUID uUID, double d, double d2, double d3, float f, float f2, aI_2<?> aI_22, int n2, rjU_2 rjU_22) {
        this.id_class = n;
        this.id_break = uUID;
        this.id_byte = d;
        this.id_protected = d2;
        this.id_throws = d3;
        this.id_implements = rfU_2.id_protected(f * 256.0f / 360.0f);
        this.id_finally = rfU_2.id_protected(f2 * 256.0f / 360.0f);
        this.id_extends = aI_22;
        this.id_native = n2;
        this.id_case = (int)(rfU_2.id_class(rjU_22.id_break, -3.9, 3.9) * 8000.0);
        this.id_catch = (int)(rfU_2.id_class(rjU_22.id_byte, -3.9, 3.9) * 8000.0);
        this.id_private = (int)(rfU_2.id_class(rjU_22.id_protected, -3.9, 3.9) * 8000.0);
    }

    public rFJ(an_3 an_32) {
        this(an_32, 0);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_private();
        this.id_extends = rVL.id_transient.id_class(ruu_32.id_case());
        this.id_byte = ruu_32.readDouble();
        this.id_protected = ruu_32.readDouble();
        this.id_throws = ruu_32.readDouble();
        this.id_implements = ruu_32.readByte();
        this.id_finally = ruu_32.readByte();
        this.id_native = ruu_32.readInt();
        this.id_case = ruu_32.readShort();
        this.id_catch = ruu_32.readShort();
        this.id_private = ruu_32.readShort();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.id_protected(rVL.id_transient.id_class(this.id_extends));
        ruu_32.writeDouble(this.id_byte);
        ruu_32.writeDouble(this.id_protected);
        ruu_32.writeDouble(this.id_throws);
        ruu_32.writeByte(this.id_implements);
        ruu_32.writeByte(this.id_finally);
        ruu_32.writeInt(this.id_native);
        ruu_32.writeShort(this.id_case);
        ruu_32.writeShort(this.id_catch);
        ruu_32.writeShort(this.id_private);
    }

    public double id_throws() {
        return this.id_protected;
    }

    public int id_finally() {
        return this.id_implements;
    }

    public double id_catch() {
        return (double)this.id_case / 8000.0;
    }

    public int id_extends() {
        return this.id_finally;
    }

    public double id_case() {
        return this.id_throws;
    }

    public double id_implements() {
        return (double)this.id_private / 8000.0;
    }

    public double id_protected() {
        return this.id_byte;
    }

    public double id_private() {
        return (double)this.id_catch / 8000.0;
    }

    public int id_volatile() {
        return this.id_native;
    }

    public aI_2<?> id_native() {
        return this.id_extends;
    }
}

