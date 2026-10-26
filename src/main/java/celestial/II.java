/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import java.util.Locale;

public class II
extends rqO_2 {
    private final String id_protected;

    public II(String string, String string2) {
        this(II.id_class(string + "#" + string2));
    }

    public II(rqO_2 rqO_22, String string) {
        this(rqO_22.toString(), string);
    }

    public II(String string) {
        this(II.id_class(string));
    }

    protected II(String[] stringArray) {
        super(stringArray);
        this.id_protected = stringArray[2].toLowerCase(Locale.ROOT);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof II && super.equals(object)) {
            II iI = (II)object;
            return this.id_protected.equals(iI.id_protected);
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "#" + this.id_protected;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.id_protected.hashCode();
    }

    protected static String[] id_class(String string) {
        String[] stringArray = new String[]{null, string, ""};
        int n = string.indexOf(35);
        String string2 = string;
        if (n >= 0) {
            stringArray[2] = string.substring(n + 1, string.length());
            if (n > 1) {
                string2 = string.substring(0, n);
            }
        }
        System.arraycopy(rqO_2.id_break(string2, ':'), 0, stringArray, 0, 2);
        return stringArray;
    }

    public String id_class() {
        return this.id_protected;
    }
}

