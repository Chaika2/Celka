/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.VersionType
 */
package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import offline.launcher.ViaProtocolCompat;

public class rrjy_3
extends ProtocolVersion {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_break = blArray;
    }

    public boolean id_byte(ProtocolVersion protocolVersion) {
        return this.newerThanOrEqualTo(protocolVersion);
    }

    public rrjy_3(int n, String string, int n2) {
        super(VersionType.RELEASE, n, -1, string, ViaProtocolCompat.subVersionRange(n));
        this.id_protected();
        Integer n3 = n2;
        this.id_class[rrjy_3.id_byte[0]] = n3;
    }

    static {
        rrjy_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-115, -65, 127, -32, 111, 41, 77, -99}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF553F6;
    }

    public int id_class() {
        return (Integer)this.id_class[id_byte[1]];
    }

    public boolean id_class(ProtocolVersion protocolVersion) {
        return this.newerThan(protocolVersion);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x93B35A1853B6BD2FL;
    }

    public boolean id_break(ProtocolVersion protocolVersion) {
        return this.equalTo(protocolVersion);
    }

    private static void id_break() {
        id_byte = new short[2];
    }

    public boolean id_throws(ProtocolVersion protocolVersion) {
        return this.olderThan(protocolVersion);
    }

    private static /* synthetic */ void ntfClinit() {
        rrjy_3.id_byte();
        rrjy_3.id_break();
    }

    public boolean id_protected(ProtocolVersion protocolVersion) {
        return this.olderThanOrEqualTo(protocolVersion);
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[10]];
            objectArray[rrjy_3.id_break[11]] = id_break[12];
        }
    }
}

