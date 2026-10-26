/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_interface;
import celestial.C_try;
import celestial.EG;
import celestial.EO;
import celestial.EP;
import celestial.Eb_1;
import celestial.Er_1;
import celestial.rrmF_2;
import celestial.rrmH_2;
import celestial.rrmI_2;
import celestial.rrmO_2;
import celestial.rrmW_2;
import celestial.rrmX_2;
import celestial.rrmY_2;
import celestial.rrmf_3;
import celestial.rrmh_3;
import celestial.rrmm_3;
import celestial.rrms_3;
import celestial.rrmw_3;
import celestial.rrua_1;
import celestial.rruf_1;
import celestial.rrug_1;
import celestial.rrut_1;
import celestial.sA_2;
import celestial.sH_2;
import celestial.sK_2;
import celestial.sN_2;
import celestial.sO_2;
import celestial.sR_2;
import celestial.sV_2;
import celestial.sX_2;
import celestial.sY_2;
import celestial.sf_3;
import celestial.sh_3;
import celestial.sj_3;
import celestial.so_3;
import celestial.sp_3;
import celestial.sw_3;
import celestial.sx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sz_3 {
    private static boolean[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        id_byte = sArray;
    }

    private sz_3() {
    }

    static {
        sz_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-23, -98, -37, 85, -61, 114, -69, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2BA3BAF07BA4843DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x15E5242C;
    }

    public static List<C_interface> id_class(C_case c_case) {
        Objects.requireNonNull(c_case);
        C_try[] c_tryArray = new C_try[id_break[0]];
        c_tryArray[sz_3.id_class[0]] = new sV_2(c_case);
        c_tryArray[sz_3.id_class[1]] = new EG(c_case);
        c_tryArray[sz_3.id_break[1]] = new sf_3(c_case);
        c_tryArray[sz_3.id_break[2]] = new sj_3(c_case);
        c_tryArray[sz_3.id_break[3]] = new so_3(c_case);
        c_tryArray[sz_3.id_break[4]] = new sO_2(c_case);
        c_tryArray[sz_3.id_break[5]] = new Er_1(c_case);
        c_tryArray[sz_3.id_break[6]] = new sR_2(c_case);
        c_tryArray[sz_3.id_break[7]] = new sX_2(c_case);
        c_tryArray[sz_3.id_break[8]] = new sw_3(c_case);
        c_tryArray[sz_3.id_break[9]] = new EO(c_case);
        c_tryArray[sz_3.id_break[10]] = new Eb_1(c_case);
        c_tryArray[sz_3.id_break[11]] = new sH_2(c_case);
        c_tryArray[sz_3.id_break[12]] = new sp_3(c_case);
        c_tryArray[sz_3.id_break[13]] = new sK_2(c_case);
        c_tryArray[sz_3.id_break[14]] = new sY_2(c_case);
        c_tryArray[sz_3.id_break[15]] = new sh_3(c_case);
        c_tryArray[sz_3.id_break[16]] = new EP(c_case);
        c_tryArray[sz_3.id_break[17]] = new rruf_1(c_case);
        c_tryArray[sz_3.id_break[18]] = new rrmf_3(c_case);
        c_tryArray[sz_3.id_break[19]] = new rrms_3(c_case);
        c_tryArray[sz_3.id_break[20]] = new rrmX_2(c_case);
        c_tryArray[sz_3.id_break[21]] = new rrmF_2(c_case);
        c_tryArray[sz_3.id_break[22]] = new rrmH_2(c_case);
        c_tryArray[sz_3.id_break[23]] = new rrmm_3(c_case);
        c_tryArray[sz_3.id_break[24]] = new rrmw_3(c_case);
        c_tryArray[sz_3.id_break[25]] = new rrmI_2(c_case);
        c_tryArray[sz_3.id_break[26]] = new rrmO_2(c_case);
        c_tryArray[sz_3.id_break[27]] = new rrug_1(c_case);
        c_tryArray[sz_3.id_break[28]] = new rrmY_2(c_case);
        c_tryArray[sz_3.id_break[29]] = new rrmW_2(c_case);
        c_tryArray[sz_3.id_break[30]] = new rrut_1(c_case);
        c_tryArray[sz_3.id_break[31]] = new rrua_1(c_case);
        c_tryArray[sz_3.id_break[32]] = new rrmh_3(c_case);
        c_tryArray[sz_3.id_break[33]] = new sx_3(c_case);
        c_tryArray[sz_3.id_break[34]] = new sA_2(c_case);
        ArrayList<C_try> arrayList = new ArrayList<C_try>(Arrays.asList(c_tryArray));
        sN_2 sN_22 = new sN_2(c_case);
        arrayList.add((C_try)sN_22.id_class[id_byte[0]]);
        arrayList.add((C_try)sN_22.id_class[id_byte[1]]);
        arrayList.add((C_try)sN_22.id_class[id_byte[2]]);
        arrayList.add((C_try)sN_22.id_class[id_byte[3]]);
        return Collections.unmodifiableList(arrayList);
    }

    private static void id_class() {
        id_break = new byte[]{36, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_class = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sz_3.id_break();
        sz_3.id_byte();
        sz_3.id_class();
    }
}

