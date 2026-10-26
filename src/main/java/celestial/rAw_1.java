/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.Ar_1;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public final class rAw_1 {
    public static final Comparator<Ar_1> id_class = (ar_1, ar_12) -> String.CASE_INSENSITIVE_ORDER.compare(rAw_1.id_class(ar_1, false), rAw_1.id_class(ar_12, false));
    public static final Comparator<Ar_1> id_break = (ar_1, ar_12) -> -String.CASE_INSENSITIVE_ORDER.compare(rAw_1.id_class(ar_1, true), rAw_1.id_class(ar_12, true));
    private final Runnable id_byte;
    private int id_protected;
    private Comparator<Ar_1> id_throws;
    private Pattern id_case;
    private String id_catch;

    private void id_byte() {
        if (this.id_protected == 0) {
            this.id_byte.run();
        }
    }

    public rAw_1(Runnable runnable) {
        this.id_byte = runnable;
    }

    public void id_class(Comparator<Ar_1> comparator) {
        this.id_throws = comparator;
        this.id_byte();
    }

    public void id_class(String string) {
        if (!Objects.equals(string = StringUtils.trimToNull((String)string), this.id_catch)) {
            this.id_catch = string;
            this.id_case = this.id_catch == null ? null : Pattern.compile("\\Q" + string.replace("*", "\\E.*\\Q") + "\\E", 2);
            this.id_byte();
        }
    }

    public void id_class(List<Ar_1> list, List<Ar_1> list2) {
        list2.clear();
        this.id_break(list, list2);
        if (this.id_throws != null) {
            list2.sort(this.id_throws);
        }
    }

    private static String id_class(Ar_1 ar_1) {
        return ar_1 == null ? "<INVALID>" : ar_1.id_class().id_throws().id_byte();
    }

    private static String id_class(Ar_1 ar_1, boolean bl) {
        String string = bl ? "a" : "x";
        return string + rAw_1.id_class(ar_1);
    }

    public void id_class() {
        ++this.id_protected;
    }

    private static String id_break(Ar_1 ar_1) {
        return ar_1 == null ? "<INVALID>" : ar_1.id_class().id_case().id_byte();
    }

    private boolean id_break(String string) {
        return this.id_case == null || string.equals("..") || this.id_case.matcher(string.toLowerCase()).find();
    }

    private void id_break(List<Ar_1> list, List<Ar_1> list2) {
        for (Ar_1 ar_1 : list) {
            if (!this.id_break(rAw_1.id_class(ar_1)) && !this.id_break(rAw_1.id_break(ar_1))) continue;
            list2.add(ar_1);
        }
    }

    public void id_break() {
        if (this.id_protected > 0) {
            --this.id_protected;
            this.id_byte();
        }
    }
}

