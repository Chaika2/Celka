/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.rrQV;
import celestial.rrQd_1;
import celestial.rrQg_1;
import celestial.rrQx_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQz_1
implements AutoCloseable,
rrQx_1 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;
    private static String[] id_throws;

    @Override
    public CompletableFuture<Void> id_byte() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        this.id_class[rrQz_1.id_byte[0]] = executorService;
        return ((CompletableFuture)rrQV.id_class((String)this.id_class[id_byte[1]], (String)this.id_class[id_byte[2]], (ExecutorService)this.id_class[id_byte[3]]).thenAccept(rqN_22 -> {
            rrQg_1.id_class(rqN_22);
            ((Logger)QY.id_break[id_byte[18]]).info(id_throws[0]);
            ((ExecutorService)this.id_class[id_byte[19]]).shutdownNow();
        })).exceptionally(throwable -> {
            ((ExecutorService)this.id_class[id_byte[17]]).shutdownNow();
            return null;
        });
    }

    public rrQz_1(String string, String string2, UUID uUID, rrQd_1 rrQd_12) {
        this.id_catch();
        String string3 = string;
        this.id_class[rrQz_1.id_byte[13]] = string3;
        String string4 = string2;
        this.id_class[rrQz_1.id_byte[14]] = string4;
        UUID uUID2 = uUID;
        this.id_class[rrQz_1.id_byte[15]] = uUID2;
        rrQd_1 rrQd_13 = rrQd_12;
        this.id_class[rrQz_1.id_byte[16]] = rrQd_13;
    }

    static {
        rrQz_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[1];
        }
        rrQz_1 rrQz_12 = (rrQz_1)object;
        return Objects.equals((String)this.id_class[id_byte[5]], (String)rrQz_12.id_class[id_byte[6]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_break[2]];
        objectArray[rrQz_1.id_break[3]] = (String)this.id_class[id_byte[7]];
        return Objects.hash(objectArray);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x270349A1;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5069994DFC204A18L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{24, 46, 102, 76, -41, 91, 95, -80}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public String id_class() {
        return (String)this.id_class[id_byte[8]];
    }

    @Override
    public void close() throws Exception {
        ((ExecutorService)this.id_class[id_byte[4]]).shutdownNow();
    }

    @Override
    public rrQd_1 id_break() {
        return (rrQd_1)((Object)this.id_class[id_byte[11]]);
    }

    public ExecutorService id_throws() {
        return (ExecutorService)this.id_class[id_byte[12]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrQz_1.id_implements();
        rrQz_1.id_finally();
        rrQz_1.id_private();
        rrQz_1.id_extends();
    }

    private static void id_finally() {
        id_throws = new String[]{new String("Successfully logged in via Mojang (or legacy)!")};
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_extends() {
        id_protected = new byte[]{5};
    }

    public String id_case() {
        return (String)this.id_class[id_byte[9]];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    @Override
    public UUID id_protected() {
        return (UUID)this.id_class[id_byte[10]];
    }

    private static void id_private() {
        short[] sArray = new short[20];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 4;
        sArray[4] = 4;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[12] = 4;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 3;
        sArray[17] = 4;
        sArray[18] = 1;
        sArray[19] = 4;
        id_byte = sArray;
    }
}

