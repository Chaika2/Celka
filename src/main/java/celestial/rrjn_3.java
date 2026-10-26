/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaManagerImpl$ViaManagerBuilder
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package celestial;

import celestial.rrjA_2;
import celestial.rrjp_3;
import celestial.rrjy_3;
import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjn_3 {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[24];
        sArray[2] = 2;
        sArray[4] = 3;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 3;
        sArray[10] = 4;
        sArray[11] = 5;
        sArray[12] = 6;
        sArray[13] = 7;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 4;
        sArray[21] = 5;
        sArray[22] = 6;
        sArray[23] = 7;
        id_byte = sArray;
    }

    public rrjn_3 id_byte(Consumer<rrjy_3> consumer) {
        Consumer<rrjy_3> consumer2;
        this.id_class[rrjn_3.id_byte[13]] = consumer2 = consumer;
        return this;
    }

    public rrjn_3() {
        LinkedList linkedList;
        this.id_throws();
        this.id_class[rrjn_3.id_byte[0]] = linkedList = new LinkedList();
        ((LinkedList)this.id_class[id_byte[1]]).add((rrjp_3)rrjA_2.id_break[id_byte[2]]);
        ((LinkedList)this.id_class[id_byte[3]]).add((rrjp_3)rrjA_2.id_break[id_byte[4]]);
    }

    static {
        rrjn_3.ntfClinit();
    }

    public rrjn_3 id_class(rrjp_3 rrjp_32, int n) {
        ((LinkedList)this.id_class[id_byte[6]]).add(n, rrjp_32);
        return this;
    }

    public void id_class() {
        if (rrjA_2.id_protected() != null) {
            return;
        }
        if ((File)this.id_class[id_byte[14]] == null || (Integer)this.id_class[id_byte[15]] == null) {
            return;
        }
        new rrjA_2((LinkedList)this.id_class[id_byte[16]], (File)this.id_class[id_byte[17]], (Integer)this.id_class[id_byte[18]], (BooleanSupplier)this.id_class[id_byte[19]], (Supplier)this.id_class[id_byte[20]], (Consumer)this.id_class[id_byte[21]], (Consumer)this.id_class[id_byte[22]], (Consumer)this.id_class[id_byte[23]]);
    }

    public rrjn_3 id_class(Consumer<ViaProviders> consumer) {
        Consumer<ViaProviders> consumer2;
        this.id_class[rrjn_3.id_byte[11]] = consumer2 = consumer;
        return this;
    }

    public rrjn_3 id_class(Supplier<JsonObject> supplier) {
        Supplier<JsonObject> supplier2;
        this.id_class[rrjn_3.id_byte[10]] = supplier2 = supplier;
        return this;
    }

    public rrjn_3 id_class(BooleanSupplier booleanSupplier) {
        BooleanSupplier booleanSupplier2 = booleanSupplier;
        this.id_class[rrjn_3.id_byte[9]] = booleanSupplier2;
        return this;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x892B55913CFFE8C5L;
    }

    public rrjn_3 id_class(rrjp_3 rrjp_32) {
        ((LinkedList)this.id_class[id_byte[5]]).add(rrjp_32);
        return this;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{111, 103, -36, 89, -71, -39, -86, -26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrjn_3 id_class(File file) {
        File file2 = file;
        this.id_class[rrjn_3.id_byte[7]] = file2;
        return this;
    }

    public rrjn_3 id_class(int n) {
        Integer n2 = n;
        this.id_class[rrjn_3.id_byte[8]] = n2;
        return this;
    }

    public static rrjn_3 id_break() {
        return new rrjn_3();
    }

    public rrjn_3 id_break(Consumer<ViaManagerImpl.ViaManagerBuilder> consumer) {
        Consumer<ViaManagerImpl.ViaManagerBuilder> consumer2;
        this.id_class[rrjn_3.id_byte[12]] = consumer2 = consumer;
        return this;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7660C528;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrjn_3.id_byte();
        rrjn_3.id_protected();
    }

    private static void id_protected() {
        id_break = new byte[]{8};
    }
}

