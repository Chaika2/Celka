/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.uJ_2;

public class ul_3
implements uJ_2 {
    private final int id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final fN_2 id_throws;

    @Override
    public float id_byte() {
        return 2.0f;
    }

    public ul_3(int n, int n2, int n3, int n4, fN_2 fN_22) {
        this.id_class = n3;
        this.id_break = n4;
        this.id_byte = n;
        this.id_protected = n2;
        this.id_throws = fN_22;
    }

    @Override
    public void id_class(int n, int n2) {
        this.id_throws.id_class(0, n, n2, this.id_byte, this.id_protected, this.id_class, this.id_break, false, false);
    }

    @Override
    public int id_class() {
        return this.id_class;
    }

    @Override
    public int id_break() {
        return this.id_break;
    }

    @Override
    public float id_catch() {
        return 0.5f;
    }

    @Override
    public float id_case() {
        return 0.5f;
    }

    @Override
    public boolean id_protected() {
        return this.id_throws.id_byte().id_class() > 1;
    }

    @Override
    public float getAdvance() {
        return this.id_class / 2 + 1;
    }
}

