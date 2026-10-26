/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.GL20
 */
package celestial.manager;

import celestial.Ml_1;
import celestial.QY;
import celestial.ju_3;
import celestial.rjV_2;
import celestial.rqO_2;
import celestial.util.MinecraftAccessor;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL20;

public class ShaderManager
implements MinecraftAccessor {
    private static final String ROUNDED_RECT_FRAG = "#version 120\n\nuniform vec2 location, rectSize;\nuniform vec4 color;\nuniform float radius;\n\nfloat roundSDF(vec2 p, vec2 b, float r) {\n    return length(max(abs(p) - b, 0.0)) - r;\n}\n\n\nvoid main() {\n    vec2 rectHalf = rectSize * .5;\n    // Smooth the result (free antialiasing).\n    float smoothedAlpha =  (1.0-smoothstep(0.0, 2.0, roundSDF(rectHalf - (gl_TexCoord[0].st * rectSize), rectHalf - radius - 1., radius))) * color.a;\n    gl_FragColor = vec4(color.rgb, smoothedAlpha);// mix(quadColor, shadowColor, 0.0);\n\n}";
    private static final String GRADIENT_ROUNDED_RECT_FRAG = "#version 120\n\nuniform float width;\nuniform float height;\nuniform vec4 color1, color2, color3, color4;\nuniform float radius;\n\nfloat roundSDF(vec2 p, vec2 b, float r) {\n    return length(max(abs(p) - b , 0.)) - r;\n}\n\nvec3 createGradient(vec2 coords, vec3 color1, vec3 color2, vec3 color3, vec3 color4){\n    vec3 color = mix(mix(color1.rgb, color2.rgb, coords.y), mix(color3.rgb, color4.rgb, coords.y), coords.x);\n    return color;\n}\n\nvoid main() {\n    vec2 rectSize = vec2(width, height);\n    vec2 st = gl_TexCoord[0].st;\n    vec2 halfSize = rectSize * .5;\n    float smoothedAlpha = (1. - smoothstep(0., 1., roundSDF(halfSize - (gl_TexCoord[0].st * rectSize), halfSize - radius - 1., radius))) * color1.a;\n    gl_FragColor = vec4(createGradient(st, color1.rgb, color2.rgb, color3.rgb, color4.rgb), smoothedAlpha);\n}";
    private static final String GLOW_RECT_FRAG = "#version 120\n\nuniform float width;\nuniform float height;\nuniform vec4 color1, color2, color3, color4;\nuniform float radius, glowRadius;\n\nfloat roundSDF(vec2 p, vec2 b, float r) {\nreturn length(max(abs(p) - b , 0.)) - r;\n}\n\nvec3 createGradient(vec2 coords, vec3 color1, vec3 color2, vec3 color3, vec3 color4){\nvec3 color = mix(mix(color1.rgb, color2.rgb, coords.y), mix(color3.rgb, color4.rgb, coords.y), coords.x);\nreturn color;\n}\n\nvoid main() {\nvec2 rectSize = vec2(width, height);\nvec2 st = gl_TexCoord[0].st;\nvec2 halfSize = rectSize * 0.5;\nfloat dist = roundSDF(halfSize - (gl_TexCoord[0].st * rectSize), halfSize - (glowRadius + (radius * 0.75)), radius);\nfloat smoothedAlpha = (1.0-smoothstep(-glowRadius, glowRadius, dist)) * color1.a;\ngl_FragColor = mix(vec4(createGradient(st, color1.rgb, color2.rgb, color3.rgb, color4.rgb), 0.0f), vec4(createGradient(st, color1.rgb, color2.rgb, color3.rgb, color4.rgb), smoothedAlpha), smoothedAlpha);\n}\n";
    private static final String OUTLINE_GRADIENT_RECT_FRAG = "#version 120\n\nuniform float width;\nuniform float height;\nuniform float radius;\nuniform float thickness;\nuniform vec2 smoothness;\nuniform vec4 color;\nuniform vec4 color2;\nuniform vec4 color3;\nuniform vec4 color4;\n\nfloat dstfn(vec2 p, vec2 b, float r) {\n    return length(max(abs(p),b) - b) - r;\n}\n\nvoid main() {\n    vec2 size = vec2(width, height);\n    vec2 tex = gl_TexCoord[0].st;\n    vec2 pixel = tex * size;\n    vec2 centre = 0.5 * size;\n    float d = dstfn(centre - pixel, centre - radius - thickness, radius);\n    float sa = smoothstep(smoothness.x, smoothness.y, abs(d) / thickness);\n    vec4 c = mix(vec4(color.rgb, 1), vec4(color.rgb, 0), sa);\n    vec4 endColor = mix(mix(color, color2, tex.y), mix(color3,color4, tex.y), tex.x);\n    gl_FragColor = vec4(endColor.rgb, color.a * c.a);\n}\n";
    private static final String SUBSTRING_FONT_FRAG = "#version 120\nuniform sampler2D font;\nuniform vec4 inColor;\nuniform float width;\nuniform float maxWidth;\nuniform float smoothness;\nuniform float startCutoff;\n\nvoid main() {\n    float t = clamp((gl_FragCoord.x - maxWidth) / width, 0.0, 1.0);\n    float f = clamp(smoothstep(startCutoff, 1.0, 1.0 - smoothness * t), 0.0, 1.0);\n    vec2 pos = gl_TexCoord[0].xy;\n    vec4 color = texture2D(font, pos);\n\n    if (color.a > 0.0) {\n        color.a = color.a * f;\n    }\n\n    gl_FragColor = color * inColor;\n}\n";
    private static final String GLOW_ESP_FRAG = "#version 120\n\nuniform sampler2D textureIn, textureToCheck;\nuniform vec2 texelSize, direction;\nuniform vec3 color1, color2, color3, color4, color5;\nuniform bool avoidTexture;\nuniform float exposure, radius, time;\nuniform float weights[256];\n\n#define offset direction * texelSize\n\nvoid main() {\n    if (direction.y == 1 && avoidTexture) {\n        if (texture2D(textureToCheck, gl_TexCoord[0].st).a != 0.0) discard;\n    }\n\n    float innerAlpha = texture2D(textureIn, gl_TexCoord[0].st).a * weights[0];\n\n    for (float r = 1.0; r <= radius; r ++) {\n        innerAlpha += texture2D(textureIn, gl_TexCoord[0].st + offset * r).a * weights[int(r)];\n        innerAlpha += texture2D(textureIn, gl_TexCoord[0].st - offset * r).a * weights[int(r)];\n    }\n\n    float r = length(gl_TexCoord[0].st - vec2(0.5));\n    float theta = atan((gl_TexCoord[0].st.y - 0.5) / (gl_TexCoord[0].st.x - 0.5)) + step(gl_TexCoord[0].st.x, 0.5) * 3.1415926535897932384626433832795;\n\n    vec3 color1 = color1;\n    vec3 color2 = color2;\n    vec3 color3 = color3;\n    vec3 color4 = color4;\n    vec3 color5 = color5;\n\n    vec3 color;\n    float t = mod(theta + time, 2.0 * 3.1415926535897932384626433832795) / (2.0 * 3.1415926535897932384626433832795);\n    if (t < 0.2) {\n        color = mix(color1, color2, smoothstep(0.0, 0.2, t));\n    } else if (t < 0.4) {\n        color = mix(color2, color3, smoothstep(0.2, 0.4, t));\n    } else if (t < 0.6) {\n        color = mix(color3, color4, smoothstep(0.4, 0.6, t));\n    } else if (t < 0.8) {\n        color = mix(color4, color5, smoothstep(0.6, 0.8, t));\n    } else {\n        color = mix(color5, color1, smoothstep(0.8, 1.0, t));\n    }\n\n    gl_FragColor = vec4(color, mix(innerAlpha, 1.0 - exp(-innerAlpha * exposure), step(0.0, direction.y)));\n}\n";
    private static final String KAWASE_UP_BLOOM_FRAG = "#version 120\n\nuniform sampler2D inTexture, textureToCheck;\nuniform vec2 halfpixel, offset, iResolution;\nuniform int check;\n\nvoid main() {\n    vec2 uv = vec2(gl_FragCoord.xy / iResolution);\n\n    vec4 sum = texture2D(inTexture, uv + vec2(-halfpixel.x * 2.0, 0.0) * offset);\n    sum.rgb *= sum.a;\n    vec4 smpl1 =  texture2D(inTexture, uv + vec2(-halfpixel.x, halfpixel.y) * offset);\n    smpl1.rgb *= smpl1.a;\n    sum += smpl1 * 2.0;\n    vec4 smp2 = texture2D(inTexture, uv + vec2(0.0, halfpixel.y * 2.0) * offset);\n    smp2.rgb *= smp2.a;\n    sum += smp2;\n    vec4 smp3 = texture2D(inTexture, uv + vec2(halfpixel.x, halfpixel.y) * offset);\n    smp3.rgb *= smp3.a;\n    sum += smp3 * 2.0;\n    vec4 smp4 = texture2D(inTexture, uv + vec2(halfpixel.x * 2.0, 0.0) * offset);\n    smp4.rgb *= smp4.a;\n    sum += smp4;\n    vec4 smp5 = texture2D(inTexture, uv + vec2(halfpixel.x, -halfpixel.y) * offset);\n    smp5.rgb *= smp5.a;\n    sum += smp5 * 2.0;\n    vec4 smp6 = texture2D(inTexture, uv + vec2(0.0, -halfpixel.y * 2.0) * offset);\n    smp6.rgb *= smp6.a;\n    sum += smp6;\n    vec4 smp7 = texture2D(inTexture, uv + vec2(-halfpixel.x, -halfpixel.y) * offset);\n    smp7.rgb *= smp7.a;\n    sum += smp7 * 2.;\n    vec4 result = sum / 12.;\n    gl_FragColor = vec4(result.rgb / result.a, mix(result.a, result.a * (1. - texture2D(textureToCheck, gl_TexCoord[0].st).a),check));\n}\n";
    private static final String KAWASE_DOWN_BLOOM_FRAG = "#version 120\n\nuniform sampler2D inTexture;\nuniform vec2 offset, halfpixel, iResolution;\n\nvoid main() {\n    vec2 uv = vec2(gl_FragCoord.xy / iResolution);\n    vec4 sum = texture2D(inTexture, gl_TexCoord[0].st);\n    sum.rgb *= sum.a;\n    sum *= 4.0;\n    vec4 smp1 = texture2D(inTexture, uv - halfpixel.xy * offset);\n    smp1.rgb *= smp1.a;\n    sum += smp1;\n    vec4 smp2 = texture2D(inTexture, uv + halfpixel.xy * offset);\n    smp2.rgb *= smp2.a;\n    sum += smp2;\n    vec4 smp3 = texture2D(inTexture, uv + vec2(halfpixel.x, -halfpixel.y) * offset);\n    smp3.rgb *= smp3.a;\n    sum += smp3;\n    vec4 smp4 = texture2D(inTexture, uv - vec2(halfpixel.x, -halfpixel.y) * offset);\n    smp4.rgb *= smp4.a;\n    sum += smp4;\n    vec4 result = sum / 8.;\n    gl_FragColor = vec4(result.rgb / result.a, result.a);\n}\n";
    private static final String ROUNDED_TEXTURE_FRAG = "uniform vec2 rectSize; // \u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u0438 \u0440\u0430\u0437\u043c\u0435\u0440 \u043f\u0440\u044f\u043c\u043e\u0443\u0433\u043e\u043b\u044c\u043d\u0438\u043a\u0430\nuniform sampler2D textureIn; // \u0412\u0445\u043e\u0434\u043d\u0430\u044f \u0442\u0435\u043a\u0441\u0442\u0443\u0440\u0430\nuniform float radius, alpha; // \u0420\u0430\u0434\u0438\u0443\u0441 \u0437\u0430\u043a\u0440\u0443\u0433\u043b\u0435\u043d\u0438\u044f \u0443\u0433\u043b\u043e\u0432 \u043f\u0440\u044f\u043c\u043e\u0443\u0433\u043e\u043b\u044c\u043d\u0438\u043a\u0430 \u0438 \u043f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c\n\n// \u0421\u043e\u0437\u0434\u0430\u0435\u043c \u0444\u0443\u043d\u043a\u0446\u0438\u044e \u0434\u043b\u044f \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u0438\u044f \u0440\u0430\u0441\u0441\u0442\u043e\u044f\u043d\u0438\u044f \u043e\u0442 \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u043f\u043e\u0437\u0438\u0446\u0438\u0438 \u0434\u043e \u043a\u0440\u0430\u044f \u043f\u0440\u044f\u043c\u043e\u0443\u0433\u043e\u043b\u044c\u043d\u0438\u043a\u0430\nfloat roundedSDF(vec2 centerPos, vec2 size, float radius) {\n    return length(max(abs(centerPos) - size, 0.)) - radius;\n}\n\nvoid main() {\n    // \u041e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0435\u043c \u0440\u0430\u0441\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u043e\u0442 \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u043f\u043e\u0437\u0438\u0446\u0438\u0438 \u0434\u043e \u043a\u0440\u0430\u044f \u043f\u0440\u044f\u043c\u043e\u0443\u0433\u043e\u043b\u044c\u043d\u0438\u043a\u0430\n    float distance = roundedSDF((rectSize * .5) - (gl_TexCoord[0].st * rectSize), (rectSize * .5) - radius - 1., radius);\n    \n    // \u0421\u043e\u0437\u0434\u0430\u0435\u043c \u043f\u043b\u0430\u0432\u043d\u044b\u0439 \u043f\u0435\u0440\u0435\u0445\u043e\u0434 \u043e\u0442 \u0433\u0440\u0430\u043d\u0438\u0446\u044b \u043f\u0440\u044f\u043c\u043e\u0443\u0433\u043e\u043b\u044c\u043d\u0438\u043a\u0430 \u043a \u043f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0439 \u043e\u0431\u043b\u0430\u0441\u0442\u0438\n    float smoothedAlpha = (1.0 - smoothstep(0.0, 2.0, distance)) * alpha;\n\n    // \u0421\u043e\u0437\u0434\u0430\u0435\u043c \u043e\u043a\u043e\u043d\u0447\u0430\u0442\u0435\u043b\u044c\u043d\u044b\u0439 \u0446\u0432\u0435\u0442 \u043f\u0438\u043a\u0441\u0435\u043b\u044f, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044f \u0446\u0432\u0435\u0442 \u0438\u0437 \u0432\u0445\u043e\u0434\u043d\u043e\u0439 \u0442\u0435\u043a\u0441\u0442\u0443\u0440\u044b \u0438 \u043f\u043b\u0430\u0432\u043d\u044b\u0439 \u043f\u0435\u0440\u0435\u0445\u043e\u0434 \u043c\u0435\u0436\u0434\u0443 \u0433\u0440\u0430\u043d\u0438\u0446\u0435\u0439 \u043f\u0440\u044f\u043c\u043e\u0443\u0433\u043e\u043b\u044c\u043d\u0438\u043a\u0430 \u0438 \u043f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0439 \u043e\u0431\u043b\u0430\u0441\u0442\u044c\u044e\n    gl_FragColor = vec4(texture2D(textureIn, gl_TexCoord[0].st).rgb, smoothedAlpha);\n}\n";
    private static final String TARGETHUD_HEAD_FRAG = "#version 120\n\nuniform sampler2D texture;\nuniform float width;\nuniform float height;\nuniform float radius;\nuniform float hurtStrength;\nuniform float alpha;\nuniform vec3 hurtColor;\n\nfloat dstfn(vec2 p, vec2 b, float r) {\n    return length(max(abs(p) - b, 0.)) - r;\n}\n\nvoid main() {\n    vec2 tex = gl_TexCoord[0].st;\n    vec2 clippedTexCoord = vec2(\n           mix(8.0 / 64.0, 16.0 / 64.0, tex.x),\n           mix(8.0 / 64.0, 16.0 / 64.0, tex.y)\n    );\n    vec4 smpl = texture2D(texture, clippedTexCoord);\n    vec2 size = vec2(width, height);\n    vec2 pixel = tex * size;\n    vec2 centre = .5 * size;\n    float sa = smoothstep(0., 1, dstfn(centre - pixel, centre - radius - 1, radius));\n    vec4 c = mix(vec4(smpl.rgb, 1), vec4(smpl.rgb, 0), sa);\n    gl_FragColor = vec4(mix(smpl.rgb, hurtColor, hurtStrength), c.a * alpha);\n}\n";
    private static final String COLORED_TEXTURE_FRAG = "        #version 120\n\n        uniform sampler2D texture;\n        uniform float width;\n        uniform float height;\n        uniform float radius;\n        uniform vec4 color1;\n        uniform vec4 color2;\n        uniform vec4 color3;\n        uniform vec4 color4;\n\n        vec3 createGradient(vec2 coords, vec3 color1, vec3 color2, vec3 color3, vec3 color4){\n        vec3 color = mix(mix(color1.rgb, color2.rgb, coords.y), mix(color3.rgb, color4.rgb, coords.y), coords.x);\n        return color;\n        }\n\n        float dstfn(vec2 p, vec2 b, float r) {\n        return length(max(abs(p) - b, 0.)) - r;\n        }\n\n        void main() {\n        vec2 tex = gl_TexCoord[0].st;\n        vec4 smpl = texture2D(texture, tex);\n        vec2 size = vec2(width, height);\n        vec2 pixel = gl_TexCoord[0].st * size;\n        vec2 centre = .5 * size;\n        float sa = smoothstep(0., 1, dstfn(centre - pixel, centre - radius - 1, radius));\n        vec4 c = mix(vec4(smpl.rgb, 1), vec4(smpl.rgb, 0), sa);\n        gl_FragColor = vec4(mix(smpl.rgb,createGradient(tex, color1.rgb, color2.rgb, color3.rgb, color4.rgb), smpl.a), smpl.a * c.a * color1.a);\n        }\n";
    public Object[] id_class = new Object[]{0};

    public void id_byte() {
        ARBShaderObjects.glUseProgramObjectARB((int)0);
    }

    public void id_byte(String var1) {
        int var2 = ARBShaderObjects.glCreateProgramObjectARB();
        if (var2 == 0) {
            System.out.println("PC Issue: Shader program creation failed.");
            System.exit(0);
        } else {
            int var3 = ARBShaderObjects.glCreateShaderObjectARB((int)35632);
            ARBShaderObjects.glShaderSourceARB((int)var3, (CharSequence)var1);
            ARBShaderObjects.glCompileShaderARB((int)var3);
            if (GL20.glGetShaderi((int)var3, (int)35713) == 0) {
                System.out.println("Error [ " + GL20.glGetShaderInfoLog((int)var3, (int)500) + " ]");
            }
            ARBShaderObjects.glAttachObjectARB((int)var2, (int)var3);
            ARBShaderObjects.glLinkProgramARB((int)var2);
            this.id_class[0] = var2;
        }
    }

    public ShaderManager(String var1, boolean var2) {
        this(var1, "celestial/shaders/vertex.vsh", var2);
    }

    public ShaderManager(String var1, String var2, boolean var3) {
        if (!var3) {
            int var4 = GL20.glCreateProgram();
            try {
                int var5 = switch (var1) {
                    case "rounded_rect" -> this.id_class(new ByteArrayInputStream(ROUNDED_RECT_FRAG.getBytes()), 35632);
                    case "gradient_rounded_rect" -> this.id_class(new ByteArrayInputStream(GRADIENT_ROUNDED_RECT_FRAG.getBytes()), 35632);
                    case "glow_rect" -> this.id_class(new ByteArrayInputStream(GLOW_RECT_FRAG.getBytes()), 35632);
                    case "outline_gradient_rect" -> this.id_class(new ByteArrayInputStream(OUTLINE_GRADIENT_RECT_FRAG.getBytes()), 35632);
                    case "substring_font" -> this.id_class(new ByteArrayInputStream(SUBSTRING_FONT_FRAG.getBytes()), 35632);
                    case "glow_esp" -> this.id_class(new ByteArrayInputStream(GLOW_ESP_FRAG.getBytes()), 35632);
                    case "kawase_up_bloom" -> this.id_class(new ByteArrayInputStream(KAWASE_UP_BLOOM_FRAG.getBytes()), 35632);
                    case "kawase_down_bloom" -> this.id_class(new ByteArrayInputStream(KAWASE_DOWN_BLOOM_FRAG.getBytes()), 35632);
                    case "rounded_texture" -> this.id_class(new ByteArrayInputStream(ROUNDED_TEXTURE_FRAG.getBytes()), 35632);
                    case "targethud_head" -> this.id_class(new ByteArrayInputStream(TARGETHUD_HEAD_FRAG.getBytes()), 35632);
                    case "colored_texture" -> this.id_class(new ByteArrayInputStream(COLORED_TEXTURE_FRAG.getBytes()), 35632);
                    default -> this.id_class(id_import.F().id_class(new rqO_2(var1)).id_break(), 35632);
                };
                GL20.glAttachShader((int)var4, (int)var5);
                int var6 = this.id_class(id_import.F().id_class(new rqO_2(var2)).id_break(), 35633);
                GL20.glAttachShader((int)var4, (int)var6);
            }
            catch (IOException var13) {
                var13.printStackTrace();
            }
            GL20.glLinkProgram((int)var4);
            int var14 = GL20.glGetProgrami((int)var4, (int)35714);
            if (var14 == 0) {
                throw new IllegalStateException("Shader failed to link!");
            }
            this.id_class[0] = var4;
        } else {
            this.id_protected(var1);
        }
    }

    public void id_class(String var1, float var2, float var3, float var4) {
        int var5 = GL20.glGetUniformLocation((int)((Integer)this.id_class[0]), (CharSequence)var1);
        GL20.glUniform3f((int)var5, (float)var2, (float)var3, (float)var4);
    }

    public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4) {
        rjV_2 var5 = var0.id_byte().id_class();
        id_strictfp.id_class(var5, var1, var2, 0.0f).id_class(0.0f, 0.0f).id_class();
        id_strictfp.id_class(var5, var1, var2 + var4, 0.0f).id_class(0.0f, 1.0f).id_class();
        id_strictfp.id_class(var5, var1 + var3, var2 + var4, 0.0f).id_class(1.0f, 1.0f).id_class();
        id_strictfp.id_class(var5, var1 + var3, var2, 0.0f).id_class(1.0f, 0.0f).id_class();
    }

    public static void id_class(Ml_1 var0) {
        rjV_2 var1 = var0.id_byte().id_class();
        float var2 = id_const.id_volatile();
        float var3 = id_const.id_final();
        id_strictfp.id_class(7, ju_3.id_synchronized);
        id_strictfp.id_class(var1, 0.0f, 0.0f, 0.0f).id_class(0.0f, 1.0f).id_class();
        id_strictfp.id_class(var1, 0.0f, var3, 0.0f).id_class(0.0f, 0.0f).id_class();
        id_strictfp.id_class(var1, var2, var3, 0.0f).id_class(1.0f, 0.0f).id_class();
        id_strictfp.id_class(var1, var2, 0.0f, 0.0f).id_class(1.0f, 1.0f).id_class();
        id_default.id_break();
    }

    public void id_class(String var1, float ... var2) {
        int var3 = GL20.glGetUniformLocation((int)((Integer)this.id_class[0]), (CharSequence)var1);
        switch (var2.length) {
            case 1: {
                GL20.glUniform1f((int)var3, (float)var2[0]);
                break;
            }
            case 2: {
                GL20.glUniform2f((int)var3, (float)var2[0], (float)var2[1]);
                break;
            }
            case 3: {
                GL20.glUniform3f((int)var3, (float)var2[0], (float)var2[1], (float)var2[2]);
                break;
            }
            case 4: {
                GL20.glUniform4f((int)var3, (float)var2[0], (float)var2[1], (float)var2[2], (float)var2[3]);
            }
        }
    }

    public void id_class() {
        GL20.glUseProgram((int)((Integer)this.id_class[0]));
    }

    public void id_class(String var1, float var2, float var3, float var4, float var5) {
        ARBShaderObjects.glUniform4fARB((int)ARBShaderObjects.glGetUniformLocationARB((int)((Integer)this.id_class[0]), (CharSequence)var1), (float)var2, (float)var3, (float)var4, (float)var5);
    }

    private int id_class(InputStream var1, int var2) {
        int var3 = GL20.glCreateShader((int)var2);
        GL20.glShaderSource((int)var3, (CharSequence)ShaderManager.id_class(var1));
        GL20.glCompileShader((int)var3);
        if (GL20.glGetShaderi((int)var3, (int)35713) == 0) {
            System.out.println(GL20.glGetShaderInfoLog((int)var3, (int)4096));
            throw new IllegalStateException(String.format("Shader (%s) failed to compile!", var2));
        }
        return var3;
    }

    public void id_class(String var1, float var2) {
        ARBShaderObjects.glUniform1fARB((int)ARBShaderObjects.glGetUniformLocationARB((int)((Integer)this.id_class[0]), (CharSequence)var1), (float)var2);
    }

    public void id_class(String var1, float var2, float var3) {
        ARBShaderObjects.glUniform2fARB((int)ARBShaderObjects.glGetUniformLocationARB((int)((Integer)this.id_class[0]), (CharSequence)var1), (float)var2, (float)var3);
    }

    public void id_class(String var1, int ... var2) {
        int var3 = GL20.glGetUniformLocation((int)((Integer)this.id_class[0]), (CharSequence)var1);
        if (var2.length > 1) {
            GL20.glUniform2i((int)var3, (int)var2[0], (int)var2[1]);
        } else {
            GL20.glUniform1i((int)var3, (int)var2[0]);
        }
    }

    public static String id_class(InputStream var0) {
        StringBuilder var1 = new StringBuilder();
        try {
            String var3;
            BufferedReader var2 = new BufferedReader(new InputStreamReader(var0));
            while ((var3 = var2.readLine()) != null) {
                var1.append(var3).append('\n');
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return var1.toString();
    }

    public int id_class(String var1) {
        return GL20.glGetUniformLocation((int)((Integer)this.id_class[0]), (CharSequence)var1);
    }

    public static void id_break(Ml_1 var0, float var1, float var2, float var3, float var4) {
        rjV_2 var5 = var0.id_byte().id_class();
        id_strictfp.id_class(7, ju_3.id_synchronized);
        id_strictfp.id_class(var5, var1, var2, 0.0f).id_class(0.0f, 0.0f).id_class();
        id_strictfp.id_class(var5, var1, var2 + var4, 0.0f).id_class(0.0f, 1.0f).id_class();
        id_strictfp.id_class(var5, var1 + var3, var2 + var4, 0.0f).id_class(1.0f, 1.0f).id_class();
        id_strictfp.id_class(var5, var1 + var3, var2, 0.0f).id_class(1.0f, 0.0f).id_class();
        id_default.id_break();
    }

    public void id_break(String var1, float var2) {
        int var3 = GL20.glGetUniformLocation((int)((Integer)this.id_class[0]), (CharSequence)var1);
        GL20.glUniform1f((int)var3, (float)var2);
    }

    public void id_break(String var1, float var2, float var3, float var4, float var5) {
        int var6 = GL20.glGetUniformLocation((int)((Integer)this.id_class[0]), (CharSequence)var1);
        GL20.glUniform4f((int)var6, (float)var2, (float)var3, (float)var4, (float)var5);
    }

    public void id_break() {
        GL20.glUseProgram((int)0);
    }

    public void id_break(String var1, float var2, float var3) {
        int var4 = GL20.glGetUniformLocation((int)((Integer)this.id_class[0]), (CharSequence)var1);
        GL20.glUniform2f((int)var4, (float)var2, (float)var3);
    }

    private String id_break(InputStream var1) throws IOException {
        int var2;
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        byte[] var4 = new byte[512];
        while ((var2 = var1.read(var4, 0, var4.length)) != -1) {
            var3.write(var4, 0, var2);
        }
        return var3.toString();
    }

    private void id_protected(String var1) {
        try {
            String var2 = this.id_break(QY.id_instanceof().F().id_class(new rqO_2("celestial/shaders/" + var1 + ".glsl")).id_break());
            this.id_byte(var2.replace("PIDORAS", "\n").replace("gl_TexCoord[0];", "gl_TexCoord[0].xy;"));
        }
        catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public void id_protected() {
        ARBShaderObjects.glUseProgramObjectARB((int)((Integer)this.id_class[0]));
    }
}

