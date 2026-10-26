/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.configuration.AbstractViaConfig
 */
package celestial;

import com.viaversion.viaversion.configuration.AbstractViaConfig;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjV_2
extends AbstractViaConfig {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;
    private static String[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        id_throws = new short[1];
    }

    public rrjV_2(File file) {
        super(file, Logger.getLogger("ViaVersion"));
        this.reload();
    }

    static {
        rrjV_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9DC060C1;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-125, -62, 90, 42, -69, 12, -24, 28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        String[] stringArray = new String[]{id_protected[0], id_protected[1], id_protected[2], id_protected[3], id_protected[4], id_protected[5], id_protected[6], id_protected[7], id_protected[8], id_protected[9], id_protected[10], id_protected[11], id_protected[12], id_protected[13]};
        objectArray[0] = Arrays.asList((Object[])stringArray);
        id_class = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2593748605E06549L;
    }

    private static void id_break() {
        id_byte = new byte[]{14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    }

    private static void id_throws() {
        id_protected = new String[]{new String("anti-xray-patch"), new String("bungee-ping-interval"), new String("bungee-ping-save"), new String("bungee-servers"), new String("quick-move-action-fix"), new String("nms-player-ticking"), new String("velocity-ping-interval"), new String("velocity-ping-save"), new String("velocity-servers"), new String("blockconnection-method"), new String("change-1_9-hitbox"), new String("change-1_14-hitbox"), new String("show-shield-when-sword-in-hand"), new String("left-handed-handling")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjV_2.id_protected();
        rrjV_2.id_throws();
        rrjV_2.id_byte();
        rrjV_2.id_break();
        rrjV_2.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    public void handleConfig(Map<String, Object> map) {
    }

    public List<String> getUnsupportedOptions() {
        return (List)id_class[id_throws[0]];
    }
}

