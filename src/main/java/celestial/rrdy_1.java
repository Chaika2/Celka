/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrdy_1
extends Enum<rrdy_1> {
    public static final /* enum */ rrdy_1 ANTIALIASING = new rrdy_1("of.options.shaders.ANTIALIASING", "antialiasingLevel", "0");
    public static final /* enum */ rrdy_1 NORMAL_MAP = new rrdy_1("of.options.shaders.NORMAL_MAP", "normalMapEnabled", "true");
    public static final /* enum */ rrdy_1 SPECULAR_MAP = new rrdy_1("of.options.shaders.SPECULAR_MAP", "specularMapEnabled", "true");
    public static final /* enum */ rrdy_1 RENDER_RES_MUL = new rrdy_1("of.options.shaders.RENDER_RES_MUL", "renderResMul", "1.0");
    public static final /* enum */ rrdy_1 SHADOW_RES_MUL = new rrdy_1("of.options.shaders.SHADOW_RES_MUL", "shadowResMul", "1.0");
    public static final /* enum */ rrdy_1 HAND_DEPTH_MUL = new rrdy_1("of.options.shaders.HAND_DEPTH_MUL", "handDepthMul", "0.125");
    public static final /* enum */ rrdy_1 CLOUD_SHADOW = new rrdy_1("of.options.shaders.CLOUD_SHADOW", "cloudShadow", "true");
    public static final /* enum */ rrdy_1 OLD_HAND_LIGHT = new rrdy_1("of.options.shaders.OLD_HAND_LIGHT", "oldHandLight", "default");
    public static final /* enum */ rrdy_1 OLD_LIGHTING = new rrdy_1("of.options.shaders.OLD_LIGHTING", "oldLighting", "default");
    public static final /* enum */ rrdy_1 SHADER_PACK = new rrdy_1("of.options.shaders.SHADER_PACK", "shaderPack", "");
    public static final /* enum */ rrdy_1 TWEAK_BLOCK_DAMAGE = new rrdy_1("of.options.shaders.TWEAK_BLOCK_DAMAGE", "tweakBlockDamage", "false");
    public static final /* enum */ rrdy_1 SHADOW_CLIP_FRUSTRUM = new rrdy_1("of.options.shaders.SHADOW_CLIP_FRUSTRUM", "shadowClipFrustrum", "true");
    public static final /* enum */ rrdy_1 TEX_MIN_FIL_B = new rrdy_1("of.options.shaders.TEX_MIN_FIL_B", "TexMinFilB", "0");
    public static final /* enum */ rrdy_1 TEX_MIN_FIL_N = new rrdy_1("of.options.shaders.TEX_MIN_FIL_N", "TexMinFilN", "0");
    public static final /* enum */ rrdy_1 TEX_MIN_FIL_S = new rrdy_1("of.options.shaders.TEX_MIN_FIL_S", "TexMinFilS", "0");
    public static final /* enum */ rrdy_1 TEX_MAG_FIL_B = new rrdy_1("of.options.shaders.TEX_MAG_FIL_B", "TexMagFilB", "0");
    public static final /* enum */ rrdy_1 TEX_MAG_FIL_N = new rrdy_1("of.options.shaders.TEX_MAG_FIL_N", "TexMagFilN", "0");
    public static final /* enum */ rrdy_1 TEX_MAG_FIL_S = new rrdy_1("of.options.shaders.TEX_MAG_FIL_S", "TexMagFilS", "0");
    private String resourceKey = null;
    private String propertyKey = null;
    private String valueDefault = null;
    private static final /* synthetic */ rrdy_1[] $VALUES;

    public String id_byte() {
        return this.valueDefault;
    }

    private rrdy_1(String string2, String string3, String string4) {
        this.resourceKey = string2;
        this.propertyKey = string3;
        this.valueDefault = string4;
    }

    static {
        $VALUES = rrdy_1.id_protected();
    }

    public static rrdy_1[] values() {
        return (rrdy_1[])$VALUES.clone();
    }

    public static rrdy_1 valueOf(String string) {
        return Enum.valueOf(rrdy_1.class, string);
    }

    public String id_class() {
        return this.resourceKey;
    }

    public String id_break() {
        return this.propertyKey;
    }

    private static /* synthetic */ rrdy_1[] id_protected() {
        return new rrdy_1[]{ANTIALIASING, NORMAL_MAP, SPECULAR_MAP, RENDER_RES_MUL, SHADOW_RES_MUL, HAND_DEPTH_MUL, CLOUD_SHADOW, OLD_HAND_LIGHT, OLD_LIGHTING, SHADER_PACK, TWEAK_BLOCK_DAMAGE, SHADOW_CLIP_FRUSTRUM, TEX_MIN_FIL_B, TEX_MIN_FIL_N, TEX_MIN_FIL_S, TEX_MAG_FIL_B, TEX_MAG_FIL_N, TEX_MAG_FIL_S};
    }
}

