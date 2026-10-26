/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Module;
import celestial.rrQX;
import celestial.rrvI;
import celestial.rrvf_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvw_1
extends Enum<rrvw_1> {
    private static byte[] bytesb5a707e7713735c98363c6b6bc5591b6;
    private static String[] stringsb5a707e7713735c98363c6b6bc5591b6;
    private static short[] shortsb5a707e7713735c98363c6b6bc5591b6;
    public Object[] fieldsb5a707e7713735c98363c6b6bc5591b6;
    private static boolean[] booleansb5a707e7713735c98363c6b6bc5591b6;
    public static Object[] staticFieldsb5a707e7713735c98363c6b6bc5591b6;

    private static /* synthetic */ rrvw_1[] id_byte() {
        rrvw_1[] rrvw_1Array = new rrvw_1[booleansb5a707e7713735c98363c6b6bc5591b6[4]];
        rrvw_1Array[rrvw_1.booleansb5a707e7713735c98363c6b6bc5591b6[5]] = (rrvw_1)((Object)staticFieldsb5a707e7713735c98363c6b6bc5591b6[shortsb5a707e7713735c98363c6b6bc5591b6[10]]);
        return rrvw_1Array;
    }

    private rrvw_1() {
        ArrayList arrayList;
        this.id_throws();
        this.fieldsb5a707e7713735c98363c6b6bc5591b6[rrvw_1.shortsb5a707e7713735c98363c6b6bc5591b6[1]] = arrayList = new ArrayList();
        ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[shortsb5a707e7713735c98363c6b6bc5591b6[2]]).add(new rrvf_1());
    }

    static {
        rrvw_1.ntfClinit();
    }

    public static rrvw_1[] values() {
        return (rrvw_1[])((rrvw_1[])staticFieldsb5a707e7713735c98363c6b6bc5591b6[shortsb5a707e7713735c98363c6b6bc5591b6[0]]).clone();
    }

    public static rrvw_1 valueOf(String string) {
        return Enum.valueOf(rrvw_1.class, string);
    }

    public void id_class() {
        for (Module module : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsb5a707e7713735c98363c6b6bc5591b6[3]]).id_private().g()) {
            module.id_class(module.ax_(), booleansb5a707e7713735c98363c6b6bc5591b6[0]);
        }
        ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[shortsb5a707e7713735c98363c6b6bc5591b6[4]]).forEach(rrvI::id_class);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{89, -32, 54, -81, 15, -46, 6, 27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2A7164A4;
    }

    public void id_class(Consumer<Module> consumer) {
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsb5a707e7713735c98363c6b6bc5591b6[6]]).id_private().g().stream().allMatch(module -> module.id_package().id_class())) {
            ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[shortsb5a707e7713735c98363c6b6bc5591b6[7]]).forEach(rrvI::id_break);
            return;
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsb5a707e7713735c98363c6b6bc5591b6[8]]).id_private().g().stream().filter(module -> !module.id_package().id_class() ? booleansb5a707e7713735c98363c6b6bc5591b6[2] : booleansb5a707e7713735c98363c6b6bc5591b6[3]).forEach(consumer);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5999AA8C923C80D4L;
    }

    public void id_class(Module module) {
        module.id_class(module.ax_(), booleansb5a707e7713735c98363c6b6bc5591b6[1]);
        ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[shortsb5a707e7713735c98363c6b6bc5591b6[5]]).forEach(rrvI2 -> rrvI2.id_class(module));
    }

    public List<rrvI> id_break() {
        return (List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[shortsb5a707e7713735c98363c6b6bc5591b6[9]];
    }

    private void id_throws() {
        if (this.fieldsb5a707e7713735c98363c6b6bc5591b6 == null) {
            Object[] objectArray = this.fieldsb5a707e7713735c98363c6b6bc5591b6 = new Object[booleansb5a707e7713735c98363c6b6bc5591b6[9]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrvw_1.id_case();
        rrvw_1.id_implements();
        rrvw_1.id_catch();
        rrvw_1.id_private();
        rrvw_1.id_protected();
    }

    private static void id_catch() {
        short[] sArray = new short[11];
        sArray[0] = 1;
        shortsb5a707e7713735c98363c6b6bc5591b6 = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[10];
        blArray[2] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[9] = true;
        booleansb5a707e7713735c98363c6b6bc5591b6 = blArray;
    }

    private static void id_implements() {
        stringsb5a707e7713735c98363c6b6bc5591b6 = new String[]{new String("INSTANCE")};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrvw_1(), new rrvw_1[]{(rrvw_1)((Object)objectArray[0])}};
        staticFieldsb5a707e7713735c98363c6b6bc5591b6 = objectArray;
    }

    private static void id_private() {
        bytesb5a707e7713735c98363c6b6bc5591b6 = new byte[]{2};
    }
}

