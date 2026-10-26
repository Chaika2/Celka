/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BO;
import celestial.C_case;
import celestial.C_class;
import celestial.EF;
import celestial.EW;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GB;
import celestial.GE;
import celestial.GO;
import celestial.GP;
import celestial.GX;
import celestial.Gb_1;
import celestial.Gr_1;
import celestial.Gs_1;
import celestial.PJ;
import celestial.PP;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Pu_1;
import celestial.a_1;
import celestial.bw_3;
import celestial.rU_2;
import celestial.rW_2;
import celestial.rd_3;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rk_3;
import celestial.rqj_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gh_1
implements PP,
rW_2 {
    public static Object[] id_class;
    private static String[] id_throws;
    public Object[] id_break;
    private static boolean[] id_case;
    private static byte[] id_catch;
    private static double[] id_private;
    private static short[] id_implements;

    public boolean id_byte() {
        return (Boolean)this.id_break[id_implements[244]];
    }

    private static void id_int() {
        id_catch = new byte[]{3, 2, 10, 10, 3, -1, 3, 2, 2, 2, 3, 2, 2, -3, 3, 2, 2, 3, 3, 2, 3, 14, 2, 3, 6, 7, 13, 3, 2};
    }

    public Gh_1(BO bO, a_1 a_12) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        this.id_extends();
        Boolean bl = id_case[0];
        this.id_break[Gh_1.id_implements[0]] = bl;
        this.id_break[Gh_1.id_implements[1]] = hashSet3 = new HashSet();
        this.id_break[Gh_1.id_implements[2]] = hashSet2 = new HashSet();
        this.id_break[Gh_1.id_implements[3]] = hashSet = new HashSet();
        BO bO2 = bO;
        this.id_break[Gh_1.id_implements[4]] = bO2;
        Ps_1 ps_1 = (Ps_1)bO.id_class[id_implements[5]];
        this.id_break[Gh_1.id_implements[6]] = ps_1;
        a_1 a_13 = a_12;
        this.id_break[Gh_1.id_implements[7]] = a_13;
        Integer n = id_case[1];
        this.id_break[Gh_1.id_implements[8]] = n;
    }

    static {
        Gh_1.ntfClinit();
    }

    private void id_this() {
        ((C_class)((BO)this.id_break[Gh_1.id_implements[210]]).id_class[id_implements[211]]).id_int().id_class();
    }

    private boolean id_class(rqj_3<Double, rfH_2> rqj_32, double d) {
        double d2 = rqj_32.id_class();
        if (d2 > d) {
            if (((a_1)this.id_break[id_implements[105]]).id_catch().get((Integer)this.id_break[id_implements[106]]) instanceof Gs_1) {
                rfH_2 rfH_22 = ((a_1)this.id_break[id_implements[107]]).id_break().get((Integer)this.id_break[id_implements[108]] + id_case[41]);
                return Pu_1.id_break(((Ps_1)this.id_break[id_implements[109]]).id_catch(), rfH_22) >= d ? id_case[42] : id_case[43];
            }
            return id_case[44];
        }
        return id_case[45];
    }

    private static boolean id_class(Ps_1 ps_1, rd_3 rd_32, rd_3 rd_33) {
        if (rd_33 instanceof GP && rd_33.id_byte().equals(rd_32.id_byte())) {
            return id_case[102];
        }
        if (!EF.id_class(ps_1, rd_32.id_implements().id_break(rd_32.id_byte()))) {
            return id_case[103];
        }
        if (rd_33 instanceof Gb_1 && rd_33.id_byte().id_break().equals(rd_32.id_byte())) {
            return id_case[104];
        }
        return rd_33 instanceof GB && (Boolean)C_class.id_instanceof().C.id_class[id_implements[208]] != false ? id_case[105] : id_case[106];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{46, -92, -43, -1, 69, -96, -90, 21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Gh_1 id_class(Gh_1 gh_1) {
        if (gh_1 == null) {
            return this.id_new();
        }
        return GX.id_class((a_1)this.id_break[id_implements[218]], (a_1)gh_1.id_break[id_implements[219]], id_case[109]).map(gX -> {
            if (!gX.id_protected().equals(gh_1.id_class().id_protected())) {
                throw new IllegalStateException();
            }
            Gh_1 gh_12 = new Gh_1((BO)this.id_break[id_implements[245]], (a_1)gX);
            Integer n = (int)((Integer)this.id_break[id_implements[246]]);
            gh_12.id_break[Gh_1.id_implements[247]] = n;
            Double d = (Double)this.id_break[id_implements[248]];
            gh_12.id_break[Gh_1.id_implements[249]] = d;
            Integer n2 = (Integer)this.id_break[id_implements[250]];
            gh_12.id_break[Gh_1.id_implements[251]] = n2;
            Integer n3 = (int)((Integer)this.id_break[id_implements[252]]);
            gh_12.id_break[Gh_1.id_implements[253]] = n3;
            return gh_12;
        }).orElseGet(this::id_new);
    }

    private rqj_3<Double, rfH_2> id_class(a_1 a_12) {
        double d = id_private[5];
        rfH_2 rfH_22 = null;
        for (rd_3 rd_32 : a_12.id_catch()) {
            for (rfH_2 rfH_23 : ((Ev_1)rd_32).id_volatile()) {
                double d2 = Pu_1.id_class(((Ps_1)this.id_break[id_implements[93]]).id_catch(), rfH_23);
                if (!(d2 < d) && d != id_private[6]) continue;
                d = d2;
                rfH_22 = rfH_23;
            }
        }
        return new rqj_3<Double, Object>(d, rfH_22);
    }

    private static boolean id_class(Ps_1 ps_1, rd_3 rd_32) {
        double d = Math.abs((double)rd_32.id_byte().b_() * ((double)((Integer)rd_32.id_break().id_break[id_implements[204]]).intValue() + id_private[12] - ps_1.id_catch().Ps().id_protected)) + Math.abs((double)rd_32.id_byte().d_() * ((double)((Integer)rd_32.id_break().id_break[id_implements[205]]).intValue() + id_private[13] - ps_1.id_catch().Ps().id_break));
        if (d > id_private[14]) {
            return id_case[85];
        }
        rfH_2 rfH_22 = rd_32.id_break().id_byte(rd_32.id_byte()).id_break(id_catch[15]);
        if (EF.id_case(ps_1, rfH_22)) {
            return id_case[86];
        }
        double d2 = Math.abs((double)rd_32.id_byte().b_() * ((double)rfH_22.b_() + id_private[15] - ps_1.id_catch().Ps().id_break)) + Math.abs((double)rd_32.id_byte().d_() * ((double)rfH_22.d_() + id_private[16] - ps_1.id_catch().Ps().id_protected));
        return d2 > id_private[17] ? id_case[87] : id_case[88];
    }

    @Override
    public a_1 id_class() {
        return (a_1)this.id_break[id_implements[237]];
    }

    private static boolean id_class(Ps_1 ps_1, Gb_1 gb_1, Gr_1 gr_1, rd_3 rd_32) {
        if (!((Boolean)C_class.id_instanceof().PY.id_class[id_implements[206]]).booleanValue()) {
            return id_case[89];
        }
        if (!gb_1.id_byte().equals(gr_1.id_byte().id_break())) {
            return id_case[90];
        }
        if (rd_32.id_byte().b_() != gr_1.id_byte().b_() || rd_32.id_byte().d_() != gr_1.id_byte().d_()) {
            return id_case[91];
        }
        if (!EF.id_break(ps_1, gb_1.id_implements().id_case())) {
            return id_case[92];
        }
        if (!EF.id_break(ps_1, gr_1.id_implements().id_case())) {
            return id_case[93];
        }
        if (!((List)gr_1.id_new[id_implements[207]]).isEmpty()) {
            return id_case[94];
        }
        for (int i = id_case[95]; i < id_catch[16]; ++i) {
            for (int j = id_case[96]; j < id_catch[17]; ++j) {
                rfH_2 rfH_22 = gb_1.id_break().id_final(j);
                if (i == id_case[97]) {
                    rfH_22 = rfH_22.id_break(gb_1.id_byte());
                }
                if (EF.id_case(ps_1, rfH_22)) continue;
                return id_case[98];
            }
        }
        if (EF.id_throws(ps_1.id_case().id_byte(gb_1.id_break().id_final(id_catch[18])))) {
            return id_case[99];
        }
        return !EF.id_throws(ps_1.id_case().id_byte(gr_1.id_implements().id_final(id_catch[19]))) ? id_case[100] : id_case[101];
    }

    private rqj_3<rjU_2, rfH_2> id_class(Gs_1 gs_1) {
        rd_3 rd_32;
        int n;
        rfH_2 rfH_22 = gs_1.id_byte();
        if (rfH_22.c_() < id_catch[13]) {
            return null;
        }
        if (!((List)gs_1.id_new[id_implements[186]]).isEmpty()) {
            return null;
        }
        rja_3 rja_32 = new rja_3(rfH_22.b_(), id_case[80], rfH_22.d_());
        block0: for (n = (Integer)this.id_break[id_implements[187]] + id_case[81]; n < ((a_1)this.id_break[id_implements[188]]).id_class() - id_case[82] && n < (Integer)this.id_break[id_implements[189]] + id_catch[14] && (rd_32 = ((a_1)this.id_break[id_implements[190]]).id_catch().get(n)) instanceof Gb_1 && rja_32.equals(rd_32.id_byte()); ++n) {
            for (int i = ((Integer)rd_32.id_implements().id_break[id_implements[191]]).intValue(); i <= (Integer)gs_1.id_break().id_break[id_implements[192]] + id_case[83]; ++i) {
                rfH_2 rfH_23 = new rfH_2((Integer)rd_32.id_implements().id_break[id_implements[193]], i, (Integer)rd_32.id_implements().id_break[id_implements[194]]);
                if (!EF.id_case((Ps_1)this.id_break[id_implements[195]], rfH_23)) break block0;
            }
            if (!EF.id_break((Ps_1)this.id_break[id_implements[196]], rd_32.id_implements().id_case())) break;
        }
        if (--n == (Integer)this.id_break[id_implements[197]]) {
            return null;
        }
        double d = (double)(n - (Integer)this.id_break[id_implements[198]]) - id_private[9];
        return new rqj_3<rjU_2, rfH_2>(new rjU_2((double)rja_32.b_() * d + (double)((Integer)gs_1.id_implements().id_break[id_implements[199]]).intValue() + id_private[10], ((Integer)gs_1.id_implements().id_break[id_implements[200]]).intValue(), (double)rja_32.d_() * d + (double)((Integer)gs_1.id_implements().id_break[id_implements[201]]).intValue() + id_private[11]), gs_1.id_implements().id_class(rja_32.b_() * (n - (Integer)this.id_break[id_implements[202]]), id_case[84], rja_32.d_() * (n - (Integer)this.id_break[id_implements[203]])));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC3D210D8;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x35C8B3A1BB9D4344L;
    }

    @Override
    public int id_break() {
        return (Integer)this.id_break[id_implements[217]];
    }

    public boolean id_throws() {
        double d;
        Object object;
        Collection<Object> collection;
        Object object2;
        rqj_3<Double, rfH_2> rqj_32;
        if ((Integer)this.id_break[id_implements[9]] == ((a_1)this.id_break[id_implements[10]]).id_class() - id_case[2]) {
            Gh_1 gh_1 = this;
            Integer n = (Integer)gh_1.id_break[id_implements[11]] + id_case[3];
            gh_1.id_break[Gh_1.id_implements[12]] = n;
        }
        if ((Integer)this.id_break[id_implements[13]] >= ((a_1)this.id_break[id_implements[14]]).id_class()) {
            return id_case[4];
        }
        Ev_1 ev_1 = (Ev_1)((a_1)this.id_break[id_implements[15]]).id_catch().get((Integer)this.id_break[id_implements[16]]);
        rU_2 rU_22 = ((Ps_1)this.id_break[id_implements[17]]).id_volatile();
        if (!ev_1.id_volatile().contains(rU_22)) {
            int n;
            for (n = id_case[5]; n < (Integer)this.id_break[id_implements[18]] && n < ((a_1)this.id_break[id_implements[19]]).id_class(); ++n) {
                if (!((Ev_1)((a_1)this.id_break[id_implements[20]]).id_catch().get(n)).id_volatile().contains(rU_22)) continue;
                int n2 = (Integer)this.id_break[id_implements[21]];
                Integer n3 = n;
                this.id_break[Gh_1.id_implements[22]] = n3;
                for (int i = ((Integer)this.id_break[id_implements[23]]).intValue(); i <= n2; ++i) {
                    ((a_1)this.id_break[id_implements[24]]).id_catch().get(i).id_class();
                }
                this.id_continue();
                this.id_throws();
                return id_case[6];
            }
            for (n = (Integer)this.id_break[id_implements[25]] + id_catch[0]; n < ((a_1)this.id_break[id_implements[26]]).id_class() - id_case[7]; ++n) {
                if (!((Ev_1)((a_1)this.id_break[id_implements[27]]).id_catch().get(n)).id_volatile().contains(rU_22)) continue;
                if (n - (Integer)this.id_break[id_implements[28]] > id_catch[1]) {
                    this.id_byte("Skipping forward " + (n - (Integer)this.id_break[id_implements[29]]) + " steps, to " + n);
                }
                Integer n4 = n - id_case[8];
                this.id_break[Gh_1.id_implements[30]] = n4;
                this.id_continue();
                this.id_throws();
                return id_case[9];
            }
        }
        if (this.id_class(rqj_32 = this.id_class((a_1)this.id_break[id_implements[31]]), id_private[0])) {
            Gh_1 gh_1 = this;
            Integer n = (Integer)gh_1.id_break[id_implements[32]] + id_case[10];
            gh_1.id_break[Gh_1.id_implements[33]] = n;
            System.out.println("FAR AWAY FROM PATH FOR " + (Integer)this.id_break[id_implements[34]] + " TICKS. Current distance: " + rqj_32.id_class() + ". Threshold: 2.0");
            if ((double)((Integer)this.id_break[id_implements[35]]).intValue() > id_private[1]) {
                this.id_byte(id_throws[0]);
                this.id_native();
                return id_case[11];
            }
        } else {
            Integer n = id_case[12];
            this.id_break[Gh_1.id_implements[36]] = n;
        }
        if (this.id_class(rqj_32, id_private[2])) {
            this.id_byte(id_throws[1]);
            this.id_native();
            return id_case[13];
        }
        bw_3 bw_32 = new bw_3((Ps_1)this.id_break[id_implements[37]]);
        for (int i = (Integer)this.id_break[id_implements[38]] - id_catch[2]; i < (Integer)this.id_break[id_implements[39]] + id_catch[3]; ++i) {
            if (i < 0 || i >= ((a_1)this.id_break[id_implements[40]]).id_catch().size()) continue;
            object2 = (Ev_1)((a_1)this.id_break[id_implements[41]]).id_catch().get(i);
            collection = ((Ev_1)object2).id_class(bw_32);
            List<rfH_2> list = ((Ev_1)object2).id_break(bw_32);
            object = ((Ev_1)object2).id_byte(bw_32);
            ((Ev_1)object2).id_private();
            if (!collection.equals(((Ev_1)object2).id_class(bw_32))) {
                Boolean bl = id_case[14];
                this.id_break[Gh_1.id_implements[42]] = bl;
            }
            if (!list.equals(((Ev_1)object2).id_break(bw_32))) {
                Boolean bl = id_case[15];
                this.id_break[Gh_1.id_implements[43]] = bl;
            }
            if (object.equals(((Ev_1)object2).id_byte(bw_32))) continue;
            Boolean bl = id_case[16];
            this.id_break[Gh_1.id_implements[44]] = bl;
        }
        if (((Boolean)this.id_break[id_implements[45]]).booleanValue()) {
            Collection<Object> collection2;
            Object object3;
            HashSet<rfH_2> hashSet;
            HashSet<rfH_2> hashSet2 = new HashSet<rfH_2>();
            object2 = new HashSet();
            collection = new HashSet();
            for (int i = ((Integer)this.id_break[id_implements[46]]).intValue(); i < ((a_1)this.id_break[id_implements[47]]).id_catch().size(); ++i) {
                object = (Ev_1)((a_1)this.id_break[id_implements[48]]).id_catch().get(i);
                hashSet2.addAll(((Ev_1)object).id_class(bw_32));
                ((AbstractCollection)object2).addAll(((Ev_1)object).id_break(bw_32));
                ((AbstractCollection)collection).addAll(((Ev_1)object).id_byte(bw_32));
            }
            this.id_break[Gh_1.id_implements[49]] = hashSet = hashSet2;
            this.id_break[Gh_1.id_implements[50]] = object3 = object2;
            this.id_break[Gh_1.id_implements[51]] = collection2 = collection;
            Boolean bl = id_case[17];
            this.id_break[Gh_1.id_implements[52]] = bl;
        }
        if ((Integer)this.id_break[id_implements[53]] < ((a_1)this.id_break[id_implements[54]]).id_catch().size() - id_case[18]) {
            rd_3 rd_32 = ((a_1)this.id_break[id_implements[55]]).id_catch().get((Integer)this.id_break[id_implements[56]] + id_case[19]);
            if (!((bw_3)((C_class)((BO)this.id_break[Gh_1.id_implements[57]]).id_class[Gh_1.id_implements[58]]).id_break[id_implements[59]]).id_class((Integer)rd_32.id_implements().id_break[id_implements[60]], (Integer)rd_32.id_implements().id_break[id_implements[61]])) {
                this.id_byte(id_throws[2]);
                this.id_this();
                return id_case[20];
            }
        }
        boolean bl = ev_1.id_protected();
        if ((Integer)this.id_break[id_implements[62]] == null || ((Integer)this.id_break[id_implements[63]]).intValue() != ((Integer)this.id_break[id_implements[64]]).intValue()) {
            Integer n = (int)((Integer)this.id_break[id_implements[65]]);
            this.id_break[Gh_1.id_implements[66]] = n;
            Double d2 = ev_1.id_throws();
            this.id_break[Gh_1.id_implements[67]] = d2;
            if (C_class.id_instanceof().id_case()) {
                for (int i = id_case[21]; i < (Integer)C_class.id_instanceof().ru.id_class[id_implements[68]] && (Integer)this.id_break[id_implements[69]] + i < ((a_1)this.id_break[id_implements[70]]).id_class() - id_case[22]; ++i) {
                    if (!(((Ev_1)((a_1)this.id_break[id_implements[71]]).id_catch().get((Integer)this.id_break[id_implements[72]] + i)).id_class(((BO)this.id_break[id_implements[73]]).id_continue()) >= id_private[3]) || !bl) continue;
                    this.id_byte(id_throws[3]);
                    this.id_native();
                    return id_case[23];
                }
            }
        }
        if ((d = ev_1.id_protected(((BO)this.id_break[id_implements[74]]).id_continue())) >= id_private[4] && bl) {
            this.id_byte(id_throws[4]);
            this.id_native();
            return id_case[24];
        }
        if (!ev_1.id_case() && d - (Double)this.id_break[id_implements[75]] > (Double)C_class.id_instanceof().u.id_class[id_implements[76]] && bl) {
            this.id_byte("Original cost " + (Double)this.id_break[id_implements[77]] + " current cost " + d + ". Cancelling.");
            this.id_native();
            return id_case[25];
        }
        if (this.id_volatile()) {
            this.id_byte(id_throws[5]);
            this.id_this();
            return id_case[26];
        }
        rk_3 rk_32 = ev_1.id_catch();
        if (rk_32 == (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_implements[78]]) || rk_32 == (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_implements[79]])) {
            this.id_byte("Movement returns status " + rk_32);
            this.id_native();
            return id_case[27];
        }
        if (rk_32 == (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_implements[80]])) {
            Gh_1 gh_1 = this;
            Integer n = (Integer)gh_1.id_break[id_implements[81]] + id_case[28];
            gh_1.id_break[Gh_1.id_implements[82]] = n;
            this.id_continue();
            this.id_throws();
            return id_case[29];
        }
        Boolean bl2 = this.id_synchronized();
        this.id_break[Gh_1.id_implements[83]] = bl2;
        if (!((Boolean)this.id_break[id_implements[84]]).booleanValue()) {
            ((Ps_1)this.id_break[id_implements[85]]).id_catch().c_(id_case[30]);
        }
        Gh_1 gh_1 = this;
        Integer n = (Integer)gh_1.id_break[id_implements[86]] + id_case[31];
        gh_1.id_break[Gh_1.id_implements[87]] = n;
        if ((double)((Integer)this.id_break[id_implements[88]]).intValue() > (Double)this.id_break[id_implements[89]] + (double)((Integer)C_class.id_instanceof().id_default.id_class[id_implements[90]]).intValue()) {
            this.id_byte("This movement has taken too long (" + (Integer)this.id_break[id_implements[91]] + " ticks, expected " + (Double)this.id_break[id_implements[92]] + "). Cancelling.");
            this.id_native();
            return id_case[32];
        }
        return bl;
    }

    private static /* synthetic */ void ntfClinit() {
        Gh_1.id_return();
        Gh_1.id_final();
        Gh_1.id_super();
        Gh_1.id_package();
        Gh_1.id_int();
        Gh_1.id_else();
    }

    public Set<rfH_2> id_finally() {
        return Collections.unmodifiableSet((HashSet)this.id_break[id_implements[243]]);
    }

    public Set<rfH_2> id_catch() {
        return Collections.unmodifiableSet((HashSet)this.id_break[id_implements[241]]);
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[21]];
            objectArray[Gh_1.id_case[113]] = id_case[114];
            objectArray[Gh_1.id_catch[22]] = id_case[115];
            objectArray[Gh_1.id_catch[23]] = id_case[116];
            objectArray[Gh_1.id_catch[24]] = id_case[117];
            objectArray[Gh_1.id_catch[25]] = id_case[118];
            objectArray[Gh_1.id_catch[26]] = id_case[119];
        }
    }

    public Set<rfH_2> id_case() {
        return Collections.unmodifiableSet((HashSet)this.id_break[id_implements[242]]);
    }

    private void id_continue() {
        this.id_this();
        Integer n = id_case[107];
        this.id_break[Gh_1.id_implements[209]] = n;
    }

    private static void id_else() {
        Object[] objectArray = new Object[]{3.0, 2.0, 200.0};
        id_class = objectArray;
    }

    public boolean id_implements() {
        if (!((Ps_1)this.id_break[id_implements[110]]).id_catch().BL() && ((Ps_1)this.id_break[id_implements[111]]).id_case().id_break(((Ps_1)this.id_break[id_implements[112]]).id_volatile()).id_byte()) {
            return id_case[46];
        }
        if (((Ps_1)this.id_break[Gh_1.id_implements[113]]).id_catch().rv().id_byte < id_private[7]) {
            return id_case[47];
        }
        int n = ((a_1)this.id_break[id_implements[114]]).id_break().indexOf(((Ps_1)this.id_break[id_implements[115]]).id_volatile());
        if (n == id_catch[5]) {
            return id_case[48];
        }
        Integer n2 = n;
        this.id_break[Gh_1.id_implements[116]] = n2;
        this.id_this();
        return id_case[49];
    }

    private Gh_1 id_new() {
        if ((Integer)this.id_break[id_implements[220]] > (Integer)C_class.id_instanceof().Pk.id_class[id_implements[221]]) {
            int n = (Integer)C_class.id_instanceof().id_void.id_class[id_implements[222]];
            GO gO = new GO((a_1)this.id_break[id_implements[223]], n, ((a_1)this.id_break[id_implements[224]]).id_class() - id_case[110]);
            if (!gO.id_protected().equals(((a_1)this.id_break[id_implements[225]]).id_protected())) {
                throw new IllegalStateException();
            }
            this.id_byte("Discarding earliest segment movements, length cut from " + ((a_1)this.id_break[id_implements[226]]).id_class() + " to " + gO.id_class());
            Gh_1 gh_1 = new Gh_1((BO)this.id_break[id_implements[227]], gO);
            Integer n2 = (Integer)this.id_break[id_implements[228]] - n;
            gh_1.id_break[Gh_1.id_implements[229]] = n2;
            Double d = (Double)this.id_break[id_implements[230]];
            gh_1.id_break[Gh_1.id_implements[231]] = d;
            if ((Integer)this.id_break[id_implements[232]] != null) {
                Integer n3 = (Integer)this.id_break[id_implements[233]] - n;
                gh_1.id_break[Gh_1.id_implements[234]] = n3;
            }
            Integer n4 = (int)((Integer)this.id_break[id_implements[235]]);
            gh_1.id_break[Gh_1.id_implements[236]] = n4;
            return gh_1;
        }
        return this;
    }

    private static void id_package() {
        id_private = new double[]{2.0, 200.0, 3.0, 1000000.0, 1000000.0, -1.0, -1.0, -0.1, 0.07, 0.4, 0.5, 0.5, 0.5, 0.5, 0.1, 0.5, 0.5, 0.8, 3.0, 2.0, 200.0};
    }

    private static void id_return() {
        boolean[] blArray = new boolean[122];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[24] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[32] = true;
        blArray[40] = true;
        blArray[41] = true;
        blArray[42] = true;
        blArray[44] = true;
        blArray[49] = true;
        blArray[53] = true;
        blArray[54] = true;
        blArray[55] = true;
        blArray[56] = true;
        blArray[57] = true;
        blArray[58] = true;
        blArray[59] = true;
        blArray[61] = true;
        blArray[64] = true;
        blArray[65] = true;
        blArray[66] = true;
        blArray[68] = true;
        blArray[69] = true;
        blArray[70] = true;
        blArray[72] = true;
        blArray[73] = true;
        blArray[74] = true;
        blArray[75] = true;
        blArray[77] = true;
        blArray[78] = true;
        blArray[81] = true;
        blArray[82] = true;
        blArray[83] = true;
        blArray[86] = true;
        blArray[87] = true;
        blArray[97] = true;
        blArray[100] = true;
        blArray[102] = true;
        blArray[104] = true;
        blArray[105] = true;
        blArray[108] = true;
        blArray[110] = true;
        blArray[111] = true;
        blArray[113] = true;
        blArray[121] = true;
        id_case = blArray;
    }

    private static void id_super() {
        short[] sArray = new short[254];
        sArray[0] = 7;
        sArray[1] = 8;
        sArray[2] = 9;
        sArray[3] = 10;
        sArray[4] = 11;
        sArray[5] = 1;
        sArray[6] = 12;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[16] = 1;
        sArray[17] = 12;
        sArray[18] = 1;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[25] = 1;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[30] = 1;
        sArray[32] = 2;
        sArray[33] = 2;
        sArray[34] = 2;
        sArray[35] = 2;
        sArray[36] = 2;
        sArray[37] = 12;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[42] = 7;
        sArray[43] = 7;
        sArray[44] = 7;
        sArray[45] = 7;
        sArray[46] = 1;
        sArray[49] = 8;
        sArray[50] = 9;
        sArray[51] = 10;
        sArray[52] = 7;
        sArray[53] = 1;
        sArray[56] = 1;
        sArray[57] = 11;
        sArray[59] = 34;
        sArray[61] = 2;
        sArray[62] = 5;
        sArray[63] = 5;
        sArray[64] = 1;
        sArray[65] = 1;
        sArray[66] = 5;
        sArray[67] = 4;
        sArray[69] = 1;
        sArray[72] = 1;
        sArray[73] = 11;
        sArray[74] = 11;
        sArray[75] = 4;
        sArray[77] = 4;
        sArray[78] = 4;
        sArray[79] = 5;
        sArray[80] = 3;
        sArray[81] = 1;
        sArray[82] = 1;
        sArray[83] = 13;
        sArray[84] = 13;
        sArray[85] = 12;
        sArray[86] = 3;
        sArray[87] = 3;
        sArray[88] = 3;
        sArray[89] = 4;
        sArray[91] = 3;
        sArray[92] = 4;
        sArray[93] = 12;
        sArray[94] = 11;
        sArray[95] = 12;
        sArray[96] = 12;
        sArray[97] = 12;
        sArray[98] = 12;
        sArray[99] = 12;
        sArray[100] = 12;
        sArray[101] = 12;
        sArray[103] = 1;
        sArray[104] = 12;
        sArray[106] = 1;
        sArray[108] = 1;
        sArray[109] = 12;
        sArray[110] = 12;
        sArray[111] = 12;
        sArray[112] = 12;
        sArray[113] = 12;
        sArray[115] = 12;
        sArray[116] = 1;
        sArray[117] = 11;
        sArray[119] = 8;
        sArray[120] = 11;
        sArray[122] = 8;
        sArray[123] = 11;
        sArray[125] = 8;
        sArray[127] = 1;
        sArray[128] = 1;
        sArray[131] = 1;
        sArray[132] = 12;
        sArray[134] = 1;
        sArray[135] = 12;
        sArray[136] = 1;
        sArray[137] = 1;
        sArray[138] = 11;
        sArray[140] = 6;
        sArray[141] = 1;
        sArray[144] = 1;
        sArray[145] = 12;
        sArray[146] = 11;
        sArray[148] = 1;
        sArray[151] = 1;
        sArray[152] = 1;
        sArray[153] = 1;
        sArray[154] = 12;
        sArray[155] = 1;
        sArray[158] = 1;
        sArray[159] = 12;
        sArray[160] = 12;
        sArray[161] = 1;
        sArray[162] = 1;
        sArray[163] = 1;
        sArray[165] = 1;
        sArray[166] = 12;
        sArray[167] = 11;
        sArray[169] = 6;
        sArray[170] = 1;
        sArray[172] = 12;
        sArray[174] = 1;
        sArray[176] = 12;
        sArray[178] = 1;
        sArray[179] = 11;
        sArray[181] = 12;
        sArray[182] = 12;
        sArray[183] = 11;
        sArray[186] = 8;
        sArray[187] = 1;
        sArray[189] = 1;
        sArray[191] = 1;
        sArray[192] = 1;
        sArray[194] = 2;
        sArray[195] = 12;
        sArray[196] = 12;
        sArray[197] = 1;
        sArray[198] = 1;
        sArray[200] = 1;
        sArray[201] = 2;
        sArray[202] = 1;
        sArray[203] = 1;
        sArray[204] = 2;
        sArray[207] = 8;
        sArray[209] = 3;
        sArray[210] = 11;
        sArray[212] = 11;
        sArray[215] = 1;
        sArray[216] = 6;
        sArray[217] = 1;
        sArray[220] = 1;
        sArray[227] = 11;
        sArray[228] = 1;
        sArray[229] = 1;
        sArray[230] = 4;
        sArray[231] = 4;
        sArray[232] = 5;
        sArray[233] = 5;
        sArray[234] = 5;
        sArray[235] = 3;
        sArray[236] = 3;
        sArray[238] = 6;
        sArray[239] = 1;
        sArray[241] = 8;
        sArray[242] = 9;
        sArray[243] = 10;
        sArray[244] = 13;
        sArray[245] = 11;
        sArray[246] = 1;
        sArray[247] = 1;
        sArray[248] = 4;
        sArray[249] = 4;
        sArray[250] = 5;
        sArray[251] = 5;
        sArray[252] = 3;
        sArray[253] = 3;
        id_implements = sArray;
    }

    public boolean id_protected() {
        return (Integer)this.id_break[id_implements[239]] >= ((a_1)this.id_break[id_implements[240]]).id_class() ? id_case[111] : id_case[112];
    }

    public boolean id_private() {
        return (Boolean)this.id_break[id_implements[238]];
    }

    private static void id_final() {
        id_throws = new String[]{new String("Too far away from path for too long, cancelling path"), new String("too far from path"), new String("Pausing since destination is at edge of loaded chunks"), new String("Something has changed in the world and a future movement has become impossible. Cancelling."), new String("Something has changed in the world and this movement has become impossible. Cancelling."), new String("Pausing since current best path is a backtrack"), new String("Skipping traverse to straight ascend"), new String("Too far to the side to safely sprint ascend"), new String("Sprinting would be unsafe"), new String("Skipping descend to straight ascend")};
    }

    private boolean id_volatile() {
        Optional<EW> optional = ((BO)this.id_break[id_implements[94]]).id_case();
        if (!optional.isPresent()) {
            return id_case[33];
        }
        if (!((Ps_1)this.id_break[id_implements[95]]).id_catch().BL()) {
            return id_case[34];
        }
        if (!EF.id_break((Ps_1)this.id_break[id_implements[96]], ((Ps_1)this.id_break[id_implements[97]]).id_volatile().id_case())) {
            return id_case[35];
        }
        if (!EF.id_class((Ps_1)this.id_break[id_implements[98]], ((Ps_1)this.id_break[id_implements[99]]).id_volatile()) || !EF.id_class((Ps_1)this.id_break[id_implements[100]], ((Ps_1)this.id_break[id_implements[101]]).id_volatile().id_class())) {
            return id_case[36];
        }
        if (!((a_1)this.id_break[id_implements[102]]).id_catch().get((Integer)this.id_break[id_implements[103]]).id_protected()) {
            return id_case[37];
        }
        Optional<a_1> optional2 = optional.get().id_class();
        if (!optional2.isPresent()) {
            return id_case[38];
        }
        List<rU_2> list = optional2.get().id_break();
        if (list.size() < id_catch[4]) {
            return id_case[39];
        }
        list = list.subList(id_case[40], list.size());
        return list.contains(((Ps_1)this.id_break[id_implements[104]]).id_volatile());
    }

    private boolean id_synchronized() {
        Object object;
        boolean bl = ((C_class)((BO)this.id_break[Gh_1.id_implements[117]]).id_class[id_implements[118]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[119]]));
        ((C_class)((BO)this.id_break[Gh_1.id_implements[120]]).id_class[id_implements[121]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[122]]), id_case[50]);
        if (!((Boolean)new EZ((C_case)((C_class)((BO)this.id_break[Gh_1.id_implements[123]]).id_class[Gh_1.id_implements[124]]), (boolean)Gh_1.id_case[51]).id_break[id_implements[125]]).booleanValue()) {
            return id_case[52];
        }
        rd_3 rd_32 = ((a_1)this.id_break[id_implements[126]]).id_catch().get((Integer)this.id_break[id_implements[127]]);
        if (rd_32 instanceof Gb_1 && (Integer)this.id_break[id_implements[128]] < ((a_1)this.id_break[id_implements[129]]).id_class() - id_catch[6] && (object = ((a_1)this.id_break[id_implements[130]]).id_catch().get((Integer)this.id_break[id_implements[131]] + id_case[53])) instanceof Gr_1 && Gh_1.id_class((Ps_1)this.id_break[id_implements[132]], (Gb_1)rd_32, (Gr_1)object, ((a_1)this.id_break[id_implements[133]]).id_catch().get((Integer)this.id_break[id_implements[134]] + id_catch[7]))) {
            if (Gh_1.id_class((Ps_1)this.id_break[id_implements[135]], rd_32)) {
                this.id_byte(id_throws[6]);
                Gh_1 gh_1 = this;
                Integer n = (Integer)gh_1.id_break[id_implements[136]] + id_case[54];
                gh_1.id_break[Gh_1.id_implements[137]] = n;
                this.id_continue();
                this.id_throws();
                ((C_class)((BO)this.id_break[Gh_1.id_implements[138]]).id_class[id_implements[139]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[140]]), id_case[55]);
                return id_case[56];
            }
            this.id_byte(id_throws[7]);
        }
        if (bl) {
            return id_case[57];
        }
        if (rd_32 instanceof GP) {
            if ((Integer)this.id_break[id_implements[141]] < ((a_1)this.id_break[id_implements[142]]).id_class() - id_catch[8] && EF.id_break((Ps_1)this.id_break[id_implements[145]], (rfH_2)(object = ((a_1)this.id_break[id_implements[143]]).id_catch().get((Integer)this.id_break[id_implements[144]] + id_case[58])).id_implements().id_case()) && (object instanceof Gb_1 || object instanceof GE)) {
                boolean bl2;
                boolean bl3 = C_class.id_instanceof().id_byte() && ((C_class)((BO)this.id_break[Gh_1.id_implements[146]]).id_class[id_implements[147]]).id_static().id_class() && object instanceof GE ? id_case[59] : id_case[60];
                boolean bl4 = bl2 = !rd_32.id_byte().id_final().id_break(object.id_byte()).equals(rfH_2.id_protected) && rd_32.id_byte().id_final().id_protected(object.id_byte()).equals(rfH_2.id_protected) ? id_case[61] : id_case[62];
                if (bl2 && !bl3) {
                    ((GP)rd_32).id_int();
                }
            }
            if (((GP)rd_32).id_new() && !((GP)rd_32).id_package()) {
                this.id_byte(id_throws[8]);
                return id_case[63];
            }
            if ((Integer)this.id_break[id_implements[148]] < ((a_1)this.id_break[id_implements[149]]).id_class() - id_catch[9]) {
                object = ((a_1)this.id_break[id_implements[150]]).id_catch().get((Integer)this.id_break[id_implements[151]] + id_case[64]);
                if (object instanceof Gr_1 && rd_32.id_byte().id_final().equals(object.id_byte().id_break())) {
                    Gh_1 gh_1 = this;
                    Integer n = (Integer)gh_1.id_break[id_implements[152]] + id_case[65];
                    gh_1.id_break[Gh_1.id_implements[153]] = n;
                    this.id_continue();
                    this.id_throws();
                    this.id_byte(id_throws[9]);
                    return id_case[66];
                }
                if (Gh_1.id_class((Ps_1)this.id_break[id_implements[154]], rd_32, (rd_3)object)) {
                    rd_3 rd_33;
                    if (object instanceof GP && (Integer)this.id_break[id_implements[155]] < ((a_1)this.id_break[id_implements[156]]).id_class() - id_catch[10] && (rd_33 = ((a_1)this.id_break[id_implements[157]]).id_catch().get((Integer)this.id_break[id_implements[158]] + id_catch[11])) instanceof GP && !Gh_1.id_class((Ps_1)this.id_break[id_implements[159]], (rd_3)object, rd_33)) {
                        return id_case[67];
                    }
                    if (((Ps_1)this.id_break[id_implements[160]]).id_volatile().equals(rd_32.id_implements())) {
                        Gh_1 gh_1 = this;
                        Integer n = (Integer)gh_1.id_break[id_implements[161]] + id_case[68];
                        gh_1.id_break[Gh_1.id_implements[162]] = n;
                        this.id_continue();
                        this.id_throws();
                    }
                    return id_case[69];
                }
            }
        }
        if (rd_32 instanceof Gr_1 && (Integer)this.id_break[id_implements[163]] != 0) {
            rU_2 rU_22;
            object = ((a_1)this.id_break[id_implements[164]]).id_catch().get((Integer)this.id_break[id_implements[165]] - id_case[70]);
            if (object instanceof GP && object.id_byte().id_final().equals(rd_32.id_byte().id_break()) && ((Ps_1)this.id_break[Gh_1.id_implements[166]]).id_catch().Ps().id_byte >= (double)(rU_22 = rd_32.id_break().id_class()).c_() - id_private[8]) {
                ((C_class)((BO)this.id_break[Gh_1.id_implements[167]]).id_class[id_implements[168]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[169]]), id_case[71]);
                return id_case[72];
            }
            if ((Integer)this.id_break[id_implements[170]] < ((a_1)this.id_break[id_implements[171]]).id_class() - id_catch[12] && object instanceof Gb_1 && Gh_1.id_class((Ps_1)this.id_break[id_implements[172]], (Gb_1)object, (Gr_1)rd_32, ((a_1)this.id_break[id_implements[173]]).id_catch().get((Integer)this.id_break[id_implements[174]] + id_case[73]))) {
                return id_case[74];
            }
        }
        if (rd_32 instanceof Gs_1 && (object = this.id_class((Gs_1)rd_32)) != null) {
            rU_2 rU_23 = new rU_2((rfH_2)((rqj_3)object).id_break());
            if (!((a_1)this.id_break[id_implements[175]]).id_break().contains(rU_23)) {
                throw new IllegalStateException();
            }
            if (((Ps_1)this.id_break[id_implements[176]]).id_volatile().equals(rU_23)) {
                Integer n = ((a_1)this.id_break[id_implements[177]]).id_break().indexOf(rU_23);
                this.id_break[Gh_1.id_implements[178]] = n;
                this.id_continue();
                this.id_throws();
                return id_case[75];
            }
            this.id_this();
            ((C_class)((BO)this.id_break[Gh_1.id_implements[179]]).id_class[id_implements[180]]).id_private().id_class(PJ.id_class(((Ps_1)this.id_break[id_implements[181]]).id_finally(), (rjU_2)((rqj_3)object).id_class(), ((Ps_1)this.id_break[id_implements[182]]).id_protected()), id_case[76]);
            ((C_class)((BO)this.id_break[Gh_1.id_implements[183]]).id_class[id_implements[184]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[185]]), id_case[77]);
            return id_case[78];
        }
        return id_case[79];
    }

    private void id_native() {
        this.id_this();
        ((C_class)((BO)this.id_break[Gh_1.id_implements[212]]).id_class[id_implements[213]]).id_int().id_break().id_class();
        Integer n = ((a_1)this.id_break[id_implements[214]]).id_class() + id_catch[20];
        this.id_break[Gh_1.id_implements[215]] = n;
        Boolean bl = id_case[108];
        this.id_break[Gh_1.id_implements[216]] = bl;
    }
}

