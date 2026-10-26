/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.A;
import celestial.C;
import celestial.C_class;
import celestial.C_throws;
import celestial.H;
import celestial.I;
import celestial.PP;
import celestial.SR;
import celestial.SY;
import celestial.T;
import celestial.U;
import celestial.V;
import celestial.Y;
import celestial.bw_3;
import celestial.e_1;
import celestial.event.PacketEvent;
import celestial.f_1;
import celestial.g_1;
import celestial.j_1;
import celestial.l_1;
import celestial.q_1;
import celestial.rYB;
import celestial.roJ_2;
import celestial.rrAH;
import celestial.rrAK;
import celestial.rrAM;
import celestial.rrAN;
import celestial.rrAO;
import celestial.rrAQ;
import celestial.rrAS;
import celestial.rrAT;
import celestial.rrAX;
import celestial.rrAZ;
import celestial.rrAc_1;
import celestial.rrAg_1;
import celestial.rrAl_1;
import celestial.rrAo_1;
import celestial.rrAq_1;
import celestial.rrAz_1;
import celestial.rrFK;
import celestial.rrFU;
import celestial.rrFY;
import celestial.rrFe_1;
import celestial.rrFf_1;
import celestial.rrFi_1;
import celestial.rrFj_1;
import celestial.rrFo_1;
import celestial.rrFw_1;
import celestial.rrLC;
import celestial.rrLE;
import celestial.rrLF;
import celestial.rrLI;
import celestial.rrLO;
import celestial.rrLU;
import celestial.rrLV;
import celestial.rrLX;
import celestial.rrLa_1;
import celestial.rrLc_1;
import celestial.rrLf_1;
import celestial.rrLh_1;
import celestial.rrLm_1;
import celestial.rrLp_1;
import celestial.rrLs_1;
import celestial.rrLu_1;
import celestial.rrLv_1;
import celestial.rrLx_1;
import celestial.rrLz_1;
import celestial.rrnB_2;
import celestial.rrnG_2;
import celestial.rrnM_2;
import celestial.rrnd_3;
import celestial.rrns_3;
import celestial.t_1;
import celestial.y_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ed_1
implements PP,
U {
    private static byte[] id_break;
    public Object[] id_class;
    private static boolean[] id_throws;
    private static short[] id_case;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public Ed_1(C_class c_class) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.id_byte();
        this.id_class[Ed_1.id_case[0]] = copyOnWriteArrayList = new CopyOnWriteArrayList();
        C_class c_class2 = c_class;
        this.id_class[Ed_1.id_case[1]] = c_class2;
    }

    static {
        Ed_1.ntfClinit();
    }

    @Override
    public void id_class(q_1 q_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[11]]) {
            e_12.id_class(q_12);
        }
    }

    @Override
    public void id_class(rrAO rrAO2) {
        for (e_1 e_12 : (List)this.id_class[id_case[57]]) {
            e_12.id_class(rrAO2);
        }
    }

    @Override
    public void id_class(rrAM rrAM2) {
        for (e_1 e_12 : (List)this.id_class[id_case[49]]) {
            e_12.id_class(rrAM2);
        }
    }

    @Override
    public void id_class(j_1 j_12) {
        if (j_12.id_class() == (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_case[2]])) {
            if (C_throws.id_byte().id_void().id_throws() != null) {
                try {
                    bw_3 bw_32 = new bw_3(((C_class)this.id_class[id_case[4]]).id_throw(), id_throws[0]);
                    ((C_class)this.id_class[Ed_1.id_case[3]]).id_break[Ed_1.id_case[5]] = bw_32;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    Object var9_5 = null;
                    ((C_class)this.id_class[Ed_1.id_case[6]]).id_break[Ed_1.id_case[7]] = var9_5;
                }
            }
        } else {
            Object var10_6 = null;
            ((C_class)this.id_class[Ed_1.id_case[8]]).id_break[Ed_1.id_case[9]] = var10_6;
        }
        for (e_1 e_12 : (List)this.id_class[id_case[10]]) {
            e_12.id_class(j_12);
        }
    }

    @Override
    public void id_class(rrAc_1 rrAc_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[48]]) {
            e_12.id_class(rrAc_12);
        }
    }

    @Override
    public void id_class(rrFf_1 rrFf_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[44]]) {
            e_12.id_class(rrFf_12);
        }
    }

    @Override
    public void id_class(A a) {
        for (e_1 e_12 : (List)this.id_class[id_case[32]]) {
            e_12.id_class(a);
        }
    }

    @Override
    public void id_class(rrAN rrAN2) {
        for (e_1 e_12 : (List)this.id_class[id_case[46]]) {
            e_12.id_class(rrAN2);
        }
    }

    @Override
    public void id_class(I i) {
        for (e_1 e_12 : (List)this.id_class[id_case[31]]) {
            e_12.id_class(i);
        }
    }

    @Override
    public void id_class(rrnd_3 rrnd_32) {
        for (e_1 e_12 : (List)this.id_class[id_case[70]]) {
            e_12.id_class(rrnd_32);
        }
    }

    @Override
    public void id_class(rrAT rrAT2) {
        for (e_1 e_12 : (List)this.id_class[id_case[51]]) {
            e_12.id_class(rrAT2);
        }
    }

    @Override
    public void id_class(e_1 e_12) {
        ((List)this.id_class[id_case[83]]).add(e_12);
    }

    @Override
    public void id_class(l_1 l_12) {
        boolean bl;
        Y y = l_12.id_protected();
        H h = l_12.id_break();
        boolean bl2 = y == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[16]]) && (h == (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[id_case[17]]) || h == (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[id_case[18]])) ? id_throws[1] : id_throws[2];
        rYB rYB2 = ((C_class)this.id_class[id_case[19]]).id_throw().id_case();
        boolean bl3 = bl = y == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[20]]) && h == (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[id_case[21]]) && rYB2.id_goto().id_break(l_12.id_byte(), l_12.id_class(), null, id_throws[3]) != null ? id_throws[4] : id_throws[5];
        if (bl2 || bl) {
            ((C_class)this.id_class[id_case[22]]).id_strictfp().id_class((SR sR) -> {
                roJ_2 roJ_22 = rYB2.id_throws(l_12.id_byte(), l_12.id_class());
                sR.id_break().id_class(roJ_22);
            });
        }
        for (e_1 e_12 : (List)this.id_class[id_case[23]]) {
            e_12.id_class(l_12);
        }
    }

    @Override
    public void id_class(rrLX rrLX2) {
        for (e_1 e_12 : (List)this.id_class[id_case[66]]) {
            e_12.id_class(rrLX2);
        }
    }

    @Override
    public void id_class(f_1 f_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[15]]) {
            e_12.id_class(f_12);
        }
    }

    @Override
    public void id_class(rrLV rrLV2) {
        for (e_1 e_12 : (List)this.id_class[id_case[81]]) {
            e_12.id_class(rrLV2);
        }
    }

    @Override
    public void id_class(rrLm_1 rrLm_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[65]]) {
            e_12.id_class(rrLm_12);
        }
    }

    @Override
    public void id_class(rrFi_1 rrFi_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[69]]) {
            e_12.id_class(rrFi_12);
        }
    }

    @Override
    public void id_class(rrnG_2 rrnG_22) {
        for (e_1 e_12 : (List)this.id_class[id_case[80]]) {
            e_12.id_class(rrnG_22);
        }
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[55]]) {
            e_12.id_class(rrLu_12);
        }
    }

    @Override
    public void id_class(rrAK rrAK2) {
        for (e_1 e_12 : (List)this.id_class[id_case[56]]) {
            e_12.id_class(rrAK2);
        }
    }

    @Override
    public void id_class(rrLF rrLF2) {
        for (e_1 e_12 : (List)this.id_class[id_case[78]]) {
            e_12.id_class(rrLF2);
        }
    }

    @Override
    public void id_class(rrAH rrAH2) {
        for (e_1 e_12 : (List)this.id_class[id_case[72]]) {
            e_12.id_class(rrAH2);
        }
    }

    @Override
    public void id_class(rrnM_2 rrnM_22) {
        for (e_1 e_12 : (List)this.id_class[id_case[40]]) {
            e_12.id_class(rrnM_22);
        }
    }

    @Override
    public void id_class(t_1 t_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[30]]) {
            e_12.id_class(t_12);
        }
    }

    @Override
    public void id_class(rrFj_1 rrFj_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[43]]) {
            e_12.id_class(rrFj_12);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x30C6F786;
    }

    @Override
    public void id_class(PacketEvent packetEvent) {
        for (e_1 e_12 : (List)this.id_class[id_case[71]]) {
            e_12.id_class(packetEvent);
        }
    }

    @Override
    public void id_class(rrLE rrLE2) {
        for (e_1 e_12 : (List)this.id_class[id_case[60]]) {
            e_12.id_class(rrLE2);
        }
    }

    @Override
    public void id_class(rrAo_1 rrAo_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[62]]) {
            e_12.id_class(rrAo_12);
        }
    }

    @Override
    public void id_class(rrLI rrLI2) {
        for (e_1 e_12 : (List)this.id_class[id_case[47]]) {
            e_12.id_class(rrLI2);
        }
    }

    @Override
    public void id_class(rrLz_1 rrLz_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[75]]) {
            e_12.id_class(rrLz_12);
        }
    }

    @Override
    public void id_class(rrLv_1 rrLv_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[77]]) {
            e_12.id_class(rrLv_12);
        }
    }

    @Override
    public void id_class(rrns_3 rrns_32) {
        for (e_1 e_12 : (List)this.id_class[id_case[36]]) {
            e_12.id_class(rrns_32);
        }
    }

    @Override
    public void id_class(rrAg_1 rrAg_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[82]]) {
            e_12.id_class(rrAg_12);
        }
    }

    @Override
    public void id_class(rrAS rrAS2) {
        for (e_1 e_12 : (List)this.id_class[id_case[74]]) {
            e_12.id_class(rrAS2);
        }
    }

    @Override
    public void id_class(rrLa_1 rrLa_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[76]]) {
            e_12.id_class(rrLa_12);
        }
    }

    @Override
    public void id_class(rrAQ rrAQ2) {
        for (e_1 e_12 : (List)this.id_class[id_case[42]]) {
            e_12.id_class(rrAQ2);
        }
    }

    @Override
    public void id_class(rrAq_1 rrAq_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[50]]) {
            e_12.id_class(rrAq_12);
        }
    }

    @Override
    public void id_class(rrLc_1 rrLc_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[64]]) {
            e_12.id_class(rrLc_12);
        }
    }

    @Override
    public void id_class(rrLf_1 rrLf_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[58]]) {
            e_12.id_class(rrLf_12);
        }
    }

    @Override
    public void id_class(rrLC rrLC2) {
        for (e_1 e_12 : (List)this.id_class[id_case[45]]) {
            e_12.id_class(rrLC2);
        }
    }

    @Override
    public void id_class(rrnB_2 rrnB_22) {
        for (e_1 e_12 : (List)this.id_class[id_case[61]]) {
            e_12.id_class(rrnB_22);
        }
    }

    @Override
    public void id_class(rrAz_1 rrAz_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[34]]) {
            e_12.id_class(rrAz_12);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-70, -113, 6, -81, 63, 51, -15, 23}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(y_1 y_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[29]]) {
            e_12.id_class(y_12);
        }
    }

    @Override
    public void id_class(rrAZ rrAZ2) {
        for (e_1 e_12 : (List)this.id_class[id_case[52]]) {
            e_12.id_class(rrAZ2);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB378B23DE12BDE55L;
    }

    @Override
    public void id_class(rrFU rrFU2) {
        for (e_1 e_12 : (List)this.id_class[id_case[59]]) {
            e_12.id_class(rrFU2);
        }
    }

    @Override
    public void id_class(rrAX rrAX2) {
        for (e_1 e_12 : (List)this.id_class[id_case[35]]) {
            e_12.id_class(rrAX2);
        }
    }

    @Override
    public void id_class(rrFw_1 rrFw_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[41]]) {
            e_12.id_class(rrFw_12);
        }
    }

    @Override
    public void id_class(rrLs_1 rrLs_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[79]]) {
            e_12.id_class(rrLs_12);
        }
    }

    @Override
    public void id_class(C c) {
        for (e_1 e_12 : (List)this.id_class[id_case[12]]) {
            e_12.id_class(c);
        }
    }

    @Override
    public void id_class(rrFY rrFY2) {
        for (e_1 e_12 : (List)this.id_class[id_case[63]]) {
            e_12.id_class(rrFY2);
        }
    }

    @Override
    public void id_class(rrLh_1 rrLh_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[13]]) {
            e_12.id_class(rrLh_12);
        }
    }

    @Override
    public void id_class(g_1 g_12) {
        SY sY = ((C_class)this.id_class[id_case[25]]).id_strictfp();
        if (g_12.id_break() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[26]])) {
            sY.id_break();
            if (g_12.id_class() != null) {
                sY.id_class(g_12.id_class().E());
            }
        }
        for (e_1 e_12 : (List)this.id_class[id_case[27]]) {
            e_12.id_class(g_12);
        }
    }

    public List<e_1> id_class() {
        return (List)this.id_class[id_case[85]];
    }

    @Override
    public void id_class(rrLU rrLU2) {
        for (e_1 e_12 : (List)this.id_class[id_case[53]]) {
            e_12.id_class(rrLU2);
        }
    }

    @Override
    public void id_class(rrLO rrLO2) {
        for (e_1 e_12 : (List)this.id_class[id_case[14]]) {
            e_12.id_class(rrLO2);
        }
    }

    @Override
    public void id_class(rrAl_1 rrAl_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[39]]) {
            e_12.id_class(rrAl_12);
        }
    }

    @Override
    public void id_class(rrLx_1 rrLx_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[67]]) {
            e_12.id_class(rrLx_12);
        }
    }

    @Override
    public void id_class(rrFe_1 rrFe_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[68]]) {
            e_12.id_class(rrFe_12);
        }
    }

    @Override
    public void id_class(rrFK rrFK2) {
        for (e_1 e_12 : (List)this.id_class[id_case[38]]) {
            e_12.id_class(rrFK2);
        }
    }

    @Override
    public void id_class(T t) {
        for (e_1 e_12 : (List)this.id_class[id_case[24]]) {
            e_12.id_class(t);
        }
    }

    @Override
    public void id_class(rrFo_1 rrFo_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[54]]) {
            e_12.id_class(rrFo_12);
        }
    }

    @Override
    public void id_class(rrLp_1 rrLp_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[73]]) {
            e_12.id_class(rrLp_12);
        }
    }

    @Override
    public void id_break(y_1 y_12) {
        for (e_1 e_12 : (List)this.id_class[id_case[28]]) {
            e_12.id_break(y_12);
        }
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[1] = true;
        blArray[4] = true;
        id_throws = blArray;
    }

    @Override
    public void id_break(e_1 e_12) {
        ((List)this.id_class[id_case[84]]).remove(e_12);
    }

    private static void id_throws() {
        short[] sArray = new short[86];
        sArray[0] = 1;
        sArray[5] = 34;
        sArray[7] = 34;
        sArray[9] = 34;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[21] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[26] = 1;
        sArray[27] = 1;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[30] = 1;
        sArray[31] = 1;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[34] = 1;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[37] = 1;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[40] = 1;
        sArray[41] = 1;
        sArray[42] = 1;
        sArray[43] = 1;
        sArray[44] = 1;
        sArray[45] = 1;
        sArray[46] = 1;
        sArray[47] = 1;
        sArray[48] = 1;
        sArray[49] = 1;
        sArray[50] = 1;
        sArray[51] = 1;
        sArray[52] = 1;
        sArray[53] = 1;
        sArray[54] = 1;
        sArray[55] = 1;
        sArray[56] = 1;
        sArray[57] = 1;
        sArray[58] = 1;
        sArray[59] = 1;
        sArray[60] = 1;
        sArray[61] = 1;
        sArray[62] = 1;
        sArray[63] = 1;
        sArray[64] = 1;
        sArray[65] = 1;
        sArray[66] = 1;
        sArray[67] = 1;
        sArray[68] = 1;
        sArray[69] = 1;
        sArray[70] = 1;
        sArray[71] = 1;
        sArray[72] = 1;
        sArray[73] = 1;
        sArray[74] = 1;
        sArray[75] = 1;
        sArray[76] = 1;
        sArray[77] = 1;
        sArray[78] = 1;
        sArray[79] = 1;
        sArray[80] = 1;
        sArray[81] = 1;
        sArray[82] = 1;
        sArray[83] = 1;
        sArray[84] = 1;
        sArray[85] = 1;
        id_case = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Ed_1.id_break();
        Ed_1.id_throws();
        Ed_1.id_protected();
    }

    private static void id_protected() {
        id_break = new byte[]{2};
    }

    @Override
    public void id_volatile() {
        for (e_1 e_12 : (List)this.id_class[id_case[33]]) {
            e_12.id_volatile();
        }
    }

    @Override
    public void id_native() {
        for (e_1 e_12 : (List)this.id_class[id_case[37]]) {
            e_12.id_native();
        }
    }
}

