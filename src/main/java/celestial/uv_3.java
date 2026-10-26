/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.uJ_2;

public final class uv_3
implements uJ_2 {
    private final float id_class;
    private final fN_2 id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final int id_case;
    private final int id_catch;
    private final int id_private;
    public float id_implements = 1.0f;

    @Override
    public float id_byte() {
        return 1.0f / this.id_class;
    }

    public uv_3(float f, fN_2 fN_22, int n, int n2, int n3, int n4, int n5, int n6) {
        this.id_class = f;
        this.id_break = fN_22;
        this.id_byte = n;
        this.id_protected = n2;
        this.id_throws = n3;
        this.id_case = n4;
        this.id_catch = n5;
        this.id_private = n6;
    }

    @Override
    public void id_class(int n, int n2) {
        this.id_break.id_class(0, n, n2, this.id_byte, this.id_protected, this.id_throws, this.id_case, false, false);
    }

    @Override
    public int id_class() {
        return this.id_throws;
    }

    @Override
    public int id_break() {
        return this.id_case;
    }

    @Override
    public float id_case() {
        return this.id_implements;
    }

    @Override
    public boolean id_protected() {
        return this.id_break.id_byte().id_class() > 1;
    }

    @Override
    public float id_native() {
        return uJ_2.super.id_native() + 7.0f - (float)this.id_private;
    }

    @Override
    public float getAdvance() {
        return this.id_catch;
    }
}

