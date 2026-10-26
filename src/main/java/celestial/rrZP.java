/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  discord.DiscordEventHandlers
 *  discord.DiscordEventHandlers$Builder
 *  discord.DiscordRPC
 *  discord.DiscordRichPresence$Builder
 *  discord.helpers.RPCButton
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rrQJ;
import celestial.rrZB;
import celestial.rrZr_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrvu_1;
import celestial.util.MinecraftAccessor;
import discord.DiscordEventHandlers;
import discord.DiscordRPC;
import discord.DiscordRichPresence;
import discord.helpers.RPCButton;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZP
extends Enum<rrZP>
implements MinecraftAccessor {
    private static String[] stringsfda1a12b8e6d3a64af93b1c14ed22523;
    public Object[] fieldsfda1a12b8e6d3a64af93b1c14ed22523;
    private static byte[] bytesfda1a12b8e6d3a64af93b1c14ed22523;
    public static Object[] staticFieldsfda1a12b8e6d3a64af93b1c14ed22523;
    private static short[] shortsfda1a12b8e6d3a64af93b1c14ed22523;
    private static long[] longsfda1a12b8e6d3a64af93b1c14ed22523;
    private static boolean[] booleansfda1a12b8e6d3a64af93b1c14ed22523;

    private static /* synthetic */ rrZP[] id_byte() {
        rrZP[] rrZPArray = new rrZP[booleansfda1a12b8e6d3a64af93b1c14ed22523[3]];
        rrZPArray[rrZP.booleansfda1a12b8e6d3a64af93b1c14ed22523[4]] = (rrZP)staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[shortsfda1a12b8e6d3a64af93b1c14ed22523[13]];
        return rrZPArray;
    }

    private rrZP() {
        this.id_finally();
        Boolean bl = booleansfda1a12b8e6d3a64af93b1c14ed22523[0];
        this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[rrZP.shortsfda1a12b8e6d3a64af93b1c14ed22523[1]] = bl;
    }

    static {
        rrZP.ntfClinit();
    }

    public static rrZP[] values() {
        return (rrZP[])((rrZP[])staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[shortsfda1a12b8e6d3a64af93b1c14ed22523[0]]).clone();
    }

    public static rrZP valueOf(String string) {
        return Enum.valueOf(rrZP.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{58, 105, -101, -128, -97, -54, 27, -79}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD3CCC64BEF60650AL;
    }

    public void id_class() {
        DiscordRPC.INSTANCE.Discord_Shutdown();
        Boolean bl = booleansfda1a12b8e6d3a64af93b1c14ed22523[2];
        this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[rrZP.shortsfda1a12b8e6d3a64af93b1c14ed22523[2]] = bl;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF49446B8;
    }

    public void id_class(rrZr_1 rrZr_12) {
        Pair<String, String> pair = this.id_native();
        DiscordRichPresence.Builder builder = new DiscordRichPresence.Builder();
        builder.setStartTimestamp((Long)staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[shortsfda1a12b8e6d3a64af93b1c14ed22523[3]] / longsfda1a12b8e6d3a64af93b1c14ed22523[0]);
        builder.setDetails("UID \u00bb " + rrZr_12.id_protected());
        builder.setState(stringsfda1a12b8e6d3a64af93b1c14ed22523[2]);
        builder.setLargeImage(stringsfda1a12b8e6d3a64af93b1c14ed22523[3], stringsfda1a12b8e6d3a64af93b1c14ed22523[4]);
        builder.setSmallImage((String)pair.getLeft(), (String)pair.getRight());
        builder.setButtons(RPCButton.create((String)stringsfda1a12b8e6d3a64af93b1c14ed22523[5], (String)stringsfda1a12b8e6d3a64af93b1c14ed22523[6]), RPCButton.create((String)stringsfda1a12b8e6d3a64af93b1c14ed22523[7], (String)stringsfda1a12b8e6d3a64af93b1c14ed22523[8]));
        DiscordRPC.INSTANCE.Discord_UpdatePresence(builder.build());
    }

    public void id_break() {
        DiscordEventHandlers discordEventHandlers = new DiscordEventHandlers.Builder().ready(discordUser -> {
            Object object = stringsfda1a12b8e6d3a64af93b1c14ed22523[26];
            if (discordUser.avatar != null) {
                object = (String)object + discordUser.userId + "/" + discordUser.avatar + ".png";
            }
            ((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[9]]).id_class(discordUser);
            ((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[10]]).id_break((String)object);
            ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[shortsfda1a12b8e6d3a64af93b1c14ed22523[11]]).id_class((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[12]]);
        }).build();
        DiscordRPC.INSTANCE.Discord_Initialize(stringsfda1a12b8e6d3a64af93b1c14ed22523[0], discordEventHandlers, booleansfda1a12b8e6d3a64af93b1c14ed22523[1], stringsfda1a12b8e6d3a64af93b1c14ed22523[1]);
        new Thread(() -> {
            while (((Boolean)this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[shortsfda1a12b8e6d3a64af93b1c14ed22523[7]]).booleanValue()) {
                DiscordRPC.INSTANCE.Discord_RunCallbacks();
                this.id_class((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[8]]);
                try {
                    Thread.sleep(longsfda1a12b8e6d3a64af93b1c14ed22523[1]);
                }
                catch (InterruptedException interruptedException) {}
            }
        }).start();
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrZP(), stringsfda1a12b8e6d3a64af93b1c14ed22523[28], 1787089031580L, new rrZP[]{(rrZP)objectArray[0]}};
        staticFieldsfda1a12b8e6d3a64af93b1c14ed22523 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrZP.id_implements();
        rrZP.id_private();
        rrZP.id_protected();
        rrZP.id_catch();
        rrZP.id_case();
        rrZP.id_throws();
    }

    private void id_finally() {
        if (this.fieldsfda1a12b8e6d3a64af93b1c14ed22523 == null) {
            Object[] objectArray = this.fieldsfda1a12b8e6d3a64af93b1c14ed22523 = new Object[booleansfda1a12b8e6d3a64af93b1c14ed22523[7]];
            objectArray[rrZP.booleansfda1a12b8e6d3a64af93b1c14ed22523[8]] = booleansfda1a12b8e6d3a64af93b1c14ed22523[9];
        }
    }

    private static void id_catch() {
        short[] sArray = new short[14];
        sArray[0] = 3;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[6] = 5;
        sArray[8] = 5;
        sArray[9] = 5;
        sArray[10] = 5;
        sArray[12] = 5;
        shortsfda1a12b8e6d3a64af93b1c14ed22523 = sArray;
    }

    private static void id_case() {
        bytesfda1a12b8e6d3a64af93b1c14ed22523 = new byte[]{3, 2, 4, 2};
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[7] = true;
        blArray[10] = true;
        booleansfda1a12b8e6d3a64af93b1c14ed22523 = blArray;
    }

    private static void id_protected() {
        long[] lArray = new long[3];
        lArray[0] = 1000L;
        lArray[1] = 2000L;
        longsfda1a12b8e6d3a64af93b1c14ed22523 = lArray;
    }

    private static void id_private() {
        stringsfda1a12b8e6d3a64af93b1c14ed22523 = new String[]{new String("999325989563801640"), new String(""), new String("Build \u00bb 1.1 (1.16.5)"), new String("https://i.imgur.com/5OALbHi.png"), new String("t.me/CelestialMinecraft"), new String("\u041a\u0443\u043f\u0438\u0442\u044c"), new String("https://celestial.su/"), new String("\u0422\u0435\u043b\u0435\u0433\u0440\u0430\u043c"), new String("https://t.me/CelestialMinecraft"), new String("https://smertnix55551.github.io/funtime.jpg"), new String("\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 Funtime"), new String("https://smertnix55551.github.io/spookytime.png"), new String("\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 SpookyTime"), new String("https://smertnix55551.github.io/holyworld.jpg"), new String("\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 HolyWorld"), new String("https://smertnix55551.github.io/reallyworld.jpg"), new String("\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 ReallyWorld"), new String("https://smertnix55551.github.io/metahvh.jpg"), new String("\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 MetaHVH"), new String("https://smertnix55551.github.io/infinity.jpg"), new String("\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 InfinityHVH"), new String("https://smertnix55551.github.io/aresmine.jpg"), new String("\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 AresMine"), new String("https://smertnix55551.github.io/sunrise.jpg"), new String("\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 Sunrise"), new String("vk.com/celestialclient"), new String("https://cdn.discordapp.com/avatars/"), new String("INSTANCE"), new String("999325989563801640")};
    }

    private Pair<String, String> id_native() {
        rrfq_3 rrfq_32 = (rrfq_3)((Object)rrfp_3.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[4]]);
        if (rrfq_32 != null) {
            switch (((int[])rrZB.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[5]])[rrfq_32.ordinal()]) {
                case 1: {
                    return Pair.of((Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[9], (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[10]);
                }
                case 2: {
                    return Pair.of((Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[11], (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[12]);
                }
                case 3: {
                    return Pair.of((Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[13], (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[14]);
                }
                case 4: {
                    return Pair.of((Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[15], (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[16]);
                }
                case 5: {
                    return Pair.of((Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[17], (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[18]);
                }
                case 6: {
                    return Pair.of((Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[19], (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[20]);
                }
                case 7: {
                    return Pair.of((Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[21], (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[22]);
                }
                case 8: {
                    return Pair.of((Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[23], (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[24]);
                }
            }
        }
        return Pair.of((Object)((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[6]]).id_byte(), (Object)stringsfda1a12b8e6d3a64af93b1c14ed22523[25]);
    }
}

