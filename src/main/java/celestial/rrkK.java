/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrkK
extends Enum<rrkK> {
    public static final /* enum */ rrkK R8 = new rrkK(33321);
    public static final /* enum */ rrkK RG8 = new rrkK(33323);
    public static final /* enum */ rrkK RGB8 = new rrkK(32849);
    public static final /* enum */ rrkK RGBA8 = new rrkK(32856);
    public static final /* enum */ rrkK R8_SNORM = new rrkK(36756);
    public static final /* enum */ rrkK RG8_SNORM = new rrkK(36757);
    public static final /* enum */ rrkK RGB8_SNORM = new rrkK(36758);
    public static final /* enum */ rrkK RGBA8_SNORM = new rrkK(36759);
    public static final /* enum */ rrkK R16 = new rrkK(33322);
    public static final /* enum */ rrkK RG16 = new rrkK(33324);
    public static final /* enum */ rrkK RGB16 = new rrkK(32852);
    public static final /* enum */ rrkK RGBA16 = new rrkK(32859);
    public static final /* enum */ rrkK R16_SNORM = new rrkK(36760);
    public static final /* enum */ rrkK RG16_SNORM = new rrkK(36761);
    public static final /* enum */ rrkK RGB16_SNORM = new rrkK(36762);
    public static final /* enum */ rrkK RGBA16_SNORM = new rrkK(36763);
    public static final /* enum */ rrkK R16F = new rrkK(33325);
    public static final /* enum */ rrkK RG16F = new rrkK(33327);
    public static final /* enum */ rrkK RGB16F = new rrkK(34843);
    public static final /* enum */ rrkK RGBA16F = new rrkK(34842);
    public static final /* enum */ rrkK R32F = new rrkK(33326);
    public static final /* enum */ rrkK RG32F = new rrkK(33328);
    public static final /* enum */ rrkK RGB32F = new rrkK(34837);
    public static final /* enum */ rrkK RGBA32F = new rrkK(34836);
    public static final /* enum */ rrkK R32I = new rrkK(33333);
    public static final /* enum */ rrkK RG32I = new rrkK(33339);
    public static final /* enum */ rrkK RGB32I = new rrkK(36227);
    public static final /* enum */ rrkK RGBA32I = new rrkK(36226);
    public static final /* enum */ rrkK R32UI = new rrkK(33334);
    public static final /* enum */ rrkK RG32UI = new rrkK(33340);
    public static final /* enum */ rrkK RGB32UI = new rrkK(36209);
    public static final /* enum */ rrkK RGBA32UI = new rrkK(36208);
    public static final /* enum */ rrkK R3_G3_B2 = new rrkK(10768);
    public static final /* enum */ rrkK RGB5_A1 = new rrkK(32855);
    public static final /* enum */ rrkK RGB10_A2 = new rrkK(32857);
    public static final /* enum */ rrkK R11F_G11F_B10F = new rrkK(35898);
    public static final /* enum */ rrkK RGB9_E5 = new rrkK(35901);
    private int id;
    private static final /* synthetic */ rrkK[] $VALUES;

    private rrkK(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = rrkK.id_break();
    }

    public static rrkK[] values() {
        return (rrkK[])$VALUES.clone();
    }

    public static rrkK valueOf(String string) {
        return Enum.valueOf(rrkK.class, string);
    }

    public int id_class() {
        return this.id;
    }

    private static /* synthetic */ rrkK[] id_break() {
        return new rrkK[]{R8, RG8, RGB8, RGBA8, R8_SNORM, RG8_SNORM, RGB8_SNORM, RGBA8_SNORM, R16, RG16, RGB16, RGBA16, R16_SNORM, RG16_SNORM, RGB16_SNORM, RGBA16_SNORM, R16F, RG16F, RGB16F, RGBA16F, R32F, RG32F, RGB32F, RGBA32F, R32I, RG32I, RGB32I, RGBA32I, R32UI, RG32UI, RGB32UI, RGBA32UI, R3_G3_B2, RGB5_A1, RGB10_A2, R11F_G11F_B10F, RGB9_E5};
    }
}

