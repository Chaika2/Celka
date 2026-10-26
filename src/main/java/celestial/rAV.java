/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAC;

public class rAV
extends RuntimeException {
    private final rAC id_class;

    public rAV(rAC rAC2, Throwable throwable) {
        super(rAC2.id_class(), throwable);
        this.id_class = rAC2;
    }

    public rAC id_class() {
        return this.id_class;
    }
}

