/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWK;
import celestial.rfU_2;
import celestial.rqO_2;
import java.util.Random;

public class rzV_2
implements rWK {
    public final float id_protected;
    public final float id_throws;

    public float id_byte() {
        return this.id_throws;
    }

    public rzV_2(float f, float f2) {
        this.id_protected = f;
        this.id_throws = f2;
    }

    public rzV_2(float f) {
        this.id_protected = f;
        this.id_throws = f;
    }

    @Override
    public int id_class(Random random) {
        return rfU_2.id_class(random, rfU_2.id_protected(this.id_protected), rfU_2.id_protected(this.id_throws));
    }

    @Override
    public rqO_2 id_class() {
        return id_break;
    }

    public boolean id_class(int n) {
        return (float)n <= this.id_throws && (float)n >= this.id_protected;
    }

    public static rzV_2 id_class(float f, float f2) {
        return new rzV_2(f, f2);
    }

    public float id_break() {
        return this.id_protected;
    }

    public float id_break(Random random) {
        return rfU_2.id_class(random, this.id_protected, this.id_throws);
    }
}

