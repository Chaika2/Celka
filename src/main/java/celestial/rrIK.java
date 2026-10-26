/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrIo_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIK
extends Enum<rrIK> {
    private static short[] shorts1247f214054b3fe790ff7a957ceb5ae0;
    private static String[] strings1247f214054b3fe790ff7a957ceb5ae0;
    private static boolean[] booleans1247f214054b3fe790ff7a957ceb5ae0;
    private static byte[] bytes1247f214054b3fe790ff7a957ceb5ae0;
    public Object[] fields1247f214054b3fe790ff7a957ceb5ae0;
    public static Object[] staticFields1247f214054b3fe790ff7a957ceb5ae0;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans1247f214054b3fe790ff7a957ceb5ae0 = blArray;
    }

    private rrIK() {
        ArrayList arrayList;
        this.id_implements();
        this.fields1247f214054b3fe790ff7a957ceb5ae0[rrIK.shorts1247f214054b3fe790ff7a957ceb5ae0[1]] = arrayList = new ArrayList();
    }

    static {
        rrIK.ntfClinit();
    }

    public static rrIK[] values() {
        return (rrIK[])((rrIK[])staticFields1247f214054b3fe790ff7a957ceb5ae0[shorts1247f214054b3fe790ff7a957ceb5ae0[0]]).clone();
    }

    public static rrIK valueOf(String string) {
        return Enum.valueOf(rrIK.class, string);
    }

    public void id_class() {
        Iterator iterator = ((List)this.fields1247f214054b3fe790ff7a957ceb5ae0[shorts1247f214054b3fe790ff7a957ceb5ae0[3]]).iterator();
        while (iterator.hasNext()) {
            rrIo_1 rrIo_12 = (rrIo_1)iterator.next();
            rrIo_12.id_private();
            if (!rrIo_12.id_throws()) continue;
            iterator.remove();
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5495D7C3165F3321L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-44, 18, -1, -61, -19, 92, 57, -85}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrIo_1 rrIo_12) {
        ((List)this.fields1247f214054b3fe790ff7a957ceb5ae0[shorts1247f214054b3fe790ff7a957ceb5ae0[2]]).add(rrIo_12);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF6BA2E5F;
    }

    public List<rrIo_1> id_break() {
        return (List)this.fields1247f214054b3fe790ff7a957ceb5ae0[shorts1247f214054b3fe790ff7a957ceb5ae0[4]];
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrIK(), new rrIK[]{(rrIK)((Object)objectArray[0])}};
        staticFields1247f214054b3fe790ff7a957ceb5ae0 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIK.id_byte();
        rrIK.id_protected();
        rrIK.id_case();
        rrIK.id_catch();
        rrIK.id_throws();
    }

    private static void id_catch() {
        bytes1247f214054b3fe790ff7a957ceb5ae0 = new byte[]{2};
    }

    private static void id_case() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        shorts1247f214054b3fe790ff7a957ceb5ae0 = sArray;
    }

    private void id_implements() {
        if (this.fields1247f214054b3fe790ff7a957ceb5ae0 == null) {
            Object[] objectArray = this.fields1247f214054b3fe790ff7a957ceb5ae0 = new Object[booleans1247f214054b3fe790ff7a957ceb5ae0[5]];
        }
    }

    private static void id_protected() {
        strings1247f214054b3fe790ff7a957ceb5ae0 = new String[]{new String("INSTANCE")};
    }

    private static /* synthetic */ rrIK[] id_private() {
        rrIK[] rrIKArray = new rrIK[booleans1247f214054b3fe790ff7a957ceb5ae0[0]];
        rrIKArray[rrIK.booleans1247f214054b3fe790ff7a957ceb5ae0[1]] = (rrIK)((Object)staticFields1247f214054b3fe790ff7a957ceb5ae0[shorts1247f214054b3fe790ff7a957ceb5ae0[5]]);
        return rrIKArray;
    }
}

