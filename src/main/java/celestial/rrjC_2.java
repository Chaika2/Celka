/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package celestial;

import celestial.rrjH_2;
import celestial.rrjn_3;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjC_2 {
    private static short[] id_byte;
    private static String[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;
    public static Object[] id_class;
    public Object[] id_break;

    public rrjH_2 id_byte() {
        return (rrjH_2)this.id_break[id_byte[8]];
    }

    public rrjC_2() {
        ArrayList arrayList;
        this.id_finally();
        rrjn_3.id_break().id_class(new File(id_protected[0])).id_class(id_byte[0]).id_class();
        List<ProtocolVersion> list = ProtocolVersion.getProtocols().stream().filter(protocolVersion -> protocolVersion.getVersion() == id_throws[5] || protocolVersion.getVersion() >= id_throws[6] ? id_case[1] : id_case[2]).sorted((protocolVersion, protocolVersion2) -> Integer.compare(protocolVersion2.getVersion(), protocolVersion.getVersion())).toList();
        this.id_break[rrjC_2.id_byte[1]] = arrayList = new ArrayList(list.size() + id_case[0]);
        ((List)this.id_break[id_byte[2]]).addAll(list);
    }

    static {
        rrjC_2.ntfClinit();
    }

    public void id_class(List<ProtocolVersion> list) {
        this.id_class(list, id_throws[0], id_throws[1], id_throws[2], id_throws[3]);
    }

    public void id_class(List<ProtocolVersion> list, int n, int n2, int n3, int n4) {
        rrjH_2 rrjH_22 = new rrjH_2(list, n, n2, Math.max(n3, id_throws[4]), n4);
        this.id_break[rrjC_2.id_byte[6]] = rrjH_22;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7A5B1C3AD32EAC71L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, -124, -80, -52, 71, -114, -34, 96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public List<ProtocolVersion> id_class() {
        return (List)this.id_break[id_byte[7]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7D655282;
    }

    public static void id_break() {
        if ((rrjC_2)id_class[id_byte[3]] == null) {
            rrjC_2 rrjC_22 = new rrjC_2();
            rrjC_2.id_class[rrjC_2.id_byte[4]] = rrjC_22;
        }
    }

    private static void id_throws() {
        id_throws = new byte[]{5, 5, 110, 20, 110, 47, 107, 2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjC_2.id_case();
        rrjC_2.id_implements();
        rrjC_2.id_private();
        rrjC_2.id_throws();
        rrjC_2.id_catch();
    }

    private void id_finally() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[7]];
        }
    }

    private static void id_catch() {
        Object[] objectArray = new Object[2];
        objectArray[0] = 754;
        id_class = objectArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[1] = true;
        id_case = blArray;
    }

    private static void id_implements() {
        id_protected = new String[]{new String("ViaVersion")};
    }

    public static rrjC_2 id_protected() {
        return (rrjC_2)id_class[id_byte[5]];
    }

    private static void id_private() {
        short[] sArray = new short[10];
        sArray[0] = 754;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[9] = 754;
        id_byte = sArray;
    }
}

