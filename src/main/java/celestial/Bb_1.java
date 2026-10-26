/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.QY;
import celestial.Y;
import celestial.cq_3;
import celestial.q_1;
import celestial.rgP_2;
import celestial.rrFI;
import celestial.rrFK;
import celestial.rrFw_1;
import celestial.rrQX;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrjS_2;
import celestial.uj_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bb_1
extends Pv_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_break;
    private static String[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_protected = blArray;
    }

    public Bb_1(C_class c_class) {
        super(c_class);
        this.id_case();
    }

    static {
        Bb_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x184C66E7EDF0A4E8L;
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_class(id_protected[0]);
    }

    public void id_class(boolean bl) {
        this.id_case();
        if (bl != (Boolean)this.id_break[id_byte[1]]) {
            Boolean bl2 = bl;
            this.id_break[Bb_1.id_byte[2]] = bl2;
            rrFw_1 rrFw_12 = rrFw_1.id_class((Boolean)this.id_break[id_byte[3]] != false ? (rrFI)((Object)rrFI.staticFields7eee503931553d5586d91adc0f9df349[id_byte[4]]) : (rrFI)((Object)rrFI.staticFields7eee503931553d5586d91adc0f9df349[id_byte[5]]));
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[6]]).id_finally().id_class(rrFw_12);
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[7]]).id_class(rrFw_12);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9D8C9A8F;
    }

    @Override
    public void id_class(q_1 q_12) {
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]])) {
            this.id_class(this.id_protected());
        }
    }

    public boolean id_class() {
        this.id_case();
        return (Boolean)this.id_break[id_byte[14]];
    }

    private static void id_break() {
        short[] sArray = new short[15];
        sArray[5] = 1;
        sArray[8] = 1;
        sArray[9] = 19;
        sArray[10] = 19;
        sArray[11] = 19;
        sArray[12] = 1;
        sArray[13] = 2;
        id_byte = sArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-103, -76, -124, 113, 5, 17, 6, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_throws = new String[]{new String("pvp"), new String("\u043e\u0431\u044b\u0447\u043d\u0430\u044f \u0434\u0443\u044d\u043b\u044c"), new String("\u043b\u0438\u0447\u043d\u0430\u044f \u0434\u0443\u044d\u043b\u044c"), new String("\u043a\u043e\u043c\u0430\u043d\u0434\u043d\u0430\u044f \u0434\u0443\u044d\u043b\u044c"), new String("\u0440\u0435\u0439\u0442\u0438\u043d\u0433\u043e\u0432\u0430\u044f \u0434\u0443\u044d\u043b\u044c"), new String("pvp"), new String("\u043e\u043a\u043e\u043d\u0447\u0435\u043d\u043e")};
    }

    private static /* synthetic */ void ntfClinit() {
        Bb_1.id_byte();
        Bb_1.id_throws();
        Bb_1.id_break();
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[6]];
            objectArray[Bb_1.id_protected[7]] = id_protected[8];
        }
    }

    private boolean id_protected() {
        String string;
        QY qY = ((Ps_1)this.id_class[id_byte[8]]).id_throws();
        uj_3 uj_32 = ((cq_3)qY.id_class[id_byte[9]]).id_extends();
        rgP_2 rgP_22 = ((cq_3)qY.id_class[id_byte[10]]).id_final();
        int n = ((cq_3)qY.id_class[id_byte[11]]).id_package();
        if (uj_32.id_class(id_throws[0])) {
            return id_protected[1];
        }
        if ((rrfq_3)((Object)rrfp_3.id_class[id_byte[12]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[13]]) && (uj_32.id_class(id_throws[1]) || uj_32.id_class(id_throws[2]) || uj_32.id_class(id_throws[3]) || uj_32.id_class(id_throws[4]))) {
            return id_protected[2];
        }
        if (rrjS_2.id_protected()) {
            return id_protected[3];
        }
        if (rgP_22 != null && n > 0 && (string = rgP_22.getString().toLowerCase()).contains(id_throws[5]) && !string.contains(id_throws[6])) {
            return id_protected[4];
        }
        return id_protected[5];
    }
}

