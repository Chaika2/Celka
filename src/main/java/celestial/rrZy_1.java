/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.module.Category;
import celestial.rrIv_1;
import celestial.rrZH;
import celestial.rrZN;
import celestial.rrZT;
import celestial.rrZw_1;
import celestial.rrtK_2;
import celestial.rrtY_2;
import celestial.rrte_3;
import celestial.rrtu_3;
import celestial.rrvJ;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZy_1
extends rrZN {
    private static float[] id_protected;
    private static String[] id_throws;
    private static boolean[] id_case;
    public static Object[] id_break;
    public Object[] id_byte;
    private static byte[] id_catch;
    private static short[] id_private;

    @Override
    public void id_byte(int n, int n2, int n3) {
        this.id_else();
        super.id_byte(n, n2, n3);
        ((rrtY_2)this.id_byte[id_private[12]]).id_byte(n, n2, n3);
    }

    private static void id_int() {
        id_catch = new byte[]{4};
    }

    public rrZy_1(rrvJ rrvJ2) {
        this.id_else();
        AnimValue animValue = new AnimValue(id_protected[0], id_case[0]);
        this.id_byte[rrZy_1.id_private[0]] = animValue;
        rrvJ rrvJ3 = rrvJ2;
        this.id_byte[rrZy_1.id_private[1]] = rrvJ3;
        rrtY_2 rrtY_22 = new rrtY_2(new rrIv_1(id_throws[0], (rrte_3)id_break[id_private[2]]).id_package(), (rrtK_2)((Object)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[id_private[3]]));
        this.id_byte[rrZy_1.id_private[4]] = rrtY_22;
        ((rrtY_2)this.id_byte[id_private[5]]).id_class(() -> {
            this.id_else();
            return Float.valueOf(((rrtY_2)this.id_byte[id_private[28]]).id_super() - id_protected[3]);
        });
    }

    static {
        rrZy_1.ntfClinit();
    }

    private static void id_this() {
        Object[] objectArray = new Object[]{rrte_3.id_class(Pattern.compile(id_throws[1], 0))};
        id_break = objectArray;
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        this.id_else();
        ((AnimValue)this.id_byte[id_private[6]]).id_class(this.id_package());
        float f5 = id_protected[1] * ((AnimValue)this.id_byte[id_private[7]]).id_byte();
        return ((rrtY_2)this.id_byte[id_private[8]]).id_class(ml_1, rrtu_32, f, f2, f3 - f5, f4, n, n2, bl);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_else();
        boolean bl = ((rrtY_2)this.id_byte[id_private[11]]).id_class(n, n2, n3);
        this.id_volatile();
        return bl;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_else();
        if (!((rrtY_2)this.id_byte[id_private[9]]).id_class(rrtu_32, n, n2, n3, bl)) {
            ((rrtY_2)this.id_byte[id_private[10]]).id_throws();
            return id_case[1];
        }
        return id_case[2];
    }

    @Override
    public void id_class(Category category, Category category2) {
        super.id_class(category, category2);
        this.id_new();
    }

    @Override
    public boolean id_class(char c, int n) {
        this.id_else();
        boolean bl = ((rrtY_2)this.id_byte[id_private[13]]).id_class(c, n);
        this.id_volatile();
        return bl;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCD82CD337B9053F8L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA3267E10;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-79, -52, -21, -34, 42, 100, -4, 70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_throws() {
        this.id_else();
        super.id_throws();
        ((rrtY_2)this.id_byte[id_private[21]]).id_throws();
    }

    private static /* synthetic */ void ntfClinit() {
        rrZy_1.id_synchronized();
        rrZy_1.id_super();
        rrZy_1.id_native();
        rrZy_1.id_continue();
        rrZy_1.id_int();
        rrZy_1.id_this();
    }

    public AnimValue id_finally() {
        this.id_else();
        return (AnimValue)this.id_byte[id_private[27]];
    }

    @Override
    public void id_catch() {
        this.id_else();
        super.id_catch();
        ((rrtY_2)this.id_byte[id_private[22]]).id_catch();
    }

    public rrtY_2 id_extends() {
        this.id_else();
        return (rrtY_2)this.id_byte[id_private[26]];
    }

    private static void id_continue() {
        short[] sArray = new short[29];
        sArray[0] = 2;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 3;
        sArray[16] = 3;
        sArray[17] = 3;
        sArray[18] = 3;
        sArray[19] = 3;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[26] = 1;
        sArray[27] = 2;
        sArray[28] = 1;
        id_private = sArray;
    }

    private void id_else() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_catch[0]];
        }
    }

    private void id_new() {
        this.id_else();
        if ((Float)this.id_byte[id_private[17]] == null) {
            return;
        }
        rrZH rrZH2 = this.id_return();
        if (rrZH2 != null) {
            rrZH2.id_class(((Float)this.id_byte[id_private[18]]).floatValue());
        }
        Object var6_2 = null;
        this.id_byte[rrZy_1.id_private[19]] = var6_2;
    }

    private boolean id_package() {
        this.id_else();
        rrZN rrZN2 = ((rrvJ)this.id_byte[id_private[25]]).id_native();
        return rrZN2 instanceof rrZw_1;
    }

    private rrZH id_return() {
        rrZH rrZH2;
        this.id_else();
        rrZN rrZN2 = ((rrvJ)this.id_byte[id_private[20]]).id_native();
        if (rrZN2 instanceof rrZT) {
            rrZT rrZT2 = (rrZT)((Object)rrZN2);
            rrZH2 = rrZT2.id_case().id_extends();
        } else {
            rrZH2 = null;
        }
        return rrZH2;
    }

    private static void id_super() {
        id_throws = new String[]{new String("\u041f\u043e\u0438\u0441\u043a"), new String("[a-zA-Z\u0430-\u044f\u0410-\u042f0-9 -]+")};
    }

    @Override
    public void id_protected() {
        this.id_else();
        super.id_protected();
        ((rrtY_2)this.id_byte[id_private[24]]).id_protected();
    }

    @Override
    public void id_private() {
        this.id_else();
        super.id_private();
        this.id_new();
        ((rrtY_2)this.id_byte[id_private[23]]).id_private();
    }

    private void id_volatile() {
        this.id_else();
        rrZH rrZH2 = this.id_return();
        if (rrZH2 == null) {
            return;
        }
        if (!((rrtY_2)this.id_byte[id_private[14]]).id_new()) {
            if ((Float)this.id_byte[id_private[15]] == null) {
                Float f = Float.valueOf(rrZH2.id_break());
                this.id_byte[rrZy_1.id_private[16]] = f;
                rrZH2.id_class(id_protected[2]);
            }
        } else {
            this.id_new();
        }
    }

    private static void id_synchronized() {
        boolean[] blArray = new boolean[5];
        blArray[4] = true;
        id_case = blArray;
    }

    private static void id_native() {
        float[] fArray = new float[4];
        fArray[0] = 0.6f;
        fArray[1] = 54.0f;
        fArray[3] = 40.0f;
        id_protected = fArray;
    }
}

