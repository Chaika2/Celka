/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ml_1;
import celestial.module.Module;
import celestial.rrIF;
import celestial.rrIk_1;
import celestial.rrZL;
import celestial.rrZi_1;
import celestial.rrfD_2;
import celestial.rrnZ_2;
import celestial.rrnv_3;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrvO
extends rrtN_2 {
    private static float[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static String[] id_native;
    private static int[] id_volatile;

    @Override
    public String id_byte() {
        this.id_super();
        return ((rrZi_1)this.id_class[id_protected[1]]).id_private().id_final();
    }

    public rrvO(rrZi_1 rrZi_12, Supplier<Float> supplier, Supplier<Float> supplier2) {
        super(supplier, supplier2, () -> Float.valueOf(id_break[5]), () -> Float.valueOf(id_break[4]));
        this.id_super();
        rrZi_1 rrZi_13 = rrZi_12;
        this.id_class[rrvO.id_protected[0]] = rrZi_13;
        Module module = rrZi_12.id_private();
        if (!(module instanceof rrnv_3)) {
            rrIF rrIF2 = new rrIF(id_native[0], module.id_package()).id_break(module::id_package).id_class((KeyBind keyBind, Boolean bl) -> {
                if (!module.id_package().equals(keyBind)) {
                    module.id_class((KeyBind)keyBind, bl == false ? id_byte[5] : id_byte[6]);
                }
            });
            this.id_class(rrIF2);
            if (module instanceof rrnZ_2) {
                rrIk_1 rrIk_12 = (rrIk_1)new rrIk_1(id_native[1], module.id_implements()).id_class(id_native[2], (Setting<T> setting, Pair<T, Boolean> pair) -> {
                    if (!((Boolean)pair.getRight()).booleanValue()) {
                        module.id_class(!module.id_implements() ? id_byte[2] : id_byte[3], id_byte[4]);
                    }
                });
                this.id_class(rrIk_12);
            }
        }
        this.id_switch();
    }

    static {
        rrvO.ntfClinit();
    }

    private static void id_this() {
        id_protected = new short[2];
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        float f = this.id_default();
        float f2 = this.id_abstract();
        this.id_interface().id_class(ml_1, () -> {
            if (!bl) {
                rrfD_2.id_class(ml_1, rrZL.id_protected, f + id_break[0], f2 + id_break[1], id_break[2], id_break[3], id_volatile[0]);
            }
        }, rrtu_32, n, n2, id_byte[0], bl);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC447D0A2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-1, -62, 22, 37, 89, 59, -79, 60}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7C4926284E81E492L;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvO.id_class();
        rrvO.id_return();
        rrvO.id_this();
        rrvO.id_package();
        rrvO.id_continue();
    }

    @Override
    public String id_catch() {
        return id_native[3];
    }

    private static void id_continue() {
        id_volatile = new int[]{-657931};
    }

    private static void id_package() {
        id_break = new float[]{1.5f, 1.5f, 10.0f, 10.0f, 14.0f, 140.0f};
    }

    private static void id_return() {
        id_native = new String[]{new String("\u0411\u0438\u043d\u0434"), new String("\u0412\u044b\u043a\u043b. \u043f\u0440\u0438 \u0444\u043b\u0430\u0433\u0435"), new String("disable_on_flag"), new String("ModuleMiscSettingPopUp")};
    }

    private void id_super() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[7]];
        }
    }

    @Override
    public boolean id_protected() {
        return id_byte[1];
    }
}

