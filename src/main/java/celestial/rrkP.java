/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdD;
import celestial.rrkr_1;
import celestial.rrzX_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkP
extends rrkr_1 {
    private static final Pattern id_protected = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");

    public rrkP(String string, String string2, String string3, String string4) {
        super(string, string2, string3, string4);
    }

    public static rrdD id_break(String string, String string2) {
        Matcher matcher = id_protected.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String string5 = matcher.group(3);
        if (string3 != null && string3.length() > 0) {
            string2 = rrzX_2.id_protected(string2, "/shaders/");
            rrkP rrkP2 = new rrkP(string3, string5, string4, string2);
            rrkP2.id_break(false);
            return rrkP2;
        }
        return null;
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
        return "const bool " + this.id_class() + " = " + this.id_protected() + "; // Shader option " + this.id_protected();
    }

    @Override
    public boolean id_final() {
        return false;
    }
}

