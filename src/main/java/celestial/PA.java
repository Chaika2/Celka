/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_throws;
import celestial.PC;
import celestial.PF;
import celestial.PI;
import celestial.Pf_1;
import celestial.Pn_1;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.QY;
import celestial.Y;
import celestial.cb_3;
import celestial.q_1;
import celestial.rJY;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rqA_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrAM;
import celestial.rrAT;
import celestial.rrLc_1;
import celestial.rrLh_1;
import celestial.rrLu_1;
import celestial.rrNV;
import celestial.rrNW;
import celestial.rrNa_1;
import celestial.rrNh_1;
import celestial.rrNq_1;
import celestial.rrNt_1;
import celestial.rrQX;
import celestial.rrTi_1;
import celestial.rrTo_1;
import celestial.rrfZ_2;
import celestial.rrfw_3;
import celestial.rrjS_2;
import celestial.rrjx_3;
import celestial.rrnG_2;
import celestial.rrtG_2;
import celestial.rrtM_2;
import celestial.rrtS_2;
import celestial.rrtb_3;
import celestial.rrts_3;
import celestial.ruS_2;
import celestial.rvt_3;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PA
extends Pv_1 {
    private static boolean[] id_byte;
    private static long[] id_protected;
    public Object[] id_break;
    private static double[] id_throws;
    private static byte[] id_case;
    private static short[] id_catch;
    private static String[] id_private;

    private boolean id_byte() {
        this.id_break();
        PI pI = C_throws.id_byte().id_native().id_protected();
        rrjx_3 rrjx_32 = rrjS_2.id_class(pI, (Integer)this.id_break[id_catch[82]]);
        if (rrjx_32 == null) {
            return id_byte[17];
        }
        String string = rrjx_32.id_class();
        int n = rrjx_32.id_break();
        ((Ps_1)this.id_class[id_catch[83]]).id_catch().id_protected("/" + string + n);
        return id_byte[18];
    }

    public PA(C_class c_class) {
        super(c_class);
        this.id_break();
        Long l = id_protected[0];
        this.id_break[PA.id_catch[0]] = l;
        Long l2 = id_protected[1];
        this.id_break[PA.id_catch[1]] = l2;
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_break[PA.id_catch[2]] = rrfw_32;
        Integer n = id_byte[0];
        this.id_break[PA.id_catch[3]] = n;
    }

    static {
        PA.ntfClinit();
    }

    private void id_class(rrTo_1 rrTo_12, boolean bl) {
        this.id_break();
        if (!bl) {
            Object var8_3 = null;
            this.id_break[PA.id_catch[61]] = var8_3;
            ((rrfw_3)this.id_break[id_catch[62]]).id_class();
            Integer n = id_byte[14];
            this.id_break[PA.id_catch[63]] = n;
            Long l = id_protected[6];
            this.id_break[PA.id_catch[64]] = l;
            Long l2 = id_protected[7];
            this.id_break[PA.id_catch[65]] = l2;
            Object var12_7 = null;
            this.id_break[PA.id_catch[66]] = var12_7;
            return;
        }
        String string = rrTo_12.id_byte();
        if ((Pn_1)((Object)this.id_break[id_catch[67]]) == (Pn_1)((Object)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[id_catch[68]])) {
            if (((rrfw_3)this.id_break[id_catch[69]]).id_class(id_throws[0])) {
                if (this.id_byte()) {
                    PA pA = this;
                    Integer n = (Integer)pA.id_break[id_catch[70]] + id_byte[15];
                    pA.id_break[PA.id_catch[71]] = n;
                }
                ((rrfw_3)this.id_break[id_catch[72]]).id_class();
            }
        } else if ((Pn_1)((Object)this.id_break[id_catch[73]]) == (Pn_1)((Object)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[id_catch[74]]) && ((rrfw_3)this.id_break[id_catch[75]]).id_class(id_throws[1])) {
            if ((rrtb_3)((Object)this.id_break[id_catch[76]]) != (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_catch[77]])) {
                rrTo_12.id_break(new rrtG_2(string, (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_catch[78]])), id_byte[16]);
                rrtb_3 rrtb_32 = (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_catch[79]]);
                this.id_break[PA.id_catch[80]] = rrtb_32;
            }
            Object var15_11 = null;
            this.id_break[PA.id_catch[81]] = var15_11;
        }
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        rvt_3 rvt_32;
        rqA_2 rqA_22;
        this.id_break();
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvt_3 && (rqA_22 = (rvt_32 = (rvt_3)ruS_22).id_break()) == rqn_3.Mu) {
            if ((PC)this.id_break[id_catch[28]] != null) {
                // empty if block
            }
            if (this.id_protected()) {
                rrLu_12.id_class(id_byte[4]);
            }
        }
    }

    @Override
    public void id_class(rrnG_2 rrnG_22) {
        rrNW rrNW2;
        rrNV rrNV2;
        this.id_break();
        super.id_class(rrnG_22);
        rrTo_1 rrTo_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[50]]).id_private().d().id_continue();
        if (rrTo_12.id_break() && (PC)this.id_break[id_catch[51]] != null && (rrNV2 = (rrNW2 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_catch[52]])).id_throws()).id_switch()) instanceof rrNq_1) {
            rrnG_22.id_class(null);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1AA64CF46DF49F01L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAAC68CBF;
    }

    @Override
    public void id_class(rrAT rrAT2) {
        this.id_break();
        rrTo_1 rrTo_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[31]]).id_private().d().id_continue();
        if (!rrTo_12.id_break() || (PC)this.id_break[id_catch[32]] == null) {
            return;
        }
        rrNW rrNW2 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_catch[33]])).id_throws();
        rrNV rrNV2 = rrNW2.id_switch();
        if (!(rrNV2 instanceof rrNq_1)) {
            return;
        }
        if ((Long)this.id_break[id_catch[34]] != id_protected[4]) {
            Long l = rqR_2.id_break() - (Long)this.id_break[id_catch[35]];
            this.id_break[PA.id_catch[36]] = l;
            Long l2 = id_protected[5];
            this.id_break[PA.id_catch[37]] = l2;
        }
        rdn_3 rdn_32 = ((PC)this.id_break[id_catch[38]]).id_break();
        rdb_3 rdb_32 = rdn_32.id_break();
        String string = ((PC)this.id_break[id_catch[39]]).id_class();
        int n = ((PC)this.id_break[id_catch[40]]).id_protected();
        List<rJY> list = rrAT2.id_byte();
        boolean bl = id_byte[6];
        boolean bl2 = id_byte[7];
        for (rJY rJY2 : list) {
            rrNt_1 rrNt_12;
            if (!rJY2.id_break() || rJY2.id_protected > id_case[0] || (rrNt_12 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_catch[41]]).id_break(rJY2)) == null || rrNt_12.id_case() == id_case[1] || rrNt_12.id_catch() == null) continue;
            rdn_3 rdn_33 = rJY2.id_class();
            if (rdn_33.id_break() == rdb_32 && rrNt_12.id_case() == n && rrNt_12.id_catch().equals(string) && rdn_33.id_continue().id_byte().equals(rdn_32.id_continue().id_byte())) {
                bl = id_byte[8];
                break;
            }
            bl2 = id_byte[9];
        }
        rrTo_12.id_break(new rrtS_2(rdn_32, string, n, ((Ps_1)this.id_class[id_catch[42]]).id_throws().id_while().id_byte(), bl ? (rrts_3)((Object)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[id_catch[43]]) : (rrts_3)((Object)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[id_catch[44]])), id_byte[10]);
        ((Ps_1)this.id_class[id_catch[45]]).id_catch().id_strictfp();
        Object var22_18 = null;
        this.id_break[PA.id_catch[46]] = var22_18;
        if (this.id_throws()) {
            Pn_1 pn_1 = (Pn_1)((Object)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[id_catch[47]]);
            this.id_break[PA.id_catch[48]] = pn_1;
            ((rrfw_3)this.id_break[id_catch[49]]).id_class();
        }
    }

    @Override
    public void id_class(rrLh_1 rrLh_12) {
        this.id_break();
        rrTo_1 rrTo_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[29]]).id_private().d().id_continue();
        if (!rrTo_12.id_break()) {
            return;
        }
        String string = rrLh_12.id_class();
        if (string.startsWith(id_private[0])) {
            if ((PC)this.id_break[id_catch[30]] != null) {
                // empty if block
            }
            if (this.id_protected()) {
                rrLh_12.id_class(id_byte[5]);
            }
        }
    }

    @Override
    public void id_class(rrLc_1 rrLc_12) {
        this.id_break();
        rrTi_1 rrTi_12 = rrLc_12.id_class();
        if (rrTi_12 instanceof rrtM_2) {
            rrtM_2 rrtM_22 = (rrtM_2)rrTi_12;
            PC pC = new PC(rrtM_22.id_break(), rrtM_22.id_protected(), rrtM_22.id_class(), rrtM_22.id_byte());
            this.id_break[PA.id_catch[4]] = pC;
            C_class c_class = C_throws.id_byte();
            PI pI = c_class.id_native().id_protected();
            PF pF = c_class.id_try();
            QY qY = ((Ps_1)this.id_class[id_catch[5]]).id_throws();
            cb_3 cb_32 = ((Ps_1)this.id_class[id_catch[6]]).id_catch();
            if ((vm_3)qY.id_class[id_catch[7]] != null) {
                cb_32.id_strictfp();
            }
            if (pI == null || pI.id_class() != (Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_catch[8]])) {
                this.id_protected();
                return;
            }
            if (pF.id_class(id_byte[1])) {
                this.id_protected();
                return;
            }
            if (rrfZ_2.id_byte()) {
                this.id_protected();
                return;
            }
            rrNW rrNW2 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_catch[9]])).id_throws();
            if (rrNW2.id_switch() != null) {
                cb_32.id_strictfp();
                this.id_protected();
                return;
            }
            cb_32.id_case("/ah search " + rrtM_22.id_class());
            Long l = rqR_2.id_break();
            this.id_break[PA.id_catch[10]] = l;
        }
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_break();
        super.id_class(rrAM2);
        if ((Pn_1)((Object)this.id_break[id_catch[11]]) == (Pn_1)((Object)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[id_catch[12]])) {
            rrTo_1 rrTo_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[13]]).id_private().d().id_continue();
            if (rrTo_12.id_break() && (rrtb_3)((Object)this.id_break[id_catch[14]]) != (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_catch[15]])) {
                rrTo_12.id_break(new rrtG_2(rrTo_12.id_byte(), (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_catch[16]])), id_byte[2]);
                rrtb_3 rrtb_32 = (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_catch[17]]);
                this.id_break[PA.id_catch[18]] = rrtb_32;
            }
            Pn_1 pn_1 = (Pn_1)((Object)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[id_catch[19]]);
            this.id_break[PA.id_catch[20]] = pn_1;
            ((rrfw_3)this.id_break[id_catch[21]]).id_class();
            Integer n = id_byte[3];
            this.id_break[PA.id_catch[22]] = n;
        }
        Long l = id_protected[2];
        this.id_break[PA.id_catch[23]] = l;
        Long l2 = id_protected[3];
        this.id_break[PA.id_catch[24]] = l2;
        Object var12_8 = null;
        this.id_break[PA.id_catch[25]] = var12_8;
    }

    private static void id_class() {
        short[] sArray = new short[85];
        sArray[0] = 2;
        sArray[1] = 3;
        sArray[2] = 5;
        sArray[3] = 6;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 73;
        sArray[10] = 2;
        sArray[11] = 4;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 4;
        sArray[21] = 5;
        sArray[22] = 6;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[34] = 2;
        sArray[35] = 2;
        sArray[36] = 3;
        sArray[37] = 2;
        sArray[42] = 1;
        sArray[44] = 1;
        sArray[45] = 1;
        sArray[48] = 4;
        sArray[49] = 5;
        sArray[58] = 1;
        sArray[59] = 2;
        sArray[61] = 4;
        sArray[62] = 5;
        sArray[63] = 6;
        sArray[64] = 2;
        sArray[65] = 3;
        sArray[66] = 1;
        sArray[67] = 4;
        sArray[69] = 5;
        sArray[70] = 6;
        sArray[71] = 6;
        sArray[72] = 5;
        sArray[73] = 4;
        sArray[74] = 1;
        sArray[75] = 5;
        sArray[76] = 1;
        sArray[80] = 1;
        sArray[81] = 4;
        sArray[82] = 6;
        sArray[83] = 1;
        sArray[84] = 3;
        id_catch = sArray;
    }

    @Override
    public void id_class(q_1 q_12) {
        super.id_class(q_12);
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[26]])) {
            rrTo_1 rrTo_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[27]]).id_private().d().id_continue();
            boolean bl = rrTo_12.id_break();
            this.id_class(rrTo_12, bl);
        }
    }

    private void id_break() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[2]];
            objectArray[PA.id_case[3]] = id_protected[9];
            objectArray[PA.id_case[4]] = id_protected[10];
            objectArray[PA.id_case[5]] = id_byte[21];
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-2, -18, -52, 91, 69, -103, -125, 29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private boolean id_throws() {
        this.id_break();
        return (Long)this.id_break[id_catch[84]] > id_protected[8] ? id_byte[19] : id_byte[20];
    }

    private static /* synthetic */ void ntfClinit() {
        PA.id_finally();
        PA.id_private();
        PA.id_case();
        PA.id_class();
        PA.id_catch();
        PA.id_implements();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[22];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        id_byte = blArray;
    }

    private static void id_catch() {
        id_throws = new double[]{1000.0, 10000.0};
    }

    private static void id_case() {
        long[] lArray = new long[11];
        lArray[0] = -1L;
        lArray[1] = -1L;
        lArray[2] = -1L;
        lArray[3] = -1L;
        lArray[4] = -1L;
        lArray[5] = -1L;
        lArray[6] = -1L;
        lArray[7] = -1L;
        lArray[8] = 300L;
        id_protected = lArray;
    }

    private static void id_implements() {
        id_case = new byte[]{44, -1, 7, 2, 3, 6};
    }

    private boolean id_protected() {
        this.id_break();
        rrTo_1 rrTo_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[53]]).id_private().d().id_continue();
        if (rrTo_12.id_break() && (PC)this.id_break[id_catch[54]] != null) {
            rdn_3 rdn_32 = ((PC)this.id_break[id_catch[55]]).id_break();
            String string = ((PC)this.id_break[id_catch[56]]).id_class();
            int n = ((PC)this.id_break[id_catch[57]]).id_protected();
            rrTo_12.id_break(new rrtS_2(rdn_32, string, n, ((Ps_1)this.id_class[id_catch[58]]).id_throws().id_while().id_byte(), (rrts_3)((Object)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[id_catch[59]])), id_byte[11]);
            Object var9_5 = null;
            this.id_break[PA.id_catch[60]] = var9_5;
            return id_byte[12];
        }
        return id_byte[13];
    }

    private static void id_private() {
        id_private = new String[]{new String("[\u2603] \u041f\u043e\u0441\u043b\u0435 \u0432\u0445\u043e\u0434\u0430 \u043d\u0430 \u0440\u0435\u0436\u0438\u043c \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u043d\u0435\u043c\u043d\u043e\u0433\u043e \u043f\u043e\u0434\u043e\u0436\u0434\u0430\u0442\u044c \u043f\u0435\u0440\u0435\u0434 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435\u043c \u0430\u0443\u043a\u0446\u0438\u043e\u043d\u0430")};
    }
}

