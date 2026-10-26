/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.rvU_2;
import java.io.IOException;
import java.util.Set;

public class rvD_2
implements ruS_2<At_1> {
    private double id_class;
    private double id_break;
    private double id_byte;
    private float id_protected;
    private float id_throws;
    private Set<rvU_2> id_case;
    private int id_catch;

    public double id_byte() {
        return this.id_break;
    }

    public rvD_2() {
    }

    public rvD_2(double d, double d2, double d3, float f, float f2, Set<rvU_2> set, int n) {
        this.id_class = d;
        this.id_break = d2;
        this.id_byte = d3;
        this.id_protected = f;
        this.id_throws = f2;
        this.id_case = set;
        this.id_catch = n;
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
        this.id_case = rvU_2.id_class(ruu_32.readUnsignedByte());
        this.id_catch = ruu_32.id_case();
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
        ruu_32.writeByte(rvU_2.id_class(this.id_case));
        ruu_32.id_protected(this.id_catch);
    }

    public float id_throws() {
        return this.id_protected;
    }

    public int id_catch() {
        return this.id_catch;
    }

    public float id_case() {
        return this.id_throws;
    }

    public double id_protected() {
        return this.id_byte;
    }

    public Set<rvU_2> id_private() {
        return this.id_case;
    }
}

