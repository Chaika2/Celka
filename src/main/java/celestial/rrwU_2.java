/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrQX;
import celestial.rrwj_3;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwU_2
implements rrwj_3 {
    public Object[] id_class;
    private static String[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String("misc")};
    }

    public rrwU_2(String string) {
        this.id_case();
        String string2 = string;
        this.id_class[rrwU_2.id_byte[0]] = string2;
        File file = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[1]]).id_break().id_class(id_break[0]), string + ".celka");
        this.id_class[rrwU_2.id_byte[2]] = file;
        if (!((File)this.id_class[id_byte[3]]).exists()) {
            try {
                ((File)this.id_class[id_byte[4]]).createNewFile();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    static {
        rrwU_2.ntfClinit();
    }

    public String id_class() {
        return (String)this.id_class[id_byte[5]];
    }

    @Override
    public void id_class(JsonObject jsonObject) {
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x24938792;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2ABD76F5B11BBC93L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, 120, -75, 89, 63, 119, -13, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public File id_break() {
        return (File)this.id_class[id_byte[6]];
    }

    @Override
    public void id_break(JsonObject jsonObject) {
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwU_2.id_byte();
        rrwU_2.id_throws();
        rrwU_2.id_protected();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_protected() {
        id_protected = new byte[]{2};
    }
}

