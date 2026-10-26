/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.C_volatile;
import celestial.PX;
import celestial.QP;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.util.ClickPearl;
import celestial.q_1;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhz_3;
import celestial.rjG_2;
import celestial.rpm_3;
import celestial.rrAY;
import celestial.rrIk_1;
import celestial.rrLB;
import celestial.rrLu_1;
import celestial.rrTF;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTp_1;
import celestial.rrfP_2;
import celestial.rrfY_2;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrnF_2;
import celestial.rryp_1;
import celestial.rxt_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryy_1
extends rrTF<ClickPearl>
implements rrnF_2 {
    private static short[] id_break;
    private static byte[] id_byte;
    private static float[] id_protected;
    public Object[] id_class;
    private static boolean[] id_case;
    private static String[] id_catch;
    private static long[] id_private;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8CF94F46;
    }

    private void id_int() {
        if (this.id_class == null) {
            this.id_class = new Object[9];
            this.id_class[2] = 0L;
            this.id_class[3] = 0;
            this.id_class[4] = 0;
            this.id_class[5] = false;
            this.id_class[6] = 0;
            this.id_class[7] = 0;
        }
    }

    public rryy_1(ClickPearl clickPearl) {
        super(clickPearl);
        this.id_int();
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rryy_1.id_break[0]] = rrfP_22;
        rrTT rrTT2 = new rrTT(this);
        this.id_class[rryy_1.id_break[1]] = rrTT2;
        Integer n = id_byte[0];
        this.id_class[rryy_1.id_break[2]] = n;
        Integer n2 = id_byte[1];
        this.id_class[rryy_1.id_break[3]] = n2;
        rrIk_1 rrIk_12 = (rrIk_1)new rrIk_1(id_catch[0], id_case[0]).id_class(() -> ((ClickPearl)this.id_continue()).id_new() == this ? id_case[29] : id_case[30]);
        this.id_class[rryy_1.id_break[4]] = rrIk_12;
        clickPearl.id_class((rrIk_1)this.id_class[id_break[5]]);
    }

    static {
        rryy_1.ntfClinit();
    }

    private static void id_this() {
        id_catch = new String[]{new String("\u0410\u043d\u0442\u0438-\u0431\u043b\u043e\u043a\u0435\u0440"), new String("\u044d\u043d\u0434\u0435\u0440 \u0436\u0435\u043c\u0447\u0443\u0433\u0430")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{70, 45, 71, -50, -63, -8, 122, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(int n) {
        int n2;
        this.id_int();
        if (n != id_byte[6] && (n2 = this.id_protected(n)) > id_byte[7]) {
            Integer n3 = n2;
            this.id_class[rryy_1.id_break[39]] = n3;
            Integer n4 = id_case[18];
            this.id_class[rryy_1.id_break[40]] = n4;
        }
        this.id_instanceof();
        Boolean bl = id_case[19];
        this.id_class[rryy_1.id_break[41]] = bl;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2C62BD423EC767CAL;
    }

    @EventTarget
    public void id_class(rrAY rrAY2) {
        rff_3 rff_32;
        rjG_2 rjG_22;
        this.id_int();
        if (!((rrIk_1)this.id_class[id_break[12]]).id_class().booleanValue()) {
            return;
        }
        if (((Boolean)this.id_class[id_break[13]]).booleanValue() && rrAY2.id_class() == rpm_3.OFF_HAND) {
            rrAY2.id_class(id_case[8]);
        }
        if (rrAY2.id_break().id_break() instanceof rxt_3 && (rjG_22 = (rjG_2)rryy_1.id_import.id_class[id_break[14]]) instanceof rff_3 && ((gm_3)rryy_1.id_import.id_class[id_break[15]]).id_byte((rff_32 = (rff_3)rjG_22).id_class()).id_byte() != QP.id_class) {
            rrAY2.id_class(id_case[9]);
        }
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        boolean bl;
        this.id_int();
        ClickPearl clickPearl = (ClickPearl)this.id_continue();
        boolean bl2 = bl = rrLB2.id_break() == clickPearl.id_continue().id_finally().id_byte() ? id_case[1] : id_case[2];
        if (((rrIk_1)this.id_class[id_break[6]]).id_class().booleanValue() && rrLB2.id_break() == id_case[3] && ((cb_3)rryy_1.id_import.id_class[id_break[7]]).ss().id_break() instanceof rxt_3) {
            bl = id_case[4];
        }
        if (!bl) {
            return;
        }
        int n = rrfY_2.id_class(rdy_3.Jm, id_case[5], id_case[6]);
        rryp_1 rryp_12 = this.id_break(n);
        if (rryp_12 == (rryp_1)((Object)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[id_break[8]])) {
            int n2 = ((cb_3)rryy_1.id_import.id_class[id_break[9]]).sK().id_protected(rdy_3.Jm);
            float f = (float)n2 / id_protected[0];
            rrfu_3.id_class(clickPearl, id_catch[1], f);
        } else if (rryp_12 == (rryp_1)((Object)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[id_break[10]])) {
            this.id_public();
            Boolean bl3 = id_case[7];
            this.id_class[rryy_1.id_break[11]] = bl3;
        }
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_int();
        ((rrfP_2)this.id_class[id_break[16]]).id_class(rrLu_12);
    }

    @EventTarget(id_class=200)
    public void id_class(q_1 q_12) {
        block7: {
            block8: {
                int n;
                int n2;
                block9: {
                    this.id_int();
                    if (q_12.id_class() != (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[17]])) break block7;
                    ((rrfP_2)this.id_class[id_break[18]]).id_class(System.currentTimeMillis() - (Long)this.id_class[id_break[19]] > id_private[0] ? id_case[10] : id_case[11]);
                    if (!((Boolean)this.id_class[id_break[20]]).booleanValue()) break block8;
                    n2 = rrfY_2.id_class(rdy_3.Jm, id_case[12], id_case[13]);
                    n = this.id_while();
                    if (n > 0) {
                        ((rrTT)this.id_class[id_break[21]]).id_class(() -> new PX(((Float)((cb_3)rryy_1.id_import.id_class[rryy_1.id_break[82]]).id_break[id_break[83]]).floatValue(), ((Float)((cb_3)rryy_1.id_import.id_class[rryy_1.id_break[84]]).id_break[id_break[85]]).floatValue()), (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_break[22]]));
                    }
                    if (n == 0) break block9;
                    rryy_1 rryy_12 = this;
                    int n3 = (Integer)rryy_12.id_class[id_break[23]] + id_case[14];
                    Integer n4 = n3;
                    rryy_12.id_class[rryy_1.id_break[24]] = n4;
                    if (n3 < n) break block8;
                }
                this.id_class(n2);
                if (n != 0) {
                    ((rrTT)this.id_class[id_break[25]]).id_final();
                    ((rrTT)this.id_class[id_break[26]]).id_finally();
                }
                Integer n5 = id_case[15];
                this.id_class[rryy_1.id_break[27]] = n5;
            }
            if ((Integer)this.id_class[id_break[28]] != id_byte[2]) {
                rryy_1 rryy_13 = this;
                int n = (Integer)rryy_13.id_class[id_break[29]] + id_case[16];
                Integer n6 = n;
                rryy_13.id_class[rryy_1.id_break[30]] = n6;
                if (n > id_byte[3]) {
                    ((Ax_1)rryy_1.id_import.id_class[id_break[31]]).id_class((Integer)this.id_class[id_break[32]]);
                    Integer n7 = id_byte[4];
                    this.id_class[rryy_1.id_break[33]] = n7;
                    Integer n8 = id_case[17];
                    this.id_class[rryy_1.id_break[34]] = n8;
                }
            }
        }
    }

    private rryp_1 id_break(int n) {
        if (n == id_byte[5]) {
            return (rryp_1)((Object)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[id_break[35]]);
        }
        if (((cb_3)rryy_1.id_import.id_class[id_break[36]]).sK().id_class(rdy_3.Jm)) {
            return (rryp_1)((Object)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[id_break[37]]);
        }
        return (rryp_1)((Object)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[id_break[38]]);
    }

    @Override
    public float id_break() {
        return id_protected[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rryy_1.id_try();
        rryy_1.id_this();
        rryy_1.id_synchronized();
        rryy_1.id_return();
        rryy_1.id_new();
        rryy_1.id_final();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_break[77]]);
    }

    private int id_goto() {
        for (int i = id_case[26]; i < id_byte[18]; ++i) {
            if (((rhz_3)((cb_3)rryy_1.id_import.id_class[rryy_1.id_break[75]]).id_implements[id_break[76]]).id_extends(i).id_break() == rdy_3.Jm) continue;
            return i;
        }
        return id_byte[19];
    }

    private void id_instanceof() {
        this.id_int();
        if ((Integer)this.id_class[id_break[70]] != id_byte[16]) {
            ((rhz_3)((cb_3)rryy_1.id_import.id_class[rryy_1.id_break[71]]).id_implements[rryy_1.id_break[72]]).id_protected = (Integer)this.id_class[id_break[73]];
            Integer n = id_byte[17];
            this.id_class[rryy_1.id_break[74]] = n;
        }
    }

    private static void id_new() {
        id_protected = new float[]{20.0f, -1.0f, -1.0f};
    }

    private static void id_return() {
        short[] sArray = new short[86];
        sArray[1] = 1;
        sArray[2] = 4;
        sArray[3] = 6;
        sArray[4] = 8;
        sArray[5] = 8;
        sArray[6] = 8;
        sArray[7] = 57;
        sArray[8] = 2;
        sArray[9] = 57;
        sArray[11] = 5;
        sArray[12] = 8;
        sArray[13] = 5;
        sArray[14] = 64;
        sArray[15] = 56;
        sArray[19] = 2;
        sArray[20] = 5;
        sArray[21] = 1;
        sArray[23] = 3;
        sArray[24] = 3;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[27] = 3;
        sArray[28] = 6;
        sArray[29] = 7;
        sArray[30] = 7;
        sArray[31] = 55;
        sArray[32] = 6;
        sArray[33] = 6;
        sArray[34] = 7;
        sArray[35] = 1;
        sArray[36] = 57;
        sArray[37] = 2;
        sArray[39] = 6;
        sArray[40] = 7;
        sArray[41] = 5;
        sArray[42] = 57;
        sArray[43] = 57;
        sArray[44] = 57;
        sArray[45] = 57;
        sArray[46] = 1;
        sArray[48] = 57;
        sArray[49] = 1;
        sArray[50] = 55;
        sArray[51] = 57;
        sArray[52] = 2;
        sArray[53] = 8;
        sArray[54] = 64;
        sArray[55] = 56;
        sArray[56] = 57;
        sArray[57] = 57;
        sArray[58] = 1;
        sArray[59] = 4;
        sArray[60] = 57;
        sArray[61] = 1;
        sArray[62] = 55;
        sArray[63] = 57;
        sArray[64] = 56;
        sArray[65] = 8;
        sArray[66] = 64;
        sArray[67] = 56;
        sArray[68] = 3;
        sArray[69] = 3;
        sArray[70] = 4;
        sArray[71] = 57;
        sArray[72] = 1;
        sArray[73] = 4;
        sArray[74] = 4;
        sArray[75] = 57;
        sArray[76] = 1;
        sArray[77] = 3;
        sArray[78] = 5;
        sArray[79] = 6;
        sArray[80] = 7;
        sArray[81] = 1;
        sArray[82] = 57;
        sArray[83] = 45;
        sArray[84] = 57;
        sArray[85] = 46;
        id_break = sArray;
    }

    private static void id_try() {
        boolean[] blArray = new boolean[36];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[24] = true;
        blArray[29] = true;
        id_case = blArray;
    }

    private int id_while() {
        rff_3 rff_32;
        rjG_2 rjG_22;
        this.id_int();
        if (((rrIk_1)this.id_class[id_break[65]]).id_class().booleanValue() && (rjG_22 = (rjG_2)rryy_1.id_import.id_class[id_break[66]]) instanceof rff_3 && ((gm_3)rryy_1.id_import.id_class[id_break[67]]).id_byte((rff_32 = (rff_3)rjG_22).id_class()).id_byte() != QP.id_class) {
            return id_case[24];
        }
        if ((C_volatile)rrTT.id_break[id_break[68]] instanceof rrTT && ((C_volatile)rrTT.id_break[id_break[69]]).id_byte() != null) {
            return id_byte[15];
        }
        return id_case[25];
    }

    private void id_public() {
        rff_3 rff_32;
        this.id_int();
        if (!((rrIk_1)this.id_class[id_break[53]]).id_class().booleanValue()) {
            return;
        }
        Object object = (rjG_2)rryy_1.id_import.id_class[id_break[54]];
        if (object instanceof rff_3 && ((gm_3)rryy_1.id_import.id_class[id_break[55]]).id_byte((rfH_2)(object = (rff_32 = (rff_3)object).id_class())).id_byte() != QP.id_class) {
            if (((cb_3)rryy_1.id_import.id_class[id_break[56]]).ss().id_break() instanceof rxt_3) {
                Integer n = ((rhz_3)((cb_3)rryy_1.id_import.id_class[rryy_1.id_break[57]]).id_implements[rryy_1.id_break[58]]).id_protected;
                this.id_class[rryy_1.id_break[59]] = n;
                int n2 = this.id_goto();
                if (n2 != id_byte[14]) {
                    ((rhz_3)((cb_3)rryy_1.id_import.id_class[rryy_1.id_break[60]]).id_implements[rryy_1.id_break[61]]).id_protected = n2;
                }
            }
            ((Ax_1)rryy_1.id_import.id_class[id_break[62]]).id_class((cb_3)rryy_1.id_import.id_class[id_break[63]], (gm_3)rryy_1.id_import.id_class[id_break[64]], rpm_3.MAIN_HAND, rff_32);
        }
    }

    private int id_protected(int n) {
        this.id_int();
        if (n == id_byte[8]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            ((cb_3)rryy_1.id_import.id_class[id_break[42]]).id_class(rpm_3.MAIN_HAND, id_case[20]);
            return n;
        }
        if (n == id_byte[9]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            ((cb_3)rryy_1.id_import.id_class[id_break[43]]).id_class(rpm_3.OFF_HAND, id_case[21]);
            return n;
        }
        if (n >= 0 && n < id_byte[10]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            ((cb_3)rryy_1.id_import.id_class[id_break[44]]).id_class(rpm_3.MAIN_HAND, id_case[22]);
            rrfo_3.id_class(((rhz_3)((cb_3)rryy_1.id_import.id_class[rryy_1.id_break[45]]).id_implements[rryy_1.id_break[46]]).id_protected);
            return n;
        }
        if (n >= id_byte[11] && n <= id_byte[12]) {
            ((rrfP_2)this.id_class[id_break[47]]).id_class(((rhz_3)((cb_3)rryy_1.id_import.id_class[rryy_1.id_break[48]]).id_implements[rryy_1.id_break[49]]).id_protected);
            ((Ax_1)rryy_1.id_import.id_class[id_break[50]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            ((cb_3)rryy_1.id_import.id_class[id_break[51]]).id_class(rpm_3.MAIN_HAND, id_case[23]);
            Long l = System.currentTimeMillis();
            this.id_class[rryy_1.id_break[52]] = l;
            return n;
        }
        return id_byte[13];
    }

    @Override
    public float id_private() {
        return id_protected[2];
    }

    private static void id_final() {
        id_byte = new byte[]{-1, -1, -1, 2, -1, -1, -1, 8, -2, -3, 9, 9, 36, -1, -1, 2, -1, -1, 9, -1, -1, 9, 2, 3, 4, 5, 6, 7};
    }

    private static void id_synchronized() {
        long[] lArray = new long[2];
        lArray[0] = 200L;
        id_private = lArray;
    }

    @Override
    public boolean aK_() {
        this.id_int();
        Boolean bl = id_case[27];
        this.id_class[rryy_1.id_break[78]] = bl;
        Integer n = id_byte[20];
        this.id_class[rryy_1.id_break[79]] = n;
        Integer n2 = id_case[28];
        this.id_class[rryy_1.id_break[80]] = n2;
        ((rrTT)this.id_class[id_break[81]]).id_final();
        return super.aK_();
    }
}

