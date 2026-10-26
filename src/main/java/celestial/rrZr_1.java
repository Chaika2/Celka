/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  discord.DiscordUser
 */
package celestial;

import discord.DiscordUser;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZr_1 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    public String id_byte() {
        return (String)this.id_class[id_protected[5]];
    }

    public rrZr_1(String string, String string2) {
        this.id_private();
        String string3 = string;
        this.id_class[rrZr_1.id_protected[0]] = string3;
        String string4 = string2;
        this.id_class[rrZr_1.id_protected[1]] = string4;
    }

    static {
        rrZr_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return id_break[0];
        }
        if (!(object instanceof rrZr_1)) {
            return id_break[1];
        }
        rrZr_1 rrZr_12 = (rrZr_1)object;
        if (!rrZr_12.id_class(this)) {
            return id_break[2];
        }
        String string = this.id_break();
        String string2 = rrZr_12.id_break();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return id_break[3];
        }
        String string3 = this.id_protected();
        String string4 = rrZr_12.id_protected();
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return id_break[4];
        }
        DiscordUser discordUser = this.id_class();
        DiscordUser discordUser2 = rrZr_12.id_class();
        if (discordUser == null ? discordUser2 != null : !discordUser.equals(discordUser2)) {
            return id_break[5];
        }
        String string5 = this.id_byte();
        String string6 = rrZr_12.id_byte();
        if (string5 == null ? string6 != null : !string5.equals(string6)) {
            return id_break[6];
        }
        return id_break[7];
    }

    public String toString() {
        return "UserData(username=" + this.id_break() + ", id=" + this.id_protected() + ", discordUser=" + this.id_class() + ", avatarURL=" + this.id_byte() + ")";
    }

    public int hashCode() {
        byte by = id_byte[0];
        int n = id_break[8];
        String string = this.id_break();
        n = n * id_byte[1] + (string == null ? id_byte[2] : string.hashCode());
        String string2 = this.id_protected();
        n = n * id_byte[3] + (string2 == null ? id_byte[4] : string2.hashCode());
        DiscordUser discordUser = this.id_class();
        n = n * id_byte[5] + (discordUser == null ? id_byte[6] : discordUser.hashCode());
        String string3 = this.id_byte();
        n = n * id_byte[7] + (string3 == null ? id_byte[8] : string3.hashCode());
        return n;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC5DCF6A2;
    }

    public void id_class(DiscordUser discordUser) {
        DiscordUser discordUser2 = discordUser;
        this.id_class[rrZr_1.id_protected[6]] = discordUser2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x59D3894C36A7511CL;
    }

    public DiscordUser id_class() {
        return (DiscordUser)this.id_class[id_protected[4]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-10, 30, 85, -100, 100, -80, -72, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class(Object object) {
        return object instanceof rrZr_1;
    }

    public String id_break() {
        return (String)this.id_class[id_protected[2]];
    }

    public void id_break(String string) {
        String string2 = string;
        this.id_class[rrZr_1.id_protected[7]] = string2;
    }

    private static void id_throws() {
        id_byte = new byte[]{59, 59, 43, 59, 43, 59, 43, 59, 43, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        rrZr_1.id_case();
        rrZr_1.id_catch();
        rrZr_1.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 2;
        sArray[7] = 3;
        id_protected = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[7] = true;
        blArray[8] = true;
        id_break = blArray;
    }

    public String id_protected() {
        return (String)this.id_class[id_protected[3]];
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[9]];
        }
    }
}

