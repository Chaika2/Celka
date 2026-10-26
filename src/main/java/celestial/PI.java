/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pf_1;
import celestial.rql_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PI {
    public static Object[] id_class;
    private static boolean[] id_byte;
    public Object[] id_break;
    private static String[] id_protected;
    private static byte[] id_throws;
    private static short[] id_case;

    private static void id_byte() {
        short[] sArray = new short[6];
        sArray[1] = 3;
        sArray[3] = 1;
        sArray[5] = 1;
        id_case = sArray;
    }

    public PI(Pf_1 pf_1, String string) {
        this.id_private();
        Pf_1 pf_12 = pf_1;
        this.id_break[PI.id_case[4]] = pf_12;
        String string2 = string;
        this.id_break[PI.id_case[5]] = string2;
    }

    static {
        PI.ntfClinit();
    }

    public Pf_1 id_class() {
        return (Pf_1)((Object)this.id_break[id_case[2]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x44FC3C7A;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-70, 44, -117, 102, 126, -25, 91, 46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x36A85E2D2A32459CL;
    }

    public String id_break() {
        return (String)this.id_break[id_case[3]];
    }

    public static PI id_break(String string) {
        if (rql_3.id_break(string)) {
            return null;
        }
        Matcher matcher = ((Pattern)id_class[id_case[0]]).matcher(string);
        if (matcher.find()) {
            String string2 = matcher.group(id_byte[0]);
            String string3 = matcher.group(id_throws[0]);
            Pf_1[] pf_1Array = (Pf_1[])Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_case[1]];
            int n = pf_1Array.length;
            for (int i = id_byte[1]; i < n; ++i) {
                Pf_1 pf_1 = pf_1Array[i];
                if (!pf_1.id_class().equalsIgnoreCase(string2)) continue;
                return new PI(pf_1, string3);
            }
        }
        return null;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        PI.id_throws();
        PI.id_case();
        PI.id_byte();
        PI.id_catch();
        PI.id_protected();
    }

    private static void id_catch() {
        id_throws = new byte[]{2, 2};
    }

    private static void id_case() {
        id_protected = new String[]{new String("(an|grief|hub)(\\d*)")};
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{Pattern.compile(id_protected[0], 0)};
        id_class = objectArray;
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[1]];
        }
    }
}

