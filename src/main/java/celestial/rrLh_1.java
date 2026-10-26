/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.Aw_1;
import celestial.C_break;
import celestial.Om_1;
import celestial.rgP_2;
import celestial.rrQX;
import celestial.rrfV_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLh_1
extends Om_1 {
    @Nullable
    private Aw_1 id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    private static short[] id_throws;
    private static byte[] id_case;
    @Nullable
    private UUID id_catch;
    public Object[] id_break;

    public rrLh_1() {
        this.id_case();
    }

    static {
        rrLh_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x410B0EA71CFF019AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{104, 15, -16, 122, -48, -107, -84, 107}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrLh_1 id_class(rgP_2 rgP_22, UUID uUID) {
        rrLh_1 rrLh_12 = rrLh_1.id_class(rgP_22, rgP_22.id_byte(), uUID);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[8]]).id_class(rrLh_12);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[9]]).id_finally().id_class(rrLh_12);
        return rrLh_12;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x90B24408;
    }

    public static rrLh_1 id_class(rgP_2 rgP_22, String string, UUID uUID) {
        rgP_2 rgP_23 = rgP_22;
        ((rrLh_1)rrLh_1.id_class[rrLh_1.id_throws[0]]).id_break[rrLh_1.id_throws[1]] = rgP_23;
        String string2 = string;
        ((rrLh_1)rrLh_1.id_class[rrLh_1.id_throws[2]]).id_break[rrLh_1.id_throws[3]] = string2;
        ((rrLh_1)rrLh_1.id_class[rrLh_1.id_throws[4]]).id_byte = rrfV_2.id_class(rgP_22, string);
        ((rrLh_1)rrLh_1.id_class[rrLh_1.id_throws[5]]).id_catch = uUID;
        ((rrLh_1)id_class[id_throws[6]]).id_class(id_protected[0]);
        return (rrLh_1)id_class[id_throws[7]];
    }

    public String id_class() {
        this.id_case();
        return (String)this.id_break[id_throws[11]];
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_case();
        rgP_2 rgP_23 = rgP_22;
        this.id_break[rrLh_1.id_throws[12]] = rgP_23;
    }

    @Nullable
    public UUID id_break() {
        return this.id_catch;
    }

    public rgP_2 id_throws() {
        this.id_case();
        return (rgP_2)this.id_break[id_throws[10]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrLh_1.id_private();
        rrLh_1.id_implements();
        rrLh_1.id_catch();
        rrLh_1.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new rrLh_1()};
        id_class = objectArray;
    }

    private static void id_catch() {
        id_case = new byte[]{2};
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[0]];
        }
    }

    private static void id_implements() {
        short[] sArray = new short[13];
        sArray[3] = 1;
        sArray[11] = 1;
        id_throws = sArray;
    }

    @Nullable
    public Aw_1 id_protected() {
        return this.id_byte;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }
}

