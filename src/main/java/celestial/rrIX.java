/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrQJ;
import celestial.rrQX;
import celestial.rrZr_1;
import celestial.rrwj_3;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIX
implements rrwj_3 {
    private static String[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    public void id_byte() {
        try {
            JsonObject jsonObject = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[10]]).id_break().id_break(this.id_throws()).getAsJsonObject();
            if (jsonObject == null) {
                return;
            }
            if (jsonObject.has(id_break[4])) {
                this.id_byte(jsonObject.get(id_break[5]).getAsString());
            }
            if (jsonObject.has(id_break[6])) {
                this.id_break(jsonObject.get(id_break[7]).getAsString());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void id_byte(String string) {
        String string2 = string;
        this.id_class[rrIX.id_protected[19]] = string2;
    }

    public rrIX(String string) {
        this.id_case();
        String string2 = string;
        this.id_class[rrIX.id_protected[0]] = string2;
        String string3 = ((rrZr_1)rrQJ.id_class[id_protected[1]]).id_break();
        this.id_class[rrIX.id_protected[2]] = string3;
        String string4 = LocalDateTime.now().format(DateTimeFormatter.ofPattern(id_break[0]));
        this.id_class[rrIX.id_protected[3]] = string4;
        File file = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[4]]).id_break().id_class(id_break[1]), string + ".celka");
        this.id_class[rrIX.id_protected[5]] = file;
        if (!((File)this.id_class[id_protected[6]]).exists()) {
            try {
                ((File)this.id_class[id_protected[7]]).createNewFile();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    static {
        rrIX.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x990495FDB74B3F66L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-128, 41, -123, -68, 69, -5, -35, 83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC9E0DDF1;
    }

    public String id_class() {
        return (String)this.id_class[id_protected[11]];
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[8]]).id_catch().id_byte().forEach(rrwj_32 -> rrwj_32.id_class(jsonObject));
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        jsonObject.addProperty(id_break[2], this.id_protected());
        jsonObject.addProperty(id_break[3], this.id_break());
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[9]]).id_catch().id_byte().forEach(rrwj_32 -> rrwj_32.id_break(jsonObject));
    }

    public String id_break() {
        return (String)this.id_class[id_protected[13]];
    }

    public void id_break(String string) {
        String string2 = string;
        this.id_class[rrIX.id_protected[20]] = string2;
    }

    public File id_throws() {
        return (File)this.id_class[id_protected[14]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIX.id_private();
        rrIX.id_catch();
        rrIX.id_implements();
    }

    private static void id_catch() {
        short[] sArray = new short[21];
        sArray[1] = 5;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[5] = 3;
        sArray[6] = 3;
        sArray[7] = 3;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 3;
        sArray[18] = 3;
        sArray[19] = 1;
        sArray[20] = 2;
        id_protected = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_implements() {
        id_byte = new byte[]{4};
    }

    public void id_protected(String string) {
        File file = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[15]]).id_break().id_class(id_break[8]);
        File file2 = new File(file, (String)this.id_class[id_protected[16]] + ".celka");
        File file3 = new File(file, string + ".celka");
        if (file2.exists() && file2.renameTo(file3)) {
            String string2 = string;
            this.id_class[rrIX.id_protected[17]] = string2;
        }
        File file4 = file3;
        this.id_class[rrIX.id_protected[18]] = file4;
    }

    public String id_protected() {
        return (String)this.id_class[id_protected[12]];
    }

    private static void id_private() {
        id_break = new String[]{new String("dd.MM.yyyy"), new String("configs"), new String("author"), new String("created"), new String("author"), new String("author"), new String("created"), new String("created"), new String("configs")};
    }
}

