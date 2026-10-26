/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rryW;
import celestial.rryk_1;
import celestial.rryz_1;
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

public class rryd_1
extends Enum<rryd_1>
implements MinecraftAccessor {
    public static Object[] staticFields78f62b0b61073300aba99f31bcf5126e;
    private static boolean[] booleans78f62b0b61073300aba99f31bcf5126e;
    private static short[] shorts78f62b0b61073300aba99f31bcf5126e;
    private static String[] strings78f62b0b61073300aba99f31bcf5126e;
    public Object[] fields78f62b0b61073300aba99f31bcf5126e;
    private static byte[] bytes78f62b0b61073300aba99f31bcf5126e;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{28, -86, 119, -114, -82, -96, -67, 6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public List<rryz_1> id_byte() {
        return (List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[23]];
    }

    private rryd_1() {
        ArrayList arrayList;
        HashSet hashSet;
        this.id_implements();
        this.fields78f62b0b61073300aba99f31bcf5126e[rryd_1.shorts78f62b0b61073300aba99f31bcf5126e[1]] = hashSet = new HashSet();
        this.fields78f62b0b61073300aba99f31bcf5126e[rryd_1.shorts78f62b0b61073300aba99f31bcf5126e[2]] = arrayList = new ArrayList();
        this.id_class(new rryW());
    }

    static {
        rryd_1.ntfClinit();
    }

    public static rryd_1[] values() {
        return (rryd_1[])((rryd_1[])staticFields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[0]]).clone();
    }

    public static rryd_1 valueOf(String string) {
        return Enum.valueOf(rryd_1.class, string);
    }

    public void id_class(String string, String string2, boolean bl, boolean bl2) {
        if (string.equalsIgnoreCase(id_import.id_while().id_byte())) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[3]]).forEach(rryz_1::id_byte);
            return;
        }
        if (bl2) {
            for (rryk_1 rryk_12 : (Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[4]]) {
                if (!rryk_12.id_break().equalsIgnoreCase(string.toLowerCase())) continue;
                ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[5]]).forEach(rryz_12 -> rryz_12.id_class(string, booleans78f62b0b61073300aba99f31bcf5126e[0]));
                return;
            }
        }
        boolean bl3 = ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[6]]).add(new rryk_1(string, string2));
        if (bl) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[7]]).forEach(rryz_12 -> rryz_12.id_class(string, bl3));
        }
    }

    public void id_class(Consumer<rryk_1> consumer) {
        if (((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[15]]).isEmpty()) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[16]]).forEach(rryz_1::id_break);
            return;
        }
        ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[17]]).forEach(consumer);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3BCA593C;
    }

    public int id_class() {
        return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[20]]).size();
    }

    public void id_class(boolean bl) {
        if (((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[11]]).isEmpty()) {
            if (bl) {
                ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[12]]).forEach(rryz_1::id_break);
            }
            return;
        }
        ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[13]]).clear();
        if (bl) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[14]]).forEach(rryz_1::id_class);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x997BC7886A8C9DB0L;
    }

    public boolean id_class(String string) {
        return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[18]]).stream().anyMatch(rryk_12 -> rryk_12.id_break().equalsIgnoreCase(string));
    }

    public void id_class(rryz_1 rryz_12) {
        ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[21]]).add(rryz_12);
    }

    public void id_break(String string) {
        rryk_1 rryk_13 = this.id_protected(string);
        if (rryk_13 == null) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[8]]).forEach(rryz_12 -> rryz_12.id_class(string));
            return;
        }
        ((List)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[9]]).forEach(rryz_12 -> rryz_12.id_break(rryk_13.id_break(), this.id_class(string)));
        ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[10]]).removeIf(rryk_12 -> rryk_12.id_break().equals(string));
    }

    public Set<rryk_1> id_break() {
        return (Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[22]];
    }

    private static void id_throws() {
        bytes78f62b0b61073300aba99f31bcf5126e = new byte[]{2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rryd_1.id_finally();
        rryd_1.id_case();
        rryd_1.id_protected();
        rryd_1.id_throws();
        rryd_1.id_private();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[5] = true;
        booleans78f62b0b61073300aba99f31bcf5126e = blArray;
    }

    private static /* synthetic */ rryd_1[] id_catch() {
        rryd_1[] rryd_1Array = new rryd_1[booleans78f62b0b61073300aba99f31bcf5126e[1]];
        rryd_1Array[rryd_1.booleans78f62b0b61073300aba99f31bcf5126e[2]] = (rryd_1)staticFields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[24]];
        return rryd_1Array;
    }

    private static void id_case() {
        strings78f62b0b61073300aba99f31bcf5126e = new String[]{new String("INSTANCE")};
    }

    private void id_implements() {
        if (this.fields78f62b0b61073300aba99f31bcf5126e == null) {
            this.fields78f62b0b61073300aba99f31bcf5126e = new Object[2];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[25];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[12] = 1;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[21] = 1;
        sArray[23] = 1;
        shorts78f62b0b61073300aba99f31bcf5126e = sArray;
    }

    public rryk_1 id_protected(String string) {
        return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[19]]).stream().filter(rryk_12 -> rryk_12.id_break().equalsIgnoreCase(string)).findFirst().orElse(null);
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new rryd_1(), new rryd_1[]{(rryd_1)objectArray[0]}};
        staticFields78f62b0b61073300aba99f31bcf5126e = objectArray;
    }
}

