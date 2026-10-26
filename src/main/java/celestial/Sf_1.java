/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.SI;
import celestial.Sj_1;
import celestial.St_1;
import celestial.rfj_3;
import celestial.roJ_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sf_1
implements Runnable {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public Sf_1(SI sI) {
        this.id_byte();
        SI sI2 = sI;
        this.id_class[Sf_1.id_byte[0]] = sI2;
    }

    static {
        Sf_1.ntfClinit();
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    rfj_3 rfj_32 = (rfj_3)((LinkedBlockingQueue)((SI)this.id_class[Sf_1.id_byte[1]]).id_break[id_byte[2]]).take();
                    roJ_2 roJ_22 = (roJ_2)((Map)((SI)this.id_class[Sf_1.id_byte[3]]).id_break[id_byte[4]]).remove(rfj_32);
                    if (((LinkedBlockingQueue)((SI)this.id_class[Sf_1.id_byte[5]]).id_break[id_byte[6]]).size() > (Integer)C_class.id_instanceof().rw.id_class[id_byte[7]]) continue;
                    St_1 st_1 = Sj_1.id_class(roJ_22);
                    ((SI)this.id_class[id_byte[8]]).id_class(st_1);
                }
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                continue;
            }
            break;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6B5F36D2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDE8EB52798DD2F2DL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{53, 29, -88, -44, -4, -56, -89, -20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new boolean[]{true};
    }

    private static void id_break() {
        short[] sArray = new short[9];
        sArray[2] = 2;
        sArray[4] = 3;
        sArray[6] = 2;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Sf_1.id_class();
        Sf_1.id_break();
    }
}

