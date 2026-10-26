/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  com.google.common.primitives.UnsignedLong
 *  com.mojang.serialization.Dynamic
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.RP;
import celestial.Rr_1;
import celestial.go_3;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcy_3;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gi_3<T> {
    private static final Logger id_class = LogManager.getLogger();
    private final RP<T> id_break;
    private final Queue<Rr_1<T>> id_byte = new PriorityQueue<Rr_1<T>>(gi_3.id_byte());
    private UnsignedLong id_protected = UnsignedLong.ZERO;
    private final Table<String, Long, Rr_1<T>> id_throws = HashBasedTable.create();

    private static <T> Comparator<Rr_1<T>> id_byte() {
        return Comparator.comparingLong(rr_1 -> rr_1.id_class).thenComparing(rr_1 -> rr_1.id_break);
    }

    public gi_3(RP<T> rP) {
        this.id_break = rP;
    }

    public gi_3(RP<T> rP, Stream<Dynamic<rcZ_2>> stream) {
        this(rP);
        this.id_byte.clear();
        this.id_throws.clear();
        this.id_protected = UnsignedLong.ZERO;
        stream.forEach(dynamic -> {
            if (!(dynamic.getValue() instanceof rcd_3)) {
                id_class.warn("Invalid format of events: {}", dynamic);
            } else {
                this.id_class((rcd_3)dynamic.getValue());
            }
        });
    }

    private rcd_3 id_class(Rr_1<T> rr_1) {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("Name", rr_1.id_byte);
        rcd_32.id_class("TriggerTime", rr_1.id_class);
        rcd_32.id_class("Callback", this.id_break.id_class(rr_1.id_protected));
        return rcd_32;
    }

    private void id_class(rcd_3 rcd_32) {
        rcd_3 rcd_33 = rcd_32.id_int("Callback");
        go_3<T> go_32 = this.id_break.id_class(rcd_33);
        if (go_32 != null) {
            String string = rcd_32.id_native("Name");
            long l = rcd_32.id_implements("TriggerTime");
            this.id_class(string, l, go_32);
        }
    }

    public void id_class(T t, long l) {
        Rr_1<T> rr_1;
        while ((rr_1 = this.id_byte.peek()) != null && rr_1.id_class <= l) {
            this.id_byte.remove();
            this.id_throws.remove((Object)rr_1.id_byte, (Object)l);
            rr_1.id_protected.id_class(t, this, l);
        }
        return;
    }

    public int id_class(String string) {
        Collection collection = this.id_throws.row((Object)string).values();
        collection.forEach(this.id_byte::remove);
        int n = collection.size();
        collection.clear();
        return n;
    }

    public Set<String> id_class() {
        return Collections.unmodifiableSet(this.id_throws.rowKeySet());
    }

    public void id_class(String string, long l, go_3<T> go_32) {
        if (!this.id_throws.contains((Object)string, (Object)l)) {
            this.id_protected = this.id_protected.plus(UnsignedLong.ONE);
            Rr_1<T> rr_1 = new Rr_1<T>(l, this.id_protected, string, go_32);
            this.id_throws.put((Object)string, (Object)l, rr_1);
            this.id_byte.add(rr_1);
        }
    }

    public rcy_3 id_break() {
        rcy_3 rcy_32 = new rcy_3();
        this.id_byte.stream().sorted(gi_3.id_byte()).map(this::id_class).forEach(rcy_32::add);
        return rcy_32;
    }
}

