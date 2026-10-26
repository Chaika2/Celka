/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBCopyBuffer
 *  org.lwjgl.opengl.ARBDrawBuffersBlend
 *  org.lwjgl.opengl.ARBFramebufferObject
 *  org.lwjgl.opengl.EXTFramebufferBlit
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL31
 *  org.lwjgl.opengl.GL42
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.Hb_1;
import celestial.MI;
import celestial.MR;
import celestial.MU;
import celestial.MV;
import celestial.MY;
import celestial.Me_1;
import celestial.Mf_1;
import celestial.Mg_1;
import celestial.Mi_1;
import celestial.Mj_1;
import celestial.Mo_1;
import celestial.Mw_1;
import celestial.OE;
import celestial.OG;
import celestial.OM;
import celestial.OO;
import celestial.OS;
import celestial.Ob_1;
import celestial.Or_1;
import celestial.Os_1;
import celestial.Vl_1;
import celestial.gs_3;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rji_3;
import celestial.rrMh_1;
import celestial.rrWK;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrxQ_2;
import celestial.rrxW_2;
import celestial.rrxz_3;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.stream.IntStream;
import org.lwjgl.opengl.ARBCopyBuffer;
import org.lwjgl.opengl.ARBDrawBuffersBlend;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.EXTFramebufferBlit;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GL42;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.system.MemoryUtil;

public class MT {
    private static final FloatBuffer id_final = GLX.make(MemoryUtil.memAllocFloat((int)16), floatBuffer -> gs_3.id_class(MemoryUtil.memAddress((FloatBuffer)floatBuffer)));
    private static final Mw_1 id_package = new Mw_1();
    private static final Mf_1 id_int = new Mf_1(2896);
    private static final Mf_1[] id_new = (Mf_1[])IntStream.range(0, 8).mapToObj(n -> new Mf_1(16384 + n)).toArray(Mf_1[]::new);
    private static final MR id_continue = new MR();
    private static final MI id_super = new MI();
    private static final Mo_1 id_this = new Mo_1();
    private static final MU id_else = new MU();
    private static final MY id_synchronized = new MY();
    private static final Mi_1 id_return = new Mi_1();
    private static final MV id_public = new MV();
    private static final Ob_1 id_goto = new Ob_1();
    private static final OS id_while = new OS();
    private static final Or_1 id_try = new Or_1();
    private static final FloatBuffer id_instanceof = Hb_1.id_byte(4);
    private static int id_throw;
    private static final OM[] id_interface;
    private static int id_char;
    private static final Mf_1 id_abstract;
    private static final Mg_1 id_long;
    private static final Mj_1 id_float;
    private static Me_1 id_void;
    private static Os_1 id_static;
    private static rrWK id_import;
    private static rrxW_2 id_short;
    private static rrWK id_default;
    private static rrxz_3 id_const;
    private static rrWK id_strictfp;
    private static rrxQ_2 id_boolean;
    private static boolean id_transient;
    private static int id_for;
    private static boolean id_double;
    public static float id_class;
    public static float id_break;
    public static boolean id_byte;
    public static boolean id_protected;
    public static int id_throws;
    public static int id_case;
    public static int id_catch;
    public static int id_private;
    private static boolean id_switch;
    public static final int id_implements = 7;
    public static final int id_finally = 4;
    public static final int id_extends = 33984;
    public static final int id_native = 33985;
    public static final int id_volatile = 33986;
    private static int r;
    private static int P;
    private static final int[] B;

