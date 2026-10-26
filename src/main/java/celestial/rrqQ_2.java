/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.util.XRay;
import celestial.ri_3;
import celestial.rrQX;
import celestial.rrqd_3;
import celestial.rrqv_3;
import celestial.rrqz_3;
import celestial.u_1;
import celestial.util.MinecraftAccessor;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqQ_2
extends Enum<rrqQ_2>
implements MinecraftAccessor {
    private static short[] shortsaf585ffa18e23930a314cd0048f74bf2;
    public static Object[] staticFieldsaf585ffa18e23930a314cd0048f74bf2;
    private static byte[] bytesaf585ffa18e23930a314cd0048f74bf2;
    public Object[] fieldsaf585ffa18e23930a314cd0048f74bf2;
    private static String[] stringsaf585ffa18e23930a314cd0048f74bf2;
    private static boolean[] booleansaf585ffa18e23930a314cd0048f74bf2;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{16, -44, 87, 115, -71, 74, 113, 19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_byte() {
        if (((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[9]]).isEmpty()) {
            ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[10]]).forEach(rrqd_3::f_);
            return;
        }
        ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[11]]).clear();
        ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[12]]).forEach(rrqd_3::g_);
    }

    private rrqQ_2() {
        ArrayList arrayList;
        HashSet hashSet;
        this.id_extends();
        this.fieldsaf585ffa18e23930a314cd0048f74bf2[rrqQ_2.shortsaf585ffa18e23930a314cd0048f74bf2[1]] = hashSet = new HashSet();
        this.fieldsaf585ffa18e23930a314cd0048f74bf2[rrqQ_2.shortsaf585ffa18e23930a314cd0048f74bf2[2]] = arrayList = new ArrayList();
        this.id_break(new rrqv_3());
    }

    static {
        rrqQ_2.ntfClinit();
    }

    public static rrqQ_2[] values() {
        return (rrqQ_2[])((rrqQ_2[])staticFieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[0]]).clone();
    }

    public static rrqQ_2 valueOf(String string) {
        return Enum.valueOf(rrqQ_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x64471BA4CC653D21L;
    }

    public void id_class(Consumer<rrqz_3> consumer) {
        if (((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[13]]).isEmpty()) {
            ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[14]]).forEach(rrqd_3::f_);
            return;
        }
        ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[15]]).forEach(consumer);
    }

    public int id_class(xd_3 xd_32) {
        for (rrqz_3 rrqz_32 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[19]]) {
            if (rrqz_32.id_byte() != xd_32) continue;
            return rrqz_32.id_class();
        }
        return bytesaf585ffa18e23930a314cd0048f74bf2[0];
    }

    public void id_class(Collection<rrqz_3> collection) {
        ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[16]]).forEach(rrqd_32 -> rrqd_32.id_class(collection));
    }

    public void id_class(rrqz_3 rrqz_32, String string, boolean bl) {
        if (rrqz_32.id_byte() == xu_3.id_class) {
            ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[3]]).forEach(rrqd_32 -> rrqd_32.id_class(string, new u_1(stringsaf585ffa18e23930a314cd0048f74bf2[0])));
            return;
        }
        boolean bl2 = ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[4]]).add(rrqz_32);
        if (bl) {
            ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[5]]).forEach(rrqd_32 -> rrqd_32.id_class(rrqz_32, bl2));
        }
    }

    public void id_class(rrqd_3 rrqd_32) {
        ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[23]]).remove(rrqd_32);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x103981B4;
    }

    public void id_class() {
        XRay<?> xRay;
        xRay.id_case(!(xRay = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsaf585ffa18e23930a314cd0048f74bf2[17]]).id_private().x()).id_continue() ? booleansaf585ffa18e23930a314cd0048f74bf2[1] : booleansaf585ffa18e23930a314cd0048f74bf2[2]);
        ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[18]]).forEach(rrqd_32 -> rrqd_32.g_(xRay.id_continue()));
    }

    public boolean id_class(String string) {
        rrqz_3 rrqz_32 = this.id_break(string);
        if (rrqz_32 == null) {
            ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[6]]).forEach(rrqd_32 -> rrqd_32.a_(string));
            return booleansaf585ffa18e23930a314cd0048f74bf2[0];
        }
        boolean bl = ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[7]]).remove(rrqz_32);
        ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[8]]).forEach(rrqd_32 -> rrqd_32.id_break(rrqz_32, bl));
        return bl;
    }

    public boolean id_break(xd_3 xd_32) {
        for (rrqz_3 rrqz_32 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[20]]) {
            if (rrqz_32.id_byte() != xd_32) continue;
            return booleansaf585ffa18e23930a314cd0048f74bf2[3];
        }
        return booleansaf585ffa18e23930a314cd0048f74bf2[4];
    }

    public rrqz_3 id_break(String string) {
        for (rrqz_3 rrqz_32 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[21]]) {
            if (!ri_3.id_class(rrqz_32.id_byte()).equalsIgnoreCase(ri_3.id_class(ri_3.id_class(string)))) continue;
            return rrqz_32;
        }
        return null;
    }

    public void id_break(rrqd_3 rrqd_32) {
        ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[22]]).add(rrqd_32);
    }

    public Set<rrqz_3> id_break() {
        return (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[24]];
    }

    private static void id_throws() {
        short[] sArray = new short[27];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[18] = 1;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[25] = 1;
        shortsaf585ffa18e23930a314cd0048f74bf2 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqQ_2.id_finally();
        rrqQ_2.id_case();
        rrqQ_2.id_throws();
        rrqQ_2.id_catch();
        rrqQ_2.id_private();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[9] = true;
        booleansaf585ffa18e23930a314cd0048f74bf2 = blArray;
    }

    private static void id_catch() {
        bytesaf585ffa18e23930a314cd0048f74bf2 = new byte[]{-1, 2, 2};
    }

    private void id_extends() {
        if (this.fieldsaf585ffa18e23930a314cd0048f74bf2 == null) {
            this.fieldsaf585ffa18e23930a314cd0048f74bf2 = new Object[2];
        }
    }

    private static void id_case() {
        stringsaf585ffa18e23930a314cd0048f74bf2 = new String[]{new String("Block not found"), new String("INSTANCE")};
    }

    private static /* synthetic */ rrqQ_2[] id_implements() {
        rrqQ_2[] rrqQ_2Array = new rrqQ_2[booleansaf585ffa18e23930a314cd0048f74bf2[5]];
        rrqQ_2Array[rrqQ_2.booleansaf585ffa18e23930a314cd0048f74bf2[6]] = (rrqQ_2)staticFieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[26]];
        return rrqQ_2Array;
    }

    public List<rrqd_3> id_protected() {
        return (List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[shortsaf585ffa18e23930a314cd0048f74bf2[25]];
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new rrqQ_2(), new rrqQ_2[]{(rrqQ_2)objectArray[0]}};
        staticFieldsaf585ffa18e23930a314cd0048f74bf2 = objectArray;
    }
}

