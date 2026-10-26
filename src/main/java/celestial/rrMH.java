/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringEscapeUtils
 */
package celestial;

import celestial.rcD_2;
import celestial.rcZ_2;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rch_3;
import celestial.rcn_3;
import celestial.rct_3;
import celestial.rcu_3;
import celestial.rcy_3;
import celestial.rcz_3;
import celestial.rrbb_3;
import celestial.rrzX_2;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringEscapeUtils;

public class rrMH {
    private String[] id_class = null;
    private String id_break = null;
    private boolean id_byte = false;
    private int id_protected = 0;
    private String id_throws = null;
    private int id_case = 0;
    private static final int id_catch = 0;
    private static final int id_private = 1;
    private static final int id_implements = 2;
    private static final int id_finally = 3;
    private static final int id_extends = 4;
    private static final String id_native = "pattern:";
    private static final String id_volatile = "ipattern:";
    private static final String id_final = "regex:";
    private static final String id_package = "iregex:";
    private static final int id_int = 0;
    private static final int id_new = 1;
    private static final String id_continue = "#";
    private static final Pattern id_super = Pattern.compile("^#[0-9a-f]{6}+$");

    public rrMH(String string, String string2) {
        String[] stringArray = rrbb_3.id_class(string, ".");
        this.id_class = Arrays.copyOfRange(stringArray, 0, stringArray.length - 1);
        this.id_break = stringArray[stringArray.length - 1];
        if (string2.startsWith("!")) {
            this.id_byte = true;
            string2 = string2.substring(1);
        }
        if (string2.startsWith(id_native)) {
            this.id_protected = 1;
            string2 = string2.substring(id_native.length());
        } else if (string2.startsWith(id_volatile)) {
            this.id_protected = 2;
            string2 = string2.substring(id_volatile.length()).toLowerCase();
        } else if (string2.startsWith(id_final)) {
            this.id_protected = 3;
            string2 = string2.substring(id_final.length());
        } else if (string2.startsWith(id_package)) {
            this.id_protected = 4;
            string2 = string2.substring(id_package.length()).toLowerCase();
        } else {
            this.id_protected = 0;
        }
        string2 = StringEscapeUtils.unescapeJava((String)string2);
        if (this.id_protected == 0 && id_super.matcher(string2).matches()) {
            this.id_case = 1;
        }
        this.id_throws = string2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.id_class.length; ++i) {
            String string = this.id_class[i];
            if (i > 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append(string);
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.append(".");
        }
        stringBuffer.append(this.id_break);
        stringBuffer.append(" = ");
        stringBuffer.append(this.id_throws);
        return stringBuffer.toString();
    }

