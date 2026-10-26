/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.an_3;
import celestial.rrZQ;
import celestial.rrZk_1;
import celestial.rrZz_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZW
extends Enum<rrZW>
implements MinecraftAccessor {
    private static short[] shortsf09fd5e6d24c37ccb4408917cb188133;
    private static byte[] bytesf09fd5e6d24c37ccb4408917cb188133;
    private static String[] stringsf09fd5e6d24c37ccb4408917cb188133;
    public static Object[] staticFieldsf09fd5e6d24c37ccb4408917cb188133;
    private static boolean[] booleansf09fd5e6d24c37ccb4408917cb188133;
    public Object[] fieldsf09fd5e6d24c37ccb4408917cb188133;

    public List<rrZz_1> id_byte() {
        return (List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[28]];
    }

    public void id_byte(String string) {
        String string2 = string.toLowerCase();
        rrZk_1 rrZk_12 = (rrZk_1)((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[8]]).remove(string2);
        if (rrZk_12 == null) {
            ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[9]]).forEach(rrZz_12 -> rrZz_12.id_class(string));
        } else {
            ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[10]]).forEach(rrZz_12 -> rrZz_12.id_break(rrZk_12, booleansf09fd5e6d24c37ccb4408917cb188133[5]));
        }
    }

    private rrZW() {
        ArrayList arrayList;
        HashMap hashMap;
        this.id_private();
        this.fieldsf09fd5e6d24c37ccb4408917cb188133[rrZW.shortsf09fd5e6d24c37ccb4408917cb188133[1]] = hashMap = new HashMap();
        this.fieldsf09fd5e6d24c37ccb4408917cb188133[rrZW.shortsf09fd5e6d24c37ccb4408917cb188133[2]] = arrayList = new ArrayList();
        ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[3]]).add(new rrZQ());
    }

    static {
        rrZW.ntfClinit();
    }

    public static rrZW[] values() {
        return (rrZW[])((rrZW[])staticFieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[0]]).clone();
    }

    public static rrZW valueOf(String string) {
        return Enum.valueOf(rrZW.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC69BBAD61B926477L;
    }

    public void id_class(Consumer<rrZk_1> consumer) {
        if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[15]]).isEmpty()) {
            ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[16]]).forEach(rrZz_1::id_byte);
            return;
        }
        ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[17]]).values().forEach(consumer);
    }

    public boolean id_class(an_3 an_32) {
        if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[18]]).isEmpty()) {
            return booleansf09fd5e6d24c37ccb4408917cb188133[2];
        }
        String string = an_32.id_extends().toLowerCase();
        return ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[19]]).containsKey(string);
    }

    public Map<String, rrZk_1> id_class() {
        return (Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[27]];
    }

    public boolean id_class(Aw_1 aw_1) {
        if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[20]]).isEmpty()) {
            return booleansf09fd5e6d24c37ccb4408917cb188133[3];
        }
        String string = aw_1.id_class().getName().toLowerCase();
        return ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[21]]).containsKey(string);
    }

    public void id_class(rrZk_1 rrZk_12, boolean bl) {
        boolean bl2;
        String string = rrZk_12.id_class();
        if (string.length() > bytesf09fd5e6d24c37ccb4408917cb188133[0] || string.length() < bytesf09fd5e6d24c37ccb4408917cb188133[1]) {
            ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[4]]).forEach(rrZz_1::id_class);
            return;
        }
        if (string.equalsIgnoreCase(id_import.id_while().id_byte())) {
            ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[5]]).forEach(rrZz_1::id_protected);
            return;
        }
        String string2 = string.toLowerCase();
        boolean bl3 = bl2 = ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[6]]).putIfAbsent(string2, rrZk_12) == null ? booleansf09fd5e6d24c37ccb4408917cb188133[0] : booleansf09fd5e6d24c37ccb4408917cb188133[1];
        if (bl) {
            ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[7]]).forEach(rrZz_12 -> rrZz_12.id_class(rrZk_12, bl2));
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFF51D486;
    }

    public rrZk_1 id_class(String string) {
        if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[25]]).isEmpty()) {
            return null;
        }
        String string2 = string.toLowerCase();
        return (rrZk_1)((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[26]]).get(string2);
    }

    public boolean id_break(String string) {
        if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[22]]).isEmpty()) {
            return booleansf09fd5e6d24c37ccb4408917cb188133[4];
        }
        String string2 = string.toLowerCase();
        return ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[23]]).containsKey(string2);
    }

    public int id_break() {
        return ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[24]]).size();
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[10] = true;
        booleansf09fd5e6d24c37ccb4408917cb188133 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrZW.id_throws();
        rrZW.id_extends();
        rrZW.id_catch();
        rrZW.id_case();
        rrZW.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray;
        objectArray = new Object[]{new rrZW(), new rrZW[]{(rrZW)objectArray[0]}};
        staticFieldsf09fd5e6d24c37ccb4408917cb188133 = objectArray;
    }

    private static void id_catch() {
        short[] sArray = new short[30];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[28] = 1;
        shortsf09fd5e6d24c37ccb4408917cb188133 = sArray;
    }

    private static void id_extends() {
        stringsf09fd5e6d24c37ccb4408917cb188133 = new String[]{new String("INSTANCE")};
    }

    private static void id_case() {
        bytesf09fd5e6d24c37ccb4408917cb188133 = new byte[]{16, 2, 2, 2};
    }

    private static /* synthetic */ rrZW[] id_implements() {
        rrZW[] rrZWArray = new rrZW[booleansf09fd5e6d24c37ccb4408917cb188133[6]];
        rrZWArray[rrZW.booleansf09fd5e6d24c37ccb4408917cb188133[7]] = (rrZW)staticFieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[29]];
        return rrZWArray;
    }

    public void id_protected() {
        if (((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[11]]).isEmpty()) {
            ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[12]]).forEach(rrZz_1::id_byte);
            return;
        }
        ((Map)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[13]]).clear();
        ((List)this.fieldsf09fd5e6d24c37ccb4408917cb188133[shortsf09fd5e6d24c37ccb4408917cb188133[14]]).forEach(rrZz_1::id_break);
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{23, -17, -33, -4, -80, -42, -86, 15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_private() {
        if (this.fieldsf09fd5e6d24c37ccb4408917cb188133 == null) {
            Object[] objectArray = this.fieldsf09fd5e6d24c37ccb4408917cb188133 = new Object[bytesf09fd5e6d24c37ccb4408917cb188133[2]];
        }
    }
}

