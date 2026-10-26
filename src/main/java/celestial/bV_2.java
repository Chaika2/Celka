/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_throws;
import celestial.PS;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.V;
import celestial.bD_2;
import celestial.bT_2;
import celestial.bt_3;
import celestial.j_1;
import celestial.rqP_2;
import celestial.rqr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bV_2
extends Pv_1
implements PS {
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    public Object[] id_break;

    private boolean id_byte() {
        Pm_1[] pm_1Array = new Pm_1[id_protected[0]];
        pm_1Array[bV_2.id_byte[3]] = (Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[22]]);
        pm_1Array[bV_2.id_byte[4]] = (Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[23]]);
        pm_1Array[bV_2.id_protected[1]] = (Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[24]]);
        pm_1Array[bV_2.id_protected[2]] = (Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[25]]);
        pm_1Array[bV_2.id_protected[3]] = (Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[26]]);
        Pm_1[] pm_1Array2 = pm_1Array;
        int n = pm_1Array2.length;
        for (int i = id_byte[5]; i < n; ++i) {
            Pm_1 pm_1 = pm_1Array2[i];
            if (!this.id_class(pm_1)) continue;
            return id_byte[6];
        }
        return ((C_class)this.id_class[id_throws[27]]).id_while().id_catch() || (C_class)this.id_class[id_throws[28]] != C_throws.id_class().id_break() ? id_byte[7] : id_byte[8];
    }

    public bV_2(C_class c_class) {
        super(c_class);
        HashMap hashMap;
        this.id_throws();
        this.id_break[bV_2.id_throws[0]] = hashMap = new HashMap();
        bT_2 bT_22 = new bT_2(c_class.id_throw());
        this.id_break[bV_2.id_throws[1]] = bT_22;
        bt_3 bt_32 = new bt_3(c_class.id_throw());
        this.id_break[bV_2.id_throws[2]] = bt_32;
    }

    static {
        bV_2.ntfClinit();
    }

    @Override
    public void id_class() {
        this.id_throws();
        ((Map)this.id_break[id_throws[5]]).clear();
    }

    @Override
    public boolean id_class(Pm_1 pm_1) {
        this.id_throws();
        return pm_1 == null ? id_byte[0] : ((Map)this.id_break[id_throws[3]]).getOrDefault((Object)pm_1, id_byte[1]);
    }

    @Override
    public void id_class(Pm_1 pm_1, boolean bl) {
        this.id_throws();
        ((Map)this.id_break[id_throws[4]]).put(pm_1, bl);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xACC09B8E26ACCDB1L;
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_throws();
        if (j_12.id_class() == (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_throws[6]])) {
            return;
        }
        if (this.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[7]]))) {
            this.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[8]]), id_byte[2]);
        }
        ((bT_2)this.id_break[id_throws[9]]).id_class(this.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[10]])));
        ((bt_3)this.id_break[id_throws[11]]).id_class(this.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[12]])));
        if (this.id_byte()) {
            if (((rqr_3)((Ps_1)this.id_class[bV_2.id_throws[13]]).id_catch().id_break[id_throws[14]]).getClass() != bD_2.class) {
                bD_2 bD_22 = new bD_2(this);
                ((Ps_1)this.id_class[bV_2.id_throws[15]]).id_catch().id_break[bV_2.id_throws[16]] = bD_22;
            }
        } else if (((rqr_3)((Ps_1)this.id_class[bV_2.id_throws[17]]).id_catch().id_break[id_throws[18]]).getClass() == bD_2.class) {
            rqP_2 rqP_22 = new rqP_2((Qw_1)QY.id_instanceof().id_class[id_throws[20]]);
            ((Ps_1)this.id_class[bV_2.id_throws[19]]).id_catch().id_break[bV_2.id_throws[21]] = rqP_22;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x61A37D77;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{105, -64, 47, -29, -78, 112, 87, 88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public bT_2 id_break() {
        this.id_throws();
        return (bT_2)this.id_break[id_throws[29]];
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[4]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        bV_2.id_catch();
        bV_2.id_case();
        bV_2.id_protected();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[9];
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[30];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[6] = 1;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 1;
        sArray[10] = 4;
        sArray[11] = 2;
        sArray[12] = 5;
        sArray[13] = 1;
        sArray[14] = 17;
        sArray[15] = 1;
        sArray[16] = 17;
        sArray[17] = 1;
        sArray[18] = 17;
        sArray[19] = 1;
        sArray[20] = 20;
        sArray[21] = 17;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 3;
        sArray[26] = 7;
        sArray[29] = 1;
        id_throws = sArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{5, 2, 3, 4, 3};
    }
}

