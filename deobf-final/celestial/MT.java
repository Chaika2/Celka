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
   private static final FloatBuffer final_ = GLX.make(MemoryUtil.memAllocFloat(16), var0 -> gs_3.class_(MemoryUtil.memAddress(var0)));
   private static final Mw_1 package_ = new Mw_1();
   private static final Mf_1 int_ = new Mf_1(2896);
   private static final Mf_1[] new_ = IntStream.range(0, 8).mapToObj(var0 -> new Mf_1(16384 + var0)).toArray(Mf_1[]::new);
   private static final MR continue_ = new MR();
   private static final MI super_ = new MI();
   private static final Mo_1 this_ = new Mo_1();
   private static final MU else_ = new MU();
   private static final MY synchronized_ = new MY();
   private static final Mi_1 return_ = new Mi_1();
   private static final MV public_ = new MV();
   private static final Ob_1 goto_ = new Ob_1();
   private static final OS while_ = new OS();
   private static final Or_1 try_ = new Or_1();
   private static final FloatBuffer instanceof_ = Hb_1.byte_(4);
   private static int throw_;
   private static final OM[] interface_ = IntStream.range(0, 32).mapToObj(var0 -> new OM()).toArray(OM[]::new);
   private static int char_ = 7425;
   private static final Mf_1 abstract_ = new Mf_1(32826);
   private static final Mg_1 long_ = new Mg_1();
   private static final Mj_1 float_ = new Mj_1();
   private static Me_1 void_;
   private static Os_1 static_;
   private static rrWK import_ = new rrWK();
   private static rrxW_2 short_ = new rrxW_2();
   private static rrWK default_ = new rrWK();
   private static rrxz_3 const_ = new rrxz_3();
   private static rrWK strictfp_ = new rrWK();
   private static rrxQ_2 boolean_ = new rrxQ_2();
   private static boolean transient_ = false;
   private static int for_ = 0;
   private static boolean double_ = false;
   public static float class_ = 0.0F;
   public static float break_ = 0.0F;
   public static boolean byte_;
   public static boolean protected_;
   public static int throws_;
   public static int case_;
   public static int catch_;
   public static int private_;
   private static boolean switch_ = true;
   public static final int implements_ = 7;
   public static final int finally_ = 4;
   public static final int extends_ = 33984;
   public static final int native_ = 33985;
   public static final int volatile_ = 33986;
   private static int r;
   private static int P;
   private static final int[] B = new int[8];

   @Deprecated
   public static void boolean_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glLoadIdentity();
   }

   public static void char_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return_.class_.break_();
   }

   public static int byte_(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return GL11.glGetTexLevelParameteri(var0, var1, var2);
   }

   @Deprecated
   public static void byte_(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glRotatef(var0, var1, var2, var3);
   }

   @Deprecated
   public static void byte_(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTranslatef(var0, var1, var2);
   }

   public static void byte_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL14.glBlendEquation(var0);
   }

   @Deprecated
   public static void byte_(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != else_.throws_) {
         else_.throws_ = var0;
         GL11.glFogf(2916, var0);
      }
   }

   public static void byte_(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL14.glBlendFuncSeparate(var0, var1, var2, var3);
   }

   public static int byte_(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetAttribLocation(var0, var1);
   }

   public static void byte_(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix4fv(var0, var1, var2);
   }

   public static void byte_(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform3iv(var0, var1);
   }

   public static void byte_(boolean var0) {
      switch_ = var0;
   }

   @Deprecated
   public static void byte_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPopAttrib();
   }

   public static void byte_(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform2fv(var0, var1);
   }

   public static int byte_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetProgrami(var0, var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Deprecated
   private static OG byte_(OE var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      switch (var0) {
         case S:
            return goto_.class_;
         case T:
            return goto_.break_;
         case R:
            return goto_.byte_;
         case Q:
            return goto_.protected_;
         default:
            return goto_.class_;
      }
   }

   public static void byte_(rrxW_2 var0) {
      if (import_.byte_()) {
         short_.class_(var0);
      } else {
         package_.class_.class_(var0.byte_());
         class_(var0.protected_(), var0.throws_());
      }
   }

   @Deprecated
   public static void byte_(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glColorPointer(var0, var1, var2, var3);
   }

   public static void byte_(rrxz_3 var0) {
      if (default_.byte_()) {
         const_.class_(var0);
      } else {
         super_.class_.class_(var0.byte_());
         if (!var0.private_()) {
            break_(var0.protected_(), var0.throws_());
         } else {
            break_(var0.protected_(), var0.throws_(), var0.case_(), var0.catch_());
         }
      }
   }

   public static void byte_(rrxQ_2 var0) {
      if (strictfp_.byte_()) {
         boolean_.class_(var0);
      } else {
         synchronized_.class_.class_(var0.byte_());
         synchronized_.break_ = var0.protected_();
      }
   }

   public static void byte_(IntBuffer var0) {
      GL11.glCallLists(var0);
      if (rrbb_3.rs() && !double_) {
         int var1 = rrdZ.Sz.final_();
         if (var1 > 1) {
            for (int var2 = 1; var2 < var1; var2++) {
               rrdZ.PR.break_(var2);
               GL11.glCallLists(var0);
            }

            rrdZ.PR.break_(0);
         }
      }
   }

   private static void int_(int var0, int var1) {
      class_(8960, 34162, var0);
      class_(8960, 34184, var1);
      class_(8960, 34200, 770);
   }

   public static void int_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != public_.break_) {
         public_.break_ = var0;
         GL11.glLogicOp(var0);
      }
   }

   public static int int_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glCreateProgram();
   }

   public static void long_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return_.break_.break_();
   }

   public static void float_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return_.break_.class_();
   }

   @Deprecated
   public static void double_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      float_.class_ = -1.0F;
      float_.break_ = -1.0F;
      float_.byte_ = -1.0F;
      float_.protected_ = -1.0F;
   }

   public static void B() {
      GL11.glBindTexture(3553, interface_[throw_].break_);
   }

   public static int J() {
      return r;
   }

   public static int S() {
      return interface_[throw_].break_;
   }

   @Deprecated
   public static int this_() {
      return interface_[throw_].break_;
   }

   @Deprecated
   public static void this_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != char_) {
         char_ = var0;
         GL11.glShadeModel(var0);
      }
   }

   public static void b() {
      if (default_.break_()) {
         byte_(const_);
      }
   }

   public static int x() {
      return P;
   }

   public static void s() {
      if (rrbb_3.final_()) {
         int var0 = GL11.glGetInteger(34016);
         int var1 = GL11.glGetInteger(32873);
         int var2 = P();
         int var3 = S();
         if (var3 > 0 && (var0 != var2 || var1 != var3)) {
            rrbb_3.byte_("checkTexture: act: " + var2 + ", glAct: " + var0 + ", tex: " + var3 + ", glTex: " + var1);
         }
      }
   }

   public static void h() {
      transient_ = true;
   }

   public static void d() {
      if (super_.class_.break_) {
         GL11.glEnable(3042);
      } else {
         GL11.glDisable(3042);
      }

      GL14.glBlendFuncSeparate(super_.break_, super_.byte_, super_.protected_, super_.throws_);
   }

   public static void interface_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (strictfp_.byte_()) {
         boolean_.break_();
      } else {
         synchronized_.class_.class_();
      }
   }

   public static void interface_(int var0) {
      class_(var0, false);
   }

   public static void class_(rje_3 var0, rje_3 var1, rjV_2 var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      transient_();
      boolean_();
      class_(0);
      class_(1);
      rji_3 var3 = new rji_3(var0);
      var3.class_(var2);
      class_(16384, 4611, throws_(var3.class_(), var3.break_(), var3.byte_(), 0.0F));
      float var4 = 0.6F;
      class_(16384, 4609, throws_(0.6F, 0.6F, 0.6F, 1.0F));
      class_(16384, 4608, throws_(0.0F, 0.0F, 0.0F, 1.0F));
      class_(16384, 4610, throws_(0.0F, 0.0F, 0.0F, 1.0F));
      rji_3 var5 = new rji_3(var1);
      var5.class_(var2);
      class_(16385, 4611, throws_(var5.class_(), var5.break_(), var5.byte_(), 0.0F));
      class_(16385, 4609, throws_(0.6F, 0.6F, 0.6F, 1.0F));
      class_(16385, 4608, throws_(0.0F, 0.0F, 0.0F, 1.0F));
      class_(16385, 4610, throws_(0.0F, 0.0F, 0.0F, 1.0F));
      this_(7424);
      float var6 = 0.4F;
      class_(2899, throws_(0.4F, 0.4F, 0.4F, 1.0F));
      for_();
   }

   public static void class_(rje_3 var0, rje_3 var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      rjV_2 var2 = new rjV_2();
      var2.class_();
      var2.class_(rjV_2.throws_(1.0F, -1.0F, 1.0F));
      var2.break_(rje_3.protected_.byte_(-22.5F));
      var2.break_(rje_3.break_.byte_(135.0F));
      class_(var0, var1, var2);
   }

   public static void class_(int var0, int var1, long var2, long var4, long var6) {
      if (byte_) {
         GL31.glCopyBufferSubData(var0, var1, var2, var4, var6);
      } else {
         ARBCopyBuffer.glCopyBufferSubData(var0, var1, var2, var4, var6);
      }
   }

   public static void class_(boolean var0, boolean var1, boolean var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != long_.class_ || var1 != long_.break_ || var2 != long_.byte_ || var3 != long_.protected_) {
         long_.class_ = var0;
         long_.break_ = var1;
         long_.byte_ = var2;
         long_.protected_ = var3;
         GL11.glColorMask(var0, var1, var2, var3);
      }
   }

   public static void class_(int var0, long var1, ByteBuffer var3) {
      GL15.glBufferSubData(var0, var1, var3);
   }

   @Deprecated
   public static void class_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      new_[var0].break_();
   }

   @Deprecated
   public static void class_(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLightModelfv(var0, var1);
   }

   public static void class_(int var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClear(var0);
      if (var1) {
         switch_();
      }
   }

   @Deprecated
   public static void class_(double var0, double var2, double var4, double var6, double var8, double var10) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glOrtho(var0, var2, var4, var6, var8, var10);
   }

   public static void class_(rrxz_3 var0) {
      if (!default_.byte_()) {
         break_(const_);
         byte_(var0);
         default_.class_();
      }
   }

   public static void class_(double var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClearDepth(var0);
   }

   @Deprecated
   public static void class_(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glNormal3f(var0, var1, var2);
   }

   public static void class_(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL20.glScissor(var0, var1, var2, var3);
   }

   public static void class_(float var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != return_.byte_ || var1 != return_.protected_) {
         return_.byte_ = var0;
         return_.protected_ = var1;
         GL11.glPolygonOffset(var0, var1);
      }
   }

   public static void class_(int[] var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glGenTextures(var0);
   }

   public static void class_(int var0, IntBuffer var1, IntBuffer var2) {
      GL14.glMultiDrawArrays(var0, var1, var2);
      if (rrbb_3.rs() && !double_) {
         int var3 = rrdZ.Sz.final_();
         if (var3 > 1) {
            for (int var4 = 1; var4 < var3; var4++) {
               rrdZ.PR.break_(var4);
               GL14.glMultiDrawArrays(var0, var1, var2);
            }

            rrdZ.PR.break_(0);
         }
      }
   }

   @Deprecated
   public static void class_(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexEnvi(var0, var1, var2);
   }

   public static void class_(int var0, int var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexParameterf(var0, var1, var2);
   }

   @Deprecated
   public static void class_(OE var0, int var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexGenfv(byte_(var0).break_, var1, var2);
   }

   @Deprecated
   public static void class_(OE var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      OG var2 = byte_(var0);
      if (var1 != var2.byte_) {
         var2.byte_ = var1;
         GL11.glTexGeni(var2.break_, 9472, var1);
      }
   }

   public static void class_(boolean var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != this_.break_) {
         this_.break_ = var0;
         GL11.glDepthMask(var0);
      }
   }

   public static void class_(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, IntBuffer var8) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Deprecated
   public static void class_(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 < 0.0F) {
         var0 = 0.0F;
      }

      if (var0 != else_.byte_) {
         else_.byte_ = var0;
         GL11.glFogf(2914, var0);
         if (rrbb_3.rs()) {
            rrdZ.class_(var0);
         }
      }
   }

   public static void class_(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void class_(int var0, int var1, int var2, int var3, long var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glGetTexImage(var0, var1, var2, var3, var4);
   }

   public static void class_(rrxQ_2 var0) {
      if (!strictfp_.byte_()) {
         break_(boolean_);
         byte_(var0);
         strictfp_.class_();
      }
   }

   @Deprecated
   public static void class_(int var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (import_.byte_()) {
         short_.class_(var0, var1);
      } else if (var0 != package_.break_ || var1 != package_.byte_) {
         package_.break_ = var0;
         package_.byte_ = var1;
         GL11.glAlphaFunc(var0, var1);
      }
   }

   public static void class_(int var0, long var1, int var3) {
      GL15.glBufferData(var0, var1, var3);
   }

   @Deprecated
   public static void class_(int var0, float[] var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glFogfv(var0, var1);
   }

   @Deprecated
   public static void class_(int var0, int var1, long var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glNormalPointer(var0, var1, var2);
   }

   @Deprecated
   public static void class_(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexCoordPointer(var0, var1, var2, var3);
   }

   public static void class_(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix2fv(var0, var1, var2);
   }

   public static void class_(IntBuffer var0) {
      GL11.glGenTextures(var0);
   }

   @Deprecated
   public static void class_(rjV_2 var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.class_(final_);
      ((Buffer)final_).rewind();
      class_(final_);
   }

   @Deprecated
   public static void class_(FloatBuffer var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glMultMatrixf(var0);
   }

   public static void class_(int var0, ByteBuffer var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL15.glBufferData(var0, var1, var2);
   }

   public static void class_(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1iv(var0, var1);
   }

   public static void class_(rrxW_2 var0) {
      if (!import_.byte_()) {
         break_(short_);
         byte_(var0);
         import_.class_();
      }
   }

   public static String class_(GLCapabilities var0) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      rrbb_3.byte_();
      byte_ = var0.OpenGL31;
      if (byte_) {
         throws_ = 36662;
         case_ = 36663;
      } else {
         throws_ = 36662;
         case_ = 36663;
      }

      if (var0.OpenGL15) {
         catch_ = 34962;
         private_ = 35044;
      } else {
         catch_ = 34962;
         private_ = 35044;
      }

      boolean var1 = byte_ || var0.GL_ARB_copy_buffer;
      boolean var2 = var0.OpenGL14;
      protected_ = var1 && var2;
      if (!protected_) {
         ArrayList var3 = new ArrayList();
         if (!var1) {
            var3.add("OpenGL 1.3, ARB_copy_buffer");
         }

         if (!var2) {
            var3.add("OpenGL 1.4");
         }

         String var4 = "VboRegions not supported, missing: " + rrbb_3.class_(var3);
         rrbb_3.byte_(var4);
         var3.add(var4);
      }

      if (var0.OpenGL30) {
         static_ = Os_1.BASE;
      } else if (var0.GL_EXT_framebuffer_blit) {
         static_ = Os_1.EXT;
      } else {
         static_ = Os_1.NONE;
      }

      if (var0.OpenGL30) {
         void_ = Me_1.BASE;
         Vl_1.class_ = 36160;
         Vl_1.break_ = 36161;
         Vl_1.byte_ = 36064;
         Vl_1.protected_ = 36096;
         Vl_1.throws_ = 36053;
         Vl_1.case_ = 36054;
         Vl_1.catch_ = 36055;
         Vl_1.private_ = 36059;
         implements_ = 36060;
         return "OpenGL 3.0";
      } else if (var0.GL_ARB_framebuffer_object) {
         void_ = Me_1.ARB;
         Vl_1.class_ = 36160;
         Vl_1.break_ = 36161;
         Vl_1.byte_ = 36064;
         Vl_1.protected_ = 36096;
         Vl_1.throws_ = 36053;
         Vl_1.catch_ = 36055;
         Vl_1.case_ = 36054;
         Vl_1.private_ = 36059;
         implements_ = 36060;
         return "ARB_framebuffer_object extension";
      } else if (var0.GL_EXT_framebuffer_object) {
         void_ = Me_1.EXT;
         Vl_1.class_ = 36160;
         Vl_1.break_ = 36161;
         Vl_1.byte_ = 36064;
         Vl_1.protected_ = 36096;
         Vl_1.throws_ = 36053;
         Vl_1.catch_ = 36055;
         Vl_1.case_ = 36054;
         Vl_1.private_ = 36059;
         implements_ = 36060;
         return "EXT_framebuffer_object extension";
      } else {
         throw new IllegalStateException("Could not initialize framebuffer support.");
      }
   }

   public static void class_(float var0, float var1, float var2, float var3) {
      GL14.glBlendColor(var0, var1, var2, var3);
   }

   public static void class_(int var0, int var1, int var2, boolean var3, int var4, long var5) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glVertexAttribPointer(var0, var1, var2, var3, var4, var5);
   }

   public static void class_(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6) {
      if (var0 >= 0 && var0 < B.length) {
         if (B[var0] == var1) {
            return;
         }

         B[var0] = var1;
      }

      GL42.glBindImageTexture(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void class_(int var0, int var1, int var2, int var3, int var4, int var5, long var6) {
      GL11.glReadPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void class_(int var0, int var1, int var2, int var3, int var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (void_) {
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
   public static void class_(double var0, double var2, double var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glScaled(var0, var2, var4);
   }

   public static void class_(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glShaderSource(var0, var1);
   }

   @Deprecated
   public static void class_(int var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL13.glMultiTexCoord2f(var0, var1, var2);
      if (var0 == 33986) {
         class_ = var1;
         break_ = var2;
      }
   }

   @Deprecated
   public static void class_(OE var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      byte_(var0).class_.break_();
   }

   @Deprecated
   public static void class_(int var0, int var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLightfv(var0, var1, var2);
   }

   public static void class_(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glReadPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void class_(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL20.glCopyTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @Deprecated
   public static void class_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushAttrib(8256);
   }

   public static void class_(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (static_) {
         case BASE:
            GL30.glBlitFramebuffer(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
            break;
         case EXT:
            EXTFramebufferBlit.glBlitFramebufferEXT(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
         case NONE:
      }
   }

   @Deprecated
   public static void class_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != continue_.break_ || var1 != continue_.byte_) {
         continue_.break_ = var0;
         continue_.byte_ = var1;
         GL11.glColorMaterial(var0, var1);
      }
   }

   public static void class_(rrxz_3[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            rrxz_3 var2 = var0[var1];
            if (var2 != null) {
               if (var2.byte_()) {
                  GL30.glEnablei(3042, var1);
               } else {
                  GL30.glDisablei(3042, var1);
               }

               ARBDrawBuffersBlend.glBlendFuncSeparateiARB(var1, var2.protected_(), var2.throws_(), var2.case_(), var2.catch_());
            }
         }
      }
   }

   public static int default_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      return GL11.glGenTextures();
   }

   public static void short_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      interface_[throw_].class_.class_();
   }

   public static void void_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      public_.class_.break_();
   }

   public static boolean r() {
      return static_ != Os_1.NONE;
   }

   public static void break_(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClearColor(var0, var1, var2, var3);
   }

   @Deprecated
   public static void break_(double var0, double var2, double var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTranslated(var0, var2, var4);
   }

   public static void break_(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexParameteri(var0, var1, var2);
   }

   @Deprecated
   public static void break_(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glVertexPointer(var0, var1, var2, var3);
   }

   @Deprecated
   public static void break_(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glScalef(var0, var1, var2);
   }

   public static void break_(IntBuffer var0) {
      ((Buffer)var0).rewind();

      while (var0.position() < var0.limit()) {
         int var1 = var0.get();
         continue_(var1);
      }

      ((Buffer)var0).rewind();
   }

   public static void break_(int[] var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);

      for (OM var4 : interface_) {
         for (int var8 : var0) {
            if (var4.break_ == var8) {
               var4.break_ = -1;
            }
         }
      }

      GL11.glDeleteTextures(var0);
   }

   public static void break_(boolean var0) {
      else_.class_.class_(var0);
   }

   public static void break_(rrxW_2 var0) {
      if (import_.byte_()) {
         var0.class_(short_);
      } else {
         var0.class_(package_.class_.break_, package_.break_, package_.byte_);
      }
   }

   public static void break_(rrxz_3 var0) {
      if (default_.byte_()) {
         var0.class_(const_);
      } else {
         var0.class_(super_.class_.break_, super_.break_, super_.byte_, super_.protected_, super_.throws_);
      }
   }

   public static void break_(int var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPixelTransferf(var0, var1);
   }

   @Deprecated
   public static void break_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushAttrib(270336);
   }

   @Deprecated
   public static void break_(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != else_.protected_) {
         else_.protected_ = var0;
         GL11.glFogf(2915, var0);
      }
   }

   public static void break_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != this_.byte_) {
         this_.byte_ = var0;
         GL11.glDepthFunc(var0);
      }
   }

   public static void break_(rje_3 var0, rje_3 var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      rjV_2 var2 = new rjV_2();
      var2.class_();
      var2.break_(rje_3.protected_.byte_(62.0F));
      var2.break_(rje_3.break_.byte_(185.5F));
      var2.class_(rjV_2.throws_(1.0F, -1.0F, 1.0F));
      var2.break_(rje_3.protected_.byte_(-22.5F));
      var2.break_(rje_3.break_.byte_(135.0F));
      class_(var0, var1, var2);
   }

   public static void break_(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1fv(var0, var1);
   }

   public static int break_(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetUniformLocation(var0, var1);
   }

   public static void break_(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform2iv(var0, var1);
   }

   public static void break_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (default_.byte_()) {
         const_.class_(var0, var1);
      } else if (var0 != super_.break_ || var1 != super_.byte_ || var0 != super_.protected_ || var1 != super_.throws_) {
         super_.break_ = var0;
         super_.byte_ = var1;
         super_.protected_ = var0;
         super_.throws_ = var1;
         if (rrbb_3.rs()) {
            rrdZ.Pg.class_(var0, var1, var0, var1);
         }

         GL11.glBlendFunc(var0, var1);
      }
   }

   @Deprecated
   public static void break_(OE var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      byte_(var0).class_.class_();
   }

   public static void break_(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix3fv(var0, var1, var2);
   }

   public static void break_(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (default_.byte_()) {
         const_.class_(var0, var1, var2, var3);
      } else if (var0 != super_.break_ || var1 != super_.byte_ || var2 != super_.protected_ || var3 != super_.throws_) {
         super_.break_ = var0;
         super_.byte_ = var1;
         super_.protected_ = var2;
         super_.throws_ = var3;
         if (rrbb_3.rs()) {
            rrdZ.Pg.class_(var0, var1, var2, var3);
         }

         byte_(var0, var1, var2, var3);
      }
   }

   public static void break_(rrxQ_2 var0) {
      if (strictfp_.byte_()) {
         var0.class_(boolean_);
      } else {
         var0.class_(synchronized_.class_.break_, synchronized_.break_);
      }
   }

   private static FloatBuffer throws_(float var0, float var1, float var2, float var3) {
      ((Buffer)instanceof_).clear();
      instanceof_.put(var0).put(var1).put(var2).put(var3);
      ((Buffer)instanceof_).flip();
      return instanceof_;
   }

   private static void throws_(int var0, int var1, int var2, int var3) {
      class_(8960, 34161, var0);
      class_(8960, 34176, var1);
      class_(8960, 34192, 768);
      class_(8960, 34177, var2);
      class_(8960, 34193, 768);
      class_(8960, 34178, var3);
      class_(8960, 34194, 770);
   }

   @Deprecated
   public static void throws_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (import_.byte_()) {
         short_.class_();
      } else {
         package_.class_.break_();
      }
   }

   public static void throws_(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != while_.byte_ || var1 != while_.protected_ || var2 != while_.throws_) {
         while_.byte_ = var0;
         while_.protected_ = var1;
         while_.throws_ = var2;
         GL11.glStencilOp(var0, var1, var2);
      }
   }

   public static void throws_(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform4fv(var0, var1);
   }

   public static int throws_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetShaderi(var0, var1);
   }

   public static int throws_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glCreateShader(var0);
   }

   public static void M() {
      if (strictfp_.break_()) {
         byte_(boolean_);
      }
   }

   public static int P() {
      return 33984 + throw_;
   }

   public static String finally_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetProgramInfoLog(var0, var1);
   }

   public static void finally_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      try_.class_.class_();
   }

   public static void finally_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL15.glDeleteBuffers(var0);
   }

   public static void catch_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUseProgram(var0);
   }

   public static void catch_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL15.glBindBuffer(var0, var1);
   }

   @Deprecated
   public static void catch_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      int_.class_();
   }

   public static void G() {
      if (import_.break_()) {
         byte_(short_);
      }
   }

   public static boolean O() {
      return switch_;
   }

   public static void extends_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      try_.class_.break_();
   }

   public static void extends_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (void_) {
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

   public static void extends_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      new_(33985);
      import_();
      return_(5890);
      boolean_();
      float var2 = 1.0F / (float)(var1 - 1);
      break_(var2, var2, var2);
      return_(5888);
      super_(var0);
      break_(3553, 10241, 9728);
      break_(3553, 10240, 9728);
      break_(3553, 10242, 10496);
      break_(3553, 10243, 10496);
      class_(8960, 8704, 34160);
      throws_(34165, 34168, 5890, 5890);
      int_(7681, 34168);
      new_(33984);
   }

   @Deprecated
   public static void goto_(int var0) {
      if (!transient_) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL11.glDisableClientState(var0);
      }
   }

   public static void goto_() {
      break_(OE.S);
      break_(OE.T);
      break_(OE.R);
   }

   public static void case_(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glDrawArrays(var0, var1, var2);
      if (rrbb_3.rs() && !double_) {
         int var3 = rrdZ.Sz.final_();
         if (var3 > 1) {
            for (int var4 = 1; var4 < var3; var4++) {
               rrdZ.PR.break_(var4);
               GL11.glDrawArrays(var0, var1, var2);
            }

            rrdZ.PR.break_(0);
         }
      }
   }

   public static void case_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glCompileShader(var0);
   }

   public static void case_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1i(var0, var1);
   }

   @Deprecated
   public static void case_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      int_.break_();
   }

   @Deprecated
   public static void case_(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glGetFloatv(var0, var1);
   }

   @Deprecated
   public static void const_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      abstract_.break_();
   }

   public static void continue_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != 0) {
         for (int var1 = 0; var1 < B.length; var1++) {
            if (B[var1] == var0) {
               B[var1] = 0;
            }
         }

         GL11.glDeleteTextures(var0);

         for (OM var4 : interface_) {
            if (var4.break_ == var0) {
               var4.break_ = 0;
            }
         }
      }
   }

   public static int continue_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (void_) {
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

   public static void else_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != while_.break_) {
         while_.break_ = var0;
         GL11.glStencilMask(var0);
      }
   }

   public static void else_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      class_(8960, 8704, 34160);
      package_(7681, 34168);
   }

   @Deprecated
   public static void for_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPopMatrix();
   }

   @Deprecated
   public static void implements_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      continue_.class_.class_();
   }

   public static void implements_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glLinkProgram(var0);
   }

   public static String implements_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetShaderInfoLog(var0, var1);
   }

   public static void import_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      interface_[throw_].class_.break_();
   }

   @Deprecated
   public static void instanceof_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      else_.class_.class_();
   }

   public static String instanceof_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL11.glGetString(var0);
   }

   public static void new_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (throw_ != var0 - 33984) {
         throw_ = var0 - 33984;
         volatile_(var0);
      }
   }

   public static int new_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      return GL15.glGenBuffers();
   }

   public static void package_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (default_.byte_()) {
         const_.class_();
      } else {
         super_.class_.break_();
      }
   }

   private static void package_(int var0, int var1) {
      class_(8960, 34161, var0);
      class_(8960, 34176, var1);
      class_(8960, 34192, 768);
   }

   @Deprecated
   public static void package_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != else_.break_) {
         else_.break_ = var0;
         native_(2917, var0);
         if (rrbb_3.rs()) {
            rrdZ.protected_(var0);
         }
      }
   }

   public static void return_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      new_(33985);
      short_();
      new_(33984);
   }

   @Deprecated
   public static void return_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glMatrixMode(var0);
   }

   public static void super_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != interface_[throw_].break_) {
         interface_[throw_].break_ = var0;
         GL11.glBindTexture(3553, var0);
         if (rrMh_1.class_()) {
            rrMh_1.class_(var0);
         }
      }
   }

   public static int super_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (void_) {
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

   public static int switch_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL11.glGetError();
   }

   public static int throw_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      return GL11.glGetInteger(var0);
   }

   public static void throw_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (strictfp_.byte_()) {
         boolean_.class_();
      } else {
         synchronized_.class_.break_();
      }
   }

   public static void try_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glEnableVertexAttribArray(var0);
   }

   @Deprecated
   public static void try_() {
      if (switch_) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         else_.class_.break_();
      }
   }

   public static void while_() {
      case_(2983, final_);
      class_(final_);
      case_(2982, final_);
      class_(final_);
   }

   public static void while_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glEnableVertexAttribArray(var0);
   }

   public static void static_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      public_.class_.class_();
   }

   @Deprecated
   public static void public_(int var0) {
      if (!transient_) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL11.glEnableClientState(var0);
      }
   }

   public static void public_() {
      class_(OE.S, 9216);
      class_(OE.T, 9216);
      class_(OE.R, 9216);
      class_(OE.S, 9474, throws_(1.0F, 0.0F, 0.0F, 0.0F));
      class_(OE.T, 9474, throws_(0.0F, 1.0F, 0.0F, 0.0F));
      class_(OE.R, 9474, throws_(0.0F, 0.0F, 1.0F, 0.0F));
      class_(OE.S);
      class_(OE.T);
      class_(OE.R);
   }

   public static void protected_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glDeleteShader(var0);
   }

   public static void protected_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glAttachShader(var0, var1);
   }

   public static void protected_(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform4iv(var0, var1);
   }

   public static void protected_(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform3fv(var0, var1);
   }

   @Deprecated
   public static void protected_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (import_.byte_()) {
         short_.break_();
      } else {
         package_.class_.class_();
      }
   }

   public static void protected_(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      OO.INSTANCE.x = var0;
      OO.INSTANCE.y = var1;
      OO.INSTANCE.w = var2;
      OO.INSTANCE.h = var3;
      GL11.glViewport(var0, var1, var2, var3);
   }

   public static void protected_(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != while_.class_.class_ || var0 != while_.class_.break_ || var0 != while_.class_.byte_) {
         while_.class_.class_ = var0;
         while_.class_.break_ = var1;
         while_.class_.byte_ = var2;
         GL11.glStencilFunc(var0, var1, var2);
      }
   }

   public static void protected_(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLineWidth(var0);
   }

   @Deprecated
   public static void protected_(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != float_.class_ || var1 != float_.break_ || var2 != float_.byte_ || var3 != float_.protected_) {
         float_.class_ = var0;
         float_.break_ = var1;
         float_.byte_ = var2;
         float_.protected_ = var3;
         GL11.glColor4f(var0, var1, var2, var3);
      }
   }

   public static void private_(int var0, int var1) {
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

      switch (void_) {
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

   public static void private_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glDeleteProgram(var0);
   }

   @Deprecated
   public static void private_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      continue_.class_.break_();
   }

   public static void abstract_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return_.class_.class_();
   }

   public static void final_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (default_.byte_()) {
         const_.break_();
      } else {
         super_.class_.class_();
      }
   }

   public static void final_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glPixelStorei(var0, var1);
   }

   @Deprecated
   public static void final_(int var0) {
      if (var0 != for_) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL13.glClientActiveTexture(var0);
         for_ = var0;
      }
   }

   @Deprecated
   public static void transient_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushMatrix();
   }

   public static void volatile_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL13.glActiveTexture(var0);
   }

   public static void volatile_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this_.class_.break_();
   }

   public static void volatile_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPolygonMode(var0, var1);
   }

   public static void synchronized_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      class_(8960, 8704, 8448);
      throws_(8448, 5890, 34168, 34166);
   }

   public static void synchronized_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glClearStencil(var0);
   }

   public static void native_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this_.class_.class_();
   }

   @Deprecated
   public static void native_(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glFogi(var0, var1);
   }

   public static int native_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (void_) {
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
   public static void strictfp_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      abstract_.class_();
   }

   public static boolean E() {
      return else_.class_.break_;
   }

   public static void X() {
      transient_ = false;
   }
}
