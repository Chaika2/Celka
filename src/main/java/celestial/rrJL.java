/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.LinkedHashMap;
import java.util.Map;

public class rrJL {
    private int id_class = 0;
    private String id_break = null;
    private Map<String, String> id_byte = new LinkedHashMap<String, String>();
    private byte[] id_protected = null;

    public Map id_byte() {
        return this.id_byte;
    }

    public rrJL(int n, String string, Map map, byte[] byArray) {
        this.id_class = n;
        this.id_break = string;
        this.id_byte = map;
        this.id_protected = byArray;
    }

    public String id_class(String string) {
        return this.id_byte.get(string);
    }

    public int id_class() {
        return this.id_class;
    }

    public String id_break() {
        return this.id_break;
    }

    public byte[] id_protected() {
        return this.id_protected;
    }
}

