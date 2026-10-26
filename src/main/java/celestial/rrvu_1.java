/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  discord.DiscordUser
 */
package celestial;

import celestial.Ak_1;
import celestial.rrZr_1;
import celestial.rrfT_2;
import celestial.rrfp_3;
import celestial.rrvW;
import celestial.rrvz_1;
import celestial.util.MinecraftAccessor;
import com.google.gson.JsonObject;
import discord.DiscordUser;
import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvu_1
extends Enum<rrvu_1>
implements MinecraftAccessor {
    public static Object[] staticFields795d62f6fe74334786edf14455ec3bfd;
    private static boolean[] booleans795d62f6fe74334786edf14455ec3bfd;
    private static double[] doubles795d62f6fe74334786edf14455ec3bfd;
    private static String[] strings795d62f6fe74334786edf14455ec3bfd;
    private static short[] shorts795d62f6fe74334786edf14455ec3bfd;
    private static byte[] bytes795d62f6fe74334786edf14455ec3bfd;

    private static void id_byte() {
        strings795d62f6fe74334786edf14455ec3bfd = new String[]{new String("Celestial Audit"), new String("IP - "), new String("query"), new String(", Country - "), new String("country"), new String(", City - "), new String("city"), new String(""), new String("Anticheat message"), new String("Data:"), new String(""), new String("Game name:"), new String("Full message:"), new String("Server IP:"), new String(""), new String("Geolocation:"), new String("Build:"), new String("1.1"), new String("Time:"), new String("Europe/Moscow"), new String(""), new String("User was banned!"), new String("Data:"), new String(""), new String("Game name:"), new String("Reason:"), new String("Duration:"), new String("Banned by:"), new String("Ban time:"), new String("Mode data:"), new String("Server IP:"), new String("Unknown"), new String("Build:"), new String("1.1"), new String("Time:"), new String("Europe/Moscow"), new String(""), new String("User was banned!"), new String("Data:"), new String(""), new String("Game name:"), new String("Reason:"), new String("Duration:"), new String("Server IP:"), new String("Unknown"), new String("Build:"), new String("1.1"), new String("Time:"), new String("Europe/Moscow"), new String(""), new String(""), new String("Message"), new String("Data:"), new String("Report:"), new String("Time:"), new String("Europe/Moscow"), new String(""), new String("Data:"), new String("Game name:"), new String("Time:"), new String("Europe/Moscow"), new String("0.0.0.0"), new String("Failed Check"), new String("This is Number IP"), new String(""), new String("User started client!"), new String("Data:"), new String(""), new String(""), new String("Geolocation:"), new String("Computer name:"), new String("user.name"), new String("COMPUTERNAME"), new String("Client Version:"), new String("1.1"), new String("Java version:"), new String("java.version"), new String("Time:"), new String("Europe/Moscow"), new String("https://celka.xyz/payment"), new String("INSTANCE"), new String("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$"), new String(""), new String(""), new String(""), new String(""), new String(""), new String("")};
    }

    static {
        rrvu_1.ntfClinit();
    }

    public static rrvu_1[] values() {
        return (rrvu_1[])((rrvu_1[])staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[0]]).clone();
    }

    public static rrvu_1 valueOf(String string) {
        return Enum.valueOf(rrvu_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2F7ADF9B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD886B6C767981260L;
    }

    public void id_class(rrZr_1 rrZr_12, String string, Runnable runnable) {
        ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[3]]).execute(() -> {
            try {
                rrvW rrvW2 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[49]);
                DiscordUser discordUser = rrZr_12.id_class();
                Object object = discordUser == null ? strings795d62f6fe74334786edf14455ec3bfd[50] : "<@" + discordUser.userId + ">";
                rrvW2.id_class(new rrvz_1().id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[3]))).id_throws(strings795d62f6fe74334786edf14455ec3bfd[51]).id_class(strings795d62f6fe74334786edf14455ec3bfd[52], "Username - " + rrZr_12.id_break() + ", Discord User - " + (String)object, booleans795d62f6fe74334786edf14455ec3bfd[24]).id_class(strings795d62f6fe74334786edf14455ec3bfd[53], string, booleans795d62f6fe74334786edf14455ec3bfd[25]).id_class(strings795d62f6fe74334786edf14455ec3bfd[54], rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[55]), booleans795d62f6fe74334786edf14455ec3bfd[26]));
                this.id_class(rrvW2);
                runnable.run();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        });
    }

    public void id_class(rrZr_1 rrZr_12, String string, String string2, String string3, String string4, String string5) {
        ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[5]]).execute(() -> {
            try {
                rrvW rrvW2 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[20]);
                rrvW2.id_class(new rrvz_1().id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[1]))).id_throws(strings795d62f6fe74334786edf14455ec3bfd[21]).id_class(strings795d62f6fe74334786edf14455ec3bfd[22], "Username - " + rrZr_12.id_break() + ", UID - " + rrZr_12.id_protected() + ", Discord - " + (rrZr_12.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[23] : rrZr_12.id_class().username), booleans795d62f6fe74334786edf14455ec3bfd[7]).id_class(strings795d62f6fe74334786edf14455ec3bfd[24], id_import.id_while().id_byte(), booleans795d62f6fe74334786edf14455ec3bfd[8]).id_class(strings795d62f6fe74334786edf14455ec3bfd[25], string, booleans795d62f6fe74334786edf14455ec3bfd[9]).id_class(strings795d62f6fe74334786edf14455ec3bfd[26], string2, booleans795d62f6fe74334786edf14455ec3bfd[10]).id_class(strings795d62f6fe74334786edf14455ec3bfd[27], string3, booleans795d62f6fe74334786edf14455ec3bfd[11]).id_class(strings795d62f6fe74334786edf14455ec3bfd[28], string4, booleans795d62f6fe74334786edf14455ec3bfd[12]).id_class(strings795d62f6fe74334786edf14455ec3bfd[29], string5, booleans795d62f6fe74334786edf14455ec3bfd[13]).id_class(strings795d62f6fe74334786edf14455ec3bfd[30], (Ak_1)rrfp_3.id_class[shorts795d62f6fe74334786edf14455ec3bfd[7]] == null ? strings795d62f6fe74334786edf14455ec3bfd[31] : ((Ak_1)rrfp_3.id_class[rrvu_1.shorts795d62f6fe74334786edf14455ec3bfd[8]]).id_break, booleans795d62f6fe74334786edf14455ec3bfd[14]).id_class(strings795d62f6fe74334786edf14455ec3bfd[32], strings795d62f6fe74334786edf14455ec3bfd[33], booleans795d62f6fe74334786edf14455ec3bfd[15]).id_class(strings795d62f6fe74334786edf14455ec3bfd[34], rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[35]), booleans795d62f6fe74334786edf14455ec3bfd[16]));
                this.id_class(rrvW2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        });
    }

    public void id_class(rrZr_1 rrZr_12, String string, String string2) {
        ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[6]]).execute(() -> {
            try {
                rrvW rrvW2 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[7]);
                rrvW2.id_class(new rrvz_1().id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[0]))).id_throws(strings795d62f6fe74334786edf14455ec3bfd[8]).id_class(strings795d62f6fe74334786edf14455ec3bfd[9], "Username - " + rrZr_12.id_break() + ", UID - " + rrZr_12.id_protected() + ", Discord - " + (rrZr_12.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[10] : rrZr_12.id_class().username), booleans795d62f6fe74334786edf14455ec3bfd[0]).id_class(strings795d62f6fe74334786edf14455ec3bfd[11], id_import.id_while().id_byte(), booleans795d62f6fe74334786edf14455ec3bfd[1]).id_class(strings795d62f6fe74334786edf14455ec3bfd[12], string, booleans795d62f6fe74334786edf14455ec3bfd[2]).id_class(strings795d62f6fe74334786edf14455ec3bfd[13], string2 != null ? string2 : strings795d62f6fe74334786edf14455ec3bfd[14], booleans795d62f6fe74334786edf14455ec3bfd[3]).id_class(strings795d62f6fe74334786edf14455ec3bfd[15], rrvu_1.id_protected(), booleans795d62f6fe74334786edf14455ec3bfd[4]).id_class(strings795d62f6fe74334786edf14455ec3bfd[16], strings795d62f6fe74334786edf14455ec3bfd[17], booleans795d62f6fe74334786edf14455ec3bfd[5]).id_class(strings795d62f6fe74334786edf14455ec3bfd[18], rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[19]), booleans795d62f6fe74334786edf14455ec3bfd[6]));
                this.id_class(rrvW2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        });
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrvu_1(), strings795d62f6fe74334786edf14455ec3bfd[82], strings795d62f6fe74334786edf14455ec3bfd[83], strings795d62f6fe74334786edf14455ec3bfd[84], strings795d62f6fe74334786edf14455ec3bfd[85], strings795d62f6fe74334786edf14455ec3bfd[86], strings795d62f6fe74334786edf14455ec3bfd[87], Pattern.compile(strings795d62f6fe74334786edf14455ec3bfd[81], 0), Executors.newSingleThreadExecutor(), new rrvu_1[]{(rrvu_1)objectArray[0]}};
        staticFields795d62f6fe74334786edf14455ec3bfd = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-12, -96, 8, 127, -61, 94, -29, 73}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrZr_1 rrZr_12) {
        ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[1]]).execute(() -> {
            try {
                rrvW rrvW2 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[64]);
                rrvW2.id_class(new rrvz_1().id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[5]))).id_throws(strings795d62f6fe74334786edf14455ec3bfd[65]).id_class(strings795d62f6fe74334786edf14455ec3bfd[66], "Username - " + rrZr_12.id_break() + ", UID - " + rrZr_12.id_protected() + ", Discord Name - " + (rrZr_12.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[67] : rrZr_12.id_class().username) + ", Discord ID - " + (rrZr_12.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[68] : rrZr_12.id_class().userId), booleans795d62f6fe74334786edf14455ec3bfd[31]).id_class(strings795d62f6fe74334786edf14455ec3bfd[69], rrvu_1.id_protected(), booleans795d62f6fe74334786edf14455ec3bfd[32]).id_class(strings795d62f6fe74334786edf14455ec3bfd[70], System.getProperty(strings795d62f6fe74334786edf14455ec3bfd[71]) + ", " + System.getenv(strings795d62f6fe74334786edf14455ec3bfd[72]), booleans795d62f6fe74334786edf14455ec3bfd[33]).id_class(strings795d62f6fe74334786edf14455ec3bfd[73], strings795d62f6fe74334786edf14455ec3bfd[74], booleans795d62f6fe74334786edf14455ec3bfd[34]).id_class(strings795d62f6fe74334786edf14455ec3bfd[75], System.getProperty(strings795d62f6fe74334786edf14455ec3bfd[76]), booleans795d62f6fe74334786edf14455ec3bfd[35]).id_class(strings795d62f6fe74334786edf14455ec3bfd[77], rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[78]), booleans795d62f6fe74334786edf14455ec3bfd[36]).id_class(strings795d62f6fe74334786edf14455ec3bfd[79]));
                this.id_class(rrvW2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        });
    }

    public void id_class(rrvW rrvW2) throws IOException {
        rrvW2.id_class(strings795d62f6fe74334786edf14455ec3bfd[0]);
        rrvW2.id_break();
    }

    public void id_class(rrZr_1 rrZr_12, String string) {
        ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[2]]).execute(() -> {
            try {
                rrvW rrvW2 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[56]);
                rrvz_1 rrvz_12 = new rrvz_1().id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[4]))).id_throws(string).id_class(strings795d62f6fe74334786edf14455ec3bfd[57], "Username - " + rrZr_12.id_break() + ", UID - " + rrZr_12.id_protected(), booleans795d62f6fe74334786edf14455ec3bfd[27]).id_class(strings795d62f6fe74334786edf14455ec3bfd[58], id_import.id_while().id_byte(), booleans795d62f6fe74334786edf14455ec3bfd[28]).id_class(strings795d62f6fe74334786edf14455ec3bfd[59], rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[60]), booleans795d62f6fe74334786edf14455ec3bfd[29]);
                if (!string.equals(strings795d62f6fe74334786edf14455ec3bfd[61]) && ((Pattern)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[11]]).matcher(string).matches()) {
                    rrvz_12.id_class(strings795d62f6fe74334786edf14455ec3bfd[62], strings795d62f6fe74334786edf14455ec3bfd[63], booleans795d62f6fe74334786edf14455ec3bfd[30]);
                }
                rrvW2.id_class(rrvz_12);
                this.id_class(rrvW2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        });
    }

    public void id_break(rrZr_1 rrZr_12, String string, String string2) {
        ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[4]]).execute(() -> {
            try {
                rrvW rrvW2 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[36]);
                rrvW2.id_class(new rrvz_1().id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[2]))).id_throws(strings795d62f6fe74334786edf14455ec3bfd[37]).id_class(strings795d62f6fe74334786edf14455ec3bfd[38], "Username - " + rrZr_12.id_break() + ", UID - " + rrZr_12.id_protected() + ", Discord - " + (rrZr_12.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[39] : rrZr_12.id_class().username), booleans795d62f6fe74334786edf14455ec3bfd[17]).id_class(strings795d62f6fe74334786edf14455ec3bfd[40], id_import.id_while().id_byte(), booleans795d62f6fe74334786edf14455ec3bfd[18]).id_class(strings795d62f6fe74334786edf14455ec3bfd[41], string, booleans795d62f6fe74334786edf14455ec3bfd[19]).id_class(strings795d62f6fe74334786edf14455ec3bfd[42], string2, booleans795d62f6fe74334786edf14455ec3bfd[20]).id_class(strings795d62f6fe74334786edf14455ec3bfd[43], (Ak_1)rrfp_3.id_class[shorts795d62f6fe74334786edf14455ec3bfd[9]] == null ? strings795d62f6fe74334786edf14455ec3bfd[44] : ((Ak_1)rrfp_3.id_class[rrvu_1.shorts795d62f6fe74334786edf14455ec3bfd[10]]).id_break, booleans795d62f6fe74334786edf14455ec3bfd[21]).id_class(strings795d62f6fe74334786edf14455ec3bfd[45], strings795d62f6fe74334786edf14455ec3bfd[46], booleans795d62f6fe74334786edf14455ec3bfd[22]).id_class(strings795d62f6fe74334786edf14455ec3bfd[47], rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[48]), booleans795d62f6fe74334786edf14455ec3bfd[23]));
                this.id_class(rrvW2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        });
    }

    private static void id_break() {
        bytes795d62f6fe74334786edf14455ec3bfd = new byte[]{9, 7, 8, 10, 2, 3, 4, 5, 6};
    }

    private static void id_throws() {
        doubles795d62f6fe74334786edf14455ec3bfd = new double[]{1.6777216E7, 1.6777216E7, 1.6777216E7, 1.6777216E7, 1.6777216E7, 1.6777216E7};
    }

    private static /* synthetic */ void ntfClinit() {
        rrvu_1.id_private();
        rrvu_1.id_byte();
        rrvu_1.id_case();
        rrvu_1.id_throws();
        rrvu_1.id_break();
        rrvu_1.id_class();
    }

    private static /* synthetic */ rrvu_1[] id_catch() {
        rrvu_1[] rrvu_1Array = new rrvu_1[booleans795d62f6fe74334786edf14455ec3bfd[37]];
        rrvu_1Array[rrvu_1.booleans795d62f6fe74334786edf14455ec3bfd[38]] = (rrvu_1)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[12]];
        return rrvu_1Array;
    }

    private static void id_case() {
        short[] sArray = new short[13];
        sArray[0] = 9;
        sArray[1] = 8;
        sArray[2] = 8;
        sArray[3] = 8;
        sArray[4] = 8;
        sArray[5] = 8;
        sArray[6] = 8;
        sArray[11] = 7;
        shorts795d62f6fe74334786edf14455ec3bfd = sArray;
    }

    private static String id_protected() {
        JsonObject jsonObject = rrfT_2.id_break();
        StringBuilder stringBuilder = new StringBuilder();
        if (jsonObject != null) {
            stringBuilder.append(strings795d62f6fe74334786edf14455ec3bfd[1]).append(jsonObject.get(strings795d62f6fe74334786edf14455ec3bfd[2]).getAsString()).append(strings795d62f6fe74334786edf14455ec3bfd[3]).append(jsonObject.get(strings795d62f6fe74334786edf14455ec3bfd[4]).getAsString()).append(strings795d62f6fe74334786edf14455ec3bfd[5]).append(jsonObject.get(strings795d62f6fe74334786edf14455ec3bfd[6]).getAsString());
        }
        return stringBuilder.toString();
    }

    private static void id_private() {
        boolean[] blArray = new boolean[42];
        blArray[37] = true;
        blArray[41] = true;
        booleans795d62f6fe74334786edf14455ec3bfd = blArray;
    }
}

