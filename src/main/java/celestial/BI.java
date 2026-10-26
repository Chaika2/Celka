/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BT;
import celestial.Bf_1;
import celestial.Bl_1;
import celestial.Bn_1;
import celestial.Bp_1;
import celestial.Bq_1;
import celestial.Bt_1;
import celestial.Bw_1;
import celestial.C_class;
import celestial.Pv_1;
import celestial.Y;
import celestial.q_1;
import celestial.rja_3;
import celestial.rrLO;
import celestial.rrQX;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrje_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BI
extends Pv_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_break;
    private static String[] id_throws;
    private static byte[] id_case;

    private static void id_byte() {
        short[] sArray = new short[22];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 4;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 3;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[19] = 1;
        id_byte = sArray;
    }

    private boolean id_byte(String string) {
        this.id_class();
        Bt_1 bt_1 = ((Bw_1)this.id_break[id_byte[15]]).id_class(string);
        if (bt_1 == null) {
            return id_protected[0];
        }
        rja_3 rja_32 = null;
        if (bt_1 instanceof Bn_1) {
            Bn_1 bn_1 = (Bn_1)bt_1;
            try {
                rja_32 = bn_1.id_break(string);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return id_protected[1];
            }
            if (rja_32 == null) {
                return id_protected[2];
            }
            bn_1.id_class(rja_32);
        }
        bt_1.id_throws(string);
        if (rja_32 != null) {
            boolean bl = ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_byte[16]])).id_class(rja_32);
            bt_1.id_protected(this.id_class(bt_1.id_throws(), bl));
            if (((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_byte[17]])).id_protected(bt_1.id_throws()) && bl) {
                return id_protected[3];
            }
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[18]]).id_finally().id_class(Bp_1.id_class((Bq_1)((Object)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[id_byte[19]]), bt_1, (BT)((Object)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[id_byte[20]])));
        return id_protected[4];
    }

    public BI(C_class c_class) {
        super(c_class);
        ArrayList arrayList;
        this.id_class();
        Bf_1 bf_1 = new Bf_1();
        this.id_break[BI.id_byte[0]] = bf_1;
        this.id_break[BI.id_byte[1]] = arrayList = new ArrayList();
    }

    static {
        BI.ntfClinit();
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_class();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[11]]) && !((List)this.id_break[id_byte[12]]).isEmpty()) {
            for (String string : this.id_class((List)this.id_break[id_byte[13]]).values()) {
                this.id_byte(string);
            }
            ((List)this.id_break[id_byte[14]]).clear();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB153521B;
    }

    public static boolean id_class(String string, String[] stringArray) {
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = id_protected[12]; i < n; ++i) {
            String string2 = stringArray2[i];
            if (string.contains(string2)) continue;
            return id_protected[13];
        }
        return id_protected[14];
    }

    private Map<Integer, String> id_class(List<String> list) {
        if (list.size() == id_protected[8]) {
            return Map.of(id_protected[9], list.get(id_protected[10]));
        }
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        int n = id_protected[11];
        for (String string : list) {
            Object object = hashMap.get(n) != null ? (String)hashMap.get(n) + " " + string : string;
            if (string.contains(id_throws[0])) {
                hashMap.put(n, (String)object);
                ++n;
                continue;
            }
            hashMap.put(n, (String)object);
        }
        return hashMap;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAA0072EF7B10EDDL;
    }

    @Override
    public void id_class(rrLO rrLO2) {
        this.id_class();
        if (rrLO2.id_class() != null || (rrfq_3)((Object)rrfp_3.id_class[id_byte[2]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[3]]) && (rrfq_3)((Object)rrfp_3.id_class[id_byte[4]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[5]])) {
            return;
        }
        String string = rrLO2.id_protected();
        if (this.id_byte(string)) {
            return;
        }
        if (((Pattern)Bl_1.id_class[id_byte[6]]).matcher(string).find() || ((Pattern)Bl_1.id_class[id_byte[7]]).matcher(string).find() || ((Pattern)Bl_1.id_class[id_byte[8]]).matcher(string).find() || ((Pattern)Bl_1.id_class[id_byte[9]]).matcher(string).find()) {
            ((List)this.id_break[id_byte[10]]).add(string);
        }
    }

    private String id_class(String string, boolean bl) {
        String string2 = string;
        int n = id_protected[5];
        while (((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_byte[21]])).id_protected(string2) && !bl) {
            Object[] objectArray = new Object[id_protected[6]];
            objectArray[BI.id_protected[7]] = ++n;
            string2 = String.format(string + " %d", objectArray);
        }
        return string2;
    }

    private void id_class() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[0]];
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-25, -83, 46, 23, -128, 57, 28, 17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_case = new byte[]{2};
    }

    private static void id_throws() {
        id_throws = new String[]{new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:")};
    }

    private static /* synthetic */ void ntfClinit() {
        BI.id_protected();
        BI.id_throws();
        BI.id_byte();
        BI.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[15];
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[14] = true;
        id_protected = blArray;
    }
}

