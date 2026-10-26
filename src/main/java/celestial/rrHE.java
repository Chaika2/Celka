/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ri_3;
import celestial.rrHd_1;
import celestial.rrHx_1;
import celestial.u_1;
import celestial.util.MinecraftAccessor;
import celestial.xd_3;
import celestial.xu_3;
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

public class rrHE
extends Enum<rrHE>
implements MinecraftAccessor {
    public Object[] fieldsba1f59fc216a32d3a8f1aabb25cf0fd2;
    private static String[] stringsba1f59fc216a32d3a8f1aabb25cf0fd2;
    private static boolean[] booleansba1f59fc216a32d3a8f1aabb25cf0fd2;
    private static short[] shortsba1f59fc216a32d3a8f1aabb25cf0fd2;
    private static byte[] bytesba1f59fc216a32d3a8f1aabb25cf0fd2;
    public static Object[] staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2;

    public xd_3 id_byte(String string) {
        for (xd_3 xd_32 : (Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[16]]) {
            if (!ri_3.id_class(xd_32).equalsIgnoreCase(ri_3.id_class(ri_3.id_class(string)))) continue;
            return xd_32;
        }
        return null;
    }

    public Set<xd_3> id_byte() {
        return (Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[19]];
    }

    private rrHE() {
        ArrayList arrayList;
        HashSet hashSet;
        this.id_finally();
        this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[rrHE.shortsba1f59fc216a32d3a8f1aabb25cf0fd2[1]] = hashSet = new HashSet();
        this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[rrHE.shortsba1f59fc216a32d3a8f1aabb25cf0fd2[2]] = arrayList = new ArrayList();
        this.id_class(new rrHd_1());
    }

    static {
        rrHE.ntfClinit();
    }

    public static rrHE[] values() {
        return (rrHE[])((rrHE[])staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[0]]).clone();
    }

    public static rrHE valueOf(String string) {
        return Enum.valueOf(rrHE.class, string);
    }

    public void id_class(rrHx_1 rrHx_12) {
        ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[18]]).add(rrHx_12);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3B767D5E;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-39, -88, -70, -92, -68, 90, 102, 104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC9B6D4F6301FF7E7L;
    }

    public boolean id_class(xd_3 xd_32) {
        return ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[17]]).contains(xd_32);
    }

    public void id_class(xd_3 xd_32, String string, boolean bl) {
        if (xd_32 == xu_3.id_class) {
            ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[3]]).forEach(rrHx_12 -> rrHx_12.id_class(string, new u_1(stringsba1f59fc216a32d3a8f1aabb25cf0fd2[0])));
            return;
        }
        boolean bl2 = ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[4]]).add(xd_32);
        if (bl) {
            ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[5]]).forEach(rrHx_12 -> rrHx_12.id_break(xd_32, bl2));
        }
    }

    public List<rrHx_1> id_class() {
        return (List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[20]];
    }

    public void id_class(Consumer<xd_3> consumer) {
        if (((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[13]]).isEmpty()) {
            ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[14]]).forEach(rrHx_1::id_class);
            return;
        }
        ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[15]]).forEach(consumer);
    }

    public void id_break() {
        if (((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[9]]).isEmpty()) {
            ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[10]]).forEach(rrHx_1::id_class);
            return;
        }
        ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[11]]).clear();
        ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[12]]).forEach(rrHx_1::id_break);
    }

    public boolean id_break(String string) {
        xd_3 xd_32 = this.id_byte(string);
        if (xd_32 == null) {
            ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[6]]).forEach(rrHx_12 -> rrHx_12.id_class(string));
            return booleansba1f59fc216a32d3a8f1aabb25cf0fd2[0];
        }
        boolean bl = ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[7]]).remove(xd_32);
        ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[8]]).forEach(rrHx_12 -> rrHx_12.id_class(xd_32, bl));
        return bl;
    }

    private static /* synthetic */ rrHE[] id_throws() {
        rrHE[] rrHEArray = new rrHE[booleansba1f59fc216a32d3a8f1aabb25cf0fd2[1]];
        rrHEArray[rrHE.booleansba1f59fc216a32d3a8f1aabb25cf0fd2[2]] = (rrHE)staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[shortsba1f59fc216a32d3a8f1aabb25cf0fd2[21]];
        return rrHEArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrHE.id_private();
        rrHE.id_implements();
        rrHE.id_catch();
        rrHE.id_protected();
        rrHE.id_case();
    }

    private void id_finally() {
        if (this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2 == null) {
            this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2 = new Object[2];
        }
    }

    private static void id_catch() {
        short[] sArray = new short[22];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[14] = 1;
        sArray[18] = 1;
        sArray[20] = 1;
        shortsba1f59fc216a32d3a8f1aabb25cf0fd2 = sArray;
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrHE(), new rrHE[]{(rrHE)objectArray[0]}};
        staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2 = objectArray;
    }

    private static void id_implements() {
        stringsba1f59fc216a32d3a8f1aabb25cf0fd2 = new String[]{new String("Block not found"), new String("INSTANCE")};
    }

    private static void id_protected() {
        bytesba1f59fc216a32d3a8f1aabb25cf0fd2 = new byte[]{2, 2};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[5] = true;
        booleansba1f59fc216a32d3a8f1aabb25cf0fd2 = blArray;
    }
}

