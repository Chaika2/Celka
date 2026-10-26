package com.mojang.blaze3d.systems;

import celestial.MD;
import celestial.MK;
import celestial.MT;
import celestial.Ma_1;
import celestial.OJ;
import celestial.OP;
import celestial.QY;
import celestial.Qw_1;
import celestial.VW;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.yb_3;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.platform.GLX;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;

public class RenderSystem {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final ConcurrentLinkedQueue<OJ> recordingQueue = Queues.newConcurrentLinkedQueue();
   private static final yb_3 RENDER_THREAD_TESSELATOR = new yb_3();
   public static final float DEFAULTALPHACUTOFF = 0.1F;
   private static final int MINIMUM_ATLAS_TEXTURE_SIZE = 1024;
   private static boolean isReplayingQueue;
   private static Thread gameThread;
   private static Thread renderThread;
   private static int MAX_SUPPORTED_TEXTURE_SIZE = -1;
   private static boolean isInInit;
   private static double lastDrawTime = Double.MIN_VALUE;

   public static void clear(int var0, boolean var1) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_class(var0, var1);
   }

   public static void getString(int var0, Consumer<String> var1) {
      assertThread(RenderSystem::isOnGameThread);
      var1.accept(MT.id_instanceof(var0));
   }

   public static void initRenderThread() {
      if (renderThread == null && gameThread != Thread.currentThread()) {
         renderThread = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize render thread");
      }
   }

   public static void initGameThread(boolean var0) {
      boolean var1 = renderThread == Thread.currentThread();
      if (gameThread == null && renderThread != null && var1 != var0) {
         gameThread = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize tick thread");
      }
   }

   public static void beginInitialization() {
      isInInit = true;
   }

   public static void finishInitialization() {
      isInInit = false;
      if (!recordingQueue.isEmpty()) {
         replayQueue();
      }

      if (!recordingQueue.isEmpty()) {
         throw new IllegalStateException("Recorded to render queue during initialization");
      }
   }

   @Deprecated
   public static void disableRescaleNormal() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_strictfp();
   }

   @Deprecated
   public static void enableRescaleNormal() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_const();
   }

   public static String getBackendDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return String.format("LWJGL version %s", GLX._getLWJGLVersion());
   }

   @Deprecated
   public static void fogMode(MD var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_package(var0.param);
   }

   @Deprecated
   public static void fogMode(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_package(var0);
   }

   @Deprecated
   public static void ortho(double var0, double var2, double var4, double var6, double var8, double var10) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void fogDensity(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0);
   }

   @Deprecated
   public static void runAsFancy(Runnable var0) {
      boolean var1 = QY.d();
      if (!var1) {
         var0.run();
      } else {
         Qw_1 var2 = (Qw_1)QY.id_instanceof().id_class[20];
         VW var3 = var2.id_case;
         var2.id_case = VW.FANCY;
         var0.run();
         var2.id_case = var3;
      }
   }

   public static void flipFrame(long var0) {
      GLFW.glfwPollEvents();
      replayQueue();
      yb_3.id_class().id_byte().id_native();
      GLFW.glfwSwapBuffers(var0);
      GLFW.glfwPollEvents();
   }

   @Deprecated
   public static void fogEnd(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_byte(var0);
   }

   public static void blendColor(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1, var2, var3);
   }

   @Deprecated
   public static void fogStart(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0);
   }

   @Deprecated
   public static void fogi(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_native(var0, var1);
   }

   public static void logicOp(Ma_1 var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_int(var0.opcode);
   }

   public static void stencilOp(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_throws(var0, var1, var2);
   }

   @Deprecated
   public static void alphaFunc(int var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1);
   }

   public static void clearDepth(double var0) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_class(var0);
   }

   public static void depthFunc(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0);
   }

   public static void clearColor(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_break(var0, var1, var2, var3);
   }

   @Deprecated
   public static void scaled(double var0, double var2, double var4) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var2, var4);
   }

   public static void drawArrays(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_case(var0, var1, var2);
   }

   public static void pixelStore(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_final(var0, var1);
   }

   public static void readPixels(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void glUniform1(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0, var1);
   }

   public static void glUniform1(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1);
   }

   public static void glUniform2(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_byte(var0, var1);
   }

   public static void glUniform2(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0, var1);
   }

   public static void glUniform3(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_byte(var0, var1);
   }

   public static void glUniform3(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_protected(var0, var1);
   }

   public static void glUniform4(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_throws(var0, var1);
   }

   public static void glUniform4(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_protected(var0, var1);
   }

   @Deprecated
   public static void color4f(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_protected(var0, var1, var2, var3);
   }

   @Deprecated
   public static void shadeModel(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_this(var0);
   }

   public static void blendFunc(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0, var1);
   }

   public static void blendFunc(OP var0, MK var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0.param, var1.param);
   }

   public static void enableTexture() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_import();
   }

   public static void disableTexture() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_short();
   }

   public static void enableBlend() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_package();
   }

   public static void defaultBlendFunc() {
      blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
   }

   public static void disableBlend() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_final();
   }

   public static void enableDepthTest() {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_volatile();
   }

   public static void enableScissor(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_extends();
      MT.id_class(var0, var1, var2, var3);
   }

   @Deprecated
   public static void enableAlphaTest() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_throws();
   }

   @Deprecated
   public static void disableAlphaTest() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_protected();
   }

   public static void disableScissor() {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_finally();
   }

   public static void blendFuncSeparate(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0, var1, var2, var3);
   }

   public static void blendFuncSeparate(OP var0, MK var1, OP var2, MK var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0.param, var1.param, var2.param, var3.param);
   }

   public static void enableCull() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_throw();
   }

   @Deprecated
   public static void popMatrix() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_for();
   }

   @Deprecated
   public static void color3f(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_protected(var0, var1, var2, 1.0F);
   }

   @Deprecated
   public static void disableFog() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_instanceof();
   }

   public static void depthMask(boolean var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0);
   }

   public static void viewport(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_protected(var0, var1, var2, var3);
   }

   @Deprecated
   public static void pushMatrix() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_transient();
   }

   public static void lineWidth(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_protected(var0);
   }

   @Deprecated
   public static void translated(double var0, double var2, double var4) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0, var2, var4);
   }

   @Deprecated
   public static void translatef(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_byte(var0, var1, var2);
   }

   @Deprecated
   public static void normal3f(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1, var2);
   }

   @Deprecated
   public static void enableFog() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_try();
   }

   @Deprecated
   public static void multMatrix(rjV_2 var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0);
   }

   @Deprecated
   public static void rotatef(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_byte(var0, var1, var2, var3);
   }

   @Deprecated
   public static void scalef(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0, var1, var2);
   }

   public static void colorMask(boolean var0, boolean var1, boolean var2, boolean var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1, var2, var3);
   }

   @Deprecated
   public static void fog(int var0, float var1, float var2, float var3, float var4) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, new float[]{var1, var2, var3, var4});
   }

   @Deprecated
   public static void matrixMode(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_return(var0);
   }

   public static boolean isOnRenderThreadOrInit() {
      return isInInit || isOnRenderThread();
   }

   @Deprecated
   public static void enableColorMaterial() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_private();
   }

   @Deprecated
   public static void disableColorMaterial() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_implements();
   }

   @Deprecated
   public static void pushLightingAttributes() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class();
   }

   public static boolean isOnGameThreadOrInit() {
      return isInInit || isOnGameThread();
   }

   @Deprecated
   public static void pushTextureAttributes() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break();
   }

   public static void enableSmoothShadeModel() {
      shadeModel(7425);
   }

   public static void setupGui3DDiffuseLighting(rje_3 var0, rje_3 var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0, var1);
   }

   public static void setupEndPortalTexGen() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_public();
   }

   public static yb_3 renderThreadTesselator() {
      assertThread(RenderSystem::isOnRenderThread);
      return RENDER_THREAD_TESSELATOR;
   }

   public static void mulTextureByProjModelView() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_while();
   }

   public static void teardownOverlayColor() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_return();
   }

   public static int maxSupportedTextureSize() {
      assertThread(RenderSystem::isInInitPhase);
      if (MAX_SUPPORTED_TEXTURE_SIZE == -1) {
         int var0 = MT.id_throw(3379);

         for (int var1 = Math.max(32768, var0); var1 >= 1024; var1 >>= 1) {
            MT.id_class(32868, 0, 6408, var1, var1, 0, 6408, 5121, (IntBuffer)null);
            int var2 = MT.id_byte(32868, 0, 4096);
            if (var2 != 0) {
               MAX_SUPPORTED_TEXTURE_SIZE = var1;
               return var1;
            }
         }

         MAX_SUPPORTED_TEXTURE_SIZE = Math.max(var0, 1024);
         LOGGER.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", MAX_SUPPORTED_TEXTURE_SIZE);
      }

      return MAX_SUPPORTED_TEXTURE_SIZE;
   }

   public static void disableColorLogicOp() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_static();
   }

   public static void disableSmoothShadeModel() {
      shadeModel(7424);
   }

   public static void setupLevelDiffuseLighting(rje_3 var0, rje_3 var1, rjV_2 var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1, var2);
   }

   public static void disablePolygonOffset() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_abstract();
   }

   public static void enablePolygonOffset() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_char();
   }

   public static void disableCull() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_interface();
   }

   public static void texParameter(int var0, int var1, int var2) {
      MT.id_break(var0, var1, var2);
   }

   public static void bindTexture(int var0) {
      MT.id_super(var0);
   }

   public static void defaultAlphaFunc() {
      alphaFunc(516, 0.1F);
   }

   @Deprecated
   public static void loadIdentity() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_boolean();
   }

   @Deprecated
   public static void clearCurrentColor() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_double();
   }

   public static void polygonOffset(float var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1);
   }

   public static void teardownOutline() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_synchronized();
   }

   public static void setupOutline() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_else();
   }

   @Deprecated
   public static void glMultiTexCoord2f(int var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1, var2);
   }

   public static void disableDepthTest() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_native();
   }

   public static void initRenderer(int var0, boolean var1) {
      assertThread(RenderSystem::isInInitPhase);
      GLX._init(var0, var1);
   }

   public static String getCapsString() {
      assertThread(RenderSystem::isOnGameThread);
      return GLX._getCapsString();
   }

   public static String getApiDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return GLX.getOpenGLVersionString();
   }

   public static LongSupplier initBackendSystem() {
      assertThread(RenderSystem::isInInitPhase);
      return GLX._initGlfw();
   }

   public static void limitDisplayFPS(int var0) {
      double var1 = lastDrawTime + 1.0 / (double)var0;

      double var3;
      for (var3 = GLFW.glfwGetTime(); var3 < var1; var3 = GLFW.glfwGetTime()) {
         GLFW.glfwWaitEventsTimeout(var1 - var3);
      }

      lastDrawTime = var3;
   }

   public static void setErrorCallback(GLFWErrorCallbackI var0) {
      assertThread(RenderSystem::isInInitPhase);
      GLX._setGlfwErrorCallback(var0);
   }

   public static void setupDefaultState(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isInInitPhase);
      MT.id_import();
      MT.id_this(7425);
      MT.id_class(1.0);
      MT.id_volatile();
      MT.id_break(515);
      MT.id_throws();
      MT.id_class(516, 0.1F);
      MT.id_return(5889);
      MT.id_boolean();
      MT.id_return(5888);
      MT.id_protected(var0, var1, var2, var3);
   }

   public static void setupGuiFlatDiffuseLighting(rje_3 var0, rje_3 var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1);
   }

   public static boolean isOnGameThread() {
      return true;
   }

   public static void assertThread(Supplier<Boolean> var0) {
      if (!(Boolean)var0.get()) {
         throw new IllegalStateException("Rendersystem called from wrong thread");
      }
   }

   @Deprecated
   public static void colorMaterial(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1);
   }

   public static void blendEquation(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_byte(var0);
   }

   public static boolean isOnRenderThread() {
      return Thread.currentThread() == renderThread;
   }

   public static boolean isInInitPhase() {
      return true;
   }

   public static void recordRenderCall(OJ var0) {
      recordingQueue.add(var0);
   }

   public static void replayQueue() {
      isReplayingQueue = true;

      while (!recordingQueue.isEmpty()) {
         OJ var0 = recordingQueue.poll();
         var0.execute();
      }

      isReplayingQueue = false;
   }

   @Deprecated
   public static void popAttributes() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_byte();
   }

   @Deprecated
   public static void enableLighting() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_case();
   }

   @Deprecated
   public static void disableLighting() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_catch();
   }

   public static void stencilFunc(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_protected(var0, var1, var2);
   }

   public static void renderCrosshair(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GLX._renderCrosshair(var0, true, true, true);
   }

   public static void clearTexGen() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_goto();
   }

   public static void enableLineOffset() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_long();
   }

   public static void deleteTexture(int var0) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.id_continue(var0);
   }

   public static void clearStencil(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_synchronized(var0);
   }

   public static void stencilMask(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_else(var0);
   }

   public static void glUniformMatrix4(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_byte(var0, var1, var2);
   }

   public static void glUniformMatrix2(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_class(var0, var1, var2);
   }

   public static void disableLineOffset() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_float();
   }

   public static void activeTexture(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_new(var0);
   }

   public static void glUniformMatrix3(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_break(var0, var1, var2);
   }

   public static void setupNvFogDistance() {
      assertThread(RenderSystem::isOnGameThread);
      GLX._setupNvFogDistance();
   }

   public static void glBindBuffer(int var0, Supplier<Integer> var1) {
      MT.id_catch(var0, (Integer)var1.get());
   }

   public static void setupOverlayColor(IntSupplier var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_extends(var0.getAsInt(), var1);
   }

   public static void enableColorLogicOp() {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_void();
   }

   public static void pixelTransfer(int var0, float var1) {
      MT.id_break(var0, var1);
   }

   public static void glDeleteBuffers(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_finally(var0);
   }

   public static void glBufferData(int var0, ByteBuffer var1, int var2) {
      assertThread(RenderSystem::isOnRenderThreadOrInit);
      MT.id_class(var0, var1, var2);
   }

   public static void glUniform1i(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_case(var0, var1);
   }

   public static void glGenBuffers(Consumer<Integer> var0) {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> var0.accept(MT.id_new()));
      } else {
         var0.accept(MT.id_new());
      }
   }

   public static void polygonMode(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.id_volatile(var0, var1);
   }
}
