/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.rqN_2;
import celestial.rqc_3;
import celestial.rrQR;
import celestial.util.MinecraftAccessor;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQg_1
implements MinecraftAccessor {
    private static long[] id_break;
    private static short[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    private static String[] id_throws;
    private static byte[] id_case;

    public static YggdrasilUserAuthentication id_byte() {
        return (YggdrasilUserAuthentication)id_class[id_byte[6]];
    }

    private rrQg_1() {
    }

    static {
        rrQg_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x46F37F3B;
    }

    public static void id_class(rqN_2 rqN_22) {
        id_import.id_class(rqN_22);
        rrQR rrQR2 = (rrQR)((Object)rrQR.staticFields390584fa19b23798828925cb0991ad90[id_byte[0]]);
        rrQg_1.id_class[rrQg_1.id_byte[1]] = rrQR2;
        Long l = id_break[0];
        rrQg_1.id_class[rrQg_1.id_byte[2]] = l;
        ((Logger)QY.id_break[id_byte[3]]).info(id_throws[0], (Object)rqN_22.id_byte(), (Object)rqN_22.id_class());
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{57, 21, -48, -68, 41, -128, -106, -67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE113FD69AD23D60DL;
    }

    public static YggdrasilMinecraftSessionService id_class() {
        return (YggdrasilMinecraftSessionService)id_import.r();
    }

    public static CompletableFuture<rrQR> id_break() {
        if (System.currentTimeMillis() - (Long)id_class[id_byte[4]] < id_break[1]) {
            return CompletableFuture.completedFuture((rrQR)((Object)id_class[id_byte[5]]));
        }
        return CompletableFuture.supplyAsync(() -> {
            rqN_2 rqN_22 = rrQg_1.id_protected();
            String string = UUID.randomUUID().toString();
            YggdrasilMinecraftSessionService yggdrasilMinecraftSessionService = rrQg_1.id_class();
            try {
                ((Logger)QY.id_break[id_byte[7]]).info(id_throws[2]);
                yggdrasilMinecraftSessionService.joinServer(rqN_22.id_throws(), rqN_22.id_protected(), string);
                if (yggdrasilMinecraftSessionService.hasJoinedServer(rqN_22.id_throws(), string, null) != null) {
                    ((Logger)QY.id_break[id_byte[8]]).info(id_throws[3]);
                    rrQR rrQR2 = (rrQR)((Object)((Object)rrQR.staticFields390584fa19b23798828925cb0991ad90[id_byte[9]]));
                    rrQg_1.id_class[rrQg_1.id_byte[10]] = rrQR2;
                } else {
                    ((Logger)QY.id_break[id_byte[11]]).warn(id_throws[4]);
                    rrQR rrQR3 = (rrQR)((Object)((Object)rrQR.staticFields390584fa19b23798828925cb0991ad90[id_byte[12]]));
                    rrQg_1.id_class[rrQg_1.id_byte[13]] = rrQR3;
                }
            }
            catch (AuthenticationException authenticationException) {
                ((Logger)QY.id_break[id_byte[14]]).error(id_throws[5], (Throwable)authenticationException);
                rrQR rrQR4 = (rrQR)((Object)((Object)rrQR.staticFields390584fa19b23798828925cb0991ad90[id_byte[15]]));
                rrQg_1.id_class[rrQg_1.id_byte[16]] = rrQR4;
            }
            Long l = System.currentTimeMillis();
            rrQg_1.id_class[rrQg_1.id_byte[17]] = l;
            return (rrQR)((Object)((Object)id_class[id_byte[18]]));
        });
    }

    public static rqN_2 id_break(String string) {
        return new rqN_2(string, UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(StandardCharsets.UTF_8)).toString(), id_throws[1], rqc_3.LEGACY.id_class());
    }

    private static void id_throws() {
        id_throws = new String[]{new String("Minecraft session for {} (uuid={}) has been applied"), new String("invalidtoken"), new String("Verifying Minecraft session..."), new String("The Minecraft session is valid"), new String("The Minecraft session is invalid!"), new String("Could not validate the Minecraft session!"), new String("invalidtoken")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQg_1.id_extends();
        rrQg_1.id_throws();
        rrQg_1.id_catch();
        rrQg_1.id_private();
        rrQg_1.id_implements();
        rrQg_1.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray;
        objectArray = new Object[]{new YggdrasilAuthenticationService(Proxy.NO_PROXY, "486b7f3f-e308-4f61-b625-cd66747d35ef"), ((YggdrasilAuthenticationService)objectArray[0]).createUserAuthentication(null), id_throws[6], 60000L, 0L, new rrQR()};
        id_class = objectArray;
    }

    private static void id_catch() {
        long[] lArray = new long[4];
        lArray[1] = 60000L;
        lArray[2] = 60000L;
        id_break = lArray;
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }

    private static void id_implements() {
        id_case = new byte[]{3, 5, 6, 2, 3, 4};
    }

    public static rqN_2 id_protected() {
        return QY.id_instanceof().id_while();
    }

    private static void id_private() {
        short[] sArray = new short[19];
        sArray[0] = 3;
        sArray[1] = 5;
        sArray[2] = 4;
        sArray[3] = 1;
        sArray[4] = 4;
        sArray[5] = 5;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[10] = 5;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 5;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 5;
        sArray[17] = 4;
        sArray[18] = 5;
        id_byte = sArray;
    }
}

