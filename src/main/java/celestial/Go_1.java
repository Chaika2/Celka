/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.EF;
import celestial.EZ;
import celestial.GD;
import celestial.GK;
import celestial.Ge_1;
import celestial.PJ;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Px_1;
import celestial.bq_3;
import celestial.bw_3;
import celestial.rC_2;
import celestial.rE_2;
import celestial.rF_2;
import celestial.rJT;
import celestial.rJr_1;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rU_2;
import celestial.ra_3;
import celestial.re_3;
import celestial.rfH_2;
import celestial.rh_3;
import celestial.rn_3;
import celestial.rs_3;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Go_1
extends bq_3
implements rF_2 {
    private static boolean[] id_throws;
    public Object[] id_break;
    private static String[] id_catch;
    private static short[] id_private;
    private static double[] id_implements;
    private static byte[] id_finally;

    private boolean id_byte(xd_3 xd_32) {
        if (!((Boolean)C_class.id_instanceof().rz.id_class[id_private[65]]).booleanValue()) {
            return id_throws[29];
        }
        return xd_32 == xu_3.PP || xd_32 == xu_3.Ps || xd_32 == xu_3.Xr || xd_32 == xu_3.SW || xd_32 == xu_3.re || xd_32 == xu_3.sZ ? id_throws[30] : id_throws[31];
    }

    @Override
    public boolean id_byte() {
        this.id_finally();
        return (re_3)this.id_break[id_private[7]] != null ? id_throws[4] : id_throws[5];
    }

    public Go_1(C_class c_class) {
        super(c_class);
        this.id_finally();
        Integer n = id_throws[0];
        this.id_break[Go_1.id_private[0]] = n;
        Integer n2 = id_throws[1];
        this.id_break[Go_1.id_private[1]] = n2;
    }

    static {
        Go_1.ntfClinit();
    }

    public static /* synthetic */ C_class id_class(Go_1 go_1) {
        return (C_class)go_1.id_case[id_private[66]];
    }

    private boolean id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        int n;
        int n2;
        int n3 = Math.abs(rfH_22.b_() - rfH_23.b_());
        return n3 + (n2 = Math.abs(rfH_22.c_() - rfH_23.c_())) + (n = Math.abs(rfH_22.d_() - rfH_23.d_())) == id_throws[14] ? id_throws[15] : id_throws[16];
    }

    @Override
    public String id_class() {
        this.id_finally();
        if (((List)this.id_break[id_private[40]]).isEmpty()) {
            return "Exploring randomly to find " + (re_3)this.id_break[id_private[41]] + ", no known locations";
        }
        return "Get To " + (re_3)this.id_break[id_private[42]] + ", " + ((List)this.id_break[id_private[43]]).size() + " known locations";
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-48, -13, -46, -62, 14, -78, 61, -19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(re_3 re_32) {
        ArrayList arrayList;
        this.id_finally();
        this.id_protected();
        re_3 re_33 = re_32;
        this.id_break[Go_1.id_private[2]] = re_33;
        rU_2 rU_22 = ((Ps_1)this.id_case[id_private[3]]).id_volatile();
        this.id_break[Go_1.id_private[4]] = rU_22;
        this.id_break[Go_1.id_private[5]] = arrayList = new ArrayList();
        Integer n = id_throws[2];
        this.id_break[Go_1.id_private[6]] = n;
        this.id_break(new ArrayList<rfH_2>(), new GD(this, id_throws[3]));
    }

    private rP_2 id_class(rfH_2 rfH_22) {
        this.id_finally();
        if (this.id_protected(((re_3)this.id_break[id_private[48]]).id_break())) {
            return new rh_3(rfH_22);
        }
        if (this.id_break(((re_3)this.id_break[id_private[49]]).id_break()) && EF.id_catch(((bw_3)((C_class)this.id_case[Go_1.id_private[50]]).id_break[id_private[51]]).id_class(rfH_22.id_final()))) {
            return new rS_2(rfH_22.id_final());
        }
        return new rE_2(rfH_22);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7AA6C957;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x759E902EA1AD932FL;
    }

    @Override
    public synchronized rn_3 id_class(boolean bl, boolean bl2) {
        this.id_finally();
        if ((List)this.id_break[id_private[8]] == null) {
            this.id_break(new ArrayList<rfH_2>(), new GD(this, id_throws[6]));
        }
        if (((List)this.id_break[id_private[9]]).isEmpty()) {
            if (((Boolean)C_class.id_instanceof().b.id_class[id_private[10]]).booleanValue() && !bl) {
                rfH_2[] rfH_2Array = new rfH_2[id_throws[7]];
                rfH_2Array[Go_1.id_throws[8]] = (rfH_2)this.id_break[id_private[11]];
                return new rn_3(new GK(this, id_implements[0], rfH_2Array), (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[12]]));
            }
            this.id_case("No known locations of " + (re_3)this.id_break[id_private[13]] + ", canceling GetToBlock");
            if (bl2) {
                this.id_protected();
            }
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[14]]));
        }
        rs_3 rs_32 = new rs_3((rP_2[])((List)this.id_break[id_private[15]]).stream().map(this::id_class).toArray(rP_2[]::new));
        if (bl) {
            if (((Boolean)C_class.id_instanceof().Ph.id_class[id_private[16]]).booleanValue()) {
                this.id_case("Unable to find any path to " + (re_3)this.id_break[id_private[17]] + ", blacklisting presumably unreachable closest instances...");
                this.id_private();
                return this.id_class(id_throws[9], bl2);
            }
            this.id_case("Unable to find any path to " + (re_3)this.id_break[id_private[18]] + ", canceling GetToBlock");
            if (bl2) {
                this.id_protected();
            }
            return new rn_3(rs_32, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[19]]));
        }
        int n = (Integer)C_class.id_instanceof().Pf.id_class[id_private[20]];
        if (n != 0) {
            Go_1 go_1 = this;
            int n2 = (Integer)go_1.id_break[id_private[21]];
            Integer n3 = n2 + id_throws[10];
            go_1.id_break[Go_1.id_private[22]] = n3;
            if (n2 % n == 0) {
                ArrayList arrayList = new ArrayList((List)this.id_break[id_private[23]]);
                GD gD = new GD(this, id_throws[11]);
                C_class.id_interface().execute(() -> this.id_break(arrayList, gD));
            }
        }
        if (rs_32.id_break(((Ps_1)this.id_case[id_private[24]]).id_volatile()) && rs_32.id_break(((C_class)this.id_case[id_private[25]]).id_while().id_super()) && bl2) {
            if (this.id_byte(((re_3)this.id_break[id_private[26]]).id_break())) {
                if (this.id_final()) {
                    this.id_protected();
                    return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[27]]));
                }
            } else {
                this.id_protected();
                return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[28]]));
            }
        }
        return new rn_3(rs_32, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[29]]));
    }

    private synchronized void id_break(List<rfH_2> list, EZ eZ) {
        List<rfH_2> list2;
        this.id_finally();
        re_3[] re_3Array = new re_3[id_throws[17]];
        re_3Array[Go_1.id_throws[18]] = (re_3)this.id_break[id_private[44]];
        List<rfH_2> list3 = Ge_1.id_class(eZ, new ra_3(re_3Array), id_finally[0], list, (List<rfH_2>)((List)this.id_break[id_private[45]]), Collections.emptyList());
        list3.removeIf(((List)this.id_break[id_private[46]])::contains);
        this.id_break[Go_1.id_private[47]] = list2 = list3;
    }

    private boolean id_break(xd_3 xd_32) {
        if (!this.id_byte(xd_32)) {
            return id_throws[32];
        }
        return xd_32 == xu_3.SW || xd_32 == xu_3.re || xd_32 == xu_3.sZ ? id_throws[33] : id_throws[34];
    }

    private static /* synthetic */ void ntfClinit() {
        Go_1.id_native();
        Go_1.id_extends();
        Go_1.id_implements();
        Go_1.id_package();
        Go_1.id_volatile();
    }

    private void id_finally() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_finally[2]];
            objectArray[Go_1.id_finally[3]] = id_throws[35];
            objectArray[Go_1.id_finally[4]] = id_throws[36];
        }
    }

    private static void id_extends() {
        id_catch = new String[]{new String("Right click timed out"), new String("Arrived but failed to right click open")};
    }

    private static void id_implements() {
        short[] sArray = new short[67];
        sArray[0] = 4;
        sArray[1] = 5;
        sArray[3] = 1;
        sArray[4] = 3;
        sArray[5] = 2;
        sArray[6] = 5;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[11] = 3;
        sArray[12] = 4;
        sArray[14] = 2;
        sArray[15] = 1;
        sArray[19] = 2;
        sArray[21] = 4;
        sArray[22] = 4;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[27] = 2;
        sArray[28] = 2;
        sArray[29] = 3;
        sArray[30] = 1;
        sArray[31] = 1;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[36] = 1;
        sArray[37] = 3;
        sArray[38] = 2;
        sArray[40] = 1;
        sArray[43] = 1;
        sArray[45] = 2;
        sArray[46] = 2;
        sArray[47] = 1;
        sArray[51] = 34;
        sArray[52] = 1;
        sArray[53] = 1;
        sArray[54] = 1;
        sArray[56] = 1;
        sArray[57] = 1;
        sArray[59] = 5;
        sArray[60] = 1;
        sArray[61] = 4;
        sArray[62] = 5;
        sArray[63] = 5;
        id_private = sArray;
    }

    private static void id_package() {
        id_implements = new double[]{1.0};
    }

    private boolean id_protected(xd_3 xd_32) {
        if (!((Boolean)C_class.id_instanceof().P.id_class[id_private[64]]).booleanValue()) {
            return id_throws[26];
        }
        return xd_32 == xu_3.Pi ? id_throws[27] : id_throws[28];
    }

    @Override
    public synchronized void id_protected() {
        this.id_finally();
        super.id_protected();
        Object var5_1 = null;
        this.id_break[Go_1.id_private[35]] = var5_1;
        Object var6_2 = null;
        this.id_break[Go_1.id_private[36]] = var6_2;
        Object var7_3 = null;
        this.id_break[Go_1.id_private[37]] = var7_3;
        Object var8_4 = null;
        this.id_break[Go_1.id_private[38]] = var8_4;
        ((C_class)this.id_case[id_private[39]]).id_int().id_class();
    }

    @Override
    public synchronized boolean id_private() {
        this.id_finally();
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        ((List)this.id_break[id_private[30]]).stream().min(Comparator.comparingDouble(((Ps_1)this.id_case[id_private[31]]).id_volatile()::id_private)).ifPresent(arrayList::add);
        block2: while (true) {
            block3: for (rfH_2 rfH_22 : (List)this.id_break[id_private[32]]) {
                for (rfH_2 rfH_23 : arrayList) {
                    if (!this.id_class(rfH_22, rfH_23)) continue;
                    arrayList.add(rfH_22);
                    ((List)this.id_break[id_private[33]]).remove(rfH_22);
                    continue block2;
                    continue block3;
                }
            }
            break;
        }
        switch (arrayList.size()) {
            default: 
        }
        this.id_byte("Blacklisting unreachable locations " + arrayList);
        ((List)this.id_break[id_private[34]]).addAll(arrayList);
        return !arrayList.isEmpty() ? id_throws[12] : id_throws[13];
    }

    private boolean id_final() {
        this.id_finally();
        for (rfH_2 rfH_22 : (List)this.id_break[id_private[52]]) {
            Optional<Px_1> optional = PJ.id_class(((Ps_1)this.id_case[id_private[53]]).id_catch(), rfH_22, ((Ps_1)this.id_case[id_private[54]]).id_native().id_case());
            if (!optional.isPresent()) continue;
            ((C_class)this.id_case[id_private[55]]).id_private().id_class(optional.get().id_class(), id_throws[19]);
            if (((List)this.id_break[id_private[56]]).contains(((Ps_1)this.id_case[id_private[57]]).id_class().orElse(null))) {
                ((C_class)this.id_case[id_private[58]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_private[59]]), id_throws[20]);
                if (!((rJr_1)((Ps_1)this.id_case[Go_1.id_private[60]]).id_catch().id_implements[id_private[61]] instanceof rJT)) {
                    return id_throws[21];
                }
            }
            Go_1 go_1 = this;
            int n = (Integer)go_1.id_break[id_private[62]];
            Integer n2 = n + id_throws[22];
            go_1.id_break[Go_1.id_private[63]] = n2;
            if (n > id_finally[1]) {
                this.id_case(id_catch[0]);
                return id_throws[23];
            }
            return id_throws[24];
        }
        this.id_case(id_catch[1]);
        return id_throws[25];
    }

    private static void id_volatile() {
        id_finally = new byte[]{64, 20, 6, 4, 5};
    }

    private static void id_native() {
        boolean[] blArray = new boolean[37];
        blArray[4] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[30] = true;
        blArray[33] = true;
        id_throws = blArray;
    }
}

