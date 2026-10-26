/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL20
 */
package celestial.util;

import celestial.MT;
import celestial.Ml_1;
import celestial.QY;
import celestial.VC;
import celestial.manager.ShaderManager;
import celestial.rrfa_3;
import celestial.rrfi_3;
import celestial.util.MinecraftAccessor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;

public class BlurShader
implements MinecraftAccessor {
    public static Object[] id_class = new Object[]{new ShaderManager("celestial/shaders/gaussian.frag", false), new VC(1, 1, false, false)};

    public static VC id_class(VC var0) {
        if (var0 != null && var0.id_byte == id_const.id_extends() && var0.id_protected == id_const.id_native()) {
            return var0;
        }
        if (var0 != null) {
            var0.id_class();
        }
        return new VC(id_const.id_extends(), id_const.id_native(), true, (Boolean)QY.id_break[2]);
    }

    public static float id_class(float var0, float var1) {
        double var2 = 3.141592653;
        double var4 = 1.0 / Math.sqrt(6.283185306 * (double)(var1 * var1));
        return (float)(var4 * Math.exp((double)(-(var0 * var0)) / (2.0 * (double)(var1 * var1))));
    }

    public static void id_class(float var0, float var1, float var2) {
        ShaderManager var10000 = (ShaderManager)id_class[0];
        var10000.id_class("textureIn", 0.0f);
        ((ShaderManager)id_class[0]).id_break("texelSize", 1.0f / (float)id_const.id_new(), 1.0f / (float)id_const.id_continue());
        ((ShaderManager)id_class[0]).id_break("direction", var0, var1);
        ((ShaderManager)id_class[0]).id_break("radius", var2);
        FloatBuffer var3 = BufferUtils.createFloatBuffer((int)256);
        int var4 = 0;
        while ((float)var4 <= var2) {
            var3.put(BlurShader.id_class(var4, var2 / 2.0f));
            ++var4;
        }
        var3.rewind();
        GL20.glUniform1fv((int)((ShaderManager)id_class[0]).id_class("weights"), (FloatBuffer)var3);
    }

    private static void id_class(Ml_1 var0, float var1) {
        MT.id_package();
        rrfa_3.id_class();
        RenderSystem.blendFuncSeparate(770, 771, 1, 0);
        VC var6 = BlurShader.id_class((VC)id_class[1]);
        BlurShader.id_class[1] = var6;
        ((VC)id_class[1]).id_break((Boolean)QY.id_break[2]);
        ((VC)id_class[1]).id_class(true);
        ((ShaderManager)id_class[0]).id_class();
        BlurShader.id_class(1.0f, 0.0f, var1);
        MT.id_super(id_import.B().id_extends());
        ShaderManager.id_class(var0);
        ((VC)id_class[1]).id_throws();
        ((ShaderManager)id_class[0]).id_break();
        id_import.B().id_class(true);
        ((ShaderManager)id_class[0]).id_class();
        BlurShader.id_class(0.0f, 1.0f, var1);
        MT.id_super(((VC)id_class[1]).id_extends());
        ShaderManager.id_class(var0);
        ((ShaderManager)id_class[0]).id_break();
        rrfa_3.id_class();
        MT.id_super(0);
    }

    public static void id_class(Ml_1 var0, Runnable var1, float var2) {
        rrfi_3.id_break();
        var1.run();
        rrfi_3.id_class(1);
        BlurShader.id_class(var0, var2);
        rrfi_3.id_class();
    }
}

