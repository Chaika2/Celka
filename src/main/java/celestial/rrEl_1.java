/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rja_3;
import celestial.rqg_3;
import java.util.Comparator;

public class rrEl_1<T> {
    private final String id_implements;
    private final Comparator<T> id_finally;
    private final long id_extends;
    public static final rrEl_1<rqg_3> id_class = rrEl_1.id_class("start", (rqg_32, rqg_33) -> 0);
    public static final rrEl_1<rqg_3> id_break = rrEl_1.id_class("dragon", (rqg_32, rqg_33) -> 0);
    public static final rrEl_1<rfj_3> id_byte = rrEl_1.id_class("player", Comparator.comparingLong(rfj_3::id_class));
    public static final rrEl_1<rfj_3> id_protected = rrEl_1.id_class("forced", Comparator.comparingLong(rfj_3::id_class));
    public static final rrEl_1<rfj_3> id_throws = rrEl_1.id_class("light", Comparator.comparingLong(rfj_3::id_class));
    public static final rrEl_1<rfH_2> id_case = rrEl_1.id_class("portal", rja_3::id_catch, 300);
    public static final rrEl_1<Integer> id_catch = rrEl_1.id_class("post_teleport", Integer::compareTo, 5);
    public static final rrEl_1<rfj_3> id_private = rrEl_1.id_class("unknown", Comparator.comparingLong(rfj_3::id_class), 1);

    protected rrEl_1(String string, Comparator<T> comparator, long l) {
        this.id_implements = string;
        this.id_finally = comparator;
        this.id_extends = l;
    }

    public String toString() {
        return this.id_implements;
    }

    public static <T> rrEl_1<T> id_class(String string, Comparator<T> comparator) {
        return new rrEl_1<T>(string, comparator, 0L);
    }

    public static <T> rrEl_1<T> id_class(String string, Comparator<T> comparator, int n) {
        return new rrEl_1<T>(string, comparator, n);
    }

    public Comparator<T> id_class() {
        return this.id_finally;
    }

    public long id_break() {
        return this.id_extends;
    }
}

