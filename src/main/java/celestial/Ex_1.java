/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_import;
import celestial.C_interface;
import celestial.m_1;
import celestial.rVi_1;
import celestial.sS_2;
import celestial.u_1;
import celestial.v_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ex_1 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static String[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        id_protected = new String[]{new String("help"), new String("help")};
    }

    public Ex_1(C_interface c_interface, String string, sS_2 sS_22) {
        this.id_catch();
        C_interface c_interface2 = c_interface;
        this.id_class[Ex_1.id_throws[0]] = c_interface2;
        String string2 = string;
        this.id_class[Ex_1.id_throws[1]] = string2;
        sS_2 sS_23 = sS_22;
        this.id_class[Ex_1.id_throws[2]] = sS_23;
    }

    static {
        Ex_1.ntfClinit();
    }

    private static void id_class() {
        short[] sArray = new short[17];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[13] = 2;
        sArray[15] = 1;
        sArray[16] = 2;
        id_throws = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x473113952737DCEBL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x25B3F983;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-62, 123, 78, 75, -65, 102, 94, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new byte[]{3};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Ex_1.id_throws();
        Ex_1.id_byte();
        Ex_1.id_class();
        Ex_1.id_break();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public void id_case() {
        LinkedList<C_import> linkedList = ((sS_2)this.id_class[id_throws[3]]).id_byte();
        try {
            Object object;
            if (!((C_interface)this.id_class[id_throws[4]]).id_case() && !linkedList.isEmpty() && ((String)(object = linkedList.get(id_byte[0]).id_break().toLowerCase())).equals(id_protected[0])) {
                rVi_1[] rVi_1Array = new rVi_1[id_byte[1]];
                rVi_1Array[Ex_1.id_byte[2]] = ((C_interface)this.id_class[id_throws[6]]).id_class();
                ((C_interface)this.id_class[id_throws[5]]).id_class(rVi_1Array);
                return;
            }
            object = ((C_interface)this.id_class[id_throws[7]]).id_byte();
            if (object == null) {
                ((C_interface)this.id_class[id_throws[8]]).id_class((String)this.id_class[id_throws[9]], (sS_2)this.id_class[id_throws[10]]);
            } else {
                object.id_class((C_interface)this.id_class[id_throws[11]], linkedList);
            }
        }
        catch (Throwable throwable) {
            m_1 m_12 = throwable instanceof m_1 ? (m_1)((Object)throwable) : new u_1(throwable);
            m_12.id_class((C_interface)this.id_class[id_throws[12]], linkedList);
        }
    }

    public Stream<String> id_protected() {
        try {
            String[] stringArray = new String[id_byte[3]];
            stringArray[Ex_1.id_byte[4]] = id_protected[1];
            Stream<String> stream = new v_1().id_break(stringArray).id_class(((sS_2)this.id_class[id_throws[13]]).id_implements()).id_protected();
            Stream<String> stream2 = ((C_interface)this.id_class[id_throws[14]]).id_break((String)this.id_class[id_throws[15]], (sS_2)this.id_class[id_throws[16]]);
            return Stream.concat(stream2, stream);
        }
        catch (Throwable throwable) {
            return Stream.empty();
        }
    }
}

