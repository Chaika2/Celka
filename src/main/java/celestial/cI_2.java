/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.FP;
import celestial.Ml_1;
import celestial.OA;
import celestial.QY;
import celestial.Qg_1;
import celestial.Qw_1;
import celestial.cf_3;
import celestial.ch_3;
import celestial.cm_3;
import celestial.cq_3;
import celestial.cx_3;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgn_3;
import celestial.rhJ_2;
import celestial.rpl_3;
import celestial.rrFR;
import celestial.rrLO;
import celestial.rrLh_1;
import celestial.rrQX;
import celestial.rrfu_3;
import celestial.vm_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Deque;
import java.util.List;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cI_2
extends ch_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final QY id_throws;
    private final List<String> id_case = Lists.newArrayList();
    private final List<cx_3<rgP_2>> id_catch = Lists.newArrayList();
    private final List<cx_3<rpl_3>> id_private = Lists.newArrayList();
    private final Deque<rgP_2> id_implements = Queues.newArrayDeque();
    private int id_finally;
    private boolean id_extends;
    private long id_native = 0L;
    private int id_volatile = 0;
    private String id_final;
    private int id_package;
    private int id_int;

    private void id_byte(rgP_2 rgP_22) {
        String string = rgP_22.getString();
        if (string.equals(this.id_final)) {
            if (((Qw_1)this.id_throws.id_class[20]).id_synchronized) {
                ++this.id_package;
                this.id_final = string;
                this.id_break(this.id_int);
                rVe_1 rVe_12 = rrfu_3.id_class().id_class().id_class(" (x" + this.id_package + ")").id_break();
                ((rVi_1)rgP_22).id_class(rVe_12);
            }
        } else {
            this.id_package = 1;
            this.id_final = string;
        }
        ++this.id_int;
        if (this.id_int > 256) {
            this.id_int = 0;
        }
        this.id_class(rgP_22, this.id_int);
    }

    public static int id_byte(double d) {
        return rfU_2.id_byte(d * 160.0 + 20.0);
    }

    private static double id_byte(int n) {
        double d = (double)n / 200.0;
        d = 1.0 - d;
        d *= 10.0;
        d = rfU_2.id_class(d, 0.0, 1.0);
        return d * d;
    }

    public cI_2(QY qY) {
        this.id_throws = qY;
    }

    public void id_class() {
        this.id_private.clear();
        this.id_throws();
        for (int i = this.id_catch.size() - 1; i >= 0; --i) {
            cx_3<rgP_2> cx_32 = this.id_catch.get(i);
            this.id_class(cx_32.id_class(), cx_32.id_byte(), cx_32.id_break(), true);
        }
    }

    public void id_class(String string) {
        if (this.id_case.isEmpty() || !this.id_case.get(this.id_case.size() - 1).equals(string)) {
            this.id_case.add(string);
        }
    }

    public void id_class(double d) {
        this.id_finally = (int)((double)this.id_finally + d);
        int n = this.id_private.size();
        if (this.id_finally > n - this.id_implements()) {
            this.id_finally = n - this.id_implements();
        }
        if (this.id_finally <= 0) {
            this.id_finally = 0;
            this.id_extends = false;
        }
    }

    public boolean id_class(double d, double d2) {
        if (this.id_extends() && !((Qw_1)this.id_throws.id_class[20]).g && !this.id_finally() && !this.id_implements.isEmpty()) {
            double d3 = d - 2.0;
            double d4 = (double)this.id_throws.id_else().id_this() - d2 - 40.0;
            if (d3 <= (double)rfU_2.id_byte((double)this.id_case() / this.id_private()) && d4 < 0.0 && d4 > (double)rfU_2.id_byte(-9.0 * this.id_private())) {
                this.id_class(this.id_implements.remove());
                this.id_native = System.currentTimeMillis();
                return true;
            }
            return false;
        }
        return false;
    }

    public void id_class(Ml_1 ml_1, int n) {
        if (this.id_private.isEmpty()) {
            return;
        }
        int n2 = this.id_case();
        if (this.id_volatile != n2) {
            this.id_volatile = n2;
            this.id_class();
        }
        if (!this.id_finally()) {
            this.id_volatile();
            int n3 = this.id_implements();
            int n4 = this.id_private.size();
            if (n4 > 0) {
                int n5;
                int n6;
                int n7;
                int n8;
                boolean bl = this.id_extends();
                double d = this.id_private();
                int n9 = rfU_2.id_throws((double)this.id_case() / d);
                RenderSystem.pushMatrix();
                RenderSystem.translatef(2.0f, 8.0f, 0.0f);
                RenderSystem.scaled(d, d, 1.0);
                double d2 = ((Qw_1)this.id_throws.id_class[20]).id_extends * (double)0.9f + (double)0.1f;
                double d3 = ((Qw_1)this.id_throws.id_class[20]).id_volatile;
                double d4 = 9.0 * (((Qw_1)this.id_throws.id_class[20]).id_native + 1.0);
                double d5 = -8.0 * (((Qw_1)this.id_throws.id_class[20]).id_native + 1.0) + 4.0 * ((Qw_1)this.id_throws.id_class[20]).id_native;
                int n10 = 0;
                for (n8 = 0; n8 + this.id_finally < this.id_private.size() && n8 < n3; ++n8) {
                    cx_3<rpl_3> cx_32 = this.id_private.get(n8 + this.id_finally);
                    if (cx_32 == null || (n7 = n - cx_32.id_break()) >= 200 && !bl) continue;
                    double d6 = bl ? 1.0 : cI_2.id_byte(n7);
                    n6 = (int)(255.0 * d6 * d2);
                    n5 = (int)(255.0 * d6 * d3);
                    ++n10;
                    if (n6 <= 3) continue;
                    boolean bl2 = false;
                    double d7 = (double)(-n8) * d4;
                    ml_1.id_class();
                    ml_1.id_class(0.0, 0.0, 50.0);
                    if (((Qw_1)this.id_throws.id_class[20]).Pb == 5) {
                        n9 = ((cm_3)this.id_throws.id_class[15]).id_class(cx_32.id_class()) - 2;
                    }
                    if (((Qw_1)this.id_throws.id_class[20]).Pb != 3) {
                        cI_2.id_class(ml_1, -2, (int)(d7 - d4), n9 + 4, (int)d7, n5 << 24);
                    }
                    RenderSystem.enableBlend();
                    ml_1.id_class(0.0, 0.0, 50.0);
                    if (!((Qw_1)this.id_throws.id_class[20]).PM) {
                        ((cm_3)this.id_throws.id_class[15]).id_break(ml_1, cx_32.id_class(), 0.0f, (float)((int)(d7 + d5)), 0xFFFFFF + (n6 << 24));
                    } else {
                        ((cm_3)this.id_throws.id_class[15]).id_class(ml_1, cx_32.id_class(), 0.0f, (float)((int)(d7 + d5)), 0xFFFFFF + (n6 << 24));
                    }
                    RenderSystem.disableAlphaTest();
                    RenderSystem.disableBlend();
                    ml_1.id_break();
                }
                if (!this.id_implements.isEmpty()) {
                    n8 = (int)(128.0 * d2);
                    int n11 = (int)(255.0 * d3);
                    ml_1.id_class();
                    ml_1.id_class(0.0, 0.0, 50.0);
                    cI_2.id_class(ml_1, -2, 0, n9 + 4, 9, n11 << 24);
                    RenderSystem.enableBlend();
                    ml_1.id_class(0.0, 0.0, 50.0);
                    ((cm_3)this.id_throws.id_class[15]).id_break(ml_1, (rgP_2)new rgn_3("chat.queue", this.id_implements.size()), 0.0f, 1.0f, 0xFFFFFF + (n8 << 24));
                    ml_1.id_break();
                    RenderSystem.disableAlphaTest();
                    RenderSystem.disableBlend();
                }
                if (bl) {
                    n8 = 9;
                    RenderSystem.translatef(-3.0f, 0.0f, 0.0f);
                    int n12 = n4 * n8 + n4;
                    n7 = n10 * n8 + n10;
                    int n13 = this.id_finally * n7 / n4;
                    int n14 = n7 * n7 / n12;
                    if (n12 != n7) {
                        n6 = n13 > 0 ? 170 : 96;
                        n5 = this.id_extends ? 0xCC3333 : 0x3333AA;
                        cI_2.id_class(ml_1, 0, -n13, 2, -n13 - n14, n5 + (n6 << 24));
                        cI_2.id_class(ml_1, 2, -n13, 1, -n13 - n14, 0xCCCCCC + (n6 << 24));
                    }
                }
                RenderSystem.popMatrix();
            }
        }
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_class(rgP_22, null);
    }

    public void id_class(boolean bl) {
        this.id_implements.clear();
        this.id_private.clear();
        this.id_catch.clear();
        this.id_final = null;
        this.id_package = 0;
        OA oA = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally();
        if (bl && oA != null && !oA.id_class(rrFR.id_class()).id_byte()) {
            this.id_case.clear();
        }
    }

    public void id_class(rgP_2 rgP_22, UUID uUID) {
        rrLh_1 rrLh_12 = rrLh_1.id_class(rgP_22, uUID);
        if (rrLh_12.id_byte()) {
            return;
        }
        this.id_byte(rrLh_12.id_throws());
        rrLO.id_class(rgP_22, rrLh_12.id_protected(), rrLh_12.id_break());
    }

    public void id_class(rgP_2 rgP_22, int n) {
        this.id_class(rgP_22, n, ((cq_3)this.id_throws.id_class[19]).id_case(), false);
        id_class.info("[CHAT] {}", (Object)rgP_22.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
    }

    private void id_class(rgP_2 rgP_22, int n, int n2, boolean bl) {
        if (n != 0) {
            this.id_break(n);
        }
        int n3 = rfU_2.id_byte((double)this.id_case() / this.id_private());
        List<rpl_3> list = cf_3.id_class(rgP_22, n3, (cm_3)this.id_throws.id_class[15]);
        boolean bl2 = this.id_extends();
        for (rpl_3 rpl_32 : list) {
            if (bl2 && this.id_finally > 0) {
                this.id_extends = true;
                this.id_class(1.0);
            }
            this.id_private.add(0, new cx_3<rpl_3>(n2, rpl_32, n));
        }
        while (this.id_private.size() > 100) {
            this.id_private.remove(this.id_private.size() - 1);
        }
        if (!bl) {
            this.id_catch.add(0, new cx_3<rgP_2>(n2, rgP_22, n));
            while (this.id_catch.size() > 100) {
                this.id_catch.remove(this.id_catch.size() - 1);
            }
        }
    }

    public void id_break(int n) {
        this.id_private.removeIf(cx_32 -> cx_32.id_byte() == n);
        this.id_catch.removeIf(cx_32 -> cx_32.id_byte() == n);
    }

    public void id_break(rgP_2 rgP_22, UUID uUID) {
        if (((Qw_1)this.id_throws.id_class[20]).id_try <= 0.0) {
            this.id_class(rgP_22, uUID);
        } else {
            long l = System.currentTimeMillis();
            if (l - this.id_native >= this.id_native()) {
                this.id_class(rgP_22, uUID);
                this.id_native = l;
            } else {
                this.id_implements.add(rgP_22);
            }
        }
    }

    public static int id_break(double d) {
        return rfU_2.id_byte(d * 280.0 + 40.0);
    }

    public rgc_3 id_break(double d, double d2) {
        if (this.id_extends() && !((Qw_1)this.id_throws.id_class[20]).g && !this.id_finally()) {
            double d3 = d - 2.0;
            double d4 = (double)this.id_throws.id_else().id_this() - d2 - 40.0 - (double)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().w().id_new();
            d3 = rfU_2.id_byte(d3 / this.id_private());
            d4 = rfU_2.id_byte(d4 / (this.id_private() * (((Qw_1)this.id_throws.id_class[20]).id_native + 1.0)));
            if (!(d3 < 0.0) && !(d4 < 0.0)) {
                int n;
                int n2 = Math.min(this.id_implements(), this.id_private.size());
                if (d3 <= (double)rfU_2.id_byte((double)this.id_case() / this.id_private()) && d4 < (double)(9 * n2 + n2) && (n = (int)(d4 / 9.0 + (double)this.id_finally)) >= 0 && n < this.id_private.size()) {
                    cx_3<rpl_3> cx_32 = this.id_private.get(n);
                    return ((cm_3)this.id_throws.id_class[15]).id_break().id_class(cx_32.id_class(), (int)d3);
                }
            }
        }
        return null;
    }

    public void id_break(rgP_2 rgP_22) {
        this.id_byte(rgP_22);
    }

    public void id_throws() {
        this.id_finally = 0;
        this.id_extends = false;
    }

    private boolean id_finally() {
        return ((Qw_1)this.id_throws.id_class[20]).id_finally == rhJ_2.HIDDEN;
    }

    public int id_catch() {
        return cI_2.id_byte((this.id_extends() ? ((Qw_1)this.id_throws.id_class[20]).id_while : ((Qw_1)this.id_throws.id_class[20]).id_goto) / (((Qw_1)this.id_throws.id_class[20]).id_native + 1.0));
    }

    private boolean id_extends() {
        return (vm_3)this.id_throws.id_class[73] instanceof FP;
    }

    public int id_case() {
        int n = cI_2.id_break(((Qw_1)this.id_throws.id_class[20]).id_public);
        Qg_1 qg_1 = QY.id_instanceof().id_else();
        int n2 = (int)((double)(qg_1.id_extends() - 3) / qg_1.id_return());
        return rfU_2.id_class(n, 0, n2);
    }

    public int id_implements() {
        return this.id_catch() / 9;
    }

    public List<String> id_protected() {
        return this.id_case;
    }

    public double id_private() {
        return ((Qw_1)this.id_throws.id_class[20]).id_return;
    }

    private void id_volatile() {
        long l;
        if (!this.id_implements.isEmpty() && (l = System.currentTimeMillis()) - this.id_native >= this.id_native()) {
            this.id_class(this.id_implements.remove());
            this.id_native = l;
        }
    }

    private long id_native() {
        return (long)(((Qw_1)this.id_throws.id_class[20]).id_try * 1000.0);
    }
}

