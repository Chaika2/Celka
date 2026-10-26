/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.KY;

public class KU
extends RuntimeException {
    private final KY id_class;

    public KU(KY kY) {
        this.id_class = kY;
    }

    @Override
    public Throwable getCause() {
        return this.id_class.id_break();
    }

    public KY id_class() {
        return this.id_class;
    }

    @Override
    public String getMessage() {
        return this.id_class.id_class();
    }
}

