/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.rrvF;
import celestial.rrvm_1;
import celestial.rrvv_1;
import celestial.util.MinecraftAccessor;
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

public class rrvZ
extends Enum<rrvZ>
implements MinecraftAccessor {
    public static Object[] staticFieldse90af7ec3c763bb3bd1d99a27ea561d9;
    private static byte[] bytese90af7ec3c763bb3bd1d99a27ea561d9;
    private static boolean[] booleanse90af7ec3c763bb3bd1d99a27ea561d9;
    private static String[] stringse90af7ec3c763bb3bd1d99a27ea561d9;
    public Object[] fieldse90af7ec3c763bb3bd1d99a27ea561d9;
    private static short[] shortse90af7ec3c763bb3bd1d99a27ea561d9;

    public void id_byte(String string) {
        ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[21]]).forEach(rrvv_12 -> rrvv_12.id_break(string));
    }

    public Set<rrvm_1> id_byte() {
        return (Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[24]];
    }

    private rrvZ() {
        ArrayList arrayList;
        HashSet hashSet;
        Consumer<Integer> consumer;
        this.id_finally();
        this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[rrvZ.shortse90af7ec3c763bb3bd1d99a27ea561d9[1]] = consumer = n -> {};
        this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[rrvZ.shortse90af7ec3c763bb3bd1d99a27ea561d9[2]] = hashSet = new HashSet();
        this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[rrvZ.shortse90af7ec3c763bb3bd1d99a27ea561d9[3]] = arrayList = new ArrayList();
        ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[4]]).add(new rrvF());
    }

    static {
        rrvZ.ntfClinit();
    }

    public static rrvZ[] values() {
        return (rrvZ[])((rrvZ[])staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[0]]).clone();
    }

    public static rrvZ valueOf(String string) {
        return Enum.valueOf(rrvZ.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB085CF320DBFFF63L;
    }

    public void id_class() {
        if (((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[11]]).isEmpty()) {
            ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[12]]).forEach(rrvv_1::id_byte);
            return;
        }
        ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[13]]).clear();
        ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[14]]).forEach(rrvv_1::id_break);
    }

    public void id_class(int n) {
        for (rrvm_1 rrvm_12 : this.id_byte()) {
            if (rrvm_12.id_class().id_byte() != n) continue;
            ((cb_3)rrvZ.id_import.id_class[shortse90af7ec3c763bb3bd1d99a27ea561d9[18]]).id_protected(rrvm_12.id_break());
        }
        ((Consumer)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[19]]).accept(n);
    }

    public void id_class(rrvm_1 rrvm_12, boolean bl) {
        ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[5]]).add(rrvm_12);
        if (bl) {
            ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[6]]).forEach(rrvv_12 -> rrvv_12.id_class(rrvm_12));
        }
    }

    public void id_class(Consumer<rrvm_1> consumer) {
        if (((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[15]]).isEmpty()) {
            ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[16]]).forEach(rrvv_1::id_byte);
            return;
        }
        ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[17]]).forEach(consumer);
    }

    public boolean id_class(String string) {
        return this.id_throws(string) != null ? booleanse90af7ec3c763bb3bd1d99a27ea561d9[0] : booleanse90af7ec3c763bb3bd1d99a27ea561d9[1];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1CCD9C20;
    }

    public void id_break(Consumer<Integer> consumer) {
        Consumer<Integer> consumer2;
        this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[rrvZ.shortse90af7ec3c763bb3bd1d99a27ea561d9[25]] = consumer2 = consumer;
    }

    public void id_break() {
        ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[20]]).forEach(rrvv_1::id_class);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-123, -102, 96, -6, 19, -38, -79, -32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private rrvm_1 id_throws(String string) {
        if (string == null || string.isEmpty() || ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[22]]).isEmpty()) {
            return null;
        }
        return ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[23]]).stream().filter(rrvm_12 -> rrvm_12.id_byte().equalsIgnoreCase(string)).findFirst().orElse(null);
    }

    private static void id_throws() {
        bytese90af7ec3c763bb3bd1d99a27ea561d9 = new byte[]{3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrvZ.id_implements();
        rrvZ.id_private();
        rrvZ.id_catch();
        rrvZ.id_throws();
        rrvZ.id_case();
    }

    private void id_finally() {
        if (this.fieldse90af7ec3c763bb3bd1d99a27ea561d9 == null) {
            Object[] objectArray = this.fieldse90af7ec3c763bb3bd1d99a27ea561d9 = new Object[bytese90af7ec3c763bb3bd1d99a27ea561d9[0]];
        }
    }

    private static void id_catch() {
        short[] sArray = new short[27];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[17] = 1;
        sArray[18] = 57;
        sArray[20] = 2;
        sArray[21] = 2;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        shortse90af7ec3c763bb3bd1d99a27ea561d9 = sArray;
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrvZ(), new rrvZ[]{(rrvZ)objectArray[0]}};
        staticFieldse90af7ec3c763bb3bd1d99a27ea561d9 = objectArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[2] = true;
        blArray[6] = true;
        booleanse90af7ec3c763bb3bd1d99a27ea561d9 = blArray;
    }

    private static /* synthetic */ rrvZ[] id_protected() {
        rrvZ[] rrvZArray = new rrvZ[booleanse90af7ec3c763bb3bd1d99a27ea561d9[2]];
        rrvZArray[rrvZ.booleanse90af7ec3c763bb3bd1d99a27ea561d9[3]] = (rrvZ)staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[26]];
        return rrvZArray;
    }

    public void id_protected(String string) {
        rrvm_1 rrvm_13 = ((rrvZ)staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[7]]).id_throws(string);
        if (rrvm_13 == null) {
            ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[8]]).forEach(rrvv_12 -> rrvv_12.id_class(string));
            return;
        }
        ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[9]]).forEach(rrvv_12 -> rrvv_12.id_class(rrvm_13, this.id_class(string)));
        ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[shortse90af7ec3c763bb3bd1d99a27ea561d9[10]]).removeIf(rrvm_12 -> rrvm_12.id_byte().equalsIgnoreCase(string.toLowerCase()));
    }

    private static void id_private() {
        stringse90af7ec3c763bb3bd1d99a27ea561d9 = new String[]{new String("INSTANCE")};
    }
}

