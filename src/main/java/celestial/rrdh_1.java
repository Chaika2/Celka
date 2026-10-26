/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdG;
import celestial.rrdM;
import java.util.ArrayList;
import java.util.List;

public class rrdh_1 {
    private List<rrdG> id_class = new ArrayList<rrdG>();
    private rrdG id_break = this.id_class("", rrdM.NONE, true);

    public rrdG id_byte(String string) {
        return this.id_class(string, rrdM.NONE, true);
    }

    public String[] id_byte() {
        String[] stringArray = new String[this.id_class.size()];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = this.id_class.get(i).id_throws();
        }
        return stringArray;
    }

    public rrdG[] id_byte(String string, int n) {
        return this.id_class(string, n, rrdM.PREPARE, this.id_break);
    }

    public String toString() {
        return this.id_class.toString();
    }

    public rrdG[] id_class(String string, int n) {
        return this.id_class(string, n, rrdM.COMPOSITE, this.id_break);
    }

    public rrdG id_class(String string, rrdG rrdG2) {
        return this.id_class(string, rrdM.GBUFFERS, rrdG2);
    }

    private rrdG id_class(String string, rrdM rrdM2, boolean bl) {
        int n = this.id_class.size();
        rrdG rrdG2 = new rrdG(n, string, rrdM2, bl);
        this.id_class.add(rrdG2);
        return rrdG2;
    }

    public rrdG id_class() {
        return this.id_break;
    }

    public rrdG[] id_class(rrdG rrdG2, rrdG rrdG3) {
        int n;
        int n2 = rrdG2.id_protected();
        if (n2 > (n = rrdG3.id_protected())) {
            int n3 = n2;
            n2 = n;
            n = n3;
        }
        rrdG[] rrdGArray = new rrdG[n - n2 + 1];
        for (int i = 0; i < rrdGArray.length; ++i) {
            rrdGArray[i] = this.id_class.get(n2 + i);
        }
        return rrdGArray;
    }

    public rrdG id_class(String string, rrdM rrdM2, rrdG rrdG2) {
        int n = this.id_class.size();
        rrdG rrdG3 = new rrdG(n, string, rrdM2, rrdG2);
        this.id_class.add(rrdG3);
        return rrdG3;
    }

    public rrdG id_class(String string) {
        return this.id_class(string, rrdM.COMPOSITE, this.id_break);
    }

    public rrdG[] id_class(String string, int n, rrdM rrdM2, rrdG rrdG2) {
        rrdG[] rrdGArray = new rrdG[n];
        for (int i = 0; i < n; ++i) {
            String string2 = i == 0 ? string : string + i;
            rrdGArray[i] = this.id_class(string2, rrdM2, this.id_break);
        }
        return rrdGArray;
    }

    public int id_break() {
        return this.id_class.size();
    }

    public rrdG id_break(String string) {
        return this.id_class(string, rrdM.DEFERRED, this.id_break);
    }

    public rrdG id_break(String string, rrdG rrdG2) {
        return this.id_class(string, rrdM.SHADOW, rrdG2);
    }

    public rrdG[] id_break(String string, int n) {
        return this.id_class(string, n, rrdM.SHADOWCOMP, this.id_break);
    }

    public rrdG[] id_protected(String string, int n) {
        return this.id_class(string, n, rrdM.DEFERRED, this.id_break);
    }

    public rrdG[] id_protected() {
        return this.id_class.toArray(new rrdG[this.id_class.size()]);
    }

    public rrdG id_protected(String string) {
        if (string == null) {
            return null;
        }
        for (int i = 0; i < this.id_class.size(); ++i) {
            rrdG rrdG2 = this.id_class.get(i);
            String string2 = rrdG2.id_throws();
            if (!string2.equals(string)) continue;
            return rrdG2;
        }
        return null;
    }
}

