/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.Oo_1;
import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.aw_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.rEB;
import celestial.rHE;
import celestial.rHG;
import celestial.rKv_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rRM;
import celestial.rRO;
import celestial.rRb_1;
import celestial.rRh_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rcy_3;
import celestial.rdC_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rlB_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEB;
import celestial.rrEQ;
import celestial.rrES;
import celestial.rrEj_1;
import celestial.rrEm_1;
import celestial.rvt_3;
import celestial.rxL_2;
import celestial.xu_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class rrEr_1 {
    private static final rgP_2 id_class = new rgn_3("event.minecraft.raid");
    private static final rgP_2 id_break = new rgn_3("event.minecraft.raid.victory");
    private static final rgP_2 id_byte = new rgn_3("event.minecraft.raid.defeat");
    private static final rgP_2 id_protected = id_class.id_case().id_break(" - ").id_class(id_break);
    private static final rgP_2 id_throws = id_class.id_case().id_break(" - ").id_class(id_byte);
    private final Map<Integer, rEB> id_case = Maps.newHashMap();
    private final Map<Integer, Set<rEB>> id_catch = Maps.newHashMap();
    private final Set<UUID> id_private = Sets.newHashSet();
    private long id_implements;
    private rfH_2 id_finally;
    private final rrEm_1 id_extends;
    private boolean id_native;
    private final int id_volatile;
    private float id_final;
    private int id_package;
    private boolean id_int;
    private int id_new;
    private final rrEQ id_continue = new rrEQ(id_class, rRb_1.RED, rRM.NOTCHED_10);
    private int id_super;
    private int id_this;
    private final Random id_else = new Random();
    private final int id_synchronized;
    private rrEB id_return;
    private int id_public;
    private Optional<rfH_2> id_goto = Optional.empty();

    private boolean id_char() {
        return this.id_this == 0 && (this.id_new < this.id_synchronized || this.id_throw()) && this.id_int() == 0;
    }

    private Optional<rfH_2> id_byte(int n) {
        for (int i = 0; i < 3; ++i) {
            rfH_2 rfH_22 = this.id_class(n, 1);
            if (rfH_22 == null) continue;
            return Optional.of(rfH_22);
        }
        return Optional.empty();
    }

    private void id_byte(rfH_2 rfH_22) {
        this.id_finally = rfH_22;
    }

    public boolean id_byte() {
        return this.id_new > 0;
    }

    public int id_int() {
        return this.id_catch.values().stream().mapToInt(Set::size).sum();
    }

    public rrEr_1(rrEm_1 rrEm_12, rcd_3 rcd_32) {
        this.id_extends = rrEm_12;
        this.id_volatile = rcd_32.id_private("Id");
        this.id_native = rcd_32.id_new("Started");
        this.id_int = rcd_32.id_new("Active");
        this.id_implements = rcd_32.id_implements("TicksActive");
        this.id_package = rcd_32.id_private("BadOmenLevel");
        this.id_new = rcd_32.id_private("GroupsSpawned");
        this.id_this = rcd_32.id_private("PreRaidTicks");
        this.id_super = rcd_32.id_private("PostRaidTicks");
        this.id_final = rcd_32.id_finally("TotalHealth");
        this.id_finally = new rfH_2(rcd_32.id_private("CX"), rcd_32.id_private("CY"), rcd_32.id_private("CZ"));
        this.id_synchronized = rcd_32.id_private("NumGroups");
        this.id_return = rrEB.id_class(rcd_32.id_native("Status"));
        this.id_private.clear();
        if (rcd_32.id_byte("HeroesOfTheVillage", 9)) {
            rcy_3 rcy_32 = rcd_32.id_protected("HeroesOfTheVillage", 11);
            for (int i = 0; i < rcy_32.size(); ++i) {
                this.id_private.add(rco_3.id_class(rcy_32.id_finally(i)));
            }
        }
    }

    public rrEr_1(int n, rrEm_1 rrEm_12, rfH_2 rfH_22) {
        this.id_volatile = n;
        this.id_extends = rrEm_12;
        this.id_int = true;
        this.id_this = 300;
        this.id_continue.id_class(0.0f);
        this.id_finally = rfH_22;
        this.id_synchronized = this.id_class(rrEm_12.id_abstract());
        this.id_return = rrEB.ONGOING;
    }

    public boolean id_this() {
        return this.id_int;
    }

    private void id_interface() {
        Iterator<Set<rEB>> iterator = this.id_catch.values().iterator();
        HashSet hashSet = Sets.newHashSet();
        while (iterator.hasNext()) {
            Set<rEB> set = iterator.next();
            Object object = set.iterator();
            while (object.hasNext()) {
                rEB rEB2 = (rEB)object.next();
                rfH_2 rfH_22 = rEB2.Bs();
                if (!((Boolean)rEB2.id_throws[27]).booleanValue() && ((rYB)rEB2.id_throws[7]).E() == this.id_extends.E() && !(this.id_finally.id_private(rfH_22) >= 12544.0)) {
                    if ((Integer)rEB2.id_throws[41] <= 600) continue;
                    if (this.id_extends.id_break(rEB2.ro()) == null) {
                        hashSet.add(rEB2);
                    }
                    if (!this.id_extends.id_throw(rfH_22) && rEB2.BI() > 2400) {
                        rEB2.id_break(rEB2.sz() + 1);
                    }
                    if (rEB2.sz() < 30) continue;
                    hashSet.add(rEB2);
                    continue;
                }
                hashSet.add(rEB2);
            }
        }
        for (Object object : hashSet) {
            this.id_class((rEB)object, true);
        }
    }

    public void id_class(int n, rEB rEB2) {
        this.id_case.put(n, rEB2);
        rEB2.id_class(rXQ.HEAD, rrEr_1.id_new());
        rEB2.id_class(rXQ.HEAD, 2.0f);
    }

    public boolean id_class(int n2, rEB rEB2, boolean bl) {
        this.id_catch.computeIfAbsent(n2, n -> Sets.newHashSet());
        Set<rEB> set = this.id_catch.get(n2);
        rEB rEB3 = null;
        for (rEB rEB4 : set) {
            if (!rEB4.ro().equals(rEB2.ro())) continue;
            rEB3 = rEB4;
            break;
        }
        if (rEB3 != null) {
            set.remove(rEB3);
            set.add(rEB2);
        }
        set.add(rEB2);
        if (bl) {
            this.id_final += rEB2.Ss();
        }
        this.id_final();
        this.id_abstract();
        return true;
    }

    public boolean id_class() {
        return this.id_throws() || this.id_case();
    }

    private int id_class(rrES rrES2, int n, boolean bl) {
        return bl ? rrES2.waveCounts[this.id_synchronized] : rrES2.waveCounts[n];
    }

    public void id_class(rEB rEB2, boolean bl) {
        boolean bl2;
        Set<rEB> set = this.id_catch.get(rEB2.sk());
        if (set != null && (bl2 = set.remove(rEB2))) {
            if (bl) {
                this.id_final -= rEB2.Ss();
            }
            rEB2.id_class((rrEr_1)null);
            this.id_final();
            this.id_abstract();
        }
    }

    private void id_class(rfH_2 rfH_22) {
        float f = 13.0f;
        int n = 64;
        Collection<rhN_2> collection = this.id_continue.id_int();
        for (rhN_2 rhN_22 : this.id_extends.id_continue()) {
            rjU_2 rjU_22 = rhN_22.Ps();
            rjU_2 rjU_23 = rjU_2.id_class(rfH_22);
            float f2 = rfU_2.id_class((rjU_23.id_break - rjU_22.id_break) * (rjU_23.id_break - rjU_22.id_break) + (rjU_23.id_protected - rjU_22.id_protected) * (rjU_23.id_protected - rjU_22.id_protected));
            double d = rjU_22.id_break + (double)(13.0f / f2) * (rjU_23.id_break - rjU_22.id_break);
            double d2 = rjU_22.id_protected + (double)(13.0f / f2) * (rjU_23.id_protected - rjU_22.id_protected);
            if (!(f2 <= 64.0f) && !collection.contains(rhN_22)) continue;
            rhN_22.id_class.id_class(new rvt_3(rqn_3.XO, rqL_2.NEUTRAL, d, rhN_22.re(), d2, 64.0f, 1.0f));
        }
    }

    public rEB id_class(int n) {
        return this.id_case.get(n);
    }

    private rfH_2 id_class(int n, int n2) {
        int n3 = n == 0 ? 2 : 2 - n;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < n2; ++i) {
            float f = this.id_extends.id_int.nextFloat() * ((float)Math.PI * 2);
            int n4 = this.id_finally.b_() + rfU_2.id_protected(rfU_2.id_break(f) * 32.0f * (float)n3) + this.id_extends.id_int.nextInt(5);
            int n5 = this.id_finally.d_() + rfU_2.id_protected(rfU_2.id_class(f) * 32.0f * (float)n3) + this.id_extends.id_int.nextInt(5);
            int n6 = this.id_extends.id_class(rKv_1.WORLD_SURFACE, n4, n5);
            rfw_32.id_class(n4, n6, n5);
            if (this.id_extends.id_throw(rfw_32) && n < 2 || !this.id_extends.id_class(rfw_32.b_() - 10, rfw_32.c_() - 10, rfw_32.d_() - 10, rfw_32.b_() + 10, rfw_32.c_() + 10, rfw_32.d_() + 10) || !this.id_extends.id_else().id_class(new rfj_3(rfw_32)) || !rrEj_1.id_class(aw_3.ON_GROUND, this.id_extends, (rfH_2)rfw_32, aI_2.u) && (!this.id_extends.id_byte(rfw_32.id_break()).id_class(xu_3.Pq) || !this.id_extends.id_byte(rfw_32).id_catch())) continue;
            return rfw_32;
        }
        return null;
    }

    public int id_class(rRO rRO2) {
        switch (rRO2) {
            case EASY: {
                return 3;
            }
            case NORMAL: {
                return 5;
            }
            case HARD: {
                return 7;
            }
        }
        return 0;
    }

    public void id_class(an_3 an_32) {
        this.id_private.add(an_32.ro());
    }

    public void id_class(int n, rEB rEB2, rfH_2 rfH_22, boolean bl) {
        boolean bl2 = this.id_break(n, rEB2);
        if (bl2) {
            rEB2.id_class(this);
            rEB2.id_class(n);
            rEB2.id_this(true);
            rEB2.id_break(0);
            if (!bl && rfH_22 != null) {
                rEB2.id_new((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 1.0, (double)rfH_22.d_() + 0.5);
                rEB2.id_class(this.id_extends, this.id_extends.id_throws(rfH_22), iO_2.EVENT, (aU_2)null, (rcd_3)null);
                rEB2.id_class(n, false);
                rEB2.id_int(true);
                this.id_extends.id_class((an_3)rEB2);
            }
        }
    }

    private int id_class(rrES rrES2, Random random, int n, rRh_1 rRh_12, boolean bl) {
        int n2;
        rRO rRO2 = rRh_12.id_class();
        boolean bl2 = rRO2 == rRO.EASY;
        boolean bl3 = rRO2 == rRO.NORMAL;
        switch (rrES2) {
            case WITCH: {
                if (bl2 || n <= 2 || n == 4) {
                    return 0;
                }
                n2 = 1;
                break;
            }
            case PILLAGER: 
            case VINDICATOR: {
                if (bl2) {
                    n2 = random.nextInt(2);
                    break;
                }
                if (bl3) {
                    n2 = 1;
                    break;
                }
                n2 = 2;
                break;
            }
            case RAVAGER: {
                n2 = !bl2 && bl ? 1 : 0;
                break;
            }
            default: {
                return 0;
            }
        }
        return n2 > 0 ? random.nextInt(n2 + 1) : 0;
    }

    public rcd_3 id_class(rcd_3 rcd_32) {
        rcd_32.id_break("Id", this.id_volatile);
        rcd_32.id_class("Started", this.id_native);
        rcd_32.id_class("Active", this.id_int);
        rcd_32.id_class("TicksActive", this.id_implements);
        rcd_32.id_break("BadOmenLevel", this.id_package);
        rcd_32.id_break("GroupsSpawned", this.id_new);
        rcd_32.id_break("PreRaidTicks", this.id_this);
        rcd_32.id_break("PostRaidTicks", this.id_super);
        rcd_32.id_class("TotalHealth", this.id_final);
        rcd_32.id_break("NumGroups", this.id_synchronized);
        rcd_32.id_class("Status", this.id_return.id_class());
        rcd_32.id_break("CX", this.id_finally.b_());
        rcd_32.id_break("CY", this.id_finally.c_());
        rcd_32.id_break("CZ", this.id_finally.d_());
        rcy_3 rcy_32 = new rcy_3();
        for (UUID uUID : this.id_private) {
            rcy_32.add(rco_3.id_class(uUID));
        }
        rcd_32.id_class("HeroesOfTheVillage", rcy_32);
        return rcd_32;
    }

    public void id_class(rhd_3 rhd_32) {
        if (rhd_32.id_break(rLD.id_char)) {
            this.id_package += rhd_32.id_byte(rLD.id_char).id_byte() + 1;
            this.id_package = rfU_2.id_class(this.id_package, 0, this.id_finally());
        }
        rhd_32.id_protected(rLD.id_char);
    }

    public boolean id_break() {
        return this.id_byte() && this.id_int() == 0 && this.id_this > 0;
    }

    public void id_break(int n) {
        this.id_case.remove(n);
    }

    private boolean id_break(int n, rEB rEB2) {
        return this.id_class(n, rEB2, true);
    }

    private void id_break(rfH_2 rfH_22) {
        boolean bl = false;
        int n = this.id_new + 1;
        this.id_final = 0.0f;
        rRh_1 rRh_12 = this.id_extends.id_throws(rfH_22);
        boolean bl2 = this.id_throw();
        for (rrES rrES2 : rrES.VALUES) {
            int n2 = this.id_class(rrES2, n, bl2) + this.id_class(rrES2, this.id_else, n, rRh_12, bl2);
            int n3 = 0;
            for (int i = 0; i < n2; ++i) {
                rEB rEB2 = rrES2.type.id_class(this.id_extends);
                if (!bl && rEB2.su()) {
                    rEB2.id_synchronized(true);
                    this.id_class(n, rEB2);
                    bl = true;
                }
                this.id_class(n, rEB2, rfH_22, false);
                if (rrES2.type != aI_2.u) continue;
                rEB rEB3 = null;
                if (n == this.id_class(rRO.NORMAL)) {
                    rEB3 = aI_2.W.id_class(this.id_extends);
                } else if (n >= this.id_class(rRO.HARD)) {
                    rEB3 = n3 == 0 ? (rEB)aI_2.id_return.id_class(this.id_extends) : (rEB)aI_2.U.id_class(this.id_extends);
                }
                ++n3;
                if (rEB3 == null) continue;
                this.id_class(n, rEB3, rfH_22, false);
                rEB3.id_class(rfH_22, 0.0f, 0.0f);
                rEB3.id_this(rEB2);
            }
        }
        this.id_goto = Optional.empty();
        ++this.id_new;
        this.id_final();
        this.id_abstract();
    }

    public boolean id_throws() {
        return this.id_return == rrEB.VICTORY;
    }

    public int id_finally() {
        return 5;
    }

    public rYB id_catch() {
        return this.id_extends;
    }

    public int id_extends() {
        return this.id_package;
    }

    private boolean id_goto() {
        if (this.id_try()) {
            return !this.id_instanceof();
        }
        return !this.id_while();
    }

    public boolean id_case() {
        return this.id_return == rrEB.LOSS;
    }

    public rfH_2 id_continue() {
        return this.id_finally;
    }

    public float id_else() {
        int n = this.id_extends();
        if (n == 2) {
            return 0.1f;
        }
        if (n == 3) {
            return 0.25f;
        }
        if (n == 4) {
            return 0.5f;
        }
        return n == 5 ? 0.75f : 0.0f;
    }

    public int id_implements() {
        return this.id_new;
    }

    private boolean id_instanceof() {
        return this.id_implements() > this.id_synchronized;
    }

    public static rdn_3 id_new() {
        rdn_3 rdn_32 = new rdn_3(rdy_3.dY);
        rcd_3 rcd_32 = rdn_32.id_class("BlockEntityTag");
        rcy_3 rcy_32 = new rHG().id_class(rHE.RHOMBUS_MIDDLE, rxL_2.CYAN).id_class(rHE.STRIPE_BOTTOM, rxL_2.LIGHT_GRAY).id_class(rHE.STRIPE_CENTER, rxL_2.GRAY).id_class(rHE.BORDER, rxL_2.LIGHT_GRAY).id_class(rHE.STRIPE_MIDDLE, rxL_2.BLACK).id_class(rHE.HALF_HORIZONTAL, rxL_2.LIGHT_GRAY).id_class(rHE.CIRCLE_MIDDLE, rxL_2.LIGHT_GRAY).id_class(rHE.BORDER, rxL_2.BLACK).id_class();
        rcd_32.id_class("Patterns", rcy_32);
        rdn_32.id_class(rdC_2.ADDITIONAL);
        rdn_32.id_class(new rgn_3("block.minecraft.ominous_banner").id_class(rgF_2.GOLD));
        return rdn_32;
    }

    public float id_package() {
        float f = 0.0f;
        for (Set<rEB> set : this.id_catch.values()) {
            for (rEB rEB2 : set) {
                f += rEB2.Ss();
            }
        }
        return f;
    }

    private void id_return() {
        HashSet hashSet = Sets.newHashSet(this.id_continue.id_int());
        List<rhN_2> list = this.id_extends.id_class(this.id_synchronized());
        for (rhN_2 rhN_22 : list) {
            if (hashSet.contains(rhN_22)) continue;
            this.id_continue.id_class(rhN_22);
        }
        for (rhN_2 rhN_22 : hashSet) {
            if (list.contains(rhN_22)) continue;
            this.id_continue.id_break(rhN_22);
        }
    }

    public int id_super() {
        return this.id_volatile;
    }

    private boolean id_throw() {
        return this.id_while() && this.id_int() == 0 && this.id_try();
    }

    private boolean id_try() {
        return this.id_package > 1;
    }

    private boolean id_while() {
        return this.id_implements() == this.id_synchronized;
    }

    private void id_public() {
        Stream<rjh_3> stream = rjh_3.id_class(rjh_3.id_class(this.id_finally), 2);
        stream.filter(this.id_extends::id_class).map(rjh_3::id_int).min(Comparator.comparingDouble(rfH_22 -> rfH_22.id_private(this.id_finally))).ifPresent(this::id_byte);
    }

    public boolean id_protected() {
        return this.id_return == rrEB.STOPPED;
    }

    public boolean id_private() {
        return this.id_native;
    }

    private void id_abstract() {
        this.id_extends.k().id_byte();
    }

    public void id_final() {
        this.id_continue.id_class(rfU_2.id_class(this.id_package() / this.id_final, 0.0f, 1.0f));
    }

    public void id_volatile() {
        if (!this.id_protected()) {
            if (this.id_return == rrEB.ONGOING) {
                int n;
                boolean bl;
                boolean bl2 = this.id_int;
                this.id_int = this.id_extends.id_int(this.id_finally);
                if (this.id_extends.id_abstract() == rRO.PEACEFUL) {
                    this.id_native();
                    return;
                }
                if (bl2 != this.id_int) {
                    this.id_continue.id_protected(this.id_int);
                }
                if (!this.id_int) {
                    return;
                }
                if (!this.id_extends.id_throw(this.id_finally)) {
                    this.id_public();
                }
                if (!this.id_extends.id_throw(this.id_finally)) {
                    if (this.id_new > 0) {
                        this.id_return = rrEB.LOSS;
                    } else {
                        this.id_native();
                    }
                }
                ++this.id_implements;
                if (this.id_implements >= 48000L) {
                    this.id_native();
                    return;
                }
                int n2 = this.id_int();
                if (n2 == 0 && this.id_goto()) {
                    if (this.id_this <= 0) {
                        if (this.id_this == 0 && this.id_new > 0) {
                            this.id_this = 300;
                            this.id_continue.id_class(id_class);
                            return;
                        }
                    } else {
                        bl = this.id_goto.isPresent();
                        int n3 = n = !bl && this.id_this % 5 == 0 ? 1 : 0;
                        if (bl && !this.id_extends.id_else().id_class(new rfj_3(this.id_goto.get()))) {
                            n = 1;
                        }
                        if (n != 0) {
                            int n4 = 0;
                            if (this.id_this < 100) {
                                n4 = 1;
                            } else if (this.id_this < 40) {
                                n4 = 2;
                            }
                            this.id_goto = this.id_byte(n4);
                        }
                        if (this.id_this == 300 || this.id_this % 20 == 0) {
                            this.id_return();
                        }
                        --this.id_this;
                        this.id_continue.id_class(rfU_2.id_class((float)(300 - this.id_this) / 300.0f, 0.0f, 1.0f));
                    }
                }
                if (this.id_implements % 20L == 0L) {
                    this.id_return();
                    this.id_interface();
                    if (n2 > 0) {
                        if (n2 <= 2) {
                            this.id_continue.id_class(id_class.id_case().id_break(" - ").id_class(new rgn_3("event.minecraft.raid.raiders_remaining", n2)));
                        } else {
                            this.id_continue.id_class(id_class);
                        }
                    } else {
                        this.id_continue.id_class(id_class);
                    }
                }
                bl = false;
                n = 0;
                while (this.id_char()) {
                    rfH_2 rfH_22;
                    rfH_2 rfH_23 = rfH_22 = this.id_goto.isPresent() ? this.id_goto.get() : this.id_class(n, 20);
                    if (rfH_22 != null) {
                        this.id_native = true;
                        this.id_break(rfH_22);
                        if (!bl) {
                            this.id_class(rfH_22);
                            bl = true;
                        }
                    } else {
                        ++n;
                    }
                    if (n <= 3) continue;
                    this.id_native();
                    break;
                }
                if (this.id_private() && !this.id_goto() && n2 == 0) {
                    if (this.id_super < 40) {
                        ++this.id_super;
                    } else {
                        this.id_return = rrEB.VICTORY;
                        for (UUID uUID : this.id_private) {
                            an_3 an_32 = this.id_extends.id_break(uUID);
                            if (!(an_32 instanceof iB_2) || an_32.id_native()) continue;
                            iB_2 iB_22 = (iB_2)an_32;
                            iB_22.id_break(new rLY(rLD.id_abstract, 48000, this.id_package - 1, false, false, true));
                            if (!(iB_22 instanceof rhN_2)) continue;
                            rhN_2 rhN_22 = (rhN_2)iB_22;
                            rhN_22.id_break(rlB_2.y);
                            Oo_1.id_float.id_class(rhN_22);
                        }
                    }
                }
                this.id_abstract();
            } else if (this.id_class()) {
                ++this.id_public;
                if (this.id_public >= 600) {
                    this.id_native();
                    return;
                }
                if (this.id_public % 20 == 0) {
                    this.id_return();
                    this.id_continue.id_protected(true);
                    if (this.id_throws()) {
                        this.id_continue.id_class(0.0f);
                        this.id_continue.id_class(id_protected);
                    } else {
                        this.id_continue.id_class(id_throws);
                    }
                }
            }
        }
    }

    private Predicate<rhN_2> id_synchronized() {
        return rhN_22 -> {
            rfH_2 rfH_22 = rhN_22.Bs();
            return rhN_22.BM() && this.id_extends.id_interface(rfH_22) == this;
        };
    }

    public void id_native() {
        this.id_int = false;
        this.id_continue.id_byte();
        this.id_return = rrEB.STOPPED;
    }
}

