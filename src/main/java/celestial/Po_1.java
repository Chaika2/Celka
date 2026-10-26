/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PK;
import celestial.Pg_1;
import celestial.rql_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Po_1 {
    private static boolean[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static byte[] id_protected;
    private static String[] id_throws;
    private static short[] id_case;

    private static void id_byte() {
        id_throws = new String[]{new String("(?i)(\u0441\u043e\u043b\u043e\u043b\u0430\u0439\u0442|\u0434\u0443\u043e\u043b\u0430\u0439\u0442|\u0442\u0440\u0438\u043e\u043b\u0430\u0439\u0442|\u043a\u043b\u0430\u043d\u043b\u0430\u0439\u0442|\u043b\u0430\u0439\u0442120|\u043a\u043b\u0430\u0441\u0441\u0438\u043a|\u043b\u043e\u0431\u0431\u0438|sololite|duolite|triolite|clanlite|lite120|classic)(\\d+)")};
    }

    public Po_1(PK pK, String string) {
        this.id_catch();
        PK pK2 = pK;
        this.id_class[Po_1.id_case[6]] = pK2;
        String string2 = string;
        this.id_class[Po_1.id_case[7]] = string2;
    }

    static {
        Po_1.ntfClinit();
    }

    public String id_class() {
        return (String)this.id_class[id_case[5]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-63, -126, 126, 120, -108, -94, 44, -117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5336610AFFEF5310L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4BB8C9A7;
    }

    public static Po_1 id_break(String string) {
        if (rql_3.id_break(string)) {
            return null;
        }
        Matcher matcher = ((Pattern)id_break[id_case[0]]).matcher(string.toLowerCase());
        if (matcher.find()) {
            PK pK;
            int n;
            int n2;
            PK[] pKArray;
            String string2 = matcher.group(id_byte[0]);
            String string3 = matcher.group(id_protected[0]);
            String string4 = (String)((Map)Pg_1.id_throws[id_case[1]]).get(string2);
            if (string4 != null) {
                pKArray = (PK[])PK.staticFields6a264fee257833ddb403077ab7e90d84[id_case[2]];
                n2 = pKArray.length;
                for (n = id_byte[1]; n < n2; ++n) {
                    pK = pKArray[n];
                    if (!pK.id_class().equals(string4)) continue;
                    return new Po_1(pK, string3);
                }
            }
            pKArray = (PK[])PK.staticFields6a264fee257833ddb403077ab7e90d84[id_case[3]];
            n2 = pKArray.length;
            for (n = id_byte[2]; n < n2; ++n) {
                pK = pKArray[n];
                if (!pK.id_class().equalsIgnoreCase(string2)) continue;
                return new Po_1(pK, string3);
            }
        }
        return null;
    }

    public PK id_break() {
        return (PK)((Object)this.id_class[id_case[4]]);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Po_1.id_throws();
        Po_1.id_byte();
        Po_1.id_private();
        Po_1.id_case();
        Po_1.id_protected();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
        }
    }

    private static void id_case() {
        id_protected = new byte[]{2, 2};
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{Pattern.compile(id_throws[0], 0)};
        id_break = objectArray;
    }

    private static void id_private() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 7;
        sArray[3] = 7;
        sArray[5] = 1;
        sArray[7] = 1;
        id_case = sArray;
    }
}

