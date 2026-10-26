/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rja_3;
import celestial.rrbb_3;
import celestial.rrdR;
import celestial.rrdg_1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkG {
    public static Pattern id_class = Pattern.compile("[\\w\\s(,=)]*uniform\\s+\\w+\\s+(\\w+).*");
    public static Pattern id_break = Pattern.compile("\\s*attribute\\s+\\w+\\s+(\\w+).*");
    public static Pattern id_byte = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
    public static Pattern id_protected = Pattern.compile("\\s*const\\s+ivec3\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
    public static Pattern id_throws = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
    public static Pattern id_case = Pattern.compile("\\s*const\\s+vec2\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
    public static Pattern id_catch = Pattern.compile("\\s*const\\s+vec4\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
    public static Pattern id_private = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
    public static Pattern id_implements = Pattern.compile("\\s*(/\\*|//)?\\s*([A-Z]+):\\s*([\\w.,]+)\\s*(\\*/.*|\\s*)");
    public static Pattern id_finally = Pattern.compile("\\s*#\\s*extension\\s+(\\w+)\\s*:\\s*(\\w+).*");
    public static Pattern id_extends = Pattern.compile("\\s*layout\\s*\\((.*)\\)\\s*(\\w+).*");
    public static Pattern id_native = Pattern.compile("[0-9N]+");
    public static Pattern id_volatile = Pattern.compile("[0-9N,]+");

    public static int id_byte(String string) {
        int n = -1;
        switch (string.hashCode()) {
            case -1560188349: {
                if (!string.equals("shadowcolor")) break;
                n = 0;
            }
        }
        switch (n) {
            case 0: {
                return 0;
            }
        }
        return rrkG.id_class(string, "shadowcolor", 0, 1);
    }

    public static rrdg_1 id_class(String string) {
        Matcher matcher = id_class.matcher(string);
        if (matcher.matches()) {
            return new rrdg_1(rrdR.UNIFORM, matcher.group(1), "", string);
        }
        Matcher matcher2 = id_break.matcher(string);
        if (matcher2.matches()) {
            return new rrdg_1(rrdR.ATTRIBUTE, matcher2.group(1), "", string);
        }
        Matcher matcher3 = id_byte.matcher(string);
        if (matcher3.matches()) {
            return new rrdg_1(rrdR.CONST_INT, matcher3.group(1), matcher3.group(2), string);
        }
        Matcher matcher4 = id_protected.matcher(string);
        if (matcher4.matches()) {
            return new rrdg_1(rrdR.CONST_IVEC3, matcher4.group(1), matcher4.group(2), string);
        }
        Matcher matcher5 = id_throws.matcher(string);
        if (matcher5.matches()) {
            return new rrdg_1(rrdR.CONST_FLOAT, matcher5.group(1), matcher5.group(2), string);
        }
        Matcher matcher6 = id_case.matcher(string);
        if (matcher6.matches()) {
            return new rrdg_1(rrdR.CONST_VEC2, matcher6.group(1), matcher6.group(2), string);
        }
        Matcher matcher7 = id_catch.matcher(string);
        if (matcher7.matches()) {
            return new rrdg_1(rrdR.CONST_VEC4, matcher7.group(1), matcher7.group(2), string);
        }
        Matcher matcher8 = id_private.matcher(string);
        if (matcher8.matches()) {
            return new rrdg_1(rrdR.CONST_BOOL, matcher8.group(1), matcher8.group(2), string);
        }
        Matcher matcher9 = id_implements.matcher(string);
        if (matcher9.matches()) {
            return new rrdg_1(rrdR.PROPERTY, matcher9.group(2), matcher9.group(3), string);
        }
        Matcher matcher10 = id_finally.matcher(string);
        if (matcher10.matches()) {
            return new rrdg_1(rrdR.EXTENSION, matcher10.group(1), matcher10.group(2), string);
        }
        Matcher matcher11 = id_extends.matcher(string);
        return matcher11.matches() ? new rrdg_1(rrdR.LAYOUT, matcher11.group(2), matcher11.group(1), string) : null;
    }

    public static int id_class(String string, String string2, int n, int n2) {
        if (!string.startsWith(string2)) {
            return -1;
        }
        String string3 = string.substring(string2.length());
        int n3 = rrbb_3.id_class(string3, -1);
        return n3 >= n && n3 <= n2 ? n3 : -1;
    }

    public static int id_break(String string) {
        int n = -1;
        switch (string.hashCode()) {
            case -903579360: {
                if (!string.equals("shadow")) break;
                n = 0;
                break;
            }
            case 1235669239: {
                if (!string.equals("watershadow")) break;
                n = 1;
            }
        }
        switch (n) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
        }
        return rrkG.id_class(string, "shadowtex", 0, 1);
    }

    public static int id_throws(String string) {
        return rrkG.id_class(string, "depthtex", 0, 2);
    }

    public static rja_3 id_finally(String string) {
        int n = 1;
        int n2 = 1;
        int n3 = 1;
        String[] stringArray = rrbb_3.id_class(string, ",");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            String[] stringArray2 = rrbb_3.id_class(string2, "=");
            if (stringArray2.length != 2) continue;
            String string3 = stringArray2[0].trim();
            String string4 = stringArray2[1].trim();
            int n4 = rrbb_3.id_class(string4, -1);
            if (n4 < 1) {
                return null;
            }
            if (string3.equals("local_size_x")) {
                n = n4;
            }
            if (string3.equals("local_size_y")) {
                n2 = n4;
            }
            if (!string3.equals("local_size_z")) continue;
            n3 = n4;
        }
        return n == 1 && n2 == 1 && n3 == 1 ? null : new rja_3(n, n2, n3);
    }

    public static int id_catch(String string) {
        return rrkG.id_class(string, "colorimg", 0, 15);
    }

    public static int id_case(String string) {
        int n = rrkG.id_class(string, "gaux", 1, 4);
        return n > 0 ? n + 3 : rrkG.id_class(string, "colortex", 0, 15);
    }

    public static String[] id_implements(String string) {
        if (!id_volatile.matcher(string).matches()) {
            return null;
        }
        string = string.trim();
        return rrbb_3.id_class(string, ",");
    }

    public static int id_protected(String string) {
        return rrkG.id_class(string, "shadowcolorimg", 0, 1);
    }

    public static String[] id_private(String string) {
        if (!id_native.matcher(string).matches()) {
            return null;
        }
        string = string.trim();
        String[] stringArray = new String[string.length()];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = String.valueOf(string.charAt(i));
        }
        return stringArray;
    }
}

