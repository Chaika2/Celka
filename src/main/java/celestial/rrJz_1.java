/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJA;
import celestial.rrJC;
import java.util.Map;

public class rrJz_1
extends Thread {
    private String id_class;
    private Map id_break;
    private byte[] id_byte;
    private rrJC id_protected;

    public rrJC id_byte() {
        return this.id_protected;
    }

    public rrJz_1(String string, Map map, byte[] byArray, rrJC rrJC2) {
        this.id_class = string;
        this.id_break = map;
        this.id_byte = byArray;
        this.id_protected = rrJC2;
    }

    @Override
    public void run() {
        try {
            rrJA.id_class(this.id_class, this.id_break, this.id_byte);
            this.id_protected.id_class(this.id_class, this.id_byte, null);
        }
        catch (Exception exception) {
            this.id_protected.id_class(this.id_class, this.id_byte, exception);
        }
    }

    public String id_class() {
        return this.id_class;
    }

    public byte[] id_break() {
        return this.id_byte;
    }
}

