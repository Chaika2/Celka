/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.manager.FontManager;
import celestial.rrZO;
import celestial.rrfC_2;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIF
extends Setting<KeyBind> {
    public Object[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    @Override
    public /* synthetic */ Object id_byte() {
        return this.id_finally();
    }

    private static void id_int() {
        id_throws = new byte[]{5};
    }

    public rrIF(String string, KeyBind keyBind2) {
        super(string, keyBind2);
        Supplier<KeyBind> supplier;
        BiConsumer<KeyBind, Boolean> biConsumer;
        this.id_package();
        Boolean bl2 = id_protected[0];
        this.id_break[rrIF.id_byte[0]] = bl2;
        this.id_break[rrIF.id_byte[1]] = biConsumer = (keyBind, bl) -> {};
        String string2 = string;
        this.id_class[rrIF.id_byte[2]] = string2;
        this.id_break[rrIF.id_byte[3]] = supplier = () -> keyBind2;
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[4]]).id_finally();
        this.id_break[rrIF.id_byte[5]] = rrZO2;
        rrZO rrZO3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[6]]).id_finally();
        this.id_break[rrIF.id_byte[7]] = rrZO3;
    }

    public rrIF(String string, KeyBind keyBind, rrZO rrZO2, rrZO rrZO3) {
        this(string, keyBind);
        rrZO rrZO4 = rrZO2;
        this.id_break[rrIF.id_byte[8]] = rrZO4;
        rrZO rrZO5 = rrZO3;
        this.id_break[rrIF.id_byte[9]] = rrZO5;
    }

    static {
        rrIF.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x94DE2122;
    }

    public rrIF id_class(boolean bl) {
        this.id_package();
        Boolean bl2 = bl;
        this.id_break[rrIF.id_byte[19]] = bl2;
        return this;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF0938DBCAF260D0L;
    }

    @Override
    public void id_class(KeyBind keyBind, boolean bl, boolean bl2) {
        Supplier<KeyBind> supplier;
        this.id_package();
        if (keyBind == (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[11]] && !((Boolean)this.id_break[id_byte[12]]).booleanValue()) {
            return;
        }
        this.id_break[rrIF.id_byte[13]] = supplier = () -> keyBind;
        if (bl2) {
            ((BiConsumer)this.id_break[id_byte[14]]).accept(keyBind, bl);
        }
    }

    public BiConsumer<KeyBind, Boolean> id_class() {
        this.id_package();
        return (BiConsumer)this.id_break[id_byte[24]];
    }

    public rrIF id_class(BiConsumer<KeyBind, Boolean> biConsumer) {
        BiConsumer<KeyBind, Boolean> biConsumer2;
        this.id_package();
        this.id_break[rrIF.id_byte[18]] = biConsumer2 = biConsumer;
        return this;
    }

    public rrIF id_break(Supplier<KeyBind> supplier) {
        Supplier<KeyBind> supplier2;
        this.id_package();
        if (supplier.get() == (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[15]] && !((Boolean)this.id_break[id_byte[16]]).booleanValue()) {
            return this;
        }
        this.id_break[rrIF.id_byte[17]] = supplier2 = supplier;
        return this;
    }

    public boolean id_break() {
        return (vm_3)QY.id_instanceof().id_class[id_byte[22]] == null && rrfC_2.id_break(this.id_finally().id_byte()) ? id_protected[1] : id_protected[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIF.id_new();
        rrIF.id_final();
        rrIF.id_int();
    }

    public KeyBind id_finally() {
        this.id_package();
        return (KeyBind)((Supplier)this.id_break[id_byte[10]]).get();
    }

    public rrZO id_extends() {
        this.id_package();
        return (rrZO)this.id_break[id_byte[20]];
    }

    private static void id_new() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private void id_package() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrIF.id_protected[3]] = id_protected[4];
        }
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-38, 23, -38, 96, 86, -9, 36, -44}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        short[] sArray = new short[25];
        sArray[0] = 1;
        sArray[1] = 4;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[8] = 2;
        sArray[9] = 3;
        sArray[12] = 1;
        sArray[14] = 4;
        sArray[16] = 1;
        sArray[18] = 4;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 73;
        sArray[23] = 1;
        sArray[24] = 4;
        id_byte = sArray;
    }

    public boolean id_volatile() {
        this.id_package();
        return (Boolean)this.id_break[id_byte[23]];
    }

    public rrZO id_native() {
        this.id_package();
        return (rrZO)this.id_break[id_byte[21]];
    }
}

