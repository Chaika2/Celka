/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.Bl_1;
import celestial.rrje_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Bt_1
implements MinecraftAccessor {
    private static byte[] id_class;
    public Object[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    public Aw_1 id_byte() {
        return (Aw_1)this.id_break[id_byte[8]];
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{54, 32, -99, 117, -75, 112, 24, 75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Bt_1(String string) {
        this.id_break();
        String string2 = string;
        this.id_break[Bt_1.id_byte[0]] = string2;
        String string3 = string;
        this.id_break[Bt_1.id_byte[1]] = string3;
    }

    static {
        Bt_1.ntfClinit();
    }

    public void id_class(Aw_1 aw_1) {
        Aw_1 aw_12 = aw_1;
        this.id_break[Bt_1.id_byte[11]] = aw_12;
    }

    private static void id_class() {
        id_class = new byte[]{3};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4BE0E5CF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8326DB3B4F28845EL;
    }

    private void id_break() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_class[0]];
        }
    }

    public void id_throws(String string) {
        Matcher matcher = ((Pattern)Bl_1.id_class[id_byte[2]]).matcher(string);
        if (matcher.find()) {
            String string2 = matcher.group(id_protected[0]);
            Aw_1 aw_1 = id_import.id_void().id_class(string2);
            this.id_break[Bt_1.id_byte[3]] = aw_1;
        }
    }

    public String id_throws() {
        return (String)this.id_break[id_byte[6]];
    }

    private static /* synthetic */ void ntfClinit() {
        Bt_1.id_catch();
        Bt_1.id_private();
        Bt_1.id_class();
    }

    private static void id_catch() {
        id_protected = new boolean[]{true};
    }

    public void id_case(String string) {
        String string2 = string;
        this.id_break[Bt_1.id_byte[10]] = string2;
    }

    public boolean id_case() {
        return ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_byte[4]])).id_protected((String)this.id_break[id_byte[5]]);
    }

    public void id_protected(String string) {
        String string2 = string;
        this.id_break[Bt_1.id_byte[9]] = string2;
    }

    public String id_protected() {
        return (String)this.id_break[id_byte[7]];
    }

    private static void id_private() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        id_byte = sArray;
    }
}

