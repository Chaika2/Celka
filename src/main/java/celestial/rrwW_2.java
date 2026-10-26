/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrwQ_2;
import celestial.rrwk_3;
import celestial.rrwz_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwW_2
extends Enum<rrwW_2>
implements MinecraftAccessor {
    private static short[] shortsd828d5c982463367b63d6cc3c26fd998;
    private static String[] stringsd828d5c982463367b63d6cc3c26fd998;
    private static boolean[] booleansd828d5c982463367b63d6cc3c26fd998;
    private static byte[] bytesd828d5c982463367b63d6cc3c26fd998;
    public static Object[] staticFieldsd828d5c982463367b63d6cc3c26fd998;
    public Object[] fieldsd828d5c982463367b63d6cc3c26fd998;

    private void id_byte() {
        if (this.fieldsd828d5c982463367b63d6cc3c26fd998 == null) {
            Object[] objectArray = this.fieldsd828d5c982463367b63d6cc3c26fd998 = new Object[bytesd828d5c982463367b63d6cc3c26fd998[0]];
        }
    }

    private rrwW_2() {
        ArrayList arrayList;
        this.id_byte();
        this.fieldsd828d5c982463367b63d6cc3c26fd998[rrwW_2.shortsd828d5c982463367b63d6cc3c26fd998[1]] = arrayList = new ArrayList();
    }

    static {
        rrwW_2.ntfClinit();
    }

    public static rrwW_2[] values() {
        return (rrwW_2[])((rrwW_2[])staticFieldsd828d5c982463367b63d6cc3c26fd998[shortsd828d5c982463367b63d6cc3c26fd998[0]]).clone();
    }

    public static rrwW_2 valueOf(String string) {
        return Enum.valueOf(rrwW_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFD4F066AC609CE6L;
    }

    public void id_class(C_class c_class) {
        rrwk_3[] rrwk_3Array = new rrwk_3[booleansd828d5c982463367b63d6cc3c26fd998[0]];
        rrwQ_2 rrwQ_22 = new rrwQ_2(c_class);
        this.fieldsd828d5c982463367b63d6cc3c26fd998[rrwW_2.shortsd828d5c982463367b63d6cc3c26fd998[2]] = rrwQ_22;
        rrwk_3Array[rrwW_2.booleansd828d5c982463367b63d6cc3c26fd998[1]] = rrwQ_22;
        this.id_class(rrwk_3Array);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x442A4885;
    }

    public void id_class(rrwk_3 ... rrwk_3Array) {
        ((List)this.fieldsd828d5c982463367b63d6cc3c26fd998[shortsd828d5c982463367b63d6cc3c26fd998[6]]).addAll(List.of(rrwk_3Array));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{40, -110, 47, -93, -18, 110, -120, 85}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class(rrfq_3 rrfq_32) {
        if (id_import.id_finally() || (rrfq_3)((Object)rrfp_3.id_class[shortsd828d5c982463367b63d6cc3c26fd998[3]]) != rrfq_32) {
            return booleansd828d5c982463367b63d6cc3c26fd998[2];
        }
        switch (((int[])rrwz_3.id_class[shortsd828d5c982463367b63d6cc3c26fd998[4]])[rrfq_32.ordinal()]) {
            case 1: {
                return ((rrwQ_2)this.fieldsd828d5c982463367b63d6cc3c26fd998[shortsd828d5c982463367b63d6cc3c26fd998[5]]).id_class();
            }
        }
        return booleansd828d5c982463367b63d6cc3c26fd998[3];
    }

    public rrwQ_2 id_class() {
        return (rrwQ_2)this.fieldsd828d5c982463367b63d6cc3c26fd998[shortsd828d5c982463367b63d6cc3c26fd998[8]];
    }

    public List<rrwk_3> id_break() {
        return (List)this.fieldsd828d5c982463367b63d6cc3c26fd998[shortsd828d5c982463367b63d6cc3c26fd998[7]];
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrwW_2(), new rrwW_2[]{(rrwW_2)objectArray[0]}};
        staticFieldsd828d5c982463367b63d6cc3c26fd998 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwW_2.id_case();
        rrwW_2.id_catch();
        rrwW_2.id_protected();
        rrwW_2.id_private();
        rrwW_2.id_throws();
    }

    private static void id_catch() {
        stringsd828d5c982463367b63d6cc3c26fd998 = new String[]{new String("INSTANCE")};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[4] = true;
        blArray[8] = true;
        booleansd828d5c982463367b63d6cc3c26fd998 = blArray;
    }

    private static /* synthetic */ rrwW_2[] id_implements() {
        rrwW_2[] rrwW_2Array = new rrwW_2[booleansd828d5c982463367b63d6cc3c26fd998[4]];
        rrwW_2Array[rrwW_2.booleansd828d5c982463367b63d6cc3c26fd998[5]] = (rrwW_2)staticFieldsd828d5c982463367b63d6cc3c26fd998[shortsd828d5c982463367b63d6cc3c26fd998[9]];
        return rrwW_2Array;
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[8] = 1;
        shortsd828d5c982463367b63d6cc3c26fd998 = sArray;
    }

    private static void id_private() {
        bytesd828d5c982463367b63d6cc3c26fd998 = new byte[]{2, 2};
    }
}

