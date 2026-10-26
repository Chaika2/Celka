/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.rrdD;
import celestial.rrzX_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkr_1
extends rrdD {
    private static final Pattern id_protected = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
    private static final Pattern id_throws = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");

    public rrkr_1(String string, String string2, String string3, String string4) {
        super(string, string2, string3, new String[]{"false", "true"}, string3, string4);
    }

    public static rrdD id_class(String string, String string2) {
        Matcher matcher = id_protected.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String string5 = matcher.group(3);
        if (string4 != null && string4.length() > 0) {
            boolean bl = rrbb_3.id_class((Object)string3, (Object)"//");
            boolean bl2 = !bl;
            string2 = rrzX_2.id_protected(string2, "/shaders/");
            rrkr_1 rrkr_12 = new rrkr_1(string4, string5, String.valueOf(bl2), string2);
            return rrkr_12;
        }
        return null;
    }

    @Override
    public String id_throws(String string) {
        return rrkr_1.id_private(string) ? "\u00a7a" : "\u00a7c";
    }

    @Override
    public boolean id_catch(String string) {
        String string2;
        Matcher matcher = id_throws.matcher(string);
        return matcher.matches() && (string2 = matcher.group(2)).equals(this.id_class());
    }

    @Override
    public boolean id_case(String string) {
        Matcher matcher = id_protected.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(2);
        return string2.matches(this.id_class());
    }

    @Override
    public String id_package() {
        return rrkr_1.id_private(this.id_protected()) ? "#define " + this.id_class() + " // Shader option ON" : "//#define " + this.id_class() + " // Shader option OFF";
    }

    @Override
    public String id_protected(String string) {
        String string2 = super.id_protected(string);
        if (string2 != string) {
            return string2;
        }
        return rrkr_1.id_private(string) ? rrba_3.id_break() : rrba_3.id_byte();
    }

    public static boolean id_private(String string) {
        return Boolean.valueOf(string);
    }

    @Override
    public boolean id_final() {
        return true;
    }
}

