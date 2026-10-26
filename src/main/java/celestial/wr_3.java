/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.wN_2;
import java.util.Arrays;

public class wr_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1[] id_class = new Iq_1[6];

    public wr_3() {
        this.id_class[0] = new Iq_1(this, 0, 10);
        this.id_class[1] = new Iq_1(this, 0, 0);
        this.id_class[2] = new Iq_1(this, 0, 0);
        this.id_class[3] = new Iq_1(this, 0, 0);
        this.id_class[4] = new Iq_1(this, 0, 0);
        this.id_class[5] = new Iq_1(this, 44, 10);
        int n = 20;
        int n2 = 8;
        int n3 = 16;
        int n4 = 4;
        this.id_class[0].id_class(-10.0f, -8.0f, -1.0f, 20.0f, 16.0f, 2.0f, 0.0f);
        this.id_class[0].id_class(0.0f, 4.0f, 0.0f);
        this.id_class[5].id_class(-9.0f, -7.0f, -1.0f, 18.0f, 14.0f, 1.0f, 0.0f);
        this.id_class[5].id_class(0.0f, 4.0f, 0.0f);
        this.id_class[1].id_class(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f, 0.0f);
        this.id_class[1].id_class(-9.0f, 4.0f, 0.0f);
        this.id_class[2].id_class(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f, 0.0f);
        this.id_class[2].id_class(9.0f, 4.0f, 0.0f);
        this.id_class[3].id_class(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f, 0.0f);
        this.id_class[3].id_class(0.0f, 4.0f, -7.0f);
        this.id_class[4].id_class(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f, 0.0f);
        this.id_class[4].id_class(0.0f, 4.0f, 7.0f);
        this.id_class[0].id_case = 1.5707964f;
        this.id_class[1].id_catch = 4.712389f;
        this.id_class[2].id_catch = 1.5707964f;
        this.id_class[3].id_catch = (float)Math.PI;
        this.id_class[5].id_case = -1.5707964f;
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_class[5].id_protected = 4.0f - f3;
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return Arrays.asList(this.id_class);
    }
}

