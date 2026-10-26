/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQX;
import celestial.rrqJ_2;
import celestial.rrqx_3;
import celestial.rrwU_2;
import celestial.rrwe_3;
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

public class rrqX_2
extends Enum<rrqX_2>
implements MinecraftAccessor {
    private static String[] strings25cb0eac93bd35f999c477f8effd8890;
    private static short[] shorts25cb0eac93bd35f999c477f8effd8890;
    private static byte[] bytes25cb0eac93bd35f999c477f8effd8890;
    private static boolean[] booleans25cb0eac93bd35f999c477f8effd8890;
    public Object[] fields25cb0eac93bd35f999c477f8effd8890;
    public static Object[] staticFields25cb0eac93bd35f999c477f8effd8890;

    public Set<String> id_byte() {
        return (Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[24]];
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{118, -16, -39, 21, -6, -124, -35, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private rrqX_2() {
        ArrayList arrayList;
        HashSet hashSet;
        this.id_catch();
        this.fields25cb0eac93bd35f999c477f8effd8890[rrqX_2.shorts25cb0eac93bd35f999c477f8effd8890[1]] = hashSet = new HashSet();
        this.fields25cb0eac93bd35f999c477f8effd8890[rrqX_2.shorts25cb0eac93bd35f999c477f8effd8890[2]] = arrayList = new ArrayList();
        this.id_class(new rrqx_3());
    }

    static {
        rrqX_2.ntfClinit();
    }

    public static rrqX_2[] values() {
        return (rrqX_2[])((rrqX_2[])staticFields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[0]]).clone();
    }

    public static rrqX_2 valueOf(String string) {
        return Enum.valueOf(rrqX_2.class, string);
    }

    public void id_class(boolean bl) {
        if (((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[10]]).isEmpty()) {
            if (bl) {
                ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[11]]).forEach(rrqJ_2::id_class);
            }
            return;
        }
        ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[12]]).clear();
        if (bl) {
            ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[13]]).forEach(rrqJ_2::id_this);
        }
    }

    public void id_class(Consumer<String> consumer) {
        if (((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[16]]).isEmpty()) {
            ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[17]]).forEach(rrqJ_2::id_class);
            return;
        }
        ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[18]]).forEach(consumer);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB13DF431B015D674L;
    }

    public void id_class(String string, boolean bl, boolean bl2) {
        if (bl2) {
            for (String string2 : (Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[3]]) {
                if (!string2.equalsIgnoreCase(string.toLowerCase())) continue;
                ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[4]]).forEach(rrqJ_22 -> rrqJ_22.id_byte(string, booleans25cb0eac93bd35f999c477f8effd8890[2]));
                return;
            }
        }
        boolean bl3 = ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[5]]).add(string);
        if (bl) {
            ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[6]]).forEach(rrqJ_22 -> rrqJ_22.id_byte(string, bl3));
        }
    }

    public Set<String> id_class() {
        return (Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[23]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x923C2305;
    }

    public void id_class(rrqJ_2 rrqJ_22) {
        ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[21]]).add(rrqJ_22);
    }

    public boolean id_class(String string) {
        return ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[19]]).stream().anyMatch(string2 -> string2.equalsIgnoreCase(string));
    }

    public String id_break(String string) {
        return ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[20]]).stream().filter(string2 -> string2.equalsIgnoreCase(string)).findFirst().orElse(null);
    }

    public List<rrqJ_2> id_break() {
        return (List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[25]];
    }

    public int id_throws() {
        return ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[22]]).size();
    }

    private static /* synthetic */ void ntfClinit() {
        rrqX_2.id_native();
        rrqX_2.id_case();
        rrqX_2.id_finally();
        rrqX_2.id_implements();
        rrqX_2.id_private();
    }

    private static void id_finally() {
        short[] sArray = new short[27];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[17] = 1;
        sArray[21] = 1;
        sArray[25] = 1;
        shorts25cb0eac93bd35f999c477f8effd8890 = sArray;
    }

    private void id_catch() {
        if (this.fields25cb0eac93bd35f999c477f8effd8890 == null) {
            this.fields25cb0eac93bd35f999c477f8effd8890 = new Object[2];
        }
    }

    private static /* synthetic */ rrqX_2[] id_extends() {
        rrqX_2[] rrqX_2Array = new rrqX_2[booleans25cb0eac93bd35f999c477f8effd8890[3]];
        rrqX_2Array[rrqX_2.booleans25cb0eac93bd35f999c477f8effd8890[4]] = (rrqX_2)staticFields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[26]];
        return rrqX_2Array;
    }

    private static void id_case() {
        strings25cb0eac93bd35f999c477f8effd8890 = new String[]{new String("INSTANCE")};
    }

    private static void id_implements() {
        bytes25cb0eac93bd35f999c477f8effd8890 = new byte[]{2, 2};
    }

    public void id_protected(String string) {
        String string2 = this.id_break(string);
        if (string2 == null) {
            ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[7]]).forEach(rrqJ_22 -> rrqJ_22.c_(string));
            return;
        }
        ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[8]]).forEach(rrqJ_22 -> rrqJ_22.id_break(string2, booleans25cb0eac93bd35f999c477f8effd8890[1]));
        ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[9]]).remove(string2);
    }

    public void id_protected() {
        rrwe_3 rrwe_32 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts25cb0eac93bd35f999c477f8effd8890[14]]).id_throws();
        boolean bl = rrwe_32.id_class((rrwU_2)rrwe_32.id_throws(), booleans25cb0eac93bd35f999c477f8effd8890[0]);
        ((List)this.fields25cb0eac93bd35f999c477f8effd8890[shorts25cb0eac93bd35f999c477f8effd8890[15]]).forEach(rrqJ_22 -> rrqJ_22.e_(bl));
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new rrqX_2(), new rrqX_2[]{(rrqX_2)objectArray[0]}};
        staticFields25cb0eac93bd35f999c477f8effd8890 = objectArray;
    }

    private static void id_native() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[3] = true;
        blArray[7] = true;
        booleans25cb0eac93bd35f999c477f8effd8890 = blArray;
    }
}

