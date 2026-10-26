/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rY_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EE
extends Enum<EE> {
    private static boolean[] booleans89d1393b1638388fa783cab6fa7d8b95;
    private static byte[] bytes89d1393b1638388fa783cab6fa7d8b95;
    private static String[] strings89d1393b1638388fa783cab6fa7d8b95;
    public Object[] fields89d1393b1638388fa783cab6fa7d8b95;
    public static Object[] staticFields89d1393b1638388fa783cab6fa7d8b95;
    private static short[] shorts89d1393b1638388fa783cab6fa7d8b95;

    private static void id_byte() {
        Object[] objectArray = new Object[4];
        String[] stringArray = new String[]{strings89d1393b1638388fa783cab6fa7d8b95[1], strings89d1393b1638388fa783cab6fa7d8b95[2]};
        objectArray[0] = new EE(rY_2Array -> rY_2Array, stringArray);
        String[] stringArray2 = new String[]{strings89d1393b1638388fa783cab6fa7d8b95[4], strings89d1393b1638388fa783cab6fa7d8b95[5]};
        objectArray[1] = new EE(rY_2Array -> {
            rY_2[] rY_2Array2 = new rY_2[booleans89d1393b1638388fa783cab6fa7d8b95[7]];
            rY_2Array2[EE.booleans89d1393b1638388fa783cab6fa7d8b95[8]] = rY_2Array[((rY_2[])rY_2Array).length - booleans89d1393b1638388fa783cab6fa7d8b95[9]];
            return rY_2Array2;
        }, stringArray2);
        String[] stringArray3 = new String[]{strings89d1393b1638388fa783cab6fa7d8b95[7], strings89d1393b1638388fa783cab6fa7d8b95[8]};
        objectArray[2] = new EE(rY_2Array -> {
            rY_2[] rY_2Array2 = new rY_2[booleans89d1393b1638388fa783cab6fa7d8b95[4]];
            rY_2Array2[EE.booleans89d1393b1638388fa783cab6fa7d8b95[5]] = rY_2Array[booleans89d1393b1638388fa783cab6fa7d8b95[6]];
            return rY_2Array2;
        }, stringArray3);
        objectArray[3] = new EE[]{(EE)((Object)objectArray[0]), (EE)((Object)objectArray[1]), (EE)((Object)objectArray[2])};
        staticFields89d1393b1638388fa783cab6fa7d8b95 = objectArray;
    }

    private EE(Function<rY_2[], rY_2[]> function, String ... stringArray) {
        String[] stringArray2;
        Function<rY_2[], rY_2[]> function2;
        this.id_case();
        this.fields89d1393b1638388fa783cab6fa7d8b95[EE.shorts89d1393b1638388fa783cab6fa7d8b95[1]] = function2 = function;
        this.fields89d1393b1638388fa783cab6fa7d8b95[EE.shorts89d1393b1638388fa783cab6fa7d8b95[2]] = stringArray2 = stringArray;
    }

    static {
        EE.ntfClinit();
    }

    public static EE[] values() {
        return (EE[])((EE[])staticFields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[0]]).clone();
    }

    public static EE valueOf(String string) {
        return Enum.valueOf(EE.class, string);
    }

    public rY_2[] id_class(rY_2[] rY_2Array) {
        return (rY_2[])((Function)this.fields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[3]]).apply(rY_2Array);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCD2315D70D6D57A9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB4A154B6;
    }

    public static EE id_class(String string) {
        EE[] eEArray = EE.values();
        int n = eEArray.length;
        for (int i = booleans89d1393b1638388fa783cab6fa7d8b95[0]; i < n; ++i) {
            EE eE = eEArray[i];
            String[] stringArray = (String[])eE.fields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[4]];
            int n2 = stringArray.length;
            for (int j = booleans89d1393b1638388fa783cab6fa7d8b95[1]; j < n2; ++j) {
                String string2 = stringArray[j];
                if (!string2.equalsIgnoreCase(string)) continue;
                return eE;
            }
        }
        return null;
    }

    public static String[] id_class() {
        HashSet<String> hashSet = new HashSet<String>();
        EE[] eEArray = EE.values();
        int n = eEArray.length;
        for (int i = booleans89d1393b1638388fa783cab6fa7d8b95[2]; i < n; ++i) {
            EE eE = eEArray[i];
            hashSet.addAll(Arrays.asList((String[])eE.fields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[5]]));
        }
        return hashSet.toArray(new String[booleans89d1393b1638388fa783cab6fa7d8b95[3]]);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-47, -36, 73, -72, 77, 88, -41, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[9];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        shorts89d1393b1638388fa783cab6fa7d8b95 = sArray;
    }

    private static void id_throws() {
        strings89d1393b1638388fa783cab6fa7d8b95 = new String[]{new String("ALL"), new String("all"), new String("a"), new String("NEWEST"), new String("newest"), new String("n"), new String("OLDEST"), new String("oldest"), new String("o")};
    }

    private static /* synthetic */ void ntfClinit() {
        EE.id_catch();
        EE.id_throws();
        EE.id_break();
        EE.id_protected();
        EE.id_byte();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[22];
        blArray[4] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[21] = true;
        booleans89d1393b1638388fa783cab6fa7d8b95 = blArray;
    }

    private void id_case() {
        if (this.fields89d1393b1638388fa783cab6fa7d8b95 == null) {
            Object[] objectArray = this.fields89d1393b1638388fa783cab6fa7d8b95 = new Object[bytes89d1393b1638388fa783cab6fa7d8b95[8]];
        }
    }

    private static void id_protected() {
        bytes89d1393b1638388fa783cab6fa7d8b95 = new byte[]{3, 2, 2, 2, 2, 2, 2, 3, 2, 4};
    }

    private static /* synthetic */ EE[] id_private() {
        EE[] eEArray = new EE[bytes89d1393b1638388fa783cab6fa7d8b95[0]];
        eEArray[EE.booleans89d1393b1638388fa783cab6fa7d8b95[10]] = (EE)((Object)staticFields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[6]]);
        eEArray[EE.booleans89d1393b1638388fa783cab6fa7d8b95[11]] = (EE)((Object)staticFields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[7]]);
        eEArray[EE.bytes89d1393b1638388fa783cab6fa7d8b95[1]] = (EE)((Object)staticFields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[8]]);
        return eEArray;
    }
}