    @Deprecated
    public static void id_boolean() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glLoadIdentity();
    }

    public static void id_char() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_return.id_class.id_break();
    }

    public static int id_byte(int n, int n2, int n3) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        return GL11.glGetTexLevelParameteri((int)n, (int)n2, (int)n3);
    }

    @Deprecated
    public static void id_byte(float f, float f2, float f3, float f4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glRotatef((float)f, (float)f2, (float)f3, (float)f4);
    }

    @Deprecated
    public static void id_byte(float f, float f2, float f3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glTranslatef((float)f, (float)f2, (float)f3);
    }

    public static void id_byte(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL14.glBlendEquation((int)n);
    }

    @Deprecated
    public static void id_byte(float f) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (f != MT.id_else.id_throws) {
            MT.id_else.id_throws = f;
            GL11.glFogf((int)2916, (float)f);
        }
    }

    public static void id_byte(int n, int n2, int n3, int n4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL14.glBlendFuncSeparate((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static int id_byte(int n, CharSequence charSequence) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL20.glGetAttribLocation((int)n, (CharSequence)charSequence);
    }

    public static void id_byte(int n, boolean bl, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniformMatrix4fv((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
    }

    public static void id_byte(int n, IntBuffer intBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform3iv((int)n, (IntBuffer)intBuffer);
    }

    public static void id_byte(boolean bl) {
        id_switch = bl;
    }

    @Deprecated
    public static void id_byte() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glPopAttrib();
    }

    public static void id_byte(int n, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform2fv((int)n, (FloatBuffer)floatBuffer);
    }

    public static int id_byte(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL20.glGetProgrami((int)n, (int)n2);
    }

    @Deprecated
    private static OG id_byte(OE oE) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        switch (oE) {
            case S: {
                return MT.id_goto.id_class;
            }
            case T: {
                return MT.id_goto.id_break;
            }
            case R: {
                return MT.id_goto.id_byte;
            }
            case Q: {
                return MT.id_goto.id_protected;
            }
        }
        return MT.id_goto.id_class;
    }

    public static void id_byte(rrxW_2 rrxW_22) {
        if (id_import.id_byte()) {
            id_short.id_class(rrxW_22);
        } else {
            MT.id_package.id_class.id_class(rrxW_22.id_byte());
            MT.id_class(rrxW_22.id_protected(), rrxW_22.id_throws());
        }
    }

    @Deprecated
    public static void id_byte(int n, int n2, int n3, long l) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glColorPointer((int)n, (int)n2, (int)n3, (long)l);
    }

    public static void id_byte(rrxz_3 rrxz_32) {
        if (id_default.id_byte()) {
            id_const.id_class(rrxz_32);
        } else {
            MT.id_super.id_class.id_class(rrxz_32.id_byte());
            if (!rrxz_32.id_private()) {
                MT.id_break(rrxz_32.id_protected(), rrxz_32.id_throws());
            } else {
                MT.id_break(rrxz_32.id_protected(), rrxz_32.id_throws(), rrxz_32.id_case(), rrxz_32.id_catch());
            }
        }
    }

    public static void id_byte(rrxQ_2 rrxQ_22) {
        if (id_strictfp.id_byte()) {
            id_boolean.id_class(rrxQ_22);
        } else {
            MT.id_synchronized.id_class.id_class(rrxQ_22.id_byte());
            MT.id_synchronized.id_break = rrxQ_22.id_protected();
        }
    }

    public static void id_byte(IntBuffer intBuffer) {
        int n;
        GL11.glCallLists((IntBuffer)intBuffer);
        if (rrbb_3.rs() && !id_double && (n = rrdZ.Sz.id_final()) > 1) {
            for (int i = 1; i < n; ++i) {
                rrdZ.PR.id_break(i);
                GL11.glCallLists((IntBuffer)intBuffer);
            }
            rrdZ.PR.id_break(0);
        }
    }

    private static void id_int(int n, int n2) {
        MT.id_class(8960, 34162, n);
        MT.id_class(8960, 34184, n2);
        MT.id_class(8960, 34200, 770);
    }

    public static void id_int(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (n != MT.id_public.id_break) {
            MT.id_public.id_break = n;
            GL11.glLogicOp((int)n);
        }
    }

    public static int id_int() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL20.glCreateProgram();
    }

    public static void id_long() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_return.id_break.id_break();
    }

    public static void id_float() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_return.id_break.id_class();
    }

    @Deprecated
    public static void id_double() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_float.id_class = -1.0f;
        MT.id_float.id_break = -1.0f;
        MT.id_float.id_byte = -1.0f;
        MT.id_float.id_protected = -1.0f;
    }

    static {
        id_interface = (OM[])IntStream.range(0, 32).mapToObj(n -> new OM()).toArray(OM[]::new);
        id_char = 7425;
        id_abstract = new Mf_1(32826);
        id_long = new Mg_1();
        id_float = new Mj_1();
        id_import = new rrWK();
        id_short = new rrxW_2();
        id_default = new rrWK();
        id_const = new rrxz_3();
        id_strictfp = new rrWK();
        id_boolean = new rrxQ_2();
        id_transient = false;
        id_for = 0;
        id_double = false;
        id_class = 0.0f;
        id_break = 0.0f;
        id_switch = true;
        B = new int[8];
    }

    public static void B() {
        GL11.glBindTexture((int)3553, (int)MT.id_interface[MT.id_throw].id_break);
    }

    public static int J() {
        return r;
    }

    public static int S() {
        return MT.id_interface[MT.id_throw].id_break;
    }

    @Deprecated
    public static int id_this() {
        return MT.id_interface[MT.id_throw].id_break;
    }

    @Deprecated
    public static void id_this(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (n != id_char) {
            id_char = n;
            GL11.glShadeModel((int)n);
        }
    }

    public static void b() {
        if (id_default.id_break()) {
            MT.id_byte(id_const);
        }
    }

    public static int x() {
        return P;
    }

    public static void s() {
        if (rrbb_3.id_final()) {
            int n = GL11.glGetInteger((int)34016);
            int n2 = GL11.glGetInteger((int)32873);
            int n3 = MT.P();
            int n4 = MT.S();
            if (n4 > 0 && (n != n3 || n2 != n4)) {
                rrbb_3.id_byte("checkTexture: act: " + n3 + ", glAct: " + n + ", tex: " + n4 + ", glTex: " + n2);
            }
        }
    }

    public static void h() {
        id_transient = true;
    }

    public static void d() {
        if (MT.id_super.id_class.id_break) {
            GL11.glEnable((int)3042);
        } else {
            GL11.glDisable((int)3042);
        }
        GL14.glBlendFuncSeparate((int)MT.id_super.id_break, (int)MT.id_super.id_byte, (int)MT.id_super.id_protected, (int)MT.id_super.id_throws);
    }

    public static void id_interface() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (id_strictfp.id_byte()) {
            id_boolean.id_break();
        } else {
            MT.id_synchronized.id_class.id_class();
        }
    }

    public static void id_interface(int n) {
        MT.id_class(n, false);
    }

    public static void id_class(rje_3 rje_32, rje_3 rje_33, rjV_2 rjV_22) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_transient();
        MT.id_boolean();
        MT.id_class(0);
        MT.id_class(1);
        rji_3 rji_32 = new rji_3(rje_32);
        rji_32.id_class(rjV_22);
        MT.id_class(16384, 4611, MT.id_throws(rji_32.id_class(), rji_32.id_break(), rji_32.id_byte(), 0.0f));
        float f = 0.6f;
        MT.id_class(16384, 4609, MT.id_throws(0.6f, 0.6f, 0.6f, 1.0f));
        MT.id_class(16384, 4608, MT.id_throws(0.0f, 0.0f, 0.0f, 1.0f));
        MT.id_class(16384, 4610, MT.id_throws(0.0f, 0.0f, 0.0f, 1.0f));
        rji_3 rji_33 = new rji_3(rje_33);
        rji_33.id_class(rjV_22);
        MT.id_class(16385, 4611, MT.id_throws(rji_33.id_class(), rji_33.id_break(), rji_33.id_byte(), 0.0f));
        MT.id_class(16385, 4609, MT.id_throws(0.6f, 0.6f, 0.6f, 1.0f));
        MT.id_class(16385, 4608, MT.id_throws(0.0f, 0.0f, 0.0f, 1.0f));
        MT.id_class(16385, 4610, MT.id_throws(0.0f, 0.0f, 0.0f, 1.0f));
        MT.id_this(7424);
        float f2 = 0.4f;
        MT.id_class(2899, MT.id_throws(0.4f, 0.4f, 0.4f, 1.0f));
        MT.id_for();
    }

    public static void id_class(rje_3 rje_32, rje_3 rje_33) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class();
        rjV_22.id_class(rjV_2.id_throws(1.0f, -1.0f, 1.0f));
        rjV_22.id_break(rje_3.id_protected.id_byte(-22.5f));
        rjV_22.id_break(rje_3.id_break.id_byte(135.0f));
        MT.id_class(rje_32, rje_33, rjV_22);
    }

    public static void id_class(int n, int n2, long l, long l2, long l3) {
        if (id_byte) {
            GL31.glCopyBufferSubData((int)n, (int)n2, (long)l, (long)l2, (long)l3);
        } else {
            ARBCopyBuffer.glCopyBufferSubData((int)n, (int)n2, (long)l, (long)l2, (long)l3);
        }
    }

    public static void id_class(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (bl != MT.id_long.id_class || bl2 != MT.id_long.id_break || bl3 != MT.id_long.id_byte || bl4 != MT.id_long.id_protected) {
            MT.id_long.id_class = bl;
            MT.id_long.id_break = bl2;
            MT.id_long.id_byte = bl3;
            MT.id_long.id_protected = bl4;
            GL11.glColorMask((boolean)bl, (boolean)bl2, (boolean)bl3, (boolean)bl4);
        }
    }

    public static void id_class(int n, long l, ByteBuffer byteBuffer) {
        GL15.glBufferSubData((int)n, (long)l, (ByteBuffer)byteBuffer);
    }

    @Deprecated
    public static void id_class(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        id_new[n].id_break();
    }

    @Deprecated
    public static void id_class(int n, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glLightModelfv((int)n, (FloatBuffer)floatBuffer);
    }

    public static void id_class(int n, boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glClear((int)n);
        if (bl) {
            MT.id_switch();
        }
    }

    @Deprecated
    public static void id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glOrtho((double)d, (double)d2, (double)d3, (double)d4, (double)d5, (double)d6);
    }

    public static void id_class(rrxz_3 rrxz_32) {
        if (!id_default.id_byte()) {
            MT.id_break(id_const);
            MT.id_byte(rrxz_32);
            id_default.id_class();
        }
    }

    public static void id_class(double d) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glClearDepth((double)d);
    }

    @Deprecated
    public static void id_class(float f, float f2, float f3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glNormal3f((float)f, (float)f2, (float)f3);
    }

    public static void id_class(int n, int n2, int n3, int n4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL20.glScissor((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static void id_class(float f, float f2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (f != MT.id_return.id_byte || f2 != MT.id_return.id_protected) {
            MT.id_return.id_byte = f;
            MT.id_return.id_protected = f2;
            GL11.glPolygonOffset((float)f, (float)f2);
        }
    }

    public static void id_class(int[] nArray) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glGenTextures((int[])nArray);
    }

    public static void id_class(int n, IntBuffer intBuffer, IntBuffer intBuffer2) {
        int n2;
        GL14.glMultiDrawArrays((int)n, (IntBuffer)intBuffer, (IntBuffer)intBuffer2);
        if (rrbb_3.rs() && !id_double && (n2 = rrdZ.Sz.id_final()) > 1) {
            for (int i = 1; i < n2; ++i) {
                rrdZ.PR.id_break(i);
                GL14.glMultiDrawArrays((int)n, (IntBuffer)intBuffer, (IntBuffer)intBuffer2);
            }
            rrdZ.PR.id_break(0);
        }
    }

    @Deprecated
    public static void id_class(int n, int n2, int n3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glTexEnvi((int)n, (int)n2, (int)n3);
    }

    public static void id_class(int n, int n2, float f) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glTexParameterf((int)n, (int)n2, (float)f);
    }

    @Deprecated
    public static void id_class(OE oE, int n, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glTexGenfv((int)MT.id_byte((OE)oE).id_break, (int)n, (FloatBuffer)floatBuffer);
    }

    @Deprecated
    public static void id_class(OE oE, int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        OG oG = MT.id_byte(oE);
        if (n != oG.id_byte) {
            oG.id_byte = n;
            GL11.glTexGeni((int)oG.id_break, (int)9472, (int)n);
        }
    }

    public static void id_class(boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (bl != MT.id_this.id_break) {
            MT.id_this.id_break = bl;
            GL11.glDepthMask((boolean)bl);
        }
    }

    public static void id_class(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, IntBuffer intBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glTexImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (IntBuffer)intBuffer);
    }

    @Deprecated
    public static void id_class(float f) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != MT.id_else.id_byte) {
            MT.id_else.id_byte = f;
            GL11.glFogf((int)2914, (float)f);
            if (rrbb_3.rs()) {
                rrdZ.id_class(f);
            }
        }
    }

    public static void id_class(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glTexSubImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (long)l);
    }

    public static void id_class(int n, int n2, int n3, int n4, long l) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glGetTexImage((int)n, (int)n2, (int)n3, (int)n4, (long)l);
    }

    public static void id_class(rrxQ_2 rrxQ_22) {
        if (!id_strictfp.id_byte()) {
            MT.id_break(id_boolean);
            MT.id_byte(rrxQ_22);
            id_strictfp.id_class();
        }
    }

    @Deprecated
    public static void id_class(int n, float f) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (id_import.id_byte()) {
            id_short.id_class(n, f);
        } else if (n != MT.id_package.id_break || f != MT.id_package.id_byte) {
            MT.id_package.id_break = n;
            MT.id_package.id_byte = f;
            GL11.glAlphaFunc((int)n, (float)f);
        }
    }

    public static void id_class(int n, long l, int n2) {
        GL15.glBufferData((int)n, (long)l, (int)n2);
    }

    @Deprecated
    public static void id_class(int n, float[] fArray) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glFogfv((int)n, (float[])fArray);
    }

    @Deprecated
    public static void id_class(int n, int n2, long l) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glNormalPointer((int)n, (int)n2, (long)l);
    }

    @Deprecated
    public static void id_class(int n, int n2, int n3, long l) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glTexCoordPointer((int)n, (int)n2, (int)n3, (long)l);
    }

    public static void id_class(int n, boolean bl, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniformMatrix2fv((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
    }

    public static void id_class(IntBuffer intBuffer) {
        GL11.glGenTextures((IntBuffer)intBuffer);
    }

    @Deprecated
    public static void id_class(rjV_2 rjV_22) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        rjV_22.id_class(id_final);
        ((Buffer)id_final).rewind();
        MT.id_class(id_final);
    }

    @Deprecated
    public static void id_class(FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glMultMatrixf((FloatBuffer)floatBuffer);
    }

    public static void id_class(int n, ByteBuffer byteBuffer, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL15.glBufferData((int)n, (ByteBuffer)byteBuffer, (int)n2);
    }

    public static void id_class(int n, IntBuffer intBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform1iv((int)n, (IntBuffer)intBuffer);
    }

    public static void id_class(rrxW_2 rrxW_22) {
        if (!id_import.id_byte()) {
            MT.id_break(id_short);
            MT.id_byte(rrxW_22);
            id_import.id_class();
        }
    }

    public static String id_class(GLCapabilities gLCapabilities) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        rrbb_3.id_byte();
        id_byte = gLCapabilities.OpenGL31;
        if (id_byte) {
            id_throws = 36662;
            id_case = 36663;
        } else {
            id_throws = 36662;
            id_case = 36663;
        }
        if (gLCapabilities.OpenGL15) {
            id_catch = 34962;
            id_private = 35044;
        } else {
            id_catch = 34962;
            id_private = 35044;
        }
        boolean bl = id_byte || gLCapabilities.GL_ARB_copy_buffer;
        boolean bl2 = gLCapabilities.OpenGL14;
        boolean bl3 = id_protected = bl && bl2;
        if (!id_protected) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            if (!bl) {
                arrayList.add("OpenGL 1.3, ARB_copy_buffer");
            }
            if (!bl2) {
                arrayList.add("OpenGL 1.4");
            }
            String string = "VboRegions not supported, missing: " + rrbb_3.id_class(arrayList);
            rrbb_3.id_byte(string);
            arrayList.add(string);
        }
        id_static = gLCapabilities.OpenGL30 ? Os_1.BASE : (gLCapabilities.GL_EXT_framebuffer_blit ? Os_1.EXT : Os_1.NONE);
        if (gLCapabilities.OpenGL30) {
            id_void = Me_1.BASE;
            Vl_1.id_class = 36160;
            Vl_1.id_break = 36161;
            Vl_1.id_byte = 36064;
            Vl_1.id_protected = 36096;
            Vl_1.id_throws = 36053;
            Vl_1.id_case = 36054;
            Vl_1.id_catch = 36055;
            Vl_1.id_private = 36059;
            Vl_1.id_implements = 36060;
            return "OpenGL 3.0";
        }
        if (gLCapabilities.GL_ARB_framebuffer_object) {
            id_void = Me_1.ARB;
            Vl_1.id_class = 36160;
            Vl_1.id_break = 36161;
            Vl_1.id_byte = 36064;
            Vl_1.id_protected = 36096;
            Vl_1.id_throws = 36053;
            Vl_1.id_catch = 36055;
            Vl_1.id_case = 36054;
            Vl_1.id_private = 36059;
            Vl_1.id_implements = 36060;
            return "ARB_framebuffer_object extension";
        }
        if (gLCapabilities.GL_EXT_framebuffer_object) {
            id_void = Me_1.EXT;
            Vl_1.id_class = 36160;
            Vl_1.id_break = 36161;
            Vl_1.id_byte = 36064;
            Vl_1.id_protected = 36096;
            Vl_1.id_throws = 36053;
            Vl_1.id_catch = 36055;
            Vl_1.id_case = 36054;
            Vl_1.id_private = 36059;
            Vl_1.id_implements = 36060;
            return "EXT_framebuffer_object extension";
        }
        throw new IllegalStateException("Could not initialize framebuffer support.");
    }

    public static void id_class(float f, float f2, float f3, float f4) {
        GL14.glBlendColor((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void id_class(int n, int n2, int n3, boolean bl, int n4, long l) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glVertexAttribPointer((int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (long)l);
    }

    public static void id_class(int n, int n2, int n3, boolean bl, int n4, int n5, int n6) {
        if (n >= 0 && n < B.length) {
            if (B[n] == n2) {
                return;
            }
            MT.B[n] = n2;
        }
        GL42.glBindImageTexture((int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (int)n5, (int)n6);
    }

    public static void id_class(int n, int n2, int n3, int n4, int n5, int n6, long l) {
        GL11.glReadPixels((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (long)l);
    }

    public static void id_class(int n, int n2, int n3, int n4, int n5) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        switch (id_void) {
            case BASE: {
                GL30.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                break;
            }
            case ARB: {
                ARBFramebufferObject.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                break;
            }
            case EXT: {
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
            }
        }
    }

    @Deprecated
    public static void id_class(double d, double d2, double d3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glScaled((double)d, (double)d2, (double)d3);
    }

    public static void id_class(int n, CharSequence charSequence) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glShaderSource((int)n, (CharSequence)charSequence);
    }

    @Deprecated
    public static void id_class(int n, float f, float f2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL13.glMultiTexCoord2f((int)n, (float)f, (float)f2);
        if (n == 33986) {
            id_class = f;
            id_break = f2;
        }
    }

    @Deprecated
    public static void id_class(OE oE) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_byte((OE)oE).id_class.id_break();
    }

    @Deprecated
    public static void id_class(int n, int n2, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glLightfv((int)n, (int)n2, (FloatBuffer)floatBuffer);
    }

    public static void id_class(int n, int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glReadPixels((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (ByteBuffer)byteBuffer);
    }

    public static void id_class(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL20.glCopyTexSubImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8);
    }

    @Deprecated
    public static void id_class() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glPushAttrib((int)8256);
    }

    public static void id_class(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        switch (id_static) {
            case BASE: {
                GL30.glBlitFramebuffer((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10);
                break;
            }
            case EXT: {
                EXTFramebufferBlit.glBlitFramebufferEXT((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10);
            }
        }
    }

    @Deprecated
    public static void id_class(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (n != MT.id_continue.id_break || n2 != MT.id_continue.id_byte) {
            MT.id_continue.id_break = n;
            MT.id_continue.id_byte = n2;
            GL11.glColorMaterial((int)n, (int)n2);
        }
    }

    public static void id_class(rrxz_3[] rrxz_3Array) {
        if (rrxz_3Array != null) {
            for (int i = 0; i < rrxz_3Array.length; ++i) {
                rrxz_3 rrxz_32 = rrxz_3Array[i];
                if (rrxz_32 == null) continue;
                if (rrxz_32.id_byte()) {
                    GL30.glEnablei((int)3042, (int)i);
                } else {
                    GL30.glDisablei((int)3042, (int)i);
                }
                ARBDrawBuffersBlend.glBlendFuncSeparateiARB((int)i, (int)rrxz_32.id_protected(), (int)rrxz_32.id_throws(), (int)rrxz_32.id_case(), (int)rrxz_32.id_catch());
            }
        }
    }

    public static int id_default() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        return GL11.glGenTextures();
    }

    public static void id_short() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_interface[MT.id_throw].id_class.id_class();
    }

    public static void id_void() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_public.id_class.id_break();
    }

    public static boolean r() {
        return id_static != Os_1.NONE;
    }

    public static void id_break(float f, float f2, float f3, float f4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glClearColor((float)f, (float)f2, (float)f3, (float)f4);
    }

    @Deprecated
    public static void id_break(double d, double d2, double d3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glTranslated((double)d, (double)d2, (double)d3);
    }

    public static void id_break(int n, int n2, int n3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glTexParameteri((int)n, (int)n2, (int)n3);
    }

    @Deprecated
    public static void id_break(int n, int n2, int n3, long l) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glVertexPointer((int)n, (int)n2, (int)n3, (long)l);
    }

    @Deprecated
    public static void id_break(float f, float f2, float f3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glScalef((float)f, (float)f2, (float)f3);
    }

    public static void id_break(IntBuffer intBuffer) {
        ((Buffer)intBuffer).rewind();
        while (intBuffer.position() < intBuffer.limit()) {
            int n = intBuffer.get();
            MT.id_continue(n);
        }
        ((Buffer)intBuffer).rewind();
    }

    public static void id_break(int[] nArray) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        for (OM oM : id_interface) {
            for (int n : nArray) {
                if (oM.id_break != n) continue;
                oM.id_break = -1;
            }
        }
        GL11.glDeleteTextures((int[])nArray);
    }

    public static void id_break(boolean bl) {
        MT.id_else.id_class.id_class(bl);
    }

    public static void id_break(rrxW_2 rrxW_22) {
        if (id_import.id_byte()) {
            rrxW_22.id_class(id_short);
        } else {
            rrxW_22.id_class(MT.id_package.id_class.id_break, MT.id_package.id_break, MT.id_package.id_byte);
        }
    }

    public static void id_break(rrxz_3 rrxz_32) {
        if (id_default.id_byte()) {
            rrxz_32.id_class(id_const);
        } else {
            rrxz_32.id_class(MT.id_super.id_class.id_break, MT.id_super.id_break, MT.id_super.id_byte, MT.id_super.id_protected, MT.id_super.id_throws);
        }
    }

    public static void id_break(int n, float f) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glPixelTransferf((int)n, (float)f);
    }

    @Deprecated
    public static void id_break() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glPushAttrib((int)270336);
    }

    @Deprecated
    public static void id_break(float f) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (f != MT.id_else.id_protected) {
            MT.id_else.id_protected = f;
            GL11.glFogf((int)2915, (float)f);
        }
    }

    public static void id_break(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (n != MT.id_this.id_byte) {
            MT.id_this.id_byte = n;
            GL11.glDepthFunc((int)n);
        }
    }

    public static void id_break(rje_3 rje_32, rje_3 rje_33) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class();
        rjV_22.id_break(rje_3.id_protected.id_byte(62.0f));
        rjV_22.id_break(rje_3.id_break.id_byte(185.5f));
        rjV_22.id_class(rjV_2.id_throws(1.0f, -1.0f, 1.0f));
        rjV_22.id_break(rje_3.id_protected.id_byte(-22.5f));
        rjV_22.id_break(rje_3.id_break.id_byte(135.0f));
        MT.id_class(rje_32, rje_33, rjV_22);
    }

    public static void id_break(int n, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform1fv((int)n, (FloatBuffer)floatBuffer);
    }

    public static int id_break(int n, CharSequence charSequence) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL20.glGetUniformLocation((int)n, (CharSequence)charSequence);
    }

    public static void id_break(int n, IntBuffer intBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform2iv((int)n, (IntBuffer)intBuffer);
    }

    public static void id_break(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (id_default.id_byte()) {
            id_const.id_class(n, n2);
        } else if (n != MT.id_super.id_break || n2 != MT.id_super.id_byte || n != MT.id_super.id_protected || n2 != MT.id_super.id_throws) {
            MT.id_super.id_break = n;
            MT.id_super.id_byte = n2;
            MT.id_super.id_protected = n;
            MT.id_super.id_throws = n2;
            if (rrbb_3.rs()) {
                rrdZ.Pg.id_class(n, n2, n, n2);
            }
            GL11.glBlendFunc((int)n, (int)n2);
        }
    }

    @Deprecated
    public static void id_break(OE oE) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_byte((OE)oE).id_class.id_class();
    }

    public static void id_break(int n, boolean bl, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniformMatrix3fv((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
    }

    public static void id_break(int n, int n2, int n3, int n4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (id_default.id_byte()) {
            id_const.id_class(n, n2, n3, n4);
        } else if (n != MT.id_super.id_break || n2 != MT.id_super.id_byte || n3 != MT.id_super.id_protected || n4 != MT.id_super.id_throws) {
            MT.id_super.id_break = n;
            MT.id_super.id_byte = n2;
            MT.id_super.id_protected = n3;
            MT.id_super.id_throws = n4;
            if (rrbb_3.rs()) {
                rrdZ.Pg.id_class(n, n2, n3, n4);
            }
            MT.id_byte(n, n2, n3, n4);
        }
    }

    public static void id_break(rrxQ_2 rrxQ_22) {
        if (id_strictfp.id_byte()) {
            rrxQ_22.id_class(id_boolean);
        } else {
            rrxQ_22.id_class(MT.id_synchronized.id_class.id_break, MT.id_synchronized.id_break);
        }
    }

    private static FloatBuffer id_throws(float f, float f2, float f3, float f4) {
        ((Buffer)id_instanceof).clear();
        id_instanceof.put(f).put(f2).put(f3).put(f4);
        ((Buffer)id_instanceof).flip();
        return id_instanceof;
    }

    private static void id_throws(int n, int n2, int n3, int n4) {
        MT.id_class(8960, 34161, n);
        MT.id_class(8960, 34176, n2);
        MT.id_class(8960, 34192, 768);
        MT.id_class(8960, 34177, n3);
        MT.id_class(8960, 34193, 768);
        MT.id_class(8960, 34178, n4);
        MT.id_class(8960, 34194, 770);
    }

    @Deprecated
    public static void id_throws() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (id_import.id_byte()) {
            id_short.id_class();
        } else {
            MT.id_package.id_class.id_break();
        }
    }

    public static void id_throws(int n, int n2, int n3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (n != MT.id_while.id_byte || n2 != MT.id_while.id_protected || n3 != MT.id_while.id_throws) {
            MT.id_while.id_byte = n;
            MT.id_while.id_protected = n2;
            MT.id_while.id_throws = n3;
            GL11.glStencilOp((int)n, (int)n2, (int)n3);
        }
    }

    public static void id_throws(int n, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform4fv((int)n, (FloatBuffer)floatBuffer);
    }

    public static int id_throws(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL20.glGetShaderi((int)n, (int)n2);
    }

    public static int id_throws(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL20.glCreateShader((int)n);
    }

    public static void M() {
        if (id_strictfp.id_break()) {
            MT.id_byte(id_boolean);
        }
    }

    public static int P() {
        return 33984 + id_throw;
    }

    public static String id_finally(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL20.glGetProgramInfoLog((int)n, (int)n2);
    }

    public static void id_finally() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        MT.id_try.id_class.id_class();
    }

    public static void id_finally(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL15.glDeleteBuffers((int)n);
    }

    public static void id_catch(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUseProgram((int)n);
    }

    public static void id_catch(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL15.glBindBuffer((int)n, (int)n2);
    }

    @Deprecated
    public static void id_catch() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        id_int.id_class();
    }

    public static void G() {
        if (id_import.id_break()) {
            MT.id_byte(id_short);
        }
    }

    public static boolean O() {
        return id_switch;
    }

    public static void id_extends() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        MT.id_try.id_class.id_break();
    }

    public static void id_extends(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        switch (id_void) {
            case BASE: {
                GL30.glDeleteFramebuffers((int)n);
                break;
            }
            case ARB: {
                ARBFramebufferObject.glDeleteFramebuffers((int)n);
                break;
            }
            case EXT: {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)n);
            }
        }
    }

    public static void id_extends(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_new(33985);
        MT.id_import();
        MT.id_return(5890);
        MT.id_boolean();
        float f = 1.0f / (float)(n2 - 1);
        MT.id_break(f, f, f);
        MT.id_return(5888);
        MT.id_super(n);
        MT.id_break(3553, 10241, 9728);
        MT.id_break(3553, 10240, 9728);
        MT.id_break(3553, 10242, 10496);
        MT.id_break(3553, 10243, 10496);
        MT.id_class(8960, 8704, 34160);
        MT.id_throws(34165, 34168, 5890, 5890);
        MT.id_int(7681, 34168);
        MT.id_new(33984);
    }

    @Deprecated
    public static void id_goto(int n) {
        if (!id_transient) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThread);
            GL11.glDisableClientState((int)n);
        }
    }

    public static void id_goto() {
        MT.id_break(OE.S);
        MT.id_break(OE.T);
        MT.id_break(OE.R);
    }

    public static void id_case(int n, int n2, int n3) {
        int n4;
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glDrawArrays((int)n, (int)n2, (int)n3);
        if (rrbb_3.rs() && !id_double && (n4 = rrdZ.Sz.id_final()) > 1) {
            for (int i = 1; i < n4; ++i) {
                rrdZ.PR.id_break(i);
                GL11.glDrawArrays((int)n, (int)n2, (int)n3);
            }
            rrdZ.PR.id_break(0);
        }
    }

    public static void id_case(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glCompileShader((int)n);
    }

    public static void id_case(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform1i((int)n, (int)n2);
    }

    @Deprecated
    public static void id_case() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        id_int.id_break();
    }

    @Deprecated
    public static void id_case(int n, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glGetFloatv((int)n, (FloatBuffer)floatBuffer);
    }

    @Deprecated
    public static void id_const() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        id_abstract.id_break();
    }

    public static void id_continue(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (n != 0) {
            for (int i = 0; i < B.length; ++i) {
                if (B[i] != n) continue;
                MT.B[i] = 0;
            }
            GL11.glDeleteTextures((int)n);
            for (OM oM : id_interface) {
                if (oM.id_break != n) continue;
                oM.id_break = 0;
            }
        }
    }

    public static int id_continue() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        switch (id_void) {
            case BASE: {
                if (GL30.glGetFramebufferAttachmentParameteri((int)36160, (int)36096, (int)36048) != 5890) break;
                return GL30.glGetFramebufferAttachmentParameteri((int)36160, (int)36096, (int)36049);
            }
            case ARB: {
                if (ARBFramebufferObject.glGetFramebufferAttachmentParameteri((int)36160, (int)36096, (int)36048) != 5890) break;
                return ARBFramebufferObject.glGetFramebufferAttachmentParameteri((int)36160, (int)36096, (int)36049);
            }
            case EXT: {
                if (EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT((int)36160, (int)36096, (int)36048) != 5890) break;
                return EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT((int)36160, (int)36096, (int)36049);
            }
        }
        return 0;
    }

    public static void id_else(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (n != MT.id_while.id_break) {
            MT.id_while.id_break = n;
            GL11.glStencilMask((int)n);
        }
    }

    public static void id_else() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_class(8960, 8704, 34160);
        MT.id_package(7681, 34168);
    }

    @Deprecated
    public static void id_for() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glPopMatrix();
    }

    @Deprecated
    public static void id_implements() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_continue.id_class.id_class();
    }

    public static void id_implements(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glLinkProgram((int)n);
    }

    public static String id_implements(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL20.glGetShaderInfoLog((int)n, (int)n2);
    }

    public static void id_import() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        MT.id_interface[MT.id_throw].id_class.id_break();
    }

    @Deprecated
    public static void id_instanceof() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_else.id_class.id_class();
    }

    public static String id_instanceof(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL11.glGetString((int)n);
    }

    public static void id_new(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (id_throw != n - 33984) {
            id_throw = n - 33984;
            MT.id_volatile(n);
        }
    }

    public static int id_new() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        return GL15.glGenBuffers();
    }

    public static void id_package() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (id_default.id_byte()) {
            id_const.id_class();
        } else {
            MT.id_super.id_class.id_break();
        }
    }

    private static void id_package(int n, int n2) {
        MT.id_class(8960, 34161, n);
        MT.id_class(8960, 34176, n2);
        MT.id_class(8960, 34192, 768);
    }

    @Deprecated
    public static void id_package(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (n != MT.id_else.id_break) {
            MT.id_else.id_break = n;
            MT.id_native(2917, n);
            if (rrbb_3.rs()) {
                rrdZ.id_protected(n);
            }
        }
    }

    public static void id_return() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_new(33985);
        MT.id_short();
        MT.id_new(33984);
    }

    @Deprecated
    public static void id_return(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glMatrixMode((int)n);
    }

    public static void id_super(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (n != MT.id_interface[MT.id_throw].id_break) {
            MT.id_interface[MT.id_throw].id_break = n;
            GL11.glBindTexture((int)3553, (int)n);
            if (rrMh_1.id_class()) {
                rrMh_1.id_class(n);
            }
        }
    }

    public static int id_super() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        switch (id_void) {
            case BASE: {
                return GL30.glGenFramebuffers();
            }
            case ARB: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case EXT: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
        }
        return -1;
    }

    public static int id_switch() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GL11.glGetError();
    }

    public static int id_throw(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        return GL11.glGetInteger((int)n);
    }

    public static void id_throw() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (id_strictfp.id_byte()) {
            id_boolean.id_class();
        } else {
            MT.id_synchronized.id_class.id_break();
        }
    }

    public static void id_try(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glEnableVertexAttribArray((int)n);
    }

    @Deprecated
    public static void id_try() {
        if (id_switch) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThread);
            MT.id_else.id_class.id_break();
        }
    }

    public static void id_while() {
        MT.id_case(2983, id_final);
        MT.id_class(id_final);
        MT.id_case(2982, id_final);
        MT.id_class(id_final);
    }

    public static void id_while(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glEnableVertexAttribArray((int)n);
    }

    public static void id_static() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_public.id_class.id_class();
    }

    @Deprecated
    public static void id_public(int n) {
        if (!id_transient) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThread);
            GL11.glEnableClientState((int)n);
        }
    }

    public static void id_public() {
        MT.id_class(OE.S, 9216);
        MT.id_class(OE.T, 9216);
        MT.id_class(OE.R, 9216);
        MT.id_class(OE.S, 9474, MT.id_throws(1.0f, 0.0f, 0.0f, 0.0f));
        MT.id_class(OE.T, 9474, MT.id_throws(0.0f, 1.0f, 0.0f, 0.0f));
        MT.id_class(OE.R, 9474, MT.id_throws(0.0f, 0.0f, 1.0f, 0.0f));
        MT.id_class(OE.S);
        MT.id_class(OE.T);
        MT.id_class(OE.R);
    }

    public static void id_protected(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glDeleteShader((int)n);
    }

    public static void id_protected(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glAttachShader((int)n, (int)n2);
    }

    public static void id_protected(int n, IntBuffer intBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform4iv((int)n, (IntBuffer)intBuffer);
    }

    public static void id_protected(int n, FloatBuffer floatBuffer) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glUniform3fv((int)n, (FloatBuffer)floatBuffer);
    }

    @Deprecated
    public static void id_protected() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (id_import.id_byte()) {
            id_short.id_break();
        } else {
            MT.id_package.id_class.id_class();
        }
    }

    public static void id_protected(int n, int n2, int n3, int n4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        OO.INSTANCE.x = n;
        OO.INSTANCE.y = n2;
        OO.INSTANCE.w = n3;
        OO.INSTANCE.h = n4;
        GL11.glViewport((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static void id_protected(int n, int n2, int n3) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (n != MT.id_while.id_class.id_class || n != MT.id_while.id_class.id_break || n != MT.id_while.id_class.id_byte) {
            MT.id_while.id_class.id_class = n;
            MT.id_while.id_class.id_break = n2;
            MT.id_while.id_class.id_byte = n3;
            GL11.glStencilFunc((int)n, (int)n2, (int)n3);
        }
    }

    public static void id_protected(float f) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glLineWidth((float)f);
    }

    @Deprecated
    public static void id_protected(float f, float f2, float f3, float f4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (f != MT.id_float.id_class || f2 != MT.id_float.id_break || f3 != MT.id_float.id_byte || f4 != MT.id_float.id_protected) {
            MT.id_float.id_class = f;
            MT.id_float.id_break = f2;
            MT.id_float.id_byte = f3;
            MT.id_float.id_protected = f4;
            GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        }
    }

    public static void id_private(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (n == 36160) {
            if (r == n2 && P == n2) {
                return;
            }
            r = n2;
            P = n2;
        } else if (n == 36008) {
            if (r == n2) {
                return;
            }
            r = n2;
        }
        if (n == 36009) {
            if (P == n2) {
                return;
            }
            P = n2;
        }
        switch (id_void) {
            case BASE: {
                GL30.glBindFramebuffer((int)n, (int)n2);
                break;
            }
            case ARB: {
                ARBFramebufferObject.glBindFramebuffer((int)n, (int)n2);
                break;
            }
            case EXT: {
                EXTFramebufferObject.glBindFramebufferEXT((int)n, (int)n2);
            }
        }
    }

    public static void id_private(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL20.glDeleteProgram((int)n);
    }

    @Deprecated
    public static void id_private() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_continue.id_class.id_break();
    }

    public static void id_abstract() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_return.id_class.id_class();
    }

    public static void id_final() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (id_default.id_byte()) {
            id_const.id_break();
        } else {
            MT.id_super.id_class.id_class();
        }
    }

    public static void id_final(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        GL11.glPixelStorei((int)n, (int)n2);
    }

    @Deprecated
    public static void id_final(int n) {
        if (n != id_for) {
            RenderSystem.assertThread(RenderSystem::isOnRenderThread);
            GL13.glClientActiveTexture((int)n);
            id_for = n;
        }
    }

    @Deprecated
    public static void id_transient() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glPushMatrix();
    }

    public static void id_volatile(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL13.glActiveTexture((int)n);
    }

    public static void id_volatile() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        MT.id_this.id_class.id_break();
    }

    public static void id_volatile(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glPolygonMode((int)n, (int)n2);
    }

    public static void id_synchronized() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_class(8960, 8704, 8448);
        MT.id_throws(8448, 5890, 34168, 34166);
    }

    public static void id_synchronized(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glClearStencil((int)n);
    }

    public static void id_native() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        MT.id_this.id_class.id_class();
    }

    @Deprecated
    public static void id_native(int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glFogi((int)n, (int)n2);
    }

    public static int id_native(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        switch (id_void) {
            case BASE: {
                return GL30.glCheckFramebufferStatus((int)n);
            }
            case ARB: {
                return ARBFramebufferObject.glCheckFramebufferStatus((int)n);
            }
            case EXT: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT((int)n);
            }
        }
        return -1;
    }

    @Deprecated
    public static void id_strictfp() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        id_abstract.id_class();
    }

    public static boolean E() {
        return MT.id_else.id_class.id_break;
    }

    public static void X() {
        id_transient = false;
    }
}

