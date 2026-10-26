/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjK_2;
import celestial.rja_3;
import celestial.rji_3;
import celestial.rrbb_3;
import celestial.rrdR;
import celestial.rrzX_2;

public class rrdg_1 {
    private rrdR id_class;
    private String id_break;
    private String id_byte;
    private String id_protected;

    public boolean id_byte(String string) {
        return this.id_final() && string.equals(this.id_break);
    }

    public String id_byte() {
        return this.id_byte;
    }

    public float id_int() {
        try {
            return Float.parseFloat(this.id_byte);
        }
        catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid float: " + this.id_byte + ", line: " + this.id_protected);
        }
    }

    public rrdg_1(rrdR rrdR2, String string, String string2, String string3) {
        this.id_class = rrdR2;
        this.id_break = string;
        this.id_byte = string2;
        this.id_protected = string3;
    }

    public String toString() {
        return this.id_protected;
    }

    public boolean id_this() {
        String string = this.id_byte.toLowerCase();
        if (!string.equals("true") && !string.equals("false")) {
            throw new RuntimeException("Invalid boolean: " + this.id_byte + ", line: " + this.id_protected);
        }
        return Boolean.valueOf(this.id_byte);
    }

    public rrdR id_class() {
        return this.id_class;
    }

    public boolean id_class(String string, String string2, String string3, boolean bl) {
        return this.id_class(string, string2, string3) && this.id_this() == bl;
    }

    public boolean id_class(String string, String string2, String string3) {
        return this.id_implements(string) || this.id_implements(string2) || this.id_implements(string3);
    }

    public boolean id_class(String string, String string2, boolean bl) {
        return this.id_break(string, string2) && this.id_this() == bl;
    }

    public boolean id_class(String string) {
        return this.id_protected() && string.equals(this.id_break);
    }

    public boolean id_class(String string, String string2) {
        return this.id_protected(string) && string2.equals(this.id_byte);
    }

    public boolean id_class(String string, boolean bl) {
        return this.id_extends(string) && this.id_this() == bl;
    }

    public boolean id_break(String string, boolean bl) {
        return this.id_implements(string) && this.id_this() == bl;
    }

    public String id_break() {
        return this.id_break;
    }

    public boolean id_break(String string, String string2) {
        return this.id_implements(string) || this.id_implements(string2);
    }

    public boolean id_break(String string) {
        return this.id_throws() && string.equals(this.id_break);
    }

    public boolean id_throws(String string) {
        return this.id_catch() && string.equals(this.id_break);
    }

    public boolean id_throws() {
        return this.id_class == rrdR.ATTRIBUTE;
    }

    public boolean id_finally(String string) {
        return this.id_finally() && string.equals(this.id_break);
    }

    public boolean id_finally() {
        return this.id_class == rrdR.EXTENSION;
    }

    public boolean id_catch(String string) {
        return this.id_volatile() && string.equals(this.id_break);
    }

    public boolean id_catch() {
        return this.id_class == rrdR.CONST_INT;
    }

    public boolean id_extends(String string) {
        return this.id_implements() && this.id_break.endsWith(string);
    }

    public boolean id_extends() {
        return this.id_class == rrdR.CONST_VEC2;
    }

    public boolean id_case() {
        return this.id_class == rrdR.PROPERTY;
    }

    public boolean id_case(String string) {
        return this.id_catch() && this.id_break.endsWith(string);
    }

    public rjK_2 id_continue() {
        if (this.id_byte == null) {
            return null;
        }
        String string = this.id_byte.trim();
        string = rrzX_2.id_protected(string, "vec2");
        String[] stringArray = rrbb_3.id_class(string = rrzX_2.id_private(string, " ()"), ", ");
        if (stringArray.length != 2) {
            return null;
        }
        float[] fArray = new float[2];
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            float f = rrbb_3.id_class(string2 = rrzX_2.id_byte(string2, new String[]{"F", "f"}), Float.MAX_VALUE);
            if (f == Float.MAX_VALUE) {
                return null;
            }
            fArray[i] = f;
        }
        return new rjK_2(fArray[0], fArray[1]);
    }

    public boolean id_implements(String string) {
        return this.id_implements() && string.equals(this.id_break);
    }

    public boolean id_implements() {
        return this.id_class == rrdR.CONST_BOOL;
    }

    public rja_3 id_new() {
        if (this.id_byte == null) {
            return null;
        }
        String string = this.id_byte.trim();
        string = rrzX_2.id_protected(string, "ivec3");
        String[] stringArray = rrbb_3.id_class(string = rrzX_2.id_private(string, " ()"), ", ");
        if (stringArray.length != 3) {
            return null;
        }
        int[] nArray = new int[3];
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            int n = rrbb_3.id_class(string2, Integer.MIN_VALUE);
            if (n == Integer.MIN_VALUE) {
                return null;
            }
            nArray[i] = n;
        }
        return new rja_3(nArray[0], nArray[1], nArray[2]);
    }

    public int id_package() {
        try {
            return Integer.parseInt(this.id_byte);
        }
        catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid integer: " + this.id_byte + ", line: " + this.id_protected);
        }
    }

    public rji_3 id_super() {
        if (this.id_byte == null) {
            return null;
        }
        String string = this.id_byte.trim();
        string = rrzX_2.id_protected(string, "vec4");
        String[] stringArray = rrbb_3.id_class(string = rrzX_2.id_private(string, " ()"), ", ");
        if (stringArray.length != 4) {
            return null;
        }
        float[] fArray = new float[4];
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            float f = rrbb_3.id_class(string2 = rrzX_2.id_byte(string2, new String[]{"F", "f"}), Float.MAX_VALUE);
            if (f == Float.MAX_VALUE) {
                return null;
            }
            fArray[i] = f;
        }
        return new rji_3(fArray[0], fArray[1], fArray[2], fArray[3]);
    }

    public boolean id_protected() {
        return this.id_class == rrdR.UNIFORM;
    }

    public boolean id_protected(String string) {
        return this.id_case() && string.equals(this.id_break);
    }

    public boolean id_private() {
        return this.id_class == rrdR.CONST_FLOAT;
    }

    public boolean id_private(String string) {
        return this.id_private() && string.equals(this.id_break);
    }

    public boolean id_final() {
        return this.id_class == rrdR.LAYOUT;
    }

    public boolean id_volatile() {
        return this.id_class == rrdR.CONST_IVEC3;
    }

    public boolean id_volatile(String string) {
        return this.id_native() && this.id_break.endsWith(string);
    }

    public boolean id_native() {
        return this.id_class == rrdR.CONST_VEC4;
    }

    public boolean id_native(String string) {
        return this.id_extends() && string.equals(this.id_break);
    }
}

