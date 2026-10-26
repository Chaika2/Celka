/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Module;
import celestial.rrFE;
import celestial.setting.KeyBind;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFG
implements rrFE {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static float[] id_protected;
    private static boolean[] id_throws;

    @Override
    public String id_byte() {
        return ((Module)this.id_class[id_byte[2]]).id_final();
    }

    public rrFG(Module module) {
        this.id_finally();
        AnimValue animValue = new AnimValue(id_protected[0], id_throws[0]);
        this.id_class[rrFG.id_byte[0]] = animValue;
        Module module2 = module;
        this.id_class[rrFG.id_byte[1]] = module2;
    }

    static {
        rrFG.ntfClinit();
    }

    @Override
    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_byte[3]]).id_class(bl);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5B75C0E4;
    }

    @Override
    public AnimValue id_class() {
        return (AnimValue)this.id_class[id_byte[5]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9C3FAA44DCE29930L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{94, 51, 11, -89, -102, 122, -82, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public String id_break() {
        return "[" + ((Module)this.id_class[id_byte[4]]).id_package().id_break() + "]";
    }

    @Override
    public boolean id_throws() {
        return ((Module)this.id_class[id_byte[7]]).aJ_() && ((Module)this.id_class[id_byte[8]]).id_package() != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[9]] ? id_throws[1] : id_throws[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrFG.id_catch();
        rrFG.id_extends();
        rrFG.id_private();
        rrFG.id_implements();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static void id_extends() {
        id_protected = new float[]{0.5f};
    }

    public KeyBind id_case() {
        return ((Module)this.id_class[id_byte[6]]).id_package();
    }

    private static void id_implements() {
        id_break = new byte[]{2};
    }

    @Override
    public boolean id_protected() {
        return id_throws[3];
    }

    private static void id_private() {
        short[] sArray = new short[10];
        sArray[0] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        id_byte = sArray;
    }
}

