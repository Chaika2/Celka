/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class rrJF {
    private String id_case = null;
    private int id_catch = 0;
    private Proxy id_private = Proxy.NO_PROXY;
    private String id_implements = null;
    private String id_finally = null;
    private String id_extends = null;
    private Map<String, String> id_native = new LinkedHashMap<String, String>();
    private byte[] id_volatile = null;
    private int id_final = 0;
    public static final String id_class = "GET";
    public static final String id_break = "HEAD";
    public static final String id_byte = "POST";
    public static final String id_protected = "HTTP/1.0";
    public static final String id_throws = "HTTP/1.1";

    public String id_byte() {
        return this.id_implements;
    }

    public rrJF(String string, int n, Proxy proxy, String string2, String string3, String string4, Map<String, String> map, byte[] byArray) {
        this.id_case = string;
        this.id_catch = n;
        this.id_private = proxy;
        this.id_implements = string2;
        this.id_finally = string3;
        this.id_extends = string4;
        this.id_native = map;
        this.id_volatile = byArray;
    }

    public void id_class(int n) {
        this.id_final = n;
    }

    public String id_class() {
        return this.id_case;
    }

    public int id_break() {
        return this.id_catch;
    }

    public String id_throws() {
        return this.id_extends;
    }

    public byte[] id_catch() {
        return this.id_volatile;
    }

    public Map<String, String> id_case() {
        return this.id_native;
    }

    public Proxy id_implements() {
        return this.id_private;
    }

    public String id_protected() {
        return this.id_finally;
    }

    public int id_private() {
        return this.id_final;
    }
}

