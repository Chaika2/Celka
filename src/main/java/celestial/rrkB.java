/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;
import celestial.rrdD;
import celestial.rrdZ;
import celestial.rrzX_2;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkB
extends rrdD {
    private static final Pattern id_protected = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");

    public rrkB(String string, String string2, String string3, String[] stringArray, String string4) {
        super(string, string2, string3, stringArray, string3, string4);
        this.id_break(this.id_int().length > 1);
    }

    public static rrdD id_class(String string, String string2) {
        Matcher matcher = id_protected.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String string5 = matcher.group(3);
        String string6 = rrzX_2.id_protected(string5, "[", "]");
        if (string6 != null && string6.length() > 0) {
            string5 = string5.replace(string6, "").trim();
        }
        String[] stringArray = rrkB.id_break(string4, string6);
        if (string3 != null && string3.length() > 0) {
            string2 = rrzX_2.id_protected(string2, "/shaders/");
            rrkB rrkB2 = new rrkB(string3, string5, string4, stringArray, string2);
            return rrkB2;
        }
        return null;
    }

    public static String[] id_break(String string, String string2) {
        String[] stringArray = new String[]{string};
        if (string2 == null) {
            return stringArray;
        }
        string2 = string2.trim();
        string2 = rrzX_2.id_protected(string2, "[");
        string2 = rrzX_2.id_throws(string2, "]");
        if ((string2 = string2.trim()).length() <= 0) {
            return stringArray;
        }
        Object[] objectArray = rrbb_3.id_class(string2, " ");
        if (objectArray.length <= 0) {
            return stringArray;
        }
        if (!Arrays.asList(objectArray).contains(string)) {
            objectArray = (String[])rrbb_3.id_class(objectArray, string, 0);
        }
        return objectArray;
    }

    @Override
    public String id_throws(String string) {
        String string2 = string.toLowerCase();
        return !string2.equals("false") && !string2.equals("off") ? "\u00a7a" : "\u00a7c";
    }

    @Override
    public boolean id_case(String string) {
        Matcher matcher = id_protected.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(1);
        return string2.matches(this.id_class());
    }

    @Override
    public String id_package() {
        return "#define " + this.id_class() + " " + this.id_protected() + " // Shader option " + this.id_protected();
    }

    @Override
    public String id_protected(String string) {
        String string2 = rrdZ.id_break("prefix." + this.id_class(), "");
        String string3 = super.id_protected(string);
        String string4 = rrdZ.id_break("suffix." + this.id_class(), "");
        return string2 + string3 + string4;
    }
}

