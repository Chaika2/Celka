/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrzX_2;
import java.util.Arrays;
import java.util.List;

public abstract class rrdD {
    private String id_protected = null;
    private String id_throws = null;
    private String id_case = null;
    private String[] id_catch = null;
    private String id_private = null;
    private String[] id_implements = null;
    private boolean id_finally = true;
    private boolean id_extends = true;
    public static final String id_class = "\u00a7a";
    public static final String id_break = "\u00a7c";
    public static final String id_byte = "\u00a79";

    public boolean id_byte(String string) {
        return rrdD.id_class(string, this.id_catch) >= 0;
    }

    public String id_byte() {
        String string = rrbb_3.id_private(this.id_throws);
        string = rrzX_2.id_protected(string, "//");
        return rrdZ.id_break("option." + this.id_class() + ".comment", string);
    }

    public String[] id_int() {
        return (String[])this.id_catch.clone();
    }

    public rrdD(String string, String string2, String string3, String[] stringArray, String string4, String string5) {
        this.id_protected = string;
        this.id_throws = string2;
        this.id_case = string3;
        this.id_catch = stringArray;
        this.id_private = string4;
        if (string5 != null) {
            this.id_implements = new String[]{string5};
        }
    }

    public String toString() {
        return this.id_protected + ", value: " + this.id_case + ", valueDefault: " + this.id_private + ", paths: " + rrbb_3.id_class(this.id_implements);
    }

    private static int id_class(String string, String[] stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (!string2.equals(string)) continue;
            return i;
        }
        return -1;
    }

    public void id_class(String string) {
        this.id_throws = string;
    }

    public void id_class(String[] stringArray) {
        List<String> list = Arrays.asList(this.id_implements);
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            if (list.contains(string)) continue;
            this.id_implements = (String[])rrbb_3.id_class((Object[])this.id_implements, (Object)string);
        }
    }

    public void id_class(boolean bl) {
        this.id_finally = bl;
    }

    public String id_class() {
        return this.id_protected;
    }

    public void id_class(float f) {
        if (this.id_catch.length > 1) {
            f = rrbb_3.id_class(f, 0.0f, 1.0f);
            int n = Math.round(f * (float)(this.id_catch.length - 1));
            this.id_case = this.id_catch[n];
        }
    }

    public void id_break(boolean bl) {
        this.id_extends = bl;
    }

    public String id_break() {
        return this.id_throws;
    }

    public boolean id_break(String string) {
        int n = rrdD.id_class(string, this.id_catch);
        if (n < 0) {
            return false;
        }
        this.id_case = string;
        return true;
    }

    public String id_throws() {
        return this.id_private;
    }

    public String id_throws(String string) {
        return "";
    }

    public boolean id_finally() {
        return this.id_finally;
    }

    public void id_catch() {
        int n = rrdD.id_class(this.id_case, this.id_catch);
        if (n >= 0) {
            n = (n + 1) % this.id_catch.length;
            this.id_case = this.id_catch[n];
        }
    }

    public boolean id_catch(String string) {
        return false;
    }

    public boolean id_extends() {
        return !rrbb_3.id_class((Object)this.id_case, (Object)this.id_private);
    }

    public boolean id_case(String string) {
        return false;
    }

    public void id_case() {
        this.id_case = this.id_private;
    }

    public String[] id_implements() {
        return this.id_implements;
    }

    public float id_new() {
        if (this.id_catch.length <= 1) {
            return 0.0f;
        }
        int n = rrdD.id_class(this.id_case, this.id_catch);
        return n < 0 ? 0.0f : 1.0f * (float)n / ((float)this.id_catch.length - 1.0f);
    }

    public String id_package() {
        return null;
    }

    public String id_protected() {
        return this.id_case;
    }

    public String id_protected(String string) {
        return rrdZ.id_break("value." + this.id_protected + "." + string, string);
    }

    public void id_private() {
        int n = rrdD.id_class(this.id_case, this.id_catch);
        if (n >= 0) {
            n = (n - 1 + this.id_catch.length) % this.id_catch.length;
            this.id_case = this.id_catch[n];
        }
    }

    public boolean id_final() {
        return false;
    }

    public String id_volatile() {
        return rrdZ.id_break("option." + this.id_protected, this.id_protected);
    }

    public boolean id_native() {
        return this.id_extends;
    }
}

