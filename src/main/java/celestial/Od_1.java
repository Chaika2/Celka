/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ok_1;

public abstract class Od_1
implements Ok_1 {
    protected boolean id_class = false;
    protected int id_break = 255;
    protected int id_byte = 255;
    protected int id_protected = 255;
    protected int id_throws = 255;

    public void id_class(int n, int n2, int n3, int n4) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
        this.id_class = true;
    }
}

