/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfb_3
extends Enum<rrfb_3> {
    private static byte[] bytes6cf753d486d83843b93ccc10386a903f;
    private static boolean[] booleans6cf753d486d83843b93ccc10386a903f;
    private static short[] shorts6cf753d486d83843b93ccc10386a903f;
    private static String[] strings6cf753d486d83843b93ccc10386a903f;
    public Object[] fields6cf753d486d83843b93ccc10386a903f;
    public static Object[] staticFields6cf753d486d83843b93ccc10386a903f;

    private static void id_byte() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans6cf753d486d83843b93ccc10386a903f = blArray;
    }

    private rrfb_3(String string2) {
        this.id_break();
        String string3 = string2;
        this.fields6cf753d486d83843b93ccc10386a903f[rrfb_3.shorts6cf753d486d83843b93ccc10386a903f[2]] = string3;
    }

    static {
        rrfb_3.ntfClinit();
    }

    public static rrfb_3[] values() {
        return (rrfb_3[])((rrfb_3[])staticFields6cf753d486d83843b93ccc10386a903f[shorts6cf753d486d83843b93ccc10386a903f[0]]).clone();
    }

    public static rrfb_3 valueOf(String string) {
        return Enum.valueOf(rrfb_3.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x177CCEB2;
    }

    public String id_class() {
        return (String)this.fields6cf753d486d83843b93ccc10386a903f[shorts6cf753d486d83843b93ccc10386a903f[1]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{108, -39, 97, -41, -92, -26, 50, 54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2B49E63904A6EF53L;
    }

    private void id_break() {
        if (this.fields6cf753d486d83843b93ccc10386a903f == null) {
            this.fields6cf753d486d83843b93ccc10386a903f = new Object[1];
        }
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrfb_3(strings6cf753d486d83843b93ccc10386a903f[1]), new rrfb_3(strings6cf753d486d83843b93ccc10386a903f[3]), new rrfb_3(strings6cf753d486d83843b93ccc10386a903f[5]), new rrfb_3[]{(rrfb_3)((Object)objectArray[0]), (rrfb_3)((Object)objectArray[1]), (rrfb_3)((Object)objectArray[2])}};
        staticFields6cf753d486d83843b93ccc10386a903f = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfb_3.id_byte();
        rrfb_3.id_case();
        rrfb_3.id_catch();
        rrfb_3.id_private();
        rrfb_3.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[6];
        sArray[0] = 3;
        sArray[4] = 1;
        sArray[5] = 2;
        shorts6cf753d486d83843b93ccc10386a903f = sArray;
    }

    private static void id_case() {
        strings6cf753d486d83843b93ccc10386a903f = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static /* synthetic */ rrfb_3[] id_protected() {
        rrfb_3[] rrfb_3Array = new rrfb_3[bytes6cf753d486d83843b93ccc10386a903f[0]];
        rrfb_3Array[rrfb_3.booleans6cf753d486d83843b93ccc10386a903f[0]] = (rrfb_3)((Object)staticFields6cf753d486d83843b93ccc10386a903f[shorts6cf753d486d83843b93ccc10386a903f[3]]);
        rrfb_3Array[rrfb_3.booleans6cf753d486d83843b93ccc10386a903f[1]] = (rrfb_3)((Object)staticFields6cf753d486d83843b93ccc10386a903f[shorts6cf753d486d83843b93ccc10386a903f[4]]);
        rrfb_3Array[rrfb_3.bytes6cf753d486d83843b93ccc10386a903f[1]] = (rrfb_3)((Object)staticFields6cf753d486d83843b93ccc10386a903f[shorts6cf753d486d83843b93ccc10386a903f[5]]);
        return rrfb_3Array;
    }

    private static void id_private() {
        bytes6cf753d486d83843b93ccc10386a903f = new byte[]{3, 2, 2, 2, 3, 4};
    }
}

