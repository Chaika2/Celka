/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rdy_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfs_3
extends Enum<rrfs_3> {
    public static Object[] staticFieldsaa3157a520ba3b3b82552faf4dacb3c8;
    private static byte[] bytesaa3157a520ba3b3b82552faf4dacb3c8;
    private static boolean[] booleansaa3157a520ba3b3b82552faf4dacb3c8;
    public Object[] fieldsaa3157a520ba3b3b82552faf4dacb3c8;
    private static String[] stringsaa3157a520ba3b3b82552faf4dacb3c8;
    private static short[] shortsaa3157a520ba3b3b82552faf4dacb3c8;

    private static /* synthetic */ rrfs_3[] id_byte() {
        rrfs_3[] rrfs_3Array = new rrfs_3[bytesaa3157a520ba3b3b82552faf4dacb3c8[0]];
        rrfs_3Array[rrfs_3.booleansaa3157a520ba3b3b82552faf4dacb3c8[1]] = (rrfs_3)((Object)staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[shortsaa3157a520ba3b3b82552faf4dacb3c8[5]]);
        rrfs_3Array[rrfs_3.booleansaa3157a520ba3b3b82552faf4dacb3c8[2]] = (rrfs_3)((Object)staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[shortsaa3157a520ba3b3b82552faf4dacb3c8[6]]);
        rrfs_3Array[rrfs_3.bytesaa3157a520ba3b3b82552faf4dacb3c8[1]] = (rrfs_3)((Object)staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[shortsaa3157a520ba3b3b82552faf4dacb3c8[7]]);
        return rrfs_3Array;
    }

    private rrfs_3(String string2) {
        this.id_break();
        String string3 = string2;
        this.fieldsaa3157a520ba3b3b82552faf4dacb3c8[rrfs_3.shortsaa3157a520ba3b3b82552faf4dacb3c8[4]] = string3;
    }

    static {
        rrfs_3.ntfClinit();
    }

    public static rrfs_3[] values() {
        return (rrfs_3[])((rrfs_3[])staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[shortsaa3157a520ba3b3b82552faf4dacb3c8[0]]).clone();
    }

    public static rrfs_3 valueOf(String string) {
        return Enum.valueOf(rrfs_3.class, string);
    }

    public String id_class() {
        return (String)this.fieldsaa3157a520ba3b3b82552faf4dacb3c8[shortsaa3157a520ba3b3b82552faf4dacb3c8[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA5CB3FB78C3A18B5L;
    }

    public static rrfs_3 id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.OB) {
            return null;
        }
        Matcher matcher = ((Pattern)staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[shortsaa3157a520ba3b3b82552faf4dacb3c8[1]]).matcher(rdn_32.id_continue().getString());
        if (matcher.matches()) {
            return (rrfs_3)((Object)((Map)staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[shortsaa3157a520ba3b3b82552faf4dacb3c8[2]]).get(matcher.group(booleansaa3157a520ba3b3b82552faf4dacb3c8[0])));
        }
        return null;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x21273F13;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{73, -38, -86, -7, -73, -3, 29, -35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.fieldsaa3157a520ba3b3b82552faf4dacb3c8 == null) {
            this.fieldsaa3157a520ba3b3b82552faf4dacb3c8 = new Object[1];
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        booleansaa3157a520ba3b3b82552faf4dacb3c8 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfs_3.id_throws();
        rrfs_3.id_catch();
        rrfs_3.id_case();
        rrfs_3.id_protected();
        rrfs_3.id_private();
    }

    private static void id_catch() {
        stringsaa3157a520ba3b3b82552faf4dacb3c8 = new String[]{new String("ONE_X_ONE"), new String("1x1"), new String("THREE_X_THREE"), new String("3x3"), new String("FIVE_X_FIVE"), new String("5x5"), new String("\\[\u2605] \u041f\u0440\u043e\u0433\u0440\u0443\u0437\u0447\u0438\u043a \u0447\u0430\u043d\u043a\u043e\u0432 \\[(\\dx\\d)]")};
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[0] = 6;
        sArray[1] = 4;
        sArray[2] = 5;
        sArray[6] = 1;
        sArray[7] = 2;
        shortsaa3157a520ba3b3b82552faf4dacb3c8 = sArray;
    }

    private static void id_protected() {
        bytesaa3157a520ba3b3b82552faf4dacb3c8 = new byte[]{3, 2, 2, 2, 6, 3, 4, 5, 3, 5, 7};
    }

    private static void id_private() {
        Object[] objectArray = new Object[7];
        objectArray[0] = new rrfs_3(stringsaa3157a520ba3b3b82552faf4dacb3c8[1]);
        objectArray[1] = new rrfs_3(stringsaa3157a520ba3b3b82552faf4dacb3c8[3]);
        objectArray[2] = new rrfs_3(stringsaa3157a520ba3b3b82552faf4dacb3c8[5]);
        objectArray[3] = new rrfs_3[]{(rrfs_3)((Object)objectArray[0]), (rrfs_3)((Object)objectArray[1]), (rrfs_3)((Object)objectArray[2])};
        objectArray[4] = Pattern.compile(stringsaa3157a520ba3b3b82552faf4dacb3c8[6], 0);
        objectArray[6] = new rrfs_3[]{(rrfs_3)((Object)objectArray[0]), (rrfs_3)((Object)objectArray[1]), (rrfs_3)((Object)objectArray[2])};
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(stringsaa3157a520ba3b3b82552faf4dacb3c8[5], objectArray[2]);
        hashMap.put(stringsaa3157a520ba3b3b82552faf4dacb3c8[1], objectArray[0]);
        hashMap.put(stringsaa3157a520ba3b3b82552faf4dacb3c8[3], objectArray[1]);
        objectArray[5] = hashMap;
        staticFieldsaa3157a520ba3b3b82552faf4dacb3c8 = objectArray;
    }
}

