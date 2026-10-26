/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvc_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static String[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        id_protected = new String[]{new String("{"), new String(":"), new String("["), new String(","), new String(""), new String("]"), new String("}"), new String(","), new String("\""), new String("\\\""), new String("\\\\"), new String("\\n"), new String("\\r"), new String("\\t"), new String("\\b"), new String("\\f"), new String("\\u%04x"), new String("\"")};
    }

    public rrvc_1() {
        HashMap hashMap;
        this.id_break();
        this.id_class[rrvc_1.id_break[0]] = hashMap = new HashMap();
    }

    static {
        rrvc_1.ntfClinit();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Set set = ((HashMap)this.id_class[id_break[2]]).entrySet();
        stringBuilder.append(id_protected[0]);
        int n = id_byte[0];
        for (Map.Entry entry : set) {
            Object v = entry.getValue();
            stringBuilder.append(this.id_break((String)entry.getKey())).append(id_protected[1]);
            if (v instanceof String) {
                stringBuilder.append(this.id_break(String.valueOf(v)));
            } else if (v instanceof Integer) {
                stringBuilder.append(Integer.valueOf(String.valueOf(v)));
            } else if (v instanceof Boolean) {
                stringBuilder.append(v);
            } else if (v instanceof rrvc_1) {
                stringBuilder.append(v);
            } else if (v.getClass().isArray()) {
                stringBuilder.append(id_protected[2]);
                int n2 = Array.getLength(v);
                for (int i = id_byte[1]; i < n2; ++i) {
                    stringBuilder.append(Array.get(v, i).toString()).append(i != n2 - id_byte[2] ? id_protected[3] : id_protected[4]);
                }
                stringBuilder.append(id_protected[5]);
            }
            stringBuilder.append(++n == set.size() ? id_protected[6] : id_protected[7]);
        }
        return stringBuilder.toString();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{55, 111, -13, -17, 98, 82, 21, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(String string, Object object) {
        if (object != null) {
            ((HashMap)this.id_class[id_break[1]]).put(string, object);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8C7407C0B9DB9B6FL;
    }

    private static void id_class() {
        id_throws = new byte[]{32};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x892027E2;
    }

    private String id_break(String string) {
        StringBuilder stringBuilder = new StringBuilder(id_protected[8]);
        block9: for (int i = id_byte[3]; i < string.length(); ++i) {
            char c = string.charAt(i);
            switch (c) {
                case '\"': {
                    stringBuilder.append(id_protected[9]);
                    continue block9;
                }
                case '\\': {
                    stringBuilder.append(id_protected[10]);
                    continue block9;
                }
                case '\n': {
                    stringBuilder.append(id_protected[11]);
                    continue block9;
                }
                case '\r': {
                    stringBuilder.append(id_protected[12]);
                    continue block9;
                }
                case '\t': {
                    stringBuilder.append(id_protected[13]);
                    continue block9;
                }
                case '\b': {
                    stringBuilder.append(id_protected[14]);
                    continue block9;
                }
                case '\f': {
                    stringBuilder.append(id_protected[15]);
                    continue block9;
                }
                default: {
                    if (c < id_throws[0]) {
                        Object[] objectArray = new Object[id_byte[4]];
                        objectArray[rrvc_1.id_byte[5]] = (int)c;
                        stringBuilder.append(String.format(id_protected[16], objectArray));
                        continue block9;
                    }
                    stringBuilder.append(c);
                }
            }
        }
        return stringBuilder.append(id_protected[17]).toString();
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[6]];
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvc_1.id_throws();
        rrvc_1.id_byte();
        rrvc_1.id_protected();
        rrvc_1.id_class();
    }

    private static void id_protected() {
        id_break = new short[3];
    }
}

