/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import com.mojang.blaze3d.systems.RenderSystem;

public final class fc_3
extends Enum<fc_3> {
    public static final /* enum */ fc_3 RGBA = new fc_3(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true);
    public static final /* enum */ fc_3 RGB = new fc_3(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true);
    public static final /* enum */ fc_3 LUMINANCE_ALPHA = new fc_3(2, 6410, false, false, false, true, true, 255, 255, 255, 0, 8, true);
    public static final /* enum */ fc_3 LUMINANCE = new fc_3(1, 6409, false, false, false, true, false, 0, 0, 0, 0, 255, true);
    public final int pixelSize;
    private final int glFormat;
    private final boolean red;
    private final boolean green;
    private final boolean blue;
    private final boolean hasLuminance;
    private final boolean hasAlpha;
    private final int offsetRed;
    private final int offsetGreen;
    private final int offsetBlue;
    private final int offsetLuminance;
    private final int offsetAlpha;
    private final boolean serializable;
    private static final /* synthetic */ fc_3[] $VALUES;

    public void id_byte() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        MT.id_final(3317, this.id_class());
    }

    private fc_3(int n2, int n3, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, int n6, int n7, int n8, boolean bl6) {
        this.pixelSize = n2;
        this.glFormat = n3;
        this.red = bl;
        this.green = bl2;
        this.blue = bl3;
        this.hasLuminance = bl4;
        this.hasAlpha = bl5;
        this.offsetRed = n4;
        this.offsetGreen = n5;
        this.offsetBlue = n6;
        this.offsetLuminance = n7;
        this.offsetAlpha = n8;
        this.serializable = bl6;
    }

    static {
        $VALUES = fc_3.id_finally();
    }

    public static fc_3[] values() {
        return (fc_3[])$VALUES.clone();
    }

    public static fc_3 valueOf(String string) {
        return Enum.valueOf(fc_3.class, string);
    }

    public int id_class() {
        return this.pixelSize;
    }

    public static fc_3 id_class(int n) {
        switch (n) {
            case 1: {
                return LUMINANCE;
            }
            case 2: {
                return LUMINANCE_ALPHA;
            }
            case 3: {
                return RGB;
            }
        }
        return RGBA;
    }

    public void id_break() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_final(3333, this.id_class());
    }

    public boolean id_throws() {
        return this.hasAlpha;
    }

    private static /* synthetic */ fc_3[] id_finally() {
        return new fc_3[]{RGBA, RGB, LUMINANCE_ALPHA, LUMINANCE};
    }

    public boolean id_catch() {
        return this.hasLuminance || this.hasAlpha;
    }

    public int id_case() {
        return this.offsetAlpha;
    }

    public boolean id_implements() {
        return this.serializable;
    }

    public int id_protected() {
        return this.glFormat;
    }

    public int id_private() {
        return this.hasLuminance ? this.offsetLuminance : this.offsetAlpha;
    }
}

