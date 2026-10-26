/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.event.EventTarget;
import celestial.module.util.FtHelper;
import celestial.rgP_2;
import celestial.rgZ_2;
import celestial.rgy_3;
import celestial.rrFH;
import celestial.rrLh_1;
import celestial.rrQX;
import celestial.rrTF;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpN_2
extends rrTF<FtHelper> {
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static String[] id_protected;
    public static Object[] id_class;
    private static short[] id_case;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    public rrpN_2(FtHelper ftHelper) {
        super(ftHelper);
    }

    static {
        rrpN_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{108, 57, 104, -97, 105, 28, 3, -117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLh_1 rrLh_12) {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_case[0]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_case[1]]) || rrLh_12.id_break() != null) {
            return;
        }
        String string = rrLh_12.id_class();
        rgP_2 rgP_22 = rrLh_12.id_throws();
        Matcher matcher = ((Pattern)id_class[id_case[2]]).matcher(string);
        if (matcher.find()) {
            String string2 = null;
            String string3 = null;
            for (rgP_2 rgP_23 : rgP_22.id_protected()) {
                Matcher matcher2;
                Object object;
                rgy_3 rgy_32 = rgP_23.id_class().id_implements();
                if (rgy_32 == null || !((object = rgy_32.id_break()) instanceof rgZ_2)) continue;
                rgZ_2 rgZ_22 = (rgZ_2)object;
                String string4 = rgZ_22.id_byte();
                Matcher matcher3 = ((Pattern)id_class[id_case[3]]).matcher(string4);
                if (matcher3.find()) {
                    string2 = matcher3.group(id_break[0]);
                }
                if (!(matcher2 = ((Pattern)id_class[id_case[4]]).matcher(string4)).find()) continue;
                string3 = matcher2.group(id_break[1]);
            }
            if (string2 == null || string3 == null) {
                return;
            }
            Object object = id_protected[0];
            object = string3.equalsIgnoreCase(id_protected[1]) ? (String)object + " \u043d\u0430\u0432\u0441\u0435\u0433\u0434\u0430" : (String)object + " \u043d\u0430 " + string3.replace(id_protected[2], id_protected[3]);
            object = (String)object + " \u0437\u0430 \"" + string2 + "\"";
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[5]]).id_finally().id_class(rrFH.id_class(string2, string3));
            rrLh_12.id_class(rgP_22.id_case().id_class(id_protected[4], (String)object, id_break[2]));
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x50A9160DECC17347L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3B5C08DA;
    }

    private static void id_class() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[3] = 1;
        sArray[4] = 2;
        id_case = sArray;
    }

    private static void id_break() {
        id_protected = new String[]{new String("\u0437\u0430\u0431\u0430\u043d\u0435\u043d"), new String("\u043d\u0430\u0432\u0441\u0435\u0433\u0434\u0430"), new String(" "), new String(""), new String("\u0437\u0430\u0431\u0430\u043d\u0435\u043d"), new String("\\[\u2668] (.+) \u0437\u0430\u0431\u0430\u043d\u0435\u043d \\[\u041f\u043e\u0434\u0440\u043e\u0431\u043d\u0435\u0435]"), new String("\u041f\u0440\u0438\u0447\u0438\u043d\u0430: (.+)"), new String("\u041e\u043a\u043e\u043d\u0447\u0430\u043d\u0438\u0435: (.+)")};
    }

    private static void id_throws() {
        id_byte = new byte[]{2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpN_2.id_byte();
        rrpN_2.id_break();
        rrpN_2.id_class();
        rrpN_2.id_throws();
        rrpN_2.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{Pattern.compile(id_protected[5], 0), Pattern.compile(id_protected[6]), Pattern.compile(id_protected[7])};
        id_class = objectArray;
    }
}

