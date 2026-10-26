/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bt_1;
import celestial.rja_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bn_1
extends Bt_1 {
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static boolean[] id_throws;

    public Bn_1(String string, Pattern[] patternArray) {
        super(string);
        Pattern[] patternArray2;
        this.id_private();
        this.id_class[Bn_1.id_protected[0]] = patternArray2 = patternArray;
    }

    static {
        Bn_1.ntfClinit();
    }

    public void id_class(rja_3 rja_32) {
        this.id_private();
        rja_3 rja_33 = rja_32;
        this.id_class[Bn_1.id_protected[5]] = rja_33;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFB6054D49BCC4FAAL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{69, -115, -28, -108, 35, -62, 118, -26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA82ECE1A;
    }

    public rja_3 id_break(String string) throws NullPointerException {
        this.id_private();
        if (((Pattern[])this.id_class[id_protected[1]]).length == 0) {
            throw new NullPointerException("\u041d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d\u044b \u043f\u0430\u0442\u0442\u0435\u0440\u043d\u044b \u0434\u043b\u044f " + this.getClass().getSimpleName());
        }
        Pattern[] patternArray = (Pattern[])this.id_class[id_protected[2]];
        int n = patternArray.length;
        for (int i = id_throws[0]; i < n; ++i) {
            Pattern pattern = patternArray[i];
            Matcher matcher = pattern.matcher(string);
            if (!matcher.find()) continue;
            try {
                int n2;
                int n3 = Integer.parseInt(matcher.group(id_throws[1]));
                int n4 = id_byte[0];
                int n5 = matcher.groupCount();
                String string2 = matcher.group(id_byte[1]);
                if (n5 == id_byte[2]) {
                    n2 = Integer.parseInt(string2);
                } else {
                    if (string2 != null) {
                        n4 = Integer.parseInt(string2);
                    }
                    n2 = Integer.parseInt(matcher.group(id_byte[3]));
                }
                return new rja_3(n3, n4, n2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Pattern[] id_break() {
        this.id_private();
        return (Pattern[])this.id_class[id_protected[3]];
    }

    private static /* synthetic */ void ntfClinit() {
        Bn_1.id_implements();
        Bn_1.id_catch();
        Bn_1.id_finally();
    }

    private static void id_finally() {
        id_byte = new byte[]{75, 2, 2, 3, 2};
    }

    private static void id_catch() {
        short[] sArray = new short[6];
        sArray[4] = 1;
        sArray[5] = 1;
        id_protected = sArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
        }
    }

    public rja_3 e_() {
        this.id_private();
        return (rja_3)this.id_class[id_protected[4]];
    }
}

