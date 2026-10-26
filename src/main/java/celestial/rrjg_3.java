/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package celestial;

import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjg_3
implements ViaInjector {
    private static String[] id_class;

    static {
        rrjg_3.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5CC2E23;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{72, 57, -92, -25, -60, 59, 96, -102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x164F86D8B4917D25L;
    }

    private static void id_class() {
        id_class = new String[]{new String("via-decoder"), new String("via-encoder")};
    }

    public void uninject() {
    }

    public void inject() {
    }

    public JsonObject getDump() {
        return new JsonObject();
    }

    public String getEncoderName() {
        return id_class[1];
    }

    public String getDecoderName() {
        return id_class[0];
    }

    public SortedSet<ProtocolVersion> getServerProtocolVersions() throws Exception {
        return new TreeSet<ProtocolVersion>(ProtocolVersion.getProtocols());
    }

    public ProtocolVersion getServerProtocolVersion() throws Exception {
        return this.getServerProtocolVersions().first();
    }
}

