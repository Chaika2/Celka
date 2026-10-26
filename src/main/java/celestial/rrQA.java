/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LV;
import celestial.Lt_1;
import celestial.QY;
import celestial.rrQC;
import celestial.rrQk_1;
import celestial.rrQn_1;
import celestial.rrQx_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQA
extends LV<rrQn_1> {
    private static short[] id_throws;
    private static double[] id_case;
    private static byte[] id_catch;
    public Object[] id_class;
    private static boolean[] id_private;

    public static /* synthetic */ Lt_1 id_byte(rrQA rrQA2, int n) {
        return rrQA2.id_byte(n);
    }

    public rrQA(rrQC rrQC2, QY qY, int n, int n2, int n3, int n4, int n5) {
        super(qY, n, n2, n3, n4, n5);
        this.id_public();
        rrQC rrQC3 = rrQC2;
        this.id_class[rrQA.id_throws[0]] = rrQC3;
    }

    static {
        rrQA.ntfClinit();
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        rrQn_1 rrQn_12 = (rrQn_1)this.id_finally();
        return rrQn_12 != null && rrQn_12.id_class(n, n2, n3) || super.id_class(n, n2, n3) ? id_private[3] : id_private[4];
    }

    public static /* synthetic */ Lt_1 id_class(rrQA rrQA2, int n) {
        return rrQA2.id_byte(n);
    }

    public static /* synthetic */ void id_class(rrQA rrQA2, Lt_1 lt_1) {
        rrQA2.id_protected(lt_1);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE5ED990CB3C92479L;
    }

    @Override
    public void id_class(rrQn_1 rrQn_12) {
        this.id_public();
        super.id_class(rrQn_12);
        ((rrQC)this.id_class[id_throws[2]]).id_byte(rrQn_12 != null ? id_private[1] : id_private[2]);
    }

    @Override
    public void id_class(String string) {
        this.id_native();
        this.id_class(id_case[0]);
        ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_throws[1]]).id_class().stream().filter(rrQx_12 -> rrQx_12.id_class().toLowerCase().contains(string.toLowerCase())).forEach(rrQx_12 -> {
            this.id_public();
            this.id_break(new rrQn_1(this, this.id_native, (rrQC)this.id_class[id_throws[3]], (rrQx_1)rrQx_12));
        });
        this.id_class(this.id_this().isEmpty() ? null : (rrQn_1)this.id_byte(id_private[0]));
    }

    public static /* synthetic */ Lt_1 id_break(rrQA rrQA2, int n) {
        return rrQA2.id_byte(n);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-28, 23, 124, 2, -10, 40, 73, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrQA.id_implements();
        rrQA.id_return();
        rrQA.id_else();
        rrQA.id_synchronized();
    }

    private static void id_else() {
        id_case = new double[1];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        id_private = blArray;
    }

    private static void id_return() {
        id_throws = new short[4];
    }

    private void id_public() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_private[5]];
        }
    }

    @Override
    public int id_protected() {
        return super.id_protected() + id_catch[1];
    }

    private static int id_private(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7641D822;
    }

    public Optional<rrQn_1> id_private() {
        return Optional.ofNullable((rrQn_1)this.id_finally());
    }

    private static void id_synchronized() {
        id_catch = new byte[]{30, 5};
    }

    @Override
    public int F_() {
        return super.F_() + id_catch[0];
    }
}

