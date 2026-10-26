/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_return;
import celestial.C_super;
import celestial.C_synchronized;
import celestial.SI;
import celestial.Sg_1;
import celestial.rYB;
import celestial.rqM_2;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SR
implements C_return {
    private static byte[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    public void id_byte() {
        C_class.id_interface().execute(() -> ((SI)this.id_class[id_protected[6]]).id_class());
    }

    public SR(Path path, rqM_2<rYB> rqM_22) {
        rqM_2<rYB> rqM_23;
        this.id_protected();
        Path path2 = path;
        this.id_class[SR.id_protected[0]] = path2;
        SI sI = new SI(path.resolve(id_byte[0]), rqM_22);
        this.id_class[SR.id_protected[1]] = sI;
        Sg_1 sg_1 = new Sg_1(path.resolve(id_byte[1]));
        this.id_class[SR.id_protected[2]] = sg_1;
        this.id_class[SR.id_protected[3]] = rqM_23 = rqM_22;
    }

    static {
        SR.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x26C5E238CF9463E2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x38EF39CD;
    }

    @Override
    public C_synchronized id_class() {
        return (Sg_1)this.id_class[id_protected[5]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-6, 105, 69, 117, 101, -126, 117, -20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public C_super id_break() {
        return (SI)this.id_class[id_protected[4]];
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[3] = 3;
        sArray[5] = 1;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        SR.id_private();
        SR.id_throws();
        SR.id_catch();
    }

    private static void id_catch() {
        id_break = new byte[]{4};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_private() {
        id_byte = new String[]{new String("cache"), new String("waypoints")};
    }
}

