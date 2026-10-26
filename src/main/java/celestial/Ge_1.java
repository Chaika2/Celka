/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_throws;
import celestial.EF;
import celestial.EZ;
import celestial.Ga_1;
import celestial.Gi_1;
import celestial.Ja_1;
import celestial.PJ;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Px_1;
import celestial.SR;
import celestial.St_1;
import celestial.an_3;
import celestial.bq_3;
import celestial.bw_3;
import celestial.dH_2;
import celestial.gm_3;
import celestial.module.util.XRay;
import celestial.rC_2;
import celestial.rL_2;
import celestial.rM_2;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rU_2;
import celestial.ra_3;
import celestial.rdn_3;
import celestial.re_3;
import celestial.rfH_2;
import celestial.rh_3;
import celestial.rhz_3;
import celestial.ri_3;
import celestial.rja_3;
import celestial.rn_3;
import celestial.rrQX;
import celestial.rrqN_2;
import celestial.rrqQ_2;
import celestial.rrqc_3;
import celestial.rrqd_3;
import celestial.rrqk_3;
import celestial.rrqz_3;
import celestial.rsE_2;
import celestial.rs_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ge_1
extends bq_3
implements rL_2,
rrqd_3 {
    private static double[] id_catch;
    private static byte[] id_private;
    private static boolean[] id_implements;
    private static String[] id_finally;
    private static short[] id_extends;
    public Object[] id_break;
    public static Object[] id_throws;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF59A96C4;
    }

    @Override
    public boolean id_byte() {
        this.id_package();
        return (ra_3)this.id_break[id_extends[1]] != null ? id_implements[0] : id_implements[1];
    }

    private rn_3 id_int() {
        this.id_package();
        ra_3 ra_32 = this.id_final();
        if (ra_32 == null) {
            return null;
        }
        boolean bl = (Boolean)C_class.id_instanceof().id_catch.id_class[id_extends[48]];
        List list = (List)this.id_break[id_extends[49]];
        if (!list.isEmpty()) {
            List<rfH_2> list2;
            EZ eZ = new EZ((C_class)this.id_case[id_extends[50]]);
            List<rfH_2> list3 = Ge_1.id_class(eZ, new ArrayList<rfH_2>(list), ra_32, id_private[0], (List<rfH_2>)((List)this.id_break[id_extends[51]]), this.id_implements());
            rs_3 rs_32 = new rs_3((rP_2[])list3.stream().map(rfH_22 -> this.id_class((rfH_2)rfH_22, list3, eZ)).toArray(rP_2[]::new));
            this.id_break[Ge_1.id_extends[52]] = list2 = list3;
            return new rn_3(rs_32, bl ? (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_extends[53]]) : (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_extends[54]]));
        }
        if (!bl && !((Boolean)C_class.id_instanceof().b.id_class[id_extends[55]]).booleanValue()) {
            return null;
        }
        int n = (Integer)C_class.id_instanceof().rx.id_class[id_extends[56]];
        if ((rfH_2)this.id_break[id_extends[57]] == null) {
            rU_2 rU_22 = ((Ps_1)this.id_case[id_extends[58]]).id_volatile();
            this.id_break[Ge_1.id_extends[59]] = rU_22;
        }
        if ((rM_2)this.id_break[id_extends[60]] == null) {
            rfH_2[] rfH_2Array = new rfH_2[id_implements[9]];
            rfH_2Array[Ge_1.id_implements[10]] = (rfH_2)this.id_break[id_extends[61]];
            Ga_1 ga_1 = new Ga_1(this, id_catch[0], n, rfH_2Array);
            this.id_break[Ge_1.id_extends[62]] = ga_1;
        }
        return new rn_3((rM_2)this.id_break[id_extends[63]], (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_extends[64]]));
    }

    public Ge_1(C_class c_class) {
        super(c_class);
        this.id_package();
        ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_extends[0]]).id_break(this);
    }

    static {
        Ge_1.ntfClinit();
    }

    private static void id_this() {
        Object[] objectArray = new Object[]{64};
        id_throws = objectArray;
    }

    public static boolean id_class(EZ eZ, rfH_2 rfH_22) {
        xc_3 xc_32 = ((bw_3)eZ.id_break[id_extends[99]]).id_class(rfH_22);
        if (EF.id_class(eZ, rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), xc_32, id_implements[24]) >= id_catch[2]) {
            return id_implements[25];
        }
        if (EF.id_class((bw_3)eZ.id_break[id_extends[100]], rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), xc_32)) {
            return id_implements[26];
        }
        return ((bw_3)eZ.id_break[id_extends[101]]).id_class(rfH_22.id_final()).id_break() != xu_3.id_while || ((bw_3)eZ.id_break[id_extends[102]]).id_class(rfH_22.id_break()).id_break() != xu_3.id_while ? id_implements[27] : id_implements[28];
    }

    private void id_class(List<rfH_2> list, EZ eZ) {
        List<rfH_2> list2;
        this.id_package();
        ra_3 ra_32 = this.id_final();
        if (ra_32 == null) {
            return;
        }
        if (((Boolean)C_class.id_instanceof().id_catch.id_class[id_extends[65]]).booleanValue()) {
            return;
        }
        List<rfH_2> list3 = this.id_implements();
        List<rfH_2> list4 = Ge_1.id_class(eZ, ra_32, id_private[1], list, (List<rfH_2>)((List)this.id_break[id_extends[66]]), list3);
        list4.addAll(list3);
        if (list4.isEmpty() && !((Boolean)C_class.id_instanceof().b.id_class[id_extends[67]]).booleanValue()) {
            this.id_case("No locations for " + ra_32 + " known, cancelling");
            if (((Boolean)C_class.id_instanceof().PA.id_class[id_extends[68]]).booleanValue()) {
                this.id_byte("No locations for " + ra_32 + " known, cancelling", id_implements[11]);
            }
            this.id_private();
            return;
        }
        this.id_break[Ge_1.id_extends[69]] = list2 = list4;
    }

    @Override
    public void id_class(int n, ra_3 ra_32) {
        HashMap hashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        this.id_package();
        ra_3 ra_33 = ra_32;
        this.id_break[Ge_1.id_extends[103]] = ra_33;
        if (this.id_final() == null) {
            Object var8_4 = null;
            this.id_break[Ge_1.id_extends[104]] = var8_4;
        }
        Integer n2 = n;
        this.id_break[Ge_1.id_extends[105]] = n2;
        this.id_break[Ge_1.id_extends[106]] = arrayList2 = new ArrayList();
        this.id_break[Ge_1.id_extends[107]] = arrayList = new ArrayList();
        Object var12_8 = null;
        this.id_break[Ge_1.id_extends[108]] = var12_8;
        Object var13_9 = null;
        this.id_break[Ge_1.id_extends[109]] = var13_9;
        this.id_break[Ge_1.id_extends[110]] = hashMap = new HashMap();
        if (ra_32 != null) {
            this.id_class(new ArrayList<rfH_2>(), new EZ((C_class)this.id_case[id_extends[111]]));
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, -45, -20, -102, 75, -123, 84, 16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private boolean id_class(rfH_2 rfH_22, EZ eZ, List<rfH_2> list) {
        this.id_package();
        if (list.contains(rfH_22)) {
            return id_implements[12];
        }
        xc_3 xc_32 = ((bw_3)eZ.id_break[id_extends[70]]).id_class(rfH_22);
        if (((Boolean)C_class.id_instanceof().rF.id_class[id_extends[71]]).booleanValue() && xc_32.id_break() instanceof Ja_1) {
            return id_implements[13];
        }
        return ((ra_3)this.id_break[id_extends[72]]).id_class(xc_32) && Ge_1.id_class(eZ, rfH_22) ? id_implements[14] : id_implements[15];
    }

    @Override
    public void id_class(Collection<rrqz_3> collection) {
        if (collection.isEmpty()) {
            ((C_class)this.id_case[id_extends[115]]).id_void().id_case();
        }
    }

    @Override
    public void id_class(int n, String ... stringArray) {
        this.id_class(n, new ra_3(stringArray));
    }

    private rP_2 id_class(rfH_2 rfH_22, List<rfH_2> list, EZ eZ) {
        boolean bl;
        boolean bl2 = bl = !(((bw_3)((C_class)this.id_case[Ge_1.id_extends[73]]).id_break[id_extends[74]]).id_class(rfH_22.id_final()).id_break() instanceof dH_2) ? id_implements[16] : id_implements[17];
        if (!((Boolean)C_class.id_instanceof().rC.id_class[id_extends[75]]).booleanValue()) {
            if (bl) {
                return new Gi_1(rfH_22);
            }
            return new rh_3(rfH_22);
        }
        boolean bl3 = this.id_class(rfH_22.id_final(), eZ, list);
        boolean bl4 = this.id_class(rfH_22.id_break(), eZ, list);
        boolean bl5 = this.id_class(rfH_22.id_catch(id_private[2]), eZ, list);
        if (bl3 == bl4) {
            if (bl5 && bl) {
                return new Gi_1(rfH_22);
            }
            return new rh_3(rfH_22);
        }
        if (bl3) {
            return new rS_2(rfH_22);
        }
        if (bl5 && bl) {
            return new rh_3(rfH_22.id_break());
        }
        return new rS_2(rfH_22.id_break());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA0F96DC4F3BEBFC5L;
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        Object object;
        Object object2;
        int n;
        Object object3;
        Object obj;
        this.id_package();
        XRay<?> xRay = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_extends[2]]).id_private().x();
        if (xRay.aJ_() && xRay.id_continue() && (obj = xRay.id_super()) instanceof rrqk_3 && !((rrqk_3)(object3 = (rrqk_3)obj)).id_finally()) {
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_extends[3]]));
        }
        if ((Integer)this.id_break[id_extends[4]] > 0 && (n = ((rhz_3)((Ps_1)this.id_case[Ge_1.id_extends[5]]).id_catch().id_implements[Ge_1.id_extends[6]]).id_class.stream().filter(rdn_32 -> {
            this.id_package();
            return ((ra_3)this.id_break[id_extends[128]]).id_class((rdn_3)rdn_32);
        }).mapToInt(rdn_3::id_char).sum()) >= (Integer)this.id_break[id_extends[7]]) {
            this.id_case("Have " + n + " valid items");
            this.id_private();
            return null;
        }
        if (bl) {
            if (!((List)this.id_break[id_extends[8]]).isEmpty() && ((Boolean)C_class.id_instanceof().Ph.id_class[id_extends[9]]).booleanValue()) {
                this.id_case("Unable to find any path to " + (ra_3)this.id_break[id_extends[10]] + ", blacklisting presumably unreachable closest instance...");
                if (((Boolean)C_class.id_instanceof().PA.id_class[id_extends[11]]).booleanValue()) {
                    this.id_byte("Unable to find any path to " + (ra_3)this.id_break[id_extends[12]] + ", blacklisting presumably unreachable closest instance...", id_implements[2]);
                }
                ((List)this.id_break[id_extends[13]]).stream().min(Comparator.comparingDouble(((Ps_1)this.id_case[id_extends[14]]).id_catch()::id_byte)).ifPresent(((List)this.id_break[id_extends[15]])::add);
                ((List)this.id_break[id_extends[16]]).removeIf(((List)this.id_break[id_extends[17]])::contains);
            } else {
                this.id_case("Unable to find any path to " + (ra_3)this.id_break[id_extends[18]] + ", canceling mine");
                if (((Boolean)C_class.id_instanceof().PA.id_class[id_extends[19]]).booleanValue()) {
                    this.id_byte("Unable to find any path to " + (ra_3)this.id_break[id_extends[20]] + ", canceling mine", id_implements[3]);
                }
                this.id_private();
                return null;
            }
        }
        this.id_native();
        int n2 = (Integer)C_class.id_instanceof().Pf.id_class[id_extends[21]];
        object3 = new ArrayList((List)this.id_break[id_extends[22]]);
        if (n2 != 0) {
            Ge_1 ge_1 = this;
            int n3 = (Integer)ge_1.id_break[id_extends[23]];
            Integer n4 = n3 + id_implements[4];
            ge_1.id_break[Ge_1.id_extends[24]] = n4;
            if (n3 % n2 == 0) {
                object2 = new EZ((C_class)this.id_case[id_extends[25]], id_implements[5]);
                C_class.id_interface().execute(() -> this.id_break((List)object3, (EZ)object2));
            }
        }
        if (((Boolean)C_class.id_instanceof().id_catch.id_class[id_extends[26]]).booleanValue() && !this.id_new()) {
            this.id_private();
            return null;
        }
        object2 = object3.stream().filter(rfH_22 -> rfH_22.b_() == ((Ps_1)this.id_case[id_extends[126]]).id_volatile().b_() && rfH_22.d_() == ((Ps_1)this.id_case[id_extends[127]]).id_volatile().d_() ? id_implements[50] : id_implements[51]).filter(rfH_22 -> rfH_22.c_() >= ((Ps_1)this.id_case[id_extends[125]]).id_volatile().c_() ? id_implements[48] : id_implements[49]).filter(rfH_22 -> !(bw_3.id_class((Ps_1)this.id_case[id_extends[124]], rfH_22).id_break() instanceof Ja_1) ? id_implements[46] : id_implements[47]).min(Comparator.comparingDouble(((Ps_1)this.id_case[id_extends[27]]).id_volatile().id_class()::id_private));
        ((C_class)this.id_case[id_extends[28]]).id_int().id_class();
        if (((Optional)object2).isPresent() && ((Ps_1)this.id_case[id_extends[29]]).id_catch().BL()) {
            Optional<Px_1> optional;
            object = (rfH_2)((Optional)object2).get();
            xc_3 xc_32 = ((bw_3)((C_class)this.id_case[Ge_1.id_extends[30]]).id_break[id_extends[31]]).id_class((rfH_2)object);
            if (!EF.id_class((bw_3)((C_class)this.id_case[Ge_1.id_extends[32]]).id_break[id_extends[33]], ((rja_3)object).b_(), ((rja_3)object).c_(), ((rja_3)object).d_(), xc_32) && (optional = PJ.id_class((Ps_1)this.id_case[id_extends[34]], (rfH_2)object)).isPresent() && bl2) {
                ((C_class)this.id_case[id_extends[35]]).id_private().id_class(optional.get().id_class(), id_implements[6]);
                EF.id_class((Ps_1)this.id_case[id_extends[36]], ((Ps_1)this.id_case[id_extends[37]]).id_case().id_byte((rfH_2)object));
                if (((Ps_1)this.id_case[id_extends[38]]).id_class((rfH_2)object) || ((Ps_1)this.id_case[id_extends[39]]).id_protected().id_class(optional.get().id_class())) {
                    ((C_class)this.id_case[id_extends[40]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_extends[41]]), id_implements[7]);
                }
                return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_extends[42]]));
            }
        }
        if ((object = this.id_int()) == null) {
            this.id_private();
            return null;
        }
        return object;
    }

    public static List<rfH_2> id_class(EZ eZ, ra_3 ra_32, int n, List<rfH_2> list, List<rfH_2> list2, List<rfH_2> list3) {
        List<rfH_2> list4 = new ArrayList<rfH_2>();
        ArrayList<xd_3> arrayList = new ArrayList<xd_3>();
        for (re_3 re_32 : ra_32.id_class()) {
            xd_3 xd_32 = re_32.id_break();
            if (((ImmutableSet)St_1.id_class[id_extends[80]]).contains((Object)xd_32)) {
                rU_2 rU_22 = ((C_case)eZ.id_break[id_extends[81]]).id_throw().id_volatile();
                list4.addAll(((SR)eZ.id_break[id_extends[82]]).id_break().id_class(ri_3.id_class(xd_32), (Integer)C_class.id_instanceof().c.id_class[id_extends[83]], (Integer)rU_22.id_break[id_extends[84]], (Integer)rU_22.id_break[id_extends[85]], id_private[3]));
                continue;
            }
            arrayList.add(xd_32);
        }
        list4 = Ge_1.id_class(eZ, list4, ra_32, n, list2, list3);
        if (!arrayList.isEmpty() || ((Boolean)C_class.id_instanceof().PU.id_class[id_extends[86]]).booleanValue() && list4.size() < n) {
            list4.addAll(C_throws.id_class().id_throws().id_class(eZ.id_break().id_throw(), ra_32, n, (int)id_private[4], (int)id_private[5]));
        }
        list4.addAll(list);
        return Ge_1.id_class(eZ, list4, ra_32, n, list2, list3);
    }

    @Override
    public String id_class() {
        this.id_package();
        return "Mine " + (ra_3)this.id_break[id_extends[47]];
    }

    private static List<rfH_2> id_class(EZ eZ, List<rfH_2> list, ra_3 ra_32, int n, List<rfH_2> list2, List<rfH_2> list3) {
        list3.removeIf(rfH_22 -> {
            for (rfH_2 rfH_23 : list) {
                if (!(rfH_23.id_private((rja_3)rfH_22) <= id_catch[3]) || !ra_32.id_class(eZ.id_class(rfH_23.b_(), rfH_23.c_(), rfH_23.d_())) || !Ge_1.id_class(eZ, rfH_23)) continue;
                return id_implements[42];
            }
            return id_implements[43];
        });
        List<rfH_2> list4 = list.stream().distinct().filter(rfH_22 -> !((bw_3)eZ.id_break[id_extends[121]]).id_class(rfH_22.b_(), rfH_22.d_()) || ra_32.id_class(eZ.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_())) || list3.contains(rfH_22) ? id_implements[40] : id_implements[41]).filter(rfH_22 -> Ge_1.id_class(eZ, rfH_22)).filter(rfH_22 -> {
            if (((Boolean)C_class.id_instanceof().Z.id_class[id_extends[120]]).booleanValue()) {
                return Ge_1.id_break(eZ, rfH_22);
            }
            return id_implements[39];
        }).filter(rfH_22 -> rfH_22.c_() >= (Integer)C_class.id_instanceof().id_import.id_class[id_extends[119]] ? id_implements[37] : id_implements[38]).filter(rfH_22 -> rfH_22.c_() <= (Integer)C_class.id_instanceof().rM.id_class[id_extends[118]] ? id_implements[35] : id_implements[36]).filter(rfH_22 -> !list2.contains(rfH_22) ? id_implements[33] : id_implements[34]).filter(rfH_22 -> {
            XRay<?> xRay = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_extends[117]]).id_private().x();
            if (xRay.aJ_()) {
                if (list3.contains(rfH_22)) {
                    return id_implements[29];
                }
                for (rrqc_3 rrqc_32 : ((rrqN_2)xRay.id_super()).id_final()) {
                    if (!rrqc_32.id_break().equals(rfH_22)) continue;
                    return id_implements[30];
                }
                return id_implements[31];
            }
            return id_implements[32];
        }).sorted(Comparator.comparingDouble(eZ.id_break().id_throw().id_catch()::id_byte)).collect(Collectors.toList());
        if (list4.size() > n) {
            return list4.subList(id_implements[21], n);
        }
        return list4;
    }

    private /* synthetic */ void id_break(List list, EZ eZ) {
        this.id_class(list, eZ);
    }

    public static boolean id_break(EZ eZ, rfH_2 rfH_22) {
        int n = (Integer)C_class.id_instanceof().PB.id_class[id_extends[98]];
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    if (Math.abs(i) + Math.abs(j) + Math.abs(k) > n || !EF.id_class(eZ.id_break(rfH_22.b_() + i, rfH_22.c_() + j, rfH_22.d_() + k))) continue;
                    return id_implements[22];
                }
            }
        }
        return id_implements[23];
    }

    private static /* synthetic */ void ntfClinit() {
        Ge_1.id_volatile();
        Ge_1.id_finally();
        Ge_1.id_extends();
        Ge_1.id_super();
        Ge_1.id_continue();
        Ge_1.id_this();
    }

    private static void id_finally() {
        id_finally = new String[]{new String("Unable to mine when allowBreak is false and target block is not in allowBreakAnyway!")};
    }

    private static void id_extends() {
        short[] sArray = new short[129];
        sArray[3] = 1;
        sArray[4] = 6;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 6;
        sArray[8] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[22] = 1;
        sArray[23] = 7;
        sArray[24] = 7;
        sArray[27] = 1;
        sArray[29] = 1;
        sArray[31] = 34;
        sArray[33] = 34;
        sArray[34] = 1;
        sArray[36] = 1;
        sArray[37] = 1;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[41] = 4;
        sArray[42] = 1;
        sArray[43] = 3;
        sArray[44] = 1;
        sArray[45] = 3;
        sArray[46] = 3;
        sArray[49] = 1;
        sArray[51] = 2;
        sArray[52] = 1;
        sArray[53] = 4;
        sArray[54] = 3;
        sArray[57] = 4;
        sArray[58] = 1;
        sArray[59] = 4;
        sArray[60] = 5;
        sArray[61] = 4;
        sArray[62] = 5;
        sArray[63] = 5;
        sArray[64] = 3;
        sArray[66] = 2;
        sArray[69] = 1;
        sArray[70] = 4;
        sArray[74] = 34;
        sArray[77] = 1;
        sArray[79] = 3;
        sArray[81] = 1;
        sArray[82] = 3;
        sArray[85] = 2;
        sArray[87] = 1;
        sArray[88] = 1;
        sArray[89] = 1;
        sArray[91] = 1;
        sArray[92] = 1;
        sArray[93] = 1;
        sArray[95] = 1;
        sArray[96] = 2;
        sArray[97] = 1;
        sArray[99] = 4;
        sArray[100] = 4;
        sArray[101] = 4;
        sArray[102] = 4;
        sArray[105] = 6;
        sArray[106] = 1;
        sArray[107] = 2;
        sArray[108] = 4;
        sArray[109] = 5;
        sArray[110] = 3;
        sArray[121] = 4;
        sArray[122] = 1;
        sArray[124] = 1;
        sArray[125] = 1;
        sArray[126] = 1;
        sArray[127] = 1;
        id_extends = sArray;
    }

    private static void id_continue() {
        id_private = new byte[]{64, 64, 2, 2, 10, 32, 10, 64, 8, 6, 7, 64};
    }

    public List<rfH_2> id_implements() {
        this.id_package();
        if (!((Boolean)C_class.id_instanceof().PV.id_class[id_extends[76]]).booleanValue()) {
            return Collections.emptyList();
        }
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        int n = id_implements[18];
        for (an_3 an_32 : ((gm_3)((Ps_1)this.id_case[id_extends[77]]).id_case()).id_byte()) {
            rsE_2 rsE_22;
            if (!(an_32 instanceof rsE_2) || !((ra_3)this.id_break[id_extends[78]]).id_class((rsE_22 = (rsE_2)an_32).id_protected())) continue;
            rfH_2 rfH_22 = an_32.Bs();
            for (int i = -n; i <= n; ++i) {
                for (int j = -n; j <= n; ++j) {
                    for (int k = -n; k <= n; ++k) {
                        arrayList.add(rfH_22.id_break(i, j, k));
                    }
                }
            }
        }
        arrayList.addAll(((Map)this.id_break[id_extends[79]]).keySet());
        return arrayList;
    }

    private boolean id_new() {
        List<rfH_2> list;
        this.id_package();
        List<rfH_2> list2 = this.id_implements();
        ((List)this.id_break[id_extends[87]]).addAll(list2);
        rU_2 rU_22 = ((Ps_1)this.id_case[id_extends[88]]).id_volatile();
        bw_3 bw_32 = new bw_3((Ps_1)this.id_case[id_extends[89]]);
        ra_3 ra_32 = this.id_final();
        if (ra_32 == null) {
            return id_implements[19];
        }
        byte by = id_private[6];
        double d = id_catch[1];
        for (int i = rU_22.b_() - by; i <= rU_22.b_() + by; ++i) {
            for (int j = rU_22.c_() - by; j <= rU_22.c_() + by; ++j) {
                for (int k = rU_22.d_() - by; k <= rU_22.d_() + by; ++k) {
                    if (!ra_32.id_class(bw_32.id_class(i, j, k))) continue;
                    rfH_2 rfH_22 = new rfH_2(i, j, k);
                    if ((!((Boolean)C_class.id_instanceof().i.id_class[id_extends[90]]).booleanValue() || !((List)this.id_break[id_extends[91]]).stream().anyMatch(rfH_23 -> rfH_23.id_private(rfH_22) <= id_catch[4] ? id_implements[44] : id_implements[45])) && !PJ.id_class((Ps_1)this.id_case[id_extends[92]], rfH_22, d).isPresent()) continue;
                    ((List)this.id_break[id_extends[93]]).add(rfH_22);
                }
            }
        }
        this.id_break[Ge_1.id_extends[97]] = list = Ge_1.id_class(new EZ((C_class)this.id_case[id_extends[94]]), (List)this.id_break[id_extends[95]], ra_32, id_private[7], (List<rfH_2>)((List)this.id_break[id_extends[96]]), list2);
        return id_implements[20];
    }

    private void id_package() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[8]];
            objectArray[Ge_1.id_private[9]] = id_implements[52];
            objectArray[Ge_1.id_private[10]] = id_implements[53];
        }
    }

    private static void id_super() {
        id_catch = new double[]{1.0, 20.0, 1000000.0, 9.0, 2.0};
    }

    @Override
    public void id_protected() {
        super.id_protected();
        this.id_class(id_implements[8], (ra_3)null);
    }

    private ra_3 id_final() {
        this.id_package();
        if ((ra_3)this.id_break[id_extends[112]] == null) {
            return null;
        }
        if (!C_class.id_instanceof().id_throws()) {
            ra_3 ra_32 = new ra_3((re_3[])((ra_3)this.id_break[id_extends[113]]).id_class().stream().filter(re_32 -> ((List)C_class.id_instanceof().I.id_class[id_extends[116]]).contains(re_32.id_break())).toArray(re_3[]::new));
            if (ra_32.id_class().isEmpty()) {
                this.id_case(id_finally[0]);
                return null;
            }
            return ra_32;
        }
        return (ra_3)this.id_break[id_extends[114]];
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[56];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[30] = true;
        blArray[32] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[40] = true;
        blArray[42] = true;
        blArray[44] = true;
        blArray[46] = true;
        blArray[48] = true;
        blArray[50] = true;
        blArray[54] = true;
        id_implements = blArray;
    }

    private void id_native() {
        HashMap hashMap;
        this.id_package();
        HashMap hashMap2 = new HashMap((Map)this.id_break[id_extends[43]]);
        ((Ps_1)this.id_case[id_extends[44]]).id_class().ifPresent(rfH_22 -> {
            this.id_package();
            if (((List)this.id_break[id_extends[122]]).contains(rfH_22)) {
                hashMap2.put(rfH_22, System.currentTimeMillis() + (Long)C_class.id_instanceof().q.id_class[id_extends[123]]);
            }
        });
        for (rfH_2 rfH_23 : ((Map)this.id_break[id_extends[45]]).keySet()) {
            if ((Long)hashMap2.get(rfH_23) >= System.currentTimeMillis()) continue;
            hashMap2.remove(rfH_23);
        }
        this.id_break[Ge_1.id_extends[46]] = hashMap = hashMap2;
    }
}

