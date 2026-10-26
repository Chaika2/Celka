/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Module;
import celestial.module.render.ArrayListHud;
import celestial.rrIk_1;
import celestial.rrZO;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqA_2 {
    private static boolean[] id_break;
    private static float[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;

    public float id_byte() {
        return ((AnimValue)this.id_class[id_throws[4]]).id_byte();
    }

    public rrqA_2(ArrayListHud arrayListHud, Module module) {
        this.id_finally();
        AnimValue animValue = new AnimValue(id_byte[0], id_break[0]);
        this.id_class[rrqA_2.id_throws[0]] = animValue;
        Module module2 = module;
        this.id_class[rrqA_2.id_throws[1]] = module2;
        this.id_break(((rrIk_1)arrayListHud.id_byte[id_throws[2]]).id_class());
    }

    static {
        rrqA_2.ntfClinit();
    }

    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_throws[3]]).id_class(bl);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-111, 29, 104, 126, 56, 61, -46, -7}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x904882170400A6D6L;
    }

    public AnimValue id_class() {
        return (AnimValue)this.id_class[id_throws[12]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1BB14DB1;
    }

    public Module id_break() {
        return (Module)this.id_class[id_throws[11]];
    }

    public void id_break(boolean bl) {
        String string = bl ? ((Module)this.id_class[id_throws[5]]).aH_() : ((Module)this.id_class[id_throws[6]]).id_extends();
        this.id_class[rrqA_2.id_throws[7]] = string;
        Float f = Float.valueOf((int)Math.ceil(((rrZO)ArrayListHud.id_break[id_throws[8]]).id_break((String)this.id_class[id_throws[9]])));
        this.id_class[rrqA_2.id_throws[10]] = f;
    }

    public String id_throws() {
        return (String)this.id_class[id_throws[13]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrqA_2.id_case();
        rrqA_2.id_implements();
        rrqA_2.id_private();
        rrqA_2.id_catch();
    }

    private void id_finally() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[3] = Float.valueOf(0.0f);
        }
    }

    private static void id_catch() {
        id_protected = new byte[]{4, 3};
    }

    private static void id_case() {
        id_break = new boolean[1];
    }

    private static void id_implements() {
        float[] fArray = new float[2];
        fArray[0] = 0.4f;
        id_byte = fArray;
    }

    public float id_protected() {
        return ((Float)this.id_class[id_throws[14]]).floatValue();
    }

    private static void id_private() {
        short[] sArray = new short[15];
        sArray[0] = 1;
        sArray[2] = 7;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 3;
        id_throws = sArray;
    }
}

