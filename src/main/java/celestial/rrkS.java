/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdD;
import celestial.rrkB;
import celestial.rrzX_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkS
extends rrkB {
    private String id_protected = null;
    private static final Pattern id_throws = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");

    public static rrdD id_byte(String string, String string2) {
        Matcher matcher = id_throws.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String string5 = matcher.group(3);
        String string6 = matcher.group(4);
        String string7 = rrzX_2.id_protected(string6, "[", "]");
        if (string7 != null && string7.length() > 0) {
            string6 = string6.replace(string7, "").trim();
        }
        String[] stringArray = rrkS.id_break(string5, string7);
        if (string4 != null && string4.length() > 0) {
            string2 = rrzX_2.id_protected(string2, "/shaders/");
            rrkS rrkS2 = new rrkS(string4, string3, string6, string5, stringArray, string2);
            return rrkS2;
        }
        return null;
    }

    public rrkS(String string, String string2, String string3, String string4, String[] stringArray, String string5) {
        super(string, string3, string4, stringArray, string5);
        this.id_protected = string2;
    }

    @Override
    public boolean id_case(String string) {
        Matcher matcher = id_throws.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(2);
        return string2.matches(this.id_class());
    }

    @Override
    public String id_package() {
        return "const " + this.id_protected + " " + this.id_class() + " = " + this.id_protected() + "; // Shader option " + this.id_protected();
    }
}

