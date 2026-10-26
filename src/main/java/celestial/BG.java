/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BG
extends Enum<BG> {
    public Object[] fieldsd25d445181413210921a2969c1bcd756;
    private static short[] shortsd25d445181413210921a2969c1bcd756;
    private static String[] stringsd25d445181413210921a2969c1bcd756;
    private static byte[] bytesd25d445181413210921a2969c1bcd756;
    public static Object[] staticFieldsd25d445181413210921a2969c1bcd756;
    private static boolean[] booleansd25d445181413210921a2969c1bcd756;

    private static void id_byte() {
        short[] sArray = new short[9];
        sArray[0] = 5;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 3;
        shortsd25d445181413210921a2969c1bcd756 = sArray;
    }

    private BG(String string2) {
        this.id_catch();
        rgn_3 rgn_32 = new rgn_3("menu." + this.name().toLowerCase());
        this.fieldsd25d445181413210921a2969c1bcd756[BG.shortsd25d445181413210921a2969c1bcd756[3]] = rgn_32;
        String string3 = string2;
        this.fieldsd25d445181413210921a2969c1bcd756[BG.shortsd25d445181413210921a2969c1bcd756[4]] = string3;
    }

    static {
        BG.ntfClinit();
    }

    public static BG[] values() {
        return (BG[])((BG[])staticFieldsd25d445181413210921a2969c1bcd756[shortsd25d445181413210921a2969c1bcd756[0]]).clone();
    }

    public static BG valueOf(String string) {
        return Enum.valueOf(BG.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC001EBC373716488L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A66391;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{54, -46, -4, -68, -126, -120, 73, 100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.fieldsd25d445181413210921a2969c1bcd756[shortsd25d445181413210921a2969c1bcd756[1]];
    }

    public rgn_3 id_break() {
        return (rgn_3)this.fieldsd25d445181413210921a2969c1bcd756[shortsd25d445181413210921a2969c1bcd756[2]];
    }

    private static void id_throws() {
        stringsd25d445181413210921a2969c1bcd756 = new String[]{new String("TELEGRAM"), new String("https://t.me/CelestialMinecraft"), new String("TELEGRAM_CHAT"), new String("https://t.me/+WryXTDhad-s4NzEy"), new String("DISCORD"), new String("https://discord.gg/celestialdlc"), new String("VK"), new String("https://vk.com/celestialclient")};
    }

    private static /* synthetic */ void ntfClinit() {
        BG.id_case();
        BG.id_throws();
        BG.id_byte();
        BG.id_implements();
        BG.id_private();
    }

    private void id_catch() {
        if (this.fieldsd25d445181413210921a2969c1bcd756 == null) {
            Object[] objectArray = this.fieldsd25d445181413210921a2969c1bcd756 = new Object[bytesd25d445181413210921a2969c1bcd756[9]];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansd25d445181413210921a2969c1bcd756 = blArray;
    }

    private static void id_implements() {
        bytesd25d445181413210921a2969c1bcd756 = new byte[]{4, 2, 3, 2, 2, 3, 3, 5, 4, 2, 6};
    }

    private static /* synthetic */ BG[] id_protected() {
        BG[] bGArray = new BG[bytesd25d445181413210921a2969c1bcd756[0]];
        bGArray[BG.booleansd25d445181413210921a2969c1bcd756[0]] = (BG)((Object)staticFieldsd25d445181413210921a2969c1bcd756[shortsd25d445181413210921a2969c1bcd756[5]]);
        bGArray[BG.booleansd25d445181413210921a2969c1bcd756[1]] = (BG)((Object)staticFieldsd25d445181413210921a2969c1bcd756[shortsd25d445181413210921a2969c1bcd756[6]]);
        bGArray[BG.bytesd25d445181413210921a2969c1bcd756[1]] = (BG)((Object)staticFieldsd25d445181413210921a2969c1bcd756[shortsd25d445181413210921a2969c1bcd756[7]]);
        bGArray[BG.bytesd25d445181413210921a2969c1bcd756[2]] = (BG)((Object)staticFieldsd25d445181413210921a2969c1bcd756[shortsd25d445181413210921a2969c1bcd756[8]]);
        return bGArray;
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new BG(stringsd25d445181413210921a2969c1bcd756[1]), new BG(stringsd25d445181413210921a2969c1bcd756[3]), new BG(stringsd25d445181413210921a2969c1bcd756[5]), new BG(stringsd25d445181413210921a2969c1bcd756[7]), new BG[]{(BG)((Object)objectArray[0]), (BG)((Object)objectArray[1]), (BG)((Object)objectArray[2]), (BG)((Object)objectArray[3])}, new BG[]{(BG)((Object)objectArray[0]), (BG)((Object)objectArray[1]), (BG)((Object)objectArray[2]), (BG)((Object)objectArray[3])}};
        staticFieldsd25d445181413210921a2969c1bcd756 = objectArray;
    }
}

