/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXA;
import celestial.rrXC;
import celestial.rrXV;
import celestial.rrXf_1;
import celestial.rrXo_1;
import celestial.rrXt_1;
import celestial.rrXw_1;
import celestial.rrbb_3;
import celestial.rrdq_1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrdt_1 {
    private boolean id_class = true;
    private Deque<Boolean> id_break = new ArrayDeque<Boolean>();
    private Deque<Boolean> id_byte = new ArrayDeque<Boolean>();
    private Map<String, String> id_protected = new HashMap<String, String>();
    private static final Pattern id_throws = Pattern.compile("\\s*#\\s*(\\w+)\\s*(.*)");
    private static final Pattern id_case = Pattern.compile("defined\\s+(\\w+)");
    private static final Pattern id_catch = Pattern.compile("defined\\s*\\(\\s*(\\w+)\\s*\\)");
    private static final Pattern id_private = Pattern.compile("(\\w+)");
    private static final String id_implements = "define";
    private static final String id_finally = "undef";
    private static final String id_extends = "ifdef";
    private static final String id_native = "ifndef";
    private static final String id_volatile = "if";
    private static final String id_final = "else";
    private static final String id_package = "elif";
    private static final String id_int = "endif";
    private static final List<String> id_new = Arrays.asList("define", "undef", "ifdef", "ifndef", "if", "else", "elif", "endif");

    private boolean id_byte(String object) {
        Object object2;
        Object object3;
        Object object4;
        Matcher matcher = id_case.matcher((CharSequence)object);
        object = matcher.replaceAll("defined_$1");
        Matcher matcher2 = id_catch.matcher((CharSequence)object);
        object = matcher2.replaceAll("defined_$1");
        boolean bl = false;
        int n = 0;
        block2: do {
            bl = false;
            object4 = id_private.matcher((CharSequence)object);
            while (((Matcher)object4).find()) {
                char c;
                object3 = ((Matcher)object4).group();
                if (((String)object3).length() <= 0 || !Character.isLetter(c = ((String)object3).charAt(0)) && c != '_' || !this.id_protected.containsKey(object3)) continue;
                object2 = this.id_protected.get(object3);
                if (object2 == null) {
                    object2 = "1";
                }
                int n2 = ((Matcher)object4).start();
                int n3 = ((Matcher)object4).end();
                object = ((String)object).substring(0, n2) + " " + (String)object2 + " " + ((String)object).substring(n3);
                bl = true;
                ++n;
                continue block2;
            }
        } while (bl && n < 100);
        if (n >= 100) {
            rrbb_3.id_protected("Too many iterations: " + n + ", when resolving: " + (String)object);
            return true;
        }
        try {
            object4 = new rrdq_1(this.id_protected);
            object3 = new rrXA((rrXV)object4);
            rrXt_1 rrXt_12 = ((rrXA)object3).id_byte((String)object);
            if (rrXt_12.id_byte() == rrXC.BOOL) {
                object2 = (rrXw_1)rrXt_12;
                return object2.id_break();
            }
            if (rrXt_12.id_byte() == rrXC.FLOAT) {
                object2 = (rrXf_1)rrXt_12;
                float f = object2.id_class();
                return f != 0.0f;
            }
            throw new rrXo_1("Not a boolean or float expression: " + rrXt_12.id_byte());
        }
        catch (rrXo_1 rrXo_12) {
            rrbb_3.id_protected("Invalid macro expression: " + (String)object);
            rrbb_3.id_protected("Error: " + rrXo_12.getMessage());
            return false;
        }
    }

    public boolean id_class(String string) {
        Matcher matcher = id_throws.matcher(string);
        if (!matcher.matches()) {
            return this.id_class;
        }
        String string2 = matcher.group(1);
        String string3 = matcher.group(2);
        int n = string3.indexOf("//");
        if (n >= 0) {
            string3 = string3.substring(0, n);
        }
        boolean bl = this.id_class;
        this.id_class(string2, string3);
        this.id_class = !this.id_break.contains(Boolean.FALSE);
        return this.id_class || bl;
    }

    private void id_class(String string, String string2) {
        String string3;
        StringTokenizer stringTokenizer = new StringTokenizer(string2, " \t");
        String string4 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
        String string5 = string3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken("").trim() : "";
        if (string.equals(id_implements)) {
            this.id_protected.put(string4, string3);
        } else if (string.equals(id_finally)) {
            this.id_protected.remove(string4);
        } else if (string.equals(id_extends)) {
            boolean bl = this.id_protected.containsKey(string4);
            this.id_break.add(bl);
            this.id_byte.add(bl);
        } else if (string.equals(id_native)) {
            boolean bl = !this.id_protected.containsKey(string4);
            this.id_break.add(bl);
            this.id_byte.add(bl);
        } else if (string.equals(id_volatile)) {
            boolean bl = this.id_byte(string2);
            this.id_break.add(bl);
            this.id_byte.add(bl);
        } else if (!this.id_break.isEmpty()) {
            if (string.equals(id_package)) {
                boolean bl = this.id_break.removeLast();
                boolean bl2 = this.id_byte.removeLast();
                if (bl2) {
                    this.id_break.add(false);
                    this.id_byte.add(bl2);
                } else {
                    boolean bl3 = this.id_byte(string2);
                    this.id_break.add(bl3);
                    this.id_byte.add(bl3);
                }
            } else if (string.equals(id_final)) {
                boolean bl = this.id_break.removeLast();
                boolean bl4 = this.id_byte.removeLast();
                boolean bl5 = !bl4;
                this.id_break.add(bl5);
                this.id_byte.add(true);
            } else if (string.equals(id_int)) {
                this.id_break.removeLast();
                this.id_byte.removeLast();
            }
        }
    }

    public static boolean id_break(String string) {
        Matcher matcher = id_throws.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(1);
        return id_new.contains(string2);
    }
}

