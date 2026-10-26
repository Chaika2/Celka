/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.event.EventTarget;
import celestial.module.movement.Speed;
import celestial.rrIm_1;
import celestial.rrLz_1;
import celestial.rrTF;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlE_2
extends rrTF<Speed> {
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static float[] id_case;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    public rrlE_2(Speed speed) {
        super(speed);
        this.id_break();
        rrIm_1 rrIm_12 = new rrIm_1(id_break[0], Float.valueOf(id_case[0]), Float.valueOf(id_case[1]), Float.valueOf(id_case[2]), Float.valueOf(id_case[3]));
        this.id_class[rrlE_2.id_protected[0]] = rrIm_12;
        speed.id_class((Setting)((rrIm_1)this.id_class[id_protected[1]]).id_class(() -> speed.id_new() == this ? id_byte[0] : id_byte[1]));
    }

    static {
        rrlE_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4E359EF7B88A64F8L;
    }

    private static void id_class() {
        id_break = new String[]{new String("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c")};
    }

    @EventTarget
    public void id_class(rrLz_1 rrLz_12) {
        this.id_break();
        rrLz_12.id_class(((Float)((rrIm_1)this.id_class[id_protected[2]]).id_byte()).floatValue());
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2EFECFF1;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{87, -112, 108, 79, 47, 72, 43, -112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    private static void id_throws() {
        id_protected = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrlE_2.id_byte();
        rrlE_2.id_class();
        rrlE_2.id_protected();
        rrlE_2.id_throws();
    }

    private static void id_protected() {
        id_case = new float[]{0.5f, 0.3f, 2.0f, 0.1f};
    }
}

