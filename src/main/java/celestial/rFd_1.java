/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rVL;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFd_1
implements ruS_2<At_1> {
    private double id_class;
    private double id_break;
    private double id_byte;
    private float id_protected;
    private float id_throws;
    private float id_case;
    private float id_catch;
    private int id_private;
    private boolean id_implements;
    private rLx_1 id_finally;

    public double id_byte() {
        return this.id_class;
    }

    public rFd_1() {
    }

    public <T extends rLx_1> rFd_1(T t, boolean bl, double d, double d2, double d3, float f, float f2, float f3, float f4, int n) {
        this.id_finally = t;
        this.id_implements = bl;
        this.id_class = d;
        this.id_break = d2;
        this.id_byte = d3;
        this.id_protected = f;
        this.id_throws = f2;
        this.id_case = f3;
        this.id_catch = f4;
        this.id_private = n;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        rLz_1 rLz_12 = (rLz_1)rVL.id_switch.id_class(ruu_32.readInt());
        if (rLz_12 == null) {
            rLz_12 = rLQ.id_byte;
        }
        this.id_implements = ruu_32.readBoolean();
        this.id_class = ruu_32.readDouble();
        this.id_break = ruu_32.readDouble();
        this.id_byte = ruu_32.readDouble();
        this.id_protected = ruu_32.readFloat();
        this.id_throws = ruu_32.readFloat();
        this.id_case = ruu_32.readFloat();
        this.id_catch = ruu_32.readFloat();
        this.id_private = ruu_32.readInt();
        this.id_finally = this.id_class(ruu_32, rLz_12);
    }

    private <T extends rLx_1> T id_class(ruu_3 ruu_32, rLz_1<T> rLz_12) {
        return rLz_12.id_case().id_break(rLz_12, ruu_32);
    }

    public boolean id_break() {
        return this.id_implements;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeInt(rVL.id_switch.id_class(this.id_finally.id_protected()));
        ruu_32.writeBoolean(this.id_implements);
        ruu_32.writeDouble(this.id_class);
        ruu_32.writeDouble(this.id_break);
        ruu_32.writeDouble(this.id_byte);
        ruu_32.writeFloat(this.id_protected);
        ruu_32.writeFloat(this.id_throws);
        ruu_32.writeFloat(this.id_case);
        ruu_32.writeFloat(this.id_catch);
        ruu_32.writeInt(this.id_private);
        this.id_finally.id_class(ruu_32);
    }

    public double id_throws() {
        return this.id_byte;
    }

    public int id_finally() {
        return this.id_private;
    }

    public float id_catch() {
        return this.id_throws;
    }

    public rLx_1 id_extends() {
        return this.id_finally;
    }

    public float id_case() {
        return this.id_protected;
    }

    public float id_implements() {
        return this.id_catch;
    }

    public double id_protected() {
        return this.id_break;
    }

    public float id_private() {
        return this.id_case;
    }
}

