/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Range
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Oo_1;
import celestial.QJ;
import celestial.Qb_1;
import celestial.Qh_1;
import celestial.Qx_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.rHp_1;
import celestial.rKb_1;
import celestial.rKv_1;
import celestial.rRM;
import celestial.rRb_1;
import celestial.rST;
import celestial.rSa_1;
import celestial.rSu_1;
import celestial.rUE;
import celestial.rUG;
import celestial.rUs_1;
import celestial.rUv_1;
import celestial.rUx_1;
import celestial.rcd_3;
import celestial.rcn_3;
import celestial.rco_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.roC_2;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.rpJ_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqg_3;
import celestial.rrEJ;
import celestial.rrEQ;
import celestial.rrEl_1;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.rye_3;
import celestial.ryw_3;
import celestial.xu_3;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKG {
    private static final Logger id_class = LogManager.getLogger();
    private static final Predicate<an_3> id_break = rpJ_2.id_class.and(rpJ_2.id_class(0.0, 128.0, 0.0, 192.0));
    private final rrEQ id_byte = (rrEQ)new rrEQ(new rgn_3("entity.minecraft.ender_dragon"), rRb_1.PINK, rRM.PROGRESS).id_break(true).id_byte(true);
    private final rrEm_1 id_protected;
    private final List<Integer> id_throws = Lists.newArrayList();
    private final Qh_1 id_case;
    private int id_catch;
    private int id_private;
    private int id_implements;
    private int id_finally;
    private boolean id_extends;
    private boolean id_native;
    private UUID id_volatile;
    private boolean id_final = true;
    private rfH_2 id_package;
    private rKb_1 id_int;
    private int id_new;
    private List<rSa_1> id_continue;

    public int id_byte() {
        return this.id_private;
    }

    public rKG(rrEm_1 rrEm_12, long l, rcd_3 rcd_32) {
        this.id_protected = rrEm_12;
        if (rcd_32.id_byte("DragonKilled", 99)) {
            if (rcd_32.id_break("Dragon")) {
                this.id_volatile = rcd_32.id_class("Dragon");
            }
            this.id_extends = rcd_32.id_new("DragonKilled");
            this.id_native = rcd_32.id_new("PreviouslyKilled");
            if (rcd_32.id_new("IsRespawning")) {
                this.id_int = rKb_1.START;
            }
            if (rcd_32.id_byte("ExitPortalLocation", 10)) {
                this.id_package = rco_3.id_break(rcd_32.id_int("ExitPortalLocation"));
            }
        } else {
            this.id_extends = true;
            this.id_native = true;
        }
        if (rcd_32.id_byte("Gateways", 9)) {
            rcy_3 rcy_32 = rcd_32.id_protected("Gateways", 3);
            for (int i = 0; i < rcy_32.size(); ++i) {
                this.id_throws.add(rcy_32.id_throws(i));
            }
        } else {
            this.id_throws.addAll((Collection<Integer>)ContiguousSet.create((Range)Range.closedOpen((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(20)), (DiscreteDomain)DiscreteDomain.integers()));
            Collections.shuffle(this.id_throws, new Random(l));
        }
        this.id_case = Qx_1.id_class().id_class("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").id_class("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").id_class("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").id_class("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ").id_class("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ").id_class('#', ryw_3.id_class(Qb_1.id_class(xu_3.id_while))).id_break();
    }

    public void id_class(rSa_1 rSa_12, rye_3 rye_32) {
        if (this.id_int != null && this.id_continue.contains(rSa_12)) {
            id_class.debug("Aborting respawn sequence");
            this.id_int = null;
            this.id_new = 0;
            this.id_case();
            this.id_class(true);
        } else {
            this.id_volatile();
            an_3 an_32 = this.id_protected.id_break(this.id_volatile);
            if (an_32 instanceof rSu_1) {
                ((rSu_1)an_32).id_class(rSa_12, rSa_12.Bs(), rye_32);
            }
        }
    }

    public rcd_3 id_class() {
        rcd_3 rcd_32 = new rcd_3();
        if (this.id_volatile != null) {
            rcd_32.id_class("Dragon", this.id_volatile);
        }
        rcd_32.id_class("DragonKilled", this.id_extends);
        rcd_32.id_class("PreviouslyKilled", this.id_native);
        if (this.id_package != null) {
            rcd_32.id_class("ExitPortalLocation", rco_3.id_class(this.id_package));
        }
        rcy_3 rcy_32 = new rcy_3();
        for (int n : this.id_throws) {
            rcy_32.add(rcn_3.id_class(n));
        }
        rcd_32.id_class("Gateways", rcy_32);
        return rcd_32;
    }

    public void id_class(rSu_1 rSu_12) {
        if (rSu_12.ro().equals(this.id_volatile)) {
            this.id_byte.id_class(0.0f);
            this.id_byte.id_protected(false);
            this.id_class(true);
            this.id_final();
            if (!this.id_native) {
                this.id_protected.id_break(this.id_protected.id_class(rKv_1.MOTION_BLOCKING, rUs_1.id_class), xu_3.SX.id_continue());
            }
            this.id_native = true;
            this.id_extends = true;
        }
    }

    private void id_class(boolean bl) {
        rUs_1 rUs_12 = new rUs_1(bl);
        if (this.id_package == null) {
            this.id_package = this.id_protected.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class).id_break();
            while (this.id_protected.id_byte(this.id_package).id_class(xu_3.id_while) && this.id_package.c_() > this.id_protected.id_short()) {
                this.id_package = this.id_package.id_break();
            }
        }
        rUs_12.id_break(rUv_1.id_volatile).id_class(this.id_protected, this.id_protected.id_else().id_implements(), new Random(), this.id_package);
    }

    private void id_class(List<rSa_1> list) {
        if (this.id_extends && this.id_int == null) {
            QJ qJ = this.id_finally();
            while (qJ != null) {
                for (int i = 0; i < this.id_case.id_byte(); ++i) {
                    for (int j = 0; j < this.id_case.id_break(); ++j) {
                        for (int k = 0; k < this.id_case.id_class(); ++k) {
                            ryw_3 ryw_32 = qJ.id_class(i, j, k);
                            if (!ryw_32.id_class().id_class(xu_3.id_while) && !ryw_32.id_class().id_class(xu_3.SM)) continue;
                            this.id_protected.id_break(ryw_32.id_protected(), xu_3.Sh.id_continue());
                        }
                    }
                }
                qJ = this.id_finally();
            }
            this.id_int = rKb_1.START;
            this.id_new = 0;
            this.id_class(false);
            this.id_continue = list;
        }
    }

    protected void id_class(rKb_1 rKb_12) {
        if (this.id_int == null) {
            throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
        }
        this.id_new = 0;
        if (rKb_12 == rKb_1.END) {
            this.id_int = null;
            this.id_extends = false;
            rSu_1 rSu_12 = this.id_package();
            for (rhN_2 rhN_22 : this.id_byte.id_int()) {
                Oo_1.id_final.id_class(rhN_22, rSu_12);
            }
        } else {
            this.id_int = rKb_12;
        }
    }

    private void id_class(rfH_2 rfH_22) {
        this.id_protected.id_byte(3000, rfH_22, 0);
        rUx_1.id_byte.id_class(this.id_protected, this.id_protected.id_else().id_implements(), new Random(), rfH_22);
    }

    public void id_break() {
        this.id_byte.id_protected(!this.id_extends);
        if (++this.id_finally >= 20) {
            this.id_native();
            this.id_finally = 0;
        }
        if (!this.id_byte.id_int().isEmpty()) {
            this.id_protected.id_else().id_class(rrEl_1.id_break, new rfj_3(0, 0), 9, rqg_3.INSTANCE);
            boolean bl = this.id_extends();
            if (this.id_final && bl) {
                this.id_catch();
                this.id_final = false;
            }
            if (this.id_int != null) {
                if (this.id_continue == null && bl) {
                    this.id_int = null;
                    this.id_throws();
                }
                this.id_int.id_class(this.id_protected, this, this.id_continue, this.id_new++, this.id_package);
            }
            if (!this.id_extends) {
                if ((this.id_volatile == null || ++this.id_catch >= 1200) && bl) {
                    this.id_private();
                    this.id_catch = 0;
                }
                if (++this.id_implements >= 100 && bl) {
                    this.id_volatile();
                    this.id_implements = 0;
                }
            }
        } else {
            this.id_protected.id_else().id_break(rrEl_1.id_break, new rfj_3(0, 0), 9, rqg_3.INSTANCE);
        }
    }

    public void id_break(rSu_1 rSu_12) {
        if (rSu_12.ro().equals(this.id_volatile)) {
            this.id_byte.id_class(rSu_12.Ss() / rSu_12.SK());
            this.id_catch = 0;
            if (rSu_12.Bk()) {
                this.id_byte.id_class(rSu_12.L_());
            }
        }
    }

    public void id_throws() {
        if (this.id_extends && this.id_int == null) {
            Object object;
            rfH_2 rfH_22 = this.id_package;
            if (rfH_22 == null) {
                id_class.debug("Tried to respawn, but need to find the portal first.");
                object = this.id_finally();
                if (object == null) {
                    id_class.debug("Couldn't find a portal, so we made one.");
                    this.id_class(true);
                } else {
                    id_class.debug("Found the exit portal & temporarily using it.");
                }
                rfH_22 = this.id_package;
            }
            object = Lists.newArrayList();
            rfH_2 rfH_23 = rfH_22.id_break(1);
            for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                List<rSa_1> list = this.id_protected.id_class(rSa_1.class, new rfl_3(rfH_23.id_class(rpr_32, 2)));
                if (list.isEmpty()) {
                    return;
                }
                object.addAll(list);
            }
            id_class.debug("Found all crystals, respawning dragon.");
            this.id_class((List<rSa_1>)object);
        }
    }

    private QJ id_finally() {
        Object object;
        int n;
        int n2;
        for (n2 = -8; n2 <= 8; ++n2) {
            for (n = -8; n <= 8; ++n) {
                object = this.id_protected.id_throws(n2, n);
                for (ryO_2 ryO_22 : ((roJ_2)object).id_volatile().values()) {
                    QJ qJ;
                    if (!(ryO_22 instanceof rHp_1) || (qJ = this.id_case.id_class(this.id_protected, ryO_22.id_char())) == null) continue;
                    rfH_2 rfH_22 = qJ.id_class(3, 3, 3).id_protected();
                    if (this.id_package == null && rfH_22.b_() == 0 && rfH_22.d_() == 0) {
                        this.id_package = rfH_22;
                    }
                    return qJ;
                }
            }
        }
        for (n = n2 = this.id_protected.id_class(rKv_1.MOTION_BLOCKING, rUs_1.id_class).c_(); n >= 0; --n) {
            object = this.id_case.id_class(this.id_protected, new rfH_2(rUs_1.id_class.b_(), n, rUs_1.id_class.d_()));
            if (object == null) continue;
            if (this.id_package == null) {
                this.id_package = ((QJ)object).id_class(3, 3, 3).id_protected();
            }
            return object;
        }
        return null;
    }

    private void id_catch() {
        id_class.info("Scanning for legacy world dragon fight...");
        boolean bl = this.id_implements();
        if (bl) {
            id_class.info("Found that the dragon has been killed in this world already.");
            this.id_native = true;
        } else {
            id_class.info("Found that the dragon has not yet been killed in this world.");
            this.id_native = false;
            if (this.id_finally() == null) {
                this.id_class(false);
            }
        }
        List<rSu_1> list = this.id_protected.id_super();
        if (list.isEmpty()) {
            this.id_extends = true;
        } else {
            rSu_1 rSu_12 = list.get(0);
            this.id_volatile = rSu_12.ro();
            id_class.info("Found that there's a dragon still alive ({})", (Object)rSu_12);
            this.id_extends = false;
            if (!bl) {
                id_class.info("But we didn't have a portal, let's remove it.");
                rSu_12.PD();
                this.id_volatile = null;
            }
        }
        if (!this.id_native && this.id_extends) {
            this.id_extends = false;
        }
    }

    private boolean id_extends() {
        for (int i = -8; i <= 8; ++i) {
            for (int j = 8; j <= 8; ++j) {
                roC_2 roC_22 = this.id_protected.id_class(i, j, roN_2.id_volatile, false);
                if (!(roC_22 instanceof roJ_2)) {
                    return false;
                }
                rrEJ rrEJ2 = ((roJ_2)roC_22).id_instanceof();
                if (rrEJ2.id_class(rrEJ.TICKING)) continue;
                return false;
            }
        }
        return true;
    }

    public void id_case() {
        for (rUG rUG2 : rUE.id_class(this.id_protected)) {
            for (rSa_1 rSa_12 : this.id_protected.id_class(rSa_1.class, rUG2.id_case())) {
                rSa_12.id_catch(false);
                rSa_12.id_class((rfH_2)null);
            }
        }
    }

    private boolean id_implements() {
        for (int i = -8; i <= 8; ++i) {
            for (int j = -8; j <= 8; ++j) {
                roJ_2 roJ_22 = this.id_protected.id_throws(i, j);
                for (ryO_2 ryO_22 : roJ_22.id_volatile().values()) {
                    if (!(ryO_22 instanceof rHp_1)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private rSu_1 id_package() {
        this.id_protected.id_this(new rfH_2(0, 128, 0));
        rSu_1 rSu_12 = aI_2.id_this.id_class(this.id_protected);
        rSu_12.L().id_class(rST.id_class);
        rSu_12.id_class(0.0, 128.0, 0.0, this.id_protected.id_int.nextFloat() * 360.0f, 0.0f);
        this.id_protected.a_(rSu_12);
        this.id_volatile = rSu_12.ro();
        return rSu_12;
    }

    public boolean id_protected() {
        return this.id_native;
    }

    private void id_private() {
        List<rSu_1> list = this.id_protected.id_super();
        if (list.isEmpty()) {
            id_class.debug("Haven't seen the dragon, respawning it");
            this.id_package();
        } else {
            id_class.debug("Haven't seen our dragon, but found another one to use.");
            this.id_volatile = list.get(0).ro();
        }
    }

    private void id_final() {
        if (!this.id_throws.isEmpty()) {
            int n = this.id_throws.remove(this.id_throws.size() - 1);
            int n2 = rfU_2.id_byte(96.0 * Math.cos(2.0 * (-Math.PI + 0.15707963267948966 * (double)n)));
            int n3 = rfU_2.id_byte(96.0 * Math.sin(2.0 * (-Math.PI + 0.15707963267948966 * (double)n)));
            this.id_class(new rfH_2(n2, 75, n3));
        }
    }

    private void id_volatile() {
        this.id_implements = 0;
        this.id_private = 0;
        for (rUG rUG2 : rUE.id_class(this.id_protected)) {
            this.id_private += this.id_protected.id_class(rSa_1.class, rUG2.id_case()).size();
        }
        id_class.debug("Found {} end crystals still alive", (Object)this.id_private);
    }

    private void id_native() {
        HashSet hashSet = Sets.newHashSet();
        for (rhN_2 object2 : this.id_protected.id_class(id_break)) {
            this.id_byte.id_class(object2);
            hashSet.add(object2);
        }
        HashSet hashSet2 = Sets.newHashSet(this.id_byte.id_int());
        hashSet2.removeAll(hashSet);
        Iterator iterator = hashSet2.iterator();
        while (iterator.hasNext()) {
            rhN_2 rhN_22 = (rhN_2)iterator.next();
            this.id_byte.id_break(rhN_22);
        }
    }
}

