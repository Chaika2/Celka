/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Pv_1;
import celestial.rrLu_1;
import celestial.rrQJ;
import celestial.rrZr_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrvu_1;
import celestial.ruS_2;
import celestial.rvb_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PT
extends Pv_1
implements MinecraftAccessor {
    private static byte[] id_byte;
    private static String[] id_protected;
    private static short[] id_throws;
    private static boolean[] id_case;
    public static Object[] id_break;

    private static void id_byte() {
        id_protected = new String[]{new String("\u041f\u043e \u043f\u0440\u0438\u0447\u0438\u043d\u0435: (.*)\\s+\u0420\u0430\u0437\u0431\u0430\u043d \u0447\u0435\u0440\u0435\u0437: (.*)")};
    }

    public PT(C_class c_class) {
        super(c_class);
    }

    static {
        PT.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x35B1B65A58244E6L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB42E1C86;
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvb_3) {
            rvb_3 rvb_32 = (rvb_3)ruS_22;
            if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[0]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[1]])) {
                return;
            }
            String string = rvb_32.id_break().id_byte();
            Matcher matcher = ((Pattern)id_break[id_throws[2]]).matcher(string);
            if (matcher.find()) {
                String string2 = matcher.group(id_case[0]);
                String string3 = matcher.group(id_byte[0]);
                ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[id_throws[3]]).id_break((rrZr_1)rrQJ.id_class[id_throws[4]], string2, string3);
                MinecraftAccessor.a_("\u0412\u044b \u0431\u044b\u043b\u0438 \u0437\u0430\u0431\u0430\u043d\u0435\u043d\u044b \u0437\u0430 " + string2, id_case[1]);
            }
        }
    }

    private static void id_class() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_case = blArray;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{Pattern.compile(id_protected[0], 0)};
        id_break = objectArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{25, -58, 46, -116, 19, 56, -75, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        PT.id_class();
        PT.id_byte();
        PT.id_protected();
        PT.id_throws();
        PT.id_break();
    }

    private static void id_protected() {
        short[] sArray = new short[5];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[4] = 5;
        id_throws = sArray;
    }
}

