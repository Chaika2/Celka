/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.module.Category;
import celestial.rdn_3;
import celestial.rrFK;
import celestial.rrZT;
import celestial.rrtu_3;
import celestial.rrvx_1;
import celestial.util.AnimValue;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrZN
implements MinecraftAccessor {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    public void id_byte(int n, int n2, int n3) {
    }

    public rrZN() {
        this.id_volatile();
        rrvx_1 rrvx_12 = new rrvx_1();
        this.id_class[rrZN.id_break[0]] = rrvx_12;
    }

    static {
        rrZN.ntfClinit();
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl) {
        return !bl || !rrtu_3.id_class(rrtu_32, n, n2) ? id_protected[6] : id_protected[7];
    }

    public void id_class(rrFK rrFK2) {
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        return !bl || !rrtu_3.id_class(rrtu_32, n, n2) ? id_protected[2] : id_protected[3];
    }

    public void id_class(Category category, Category category2) {
        AnimValue animValue = this.id_implements().id_class();
        animValue.id_extends();
        rrZN rrZN2 = this;
        if (rrZN2 instanceof rrZT) {
            rrZT rrZT2 = (rrZT)((Object)rrZN2);
            rrZT2.id_case().id_package().id_extends();
        }
    }

    public boolean id_class(int n, int n2, float f, float f2, float f3, float f4) {
        return (float)n >= f && (float)n <= f + f3 && (float)n2 >= f2 && (float)n2 <= f2 + f4 ? id_protected[11] : id_protected[12];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC2D9BE43533726BDL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEC344E2A;
    }

    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        return !bl || !rrtu_3.id_class(rrtu_32, n, n2) ? id_protected[4] : id_protected[5];
    }

    public boolean id_class(int n, int n2, int n3) {
        return id_protected[8];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-109, 106, -17, -74, 48, -109, 44, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class(char c, int n) {
        return id_protected[9];
    }

    public void id_break(int n, int n2, int n3) {
    }

    public void id_throws() {
    }

    private static /* synthetic */ void ntfClinit() {
        rrZN.id_extends();
        rrZN.id_native();
        rrZN.id_finally();
    }

    private static void id_finally() {
        id_byte = new byte[]{2};
    }

    public void id_catch() {
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[15];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[13] = true;
        id_protected = blArray;
    }

    public rrvx_1 id_implements() {
        return (rrvx_1)this.id_class[id_break[4]];
    }

    public void id_protected() {
    }

    public void id_private() {
    }

    private void id_volatile() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrZN.id_protected[13]] = id_protected[14];
        }
    }

    private static void id_native() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    public void d_(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrZN.id_break[2]] = bl2;
    }

    public boolean ai_() {
        return (Boolean)this.id_class[id_break[1]];
    }

    public boolean aj_() {
        return id_protected[10];
    }

    public boolean ak_() {
        AnimValue animValue = this.id_implements().id_class();
        return (Boolean)this.id_class[id_break[3]] != false && animValue.id_new() && animValue.id_protected() ? id_protected[0] : id_protected[1];
    }

    public rdn_3 ag_() {
        return null;
    }
}

