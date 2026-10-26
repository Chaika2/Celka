/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.PJ;
import celestial.PX;
import celestial.Ph_1;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.movement.Spider;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rZx_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rhz_3;
import celestial.rjC_2;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rpm_3;
import celestial.rrAo_1;
import celestial.rrLY;
import celestial.rrQX;
import celestial.rrTF;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTp_1;
import celestial.rrfj_3;
import celestial.rrfu_3;
import celestial.rrjS_2;
import celestial.rrmi_3;
import celestial.rrnF_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlb_3
extends rrTF<Spider>
implements rrnF_2 {
    private static boolean[] id_break;
    private static float[] id_byte;
    private static byte[] id_protected;
    private static short[] id_case;
    private static String[] id_catch;
    private static double[] id_private;
    public Object[] id_class;

    private void id_int() {
        Spider spider = (Spider)this.id_continue();
        String string = id_catch[0];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_case[71]]).id_class(new rrtx_3(spider.id_final(), string, (int)id_case[72]));
        rrfu_3.id_byte(rrfu_3.id_class(spider) + string);
    }

    public rrlb_3(Spider spider) {
        super(spider);
        this.id_else();
        rrTT rrTT2 = new rrTT(this);
        this.id_class[rrlb_3.id_case[0]] = rrTT2;
        rrmi_3 rrmi_32 = new rrmi_3();
        this.id_class[rrlb_3.id_case[1]] = rrmi_32;
    }

    static {
        rrlb_3.ntfClinit();
    }

    private Pair<rfl_3, rjU_2> id_this() {
        rjU_2 rjU_22 = null;
        List<rjC_2> list = ((gm_3)rrlb_3.id_import.id_class[id_case[29]]).id_break((an_3)((cb_3)rrlb_3.id_import.id_class[id_case[30]]), ((cb_3)rrlb_3.id_import.id_class[id_case[31]]).rN().id_byte(id_private[2], id_private[3], id_private[4]), (xc_32, rfH_22) -> {
            if (xc_32.id_byte().id_throws()) {
                return id_break[14];
            }
            if (xc_32.id_byte().id_class()) {
                return id_break[15];
            }
            return xc_32.id_byte().id_break();
        }).sorted((rjC_22, rjC_23) -> {
            rjU_2 rjU_22 = rjC_22.id_class().rr();
            rjU_2 rjU_23 = rjC_23.id_class().rr();
            rjU_2 rjU_24 = ((cb_3)rrlb_3.id_import.id_class[id_case[79]]).Ps();
            return Double.compare(rjU_24.id_case(rjU_22), rjU_24.id_case(rjU_23));
        }).toList();
        rfl_3 rfl_32 = null;
        if (!list.isEmpty()) {
            rfl_32 = list.get(id_break[5]).id_class();
            double d = rfl_32.id_break;
            double d2 = id_private[5];
            if (((cb_3)rrlb_3.id_import.id_class[id_case[32]]).h() && rfl_32.id_byte() > d2) {
                d += d2;
            }
            rjU_22 = new rjU_2(rfl_32.id_class, d, rfl_32.id_byte);
        }
        if (rfl_32 == null) {
            return null;
        }
        return Pair.of(rfl_32, rjU_22);
    }

    private int id_class(rff_3 rff_32, int n) {
        this.id_else();
        int n2 = ((rhz_3)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[36]]).id_implements[rrlb_3.id_case[37]]).id_protected;
        if (n == id_protected[6]) {
            this.id_class(rff_32, rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_protected[7]) {
            this.id_class(rff_32, rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_protected[8]) {
            ((rhz_3)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[38]]).id_implements[rrlb_3.id_case[39]]).id_protected = n;
            this.id_class(rff_32, rpm_3.MAIN_HAND);
            ((rhz_3)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[40]]).id_implements[rrlb_3.id_case[41]]).id_protected = n2;
            return n;
        }
        if (n >= id_protected[9] && n <= id_protected[10]) {
            if (!((rrmi_3)this.id_class[id_case[42]]).id_class()) {
                rdn_3 rdn_32 = ((rhz_3)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[43]]).id_implements[id_case[44]]).id_extends(n);
                ((rrmi_3)this.id_class[id_case[45]]).id_class(rdn_32, n);
                ((Ax_1)rrlb_3.id_import.id_class[id_case[46]]).id_class(((rJr_1)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[47]]).id_implements[rrlb_3.id_case[48]]).id_case, n, ((rhz_3)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[49]]).id_implements[rrlb_3.id_case[50]]).id_protected, rXa_1.SWAP, rdn_32);
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[51]]).id_finally().id_class(rrLY.id_class());
            }
            return id_protected[11];
        }
        return id_protected[12];
    }

    @EventTarget
    public void id_class(rrAo_1 rrAo_12) {
        this.id_else();
        if (((Boolean)this.id_class[id_case[33]]).booleanValue()) {
            rrAo_12.id_break(id_break[6]);
            ((cb_3)rrlb_3.id_import.id_class[id_case[34]]).sl();
            Boolean bl = id_break[7];
            this.id_class[rrlb_3.id_case[35]] = bl;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x363F42EB11C094C7L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2CEFE687;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, -6, -2, 58, 93, 108, -18, 66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class(rff_3 rff_32, rpm_3 rpm_32) {
        ((Ax_1)rrlb_3.id_import.id_class[id_case[52]]).id_package();
        ((Aq_1)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[53]]).id_break[id_case[54]]).id_class(new rZx_1(rpm_32, rff_32));
    }

    @EventTarget(id_class=100)
    public void id_class(q_1 q_12) {
        this.id_else();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[2]])) {
            Boolean bl = id_break[0];
            this.id_class[rrlb_3.id_case[3]] = bl;
            ((rrTT)this.id_class[id_case[4]]).id_final();
            Pair<rfl_3, rjU_2> pair = this.id_this();
            if (pair == null) {
                Integer n = id_protected[0];
                this.id_class[rrlb_3.id_case[5]] = n;
                return;
            }
            rjU_2 rjU_22 = (rjU_2)pair.getRight();
            this.id_class[rrlb_3.id_case[6]] = rjU_22;
            double d = ((rfl_3)pair.getLeft()).id_break() * id_private[0];
            double d2 = ((rjU_2)this.id_class[rrlb_3.id_case[7]]).id_break + d - ((cb_3)rrlb_3.id_import.id_class[id_case[8]]).rx();
            double d3 = ((rjU_2)this.id_class[rrlb_3.id_case[9]]).id_byte + id_private[1] - ((cb_3)rrlb_3.id_import.id_class[id_case[10]]).rH();
            double d4 = ((rjU_2)this.id_class[rrlb_3.id_case[11]]).id_protected + d - ((cb_3)rrlb_3.id_import.id_class[id_case[12]]).BO();
            PX pX = PJ.id_class(d2, d3, d4).id_case(((cb_3)rrlb_3.id_import.id_class[id_case[13]]).h() ? id_byte[0] : id_byte[1]);
            ((rrTT)this.id_class[id_case[14]]).id_class(() -> pX, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_case[15]]));
            if (((Boolean)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[16]]).id_throws[id_case[17]]).booleanValue() && rrfj_3.id_catch()) {
                rjG_2 rjG_22 = Ph_1.id_class((cb_3)rrlb_3.id_import.id_class[id_case[18]], pX, ((Ax_1)rrlb_3.id_import.id_class[id_case[19]]).id_byte());
                if (rjG_22 instanceof rff_3) {
                    int n;
                    rff_3 rff_32 = (rff_3)rjG_22;
                    rfH_2 rfH_22 = rff_32.id_class();
                    xc_3 xc_32 = ((gm_3)rrlb_3.id_import.id_class[id_case[20]]).id_byte(rfH_22);
                    if (!xc_32.id_catch() && (n = this.id_public()) != id_protected[1]) {
                        int n2;
                        Boolean bl2 = id_break[1];
                        this.id_class[rrlb_3.id_case[21]] = bl2;
                        if ((Integer)this.id_class[id_case[22]] < id_protected[2]) {
                            rrlb_3 rrlb_32 = this;
                            Integer n3 = (Integer)rrlb_32.id_class[id_case[23]] + id_break[2];
                            rrlb_32.id_class[rrlb_3.id_case[24]] = n3;
                        }
                        if ((n2 = this.id_class(rff_32, n)) != id_protected[3] && (Integer)this.id_class[id_case[25]] == id_protected[4]) {
                            Boolean bl3 = id_break[3];
                            this.id_class[rrlb_3.id_case[26]] = bl3;
                            Integer n4 = id_break[4];
                            this.id_class[rrlb_3.id_case[27]] = n4;
                        }
                    }
                } else {
                    Integer n = id_protected[5];
                    this.id_class[rrlb_3.id_case[28]] = n;
                }
            }
        }
    }

    @Override
    public float id_break() {
        return id_byte[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrlb_3.id_while();
        rrlb_3.id_synchronized();
        rrlb_3.id_return();
        rrlb_3.id_package();
        rrlb_3.id_new();
        rrlb_3.id_goto();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_case[77]]);
    }

    private static void id_goto() {
        id_protected = new byte[]{3, -1, 3, -1, 3, 3, -2, -3, 9, 9, 36, -1, -1, -1, 3, -1, -2, -3, 36, -1, 6, 3, 4, 5};
    }

    private void id_else() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[3] = false;
            this.id_class[4] = false;
            this.id_class[5] = 0;
        }
    }

    private static void id_new() {
        id_byte = new float[]{65.0f, 74.2f, -1.0f, -1.0f};
    }

    private static void id_package() {
        double[] dArray = new double[6];
        dArray[0] = 0.5;
        dArray[1] = 0.5;
        dArray[2] = 0.01f;
        dArray[4] = 0.01f;
        dArray[5] = 0.5;
        id_private = dArray;
    }

    private static void id_return() {
        short[] sArray = new short[80];
        sArray[1] = 1;
        sArray[3] = 3;
        sArray[5] = 5;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 57;
        sArray[9] = 2;
        sArray[10] = 57;
        sArray[11] = 2;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[16] = 57;
        sArray[17] = 23;
        sArray[18] = 57;
        sArray[19] = 55;
        sArray[20] = 56;
        sArray[21] = 3;
        sArray[22] = 5;
        sArray[23] = 5;
        sArray[24] = 5;
        sArray[25] = 5;
        sArray[26] = 4;
        sArray[27] = 5;
        sArray[28] = 5;
        sArray[29] = 56;
        sArray[30] = 57;
        sArray[31] = 57;
        sArray[32] = 57;
        sArray[33] = 4;
        sArray[34] = 57;
        sArray[35] = 4;
        sArray[36] = 57;
        sArray[37] = 1;
        sArray[38] = 57;
        sArray[39] = 1;
        sArray[40] = 57;
        sArray[41] = 1;
        sArray[42] = 1;
        sArray[43] = 57;
        sArray[44] = 1;
        sArray[45] = 1;
        sArray[46] = 55;
        sArray[47] = 57;
        sArray[48] = 4;
        sArray[49] = 57;
        sArray[50] = 1;
        sArray[52] = 55;
        sArray[53] = 57;
        sArray[55] = 57;
        sArray[56] = 56;
        sArray[59] = 2;
        sArray[60] = 3;
        sArray[61] = 5;
        sArray[62] = 1;
        sArray[63] = 1;
        sArray[64] = 1;
        sArray[65] = 55;
        sArray[66] = 57;
        sArray[67] = 4;
        sArray[68] = 1;
        sArray[70] = 1;
        sArray[72] = 2000;
        sArray[73] = 57;
        sArray[74] = 57;
        sArray[75] = 57;
        sArray[76] = 1;
        sArray[78] = 3;
        sArray[79] = 57;
        id_case = sArray;
    }

    private static void id_while() {
        boolean[] blArray = new boolean[19];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    private int id_public() {
        if (rrjS_2.id_byte(((cb_3)rrlb_3.id_import.id_class[id_case[73]]).ss())) {
            return id_protected[16];
        }
        if (rrjS_2.id_byte(((cb_3)rrlb_3.id_import.id_class[id_case[74]]).Sn())) {
            return id_protected[17];
        }
        for (int i = id_break[13]; i < id_protected[18]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[75]]).id_implements[id_case[76]]).id_extends(i);
            if (!rrjS_2.id_byte(rdn_32)) continue;
            return i;
        }
        return id_protected[19];
    }

    @Override
    public float id_private() {
        return id_byte[3];
    }

    public boolean id_final() {
        this.id_else();
        return (Boolean)this.id_class[id_case[78]];
    }

    private static void id_synchronized() {
        id_catch = new String[]{new String("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e \u043c\u043e\u0440\u0441\u043a\u043e\u0439 \u0442\u0440\u0430\u0432\u044b \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435")};
    }

    @Override
    public boolean aI_() {
        if ((cb_3)rrlb_3.id_import.id_class[id_case[55]] == null || (gm_3)rrlb_3.id_import.id_class[id_case[56]] == null) {
            return id_break[8];
        }
        int n = this.id_public();
        if (n == id_protected[13]) {
            this.id_int();
            ((Spider)this.id_continue()).id_volatile();
            return id_break[9];
        }
        return super.aI_();
    }

    @Override
    public boolean aK_() {
        this.id_else();
        ((rrTT)this.id_class[id_case[57]]).id_final();
        ((rrTT)this.id_class[id_case[58]]).id_finally();
        Object var7_1 = null;
        this.id_class[rrlb_3.id_case[59]] = var7_1;
        Boolean bl = id_break[10];
        this.id_class[rrlb_3.id_case[60]] = bl;
        Integer n = id_protected[14];
        this.id_class[rrlb_3.id_case[61]] = n;
        if (((rrmi_3)this.id_class[id_case[62]]).id_class()) {
            int n2 = ((rrmi_3)this.id_class[id_case[63]]).id_break();
            int n3 = ((rrmi_3)this.id_class[id_case[64]]).id_class(id_break[11], new String[id_break[12]]);
            if (n3 != id_protected[15]) {
                ((Ax_1)rrlb_3.id_import.id_class[id_case[65]]).id_class(((rJr_1)((cb_3)rrlb_3.id_import.id_class[rrlb_3.id_case[66]]).id_implements[rrlb_3.id_case[67]]).id_case, n2, n3, rXa_1.SWAP, ((rrmi_3)this.id_class[id_case[68]]).id_byte());
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[69]]).id_finally().id_class(rrLY.id_class());
            }
        }
        ((rrmi_3)this.id_class[id_case[70]]).id_throws();
        return super.aK_();
    }
}

