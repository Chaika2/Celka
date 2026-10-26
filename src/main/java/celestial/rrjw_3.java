/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.ViaBackwardsPlatform
 */
package celestial;

import celestial.rrjA_2;
import com.viaversion.viabackwards.api.ViaBackwardsPlatform;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjw_3
implements ViaBackwardsPlatform {
    public Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    public rrjw_3(File file) {
        this.id_byte();
        File file2 = file;
        this.id_class[rrjw_3.id_break[0]] = file2;
        File file3 = (File)this.id_class[id_break[1]];
        this.init(new File(file3, "config.yml"));
    }

    static {
        rrjw_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x85E91BEC;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-81, -16, -3, -30, -2, -117, -109, -66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[2] = 1;
        id_break = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5F9D956789CA9C8L;
    }

    public Logger getLogger() {
        return (Logger)rrjA_2.id_break[id_break[2]];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjw_3.id_break();
        rrjw_3.id_class();
    }

    public void disable() {
    }

    public File getDataFolder() {
        return (File)this.id_class[id_break[3]];
    }

    public boolean isOutdated() {
        return id_byte[0];
    }
}

