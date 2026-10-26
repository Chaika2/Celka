/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  it.unimi.dsi.fastutil.objects.Object2LongMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package celestial;

import celestial.rfH_2;
import celestial.rlC_2;
import celestial.rlH_2;
import celestial.rlU_2;
import celestial.rlV_2;
import celestial.rla_3;
import celestial.rlj_3;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.ryG_2;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;

public class rle_3 {
    private final rlj_3 id_class;
    private rfH_2 id_break;
    private final rrEm_1 id_byte;
    private final Collection<rlC_2> id_protected = Lists.newArrayList();
    private final int id_throws;
    private final Collection<rlV_2> id_case = Lists.newCopyOnWriteArrayList();
    private Object2LongMap<Runnable> id_catch = new Object2LongOpenHashMap();
    private long id_private;
    private long id_implements;
    private boolean id_finally = false;
    private final Stopwatch id_extends = Stopwatch.createUnstarted();
    private boolean id_native = false;
    private final rqd_3 id_volatile;
    private Throwable id_final;

    public String id_byte() {
        return this.id_class.id_class();
    }

    private void id_int() {
        if (this.id_finally) {
            throw new IllegalStateException("Test already started");
        }
        this.id_finally = true;
        try {
            this.id_class.id_class(new rla_3(this));
        }
        catch (Exception exception) {
            this.id_class(exception);
        }
    }

    public rle_3(rlj_3 rlj_32, rqd_3 rqd_32, rrEm_1 rrEm_12) {
        this.id_class = rlj_32;
        this.id_byte = rrEm_12;
        this.id_throws = rlj_32.id_byte();
        this.id_volatile = rlj_32.id_catch().id_class(rqd_32);
    }

    public String toString() {
        return this.id_byte();
    }

    public void id_class(Throwable throwable) {
        this.id_new();
        this.id_final = throwable;
        this.id_protected.forEach(rlC_22 -> rlC_22.id_break(this));
    }

    public void id_class(rlC_2 rlC_22) {
        this.id_protected.add(rlC_22);
    }

    public void id_class(rfH_2 rfH_22, int n) {
        ryG_2 ryG_22 = rlH_2.id_class(this.id_volatile(), rfH_22, this.id_final(), n, this.id_byte, false);
        this.id_class(ryG_22.id_char());
        ryG_22.id_class(this.id_byte());
        rlH_2.id_class(this.id_break, new rfH_2(1, 0, -1), this.id_final(), this.id_byte);
        this.id_protected.forEach(rlC_22 -> rlC_22.id_class(this));
    }

    public void id_class() {
        this.id_private = this.id_byte.r() + 1L + this.id_class.id_case();
        this.id_extends.start();
    }

    public void id_class(rfH_2 rfH_22) {
        this.id_break = rfH_22;
    }

    public void id_break() {
        if (!this.id_implements()) {
            this.id_implements = this.id_byte.r() - this.id_private;
            if (this.id_implements >= 0L) {
                if (this.id_implements == 0L) {
                    this.id_int();
                }
                ObjectIterator objectIterator = this.id_catch.object2LongEntrySet().iterator();
                while (objectIterator.hasNext()) {
                    Object2LongMap.Entry entry = (Object2LongMap.Entry)objectIterator.next();
                    if (entry.getLongValue() > this.id_implements) continue;
                    try {
                        ((Runnable)entry.getKey()).run();
                    }
                    catch (Exception exception) {
                        this.id_class(exception);
                    }
                    objectIterator.remove();
                }
                if (this.id_implements > (long)this.id_throws) {
                    if (this.id_case.isEmpty()) {
                        this.id_class(new rlU_2("Didn't succeed or fail within " + this.id_class.id_byte() + " ticks"));
                    } else {
                        this.id_case.forEach(rlV_22 -> rlV_22.id_break(this.id_implements));
                        if (this.id_final == null) {
                            this.id_class(new rlU_2("No sequences finished"));
                        }
                    }
                } else {
                    this.id_case.forEach(rlV_22 -> rlV_22.id_class(this.id_implements));
                }
            }
        }
    }

    public rrEm_1 id_throws() {
        return this.id_byte;
    }

    public Throwable id_finally() {
        return this.id_final;
    }

    public boolean id_catch() {
        return this.id_final != null;
    }

    public boolean id_extends() {
        return this.id_class.id_protected();
    }

    public boolean id_case() {
        return this.id_native && this.id_final == null;
    }

    public boolean id_implements() {
        return this.id_native;
    }

    private void id_new() {
        if (!this.id_native) {
            this.id_native = true;
            this.id_extends.stop();
        }
    }

    public rlj_3 id_package() {
        return this.id_class;
    }

    public rfH_2 id_protected() {
        return this.id_break;
    }

    public boolean id_private() {
        return this.id_finally;
    }

    public rqd_3 id_final() {
        return this.id_volatile;
    }

    public String id_volatile() {
        return this.id_class.id_break();
    }

    public boolean id_native() {
        return !this.id_class.id_protected();
    }
}

