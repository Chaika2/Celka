/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAB;
import celestial.rLD;
import celestial.rLY;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfE_2
extends Enum<rrfE_2> {
    private static String[] stringsa1105bf70a073ebb8e16d8de80edaccd;
    private static boolean[] booleansa1105bf70a073ebb8e16d8de80edaccd;
    public static Object[] staticFieldsa1105bf70a073ebb8e16d8de80edaccd;
    private static byte[] bytesa1105bf70a073ebb8e16d8de80edaccd;
    public Object[] fieldsa1105bf70a073ebb8e16d8de80edaccd;
    private static short[] shortsa1105bf70a073ebb8e16d8de80edaccd;

    private static void id_byte() {
        Object[] objectArray = new Object[8];
        staticFieldsa1105bf70a073ebb8e16d8de80edaccd = objectArray;
        rLY[] rLYArray = new rLY[]{new rLY(rLD.id_break, 800, 2, false, true, true, null), new rLY(rLD.id_this, 800, 2), new rLY(rLD.id_super, 800, 2)};
        rrfE_2 rrfE_22 = new rrfE_2(rLYArray);
        rLY[] rLYArray2 = new rLY[]{new rLY(rLD.id_break, 100, 2), new rLY(rLD.id_this, 100, 2), new rLY(rLD.id_super, 100, 2)};
        rrfE_22.id_class().put(Enum.valueOf(rrfq_3.class, "SPOOKY_TIME"), rLYArray2);
        objectArray[0] = rrfE_22;
        rLY[] rLYArray3 = new rLY[]{new rLY(rLD.id_catch, 0, 1), new rLY(rLD.id_break, 480, 2)};
        rrfE_2 rrfE_23 = new rrfE_2(rLYArray3);
        rLY[] rLYArray4 = new rLY[]{new rLY(rLD.id_catch, 1, 1), new rLY(rLD.id_break, 60, 2)};
        rrfE_23.id_class().put(Enum.valueOf(rrfq_3.class, "SPOOKY_TIME"), rLYArray4);
        objectArray[1] = rrfE_23;
        rLY[] rLYArray5 = new rLY[]{new rLY(rLD.id_continue, 480, 2), new rLY(rLD.id_package, 320, 0), new rLY(rLD.id_protected, 320, 0), new rLY(rLD.id_implements, 800, 0)};
        rrfE_2 rrfE_24 = new rrfE_2(rLYArray5);
        rLY[] rLYArray6 = new rLY[]{new rLY(rLD.id_continue, 60, 2), new rLY(rLD.id_package, 40, 0), new rLY(rLD.id_protected, 40, 0), new rLY(rLD.id_implements, 100, 0)};
        rrfE_24.id_class().put(Enum.valueOf(rrfq_3.class, "SPOOKY_TIME"), rLYArray6);
        objectArray[2] = rrfE_24;
        rLY[] rLYArray7 = new rLY[]{new rLY(rLD.id_break, 800, 9), new rLY(rLD.id_protected, 320, 2)};
        rrfE_2 rrfE_25 = new rrfE_2(rLYArray7);
        rLY[] rLYArray8 = new rLY[]{new rLY(rLD.id_break, 100, 8), new rLY(rLD.id_protected, 40, 2)};
        rrfE_25.id_class().put(Enum.valueOf(rrfq_3.class, "SPOOKY_TIME"), rLYArray8);
        objectArray[3] = rrfE_25;
        rLY[] rLYArray9 = new rLY[]{new rLY(rLD.id_class, 800, 4), new rLY(rLD.id_byte, 800, 2), new rLY(rLD.id_package, 480, 0)};
        rrfE_2 rrfE_26 = new rrfE_2(rLYArray9);
        rLY[] rLYArray10 = new rLY[]{new rLY(rLD.id_class, 100, 4), new rLY(rLD.id_byte, 100, 2), new rLY(rLD.id_package, 60, 0)};
        rrfE_26.id_class().put(Enum.valueOf(rrfq_3.class, "SPOOKY_TIME"), rLYArray10);
        objectArray[4] = rrfE_26;
        rLY[] rLYArray11 = new rLY[]{new rLY(rLD.id_break, 1120, 4), new rLY(rLD.id_continue, 1120, 0), new rLY(rLD.id_case, 0, 0)};
        rrfE_2 rrfE_27 = new rrfE_2(rLYArray11);
        rLY[] rLYArray12 = new rLY[]{new rLY(rLD.id_break, 140, 4), new rLY(rLD.id_continue, 140, 0), new rLY(rLD.id_case, 1, 0)};
        rrfE_27.id_class().put(Enum.valueOf(rrfq_3.class, "SPOOKY_TIME"), rLYArray12);
        objectArray[5] = rrfE_27;
        objectArray[6] = new rrfE_2[]{(rrfE_2)((Object)objectArray[0]), (rrfE_2)((Object)objectArray[1]), (rrfE_2)((Object)objectArray[2]), (rrfE_2)((Object)objectArray[3]), (rrfE_2)((Object)objectArray[4]), (rrfE_2)((Object)objectArray[5])};
        objectArray[7] = new rrfE_2[]{(rrfE_2)((Object)objectArray[0]), (rrfE_2)((Object)objectArray[1]), (rrfE_2)((Object)objectArray[2]), (rrfE_2)((Object)objectArray[3]), (rrfE_2)((Object)objectArray[4]), (rrfE_2)((Object)objectArray[5])};
    }

    private rrfE_2(rLY[] rLYArray) {
        rLY[] rLYArray2;
        EnumMap enumMap;
        this.id_throws();
        this.fieldsa1105bf70a073ebb8e16d8de80edaccd[rrfE_2.shortsa1105bf70a073ebb8e16d8de80edaccd[6]] = enumMap = new EnumMap(rrfq_3.class);
        this.fieldsa1105bf70a073ebb8e16d8de80edaccd[rrfE_2.shortsa1105bf70a073ebb8e16d8de80edaccd[7]] = rLYArray2 = rLYArray;
    }

    static {
        rrfE_2.ntfClinit();
    }

    public static rrfE_2[] values() {
        return (rrfE_2[])((rrfE_2[])staticFieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[0]]).clone();
    }

    public static rrfE_2 valueOf(String string) {
        return Enum.valueOf(rrfE_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x86B972D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC629179C45048BFCL;
    }

    public Map<rrfq_3, rLY[]> id_class() {
        return (Map)this.fieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[5]];
    }

    private static boolean id_class(rLY rLY2, rLY rLY3) {
        return rLY2.id_class() == rLY3.id_class() && rLY2.id_break() == rLY3.id_break() && rLY2.id_byte() == rLY3.id_byte() ? booleansa1105bf70a073ebb8e16d8de80edaccd[6] : booleansa1105bf70a073ebb8e16d8de80edaccd[7];
    }

    public static rrfE_2 id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.kz) {
            return null;
        }
        List<rLY> list = rAB.id_class(rdn_32);
        rrfE_2[] rrfE_2Array = (rrfE_2[])staticFieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[4]];
        int n = rrfE_2Array.length;
        for (int i = booleansa1105bf70a073ebb8e16d8de80edaccd[0]; i < n; ++i) {
            rrfE_2 rrfE_22 = rrfE_2Array[i];
            rLY[] rLYArray = rrfE_22.id_break();
            if (rLYArray.length != list.size()) continue;
            boolean bl = booleansa1105bf70a073ebb8e16d8de80edaccd[1];
            for (rLY rLY2 : list) {
                boolean bl2 = booleansa1105bf70a073ebb8e16d8de80edaccd[2];
                rLY[] rLYArray2 = rLYArray;
                int n2 = rLYArray2.length;
                for (int j = booleansa1105bf70a073ebb8e16d8de80edaccd[3]; j < n2; ++j) {
                    rLY rLY3 = rLYArray2[j];
                    if (!rrfE_2.id_class(rLY2, rLY3)) continue;
                    bl2 = booleansa1105bf70a073ebb8e16d8de80edaccd[4];
                    break;
                }
                if (bl2) continue;
                bl = booleansa1105bf70a073ebb8e16d8de80edaccd[5];
                break;
            }
            if (!bl) continue;
            return rrfE_22;
        }
        return null;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{66, 82, 67, 68, 99, 25, 45, -68}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rLY[] id_break() {
        rLY[] rLYArray;
        rrfq_3 rrfq_32 = (rrfq_3)((Object)rrfp_3.id_class[shortsa1105bf70a073ebb8e16d8de80edaccd[1]]);
        if (rrfq_32 != null && (rLYArray = (rLY[])((Map)this.fieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[2]]).get((Object)rrfq_32)) != null) {
            return rLYArray;
        }
        return (rLY[])this.fieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[3]];
    }

    private void id_throws() {
        if (this.fieldsa1105bf70a073ebb8e16d8de80edaccd == null) {
            this.fieldsa1105bf70a073ebb8e16d8de80edaccd = new Object[2];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrfE_2.id_private();
        rrfE_2.id_catch();
        rrfE_2.id_implements();
        rrfE_2.id_case();
        rrfE_2.id_byte();
    }

    private static void id_catch() {
        stringsa1105bf70a073ebb8e16d8de80edaccd = new String[]{new String("AGONIZING_ARROW"), new String("ZEUS_ARROW"), new String("BLOODY_ARROW"), new String("ICING_ARROW"), new String("LIGHT_ARROW"), new String("THERAPY_ARROW")};
    }

    private static void id_case() {
        bytesa1105bf70a073ebb8e16d8de80edaccd = new byte[]{6, 2, 3, 4, 5, 3, 2, 2, 2, 2, 2, 2, 2, 4, 2, 2, 3, 2, 3, 2, 9, 2, 3, 4, 3, 4, 2, 2, 4, 5, 3, 4, 2, 5, 7, 6, 4, 3, 100, 2, 100, 2, 2, 100, 2, 4, 2, 60, 2, 2, 4, 4, 60, 2, 40, 2, 40, 3, 100, 3, 4, 2, 100, 8, 40, 2, 4, 4, 3, 100, 4, 100, 2, 2, 60, 5, 4, 3, 4, 2, 2, 8};
    }

    private static void id_implements() {
        short[] sArray = new short[31];
        sArray[0] = 7;
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 6;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[12] = 4;
        sArray[13] = 5;
        sArray[14] = 800;
        sArray[15] = 800;
        sArray[16] = 800;
        sArray[17] = 480;
        sArray[18] = 480;
        sArray[19] = 320;
        sArray[20] = 320;
        sArray[21] = 800;
        sArray[22] = 800;
        sArray[23] = 320;
        sArray[24] = 800;
        sArray[25] = 800;
        sArray[26] = 480;
        sArray[27] = 1120;
        sArray[28] = 1120;
        sArray[29] = 140;
        sArray[30] = 140;
        shortsa1105bf70a073ebb8e16d8de80edaccd = sArray;
    }

    private static /* synthetic */ rrfE_2[] id_protected() {
        rrfE_2[] rrfE_2Array = new rrfE_2[bytesa1105bf70a073ebb8e16d8de80edaccd[0]];
        rrfE_2Array[rrfE_2.booleansa1105bf70a073ebb8e16d8de80edaccd[8]] = (rrfE_2)((Object)staticFieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[8]]);
        rrfE_2Array[rrfE_2.booleansa1105bf70a073ebb8e16d8de80edaccd[9]] = (rrfE_2)((Object)staticFieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[9]]);
        rrfE_2Array[rrfE_2.bytesa1105bf70a073ebb8e16d8de80edaccd[1]] = (rrfE_2)((Object)staticFieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[10]]);
        rrfE_2Array[rrfE_2.bytesa1105bf70a073ebb8e16d8de80edaccd[2]] = (rrfE_2)((Object)staticFieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[11]]);
        rrfE_2Array[rrfE_2.bytesa1105bf70a073ebb8e16d8de80edaccd[3]] = (rrfE_2)((Object)staticFieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[12]]);
        rrfE_2Array[rrfE_2.bytesa1105bf70a073ebb8e16d8de80edaccd[4]] = (rrfE_2)((Object)staticFieldsa1105bf70a073ebb8e16d8de80edaccd[shortsa1105bf70a073ebb8e16d8de80edaccd[13]]);
        return rrfE_2Array;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[64];
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[26] = true;
        blArray[28] = true;
        blArray[31] = true;
        blArray[36] = true;
        blArray[38] = true;
        blArray[39] = true;
        blArray[40] = true;
        blArray[42] = true;
        blArray[43] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[47] = true;
        blArray[51] = true;
        blArray[53] = true;
        blArray[54] = true;
        blArray[56] = true;
        blArray[58] = true;
        blArray[60] = true;
        blArray[62] = true;
        booleansa1105bf70a073ebb8e16d8de80edaccd = blArray;
    }
}

