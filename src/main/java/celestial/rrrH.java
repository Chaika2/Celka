/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rUv_1;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rja_3;
import celestial.rqm_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrZ;
import celestial.rrrn_1;
import celestial.rrry_1;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class rrrH<C extends rUv_1> {
    public static final rrrH<?> id_class = new rrry_1((rrrZ)rrrZ.id_byte, 0, 0, rfi_3.id_class(), 0, 0L);
    private final rrrZ<C> id_throws;
    protected final List<rrrn_1> id_break = Lists.newArrayList();
    protected rfi_3 id_byte;
    private final int id_case;
    private final int id_catch;
    private int id_private;
    protected final rqm_3 id_protected;

    public rfi_3 id_byte() {
        return this.id_byte;
    }

    public rrrH(rrrZ<C> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        this.id_throws = rrrZ2;
        this.id_case = n;
        this.id_catch = n2;
        this.id_private = n3;
        this.id_protected = new rqm_3();
        this.id_protected.id_byte(l, n, n2);
        this.id_byte = rfi_32;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public rcd_3 id_class(int n, int n2) {
        rcd_3 rcd_32 = new rcd_3();
        if (this.id_throws()) {
            rcd_32.id_class("id", rVL.t.id_break(this.id_native()).toString());
            rcd_32.id_break("ChunkX", n);
            rcd_32.id_break("ChunkZ", n2);
            rcd_32.id_break("references", this.id_private);
            rcd_32.id_class("BB", this.id_byte.id_private());
            rcy_3 rcy_32 = new rcy_3();
            List<rrrn_1> list = this.id_break;
            synchronized (list) {
                for (rrrn_1 rrrn_12 : this.id_break) {
                    rcy_32.add(rrrn_12.id_case());
                }
            }
            rcd_32.id_class("Children", rcy_32);
            return rcd_32;
        }
        rcd_32.id_class("id", "INVALID");
        return rcd_32;
    }

    public rfH_2 id_class() {
        return new rfH_2(this.id_case << 4, 0, this.id_catch << 4);
    }

    protected void id_class(Random random, int n, int n2) {
        int n3 = n2 - n + 1 - this.id_byte.id_throws();
        int n4 = n3 > 1 ? n + random.nextInt(n3) : n;
        int n5 = n4 - this.id_byte.id_break;
        this.id_byte.id_class(0, n5, 0);
        for (rrrn_1 rrrn_12 : this.id_break) {
            rrrn_12.id_class(0, n5, 0);
        }
    }

    public abstract void id_class(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, C var7);

    protected void id_class(int n, Random random, int n2) {
        int n3 = n - n2;
        int n4 = this.id_byte.id_throws() + 1;
        if (n4 < n3) {
            n4 += random.nextInt(n3 - n4);
        }
        int n5 = n4 - this.id_byte.id_throws;
        this.id_byte.id_class(0, n5, 0);
        for (rrrn_1 rrrn_12 : this.id_break) {
            rrrn_12.id_class(0, n5, 0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32) {
        List<rrrn_1> list = this.id_break;
        synchronized (list) {
            if (!this.id_break.isEmpty()) {
                rfi_3 rfi_33 = this.id_break.get((int)0).id_final;
                rja_3 rja_32 = rfi_33.id_catch();
                rfH_2 rfH_22 = new rfH_2(rja_32.b_(), rfi_33.id_break, rja_32.d_());
                Iterator<rrrn_1> iterator = this.id_break.iterator();
                while (iterator.hasNext()) {
                    rrrn_1 rrrn_12 = iterator.next();
                    if (!rrrn_12.id_catch().id_class(rfi_32) || rrrn_12.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32, rfH_22)) continue;
                    iterator.remove();
                }
                this.id_break();
            }
        }
    }

    protected void id_break() {
        this.id_byte = rfi_3.id_class();
        for (rrrn_1 rrrn_12 : this.id_break) {
            this.id_byte.id_break(rrrn_12.id_catch());
        }
    }

    public boolean id_throws() {
        return !this.id_break.isEmpty();
    }

    public int id_finally() {
        return this.id_private;
    }

    public int id_catch() {
        return this.id_catch;
    }

    protected int id_extends() {
        return 1;
    }

    public int id_case() {
        return this.id_case;
    }

    public void id_implements() {
        ++this.id_private;
    }

    public List<rrrn_1> id_protected() {
        return this.id_break;
    }

    public boolean id_private() {
        return this.id_private < this.id_extends();
    }

    public rrrZ<?> id_native() {
        return this.id_throws;
    }
}

