/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import celestial.rrMz_1;
import java.util.Properties;

public class rrbI_2 {
    private String id_class;
    private rqO_2[] id_break;
    private int id_byte = 1;
    private int id_protected = 64;
    private int id_throws = 3;
    private int id_case = 3;
    private int id_catch = -2130706433;
    private int id_private = 0xFFFFFF;
    private int id_implements = 0;
    private int id_finally = Integer.MIN_VALUE;

    public int id_byte() {
        return this.id_protected;
    }

    public rrbI_2(String string, Properties properties) {
        rrMz_1 rrMz_12 = new rrMz_1("CustomPanorama");
        this.id_class = string;
        this.id_break = new rqO_2[6];
        for (int i = 0; i < this.id_break.length; ++i) {
            this.id_break[i] = new rqO_2(string + "/panorama_" + i + ".png");
        }
        this.id_byte = rrMz_12.id_class(properties.getProperty("weight"), 1);
        this.id_protected = rrMz_12.id_class(properties.getProperty("blur1"), 64);
        this.id_throws = rrMz_12.id_class(properties.getProperty("blur2"), 3);
        this.id_case = rrMz_12.id_class(properties.getProperty("blur3"), 3);
        this.id_catch = rrMz_1.id_byte(properties.getProperty("overlay1.top"), -2130706433);
        this.id_private = rrMz_1.id_byte(properties.getProperty("overlay1.bottom"), 0xFFFFFF);
        this.id_implements = rrMz_1.id_byte(properties.getProperty("overlay2.top"), 0);
        this.id_finally = rrMz_1.id_byte(properties.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
    }

    public String toString() {
        return this.id_class + ", weight: " + this.id_byte + ", blur: " + this.id_protected + " " + this.id_throws + " " + this.id_case + ", overlay: " + this.id_catch + " " + this.id_private + " " + this.id_implements + " " + this.id_finally;
    }

    public rqO_2[] id_class() {
        return this.id_break;
    }

    public int id_break() {
        return this.id_byte;
    }

    public int id_throws() {
        return this.id_case;
    }

    public int id_catch() {
        return this.id_private;
    }

    public int id_case() {
        return this.id_catch;
    }

    public int id_implements() {
        return this.id_finally;
    }

    public int id_protected() {
        return this.id_throws;
    }

    public int id_private() {
        return this.id_implements;
    }
}

