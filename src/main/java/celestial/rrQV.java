/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  com.mojang.util.UUIDTypeAdapter
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.rqN_2;
import celestial.rrQg_1;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.util.UUIDTypeAdapter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQV {
    private static short[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;
    private static byte[] id_protected;
    private static String[] id_throws;

    public static CompletableFuture<String> id_byte(String string) {
        String string2 = "https://sessionserver.mojang.com/session/minecraft/profile/" + string;
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(string2)).build();
        return ((HttpClient)id_class[id_break[0]]).sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString()).thenApply(httpResponse -> ((JsonObject)((Gson)id_class[id_break[1]]).fromJson((String)httpResponse.body(), JsonObject.class)).get(id_throws[1]).getAsString());
    }

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private rrQV() {
        throw new UnsupportedOperationException(id_throws[0]);
    }

    static {
        rrQV.ntfClinit();
    }

    private static void id_class() {
        short[] sArray = new short[5];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        id_break = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x91FEEA4F;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x453C6CC89BB7190EL;
    }

    public static CompletableFuture<rqN_2> id_class(String string, String string2, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            ((Logger)QY.id_break[id_break[2]]).info(id_throws[2]);
            try {
                YggdrasilUserAuthentication yggdrasilUserAuthentication = rrQg_1.id_byte();
                yggdrasilUserAuthentication.setUsername(string);
                yggdrasilUserAuthentication.setPassword(string2);
                yggdrasilUserAuthentication.logIn();
                String string3 = yggdrasilUserAuthentication.getSelectedProfile().getName();
                String string4 = UUIDTypeAdapter.fromUUID((UUID)yggdrasilUserAuthentication.getSelectedProfile().getId());
                String string5 = yggdrasilUserAuthentication.getAuthenticatedToken();
                String string6 = yggdrasilUserAuthentication.getUserType().getName();
                yggdrasilUserAuthentication.logOut();
                ((Logger)QY.id_break[id_break[3]]).info(id_throws[3], (Object)string3);
                return new rqN_2(string3, string4, string5, string6);
            }
            catch (Exception exception) {
                ((Logger)QY.id_break[id_break[4]]).error(id_throws[4], (Throwable)exception);
                throw new CompletionException(exception);
            }
        }, executor);
    }

    public static UUID id_class(String string) {
        if (string == null) {
            return UUID.randomUUID();
        }
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(StandardCharsets.UTF_8));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-103, 35, 16, -7, -35, -87, 99, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray = new Object[2];
        objectArray[0] = new Gson();
        id_class = objectArray;
        rrQV.id_class[1] = HttpClient.newHttpClient();
    }

    private static void id_throws() {
        id_throws = new String[]{new String("This is a utility class and cannot be instantiated"), new String("name"), new String("Logging into Minecraft with Mojang (or legacy) credentials..."), new String("Successfully logged into Minecraft via Mojang (or legacy)! ({})"), new String("Unable to login to Minecraft via Mojang (or legacy)!")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQV.id_byte();
        rrQV.id_throws();
        rrQV.id_class();
        rrQV.id_protected();
        rrQV.id_break();
    }

    private static void id_protected() {
        id_protected = new byte[]{2};
    }
}

