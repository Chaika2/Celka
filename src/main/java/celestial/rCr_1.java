/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.hs_3;
import celestial.rCB;
import celestial.rCJ;
import celestial.rCP;
import celestial.rCa_1;
import celestial.rCk_1;
import celestial.rFE;
import celestial.rFG;
import celestial.rFN;
import celestial.rFP;
import celestial.rFc_1;
import celestial.rFf_1;
import celestial.rFj_1;
import celestial.rFl_1;
import celestial.rFp_1;
import celestial.rFq_1;
import celestial.rFw_1;
import celestial.rJT;
import celestial.rLY;
import celestial.rRJ;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rVU;
import celestial.rVv_1;
import celestial.rYA;
import celestial.rYB;
import celestial.rZK;
import celestial.rZY;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rlB_2;
import celestial.rls_3;
import celestial.rmy_3;
import celestial.rnB_2;
import celestial.rnD_2;
import celestial.rnG_2;
import celestial.rnK_2;
import celestial.rnM_2;
import celestial.rnP_2;
import celestial.rnU_2;
import celestial.rnW_2;
import celestial.rna_3;
import celestial.rne_3;
import celestial.rni_3;
import celestial.rno_3;
import celestial.roE_2;
import celestial.rqL_2;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rrGr_1;
import celestial.rrGs_1;
import celestial.rrGx_1;
import celestial.ruS_2;
import celestial.rud_3;
import celestial.ruu_3;
import celestial.rvE_2;
import celestial.rvQ_2;
import celestial.rvT_2;
import celestial.rvY_2;
import celestial.rvZ_2;
import celestial.rvf_3;
import celestial.rvg_3;
import celestial.rvm_3;
import celestial.rvt_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rCr_1 {
    public static final File id_class = new File("banned-players.json");
    public static final File id_break = new File("banned-ips.json");
    public static final File id_byte = new File("ops.json");
    public static final File id_protected = new File("whitelist.json");
    private static final Logger id_case = LogManager.getLogger();
    private static final SimpleDateFormat id_catch = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    private final rnW_2 id_private;
    private final List<rhN_2> id_implements = Lists.newArrayList();
    private final Map<UUID, rhN_2> id_finally = Maps.newHashMap();
    private final rno_3 id_extends = new rno_3(id_class);
    private final rnU_2 id_native = new rnU_2(id_break);
    private final rna_3 id_volatile = new rna_3(id_byte);
    private final rCk_1 id_final = new rCk_1(id_protected);
    private final Map<UUID, rCa_1> id_package = Maps.newHashMap();
    private final Map<UUID, hs_3> id_int = Maps.newHashMap();
    private final rrGx_1 id_new;
    private boolean id_continue;
    private final rVv_1 id_super;
    protected final int id_throws;
    private int id_this;
    private rRl_1 id_else;
    private boolean id_synchronized;
    private int id_return;

    public boolean id_byte(GameProfile gameProfile) {
        return !this.id_continue || this.id_volatile.id_protected(gameProfile) || this.id_final.id_protected(gameProfile);
    }

    public rnW_2 id_byte() {
        return this.id_private;
    }

    public void id_byte(rhN_2 rhN_22) {
        Object object;
        rrEm_1 rrEm_12 = rhN_22.id_continue();
        rhN_22.id_break(rlB_2.id_finally);
        this.id_class(rhN_22);
        if (rhN_22.Pm() && ((an_3)(object = rhN_22.PO())).Pq()) {
            id_case.debug("Removing player mount");
            rhN_22.BH();
            rrEm_12.id_extends((an_3)object);
            Boolean bl = true;
            ((an_3)object).id_throws[27] = bl;
            for (an_3 an_32 : ((an_3)object).PP()) {
                rrEm_12.id_extends(an_32);
                Boolean bl2 = true;
                an_32.id_throws[27] = bl2;
            }
            rrEm_12.id_throws((Integer)rhN_22.id_throws[51], (Integer)rhN_22.id_throws[53]).id_case();
        }
        rhN_22.K();
        rrEm_12.id_throws(rhN_22);
        rhN_22.r().id_class();
        this.id_implements.remove(rhN_22);
        this.id_private.U().id_break(rhN_22);
        object = rhN_22.ro();
        rhN_2 rhN_23 = this.id_finally.get(object);
        if (rhN_23 == rhN_22) {
            this.id_finally.remove(object);
            this.id_package.remove(object);
            this.id_int.remove(object);
        }
        this.id_class(new rvg_3(rvY_2.REMOVE_PLAYER, rhN_22));
    }

    public boolean id_int() {
        return this.id_continue;
    }

    public rCr_1(rnW_2 rnW_22, rVv_1 rVv_12, rrGx_1 rrGx_12, int n) {
        this.id_private = rnW_22;
        this.id_super = rVv_12;
        this.id_throws = n;
        this.id_new = rrGx_12;
    }

    public void id_this() {
        for (hs_3 object : this.id_int.values()) {
            object.id_class(this.id_private.t());
        }
        this.id_class(new rFN(this.id_private.g()));
        rFl_1 rFl_12 = new rFl_1(this.id_private.V().id_break());
        for (rhN_2 rhN_22 : this.id_implements) {
            rhN_22.id_class.id_class(rFl_12);
            rhN_22.id_float().id_class(rhN_22);
        }
    }

    public void id_class(rhN_2 rhN_22, rrEm_1 rrEm_12) {
        roE_2 roE_22 = this.id_private.id_abstract().id_instanceof();
        rhN_22.id_class.id_class(new rFw_1(roE_22, rFf_1.INITIALIZE));
        rhN_22.id_class.id_class(new rFp_1(rrEm_12.r(), rrEm_12.P(), rrEm_12.B().id_break(rRu_1.id_finally)));
        rhN_22.id_class.id_class(new rFj_1(rrEm_12.X(), rrEm_12.J()));
        if (rrEm_12.s()) {
            rhN_22.id_class.id_class(new rZY(rZY.id_break, 0.0f));
            rhN_22.id_class.id_class(new rZY(rZY.id_private, rrEm_12.id_private(1.0f)));
            rhN_22.id_class.id_class(new rZY(rZY.id_implements, rrEm_12.id_case(1.0f)));
        }
    }

    protected void id_class(rnG_2 rnG_22, rhN_2 rhN_22) {
        HashSet hashSet = Sets.newHashSet();
        for (rnB_2 object : rnG_22.id_throws()) {
            rhN_22.id_class.id_class(new rFc_1(object, 0));
        }
        for (int i = 0; i < 19; ++i) {
            rnP_2 rnP_22 = rnG_22.id_class(i);
            if (rnP_22 == null || hashSet.contains(rnP_22)) continue;
            for (ruS_2<?> ruS_22 : rnG_22.id_catch(rnP_22)) {
                rhN_22.id_class.id_class(ruS_22);
            }
            hashSet.add(rnP_22);
        }
    }

    public void id_class(boolean bl) {
        this.id_continue = bl;
    }

    public void id_class(rud_3 rud_32, rhN_2 rhN_22) {
        Object object;
        rrEm_1 rrEm_12;
        GameProfile gameProfile = rhN_22.sv();
        rCB rCB2 = this.id_private.F();
        GameProfile gameProfile2 = rCB2.id_class(gameProfile.getId());
        String string = gameProfile2 == null ? gameProfile.getName() : gameProfile2.getName();
        rCB2.id_class(gameProfile);
        rcd_3 rcd_32 = this.id_break(rhN_22);
        rqM_2<rYB> rqM_22 = rcd_32 != null ? rRJ.id_class(new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_32.id_byte("Dimension"))).resultOrPartial(arg_0 -> ((Logger)id_case).error(arg_0)).orElse(rYB.id_byte) : rYB.id_byte;
        rrEm_1 rrEm_13 = this.id_private.id_class(rqM_22);
        if (rrEm_13 == null) {
            id_case.warn("Unknown respawn dimension {}, defaulting to overworld", rqM_22);
            rrEm_12 = this.id_private.id_abstract();
        } else {
            rrEm_12 = rrEm_13;
        }
        rhN_22.id_class((rYB)rrEm_12);
        rhN_22.id_finally.id_class((rrEm_1)((rYB)rhN_22.id_throws[7]));
        String string2 = "local";
        if (rud_32.id_byte() != null) {
            string2 = rud_32.id_byte().toString();
        }
        id_case.info("{}[{}] logged in with entity id {} at ({}, {}, {})", (Object)rhN_22.g().getString(), (Object)string2, (Object)rhN_22.V(), (Object)rhN_22.rx(), (Object)rhN_22.re(), (Object)rhN_22.BO());
        rrGs_1 rrGs_12 = rrEm_12.id_public();
        this.id_class(rhN_22, (rhN_2)null, rrEm_12);
        rmy_3 rmy_32 = new rmy_3(this.id_private, rud_32, rhN_22);
        rRu_1 rRu_12 = rrEm_12.B();
        boolean bl = rRu_12.id_break(rRu_1.id_while);
        boolean bl2 = rRu_12.id_break(rRu_1.id_package);
        rmy_32.id_class(new rvZ_2(rhN_22.V(), rhN_22.id_finally.id_break(), rhN_22.id_finally.id_byte(), rYA.id_class(rrEm_12.id_break()), rrGs_12.id_implements(), this.id_private.id_long(), this.id_super, rrEm_12.id_default(), rrEm_12.E(), this.id_package(), this.id_this, bl2, !bl, rrEm_12.b(), rrEm_12.z()));
        rmy_32.id_class(new rvE_2(rvE_2.id_class, new ruu_3(Unpooled.buffer()).id_class(this.id_byte().id_void())));
        rmy_32.id_class(new rFE(rrGs_12.id_extends(), rrGs_12.id_native()));
        rmy_32.id_class(new rvf_3((rhx_3)rhN_22.id_implements[18]));
        rmy_32.id_class(new rvm_3(((rhz_3)rhN_22.id_implements[1]).id_protected));
        rmy_32.id_class(new rFl_1(this.id_private.V().id_break()));
        rmy_32.id_class(new rFN(this.id_private.g()));
        this.id_protected(rhN_22);
        rhN_22.id_long().id_byte();
        rhN_22.id_float().id_class(rhN_22);
        this.id_class(rrEm_12.id_native(), rhN_22);
        this.id_private.A();
        rgn_3 rgn_32 = rhN_22.sv().getName().equalsIgnoreCase(string) ? new rgn_3("multiplayer.player.joined", rhN_22.L_()) : new rgn_3("multiplayer.player.joined.renamed", rhN_22.L_(), string);
        this.id_class(rgn_32.id_class(rgF_2.YELLOW), rVU.SYSTEM, rqR_2.id_break);
        rmy_32.id_class(rhN_22.rx(), rhN_22.re(), rhN_22.BO(), ((Float)rhN_22.id_throws[15]).floatValue(), ((Float)rhN_22.id_throws[16]).floatValue());
        this.id_implements.add(rhN_22);
        this.id_finally.put(rhN_22.ro(), rhN_22);
        this.id_class(new rvg_3(rvY_2.ADD_PLAYER, rhN_22));
        for (int i = 0; i < this.id_implements.size(); ++i) {
            rhN_22.id_class.id_class(new rvg_3(rvY_2.ADD_PLAYER, this.id_implements.get(i)));
        }
        rrEm_12.id_byte(rhN_22);
        this.id_private.U().id_class(rhN_22);
        this.id_class(rhN_22, rrEm_12);
        if (!this.id_private.id_for().isEmpty()) {
            rhN_22.id_class(this.id_private.id_for(), this.id_private.id_double());
        }
        Object object2 = rhN_22.So().iterator();
        while (object2.hasNext()) {
            object = object2.next();
            rmy_32.id_class(new rvT_2(rhN_22.V(), (rLY)object));
        }
        if (rcd_32 != null && rcd_32.id_byte("RootVehicle", 10) && (object = aI_2.id_class(((rcd_3)(object2 = rcd_32.id_int("RootVehicle"))).id_int("Entity"), rrEm_12, an_32 -> !rrEm_12.id_case((an_3)an_32) ? null : an_32)) != null) {
            UUID uUID = ((rcd_3)object2).id_break("Attach") ? ((rcd_3)object2).id_class("Attach") : null;
            if (((an_3)object).ro().equals(uUID)) {
                rhN_22.id_class((an_3)object, true);
            } else {
                for (an_3 an_33 : ((an_3)object).PP()) {
                    if (!an_33.ro().equals(uUID)) continue;
                    rhN_22.id_class(an_33, true);
                    break;
                }
            }
            if (!rhN_22.Pm()) {
                id_case.warn("Couldn't reattach entity to player");
                rrEm_12.id_extends((an_3)object);
                for (an_3 an_33 : ((an_3)object).PP()) {
                    rrEm_12.id_extends(an_33);
                }
            }
        }
        rhN_22.id_throws();
    }

    public rhN_2 id_class(String string) {
        for (rhN_2 rhN_22 : this.id_implements) {
            if (!rhN_22.sv().getName().equalsIgnoreCase(string)) continue;
            return rhN_22;
        }
        return null;
    }

    public void id_class(rhd_3 rhd_32, double d, double d2, double d3, double d4, rqM_2<rYB> rqM_22, ruS_2<?> ruS_22) {
        for (int i = 0; i < this.id_implements.size(); ++i) {
            double d5;
            double d6;
            double d7;
            rhN_2 rhN_22 = this.id_implements.get(i);
            if (rhN_22 == rhd_32 || ((rYB)rhN_22.id_throws[7]).E() != rqM_22 || !((d7 = d - rhN_22.rx()) * d7 + (d6 = d2 - rhN_22.re()) * d6 + (d5 = d3 - rhN_22.BO()) * d5 < d4 * d4)) continue;
            rhN_22.id_class.id_class(ruS_22);
        }
    }

    public void id_class(rrEm_1 rrEm_12) {
        rrEm_12.id_instanceof().id_class(new rCP(this));
    }

    public void id_class() {
    }

    public rCa_1 id_class(rhd_3 rhd_32) {
        rCa_1 rCa_12;
        UUID uUID = rhd_32.ro();
        rCa_1 rCa_13 = rCa_12 = uUID == null ? null : this.id_package.get(uUID);
        if (rCa_12 == null) {
            File file;
            File file2 = this.id_private.id_class(rrGr_1.id_break).toFile();
            File file3 = new File(file2, uUID + ".json");
            if (!file3.exists() && (file = new File(file2, rhd_32.g().getString() + ".json")).exists() && file.isFile()) {
                file.renameTo(file3);
            }
            rCa_12 = new rCa_1(this.id_private, file3);
            this.id_package.put(uUID, rCa_12);
        }
        return rCa_12;
    }

    public void id_class(int n) {
        this.id_this = n;
        this.id_class(new rFq_1(n));
        for (rrEm_1 rrEm_12 : this.id_private.id_float()) {
            if (rrEm_12 == null) continue;
            rrEm_12.id_else().id_class(n);
        }
    }

    public rhN_2 id_class(UUID uUID) {
        return this.id_finally.get(uUID);
    }

    public void id_class(rgP_2 rgP_22, rVU rVU2, UUID uUID) {
        this.id_private.id_class(rgP_22, uUID);
        this.id_class(new rZK(rgP_22, rVU2, uUID));
    }

    private void id_class(rhN_2 rhN_22, rhN_2 rhN_23, rrEm_1 rrEm_12) {
        if (rhN_23 != null) {
            rhN_22.id_finally.id_class(rhN_23.id_finally.id_break(), rhN_23.id_finally.id_byte());
        } else if (this.id_else != null) {
            rhN_22.id_finally.id_class(this.id_else, rRl_1.NOT_SET);
        }
        rhN_22.id_finally.id_break(rrEm_12.id_const().rB().id_new());
    }

    public void id_class(rRl_1 rRl_12) {
        this.id_else = rRl_12;
    }

    public rgP_2 id_class(SocketAddress socketAddress, GameProfile gameProfile) {
        if (this.id_extends.id_class(gameProfile)) {
            rCJ rCJ2 = (rCJ)this.id_extends.id_break(gameProfile);
            rgn_3 rgn_32 = new rgn_3("multiplayer.disconnect.banned.reason", rCJ2.id_byte());
            if (rCJ2.id_break() != null) {
                rgn_32.id_class(new rgn_3("multiplayer.disconnect.banned.expiration", id_catch.format(rCJ2.id_break())));
            }
            return rgn_32;
        }
        if (!this.id_byte(gameProfile)) {
            return new rgn_3("multiplayer.disconnect.not_whitelisted");
        }
        if (this.id_native.id_class(socketAddress)) {
            rnD_2 rnD_22 = this.id_native.id_break(socketAddress);
            rgn_3 rgn_33 = new rgn_3("multiplayer.disconnect.banned_ip.reason", rnD_22.id_byte());
            if (rnD_22.id_break() != null) {
                rgn_33.id_class(new rgn_3("multiplayer.disconnect.banned_ip.expiration", id_catch.format(rnD_22.id_break())));
            }
            return rgn_33;
        }
        return this.id_implements.size() >= this.id_throws && !this.id_protected(gameProfile) ? new rgn_3("multiplayer.disconnect.server_full") : null;
    }

    public void id_class(ruS_2<?> ruS_22) {
        for (int i = 0; i < this.id_implements.size(); ++i) {
            this.id_implements.get((int)i).id_class.id_class(ruS_22);
        }
    }

    public void id_class(GameProfile gameProfile) {
        this.id_volatile.id_class(new rne_3(gameProfile, this.id_private.id_new(), this.id_volatile.id_class(gameProfile)));
        rhN_2 rhN_22 = this.id_class(gameProfile.getId());
        if (rhN_22 != null) {
            this.id_protected(rhN_22);
        }
    }

    public void id_class(ruS_2<?> ruS_22, rqM_2<rYB> rqM_22) {
        for (int i = 0; i < this.id_implements.size(); ++i) {
            rhN_2 rhN_22 = this.id_implements.get(i);
            if (((rYB)rhN_22.id_throws[7]).E() != rqM_22) continue;
            rhN_22.id_class.id_class(ruS_22);
        }
    }

    public rhN_2 id_class(rhN_2 rhN_22, boolean bl) {
        this.id_implements.remove(rhN_22);
        rhN_22.id_continue().id_throws(rhN_22);
        rfH_2 rfH_22 = rhN_22.S();
        float f = rhN_22.s();
        boolean bl2 = rhN_22.b();
        rrEm_1 rrEm_12 = this.id_private.id_class(rhN_22.E());
        Optional<Object> optional = rrEm_12 != null && rfH_22 != null ? rhd_3.id_class(rrEm_12, rfH_22, f, bl2, bl) : Optional.empty();
        rrEm_1 rrEm_13 = rrEm_12 != null && optional.isPresent() ? rrEm_12 : this.id_private.id_abstract();
        rni_3 rni_32 = this.id_private.id_transient() ? new rnK_2(rrEm_13) : new rni_3(rrEm_13);
        rhN_2 rhN_23 = new rhN_2(this.id_private, rrEm_13, rhN_22.sv(), rni_32);
        rhN_23.id_class = rhN_22.id_class;
        rhN_23.id_class(rhN_22, bl);
        rhN_23.id_implements(rhN_22.V());
        rhN_23.id_class(rhN_22.Su());
        for (String object2 : rhN_22.y()) {
            rhN_23.id_implements(object2);
        }
        this.id_class(rhN_23, rhN_22, rrEm_13);
        boolean bl3 = false;
        if (optional.isPresent()) {
            float f2;
            xc_3 xc_32 = rrEm_13.id_byte(rfH_22);
            boolean bl4 = xc_32.id_class(xu_3.Jk);
            rjU_2 rjU_22 = (rjU_2)optional.get();
            if (!xc_32.id_class(rls_3.id_short) && !bl4) {
                f2 = f;
            } else {
                rjU_2 rjU_23 = rjU_2.id_protected(rfH_22).id_protected(rjU_22).id_protected();
                f2 = (float)rfU_2.id_case(rfU_2.id_protected(rjU_23.id_protected, rjU_23.id_break) * 57.2957763671875 - 90.0);
            }
            rhN_23.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, f2, 0.0f);
            rhN_23.id_class(rrEm_13.E(), rfH_22, f, bl2, false);
            bl3 = !bl && bl4;
        } else if (rfH_22 != null) {
            rhN_23.id_class.id_class(new rZY(rZY.id_class, 0.0f));
        }
        while (!rrEm_13.id_throws((an_3)rhN_23) && rhN_23.re() < 256.0) {
            rhN_23.id_new(rhN_23.rx(), rhN_23.re() + 1.0, rhN_23.BO());
        }
        rrGs_1 rrGs_12 = ((rYB)rhN_23.id_throws[7]).id_public();
        rhN_23.id_class.id_class(new rFP(((rYB)rhN_23.id_throws[7]).id_default(), ((rYB)rhN_23.id_throws[7]).E(), rYA.id_class(rhN_23.id_continue().id_break()), rhN_23.id_finally.id_break(), rhN_23.id_finally.id_byte(), rhN_23.id_continue().b(), rhN_23.id_continue().z(), bl));
        rhN_23.id_class.id_class(rhN_23.rx(), rhN_23.re(), rhN_23.BO(), ((Float)rhN_23.id_throws[15]).floatValue(), ((Float)rhN_23.id_throws[16]).floatValue());
        rhN_23.id_class.id_class(new rFj_1(rrEm_13.X(), rrEm_13.J()));
        rhN_23.id_class.id_class(new rFE(rrGs_12.id_extends(), rrGs_12.id_native()));
        rhN_23.id_class.id_class(new rFG(((Float)rhN_23.id_implements[21]).floatValue(), (Integer)rhN_23.id_implements[20], (Integer)rhN_23.id_implements[19]));
        this.id_class(rhN_23, rrEm_13);
        this.id_protected(rhN_23);
        rrEm_13.id_protected(rhN_23);
        this.id_implements.add(rhN_23);
        this.id_finally.put(rhN_23.ro(), rhN_23);
        rhN_23.id_throws();
        rhN_23.id_public(rhN_23.Ss());
        if (bl3) {
            rhN_23.id_class.id_class(new rvt_3(rqn_3.XH, rqL_2.BLOCKS, rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), 1.0f, 1.0f));
        }
        return rhN_23;
    }

    public void id_class(rhd_3 rhd_32, rgP_2 rgP_22) {
        rnM_2 rnM_22 = rhd_32.BG();
        if (rnM_22 != null) {
            for (String string : rnM_22.id_case()) {
                rhN_2 rhN_22 = this.id_class(string);
                if (rhN_22 == null || rhN_22 == rhd_32) continue;
                rhN_22.id_class(rgP_22, rhd_32.ro());
            }
        }
    }

    private void id_class(rhN_2 rhN_22, int n) {
        if (rhN_22.id_class != null) {
            byte by = n <= 0 ? (byte)24 : (n >= 4 ? (byte)28 : (byte)((byte)(24 + n)));
            rhN_22.id_class.id_class(new rvQ_2(rhN_22, by));
        }
        this.id_private.f().id_class(rhN_22);
    }

    protected void id_class(rhN_2 rhN_22) {
        hs_3 hs_32;
        this.id_new.id_class(rhN_22);
        rCa_1 rCa_12 = this.id_package.get(rhN_22.ro());
        if (rCa_12 != null) {
            rCa_12.id_class();
        }
        if ((hs_32 = this.id_int.get(rhN_22.ro())) != null) {
            hs_32.id_break();
        }
    }

    public void id_break(boolean bl) {
        this.id_synchronized = bl;
    }

    public void id_break(rhd_3 rhd_32, rgP_2 rgP_22) {
        rnM_2 rnM_22 = rhd_32.BG();
        if (rnM_22 == null) {
            this.id_class(rgP_22, rVU.SYSTEM, rhd_32.ro());
        } else {
            for (int i = 0; i < this.id_implements.size(); ++i) {
                rhN_2 rhN_22 = this.id_implements.get(i);
                if (rhN_22.BG() == rnM_22) continue;
                rhN_22.id_class(rgP_22, rhd_32.ro());
            }
        }
    }

    public List<rhN_2> id_break(String string) {
        ArrayList arrayList = Lists.newArrayList();
        for (rhN_2 rhN_22 : this.id_implements) {
            if (!rhN_22.id_super().equals(string)) continue;
            arrayList.add(rhN_22);
        }
        return arrayList;
    }

    public rcd_3 id_break(rhN_2 rhN_22) {
        rcd_3 rcd_32;
        rcd_3 rcd_33 = this.id_private.rB().id_char();
        if (rhN_22.g().getString().equals(this.id_private.id_default()) && rcd_33 != null) {
            rcd_32 = rcd_33;
            rhN_22.id_throws(rcd_33);
            id_case.debug("loading single player");
        } else {
            rcd_32 = this.id_new.id_break(rhN_22);
        }
        return rcd_32;
    }

    public void id_break(GameProfile gameProfile) {
        this.id_volatile.id_byte(gameProfile);
        rhN_2 rhN_22 = this.id_class(gameProfile.getId());
        if (rhN_22 != null) {
            this.id_protected(rhN_22);
        }
    }

    public rhN_2 id_throws(GameProfile gameProfile) {
        Object object3;
        Object object2;
        UUID uUID = rhd_3.id_class(gameProfile);
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.id_implements.size(); ++i) {
            object2 = this.id_implements.get(i);
            if (!((an_3)object2).ro().equals(uUID)) continue;
            arrayList.add(object2);
        }
        rhN_2 rhN_22 = this.id_finally.get(gameProfile.getId());
        if (rhN_22 != null && !arrayList.contains(rhN_22)) {
            arrayList.add(rhN_22);
        }
        for (Object object3 : arrayList) {
            ((rhN_2)object3).id_class.id_class(new rgn_3("multiplayer.disconnect.duplicate_login"));
        }
        object2 = this.id_private.id_abstract();
        object3 = this.id_private.id_transient() ? new rnK_2((rrEm_1)object2) : new rni_3((rrEm_1)object2);
        return new rhN_2(this.id_private, (rrEm_1)object2, gameProfile, (rni_3)object3);
    }

    public void id_throws() {
        if (++this.id_return > 600) {
            this.id_class(new rvg_3(rvY_2.UPDATE_LATENCY, this.id_implements));
            this.id_return = 0;
        }
    }

    public void id_throws(rhN_2 rhN_22) {
        rhN_22.id_class((rJT)rhN_22.id_implements[3]);
        rhN_22.id_new();
        rhN_22.id_class.id_class(new rvm_3(((rhz_3)rhN_22.id_implements[1]).id_protected));
    }

    public rCk_1 id_finally() {
        return this.id_final;
    }

    public rno_3 id_catch() {
        return this.id_extends;
    }

    public String[] id_extends() {
        return this.id_final.id_class();
    }

    public boolean id_case(GameProfile gameProfile) {
        return this.id_volatile.id_protected(gameProfile) || this.id_private.id_break(gameProfile) && this.id_private.rB().id_continue() || this.id_synchronized;
    }

    public hs_3 id_case(rhN_2 rhN_22) {
        UUID uUID = rhN_22.ro();
        hs_3 hs_32 = this.id_int.get(uUID);
        if (hs_32 == null) {
            File file = this.id_private.id_class(rrGr_1.id_class).toFile();
            File file2 = new File(file, uUID + ".json");
            hs_32 = new hs_3(this.id_private.T(), this, this.id_private.t(), file2, rhN_22);
            this.id_int.put(uUID, hs_32);
        }
        hs_32.id_class(rhN_22);
        return hs_32;
    }

    public String[] id_case() {
        String[] stringArray = new String[this.id_implements.size()];
        for (int i = 0; i < this.id_implements.size(); ++i) {
            stringArray[i] = this.id_implements.get(i).sv().getName();
        }
        return stringArray;
    }

    public void id_continue() {
        for (int i = 0; i < this.id_implements.size(); ++i) {
            this.id_implements.get((int)i).id_class.id_class(new rgn_3("multiplayer.disconnect.server_shutdown"));
        }
    }

    public boolean id_else() {
        return this.id_synchronized;
    }

    public void id_implements() {
        for (int i = 0; i < this.id_implements.size(); ++i) {
            this.id_class(this.id_implements.get(i));
        }
    }

    public int id_new() {
        return this.id_this;
    }

    public int id_package() {
        return this.id_throws;
    }

    public List<rhN_2> id_super() {
        return this.id_implements;
    }

    public boolean id_protected(GameProfile gameProfile) {
        return false;
    }

    public rcd_3 id_protected() {
        return null;
    }

    public void id_protected(rhN_2 rhN_22) {
        GameProfile gameProfile = rhN_22.sv();
        int n = this.id_private.id_class(gameProfile);
        this.id_class(rhN_22, n);
    }

    public rnU_2 id_private() {
        return this.id_native;
    }

    public int id_final() {
        return this.id_implements.size();
    }

    public String[] id_volatile() {
        return this.id_volatile.id_class();
    }

    public rna_3 id_native() {
        return this.id_volatile;
    }
}

