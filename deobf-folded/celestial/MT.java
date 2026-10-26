package celestial;

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
   private static final FloatBuffer id_final = GLX.make(MemoryUtil.memAllocFloat(16), var0 -> gs_3.id_class(MemoryUtil.memAddress(var0)));
   private static final Mw_1 id_package = new Mw_1();
   private static final Mf_1 id_int = new Mf_1(2896);
   private static final Mf_1[] id_new = IntStream.range(0, 8).mapToObj(var0 -> new Mf_1(16384 + var0)).toArray(Mf_1[]::new);
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
   private static final OM[] id_interface = IntStream.range(0, 32).mapToObj(var0 -> new OM()).toArray(OM[]::new);
   private static int id_char = 7425;
   private static final Mf_1 id_abstract = new Mf_1(32826);
   private static final Mg_1 id_long = new Mg_1();
   private static final Mj_1 id_float = new Mj_1();
   private static Me_1 id_void;
   private static Os_1 id_static;
   private static rrWK id_import = new rrWK();
   private static rrxW_2 id_short = new rrxW_2();
   private static rrWK id_default = new rrWK();
   private static rrxz_3 id_const = new rrxz_3();
   private static rrWK id_strictfp = new rrWK();
   private static rrxQ_2 id_boolean = new rrxQ_2();
   private static boolean id_transient = false;
   private static int id_for = 0;
   private static boolean id_double = false;
   public static float id_class = 0.0F;
   public static float id_break = 0.0F;
   public static boolean id_byte;
   public static boolean id_protected;
   public static int id_throws;
   public static int id_case;
   public static int id_catch;
   public static int id_private;
   private static boolean id_switch = true;
   public static final int id_implements = 7;
   public static final int id_finally = 4;
   public static final int id_extends = 33984;
   public static final int id_native = 33985;
   public static final int id_volatile = 33986;
   private static int r;
   private static int P;
   private static final int[] B = new int[8];

   @Deprecated
   public static void id_boolean() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glLoadIdentity();
   }

   public static void id_char() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_return.id_class.id_break();
   }

   public static int id_byte(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return GL11.glGetTexLevelParameteri(var0, var1, var2);
   }

   @Deprecated
   public static void id_byte(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glRotatef(var0, var1, var2, var3);
   }

   @Deprecated
   public static void id_byte(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTranslatef(var0, var1, var2);
   }

   public static void id_byte(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL14.glBlendEquation(var0);
   }

   @Deprecated
   public static void id_byte(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_else.id_throws) {
         id_else.id_throws = var0;
         GL11.glFogf(2916, var0);
      }
   }

   public static void id_byte(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL14.glBlendFuncSeparate(var0, var1, var2, var3);
   }

   public static int id_byte(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetAttribLocation(var0, var1);
   }

   public static void id_byte(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix4fv(var0, var1, var2);
   }

   public static void id_byte(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform3iv(var0, var1);
   }

   public static void id_byte(boolean var0) {
      id_switch = var0;
   }

   @Deprecated
   public static void id_byte() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPopAttrib();
   }

   public static void id_byte(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform2fv(var0, var1);
   }

   public static int id_byte(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetProgrami(var0, var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Deprecated
   private static OG id_byte(OE var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      switch (var0) {
         case S:
            return id_goto.id_class;
         case T:
            return id_goto.id_break;
         case R:
            return id_goto.id_byte;
         case Q:
            return id_goto.id_protected;
         default:
            return id_goto.id_class;
      }
   }

   public static void id_byte(rrxW_2 var0) {
      if (id_import.id_byte()) {
         id_short.id_class(var0);
      } else {
         id_package.id_class.id_class(var0.id_byte());
         id_class(var0.id_protected(), var0.id_throws());
      }
   }

   @Deprecated
   public static void id_byte(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glColorPointer(var0, var1, var2, var3);
   }

   public static void id_byte(rrxz_3 var0) {
      if (id_default.id_byte()) {
         id_const.id_class(var0);
      } else {
         id_super.id_class.id_class(var0.id_byte());
         if (!var0.id_private()) {
            id_break(var0.id_protected(), var0.id_throws());
         } else {
            id_break(var0.id_protected(), var0.id_throws(), var0.id_case(), var0.id_catch());
         }
      }
   }

   public static void id_byte(rrxQ_2 var0) {
      if (id_strictfp.id_byte()) {
         id_boolean.id_class(var0);
      } else {
         id_synchronized.id_class.id_class(var0.id_byte());
         id_synchronized.id_break = var0.id_protected();
      }
   }

   public static void id_byte(IntBuffer var0) {
      GL11.glCallLists(var0);
      if (rrbb_3.rs() && !id_double) {
         int var1 = rrdZ.Sz.id_final();
         if (var1 > 1) {
            for (int var2 = 1; var2 < var1; var2++) {
               rrdZ.PR.id_break(var2);
               GL11.glCallLists(var0);
            }

            rrdZ.PR.id_break(0);
         }
      }
   }

   private static void id_int(int var0, int var1) {
      id_class(8960, 34162, var0);
      id_class(8960, 34184, var1);
      id_class(8960, 34200, 770);
   }

   public static void id_int(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_public.id_break) {
         id_public.id_break = var0;
         GL11.glLogicOp(var0);
      }
   }

   public static int id_int() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glCreateProgram();
   }

   public static void id_long() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_return.id_break.id_break();
   }

   public static void id_float() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_return.id_break.id_class();
   }

   @Deprecated
   public static void id_double() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_float.id_class = -1.0F;
      id_float.id_break = -1.0F;
      id_float.id_byte = -1.0F;
      id_float.id_protected = -1.0F;
   }

   public static void B() {
      GL11.glBindTexture(3553, id_interface[id_throw].id_break);
   }

   public static int J() {
      return r;
   }

   public static int S() {
      return id_interface[id_throw].id_break;
   }

   @Deprecated
   public static int id_this() {
      return id_interface[id_throw].id_break;
   }

   @Deprecated
   public static void id_this(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != id_char) {
         id_char = var0;
         GL11.glShadeModel(var0);
      }
   }

   public static void b() {
      if (id_default.id_break()) {
         id_byte(id_const);
      }
   }

   public static int x() {
      return P;
   }

   public static void s() {
      if (rrbb_3.id_final()) {
         int var0 = GL11.glGetInteger(34016);
         int var1 = GL11.glGetInteger(32873);
         int var2 = P();
         int var3 = S();
         if (var3 > 0 && (var0 != var2 || var1 != var3)) {
            rrbb_3.id_byte("checkTexture: act: " + var2 + ", glAct: " + var0 + ", tex: " + var3 + ", glTex: " + var1);
         }
      }
   }

   public static void h() {
      id_transient = true;
   }

   public static void d() {
      if (id_super.id_class.id_break) {
         GL11.glEnable(3042);
      } else {
         GL11.glDisable(3042);
      }

      GL14.glBlendFuncSeparate(id_super.id_break, id_super.id_byte, id_super.id_protected, id_super.id_throws);
   }

   public static void id_interface() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (id_strictfp.id_byte()) {
         id_boolean.id_break();
      } else {
         id_synchronized.id_class.id_class();
      }
   }

   public static void id_interface(int var0) {
      id_class(var0, false);
   }

   public static void id_class(rje_3 var0, rje_3 var1, rjV_2 var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_transient();
      id_boolean();
      id_class(0);
      id_class(1);
      rji_3 var3 = new rji_3(var0);
      var3.id_class(var2);
      id_class(16384, 4611, id_throws(var3.id_class(), var3.id_break(), var3.id_byte(), 0.0F));
      float var4 = 0.6F;
      id_class(16384, 4609, id_throws(0.6F, 0.6F, 0.6F, 1.0F));
      id_class(16384, 4608, id_throws(0.0F, 0.0F, 0.0F, 1.0F));
      id_class(16384, 4610, id_throws(0.0F, 0.0F, 0.0F, 1.0F));
      rji_3 var5 = new rji_3(var1);
      var5.id_class(var2);
      id_class(16385, 4611, id_throws(var5.id_class(), var5.id_break(), var5.id_byte(), 0.0F));
      id_class(16385, 4609, id_throws(0.6F, 0.6F, 0.6F, 1.0F));
      id_class(16385, 4608, id_throws(0.0F, 0.0F, 0.0F, 1.0F));
      id_class(16385, 4610, id_throws(0.0F, 0.0F, 0.0F, 1.0F));
      id_this(7424);
      float var6 = 0.4F;
      id_class(2899, id_throws(0.4F, 0.4F, 0.4F, 1.0F));
      id_for();
   }

   public static void id_class(rje_3 var0, rje_3 var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      rjV_2 var2 = new rjV_2();
      var2.id_class();
      var2.id_class(rjV_2.id_throws(1.0F, -1.0F, 1.0F));
      var2.id_break(rje_3.id_protected.id_byte(-22.5F));
      var2.id_break(rje_3.id_break.id_byte(135.0F));
      id_class(var0, var1, var2);
   }

   public static void id_class(int var0, int var1, long var2, long var4, long var6) {
      if (id_byte) {
         GL31.glCopyBufferSubData(var0, var1, var2, var4, var6);
      } else {
         ARBCopyBuffer.glCopyBufferSubData(var0, var1, var2, var4, var6);
      }
   }

   public static void id_class(boolean var0, boolean var1, boolean var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_long.id_class || var1 != id_long.id_break || var2 != id_long.id_byte || var3 != id_long.id_protected) {
         id_long.id_class = var0;
         id_long.id_break = var1;
         id_long.id_byte = var2;
         id_long.id_protected = var3;
         GL11.glColorMask(var0, var1, var2, var3);
      }
   }

   public static void id_class(int var0, long var1, ByteBuffer var3) {
      GL15.glBufferSubData(var0, var1, var3);
   }

   @Deprecated
   public static void id_class(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_new[var0].id_break();
   }

   @Deprecated
   public static void id_class(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLightModelfv(var0, var1);
   }

   public static void id_class(int var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClear(var0);
      if (var1) {
         id_switch();
      }
   }

   @Deprecated
   public static void id_class(double var0, double var2, double var4, double var6, double var8, double var10) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glOrtho(var0, var2, var4, var6, var8, var10);
   }

   public static void id_class(rrxz_3 var0) {
      if (!id_default.id_byte()) {
         id_break(id_const);
         id_byte(var0);
         id_default.id_class();
      }
   }

   public static void id_class(double var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClearDepth(var0);
   }

   @Deprecated
   public static void id_class(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glNormal3f(var0, var1, var2);
   }

   public static void id_class(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL20.glScissor(var0, var1, var2, var3);
   }

   public static void id_class(float var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_return.id_byte || var1 != id_return.id_protected) {
         id_return.id_byte = var0;
         id_return.id_protected = var1;
         GL11.glPolygonOffset(var0, var1);
      }
   }

   public static void id_class(int[] var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glGenTextures(var0);
   }

   public static void id_class(int var0, IntBuffer var1, IntBuffer var2) {
      GL14.glMultiDrawArrays(var0, var1, var2);
      if (rrbb_3.rs() && !id_double) {
         int var3 = rrdZ.Sz.id_final();
         if (var3 > 1) {
            for (int var4 = 1; var4 < var3; var4++) {
               rrdZ.PR.id_break(var4);
               GL14.glMultiDrawArrays(var0, var1, var2);
            }

            rrdZ.PR.id_break(0);
         }
      }
   }

   @Deprecated
   public static void id_class(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexEnvi(var0, var1, var2);
   }

   public static void id_class(int var0, int var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexParameterf(var0, var1, var2);
   }

   @Deprecated
   public static void id_class(OE var0, int var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexGenfv(id_byte(var0).id_break, var1, var2);
   }

   @Deprecated
   public static void id_class(OE var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      OG var2 = id_byte(var0);
      if (var1 != var2.id_byte) {
         var2.id_byte = var1;
         GL11.glTexGeni(var2.id_break, 9472, var1);
      }
   }

   public static void id_class(boolean var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_this.id_break) {
         id_this.id_break = var0;
         GL11.glDepthMask(var0);
      }
   }

   public static void id_class(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, IntBuffer var8) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Deprecated
   public static void id_class(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 < 0.0F) {
         var0 = 0.0F;
      }

      if (var0 != id_else.id_byte) {
         id_else.id_byte = var0;
         GL11.glFogf(2914, var0);
         if (rrbb_3.rs()) {
            rrdZ.id_class(var0);
         }
      }
   }

   public static void id_class(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void id_class(int var0, int var1, int var2, int var3, long var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glGetTexImage(var0, var1, var2, var3, var4);
   }

   public static void id_class(rrxQ_2 var0) {
      if (!id_strictfp.id_byte()) {
         id_break(id_boolean);
         id_byte(var0);
         id_strictfp.id_class();
      }
   }

   @Deprecated
   public static void id_class(int var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (id_import.id_byte()) {
         id_short.id_class(var0, var1);
      } else if (var0 != id_package.id_break || var1 != id_package.id_byte) {
         id_package.id_break = var0;
         id_package.id_byte = var1;
         GL11.glAlphaFunc(var0, var1);
      }
   }

   public static void id_class(int var0, long var1, int var3) {
      GL15.glBufferData(var0, var1, var3);
   }

   @Deprecated
   public static void id_class(int var0, float[] var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glFogfv(var0, var1);
   }

   @Deprecated
   public static void id_class(int var0, int var1, long var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glNormalPointer(var0, var1, var2);
   }

   @Deprecated
   public static void id_class(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexCoordPointer(var0, var1, var2, var3);
   }

   public static void id_class(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix2fv(var0, var1, var2);
   }

   public static void id_class(IntBuffer var0) {
      GL11.glGenTextures(var0);
   }

   @Deprecated
   public static void id_class(rjV_2 var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.id_class(id_final);
      ((Buffer)id_final).rewind();
      id_class(id_final);
   }

   @Deprecated
   public static void id_class(FloatBuffer var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glMultMatrixf(var0);
   }

   public static void id_class(int var0, ByteBuffer var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL15.glBufferData(var0, var1, var2);
   }

   public static void id_class(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1iv(var0, var1);
   }

   public static void id_class(rrxW_2 var0) {
      if (!id_import.id_byte()) {
         id_break(id_short);
         id_byte(var0);
         id_import.id_class();
      }
   }

   public static String id_class(GLCapabilities var0) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      rrbb_3.id_byte();
      id_byte = var0.OpenGL31;
      if (id_byte) {
         id_throws = 36662;
         id_case = 36663;
      } else {
         id_throws = 36662;
         id_case = 36663;
      }

      if (var0.OpenGL15) {
         id_catch = 34962;
         id_private = 35044;
      } else {
         id_catch = 34962;
         id_private = 35044;
      }

      boolean var1 = id_byte || var0.GL_ARB_copy_buffer;
      boolean var2 = var0.OpenGL14;
      id_protected = var1 && var2;
      if (!id_protected) {
         ArrayList var3 = new ArrayList();
         if (!var1) {
            var3.add("OpenGL 1.3, ARB_copy_buffer");
         }

         if (!var2) {
            var3.add("OpenGL 1.4");
         }

         String var4 = "VboRegions not supported, missing: " + rrbb_3.id_class(var3);
         rrbb_3.id_byte(var4);
         var3.add(var4);
      }

      if (var0.OpenGL30) {
         id_static = Os_1.BASE;
      } else if (var0.GL_EXT_framebuffer_blit) {
         id_static = Os_1.EXT;
      } else {
         id_static = Os_1.NONE;
      }

      if (var0.OpenGL30) {
         id_void = Me_1.BASE;
         Vl_1.id_class = 36160;
         Vl_1.id_break = 36161;
         Vl_1.id_byte = 36064;
         Vl_1.id_protected = 36096;
         Vl_1.id_throws = 36053;
         Vl_1.id_case = 36054;
         Vl_1.id_catch = 36055;
         Vl_1.id_private = 36059;
         id_implements = 36060;
         return "OpenGL 3.0";
      } else if (var0.GL_ARB_framebuffer_object) {
         id_void = Me_1.ARB;
         Vl_1.id_class = 36160;
         Vl_1.id_break = 36161;
         Vl_1.id_byte = 36064;
         Vl_1.id_protected = 36096;
         Vl_1.id_throws = 36053;
         Vl_1.id_catch = 36055;
         Vl_1.id_case = 36054;
         Vl_1.id_private = 36059;
         id_implements = 36060;
         return "ARB_framebuffer_object extension";
      } else if (var0.GL_EXT_framebuffer_object) {
         id_void = Me_1.EXT;
         Vl_1.id_class = 36160;
         Vl_1.id_break = 36161;
         Vl_1.id_byte = 36064;
         Vl_1.id_protected = 36096;
         Vl_1.id_throws = 36053;
         Vl_1.id_catch = 36055;
         Vl_1.id_case = 36054;
         Vl_1.id_private = 36059;
         id_implements = 36060;
         return "EXT_framebuffer_object extension";
      } else {
         throw new IllegalStateException("Could not initialize framebuffer support.");
      }
   }

   public static void id_class(float var0, float var1, float var2, float var3) {
      GL14.glBlendColor(var0, var1, var2, var3);
   }

   public static void id_class(int var0, int var1, int var2, boolean var3, int var4, long var5) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glVertexAttribPointer(var0, var1, var2, var3, var4, var5);
   }

   public static void id_class(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6) {
      if (var0 >= 0 && var0 < B.length) {
         if (B[var0] == var1) {
            return;
         }

         B[var0] = var1;
      }

      GL42.glBindImageTexture(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void id_class(int var0, int var1, int var2, int var3, int var4, int var5, long var6) {
      GL11.glReadPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void id_class(int var0, int var1, int var2, int var3, int var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (id_void) {
         case BASE:
            GL30.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case ARB:
            ARBFramebufferObject.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case EXT:
            EXTFramebufferObject.glFramebufferTexture2DEXT(var0, var1, var2, var3, var4);
      }
   }

   @Deprecated
   public static void id_class(double var0, double var2, double var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glScaled(var0, var2, var4);
   }

   public static void id_class(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glShaderSource(var0, var1);
   }

   @Deprecated
   public static void id_class(int var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL13.glMultiTexCoord2f(var0, var1, var2);
      if (var0 == 33986) {
         id_class = var1;
         id_break = var2;
      }
   }

   @Deprecated
   public static void id_class(OE var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_byte(var0).id_class.id_break();
   }

   @Deprecated
   public static void id_class(int var0, int var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLightfv(var0, var1, var2);
   }

   public static void id_class(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glReadPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void id_class(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL20.glCopyTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @Deprecated
   public static void id_class() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushAttrib(8256);
   }

   public static void id_class(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (id_static) {
         case BASE:
            GL30.glBlitFramebuffer(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
            break;
         case EXT:
            EXTFramebufferBlit.glBlitFramebufferEXT(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
         case NONE:
      }
   }

   @Deprecated
   public static void id_class(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_continue.id_break || var1 != id_continue.id_byte) {
         id_continue.id_break = var0;
         id_continue.id_byte = var1;
         GL11.glColorMaterial(var0, var1);
      }
   }

   public static void id_class(rrxz_3[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            rrxz_3 var2 = var0[var1];
            if (var2 != null) {
               if (var2.id_byte()) {
                  GL30.glEnablei(3042, var1);
               } else {
                  GL30.glDisablei(3042, var1);
               }

               ARBDrawBuffersBlend.glBlendFuncSeparateiARB(var1, var2.id_protected(), var2.id_throws(), var2.id_case(), var2.id_catch());
            }
         }
      }
   }

   public static int id_default() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      return GL11.glGenTextures();
   }

   public static void id_short() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_interface[id_throw].id_class.id_class();
   }

   public static void id_void() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_public.id_class.id_break();
   }

   public static boolean r() {
      return id_static != Os_1.NONE;
   }

   public static void id_break(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClearColor(var0, var1, var2, var3);
   }

   @Deprecated
   public static void id_break(double var0, double var2, double var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTranslated(var0, var2, var4);
   }

   public static void id_break(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexParameteri(var0, var1, var2);
   }

   @Deprecated
   public static void id_break(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glVertexPointer(var0, var1, var2, var3);
   }

   @Deprecated
   public static void id_break(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glScalef(var0, var1, var2);
   }

   public static void id_break(IntBuffer var0) {
      ((Buffer)var0).rewind();

      while (var0.position() < var0.limit()) {
         int var1 = var0.get();
         id_continue(var1);
      }

      ((Buffer)var0).rewind();
   }

   public static void id_break(int[] var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);

      for (OM var4 : id_interface) {
         for (int var8 : var0) {
            if (var4.id_break == var8) {
               var4.id_break = -1;
            }
         }
      }

      GL11.glDeleteTextures(var0);
   }

   public static void id_break(boolean var0) {
      id_else.id_class.id_class(var0);
   }

   public static void id_break(rrxW_2 var0) {
      if (id_import.id_byte()) {
         var0.id_class(id_short);
      } else {
         var0.id_class(id_package.id_class.id_break, id_package.id_break, id_package.id_byte);
      }
   }

   public static void id_break(rrxz_3 var0) {
      if (id_default.id_byte()) {
         var0.id_class(id_const);
      } else {
         var0.id_class(id_super.id_class.id_break, id_super.id_break, id_super.id_byte, id_super.id_protected, id_super.id_throws);
      }
   }

   public static void id_break(int var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPixelTransferf(var0, var1);
   }

   @Deprecated
   public static void id_break() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushAttrib(270336);
   }

   @Deprecated
   public static void id_break(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_else.id_protected) {
         id_else.id_protected = var0;
         GL11.glFogf(2915, var0);
      }
   }

   public static void id_break(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != id_this.id_byte) {
         id_this.id_byte = var0;
         GL11.glDepthFunc(var0);
      }
   }

   public static void id_break(rje_3 var0, rje_3 var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      rjV_2 var2 = new rjV_2();
      var2.id_class();
      var2.id_break(rje_3.id_protected.id_byte(62.0F));
      var2.id_break(rje_3.id_break.id_byte(185.5F));
      var2.id_class(rjV_2.id_throws(1.0F, -1.0F, 1.0F));
      var2.id_break(rje_3.id_protected.id_byte(-22.5F));
      var2.id_break(rje_3.id_break.id_byte(135.0F));
      id_class(var0, var1, var2);
   }

   public static void id_break(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1fv(var0, var1);
   }

   public static int id_break(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetUniformLocation(var0, var1);
   }

   public static void id_break(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform2iv(var0, var1);
   }

   public static void id_break(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (id_default.id_byte()) {
         id_const.id_class(var0, var1);
      } else if (var0 != id_super.id_break || var1 != id_super.id_byte || var0 != id_super.id_protected || var1 != id_super.id_throws) {
         id_super.id_break = var0;
         id_super.id_byte = var1;
         id_super.id_protected = var0;
         id_super.id_throws = var1;
         if (rrbb_3.rs()) {
            rrdZ.Pg.id_class(var0, var1, var0, var1);
         }

         GL11.glBlendFunc(var0, var1);
      }
   }

   @Deprecated
   public static void id_break(OE var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_byte(var0).id_class.id_class();
   }

   public static void id_break(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix3fv(var0, var1, var2);
   }

   public static void id_break(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (id_default.id_byte()) {
         id_const.id_class(var0, var1, var2, var3);
      } else if (var0 != id_super.id_break || var1 != id_super.id_byte || var2 != id_super.id_protected || var3 != id_super.id_throws) {
         id_super.id_break = var0;
         id_super.id_byte = var1;
         id_super.id_protected = var2;
         id_super.id_throws = var3;
         if (rrbb_3.rs()) {
            rrdZ.Pg.id_class(var0, var1, var2, var3);
         }

         id_byte(var0, var1, var2, var3);
      }
   }

   public static void id_break(rrxQ_2 var0) {
      if (id_strictfp.id_byte()) {
         var0.id_class(id_boolean);
      } else {
         var0.id_class(id_synchronized.id_class.id_break, id_synchronized.id_break);
      }
   }

   private static FloatBuffer id_throws(float var0, float var1, float var2, float var3) {
      ((Buffer)id_instanceof).clear();
      id_instanceof.put(var0).put(var1).put(var2).put(var3);
      ((Buffer)id_instanceof).flip();
      return id_instanceof;
   }

   private static void id_throws(int var0, int var1, int var2, int var3) {
      id_class(8960, 34161, var0);
      id_class(8960, 34176, var1);
      id_class(8960, 34192, 768);
      id_class(8960, 34177, var2);
      id_class(8960, 34193, 768);
      id_class(8960, 34178, var3);
      id_class(8960, 34194, 770);
   }

   @Deprecated
   public static void id_throws() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (id_import.id_byte()) {
         id_short.id_class();
      } else {
         id_package.id_class.id_break();
      }
   }

   public static void id_throws(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_while.id_byte || var1 != id_while.id_protected || var2 != id_while.id_throws) {
         id_while.id_byte = var0;
         id_while.id_protected = var1;
         id_while.id_throws = var2;
         GL11.glStencilOp(var0, var1, var2);
      }
   }

   public static void id_throws(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform4fv(var0, var1);
   }

   public static int id_throws(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetShaderi(var0, var1);
   }

   public static int id_throws(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glCreateShader(var0);
   }

   public static void M() {
      if (id_strictfp.id_break()) {
         id_byte(id_boolean);
      }
   }

   public static int P() {
      return 33984 + id_throw;
   }

   public static String id_finally(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetProgramInfoLog(var0, var1);
   }

   public static void id_finally() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      id_try.id_class.id_class();
   }

   public static void id_finally(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL15.glDeleteBuffers(var0);
   }

   public static void id_catch(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUseProgram(var0);
   }

   public static void id_catch(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL15.glBindBuffer(var0, var1);
   }

   @Deprecated
   public static void id_catch() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_int.id_class();
   }

   public static void G() {
      if (id_import.id_break()) {
         id_byte(id_short);
      }
   }

   public static boolean O() {
      return id_switch;
   }

   public static void id_extends() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      id_try.id_class.id_break();
   }

   public static void id_extends(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (id_void) {
         case BASE:
            GL30.glDeleteFramebuffers(var0);
            break;
         case ARB:
            ARBFramebufferObject.glDeleteFramebuffers(var0);
            break;
         case EXT:
            EXTFramebufferObject.glDeleteFramebuffersEXT(var0);
      }
   }

   public static void id_extends(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_new(33985);
      id_import();
      id_return(5890);
      id_boolean();
      float var2 = 1.0F / (float)(var1 - 1);
      id_break(var2, var2, var2);
      id_return(5888);
      id_super(var0);
      id_break(3553, 10241, 9728);
      id_break(3553, 10240, 9728);
      id_break(3553, 10242, 10496);
      id_break(3553, 10243, 10496);
      id_class(8960, 8704, 34160);
      id_throws(34165, 34168, 5890, 5890);
      id_int(7681, 34168);
      id_new(33984);
   }

   @Deprecated
   public static void id_goto(int var0) {
      if (!id_transient) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL11.glDisableClientState(var0);
      }
   }

   public static void id_goto() {
      id_break(OE.S);
      id_break(OE.T);
      id_break(OE.R);
   }

   public static void id_case(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glDrawArrays(var0, var1, var2);
      if (rrbb_3.rs() && !id_double) {
         int var3 = rrdZ.Sz.id_final();
         if (var3 > 1) {
            for (int var4 = 1; var4 < var3; var4++) {
               rrdZ.PR.id_break(var4);
               GL11.glDrawArrays(var0, var1, var2);
            }

            rrdZ.PR.id_break(0);
         }
      }
   }

   public static void id_case(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glCompileShader(var0);
   }

   public static void id_case(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1i(var0, var1);
   }

   @Deprecated
   public static void id_case() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_int.id_break();
   }

   @Deprecated
   public static void id_case(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glGetFloatv(var0, var1);
   }

   @Deprecated
   public static void id_const() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_abstract.id_break();
   }

   public static void id_continue(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != 0) {
         for (int var1 = 0; var1 < B.length; var1++) {
            if (B[var1] == var0) {
               B[var1] = 0;
            }
         }

         GL11.glDeleteTextures(var0);

         for (OM var4 : id_interface) {
            if (var4.id_break == var0) {
               var4.id_break = 0;
            }
         }
      }
   }

   public static int id_continue() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (id_void) {
         case BASE:
            if (GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
               return GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
            }
            break;
         case ARB:
            if (ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
               return ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
            }
            break;
         case EXT:
            if (EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36048) == 5890) {
               return EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36049);
            }
      }

      return 0;
   }

   public static void id_else(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_while.id_break) {
         id_while.id_break = var0;
         GL11.glStencilMask(var0);
      }
   }

   public static void id_else() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_class(8960, 8704, 34160);
      id_package(7681, 34168);
   }

   @Deprecated
   public static void id_for() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPopMatrix();
   }

   @Deprecated
   public static void id_implements() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_continue.id_class.id_class();
   }

   public static void id_implements(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glLinkProgram(var0);
   }

   public static String id_implements(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetShaderInfoLog(var0, var1);
   }

   public static void id_import() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      id_interface[id_throw].id_class.id_break();
   }

   @Deprecated
   public static void id_instanceof() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_else.id_class.id_class();
   }

   public static String id_instanceof(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL11.glGetString(var0);
   }

   public static void id_new(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (id_throw != var0 - 33984) {
         id_throw = var0 - 33984;
         id_volatile(var0);
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
         id_super.id_class.id_break();
      }
   }

   private static void id_package(int var0, int var1) {
      id_class(8960, 34161, var0);
      id_class(8960, 34176, var1);
      id_class(8960, 34192, 768);
   }

   @Deprecated
   public static void id_package(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_else.id_break) {
         id_else.id_break = var0;
         id_native(2917, var0);
         if (rrbb_3.rs()) {
            rrdZ.id_protected(var0);
         }
      }
   }

   public static void id_return() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_new(33985);
      id_short();
      id_new(33984);
   }

   @Deprecated
   public static void id_return(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glMatrixMode(var0);
   }

   public static void id_super(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != id_interface[id_throw].id_break) {
         id_interface[id_throw].id_break = var0;
         GL11.glBindTexture(3553, var0);
         if (rrMh_1.id_class()) {
            rrMh_1.id_class(var0);
         }
      }
   }

   public static int id_super() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (id_void) {
         case BASE:
            return GL30.glGenFramebuffers();
         case ARB:
            return ARBFramebufferObject.glGenFramebuffers();
         case EXT:
            return EXTFramebufferObject.glGenFramebuffersEXT();
         default:
            return -1;
      }
   }

   public static int id_switch() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL11.glGetError();
   }

   public static int id_throw(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      return GL11.glGetInteger(var0);
   }

   public static void id_throw() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (id_strictfp.id_byte()) {
         id_boolean.id_class();
      } else {
         id_synchronized.id_class.id_break();
      }
   }

   public static void id_try(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glEnableVertexAttribArray(var0);
   }

   @Deprecated
   public static void id_try() {
      if (id_switch) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         id_else.id_class.id_break();
      }
   }

   public static void id_while() {
      id_case(2983, id_final);
      id_class(id_final);
      id_case(2982, id_final);
      id_class(id_final);
   }

   public static void id_while(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glEnableVertexAttribArray(var0);
   }

   public static void id_static() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_public.id_class.id_class();
   }

   @Deprecated
   public static void id_public(int var0) {
      if (!id_transient) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL11.glEnableClientState(var0);
      }
   }

   public static void id_public() {
      id_class(OE.S, 9216);
      id_class(OE.T, 9216);
      id_class(OE.R, 9216);
      id_class(OE.S, 9474, id_throws(1.0F, 0.0F, 0.0F, 0.0F));
      id_class(OE.T, 9474, id_throws(0.0F, 1.0F, 0.0F, 0.0F));
      id_class(OE.R, 9474, id_throws(0.0F, 0.0F, 1.0F, 0.0F));
      id_class(OE.S);
      id_class(OE.T);
      id_class(OE.R);
   }

   public static void id_protected(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glDeleteShader(var0);
   }

   public static void id_protected(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glAttachShader(var0, var1);
   }

   public static void id_protected(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform4iv(var0, var1);
   }

   public static void id_protected(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform3fv(var0, var1);
   }

   @Deprecated
   public static void id_protected() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (id_import.id_byte()) {
         id_short.id_break();
      } else {
         id_package.id_class.id_class();
      }
   }

   public static void id_protected(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      OO.INSTANCE.x = var0;
      OO.INSTANCE.y = var1;
      OO.INSTANCE.w = var2;
      OO.INSTANCE.h = var3;
      GL11.glViewport(var0, var1, var2, var3);
   }

   public static void id_protected(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_while.id_class.id_class || var0 != id_while.id_class.id_break || var0 != id_while.id_class.id_byte) {
         id_while.id_class.id_class = var0;
         id_while.id_class.id_break = var1;
         id_while.id_class.id_byte = var2;
         GL11.glStencilFunc(var0, var1, var2);
      }
   }

   public static void id_protected(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLineWidth(var0);
   }

   @Deprecated
   public static void id_protected(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != id_float.id_class || var1 != id_float.id_break || var2 != id_float.id_byte || var3 != id_float.id_protected) {
         id_float.id_class = var0;
         id_float.id_break = var1;
         id_float.id_byte = var2;
         id_float.id_protected = var3;
         GL11.glColor4f(var0, var1, var2, var3);
      }
   }

   public static void id_private(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 == 36160) {
         if (r == var1 && P == var1) {
            return;
         }

         r = var1;
         P = var1;
      } else if (var0 == 36008) {
         if (r == var1) {
            return;
         }

         r = var1;
      }

      if (var0 == 36009) {
         if (P == var1) {
            return;
         }

         P = var1;
      }

      switch (id_void) {
         case BASE:
            GL30.glBindFramebuffer(var0, var1);
            break;
         case ARB:
            ARBFramebufferObject.glBindFramebuffer(var0, var1);
            break;
         case EXT:
            EXTFramebufferObject.glBindFramebufferEXT(var0, var1);
      }
   }

   public static void id_private(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glDeleteProgram(var0);
   }

   @Deprecated
   public static void id_private() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_continue.id_class.id_break();
   }

   public static void id_abstract() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_return.id_class.id_class();
   }

   public static void id_final() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (id_default.id_byte()) {
         id_const.id_break();
      } else {
         id_super.id_class.id_class();
      }
   }

   public static void id_final(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glPixelStorei(var0, var1);
   }

   @Deprecated
   public static void id_final(int var0) {
      if (var0 != id_for) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL13.glClientActiveTexture(var0);
         id_for = var0;
      }
   }

   @Deprecated
   public static void id_transient() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushMatrix();
   }

   public static void id_volatile(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL13.glActiveTexture(var0);
   }

   public static void id_volatile() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      id_this.id_class.id_break();
   }

   public static void id_volatile(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPolygonMode(var0, var1);
   }

   public static void id_synchronized() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_class(8960, 8704, 8448);
      id_throws(8448, 5890, 34168, 34166);
   }

   public static void id_synchronized(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glClearStencil(var0);
   }

   public static void id_native() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      id_this.id_class.id_class();
   }

   @Deprecated
   public static void id_native(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glFogi(var0, var1);
   }

   public static int id_native(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (id_void) {
         case BASE:
            return GL30.glCheckFramebufferStatus(var0);
         case ARB:
            return ARBFramebufferObject.glCheckFramebufferStatus(var0);
         case EXT:
            return EXTFramebufferObject.glCheckFramebufferStatusEXT(var0);
         default:
            return -1;
      }
   }

   @Deprecated
   public static void id_strictfp() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      id_abstract.id_class();
   }

   public static boolean E() {
      return id_else.id_class.id_break;
   }

   public static void X() {
      id_transient = false;
   }
}
