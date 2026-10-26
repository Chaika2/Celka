/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.event.EventTarget;
import celestial.module.movement.NoSlow;
import celestial.rrAB;
import celestial.rrIm_1;
import celestial.rrTF;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlr_3
extends rrTF<NoSlow> {
    public Object[] id_class;
    private static String[] id_break;
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static short[] id_case;

    private static void id_byte() {
        id_case = new short[3];
    }

    public rrlr_3(NoSlow noSlow) {
        super(noSlow);
        this.id_protected();
        rrIm_1 rrIm_12 = new rrIm_1(id_break[0], Float.valueOf(id_protected[0]), Float.valueOf(id_protected[1]), Float.valueOf(id_protected[2]), Float.valueOf(id_protected[3]));
        this.id_class[rrlr_3.id_case[0]] = rrIm_12;
        noSlow.id_class((Setting)((rrIm_1)this.id_class[id_case[1]]).id_class(() -> noSlow.id_new() == this ? id_byte[0] : id_byte[1]));
    }

    static {
        rrlr_3.ntfClinit();
    }

    @EventTarget
    public void id_class(rrAB rrAB2) {
        this.id_protected();
        rrAB2.id_break(((Float)((rrIm_1)this.id_class[id_case[2]]).id_byte()).floatValue() / id_protected[4]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, -114, -105, 52, -98, -34, -51, -32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE19045CF77FB5BDBL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x45B42FEE;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_break() {
        id_protected = new float[]{100.0f, 20.0f, 100.0f, 1.0f, 100.0f};
    }

    private static void id_throws() {
        id_break = new String[]{new String("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrlr_3.id_class();
        rrlr_3.id_throws();
        rrlr_3.id_break();
        rrlr_3.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }
}

