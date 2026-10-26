/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.Aw_1;
import celestial.C_break;
import celestial.cb_3;
import celestial.rgP_2;
import celestial.rrQX;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLO
implements MinecraftAccessor {
    @Nullable
    private Aw_1 id_byte;
    public static Object[] id_class;
    private static short[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;
    @Nullable
    private UUID id_case;
    private static boolean[] id_catch;

    public rgP_2 id_byte() {
        return (rgP_2)this.id_break[id_protected[10]];
    }

    public rrLO() {
        this.id_throws();
    }

    static {
        rrLO.ntfClinit();
    }

    @Nullable
    public UUID id_class() {
        return this.id_case;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{52, 15, 33, 82, 2, -128, 49, 87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(rgP_2 rgP_22, @Nullable Aw_1 aw_1, @Nullable UUID uUID) {
        if ((cb_3)rrLO.id_import.id_class[id_protected[7]] == null) {
            return;
        }
        rrLO rrLO2 = rrLO.id_class(rgP_22, rgP_22.id_byte(), aw_1, uUID);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[8]]).id_class(rrLO2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[9]]).id_finally().id_class(rrLO2);
    }

    public static rrLO id_class(rgP_2 rgP_22, String string, @Nullable Aw_1 aw_1, @Nullable UUID uUID) {
        rgP_2 rgP_23 = rgP_22;
        ((rrLO)rrLO.id_class[rrLO.id_protected[0]]).id_break[rrLO.id_protected[1]] = rgP_23;
        String string2 = string;
        ((rrLO)rrLO.id_class[rrLO.id_protected[2]]).id_break[rrLO.id_protected[3]] = string2;
        ((rrLO)rrLO.id_class[rrLO.id_protected[4]]).id_byte = aw_1;
        ((rrLO)rrLO.id_class[rrLO.id_protected[5]]).id_case = uUID;
        return (rrLO)id_class[id_protected[6]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x34EE3F9D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x41A8AC217EDEF7B4L;
    }

    @Nullable
    public Aw_1 id_break() {
        return this.id_byte;
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLO.id_private();
        rrLO.id_implements();
        rrLO.id_case();
        rrLO.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrLO()};
        id_class = objectArray;
    }

    private static void id_case() {
        id_throws = new byte[]{2};
    }

    private static void id_implements() {
        short[] sArray = new short[12];
        sArray[3] = 1;
        sArray[7] = 57;
        sArray[11] = 1;
        id_protected = sArray;
    }

    public String id_protected() {
        return (String)this.id_break[id_protected[11]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_catch = blArray;
    }
}

