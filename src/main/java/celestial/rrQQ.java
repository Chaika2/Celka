/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.rqN_2;
import celestial.rrQd_1;
import celestial.rrQg_1;
import celestial.rrQx_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQQ
implements rrQx_1 {
    private static boolean[] id_break;
    public Object[] id_class;
    private static String[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;

    @Override
    public CompletableFuture<Void> id_byte() {
        return CompletableFuture.runAsync(() -> {
            rqN_2 rqN_22 = rrQg_1.id_break((String)this.id_class[id_protected[9]]);
            rrQg_1.id_class(rqN_22);
            ((Logger)QY.id_break[id_protected[10]]).info(id_byte[0]);
        });
    }

    public rrQQ(String string, UUID uUID, rrQd_1 rrQd_12) {
        this.id_catch();
        String string2 = string;
        this.id_class[rrQQ.id_protected[6]] = string2;
        UUID uUID2 = uUID;
        this.id_class[rrQQ.id_protected[7]] = uUID2;
        rrQd_1 rrQd_13 = rrQd_12;
        this.id_class[rrQQ.id_protected[8]] = rrQd_13;
    }

    static {
        rrQQ.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[1];
        }
        rrQQ rrQQ2 = (rrQQ)object;
        return Objects.equals((String)this.id_class[id_protected[0]], (String)rrQQ2.id_class[id_protected[1]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_break[2]];
        objectArray[rrQQ.id_break[3]] = (String)this.id_class[id_protected[2]];
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4E3C7CA6459DB785L;
    }

    @Override
    public String id_class() {
        return (String)this.id_class[id_protected[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9AE298F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{122, -26, 83, -8, -40, 118, 15, -26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rrQd_1 id_break() {
        return (rrQd_1)((Object)this.id_class[id_protected[5]]);
    }

    private static void id_throws() {
        id_throws = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQQ.id_case();
        rrQQ.id_private();
        rrQQ.id_implements();
        rrQQ.id_throws();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    private static void id_implements() {
        short[] sArray = new short[11];
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 1;
        id_protected = sArray;
    }

    @Override
    public UUID id_protected() {
        return (UUID)this.id_class[id_protected[4]];
    }

    private static void id_private() {
        id_byte = new String[]{new String("Successfully logged in offline-mode!")};
    }
}

