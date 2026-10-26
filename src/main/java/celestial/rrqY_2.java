/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ri_3;
import celestial.rrqU_2;
import celestial.rrqa_3;
import celestial.rrqe_3;
import celestial.u_1;
import celestial.util.MinecraftAccessor;
import celestial.xu_3;
import celestial.yX_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqY_2
extends Enum<rrqY_2>
implements MinecraftAccessor {
    public Object[] fields0d81573182c03565b5bb298419afe0b7;
    public static Object[] staticFields0d81573182c03565b5bb298419afe0b7;
    private static short[] shorts0d81573182c03565b5bb298419afe0b7;
    private static boolean[] booleans0d81573182c03565b5bb298419afe0b7;
    private static String[] strings0d81573182c03565b5bb298419afe0b7;
    private static byte[] bytes0d81573182c03565b5bb298419afe0b7;

    public rrqU_2 id_byte(String string) {
        return ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[20]]).stream().filter(rrqU_22 -> ri_3.id_class(rrqU_22.id_break()).equalsIgnoreCase(ri_3.id_class(ri_3.id_class(string)))).findFirst().orElse(null);
    }

    public Set<rrqU_2> id_byte() {
        return (Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[21]];
    }

    private rrqY_2() {
        ArrayList arrayList;
        HashSet hashSet;
        this.id_finally();
        this.fields0d81573182c03565b5bb298419afe0b7[rrqY_2.shorts0d81573182c03565b5bb298419afe0b7[1]] = hashSet = new HashSet();
        this.fields0d81573182c03565b5bb298419afe0b7[rrqY_2.shorts0d81573182c03565b5bb298419afe0b7[2]] = arrayList = new ArrayList();
        this.id_class(new rrqa_3());
    }

    static {
        rrqY_2.ntfClinit();
    }

    public static rrqY_2[] values() {
        return (rrqY_2[])((rrqY_2[])staticFields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[0]]).clone();
    }

    public static rrqY_2 valueOf(String string) {
        return Enum.valueOf(rrqY_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF8303A22BCF8AF25L;
    }

    public void id_class(Consumer<rrqU_2> consumer) {
        if (((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[16]]).isEmpty()) {
            ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[17]]).forEach(rrqe_3::id_class);
            return;
        }
        ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[18]]).forEach(consumer);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBCC52504;
    }

    public boolean id_class(String string) {
        rrqU_2 rrqU_22 = this.id_byte(string);
        if (rrqU_22 == null) {
            ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[7]]).forEach(rrqe_32 -> rrqe_32.e_(string));
            return booleans0d81573182c03565b5bb298419afe0b7[0];
        }
        boolean bl = ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[8]]).remove(rrqU_22);
        ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[9]]).forEach(rrqe_32 -> rrqe_32.id_class(rrqU_22, bl));
        if (bl) {
            ((yX_2)rrqY_2.id_import.id_class[shorts0d81573182c03565b5bb298419afe0b7[10]]).id_throws();
        }
        return bl;
    }

    public void id_class(rrqe_3 rrqe_32) {
        ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[19]]).add(rrqe_32);
    }

    public void id_class(rrqU_2 rrqU_22, String string, boolean bl) {
        if (rrqU_22.id_break() == xu_3.id_class) {
            ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[3]]).forEach(rrqe_32 -> rrqe_32.id_class(string, new u_1(strings0d81573182c03565b5bb298419afe0b7[0])));
            return;
        }
        boolean bl2 = ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[4]]).add(rrqU_22);
        if (bl) {
            ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[5]]).forEach(rrqe_32 -> rrqe_32.id_break(rrqU_22, bl2));
        }
        if (bl2) {
            ((yX_2)rrqY_2.id_import.id_class[shorts0d81573182c03565b5bb298419afe0b7[6]]).id_throws();
        }
    }

    public List<rrqe_3> id_class() {
        return (List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[22]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, 96, 110, -92, 35, 92, 45, -122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break() {
        if (((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[11]]).isEmpty()) {
            ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[12]]).forEach(rrqe_3::id_class);
            return;
        }
        ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[13]]).clear();
        ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[14]]).forEach(rrqe_3::id_new);
        ((yX_2)rrqY_2.id_import.id_class[shorts0d81573182c03565b5bb298419afe0b7[15]]).id_throws();
    }

    private static void id_throws() {
        bytes0d81573182c03565b5bb298419afe0b7 = new byte[]{2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrqY_2.id_case();
        rrqY_2.id_protected();
        rrqY_2.id_catch();
        rrqY_2.id_throws();
        rrqY_2.id_private();
    }

    private void id_finally() {
        if (this.fields0d81573182c03565b5bb298419afe0b7 == null) {
            this.fields0d81573182c03565b5bb298419afe0b7 = new Object[2];
        }
    }

    private static void id_catch() {
        short[] sArray = new short[24];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 8;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[10] = 8;
        sArray[12] = 1;
        sArray[14] = 1;
        sArray[15] = 8;
        sArray[17] = 1;
        sArray[19] = 1;
        sArray[22] = 1;
        shorts0d81573182c03565b5bb298419afe0b7 = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[5] = true;
        booleans0d81573182c03565b5bb298419afe0b7 = blArray;
    }

    private static /* synthetic */ rrqY_2[] id_implements() {
        rrqY_2[] rrqY_2Array = new rrqY_2[booleans0d81573182c03565b5bb298419afe0b7[1]];
        rrqY_2Array[rrqY_2.booleans0d81573182c03565b5bb298419afe0b7[2]] = (rrqY_2)staticFields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[23]];
        return rrqY_2Array;
    }

    private static void id_protected() {
        strings0d81573182c03565b5bb298419afe0b7 = new String[]{new String("Block not found"), new String("INSTANCE")};
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new rrqY_2(), new rrqY_2[]{(rrqY_2)objectArray[0]}};
        staticFields0d81573182c03565b5bb298419afe0b7 = objectArray;
    }
}

