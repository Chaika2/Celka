/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C;
import celestial.C_class;
import celestial.Pv_1;
import celestial.Y;
import celestial.module.util.RwHelper;
import celestial.q_1;
import celestial.rrAl_1;
import celestial.rrFI;
import celestial.rrFK;
import celestial.rrFw_1;
import celestial.rrQX;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrtd_3;
import celestial.rrth_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BJ
extends Pv_1
implements MinecraftAccessor {
    private static short[] id_byte;
    private static float[] id_protected;
    private static String[] id_throws;
    private static byte[] id_case;
    private static boolean[] id_catch;
    public Object[] id_break;

    private static void id_byte() {
        short[] sArray = new short[22];
        sArray[2] = 1;
        sArray[6] = 5000;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[16] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        id_byte = sArray;
    }

    public BJ(C_class c_class) {
        super(c_class);
        this.id_break();
    }

    static {
        BJ.ntfClinit();
    }

    @Override
    public void id_class(rrFw_1 rrFw_12) {
        this.id_break();
        if (rrFw_12.id_class() == (rrFI)((Object)rrFI.staticFields7eee503931553d5586d91adc0f9df349[id_byte[11]])) {
            Boolean bl = id_catch[3];
            this.id_break[BJ.id_byte[12]] = bl;
        } else if (rrFw_12.id_class() == (rrFI)((Object)rrFI.staticFields7eee503931553d5586d91adc0f9df349[id_byte[13]])) {
            Boolean bl = id_catch[4];
            this.id_break[BJ.id_byte[14]] = bl;
        }
    }

    private static void id_class() {
        id_throws = new String[]{new String("/hub")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF9C7F677;
    }

    @Override
    public void id_class(C c) {
        this.id_break();
        String string = c.id_class();
        if (string.startsWith(id_throws[0])) {
            Boolean bl = id_catch[5];
            this.id_break[BJ.id_byte[15]] = bl;
            Boolean bl2 = id_catch[6];
            this.id_break[BJ.id_byte[16]] = bl2;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x639307F9165EC89FL;
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_break();
        Boolean bl = id_catch[7];
        this.id_break[BJ.id_byte[17]] = bl;
        Boolean bl2 = id_catch[8];
        this.id_break[BJ.id_byte[18]] = bl2;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_break();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]])) {
            if (!this.id_protected()) {
                return;
            }
            if (((Boolean)this.id_break[id_byte[1]]).booleanValue() && ((Boolean)this.id_break[id_byte[2]]).booleanValue()) {
                RwHelper rwHelper = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[3]]).id_private().R();
                String string = "\u041d\u0430\u043f\u0438\u0448\u0438\u0442\u0435 '" + (String)C_class.id_instanceof().id_protected.id_class[id_byte[4]] + "rct' \u0447\u0442\u043e\u0431\u044b \u0441\u0431\u0440\u043e\u0441\u0438\u0442\u044c \u0444\u043b\u0430\u0433\u0438 \u0430\u043d\u0442\u0438\u0447\u0438\u0442\u0430";
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_byte[5]]).id_class(new rrtd_3(rwHelper.id_final(), string, (int)id_byte[6]));
                rrfu_3.id_byte(string);
                Boolean bl = id_catch[0];
                this.id_break[BJ.id_byte[7]] = bl;
                Boolean bl2 = id_catch[1];
                this.id_break[BJ.id_byte[8]] = bl2;
            }
        }
    }

    @Override
    public void id_class(rrAl_1 rrAl_12) {
        this.id_break();
        if (((Boolean)this.id_break[id_byte[9]]).booleanValue() && rrAl_12.id_class() > id_protected[0]) {
            Boolean bl = id_catch[2];
            this.id_break[BJ.id_byte[10]] = bl;
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, -118, 61, 118, -70, 92, -101, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[0]];
            objectArray[BJ.id_catch[12]] = id_catch[13];
            objectArray[BJ.id_catch[14]] = id_catch[15];
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[16];
        blArray[2] = true;
        blArray[3] = true;
        blArray[11] = true;
        blArray[14] = true;
        id_catch = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        BJ.id_throws();
        BJ.id_class();
        BJ.id_byte();
        BJ.id_catch();
        BJ.id_case();
    }

    private static void id_catch() {
        id_protected = new float[]{10.0f};
    }

    private static void id_case() {
        id_case = new byte[]{2};
    }

    private boolean id_protected() {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_byte[19]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[20]])) {
            return id_catch[9];
        }
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[21]]).id_private().R().aJ_()) {
            return id_catch[10];
        }
        return id_catch[11];
    }
}

