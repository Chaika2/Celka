/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AO;
import celestial.C_class;
import celestial.Ps_1;
import celestial.QY;
import celestial.SI;
import celestial.SR;
import celestial.Sw_1;
import celestial.bI_2;
import celestial.ba_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.roQ_2;
import celestial.rrPy_1;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bw_3 {
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    public static Object[] id_break;
    private static short[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[22]];
            objectArray[bw_3.id_byte[23]] = id_protected[10];
        }
    }

    public bw_3(Ps_1 ps_1) {
        this(ps_1, id_protected[0]);
    }

    public bw_3(Ps_1 ps_1, boolean bl) {
        this(ps_1.id_case(), (SR)ps_1.id_package(), bl);
    }

    public bw_3(rYB rYB2, SR sR, boolean bl) {
        this.id_byte();
        Object var8_4 = null;
        this.id_class[bw_3.id_throws[0]] = var8_4;
        Object var9_5 = null;
        this.id_class[bw_3.id_throws[1]] = var9_5;
        rYB rYB3 = rYB2;
        this.id_class[bw_3.id_throws[2]] = rYB3;
        ba_3 ba_32 = new ba_3(rYB2.id_instanceof());
        this.id_class[bw_3.id_throws[3]] = ba_32;
        SR sR2 = sR;
        this.id_class[bw_3.id_throws[4]] = sR2;
        if (bl) {
            AO aO = ((AO)rYB2.id_goto()).id_throws();
            this.id_class[bw_3.id_throws[5]] = aO;
        } else {
            AO aO = (AO)rYB2.id_goto();
            this.id_class[bw_3.id_throws[6]] = aO;
        }
        Boolean bl2 = (Boolean)C_class.id_instanceof().rU.id_class[id_throws[7]] == false ? id_protected[1] : id_protected[2];
        this.id_class[bw_3.id_throws[8]] = bl2;
        if (!QY.id_instanceof().rX()) {
            throw new IllegalStateException();
        }
        rfw_3 rfw_32 = new rfw_3();
        this.id_class[bw_3.id_throws[9]] = rfw_32;
        bI_2 bI_22 = new bI_2(this);
        this.id_class[bw_3.id_throws[10]] = bI_22;
    }

    static {
        bw_3.ntfClinit();
    }

    public boolean id_class(int n, int n2) {
        return ((AO)this.id_class[id_throws[11]]).id_case(n >> id_byte[0], n2 >> id_byte[1]);
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{rrPy_1.id_class};
        id_break = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, 83, -66, 89, -73, 18, -107, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static xc_3 id_class(roJ_2 roJ_22, int n, int n2, int n3) {
        roQ_2 roQ_22 = roJ_22.id_byte()[n2 >> id_byte[18]];
        if (roQ_2.id_class(roQ_22)) {
            return (xc_3)id_break[id_throws[40]];
        }
        return roQ_22.id_class(n & id_byte[19], n2 & id_byte[20], n3 & id_byte[21]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF99E18F760ED91D4L;
    }

    public xc_3 id_class(int n, int n2, int n3) {
        Object object;
        Object object2;
        if (n2 < 0 || n2 >= id_throws[12]) {
            return (xc_3)id_break[id_throws[13]];
        }
        if (((Boolean)this.id_class[id_throws[14]]).booleanValue()) {
            object2 = (roJ_2)this.id_class[id_throws[15]];
            if (object2 != null && ((roJ_2)object2).id_private().id_break == n >> id_byte[2] && ((roJ_2)object2).id_private().id_byte == n3 >> id_byte[3]) {
                return bw_3.id_class((roJ_2)object2, n, n2, n3);
            }
            object = ((AO)this.id_class[id_throws[16]]).id_class(n >> id_byte[4], n3 >> id_byte[5], roN_2.id_volatile, id_protected[3]);
            if (object != null && !((roJ_2)object).id_catch()) {
                roJ_2 roJ_22 = object;
                this.id_class[bw_3.id_throws[17]] = roJ_22;
                return bw_3.id_class((roJ_2)object, n, n2, n3);
            }
        }
        if ((object2 = (Sw_1)this.id_class[id_throws[18]]) == null || ((Sw_1)object2).id_break() != n >> id_byte[6] || ((Sw_1)object2).id_class() != n3 >> id_byte[7]) {
            Object object3;
            if ((SR)this.id_class[id_throws[19]] == null) {
                return (xc_3)id_break[id_throws[20]];
            }
            object = ((SI)((SR)this.id_class[bw_3.id_throws[21]]).id_class[id_throws[22]]).id_throws(n >> id_byte[8], n3 >> id_byte[9]);
            if (object == null) {
                return (xc_3)id_break[id_throws[23]];
            }
            this.id_class[bw_3.id_throws[24]] = object3 = object;
            object2 = object;
        }
        if ((object = ((Sw_1)object2).id_class(n & id_throws[25], n2, n3 & id_throws[26])) == null) {
            return (xc_3)id_break[id_throws[27]];
        }
        return object;
    }

    public xc_3 id_class(rfH_2 rfH_22) {
        return this.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public static xc_3 id_class(Ps_1 ps_1, rfH_2 rfH_22) {
        return new bw_3(ps_1).id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x705CABB5;
    }

    public boolean id_break(int n, int n2) {
        roJ_2 roJ_22 = (roJ_2)this.id_class[id_throws[28]];
        if (roJ_22 != null && roJ_22.id_private().id_break == n >> id_byte[10] && roJ_22.id_private().id_byte == n2 >> id_byte[11]) {
            return id_protected[4];
        }
        roJ_22 = ((AO)this.id_class[id_throws[29]]).id_class(n >> id_byte[12], n2 >> id_byte[13], roN_2.id_volatile, id_protected[5]);
        if (roJ_22 != null && !roJ_22.id_catch()) {
            roJ_2 roJ_23 = roJ_22;
            this.id_class[bw_3.id_throws[30]] = roJ_23;
            return id_protected[6];
        }
        Sw_1 sw_1 = (Sw_1)this.id_class[id_throws[31]];
        if (sw_1 != null && sw_1.id_break() == n >> id_byte[14] && sw_1.id_class() == n2 >> id_byte[15]) {
            return sw_1.id_class(n & id_throws[32], n2 & id_throws[33]);
        }
        if ((SR)this.id_class[id_throws[34]] == null) {
            return id_protected[7];
        }
        sw_1 = ((SI)((SR)this.id_class[bw_3.id_throws[35]]).id_class[id_throws[36]]).id_throws(n >> id_byte[16], n2 >> id_byte[17]);
        if (sw_1 == null) {
            return id_protected[8];
        }
        Sw_1 sw_12 = sw_1;
        this.id_class[bw_3.id_throws[37]] = sw_12;
        return sw_1.id_class(n & id_throws[38], n2 & id_throws[39]);
    }

    public static xd_3 id_break(Ps_1 ps_1, rfH_2 rfH_22) {
        return bw_3.id_class(ps_1, rfH_22).id_break();
    }

    private static void id_break() {
        short[] sArray = new short[41];
        sArray[0] = 6;
        sArray[1] = 7;
        sArray[2] = 2;
        sArray[3] = 5;
        sArray[4] = 1;
        sArray[8] = 8;
        sArray[9] = 3;
        sArray[10] = 4;
        sArray[12] = 256;
        sArray[14] = 8;
        sArray[15] = 6;
        sArray[17] = 6;
        sArray[18] = 7;
        sArray[19] = 1;
        sArray[21] = 1;
        sArray[24] = 7;
        sArray[25] = 511;
        sArray[26] = 511;
        sArray[28] = 6;
        sArray[30] = 6;
        sArray[31] = 7;
        sArray[32] = 511;
        sArray[33] = 511;
        sArray[34] = 1;
        sArray[35] = 1;
        sArray[37] = 7;
        sArray[38] = 511;
        sArray[39] = 511;
        id_throws = sArray;
    }

    private static void id_throws() {
        id_byte = new byte[]{4, 4, 4, 4, 4, 4, 9, 9, 9, 9, 4, 4, 4, 4, 9, 9, 9, 9, 4, 15, 15, 15, 9, 8};
    }

    private static /* synthetic */ void ntfClinit() {
        bw_3.id_protected();
        bw_3.id_break();
        bw_3.id_throws();
        bw_3.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[11] = true;
        id_protected = blArray;
    }
}

