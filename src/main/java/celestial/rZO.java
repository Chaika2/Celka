/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZO
implements ruS_2<rmH_2> {
    protected double id_class;
    protected double id_break;
    protected double id_byte;
    protected float id_protected;
    protected float id_throws;
    protected boolean id_case;
    protected boolean id_catch;
    protected boolean id_private;

    public double id_byte(double d) {
        return this.id_catch ? this.id_byte : d;
    }

    public boolean id_byte() {
        return this.id_catch;
    }

    public rZO() {
    }

    public rZO(boolean bl) {
        this.id_case = bl;
    }

    public float id_class(float f) {
        return this.id_private ? this.id_protected : f;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_case = ruu_32.readUnsignedByte() != 0;
    }

    public double id_class(double d) {
        return this.id_catch ? this.id_class : d;
    }

    public double id_break(double d) {
        return this.id_catch ? this.id_break : d;
    }

    public boolean id_break() {
        return this.id_case;
    }

    public float id_break(float f) {
        return this.id_private ? this.id_throws : f;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_case ? 1 : 0);
    }
}

