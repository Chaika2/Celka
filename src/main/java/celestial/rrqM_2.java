/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQX;
import celestial.rrqO_2;
import celestial.rrqh_3;
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

public class rrqM_2
extends Enum<rrqM_2>
implements MinecraftAccessor {
    private static String[] strings360b36d126ee3c45b942181ce786df43;
    public static Object[] staticFields360b36d126ee3c45b942181ce786df43;
    private static byte[] bytes360b36d126ee3c45b942181ce786df43;
    public Object[] fields360b36d126ee3c45b942181ce786df43;
    private static short[] shorts360b36d126ee3c45b942181ce786df43;
    private static boolean[] booleans360b36d126ee3c45b942181ce786df43;

    public Set<String> id_byte() {
        return (Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[25]];
    }

    public void id_byte(String string) {
        String string2 = this.id_protected(string);
        if (string2 == null) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[9]]).forEach(rrqO_22 -> rrqO_22.d_(string));
            return;
        }
        ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[10]]).forEach(rrqO_22 -> rrqO_22.id_class(string2, booleans360b36d126ee3c45b942181ce786df43[1]));
        ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[11]]).remove(string2);
    }

    private rrqM_2() {
        ArrayList arrayList;
        HashSet hashSet;
        this.id_implements();
        this.fields360b36d126ee3c45b942181ce786df43[rrqM_2.shorts360b36d126ee3c45b942181ce786df43[1]] = hashSet = new HashSet();
        this.fields360b36d126ee3c45b942181ce786df43[rrqM_2.shorts360b36d126ee3c45b942181ce786df43[2]] = arrayList = new ArrayList();
        this.id_class(new rrqh_3());
    }

    static {
        rrqM_2.ntfClinit();
    }

    public static rrqM_2[] values() {
        return (rrqM_2[])((rrqM_2[])staticFields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[0]]).clone();
    }

    public static rrqM_2 valueOf(String string) {
        return Enum.valueOf(rrqM_2.class, string);
    }

    public void id_class(boolean bl) {
        if (((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[12]]).isEmpty()) {
            if (bl) {
                ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[13]]).forEach(rrqO_2::id_break);
            }
            return;
        }
        ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[14]]).clear();
        if (bl) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[15]]).forEach(rrqO_2::id_continue);
        }
    }

    public void id_class(Consumer<String> consumer) {
        if (((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[18]]).isEmpty()) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[19]]).forEach(rrqO_2::id_break);
            return;
        }
        ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[20]]).forEach(consumer);
    }

    public void id_class(String string, boolean bl, boolean bl2) {
        if (string.length() > bytes360b36d126ee3c45b942181ce786df43[0] || string.length() < bytes360b36d126ee3c45b942181ce786df43[1]) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[3]]).forEach(rrqO_2::aM_);
            return;
        }
        if (string.equalsIgnoreCase(id_import.id_while().id_byte())) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[4]]).forEach(rrqO_2::aN_);
            return;
        }
        if (bl2) {
            for (String string2 : (Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[5]]) {
                if (!string2.equalsIgnoreCase(string.toLowerCase())) continue;
                ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[6]]).forEach(rrqO_22 -> rrqO_22.d_(string, booleans360b36d126ee3c45b942181ce786df43[2]));
                return;
            }
        }
        boolean bl3 = ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[7]]).add(string);
        if (bl) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[8]]).forEach(rrqO_22 -> rrqO_22.d_(string, bl3));
        }
    }

    public void id_class(rrqO_2 rrqO_22) {
        ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[21]]).add(rrqO_22);
    }

    public int id_class() {
        return ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[24]]).size();
    }

    public boolean id_class(String string) {
        return ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[22]]).stream().anyMatch(string2 -> string2.equalsIgnoreCase(string));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x220B3BE4F801AA73L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDA337F22;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-36, 10, -31, -6, 104, -98, -32, -38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break() {
        rrwe_3 rrwe_32 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts360b36d126ee3c45b942181ce786df43[16]]).id_throws();
        boolean bl = rrwe_32.id_class((rrwU_2)rrwe_32.id_case(), booleans360b36d126ee3c45b942181ce786df43[0]);
        ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[17]]).forEach(rrqO_22 -> rrqO_22.f_(bl));
    }

    private static void id_throws() {
        short[] sArray = new short[28];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[17] = 1;
        sArray[19] = 1;
        sArray[21] = 1;
        sArray[26] = 1;
        shorts360b36d126ee3c45b942181ce786df43 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqM_2.id_extends();
        rrqM_2.id_private();
        rrqM_2.id_throws();
        rrqM_2.id_catch();
        rrqM_2.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray;
        objectArray = new Object[]{new rrqM_2(), new rrqM_2[]{(rrqM_2)objectArray[0]}};
        staticFields360b36d126ee3c45b942181ce786df43 = objectArray;
    }

    private static void id_catch() {
        bytes360b36d126ee3c45b942181ce786df43 = new byte[]{16, 2, 2, 2};
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[3] = true;
        blArray[7] = true;
        booleans360b36d126ee3c45b942181ce786df43 = blArray;
    }

    private static /* synthetic */ rrqM_2[] id_case() {
        rrqM_2[] rrqM_2Array = new rrqM_2[booleans360b36d126ee3c45b942181ce786df43[3]];
        rrqM_2Array[rrqM_2.booleans360b36d126ee3c45b942181ce786df43[4]] = (rrqM_2)staticFields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[27]];
        return rrqM_2Array;
    }

    private void id_implements() {
        if (this.fields360b36d126ee3c45b942181ce786df43 == null) {
            this.fields360b36d126ee3c45b942181ce786df43 = new Object[2];
        }
    }

    public List<rrqO_2> id_protected() {
        return (List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[26]];
    }

    public String id_protected(String string) {
        return ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[23]]).stream().filter(string2 -> string2.equalsIgnoreCase(string)).findFirst().orElse(null);
    }

    private static void id_private() {
        strings360b36d126ee3c45b942181ce786df43 = new String[]{new String("INSTANCE")};
    }
}

