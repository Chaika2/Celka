/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.jI_2;
import celestial.rrQd_1;
import celestial.rrQf_1;
import celestial.rrQg_1;
import celestial.rrQx_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQW
implements AutoCloseable,
rrQx_1 {
    private static byte[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static boolean[] id_throws;

    @Override
    public CompletableFuture<Void> id_byte() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        this.id_class[rrQW.id_protected[0]] = executorService;
        return ((CompletableFuture)((CompletableFuture)((CompletableFuture)((CompletableFuture)((CompletableFuture)((CompletableFuture)rrQf_1.id_class(bl -> jI_2.id_class(id_byte[3], new Object[id_throws[4]]), (Executor)((ExecutorService)this.id_class[id_protected[1]])).thenComposeAsync(string -> rrQf_1.id_protected(string, (ExecutorService)this.id_class[id_protected[22]]))).thenComposeAsync(string -> rrQf_1.id_class(string, (Executor)((ExecutorService)this.id_class[id_protected[21]])))).thenComposeAsync(string -> rrQf_1.id_byte(string, (ExecutorService)this.id_class[id_protected[20]]))).thenComposeAsync(map -> rrQf_1.id_class((String)map.get(id_byte[1]), (String)map.get(id_byte[2]), (Executor)((ExecutorService)this.id_class[id_protected[19]])))).thenComposeAsync(string -> rrQf_1.id_break(string, (ExecutorService)this.id_class[id_protected[18]]))).thenAccept(rqN_22 -> {
            rrQg_1.id_class(rqN_22);
            ((Logger)QY.id_break[id_protected[16]]).info(id_byte[0]);
            ((ExecutorService)this.id_class[id_protected[17]]).shutdownNow();
        })).exceptionally(throwable -> {
            ((ExecutorService)this.id_class[id_protected[15]]).shutdownNow();
            return null;
        });
    }

    public rrQW(String string, String string2, UUID uUID, rrQd_1 rrQd_12) {
        this.id_implements();
        String string3 = string;
        this.id_class[rrQW.id_protected[11]] = string3;
        String string4 = string2;
        this.id_class[rrQW.id_protected[12]] = string4;
        UUID uUID2 = uUID;
        this.id_class[rrQW.id_protected[13]] = uUID2;
        rrQd_1 rrQd_13 = rrQd_12;
        this.id_class[rrQW.id_protected[14]] = rrQd_13;
    }

    static {
        rrQW.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_throws[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_throws[1];
        }
        rrQW rrQW2 = (rrQW)object;
        return Objects.equals((String)this.id_class[id_protected[3]], (String)rrQW2.id_class[id_protected[4]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_throws[2]];
        objectArray[rrQW.id_throws[3]] = (String)this.id_class[id_protected[5]];
        return Objects.hash(objectArray);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{71, -44, -79, -3, 51, 31, 80, 36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7D590CCC;
    }

    @Override
    public String id_class() {
        return (String)this.id_class[id_protected[6]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB417E01D383E6226L;
    }

    @Override
    public void close() throws Exception {
        ((ExecutorService)this.id_class[id_protected[2]]).shutdownNow();
    }

    @Override
    public rrQd_1 id_break() {
        return (rrQd_1)((Object)this.id_class[id_protected[9]]);
    }

    public ExecutorService id_throws() {
        return (ExecutorService)this.id_class[id_protected[10]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrQW.id_private();
        rrQW.id_finally();
        rrQW.id_extends();
        rrQW.id_catch();
    }

    private static void id_finally() {
        id_byte = new String[]{new String("Successfully logged in via Microsoft!"), new String("Token"), new String("uhs"), new String("gui.authme.microsoft.browser")};
    }

    private static void id_catch() {
        id_break = new byte[]{5};
    }

    private static void id_extends() {
        short[] sArray = new short[23];
        sArray[0] = 4;
        sArray[1] = 4;
        sArray[2] = 4;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 3;
        sArray[10] = 4;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 3;
        sArray[15] = 4;
        sArray[16] = 1;
        sArray[17] = 4;
        sArray[18] = 4;
        sArray[19] = 4;
        sArray[20] = 4;
        sArray[21] = 4;
        sArray[22] = 4;
        id_protected = sArray;
    }

    public String id_case() {
        return (String)this.id_class[id_protected[7]];
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    @Override
    public UUID id_protected() {
        return (UUID)this.id_class[id_protected[8]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_throws = blArray;
    }
}