    public boolean id_class(String string) {
        if (string == null) {
            return false;
        }
        switch (this.id_protected) {
            case 0: {
                return string.equals(this.id_throws);
            }
            case 1: {
                return this.id_class(string, this.id_throws);
            }
            case 2: {
                return this.id_class(string.toLowerCase(), this.id_throws);
            }
            case 3: {
                return this.id_break(string, this.id_throws);
            }
            case 4: {
                return this.id_break(string.toLowerCase(), this.id_throws);
            }
        }
        throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.id_protected);
    }

    public boolean id_class(rcd_3 rcd_32) {
        if (this.id_byte) {
            return !this.id_break(rcd_32);
        }
        return this.id_break(rcd_32);
    }

    private static String id_class(String string, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        for (int i = n; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (bl) {
                if (c == 'b') {
                    stringBuilder.append('\b');
                } else if (c == 'f') {
                    stringBuilder.append('\f');
                } else if (c == 'n') {
                    stringBuilder.append('\n');
                } else if (c == 'r') {
                    stringBuilder.append('\r');
                } else if (c == 't') {
                    stringBuilder.append('\t');
                } else {
                    stringBuilder.append(c);
                }
                bl = false;
                continue;
            }
            if (c == '\\') {
                bl = true;
                continue;
            }
            if (c == '\"') break;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static String id_class(rcZ_2 rcZ_22, int n) {
        if (rcZ_22 == null) {
            return null;
        }
        if (!(rcZ_22 instanceof rca_3)) {
            if (rcZ_22 instanceof rcn_3) {
                rcn_3 rcn_32 = (rcn_3)rcZ_22;
                return n == 1 ? id_continue + rrzX_2.id_class(Integer.toHexString(rcn_32.id_case()), 6, '0') : Integer.toString(rcn_32.id_case());
            }
            if (rcZ_22 instanceof rch_3) {
                rch_3 rch_32 = (rch_3)rcZ_22;
                return Byte.toString(rch_32.id_private());
            }
            if (rcZ_22 instanceof rcD_2) {
                rcD_2 rcD_22 = (rcD_2)rcZ_22;
                return Short.toString(rcD_22.id_catch());
            }
            if (rcZ_22 instanceof rct_3) {
                rct_3 rct_32 = (rct_3)rcZ_22;
                return Long.toString(rct_32.id_throws());
            }
            if (rcZ_22 instanceof rcu_3) {
                rcu_3 rcu_32 = (rcu_3)rcZ_22;
                return Float.toString(rcu_32.id_finally());
            }
            if (rcZ_22 instanceof rcz_3) {
                rcz_3 rcz_32 = (rcz_3)rcZ_22;
                return Double.toString(rcz_32.id_implements());
            }
            return rcZ_22.toString();
        }
        rca_3 rca_32 = (rca_3)rcZ_22;
        String string = rca_32.id_native();
        if (string.startsWith("{") && string.endsWith("}")) {
            string = rrMH.id_break(string);
        } else if (string.startsWith("[{") && string.endsWith("}]")) {
            string = rrMH.id_break(string);
        }
        return string;
    }

    private boolean id_class(String string, String string2) {
        return rrzX_2.id_class(string, string2, '*', '?');
    }

    private static rcZ_2 id_class(rcZ_2 rcZ_22, String string) {
        if (rcZ_22 instanceof rcd_3) {
            rcd_3 rcd_32 = (rcd_3)rcZ_22;
            return rcd_32.id_byte(string);
        }
        if (rcZ_22 instanceof rcy_3) {
            rcy_3 rcy_32 = (rcy_3)rcZ_22;
            if (string.equals("count")) {
                return rcn_3.id_class(rcy_32.size());
            }
            int n = rrbb_3.id_class(string, -1);
            return n >= 0 && n < rcy_32.size() ? rcy_32.id_finally(n) : null;
        }
        return null;
    }

    public boolean id_class(rcZ_2 rcZ_22) {
        if (rcZ_22 == null) {
            return false;
        }
        String string = rrMH.id_class(rcZ_22, this.id_case);
        return this.id_class(string);
    }

    public boolean id_break(rcd_3 rcd_32) {
        if (rcd_32 == null) {
            return false;
        }
        rcZ_2 rcZ_22 = rcd_32;
        for (int i = 0; i < this.id_class.length; ++i) {
            String string = this.id_class[i];
            if ((rcZ_22 = rrMH.id_class(rcZ_22, string)) != null) continue;
            return false;
        }
        if (this.id_break.equals("*")) {
            return this.id_break(rcZ_22);
        }
        rcZ_2 rcZ_23 = rrMH.id_class(rcZ_22, this.id_break);
        if (rcZ_23 == null) {
            return false;
        }
        return this.id_class(rcZ_23);
    }

    private static String id_break(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = "\"text\":\"";
        int n = -1;
        while ((n = string.indexOf(string2, n + 1)) >= 0) {
            String string3 = rrMH.id_class(string, n + string2.length());
            if (string3 == null) continue;
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    private boolean id_break(String string, String string2) {
        return string.matches(string2);
    }

    private boolean id_break(rcZ_2 rcZ_22) {
        rcZ_2 rcZ_23;
        rcZ_2 rcZ_24;
        if (rcZ_22 instanceof rcd_3) {
            rcZ_24 = (rcd_3)rcZ_22;
            for (String string : ((rcd_3)rcZ_24).id_protected()) {
                rcZ_23 = ((rcd_3)rcZ_24).id_byte(string);
                if (!this.id_class(rcZ_23)) continue;
                return true;
            }
        }
        if (rcZ_22 instanceof rcy_3) {
            rcZ_24 = (rcy_3)rcZ_22;
            int n = ((rcy_3)rcZ_24).size();
            for (int i = 0; i < n; ++i) {
                rcZ_23 = ((rcy_3)rcZ_24).id_finally(i);
                if (!this.id_class(rcZ_23)) continue;
                return true;
            }
        }
        return false;
    }
}

