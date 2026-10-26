/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrvz_1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvW {
    private static boolean[] id_break;
    private static short[] id_byte;
    private static String[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-23, 72, 24, 107, -25, -53, -86, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_byte() {
        return (String)this.id_class[id_byte[4]];
    }

    public rrvW(String string) {
        ArrayList arrayList;
        this.id_case();
        this.id_class[rrvW.id_byte[0]] = arrayList = new ArrayList();
        String string2 = string;
        this.id_class[rrvW.id_byte[1]] = string2;
    }

    static {
        rrvW.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEC8EF7B1;
    }

    public void id_class(String string) {
        String string2 = string;
        this.id_class[rrvW.id_byte[6]] = string2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x19329233A2B3A8D7L;
    }

    public void id_class(rrvz_1 rrvz_12) {
        ((List)this.id_class[id_byte[7]]).add(rrvz_12);
    }

    public String id_class() {
        return (String)this.id_class[id_byte[3]];
    }

    public void id_break(String string) {
        String string2 = string;
        this.id_class[rrvW.id_byte[5]] = string2;
    }

    public void id_break() throws IOException {
    }

    private static void id_throws() {
        short[] sArray = new short[15];
        sArray[0] = 3;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 1;
        sArray[9] = 3;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 3;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvW.id_catch();
        rrvW.id_private();
        rrvW.id_throws();
        rrvW.id_implements();
    }

    private static void id_catch() {
        id_break = new boolean[]{true};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[2]];
        }
    }

    private static void id_implements() {
        id_throws = new byte[]{8, 8, 4};
    }

    public String id_protected() {
        return (String)this.id_class[id_byte[2]];
    }

    private static void id_private() {
        id_protected = new String[]{new String("Set content or add at least one EmbedObject"), new String("content"), new String("username"), new String("title"), new String("description"), new String("url"), new String("color"), new String("url"), new String("image"), new String("name"), new String("value"), new String("inline"), new String("fields"), new String("embeds"), new String("Content-Type"), new String("application/json"), new String("User-Agent"), new String("Java-DiscordWebhook-BY-Gelox_"), new String("POST")};
    }
}

