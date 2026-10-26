/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrIN;
import celestial.rrtf_3;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIQ
extends Setting<String>
implements rrtf_3<String> {
    public Object[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;

    public rrIQ(String string, String string2, String ... stringArray) {
        super(string, string2);
        List<String> list;
        this.id_package();
        rrIN rrIN2 = (rrIN)((Object)rrIN.staticFields6143465a63de38df9c2f3f3e8f0ab649[id_protected[0]]);
        this.id_break[rrIQ.id_protected[1]] = rrIN2;
        String string3 = string;
        this.id_class[rrIQ.id_protected[2]] = string3;
        this.id_break[rrIQ.id_protected[3]] = list = Arrays.asList(stringArray);
        Integer n = ((List)this.id_break[id_protected[4]]).indexOf(string2);
        this.id_break[rrIQ.id_protected[5]] = n;
    }

    static {
        rrIQ.ntfClinit();
    }

    public void id_class(String string, boolean bl) {
        this.id_package();
        if (!((List)this.id_break[id_protected[6]]).contains(string)) {
            this.id_class((String)((List)this.id_break[id_protected[7]]).get(id_throws[0]), bl, id_throws[1]);
            Integer n = id_throws[2];
            this.id_break[rrIQ.id_protected[8]] = n;
            return;
        }
        this.id_class(string, bl, id_throws[3]);
        Integer n = ((List)this.id_break[id_protected[9]]).indexOf(string);
        this.id_break[rrIQ.id_protected[10]] = n;
    }

    public rrIQ id_class(rrIN rrIN2) {
        this.id_package();
        rrIN rrIN3 = rrIN2;
        this.id_break[rrIQ.id_protected[15]] = rrIN3;
        return this;
    }

    @Override
    public List<String> id_class() {
        this.id_package();
        return (List)this.id_break[id_protected[13]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC997FCFE;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x51CA391B33E7DAC4L;
    }

    @Override
    public Setting<String> id_break() {
        return this;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIQ.id_native();
        rrIQ.id_volatile();
        rrIQ.id_final();
    }

    public rrIN id_finally() {
        this.id_package();
        return (rrIN)((Object)this.id_break[id_protected[14]]);
    }

    public String id_extends() {
        this.id_package();
        return (String)((List)this.id_break[id_protected[11]]).get((Integer)this.id_break[id_protected[12]]);
    }

    private void id_package() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
            objectArray[rrIQ.id_throws[4]] = id_throws[5];
        }
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-1, 16, 109, -32, -119, 44, 49, 90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        id_byte = new byte[]{3};
    }

    private static void id_volatile() {
        short[] sArray = new short[16];
        sArray[1] = 2;
        sArray[5] = 1;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[14] = 2;
        sArray[15] = 2;
        id_protected = sArray;
    }

    private static void id_native() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        id_throws = blArray;
    }
}

