/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.rrJN;
import celestial.rrJn_1;

public class rrJW
extends Thread {
    private String id_class = null;
    private rrJn_1 id_break = null;

    public rrJW(String string, rrJn_1 rrJn_12) {
        this.id_class = string;
        this.id_break = rrJn_12;
    }

    @Override
    public void run() {
        try {
            byte[] byArray = rrJN.id_break(this.id_class, QY.id_instanceof().W());
            this.id_break.id_class(this.id_class, byArray, null);
        }
        catch (Exception exception) {
            this.id_break.id_class(this.id_class, null, exception);
        }
    }

    public String id_class() {
        return this.id_class;
    }

    public rrJn_1 id_break() {
        return this.id_break;
    }
}

