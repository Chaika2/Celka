/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lg_1;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.Np_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.ch_3;
import celestial.cm_3;
import celestial.jH_2;
import celestial.rhQ_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrQA;
import celestial.rrQC;
import celestial.rrQk_1;
import celestial.rrQx_1;
import celestial.rrfD_2;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQn_1
extends Lg_1<rrQn_1>
implements AutoCloseable {
    private static String[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static int[] id_protected;
    private static short[] id_throws;
    private static float[] id_case;
    private static byte[] id_catch;
    private static long[] id_private;
    private static boolean[] id_implements;

    public long id_byte() {
        this.id_int();
        return (Long)this.id_class[id_throws[58]];
    }

    private void id_int() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_catch[22]];
            objectArray[rrQn_1.id_catch[23]] = id_private[1];
            objectArray[rrQn_1.id_catch[24]] = id_implements[25];
            objectArray[rrQn_1.id_catch[25]] = id_implements[26];
            objectArray[rrQn_1.id_catch[26]] = id_implements[27];
        }
    }

    public rrQn_1(rrQA rrQA2, QY qY, rrQC rrQC2, rrQx_1 rrQx_12) {
        this.id_int();
        rrQA rrQA3 = rrQA2;
        this.id_class[rrQn_1.id_throws[0]] = rrQA3;
        QY qY2 = qY;
        this.id_class[rrQn_1.id_throws[1]] = qY2;
        rrQC rrQC3 = rrQC2;
        this.id_class[rrQn_1.id_throws[2]] = rrQC3;
        rrQx_1 rrQx_13 = rrQx_12;
        this.id_class[rrQn_1.id_throws[3]] = rrQx_13;
        UUID uUID = ((rrQx_1)this.id_class[id_throws[4]]).id_protected();
        rqO_2 rqO_22 = jH_2.id_class(uUID);
        this.id_class[rrQn_1.id_throws[5]] = rqO_22;
        Boolean bl = jH_2.id_break(uUID).equalsIgnoreCase(id_byte[0]);
        this.id_class[rrQn_1.id_throws[6]] = bl;
    }

    static {
        rrQn_1.ntfClinit();
    }

    public void id_class(int n, int n2) {
        this.id_int();
        try {
            List<rrQx_1> list = ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_throws[46]]).id_class();
            rrQx_1 rrQx_12 = list.get(n);
            list.set(n, list.get(n2));
            list.set(n2, rrQx_12);
            List<rrQn_1> list2 = ((rrQA)this.id_class[id_throws[47]]).x_();
            rrQn_1 rrQn_12 = (rrQn_1)rrQA.id_byte((rrQA)this.id_class[id_throws[48]], n);
            list2.set(n, (rrQn_1)rrQA.id_break((rrQA)this.id_class[id_throws[49]], n2));
            list2.set(n2, rrQn_12);
            rrQn_1 rrQn_13 = (rrQn_1)rrQA.id_class((rrQA)this.id_class[id_throws[50]], n2);
            ((rrQA)this.id_class[id_throws[51]]).id_class(rrQn_13);
            rrQA.id_class((rrQA)this.id_class[id_throws[52]], rrQn_13);
            ((Lu_1)((rrQC)this.id_class[rrQn_1.id_throws[53]]).id_class[id_throws[54]]).id_byte(id_implements[23]);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.id_int();
        Boolean bl2 = id_implements[0];
        this.id_class[rrQn_1.id_throws[7]] = bl2;
        Boolean bl3 = id_implements[1];
        this.id_class[rrQn_1.id_throws[8]] = bl3;
        rrQx_1 rrQx_12 = (rrQx_1)this.id_class[id_throws[9]];
        int n8 = id_protected[0];
        if (rrQx_12.id_class().equals(((QY)this.id_class[id_throws[10]]).id_while().id_byte())) {
            n8 = id_protected[1];
        }
        rrfD_2.id_class(ml_1, (rqO_2)this.id_class[id_throws[11]], ((Qw_1)((QY)this.id_class[rrQn_1.id_throws[12]]).id_class[id_throws[13]]).id_break(rhQ_2.HAT), (float)n3, (float)n2, id_catch[0], (int)id_catch[1], id_case[0]);
        ((cm_3)((QY)this.id_class[rrQn_1.id_throws[14]]).id_class[id_throws[15]]).id_break(ml_1, rrQx_12.id_class(), (float)(n3 + id_catch[2] + id_catch[3]), (float)(n2 + id_catch[4]), n8);
        if (bl) {
            ch_3.id_class(ml_1, n3, n2, n3 + id_catch[5], n2 + id_catch[6], id_protected[2]);
        }
        if (this == ((rrQA)this.id_class[id_throws[16]]).id_finally()) {
            boolean bl4;
            ((QY)this.id_class[id_throws[17]]).A().id_class((rqO_2)id_break[id_throws[18]]);
            RenderSystem.color4f(id_case[1], id_case[2], id_case[3], id_case[4]);
            boolean bl5 = n + id_implements[2] < ((rrQA)this.id_class[id_throws[19]]).id_this().size() ? id_implements[3] : id_implements[4];
            boolean bl6 = bl4 = n > 0 ? id_implements[5] : id_implements[6];
            if (bl5) {
                Boolean bl7 = bl && n6 > n3 + n4 - id_catch[7] && n6 < n3 + n4 - id_catch[8] ? id_implements[7] : id_implements[8];
                this.id_class[rrQn_1.id_throws[20]] = bl7;
                ch_3.id_class(ml_1, n3 + n4 - id_catch[9], n2 - id_catch[10], id_case[5], (Boolean)this.id_class[id_throws[21]] != false ? id_case[6] : id_case[7], (int)id_catch[11], (int)id_catch[12], (int)id_throws[22], (int)id_throws[23]);
            }
            if (bl4) {
                Boolean bl8 = bl && n6 > n3 + n4 - (bl5 ? id_catch[13] : id_catch[14]) && n6 < n3 + n4 - (bl5 ? id_catch[15] : id_catch[16]) ? id_implements[9] : id_implements[10];
                this.id_class[rrQn_1.id_throws[24]] = bl8;
                ch_3.id_class(ml_1, n3 + n4 - (bl5 ? id_catch[17] : id_catch[18]), n2 - id_catch[19], id_case[8], (Boolean)this.id_class[id_throws[25]] != false ? id_case[9] : id_case[10], (int)id_catch[20], (int)id_catch[21], (int)id_throws[26], (int)id_throws[27]);
            }
        }
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_int();
        if (vm_3.id_synchronized()) {
            List list = ((rrQA)this.id_class[id_throws[39]]).x_();
            int n4 = list.indexOf(this);
            if (n == id_throws[40] && n4 < list.size() - id_implements[17]) {
                this.id_class(n4, n4 + id_implements[18]);
                return id_implements[19];
            }
            if (n == id_throws[41] && n4 > 0) {
                this.id_class(n4, n4 - id_implements[20]);
                return id_implements[21];
            }
        } else if (n == id_throws[42] || n == id_throws[43]) {
            ((rrQC)this.id_class[id_throws[44]]).id_class(this.id_private());
            ((QY)this.id_class[id_throws[45]]).c().id_class(Np_1.id_class(rqn_3.dw, id_case[12]));
            return id_implements[22];
        }
        return super.id_class(n, n2, n3);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{32, -33, 9, 94, 26, 11, 88, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAFC1A2A9C4871F9BL;
    }

    public boolean id_class() {
        this.id_int();
        return (Boolean)this.id_class[id_throws[60]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2D394E43;
    }

    @Override
    public void close() {
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_int();
        ((rrQA)this.id_class[id_throws[28]]).id_class(this);
        ((rrQC)this.id_class[id_throws[29]]).id_byte(((rrQA)this.id_class[id_throws[30]]).id_private().isPresent());
        if (n == 0) {
            List list = ((rrQA)this.id_class[id_throws[31]]).id_this();
            int n2 = list.indexOf(this);
            if (((Boolean)this.id_class[id_throws[32]]).booleanValue() && n2 + id_implements[11] < list.size()) {
                this.id_class(n2, n2 + id_implements[12]);
                return id_implements[13];
            }
            if (((Boolean)this.id_class[id_throws[33]]).booleanValue() && n2 > 0) {
                this.id_class(n2, n2 - id_implements[14]);
                return id_implements[15];
            }
            if (rqR_2.id_break() - (Long)this.id_class[id_throws[34]] < id_private[0]) {
                ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_throws[35]]).id_class((rrQx_1)this.id_class[id_throws[36]]);
                ((QY)this.id_class[id_throws[37]]).c().id_class(Np_1.id_class(rqn_3.dw, id_case[11]));
                return id_implements[16];
            }
            Long l = rqR_2.id_break();
            this.id_class[rrQn_1.id_throws[38]] = l;
        }
        return super.id_break(d, d2, n);
    }

    public rqO_2 id_break() {
        this.id_int();
        return (rqO_2)this.id_class[id_throws[59]];
    }

    public boolean id_throws() {
        this.id_int();
        return (Boolean)this.id_class[id_throws[61]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrQn_1.id_new();
        rrQn_1.id_native();
        rrQn_1.id_implements();
        rrQn_1.id_final();
        rrQn_1.id_volatile();
        rrQn_1.id_extends();
        rrQn_1.id_package();
        rrQn_1.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new rqO_2("minecraft", id_byte[1]), 12};
        id_break = objectArray;
    }

    public QY id_catch() {
        this.id_int();
        return (QY)this.id_class[id_throws[55]];
    }

    private static void id_extends() {
        id_catch = new byte[]{12, 12, 12, 3, 2, 12, 12, 16, 6, 35, 18, 32, 32, 31, 20, 17, 6, 31, 20, 3, 32, 32, 9, 3, 5, 6, 7, 2, 12};
    }

    public boolean id_case() {
        this.id_int();
        return (Boolean)this.id_class[id_throws[62]];
    }

    private static void id_implements() {
        long[] lArray = new long[2];
        lArray[0] = 250L;
        id_private = lArray;
    }

    private static void id_new() {
        boolean[] blArray = new boolean[29];
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[28] = true;
        id_implements = blArray;
    }

    private static void id_package() {
        id_protected = new int[]{0xFFFFFF, 65280, -1601138544};
    }

    public rrQC id_protected() {
        this.id_int();
        return (rrQC)this.id_class[id_throws[57]];
    }

    public rrQx_1 id_private() {
        this.id_int();
        return (rrQx_1)this.id_class[id_throws[56]];
    }

    private static void id_final() {
        short[] sArray = new short[63];
        sArray[0] = 8;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[7] = 6;
        sArray[8] = 7;
        sArray[9] = 1;
        sArray[11] = 4;
        sArray[13] = 20;
        sArray[15] = 15;
        sArray[16] = 8;
        sArray[19] = 8;
        sArray[20] = 6;
        sArray[21] = 6;
        sArray[22] = 256;
        sArray[23] = 256;
        sArray[24] = 7;
        sArray[25] = 7;
        sArray[26] = 256;
        sArray[27] = 256;
        sArray[28] = 8;
        sArray[29] = 2;
        sArray[30] = 8;
        sArray[31] = 8;
        sArray[32] = 6;
        sArray[33] = 7;
        sArray[34] = 3;
        sArray[36] = 1;
        sArray[38] = 3;
        sArray[39] = 8;
        sArray[40] = 264;
        sArray[41] = 265;
        sArray[42] = 261;
        sArray[43] = 259;
        sArray[44] = 2;
        sArray[47] = 8;
        sArray[48] = 8;
        sArray[49] = 8;
        sArray[50] = 8;
        sArray[51] = 8;
        sArray[52] = 8;
        sArray[53] = 2;
        sArray[54] = 4;
        sArray[56] = 1;
        sArray[57] = 2;
        sArray[58] = 3;
        sArray[59] = 4;
        sArray[60] = 5;
        sArray[61] = 6;
        sArray[62] = 7;
        id_throws = sArray;
    }

    private static void id_volatile() {
        float[] fArray = new float[13];
        fArray[0] = 1.0f;
        fArray[1] = 1.0f;
        fArray[2] = 1.0f;
        fArray[3] = 1.0f;
        fArray[4] = 1.0f;
        fArray[5] = 48.0f;
        fArray[6] = 32.0f;
        fArray[8] = 96.0f;
        fArray[9] = 32.0f;
        fArray[11] = 1.0f;
        fArray[12] = 1.0f;
        id_case = fArray;
    }

    private static void id_native() {
        id_byte = new String[]{new String("slim"), new String("textures/gui/server_selection.png")};
    }
}

