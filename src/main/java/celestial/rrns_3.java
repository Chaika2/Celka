/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fu_1;
import celestial.Om_1;
import celestial.rJY;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrns_3
extends Om_1 {
    private static float[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    private static short[] id_case;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1E814A06;
    }

    public rrns_3() {
        this.id_final();
    }

    static {
        rrns_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x735145FCD8D4A896L;
    }

    public static rrns_3 id_class(Fu_1<?> fu_1, List<rJY> list, String string, float f, float f2, int n, int n2) {
        List<rJY> list2;
        Fu_1<?> fu_12;
        ((rrns_3)rrns_3.id_break[rrns_3.id_case[0]]).id_class[rrns_3.id_case[1]] = fu_12 = fu_1;
        ((rrns_3)rrns_3.id_break[rrns_3.id_case[2]]).id_class[rrns_3.id_case[3]] = list2 = list;
        String string2 = string;
        ((rrns_3)rrns_3.id_break[rrns_3.id_case[4]]).id_class[rrns_3.id_case[5]] = string2;
        Float f3 = Float.valueOf(f);
        ((rrns_3)rrns_3.id_break[rrns_3.id_case[6]]).id_class[rrns_3.id_case[7]] = f3;
        Float f4 = Float.valueOf(f2);
        ((rrns_3)rrns_3.id_break[rrns_3.id_case[8]]).id_class[rrns_3.id_case[9]] = f4;
        Integer n3 = n;
        ((rrns_3)rrns_3.id_break[rrns_3.id_case[10]]).id_class[rrns_3.id_case[11]] = n3;
        Integer n4 = n2;
        ((rrns_3)rrns_3.id_break[rrns_3.id_case[12]]).id_class[rrns_3.id_case[13]] = n4;
        ((rrns_3)id_break[id_case[14]]).id_class(id_throws[0]);
        return (rrns_3)id_break[id_case[15]];
    }

    public void id_class(int n) {
        this.id_final();
        Integer n2 = n;
        this.id_class[rrns_3.id_case[25]] = n2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-4, 97, 4, 7, -58, 60, 83, -83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Fu_1<?> id_class() {
        this.id_final();
        return (Fu_1)this.id_class[id_case[16]];
    }

    public void id_class(List<rJY> list) {
        List<rJY> list2;
        this.id_final();
        this.id_class[rrns_3.id_case[23]] = list2 = list;
    }

    public void id_break(int n) {
        this.id_final();
        Integer n2 = n;
        this.id_class[rrns_3.id_case[24]] = n2;
    }

    public float id_break() {
        this.id_final();
        return ((Float)this.id_class[id_case[19]]).floatValue();
    }

    public List<rJY> id_throws() {
        this.id_final();
        return (List)this.id_class[id_case[17]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrns_3.id_extends();
        rrns_3.id_implements();
        rrns_3.id_volatile();
        rrns_3.id_native();
        rrns_3.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new rrns_3()};
        id_break = objectArray;
    }

    public float id_catch() {
        this.id_final();
        return ((Float)this.id_class[id_case[20]]).floatValue();
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[5];
        blArray[4] = true;
        id_throws = blArray;
    }

    public String id_case() {
        this.id_final();
        return (String)this.id_class[id_case[18]];
    }

    private static void id_implements() {
        short[] sArray = new short[26];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[9] = 4;
        sArray[11] = 5;
        sArray[13] = 6;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 4;
        sArray[21] = 5;
        sArray[22] = 6;
        sArray[23] = 1;
        sArray[24] = 5;
        sArray[25] = 6;
        id_case = sArray;
    }

    public int id_protected() {
        this.id_final();
        return (Integer)this.id_class[id_case[21]];
    }

    public int id_private() {
        this.id_final();
        return (Integer)this.id_class[id_case[22]];
    }

    private void id_final() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrns_3.id_protected[1]] = Float.valueOf(id_byte[0]);
            objectArray[rrns_3.id_protected[2]] = Float.valueOf(id_byte[1]);
            objectArray[rrns_3.id_protected[3]] = id_throws[2];
            objectArray[rrns_3.id_protected[4]] = id_throws[3];
        }
    }

    private static void id_volatile() {
        id_byte = new float[2];
    }

    private static void id_native() {
        id_protected = new byte[]{7, 3, 4, 5, 6};
    }
}

