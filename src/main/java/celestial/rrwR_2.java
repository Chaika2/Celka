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

public class rrwR_2
implements rrwj_3 {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        id_protected = new String[]{new String("creeperfarm")};
    }

    public rrwR_2(String string) {
        this.id_case();
        String string2 = string;
        this.id_class[rrwR_2.id_break[0]] = string2;
        File file = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]]).id_break().id_class(id_protected[0]), string + ".celka");
        this.id_class[rrwR_2.id_break[2]] = file;
        if (!((File)this.id_class[id_break[3]]).exists()) {
            try {
                ((File)this.id_class[id_break[4]]).createNewFile();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    static {
        rrwR_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCBEE531A;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{33, 111, -66, 22, 87, 38, 111, -46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[6]]).id_implements().id_protected().forEach(rrwj_32 -> rrwj_32.id_class(jsonObject));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9C1D939B290E2153L;
    }

    public File id_class() {
        return (File)this.id_class[id_break[8]];
    }

    public String id_break() {
        return (String)this.id_class[id_break[7]];
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[5]]).id_implements().id_protected().forEach(rrwj_32 -> rrwj_32.id_break(jsonObject));
    }

    private static void id_throws() {
        short[] sArray = new short[9];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[8] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwR_2.id_byte();
        rrwR_2.id_throws();
        rrwR_2.id_protected();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

