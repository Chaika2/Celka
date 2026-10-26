/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.sun.javafx.geom.Vec3d
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 */
package celestial;

import celestial.C_class;
import celestial.EF;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GA;
import celestial.GF;
import celestial.GL;
import celestial.GN;
import celestial.GQ;
import celestial.GZ;
import celestial.Gc_1;
import celestial.Gm_1;
import celestial.Gu_1;
import celestial.Gv_1;
import celestial.Gz_1;
import celestial.JV;
import celestial.Ja_1;
import celestial.ME;
import celestial.MG;
import celestial.MQ;
import celestial.Mb_1;
import celestial.Mu_1;
import celestial.Mx_1;
import celestial.PJ;
import celestial.PX;
import celestial.Ph_1;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Px_1;
import celestial.WL;
import celestial.Wt_1;
import celestial.bR_2;
import celestial.bq_3;
import celestial.bw_3;
import celestial.dN_2;
import celestial.dj_3;
import celestial.rCT;
import celestial.rCZ;
import celestial.rC_2;
import celestial.rP_2;
import celestial.rQ_2;
import celestial.rR_2;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rV_2;
import celestial.rcW_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rhz_3;
import celestial.rjC_2;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rn_3;
import celestial.rp_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rq_3;
import celestial.rqj_3;
import celestial.rs_3;
import celestial.rw_3;
import celestial.rxJ_2;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.sun.javafx.geom.Vec3d;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GW
extends bq_3
implements rQ_2 {
    public Object[] id_break;
    public static Object[] id_throws;
    private static String[] id_catch;
    private static byte[] id_private;
    private static short[] id_implements;
    private static double[] id_finally;
    private static boolean[] id_extends;

    private Optional<rqj_3<rU_2, PX>> id_byte(Gm_1 gm_1) {
        rU_2 rU_22 = ((Ps_1)this.id_case[id_implements[54]]).id_volatile();
        rU_2 rU_23 = ((C_class)this.id_case[id_implements[55]]).id_while().id_super();
        for (int i = id_private[3]; i <= id_private[4]; ++i) {
            int n;
            int n2 = n = (Boolean)C_class.id_instanceof().id_for.id_class[id_implements[56]] != false ? id_private[5] : id_extends[23];
            while (n <= id_private[6]) {
                for (int j = id_private[7]; j <= id_private[8]; ++j) {
                    rU_2 rU_24;
                    Optional<Px_1> optional;
                    xc_3 xc_32;
                    xc_3 xc_33;
                    int n3 = (Integer)rU_22.id_break[id_implements[57]] + i;
                    int n4 = (Integer)rU_22.id_break[id_implements[58]] + n;
                    int n5 = (Integer)rU_22.id_break[id_implements[59]] + j;
                    if (n == id_private[9] && n3 == (Integer)rU_23.id_break[id_implements[60]] && n5 == (Integer)rU_23.id_break[id_implements[61]] || (xc_33 = gm_1.id_byte(n3, n4, n5, ((bw_3)gm_1.id_break[id_implements[62]]).id_class(n3, n4, n5))) == null || (xc_32 = ((bw_3)gm_1.id_break[id_implements[63]]).id_class(n3, n4, n5)).id_break() == xu_3.id_class || xc_32.id_break() instanceof dj_3 || this.id_class(xc_32, xc_33, id_extends[24]) || !(optional = PJ.id_class((Ps_1)this.id_case[id_implements[64]], (rfH_2)(rU_24 = new rU_2(n3, n4, n5)), ((Ps_1)this.id_case[id_implements[65]]).id_native().id_case())).isPresent()) continue;
                    return Optional.of(new rqj_3<rU_2, PX>(rU_24, optional.get().id_class()));
                }
                ++n;
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean id_byte() {
        this.id_new();
        return (rq_3)this.id_break[id_implements[44]] != null ? id_extends[21] : id_extends[22];
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6CF4BFF1;
    }

    private static void id_int() {
        boolean[] blArray = new boolean[122];
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[15] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[40] = true;
        blArray[41] = true;
        blArray[43] = true;
        blArray[45] = true;
        blArray[46] = true;
        blArray[47] = true;
        blArray[49] = true;
        blArray[50] = true;
        blArray[51] = true;
        blArray[57] = true;
        blArray[58] = true;
        blArray[59] = true;
        blArray[60] = true;
        blArray[61] = true;
        blArray[62] = true;
        blArray[63] = true;
        blArray[65] = true;
        blArray[66] = true;
        blArray[68] = true;
        blArray[69] = true;
        blArray[70] = true;
        blArray[71] = true;
        blArray[73] = true;
        blArray[84] = true;
        blArray[93] = true;
        blArray[94] = true;
        blArray[96] = true;
        blArray[97] = true;
        blArray[98] = true;
        blArray[99] = true;
        blArray[100] = true;
        blArray[101] = true;
        blArray[102] = true;
        blArray[103] = true;
        blArray[105] = true;
        blArray[107] = true;
        blArray[108] = true;
        blArray[111] = true;
        blArray[114] = true;
        blArray[121] = true;
        id_extends = blArray;
    }

    public GW(C_class c_class) {
        super(c_class);
        this.id_new();
        Integer n = id_extends[0];
        this.id_break[GW.id_implements[0]] = n;
    }

    static {
        GW.ntfClinit();
    }

    private static void id_this() {
        Object[] objectArray = new Object[1];
        rCZ[] rCZArray = new rCZ[]{Wt_1.id_final, Wt_1.id_package, Wt_1.id_int, Wt_1.id_new, dN_2.id_final, rCT.b};
        objectArray[0] = ImmutableSet.of((Object)WL.id_new, (Object)JV.id_volatile, (Object)JV.id_volatile, (Object)rCT.b, (Object)rCT.R, (Object)Wt_1.id_volatile, (Object[])rCZArray);
        id_throws = objectArray;
    }

    private rP_2 id_class(rfH_2 rfH_22, Gm_1 gm_1) {
        if (((Ps_1)this.id_case[id_implements[238]]).id_case().id_byte(rfH_22).id_break() != xu_3.id_class) {
            return new GF(rfH_22);
        }
        boolean bl = ((Ps_1)this.id_case[id_implements[239]]).id_case().id_byte(rfH_22.id_final()).id_break() != xu_3.id_class ? id_extends[84] : id_extends[85];
        xc_3 xc_32 = ((Ps_1)this.id_case[id_implements[240]]).id_case().id_byte(rfH_22);
        rpr_3[] rpr_3Array = (rpr_3[])Ev_1.id_class[id_implements[241]];
        int n = rpr_3Array.length;
        for (int i = id_extends[86]; i < n; ++i) {
            rpr_3 rpr_32 = rpr_3Array[i];
            if (!EF.id_byte((Ps_1)this.id_case[id_implements[242]], rfH_22.id_break(rpr_32)) || !this.id_class(rfH_22, gm_1.id_byte(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), xc_32))) continue;
            return new GZ(rfH_22, rfH_22.id_break(rpr_32), bl);
        }
        return new GF(rfH_22);
    }

    private OptionalInt id_class(xc_3 xc_32, rff_3 rff_32, PX pX) {
        for (int i = id_extends[34]; i < id_private[15]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((Ps_1)this.id_case[GW.id_implements[89]]).id_catch().id_implements[GW.id_implements[90]]).id_class.get(i);
            if (rdn_32.id_class() || !(rdn_32.id_break() instanceof rxJ_2)) continue;
            float f = ((Float)((Ps_1)this.id_case[GW.id_implements[91]]).id_catch().id_throws[id_implements[92]]).floatValue();
            float f2 = ((Float)((Ps_1)this.id_case[GW.id_implements[93]]).id_catch().id_throws[id_implements[94]]).floatValue();
            Float f3 = Float.valueOf(pX.id_throws());
            ((Ps_1)this.id_case[GW.id_implements[95]]).id_catch().id_throws[GW.id_implements[96]] = f3;
            Float f4 = Float.valueOf(pX.id_protected());
            ((Ps_1)this.id_case[GW.id_implements[97]]).id_catch().id_throws[GW.id_implements[98]] = f4;
            rxx_3 rxx_32 = new rxx_3(new Gz_1(this, ((Ps_1)this.id_case[id_implements[99]]).id_case(), ((Ps_1)this.id_case[id_implements[100]]).id_catch(), rpm_3.MAIN_HAND, rdn_32, rff_32));
            xc_3 xc_33 = ((rxJ_2)rdn_32.id_break()).id_catch().id_class(rxx_32);
            Float f5 = Float.valueOf(f);
            ((Ps_1)this.id_case[GW.id_implements[101]]).id_catch().id_throws[GW.id_implements[102]] = f5;
            Float f6 = Float.valueOf(f2);
            ((Ps_1)this.id_case[GW.id_implements[103]]).id_catch().id_throws[GW.id_implements[104]] = f6;
            if (!this.id_class(xc_33, xc_32, id_extends[35])) continue;
            return OptionalInt.of(i);
        }
        return OptionalInt.empty();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x84DE6E380995A6AAL;
    }

    private rP_2 id_class(Gm_1 gm_1, List<xc_3> list) {
        return this.id_class(gm_1, list, id_extends[80]);
    }

    @Override
    public boolean id_class(String string, File file, rja_3 rja_32) {
        rq_3 rq_32;
        Optional<rR_2> optional = ((MG)MG.staticFields4592673f607b3ff2b69d116fa51286d2[id_implements[35]]).id_class(file);
        if (!optional.isPresent()) {
            return id_extends[13];
        }
        try {
            rq_32 = optional.get().id_class(new FileInputStream(file));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return id_extends[14];
        }
        rq_32 = this.id_class(rja_32, (rw_3)rq_32);
        this.id_class(string, rq_32, rja_32);
        return id_extends[15];
    }

    public boolean id_class(rfH_2 rfH_22, xc_3 xc_32) {
        rjC_2 rjC_22 = xc_32.id_extends(((Ps_1)this.id_case[id_implements[75]]).id_case(), rfH_22);
        return rjC_22.id_break() || ((Ps_1)this.id_case[id_implements[76]]).id_case().id_class(null, rjC_22.id_class(rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_())) ? id_extends[29] : id_extends[30];
    }

    @Override
    public void id_class(int n) {
        this.id_new();
        if (MQ.id_class()) {
            if (MQ.id_break()) {
                String string = MQ.id_protected(n);
                try {
                    Mx_1 mx_1 = new Mx_1(rcW_2.id_class(Files.newInputStream(MQ.id_throws(n).toPath(), new OpenOption[id_extends[16]])), id_extends[17]);
                    rja_3 rja_32 = MQ.id_class(mx_1, n);
                    rq_3 rq_32 = MQ.id_break(mx_1, n);
                    rq_32 = this.id_class((rja_3)this.id_break[id_implements[42]], (rw_3)rq_32);
                    this.id_class(string, rq_32, rja_32);
                }
                catch (IOException iOException) {
                    this.id_case(id_catch[6]);
                }
            } else {
                this.id_case(id_catch[7]);
            }
        } else {
            this.id_case(id_catch[8]);
        }
    }

    private boolean id_class(xc_3 xc_32, xc_3 xc_33) {
        if (xc_32.id_break() != xc_33.id_break()) {
            return id_extends[91];
        }
        boolean bl = (Boolean)C_class.id_instanceof().id_volatile.id_class[id_implements[265]];
        List list = (List)C_class.id_instanceof().Py.id_class[id_implements[266]];
        if (!bl && list.isEmpty()) {
            return xc_32.equals(xc_33);
        }
        ImmutableMap<rCZ<?>, Comparable<?>> immutableMap = xc_32.id_goto();
        ImmutableMap<rCZ<?>, Comparable<?>> immutableMap2 = xc_33.id_goto();
        for (rCZ rCZ2 : immutableMap.keySet()) {
            if (immutableMap.get((Object)rCZ2) == immutableMap2.get((Object)rCZ2) || bl && ((Set)id_throws[id_implements[267]]).contains(rCZ2) || list.contains(rCZ2.id_throws())) continue;
            return id_extends[92];
        }
        return id_extends[93];
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        return this.id_class(bl, bl2, id_extends[44]);
    }

    private static Vec3d[] id_class(rpr_3 rpr_32) {
        switch (((int[])Gu_1.id_class[id_implements[105]])[rpr_32.ordinal()]) {
            case 1: {
                Vec3d[] vec3dArray = new Vec3d[id_private[16]];
                vec3dArray[GW.id_extends[36]] = new Vec3d(id_finally[3], id_finally[4], id_finally[5]);
                vec3dArray[GW.id_extends[37]] = new Vec3d(id_finally[6], id_finally[7], id_finally[8]);
                vec3dArray[GW.id_private[17]] = new Vec3d(id_finally[9], id_finally[10], id_finally[11]);
                vec3dArray[GW.id_private[18]] = new Vec3d(id_finally[12], id_finally[13], id_finally[14]);
                vec3dArray[GW.id_private[19]] = new Vec3d(id_finally[15], id_finally[16], id_finally[17]);
                return vec3dArray;
            }
            case 2: {
                Vec3d[] vec3dArray = new Vec3d[id_private[20]];
                vec3dArray[GW.id_extends[38]] = new Vec3d(id_finally[18], id_finally[19], id_finally[20]);
                vec3dArray[GW.id_extends[39]] = new Vec3d(id_finally[21], id_finally[22], id_finally[23]);
                vec3dArray[GW.id_private[21]] = new Vec3d(id_finally[24], id_finally[25], id_finally[26]);
                vec3dArray[GW.id_private[22]] = new Vec3d(id_finally[27], id_finally[28], id_finally[29]);
                vec3dArray[GW.id_private[23]] = new Vec3d(id_finally[30], id_finally[31], id_finally[32]);
                return vec3dArray;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                double d = rpr_32.id_implements() == 0 ? id_finally[33] : (double)(id_extends[40] + rpr_32.id_implements()) / id_finally[34];
                double d2 = rpr_32.id_extends() == 0 ? id_finally[35] : (double)(id_extends[41] + rpr_32.id_extends()) / id_finally[36];
                Vec3d[] vec3dArray = new Vec3d[id_private[24]];
                vec3dArray[GW.id_extends[42]] = new Vec3d(d, id_finally[37], d2);
                vec3dArray[GW.id_extends[43]] = new Vec3d(d, id_finally[38], d2);
                return vec3dArray;
            }
        }
        throw new IllegalStateException();
    }

    public static /* synthetic */ C_class id_class(GW gW) {
        return (C_class)gW.id_case[id_implements[289]];
    }

    @Override
    public void id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        rfH_2 rfH_24 = new rfH_2(Math.min(rfH_22.b_(), rfH_23.b_()), Math.min(rfH_22.c_(), rfH_23.c_()), Math.min(rfH_22.d_(), rfH_23.d_()));
        int n = Math.abs(rfH_22.b_() - rfH_23.b_()) + id_extends[18];
        int n2 = Math.abs(rfH_22.c_() - rfH_23.c_()) + id_extends[19];
        int n3 = Math.abs(rfH_22.d_() - rfH_23.d_()) + id_extends[20];
        this.id_class(id_catch[9], new rp_3(n, n2, n3, xu_3.id_class.id_continue()), (rja_3)rfH_24);
    }

    public boolean id_class(xc_3 xc_32, xc_3 xc_33, boolean bl) {
        if (xc_32 == null || xc_33 == null) {
            return id_extends[96];
        }
        if (xc_32.id_break() instanceof dj_3 && ((Boolean)C_class.id_instanceof().Pq.id_class[id_implements[268]]).booleanValue()) {
            return id_extends[97];
        }
        if (xc_32.id_break() instanceof Ja_1 && ((List)C_class.id_instanceof().rq.id_class[id_implements[269]]).contains(xc_33.id_break())) {
            return id_extends[98];
        }
        if (xc_33.id_break() instanceof Ja_1 && ((List)C_class.id_instanceof().rO.id_class[id_implements[270]]).contains(xc_32.id_break())) {
            return id_extends[99];
        }
        if (!(xc_32.id_break() instanceof Ja_1) && ((Boolean)C_class.id_instanceof().PK.id_class[id_implements[271]]).booleanValue() && !bl) {
            return id_extends[100];
        }
        if (((List)C_class.id_instanceof().S.id_class[id_implements[272]]).contains(xc_33.id_break()) && !bl) {
            return id_extends[101];
        }
        if (((Map)C_class.id_instanceof().rg.id_class[id_implements[273]]).getOrDefault(xc_33.id_break(), Collections.emptyList()).contains(xc_32.id_break()) && !bl) {
            return id_extends[102];
        }
        if (xc_32.equals(xc_33)) {
            return id_extends[103];
        }
        return this.id_class(xc_32, xc_33);
    }

    private void id_class(Gm_1 gm_1) {
        HashSet hashSet;
        this.id_new();
        this.id_break[GW.id_implements[211]] = hashSet = new HashSet();
        for (int i = id_extends[76]; i < ((rq_3)this.id_break[id_implements[212]]).id_class(); ++i) {
            for (int j = id_extends[77]; j < ((rq_3)this.id_break[id_implements[213]]).id_byte(); ++j) {
                for (int k = id_extends[78]; k < ((rq_3)this.id_break[id_implements[214]]).id_break(); ++k) {
                    int n;
                    int n2;
                    int n3 = k + ((rja_3)this.id_break[id_implements[215]]).b_();
                    xc_3 xc_32 = ((bw_3)gm_1.id_break[id_implements[218]]).id_class(n3, n2 = i + ((rja_3)this.id_break[id_implements[216]]).c_(), n = j + ((rja_3)this.id_break[id_implements[217]]).d_());
                    if (!((rq_3)this.id_break[id_implements[219]]).id_class(k, i, j, xc_32)) continue;
                    if (((bw_3)gm_1.id_break[id_implements[220]]).id_class(n3, n)) {
                        if (this.id_class(((bw_3)gm_1.id_break[id_implements[221]]).id_class(n3, n2, n), ((rq_3)this.id_break[id_implements[222]]).id_class(k, i, j, xc_32, (List)this.id_break[id_implements[223]]), id_extends[79])) {
                            ((LongOpenHashSet)this.id_break[id_implements[224]]).add(rU_2.id_byte(n3, n2, n));
                            continue;
                        }
                        ((HashSet)this.id_break[id_implements[225]]).add(new rU_2(n3, n2, n));
                        ((LongOpenHashSet)this.id_break[id_implements[226]]).remove(rU_2.id_byte(n3, n2, n));
                        if (((HashSet)this.id_break[id_implements[227]]).size() <= (Integer)C_class.id_instanceof().rv.id_class[id_implements[228]]) continue;
                        return;
                    }
                    if (((LongOpenHashSet)this.id_break[id_implements[229]]).contains(rU_2.id_byte(n3, n2, n)) || ((List)C_class.id_instanceof().S.id_class[id_implements[230]]).contains(((rq_3)this.id_break[id_implements[231]]).id_class(k, i, j, xc_32, (List)this.id_break[id_implements[232]]).id_break())) continue;
                    ((HashSet)this.id_break[id_implements[233]]).add(new rU_2(n3, n2, n));
                    if (((HashSet)this.id_break[id_implements[234]]).size() <= (Integer)C_class.id_instanceof().rv.id_class[id_implements[235]]) continue;
                    return;
                }
            }
        }
    }

    private rq_3 id_class(rja_3 rja_32, rw_3 rw_32) {
        rq_3 rq_32 = rw_32;
        if (((Boolean)C_class.id_instanceof().Bs.id_class[id_implements[36]]).booleanValue()) {
            rq_32 = new ME(rw_32);
        }
        if (((Boolean)C_class.id_instanceof().Pi.id_class[id_implements[37]]).booleanValue()) {
            rq_32 = new Mb_1(rq_32, rja_32, ((C_class)this.id_case[id_implements[38]]).E().id_byte());
        }
        return rq_32;
    }

    private boolean id_class(Collection<xc_3> collection, xc_3 xc_32) {
        for (xc_3 xc_33 : collection) {
            if (!this.id_class(xc_33, xc_32)) continue;
            return id_extends[94];
        }
        return id_extends[95];
    }

    public rn_3 id_class(boolean bl, boolean bl2, int n) {
        Object object;
        Optional<rqj_3<rU_2, PX>> optional;
        int n2;
        Object object2;
        List<xc_3> list;
        this.id_new();
        if (n > id_private[25]) {
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[106]]));
        }
        this.id_break[GW.id_implements[107]] = list = this.id_break(id_private[26]);
        if (((C_class)this.id_case[id_implements[108]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[109]]))) {
            Integer n3 = id_private[27];
            this.id_break[GW.id_implements[110]] = n3;
        } else {
            GW gW = this;
            Integer n4 = (Integer)gW.id_break[id_implements[111]] - id_extends[45];
            gW.id_break[GW.id_implements[112]] = n4;
        }
        ((C_class)this.id_case[id_implements[113]]).id_int().id_class();
        if (((Boolean)this.id_break[id_implements[114]]).booleanValue()) {
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[115]]));
        }
        if (((Boolean)C_class.id_instanceof().O.id_class[id_implements[116]]).booleanValue()) {
            int n5;
            if ((rq_3)this.id_break[id_implements[117]] == null) {
                rq_3 rq_32 = (rq_3)this.id_break[id_implements[118]];
                this.id_break[GW.id_implements[119]] = rq_32;
            }
            object2 = (rq_3)this.id_break[id_implements[120]];
            if (((Boolean)C_class.id_instanceof().rl.id_class[id_implements[121]]).booleanValue()) {
                n2 = object2.id_class() - id_extends[46];
                n5 = object2.id_class() - (Integer)this.id_break[id_implements[122]] * (Integer)C_class.id_instanceof().id_new.id_class[id_implements[123]];
            } else {
                n2 = (Integer)this.id_break[id_implements[124]] * (Integer)C_class.id_instanceof().id_new.id_class[id_implements[125]] - id_extends[47];
                n5 = id_extends[48];
            }
            GQ gQ = new GQ(this, (rq_3)object2, n5, n2);
            this.id_break[GW.id_implements[126]] = gQ;
        }
        if (!this.id_protected((Gm_1)(object2 = new Gm_1(this)))) {
            if (((Boolean)C_class.id_instanceof().O.id_class[id_implements[127]]).booleanValue() && (Integer)this.id_break[id_implements[128]] * (Integer)C_class.id_instanceof().id_new.id_class[id_implements[129]] < (Integer)this.id_break[id_implements[130]]) {
                this.id_case("Starting layer " + (Integer)this.id_break[id_implements[131]]);
                GW gW = this;
                Integer n6 = (Integer)gW.id_break[id_implements[132]] + id_extends[49];
                gW.id_break[GW.id_implements[133]] = n6;
                return this.id_class(bl, bl2, n + id_extends[50]);
            }
            rja_3 rja_32 = (rja_3)C_class.id_instanceof().BB.id_class[id_implements[134]];
            n2 = (Integer)C_class.id_instanceof().id_case.id_class[id_implements[135]];
            GW gW = this;
            Integer n7 = (Integer)gW.id_break[id_implements[136]] + id_extends[51];
            gW.id_break[GW.id_implements[137]] = n7;
            if (rja_32.equals(new rja_3(id_extends[52], id_extends[53], id_extends[54])) || n2 != id_private[28] && (Integer)this.id_break[id_implements[138]] >= n2) {
                this.id_case(id_catch[10]);
                if (((Boolean)C_class.id_instanceof().PM.id_class[id_implements[139]]).booleanValue()) {
                    this.id_byte(id_catch[11], id_extends[55]);
                }
                this.id_protected();
                return null;
            }
            Integer n8 = id_extends[56];
            this.id_break[GW.id_implements[140]] = n8;
            rfH_2 rfH_22 = new rfH_2((rja_3)this.id_break[id_implements[141]]).id_break(rja_32);
            this.id_break[GW.id_implements[142]] = rfH_22;
            if (!((Boolean)C_class.id_instanceof().id_static.id_class[id_implements[143]]).booleanValue()) {
                ((rq_3)this.id_break[id_implements[144]]).id_protected();
            }
            this.id_case("Repeating build in vector " + rja_32 + ", new origin is " + (rja_3)this.id_break[id_implements[145]]);
            return this.id_class(bl, bl2, n + id_extends[57]);
        }
        if (((Boolean)C_class.id_instanceof().rH.id_class[id_implements[146]]).booleanValue()) {
            this.id_super();
        }
        if ((optional = this.id_byte((Gm_1)object2)).isPresent() && bl2 && ((Ps_1)this.id_case[id_implements[147]]).id_catch().BL()) {
            PX pX = optional.get().id_break();
            rU_2 rU_22 = optional.get().id_class();
            ((C_class)this.id_case[id_implements[148]]).id_private().id_class(pX, id_extends[58]);
            EF.id_class((Ps_1)this.id_case[id_implements[149]], ((EZ)object2).id_class(rU_22));
            if (((Ps_1)this.id_case[id_implements[150]]).id_catch().h()) {
                ((C_class)this.id_case[id_implements[151]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[152]]), id_extends[59]);
            }
            if (((Ps_1)this.id_case[id_implements[153]]).id_class(rU_22) || ((Ps_1)this.id_case[id_implements[154]]).id_protected().id_class(pX)) {
                ((C_class)this.id_case[id_implements[155]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[156]]), id_extends[60]);
            }
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[157]]));
        }
        ArrayList<xc_3> arrayList = new ArrayList<xc_3>();
        Optional<GA> optional2 = this.id_break((Gm_1)object2, arrayList);
        if (optional2.isPresent() && bl2 && ((Ps_1)this.id_case[id_implements[158]]).id_catch().BL() && (Integer)this.id_break[id_implements[159]] <= 0) {
            PX pX = (PX)optional2.get().id_class[id_implements[160]];
            ((C_class)this.id_case[id_implements[161]]).id_private().id_class(pX, id_extends[61]);
            ((rhz_3)((Ps_1)this.id_case[GW.id_implements[162]]).id_catch().id_implements[GW.id_implements[163]]).id_protected = (Integer)optional2.get().id_class[id_implements[164]];
            ((C_class)this.id_case[id_implements[165]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[166]]), id_extends[62]);
            if (((Ps_1)this.id_case[id_implements[167]]).id_class((rfH_2)optional2.get().id_class[id_implements[168]]) && ((rff_3)((Ps_1)this.id_case[id_implements[169]]).id_byte()).id_break().equals((rpr_3)optional2.get().id_class[id_implements[170]]) || ((Ps_1)this.id_case[id_implements[171]]).id_protected().id_class(pX)) {
                ((C_class)this.id_case[id_implements[172]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[173]]), id_extends[63]);
            }
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[174]]));
        }
        if (((Boolean)C_class.id_instanceof().z.id_class[id_implements[175]]).booleanValue()) {
            object = new ArrayList();
            ArrayList<xc_3> arrayList2 = new ArrayList<xc_3>();
            block0: for (xc_3 object3 : arrayList) {
                for (int xc_32 = id_extends[64]; xc_32 < id_private[29]; ++xc_32) {
                    if (!this.id_class((xc_3)((List)this.id_break[id_implements[176]]).get(xc_32), object3, id_extends[65])) continue;
                    ((ArrayList)object).add(xc_32);
                    continue block0;
                }
                arrayList2.add(object3);
            }
            block2: for (int i = id_private[30]; i < id_private[31]; ++i) {
                for (xc_3 xc_32 : arrayList2) {
                    if (!this.id_class((xc_3)((List)this.id_break[id_implements[177]]).get(i), xc_32, id_extends[66])) continue;
                    if (((C_class)this.id_case[id_implements[178]]).id_static().id_class(i, ((ArrayList)object)::contains)) break block2;
                    return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[179]]));
                }
            }
        }
        if ((object = this.id_class((Gm_1)object2, ((List)this.id_break[id_implements[180]]).subList(id_extends[67], id_private[32]))) == null && (object = this.id_class((Gm_1)object2, (List)this.id_break[id_implements[181]], id_extends[68])) == null) {
            if (((Boolean)C_class.id_instanceof().X.id_class[id_implements[182]]).booleanValue() && ((Boolean)C_class.id_instanceof().O.id_class[id_implements[183]]).booleanValue() && (Integer)this.id_break[id_implements[184]] * (Integer)C_class.id_instanceof().id_new.id_class[id_implements[185]] < ((rq_3)this.id_break[id_implements[186]]).id_class()) {
                this.id_case("Skipping layer that I cannot construct! Layer #" + (Integer)this.id_break[id_implements[187]]);
                GW gW = this;
                Integer n3 = (Integer)gW.id_break[id_implements[188]] + id_extends[69];
                gW.id_break[GW.id_implements[189]] = n3;
                return this.id_class(bl, bl2, n + id_extends[70]);
            }
            this.id_case(id_catch[12]);
            Boolean bl3 = id_extends[71];
            this.id_break[GW.id_implements[190]] = bl3;
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[191]]));
        }
        return new bR_2((rP_2)object, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[192]]), (EZ)object2);
    }

    @Override
    public void id_class(String string, rq_3 rq_32, rja_3 rja_32) {
        this.id_new();
        String string2 = string;
        this.id_break[GW.id_implements[1]] = string2;
        rq_3 rq_33 = rq_32;
        this.id_break[GW.id_implements[2]] = rq_33;
        Object var17_6 = null;
        this.id_break[GW.id_implements[3]] = var17_6;
        boolean bl = rq_32 instanceof Mb_1;
        if (!((Map)C_class.id_instanceof().U.id_class[id_implements[4]]).isEmpty()) {
            rV_2 rV_22 = new rV_2((rq_3)this.id_break[id_implements[5]], (Map)C_class.id_instanceof().U.id_class[id_implements[6]]);
            this.id_break[GW.id_implements[7]] = rV_22;
        }
        int n = rja_32.b_();
        int n2 = rja_32.c_();
        int n3 = rja_32.d_();
        if (((Boolean)C_class.id_instanceof().W.id_class[id_implements[8]]).booleanValue()) {
            n += rq_32.id_break();
        }
        if (((Boolean)C_class.id_instanceof().Pt.id_class[id_implements[9]]).booleanValue()) {
            n2 += rq_32.id_class();
        }
        if (((Boolean)C_class.id_instanceof().v.id_class[id_implements[10]]).booleanValue()) {
            n3 += rq_32.id_byte();
        }
        rja_3 rja_33 = new rja_3(n, n2, n3);
        this.id_break[GW.id_implements[11]] = rja_33;
        Boolean bl2 = id_extends[1];
        this.id_break[GW.id_implements[12]] = bl2;
        Integer n4 = (int)((Integer)C_class.id_instanceof().PQ.id_class[id_implements[13]]);
        this.id_break[GW.id_implements[14]] = n4;
        Integer n5 = rq_32.id_class();
        this.id_break[GW.id_implements[15]] = n5;
        if (((Boolean)C_class.id_instanceof().Pi.id_class[id_implements[16]]).booleanValue() && bl) {
            if (((C_class)this.id_case[id_implements[17]]).E().id_byte().length == 0) {
                this.id_case(id_catch[0]);
                Integer n6 = id_extends[2];
                this.id_break[GW.id_implements[18]] = n6;
            } else if (((Boolean)C_class.id_instanceof().O.id_class[id_implements[19]]).booleanValue()) {
                OptionalInt optionalInt = Stream.of(((C_class)this.id_case[id_implements[20]]).E().id_byte()).mapToInt(rY_22 -> (Integer)rY_22.id_class().id_break[id_implements[288]]).min();
                OptionalInt optionalInt2 = Stream.of(((C_class)this.id_case[id_implements[21]]).E().id_byte()).mapToInt(rY_22 -> (Integer)rY_22.id_protected().id_break[id_implements[287]]).max();
                if (optionalInt.isPresent() && optionalInt2.isPresent()) {
                    int n7 = (Boolean)C_class.id_instanceof().rl.id_class[id_implements[22]] != false ? n2 + rq_32.id_class() - optionalInt2.getAsInt() : optionalInt.getAsInt() - n2;
                    Integer n8 = ((Boolean)C_class.id_instanceof().rl.id_class[id_implements[23]] != false ? n2 + rq_32.id_class() - optionalInt.getAsInt() : optionalInt2.getAsInt() - n2) + id_extends[3];
                    this.id_break[GW.id_implements[24]] = n8;
                    Integer n9 = Math.max((Integer)this.id_break[id_implements[25]], n7 / (Integer)C_class.id_instanceof().id_new.id_class[id_implements[26]]);
                    this.id_break[GW.id_implements[27]] = n9;
                    Object[] objectArray = new Object[id_private[0]];
                    objectArray[GW.id_extends[4]] = n2;
                    objectArray[GW.id_extends[5]] = rq_32.id_class();
                    this.id_byte(String.format(id_catch[1], objectArray));
                    Object[] objectArray2 = new Object[id_private[1]];
                    objectArray2[GW.id_extends[6]] = optionalInt.getAsInt();
                    objectArray2[GW.id_extends[7]] = optionalInt2.getAsInt();
                    this.id_byte(String.format(id_catch[2], objectArray2));
                    Object[] objectArray3 = new Object[id_private[2]];
                    objectArray3[GW.id_extends[8]] = n7;
                    objectArray3[GW.id_extends[9]] = (int)((Integer)this.id_break[id_implements[28]]);
                    this.id_byte(String.format(id_catch[3], objectArray3));
                }
            }
        }
        Integer n10 = id_extends[10];
        this.id_break[GW.id_implements[29]] = n10;
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        this.id_break[GW.id_implements[30]] = longOpenHashSet;
        Object var28_24 = null;
        this.id_break[GW.id_implements[31]] = var28_24;
    }

    @Override
    public String id_class() {
        this.id_new();
        return (Boolean)this.id_break[id_implements[255]] != false ? id_catch[17] : "Building " + (String)this.id_break[id_implements[256]];
    }

    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32) {
        this.id_new();
        if (!this.id_byte()) {
            return null;
        }
        if (!((rq_3)this.id_break[id_implements[45]]).id_class(n - ((rja_3)this.id_break[id_implements[46]]).b_(), n2 - ((rja_3)this.id_break[id_implements[47]]).c_(), n3 - ((rja_3)this.id_break[id_implements[48]]).d_(), xc_32)) {
            return null;
        }
        xc_3 xc_33 = ((rq_3)this.id_break[id_implements[49]]).id_class(n - ((rja_3)this.id_break[id_implements[50]]).b_(), n2 - ((rja_3)this.id_break[id_implements[51]]).c_(), n3 - ((rja_3)this.id_break[id_implements[52]]).d_(), xc_32, (List)this.id_break[id_implements[53]]);
        if (xc_33.id_break() == xu_3.id_class) {
            return null;
        }
        return xc_33;
    }

    private rP_2 id_class(Gm_1 gm_1, List<xc_3> list, boolean bl) {
        this.id_new();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ((HashSet)this.id_break[id_implements[236]]).forEach(rU_22 -> {
            xc_3 xc_32 = ((bw_3)gm_1.id_break[id_implements[277]]).id_class((rfH_2)rU_22);
            if (xc_32.id_break() instanceof Ja_1) {
                xc_3 xc_33 = gm_1.id_byte((Integer)rU_22.id_break[id_implements[278]], (Integer)rU_22.id_break[id_implements[279]], (Integer)rU_22.id_break[id_implements[280]], xc_32);
                if (xc_33 == null) {
                    arrayList5.add(rU_22);
                } else if (this.id_class(list, gm_1.id_byte((Integer)rU_22.id_break[id_implements[281]], (Integer)rU_22.id_break[id_implements[282]], (Integer)rU_22.id_break[id_implements[283]], xc_32))) {
                    arrayList.add(rU_22);
                } else {
                    hashMap.put(xc_33, id_extends[108] + hashMap.getOrDefault(xc_33, id_extends[109]));
                }
            } else if (xc_32.id_break() instanceof dj_3) {
                if (!EF.id_protected(xc_32)) {
                    arrayList3.add(rU_22);
                } else {
                    arrayList4.add(rU_22);
                }
            } else {
                arrayList2.add(rU_22);
            }
        });
        arrayList5.forEach(((HashSet)this.id_break[id_implements[237]])::remove);
        ArrayList arrayList6 = new ArrayList();
        arrayList2.forEach(rU_22 -> arrayList6.add(this.id_break((rfH_2)rU_22, gm_1)));
        ArrayList arrayList7 = new ArrayList();
        arrayList.forEach(rU_22 -> {
            if (!arrayList.contains(rU_22.id_case()) && !arrayList.contains(rU_22.id_protected(id_private[37]))) {
                arrayList7.add(this.id_class((rfH_2)rU_22, gm_1));
            }
        });
        arrayList3.forEach(rU_22 -> arrayList7.add(new rS_2(rU_22.id_class())));
        if (!arrayList7.isEmpty()) {
            return new GL(new rs_3(arrayList7.toArray(new rP_2[id_extends[81]])), new rs_3(arrayList6.toArray(new rP_2[id_extends[82]])));
        }
        if (arrayList6.isEmpty()) {
            if (bl && !hashMap.isEmpty()) {
                this.id_case(id_catch[13]);
                this.id_case(hashMap.entrySet().stream().map(entry -> {
                    Object[] objectArray = new Object[id_private[36]];
                    objectArray[GW.id_extends[106]] = entry.getValue();
                    objectArray[GW.id_extends[107]] = entry.getKey();
                    return String.format(id_catch[19], objectArray);
                }).collect(Collectors.joining(id_catch[14])));
            }
            if (bl && !arrayList4.isEmpty()) {
                this.id_case(id_catch[15]);
                this.id_case(arrayList4.stream().map(rU_22 -> {
                    Object[] objectArray = new Object[id_private[34]];
                    objectArray[GW.id_extends[104]] = (int)((Integer)rU_22.id_break[id_implements[274]]);
                    objectArray[GW.id_extends[105]] = (int)((Integer)rU_22.id_break[id_implements[275]]);
                    objectArray[GW.id_private[35]] = (int)((Integer)rU_22.id_break[id_implements[276]]);
                    return String.format(id_catch[18], objectArray);
                }).collect(Collectors.joining(id_catch[16])));
            }
            return null;
        }
        return new rs_3(arrayList6.toArray(new rP_2[id_extends[83]]));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{52, 119, -14, 108, 21, -94, 36, -96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private Optional<GA> id_class(xc_3 xc_32, int n, int n2, int n3, bw_3 bw_32) {
        rpr_3[] rpr_3Array = rpr_3.values();
        int n4 = rpr_3Array.length;
        for (int i = id_extends[31]; i < n4; ++i) {
            rjC_2 rjC_22;
            rpr_3 rpr_32 = rpr_3Array[i];
            rU_2 rU_22 = new rU_2(n, n2, n3).id_class(rpr_32);
            xc_3 xc_33 = bw_32.id_class(rU_22);
            if (EF.id_break((Integer)rU_22.id_break[id_implements[77]], (int)((Integer)rU_22.id_break[id_implements[78]]), (int)((Integer)rU_22.id_break[id_implements[79]]), xc_33, bw_32) || !this.id_class((rfH_2)new rU_2(n, n2, n3), xc_32) || (rjC_22 = xc_33.id_finally(((Ps_1)this.id_case[id_implements[80]]).id_case(), rU_22)).id_break()) continue;
            rfl_3 rfl_32 = rjC_22.id_class();
            Vec3d[] vec3dArray = GW.id_class(rpr_32);
            int n5 = vec3dArray.length;
            for (int j = id_extends[32]; j < n5; ++j) {
                OptionalInt optionalInt;
                Vec3d vec3d = vec3dArray[j];
                double d = (double)((Integer)rU_22.id_break[id_implements[81]]).intValue() + rfl_32.id_class * vec3d.x + rfl_32.id_protected * (id_finally[0] - vec3d.x);
                double d2 = (double)((Integer)rU_22.id_break[id_implements[82]]).intValue() + rfl_32.id_break * vec3d.y + rfl_32.id_throws * (id_finally[1] - vec3d.y);
                double d3 = (double)((Integer)rU_22.id_break[id_implements[83]]).intValue() + rfl_32.id_byte * vec3d.z + rfl_32.id_case * (id_finally[2] - vec3d.z);
                PX pX = PJ.id_class(Ph_1.id_class(((Ps_1)this.id_case[id_implements[84]]).id_catch()), new rjU_2(d, d2, d3), ((Ps_1)this.id_case[id_implements[85]]).id_protected());
                PX pX2 = ((C_class)this.id_case[id_implements[86]]).id_private().id_class().id_class(pX);
                rjG_2 rjG_22 = Ph_1.id_class(((Ps_1)this.id_case[id_implements[87]]).id_catch(), pX2, ((Ps_1)this.id_case[id_implements[88]]).id_native().id_case(), id_extends[33]);
                if (rjG_22 == null || rjG_22.id_byte() != rjM_2.BLOCK || !((rff_3)rjG_22).id_class().equals(rU_22) || ((rff_3)rjG_22).id_break() != rpr_32.id_case() || !(optionalInt = this.id_class(xc_32, (rff_3)rjG_22, pX2)).isPresent()) continue;
                return Optional.of(new GA(optionalInt.getAsInt(), rU_22, rpr_32.id_case(), pX));
            }
        }
        return Optional.empty();
    }

    private void id_break(Gm_1 gm_1) {
        this.id_new();
        rU_2 rU_22 = ((Ps_1)this.id_case[id_implements[200]]).id_volatile();
        int n = (Integer)C_class.id_instanceof().Pn.id_class[id_implements[201]];
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    int n2;
                    int n3;
                    int n4 = (Integer)rU_22.id_break[id_implements[202]] + i;
                    xc_3 xc_32 = gm_1.id_byte(n4, n3 = (Integer)rU_22.id_break[id_implements[203]] + j, n2 = (Integer)rU_22.id_break[id_implements[204]] + k, ((bw_3)gm_1.id_break[id_implements[205]]).id_class(n4, n3, n2));
                    if (xc_32 == null) continue;
                    rU_2 rU_23 = new rU_2(n4, n3, n2);
                    if (this.id_class(((bw_3)gm_1.id_break[id_implements[206]]).id_class(n4, n3, n2), xc_32, id_extends[75])) {
                        ((HashSet)this.id_break[id_implements[207]]).remove(rU_23);
                        ((LongOpenHashSet)this.id_break[id_implements[208]]).add(rU_2.id_class(rU_23));
                        continue;
                    }
                    ((HashSet)this.id_break[id_implements[209]]).add(rU_23);
                    ((LongOpenHashSet)this.id_break[id_implements[210]]).remove(rU_2.id_class(rU_23));
                }
            }
        }
    }

    private rP_2 id_break(rfH_2 rfH_22, Gm_1 gm_1) {
        if (((Boolean)C_class.id_instanceof().K.id_class[id_implements[243]]).booleanValue() && ((bw_3)gm_1.id_break[id_implements[244]]).id_class(rfH_22.id_final()).id_break() instanceof Ja_1 && ((bw_3)gm_1.id_break[id_implements[245]]).id_class(rfH_22.id_break(id_private[33])).id_break() instanceof Ja_1) {
            return new GL(new Gv_1(rfH_22), new GN(this, rfH_22.id_final()));
        }
        return new Gv_1(rfH_22);
    }

    public List<xc_3> id_break(int n) {
        ArrayList<xc_3> arrayList = new ArrayList<xc_3>();
        for (int i = id_extends[89]; i < n; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((Ps_1)this.id_case[GW.id_implements[257]]).id_catch().id_implements[GW.id_implements[258]]).id_class.get(i);
            if (rdn_32.id_class() || !(rdn_32.id_break() instanceof rxJ_2)) {
                arrayList.add(xu_3.id_class.id_continue());
                continue;
            }
            xc_3 xc_32 = ((rxJ_2)rdn_32.id_break()).id_catch().id_class(new rxx_3(new Gc_1(this, ((Ps_1)this.id_case[id_implements[259]]).id_case(), ((Ps_1)this.id_case[id_implements[260]]).id_catch(), rpm_3.MAIN_HAND, rdn_32, new rff_3(new rjU_2(((Ps_1)this.id_case[GW.id_implements[261]]).id_catch().Ps().id_break, ((Ps_1)this.id_case[GW.id_implements[262]]).id_catch().Ps().id_byte, ((Ps_1)this.id_case[GW.id_implements[263]]).id_catch().Ps().id_protected), rpr_3.UP, ((Ps_1)this.id_case[id_implements[264]]).id_volatile(), id_extends[90]))));
            if (xc_32 != null) {
                arrayList.add(xc_32);
                continue;
            }
            arrayList.add(xu_3.id_class.id_continue());
        }
        return arrayList;
    }

    private Optional<GA> id_break(Gm_1 gm_1, List<xc_3> list) {
        rU_2 rU_22 = ((Ps_1)this.id_case[id_implements[66]]).id_volatile();
        for (int i = id_private[10]; i <= id_private[11]; ++i) {
            for (int j = id_private[12]; j <= id_extends[25]; ++j) {
                for (int k = id_private[13]; k <= id_private[14]; ++k) {
                    xc_3 xc_32;
                    int n;
                    int n2;
                    int n3 = (Integer)rU_22.id_break[id_implements[67]] + i;
                    xc_3 xc_33 = gm_1.id_byte(n3, n2 = (Integer)rU_22.id_break[id_implements[68]] + j, n = (Integer)rU_22.id_break[id_implements[69]] + k, ((bw_3)gm_1.id_break[id_implements[70]]).id_class(n3, n2, n));
                    if (xc_33 == null || !EF.id_break(n3, n2, n, xc_32 = ((bw_3)gm_1.id_break[id_implements[71]]).id_class(n3, n2, n), (bw_3)gm_1.id_break[id_implements[72]]) || this.id_class(xc_32, xc_33, id_extends[26]) || j == id_extends[27] && ((bw_3)gm_1.id_break[id_implements[73]]).id_class(n3, n2 + id_extends[28], n).id_break() == xu_3.id_class) continue;
                    list.add(xc_33);
                    Optional<GA> optional = this.id_class(xc_33, n3, n2, n, (bw_3)gm_1.id_break[id_implements[74]]);
                    if (!optional.isPresent()) continue;
                    return optional;
                }
            }
        }
        return Optional.empty();
    }

    private static /* synthetic */ void ntfClinit() {
        GW.id_int();
        GW.id_final();
        GW.id_volatile();
        GW.id_package();
        GW.id_continue();
        GW.id_this();
    }

    @Override
    public void id_finally() {
        this.id_new();
        Boolean bl = id_extends[11];
        this.id_break[GW.id_implements[32]] = bl;
    }

    @Override
    public void id_extends() {
        this.id_new();
        Boolean bl = id_extends[12];
        this.id_break[GW.id_implements[33]] = bl;
    }

    private static void id_continue() {
        id_private = new byte[]{2, 2, 2, -5, 5, -1, 5, -5, 5, -1, -5, 5, -5, -5, 5, 9, 5, 2, 3, 4, 5, 2, 3, 4, 2, 100, 36, 5, -1, 9, 9, 36, 9, 2, 3, 2, 2, 2, 6, 2, 3, 4, 5, 12, 6, 7, 8, 9, 11};
    }

    @Override
    public List<xc_3> id_implements() {
        this.id_new();
        return new ArrayList<xc_3>((List)this.id_break[id_implements[43]]);
    }

    private void id_new() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[43]];
            objectArray[GW.id_private[44]] = id_extends[116];
            objectArray[GW.id_private[45]] = id_extends[117];
            objectArray[GW.id_private[46]] = id_extends[118];
            objectArray[GW.id_private[47]] = id_extends[119];
            objectArray[GW.id_private[48]] = id_extends[120];
        }
    }

    private static void id_package() {
        double[] dArray = new double[40];
        dArray[0] = 1.0;
        dArray[1] = 1.0;
        dArray[2] = 1.0;
        dArray[3] = 0.5;
        dArray[4] = 1.0;
        dArray[5] = 0.5;
        dArray[6] = 0.1;
        dArray[7] = 1.0;
        dArray[8] = 0.5;
        dArray[9] = 0.9;
        dArray[10] = 1.0;
        dArray[11] = 0.5;
        dArray[12] = 0.5;
        dArray[13] = 1.0;
        dArray[14] = 0.1;
        dArray[15] = 0.5;
        dArray[16] = 1.0;
        dArray[17] = 0.9;
        dArray[18] = 0.5;
        dArray[20] = 0.5;
        dArray[21] = 0.1;
        dArray[23] = 0.5;
        dArray[24] = 0.9;
        dArray[26] = 0.5;
        dArray[27] = 0.5;
        dArray[29] = 0.1;
        dArray[30] = 0.5;
        dArray[32] = 0.9;
        dArray[33] = 0.5;
        dArray[34] = 2.0;
        dArray[35] = 0.5;
        dArray[36] = 2.0;
        dArray[37] = 0.25;
        dArray[38] = 0.75;
        dArray[39] = 200.0;
        id_finally = dArray;
    }

    private void id_super() {
        this.id_new();
        HashSet<rU_2> hashSet = new HashSet<rU_2>((HashSet)this.id_break[id_implements[198]]);
        hashSet.removeIf(rU_22 -> rU_22.id_class(((Ps_1)this.id_case[id_implements[284]]).id_catch().rx(), ((Ps_1)this.id_case[id_implements[285]]).id_catch().re(), ((Ps_1)this.id_case[id_implements[286]]).id_catch().BO(), id_extends[110]) > id_finally[39] ? id_extends[111] : id_extends[112]);
        if (!hashSet.isEmpty()) {
            HashSet<rU_2> hashSet2;
            this.id_break[GW.id_implements[199]] = hashSet2 = hashSet;
        }
    }

    @Override
    public void id_protected() {
        this.id_new();
        super.id_protected();
        Object var5_1 = null;
        this.id_break[GW.id_implements[246]] = var5_1;
        Object var6_2 = null;
        this.id_break[GW.id_implements[247]] = var6_2;
        Object var7_3 = null;
        this.id_break[GW.id_implements[248]] = var7_3;
        Object var8_4 = null;
        this.id_break[GW.id_implements[249]] = var8_4;
        Integer n = (int)((Integer)C_class.id_instanceof().PQ.id_class[id_implements[250]]);
        this.id_break[GW.id_implements[251]] = n;
        Integer n2 = id_extends[87];
        this.id_break[GW.id_implements[252]] = n2;
        Boolean bl = id_extends[88];
        this.id_break[GW.id_implements[253]] = bl;
        Object var12_8 = null;
        this.id_break[GW.id_implements[254]] = var12_8;
    }

    private boolean id_protected(Gm_1 gm_1) {
        this.id_new();
        if ((HashSet)this.id_break[id_implements[193]] == null) {
            HashSet hashSet;
            this.id_break[GW.id_implements[194]] = hashSet = new HashSet();
            this.id_class(gm_1);
            if (((HashSet)this.id_break[id_implements[195]]).isEmpty()) {
                return id_extends[72];
            }
        }
        this.id_break(gm_1);
        if (((HashSet)this.id_break[id_implements[196]]).isEmpty()) {
            this.id_class(gm_1);
        }
        return !((HashSet)this.id_break[id_implements[197]]).isEmpty() ? id_extends[73] : id_extends[74];
    }

    @Override
    public void id_private() {
        if (Mu_1.id_break()) {
            Optional<rqj_3<rw_3, rfH_2>> optional = Mu_1.id_class();
            if (optional.isPresent()) {
                rq_3 rq_32;
                rw_3 rw_32 = optional.get().id_class();
                rfH_2 rfH_22 = optional.get().id_break();
                rq_3 rq_33 = rq_32 = (Boolean)C_class.id_instanceof().Bs.id_class[id_implements[39]] != false ? new ME(rw_32) : rw_32;
                if (((Boolean)C_class.id_instanceof().Pi.id_class[id_implements[40]]).booleanValue()) {
                    rq_32 = new Mb_1(rq_32, rfH_22, ((C_class)this.id_case[id_implements[41]]).E().id_byte());
                }
                this.id_class(optional.get().id_class().toString(), rq_32, (rja_3)rfH_22);
            } else {
                this.id_case(id_catch[4]);
            }
        } else {
            this.id_case(id_catch[5]);
        }
    }

    private static void id_final() {
        id_catch = new String[]{new String("Poor little kitten forgot to set a selection while BuildOnlySelection is true"), new String("Schematic starts at y=%s with height %s"), new String("Selection starts at y=%s and ends at y=%s"), new String("Considering relevant height %s - %s"), new String("No schematic currently open"), new String("Schematica is not present"), new String("Schematic File could not be loaded."), new String("No schematic currently loaded"), new String("Litematica is not present"), new String("clear area"), new String("\u041f\u0440\u043e\u0446\u0435\u0441\u0441 \u0437\u0430\u0432\u0435\u0440\u0448\u0438\u043b\u0441\u044f"), new String("\u041f\u0440\u043e\u0446\u0435\u0441\u0441 \u0437\u0430\u0432\u0435\u0440\u0448\u0438\u043b\u0441\u044f"), new String("Unable to do it. Pausing. resume to resume, cancel to cancel"), new String("Missing materials for at least:"), new String("\n"), new String("Unreplaceable liquids at at least:"), new String("\n"), new String("Builder Paused"), new String("%s %s %s"), new String("%sx %s")};
    }

    private static void id_volatile() {
        short[] sArray = new short[290];
        sArray[0] = 11;
        sArray[1] = 2;
        sArray[2] = 4;
        sArray[3] = 3;
        sArray[5] = 4;
        sArray[7] = 4;
        sArray[11] = 5;
        sArray[12] = 7;
        sArray[14] = 8;
        sArray[15] = 11;
        sArray[18] = 11;
        sArray[24] = 11;
        sArray[25] = 8;
        sArray[27] = 8;
        sArray[28] = 11;
        sArray[29] = 9;
        sArray[30] = 1;
        sArray[32] = 7;
        sArray[33] = 7;
        sArray[34] = 7;
        sArray[42] = 5;
        sArray[43] = 10;
        sArray[44] = 4;
        sArray[45] = 4;
        sArray[46] = 5;
        sArray[47] = 5;
        sArray[48] = 5;
        sArray[49] = 4;
        sArray[50] = 5;
        sArray[51] = 5;
        sArray[52] = 5;
        sArray[53] = 10;
        sArray[54] = 1;
        sArray[58] = 1;
        sArray[59] = 2;
        sArray[61] = 2;
        sArray[62] = 4;
        sArray[63] = 4;
        sArray[64] = 1;
        sArray[65] = 1;
        sArray[66] = 1;
        sArray[68] = 1;
        sArray[69] = 2;
        sArray[70] = 4;
        sArray[71] = 4;
        sArray[72] = 4;
        sArray[73] = 4;
        sArray[74] = 4;
        sArray[75] = 1;
        sArray[76] = 1;
        sArray[78] = 1;
        sArray[79] = 2;
        sArray[80] = 1;
        sArray[82] = 1;
        sArray[83] = 2;
        sArray[84] = 1;
        sArray[85] = 1;
        sArray[87] = 1;
        sArray[88] = 1;
        sArray[89] = 1;
        sArray[90] = 1;
        sArray[91] = 1;
        sArray[92] = 15;
        sArray[93] = 1;
        sArray[94] = 16;
        sArray[95] = 1;
        sArray[96] = 15;
        sArray[97] = 1;
        sArray[98] = 16;
        sArray[99] = 1;
        sArray[100] = 1;
        sArray[101] = 1;
        sArray[102] = 15;
        sArray[103] = 1;
        sArray[104] = 16;
        sArray[107] = 10;
        sArray[109] = 4;
        sArray[110] = 6;
        sArray[111] = 6;
        sArray[112] = 6;
        sArray[114] = 7;
        sArray[115] = 2;
        sArray[117] = 3;
        sArray[118] = 4;
        sArray[119] = 3;
        sArray[120] = 3;
        sArray[122] = 8;
        sArray[124] = 8;
        sArray[126] = 4;
        sArray[128] = 8;
        sArray[130] = 11;
        sArray[131] = 8;
        sArray[132] = 8;
        sArray[133] = 8;
        sArray[136] = 9;
        sArray[137] = 9;
        sArray[138] = 9;
        sArray[140] = 8;
        sArray[141] = 5;
        sArray[142] = 5;
        sArray[144] = 4;
        sArray[145] = 5;
        sArray[147] = 1;
        sArray[149] = 1;
        sArray[150] = 1;
        sArray[152] = 7;
        sArray[153] = 1;
        sArray[154] = 1;
        sArray[156] = 4;
        sArray[157] = 2;
        sArray[158] = 1;
        sArray[159] = 6;
        sArray[160] = 3;
        sArray[162] = 1;
        sArray[163] = 1;
        sArray[166] = 7;
        sArray[167] = 1;
        sArray[168] = 1;
        sArray[169] = 1;
        sArray[170] = 2;
        sArray[171] = 1;
        sArray[173] = 5;
        sArray[174] = 2;
        sArray[176] = 10;
        sArray[177] = 10;
        sArray[179] = 1;
        sArray[180] = 10;
        sArray[181] = 10;
        sArray[184] = 8;
        sArray[186] = 3;
        sArray[187] = 8;
        sArray[188] = 8;
        sArray[189] = 8;
        sArray[190] = 7;
        sArray[191] = 1;
        sArray[192] = 4;
        sArray[200] = 1;
        sArray[203] = 1;
        sArray[204] = 2;
        sArray[205] = 4;
        sArray[206] = 4;
        sArray[208] = 1;
        sArray[210] = 1;
        sArray[212] = 4;
        sArray[213] = 4;
        sArray[214] = 4;
        sArray[215] = 5;
        sArray[216] = 5;
        sArray[217] = 5;
        sArray[218] = 4;
        sArray[219] = 4;
        sArray[220] = 4;
        sArray[221] = 4;
        sArray[222] = 4;
        sArray[223] = 10;
        sArray[224] = 1;
        sArray[226] = 1;
        sArray[229] = 1;
        sArray[231] = 4;
        sArray[232] = 10;
        sArray[238] = 1;
        sArray[239] = 1;
        sArray[240] = 1;
        sArray[242] = 1;
        sArray[244] = 4;
        sArray[245] = 4;
        sArray[247] = 2;
        sArray[248] = 4;
        sArray[249] = 3;
        sArray[251] = 8;
        sArray[252] = 9;
        sArray[253] = 7;
        sArray[254] = 1;
        sArray[255] = 7;
        sArray[256] = 2;
        sArray[257] = 1;
        sArray[258] = 1;
        sArray[259] = 1;
        sArray[260] = 1;
        sArray[261] = 1;
        sArray[262] = 1;
        sArray[263] = 1;
        sArray[264] = 1;
        sArray[275] = 1;
        sArray[276] = 2;
        sArray[277] = 4;
        sArray[279] = 1;
        sArray[280] = 2;
        sArray[282] = 1;
        sArray[283] = 2;
        sArray[284] = 1;
        sArray[285] = 1;
        sArray[286] = 1;
        sArray[287] = 1;
        sArray[288] = 1;
        id_implements = sArray;
    }

    @Override
    public boolean id_native() {
        this.id_new();
        return (Boolean)this.id_break[id_implements[34]];
    }
}

