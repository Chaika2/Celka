/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.manager.FontManager;
import celestial.rrTB;
import celestial.rrTJ;
import celestial.rrTO;
import celestial.rrTS;
import celestial.rrTX;
import celestial.rrTd_1;
import celestial.rrTh_1;
import celestial.rrTk_1;
import celestial.rrTx_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTs_1
extends Enum<rrTs_1> {
    public Object[] fields535ba6477b2d307ba91b4de7d306c5df;
    private static byte[] bytes535ba6477b2d307ba91b4de7d306c5df;
    private static boolean[] booleans535ba6477b2d307ba91b4de7d306c5df;
    private static short[] shorts535ba6477b2d307ba91b4de7d306c5df;
    public static Object[] staticFields535ba6477b2d307ba91b4de7d306c5df;
    private static String[] strings535ba6477b2d307ba91b4de7d306c5df;

    private static /* synthetic */ rrTs_1[] id_byte() {
        rrTs_1[] rrTs_1Array = new rrTs_1[booleans535ba6477b2d307ba91b4de7d306c5df[2]];
        rrTs_1Array[rrTs_1.booleans535ba6477b2d307ba91b4de7d306c5df[3]] = (rrTs_1)((Object)staticFields535ba6477b2d307ba91b4de7d306c5df[shorts535ba6477b2d307ba91b4de7d306c5df[7]]);
        return rrTs_1Array;
    }

    private rrTs_1() {
        ArrayList arrayList;
        this.id_finally();
        this.fields535ba6477b2d307ba91b4de7d306c5df[rrTs_1.shorts535ba6477b2d307ba91b4de7d306c5df[1]] = arrayList = new ArrayList();
        this.id_implements();
    }

    static {
        rrTs_1.ntfClinit();
    }

    public static rrTs_1[] values() {
        return (rrTs_1[])((rrTs_1[])staticFields535ba6477b2d307ba91b4de7d306c5df[shorts535ba6477b2d307ba91b4de7d306c5df[0]]).clone();
    }

    public static rrTs_1 valueOf(String string) {
        return Enum.valueOf(rrTs_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4256E839;
    }

    public List<rrTB> id_class() {
        return (List)this.fields535ba6477b2d307ba91b4de7d306c5df[shorts535ba6477b2d307ba91b4de7d306c5df[5]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x62DAF8EAB027DB2L;
    }

    public void id_class(rrTB ... rrTBArray) {
        ((List)this.fields535ba6477b2d307ba91b4de7d306c5df[shorts535ba6477b2d307ba91b4de7d306c5df[2]]).addAll(List.of(rrTBArray));
        ((List)this.fields535ba6477b2d307ba91b4de7d306c5df[shorts535ba6477b2d307ba91b4de7d306c5df[3]]).sort(Comparator.comparingInt(rrTB2 -> (int)(-((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[shorts535ba6477b2d307ba91b4de7d306c5df[6]]).id_finally().id_break(rrTB2.id_throws()))));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, 94, 25, 65, 69, 9, -7, 27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Map<rrTS, List<rrTB>> id_break() {
        HashMap<rrTS, List> hashMap = new HashMap<rrTS, List>();
        for (rrTB rrTB2 : (List)this.fields535ba6477b2d307ba91b4de7d306c5df[shorts535ba6477b2d307ba91b4de7d306c5df[4]]) {
            hashMap.computeIfAbsent(rrTB2.id_class(), rrTS2 -> new ArrayList()).add(rrTB2);
        }
        return hashMap.entrySet().stream().sorted(Comparator.comparingInt(entry -> -((List)entry.getValue()).size())).collect(LinkedHashMap::new, (linkedHashMap, entry) -> linkedHashMap.put((rrTS)((Object)((Object)entry.getKey())), (List)entry.getValue()), Map::putAll);
    }

    private static void id_throws() {
        strings535ba6477b2d307ba91b4de7d306c5df = new String[]{new String("INSTANCE")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrTs_1.id_protected();
        rrTs_1.id_throws();
        rrTs_1.id_case();
        rrTs_1.id_private();
        rrTs_1.id_catch();
    }

    private void id_finally() {
        if (this.fields535ba6477b2d307ba91b4de7d306c5df == null) {
            this.fields535ba6477b2d307ba91b4de7d306c5df = new Object[1];
        }
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new rrTs_1(), new rrTs_1[]{(rrTs_1)((Object)objectArray[0])}};
        staticFields535ba6477b2d307ba91b4de7d306c5df = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        shorts535ba6477b2d307ba91b4de7d306c5df = sArray;
    }

    private void id_implements() {
        rrTB[] rrTBArray = new rrTB[bytes535ba6477b2d307ba91b4de7d306c5df[0]];
        rrTBArray[rrTs_1.booleans535ba6477b2d307ba91b4de7d306c5df[0]] = new rrTk_1();
        rrTBArray[rrTs_1.booleans535ba6477b2d307ba91b4de7d306c5df[1]] = new rrTO();
        rrTBArray[rrTs_1.bytes535ba6477b2d307ba91b4de7d306c5df[1]] = new rrTd_1();
        rrTBArray[rrTs_1.bytes535ba6477b2d307ba91b4de7d306c5df[2]] = new rrTJ();
        rrTBArray[rrTs_1.bytes535ba6477b2d307ba91b4de7d306c5df[3]] = new rrTX();
        rrTBArray[rrTs_1.bytes535ba6477b2d307ba91b4de7d306c5df[4]] = new rrTh_1();
        rrTBArray[rrTs_1.bytes535ba6477b2d307ba91b4de7d306c5df[5]] = new rrTx_1();
        this.id_class(rrTBArray);
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[2] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans535ba6477b2d307ba91b4de7d306c5df = blArray;
    }

    private static void id_private() {
        bytes535ba6477b2d307ba91b4de7d306c5df = new byte[]{7, 2, 3, 4, 5, 6, 2};
    }
}

