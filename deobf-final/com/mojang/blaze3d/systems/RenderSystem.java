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
      MT.class_(var0, var1);
   }

   public static void getString(int var0, Consumer<String> var1) {
      assertThread(RenderSystem::isOnGameThread);
      var1.accept(MT.instanceof_(var0));
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
      MT.strictfp_();
   }

   @Deprecated
   public static void enableRescaleNormal() {
      assertThread(RenderSystem::isOnGameThread);
      MT.const_();
   }

   public static String getBackendDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return String.format("LWJGL version %s", GLX._getLWJGLVersion());
   }

   @Deprecated
   public static void fogMode(MD var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.package_(var0.param);
   }

   @Deprecated
   public static void fogMode(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.package_(var0);
   }

   @Deprecated
   public static void ortho(double var0, double var2, double var4, double var6, double var8, double var10) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void fogDensity(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0);
   }

   @Deprecated
   public static void runAsFancy(Runnable var0) {
      boolean var1 = QY.d();
      if (!var1) {
         var0.run();
      } else {
         Qw_1 var2 = (Qw_1)QY.instanceof_().class_[20];
         VW var3 = var2.case_;
         var2.case_ = VW.FANCY;
         var0.run();
         var2.case_ = var3;
      }
   }

   public static void flipFrame(long var0) {
      GLFW.glfwPollEvents();
      replayQueue();
      yb_3.class_().byte_().native_();
      GLFW.glfwSwapBuffers(var0);
      GLFW.glfwPollEvents();
   }

   @Deprecated
   public static void fogEnd(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.byte_(var0);
   }

   public static void blendColor(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1, var2, var3);
   }

   @Deprecated
   public static void fogStart(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0);
   }

   @Deprecated
   public static void fogi(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.native_(var0, var1);
   }

   public static void logicOp(Ma_1 var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.int_(var0.opcode);
   }

   public static void stencilOp(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.throws_(var0, var1, var2);
   }

   @Deprecated
   public static void alphaFunc(int var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1);
   }

   public static void clearDepth(double var0) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.class_(var0);
   }

   public static void depthFunc(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0);
   }

   public static void clearColor(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.break_(var0, var1, var2, var3);
   }

   @Deprecated
   public static void scaled(double var0, double var2, double var4) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var2, var4);
   }

   public static void drawArrays(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.case_(var0, var1, var2);
   }

   public static void pixelStore(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.final_(var0, var1);
   }

   public static void readPixels(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void glUniform1(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0, var1);
   }

   public static void glUniform1(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1);
   }

   public static void glUniform2(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.byte_(var0, var1);
   }

   public static void glUniform2(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0, var1);
   }

   public static void glUniform3(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.byte_(var0, var1);
   }

   public static void glUniform3(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.protected_(var0, var1);
   }

   public static void glUniform4(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.throws_(var0, var1);
   }

   public static void glUniform4(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.protected_(var0, var1);
   }

   @Deprecated
   public static void color4f(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.protected_(var0, var1, var2, var3);
   }

   @Deprecated
   public static void shadeModel(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.this_(var0);
   }

   public static void blendFunc(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0, var1);
   }

   public static void blendFunc(OP var0, MK var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0.param, var1.param);
   }

   public static void enableTexture() {
      assertThread(RenderSystem::isOnGameThread);
      MT.import_();
   }

   public static void disableTexture() {
      assertThread(RenderSystem::isOnGameThread);
      MT.short_();
   }

   public static void enableBlend() {
      assertThread(RenderSystem::isOnGameThread);
      MT.package_();
   }

   public static void defaultBlendFunc() {
      blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
   }

   public static void disableBlend() {
      assertThread(RenderSystem::isOnGameThread);
      MT.final_();
   }

   public static void enableDepthTest() {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.volatile_();
   }

   public static void enableScissor(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.extends_();
      MT.class_(var0, var1, var2, var3);
   }

   @Deprecated
   public static void enableAlphaTest() {
      assertThread(RenderSystem::isOnGameThread);
      MT.throws_();
   }

   @Deprecated
   public static void disableAlphaTest() {
      assertThread(RenderSystem::isOnGameThread);
      MT.protected_();
   }

   public static void disableScissor() {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.finally_();
   }

   public static void blendFuncSeparate(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0, var1, var2, var3);
   }

   public static void blendFuncSeparate(OP var0, MK var1, OP var2, MK var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0.param, var1.param, var2.param, var3.param);
   }

   public static void enableCull() {
      assertThread(RenderSystem::isOnGameThread);
      MT.throw_();
   }

   @Deprecated
   public static void popMatrix() {
      assertThread(RenderSystem::isOnGameThread);
      MT.for_();
   }

   @Deprecated
   public static void color3f(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.protected_(var0, var1, var2, 1.0F);
   }

   @Deprecated
   public static void disableFog() {
      assertThread(RenderSystem::isOnGameThread);
      MT.instanceof_();
   }

   public static void depthMask(boolean var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0);
   }

   public static void viewport(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.protected_(var0, var1, var2, var3);
   }

   @Deprecated
   public static void pushMatrix() {
      assertThread(RenderSystem::isOnGameThread);
      MT.transient_();
   }

   public static void lineWidth(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.protected_(var0);
   }

   @Deprecated
   public static void translated(double var0, double var2, double var4) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0, var2, var4);
   }

   @Deprecated
   public static void translatef(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.byte_(var0, var1, var2);
   }

   @Deprecated
   public static void normal3f(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1, var2);
   }

   @Deprecated
   public static void enableFog() {
      assertThread(RenderSystem::isOnGameThread);
      MT.try_();
   }

   @Deprecated
   public static void multMatrix(rjV_2 var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0);
   }

   @Deprecated
   public static void rotatef(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.byte_(var0, var1, var2, var3);
   }

   @Deprecated
   public static void scalef(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0, var1, var2);
   }

   public static void colorMask(boolean var0, boolean var1, boolean var2, boolean var3) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1, var2, var3);
   }

   @Deprecated
   public static void fog(int var0, float var1, float var2, float var3, float var4) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, new float[]{var1, var2, var3, var4});
   }

   @Deprecated
   public static void matrixMode(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.return_(var0);
   }

   public static boolean isOnRenderThreadOrInit() {
      return isInInit || isOnRenderThread();
   }

   @Deprecated
   public static void enableColorMaterial() {
      assertThread(RenderSystem::isOnGameThread);
      MT.private_();
   }

   @Deprecated
   public static void disableColorMaterial() {
      assertThread(RenderSystem::isOnGameThread);
      MT.implements_();
   }

   @Deprecated
   public static void pushLightingAttributes() {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_();
   }

   public static boolean isOnGameThreadOrInit() {
      return isInInit || isOnGameThread();
   }

   @Deprecated
   public static void pushTextureAttributes() {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_();
   }

   public static void enableSmoothShadeModel() {
      shadeModel(7425);
   }

   public static void setupGui3DDiffuseLighting(rje_3 var0, rje_3 var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0, var1);
   }

   public static void setupEndPortalTexGen() {
      assertThread(RenderSystem::isOnGameThread);
      MT.public_();
   }

   public static yb_3 renderThreadTesselator() {
      assertThread(RenderSystem::isOnRenderThread);
      return RENDER_THREAD_TESSELATOR;
   }

   public static void mulTextureByProjModelView() {
      assertThread(RenderSystem::isOnGameThread);
      MT.while_();
   }

   public static void teardownOverlayColor() {
      assertThread(RenderSystem::isOnGameThread);
      MT.return_();
   }

   public static int maxSupportedTextureSize() {
      assertThread(RenderSystem::isInInitPhase);
      if (MAX_SUPPORTED_TEXTURE_SIZE == -1) {
         int var0 = MT.throw_(3379);

         for (int var1 = Math.max(32768, var0); var1 >= 1024; var1 >>= 1) {
            MT.class_(32868, 0, 6408, var1, var1, 0, 6408, 5121, (IntBuffer)null);
            int var2 = MT.byte_(32868, 0, 4096);
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
      MT.static_();
   }

   public static void disableSmoothShadeModel() {
      shadeModel(7424);
   }

   public static void setupLevelDiffuseLighting(rje_3 var0, rje_3 var1, rjV_2 var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1, var2);
   }

   public static void disablePolygonOffset() {
      assertThread(RenderSystem::isOnGameThread);
      MT.abstract_();
   }

   public static void enablePolygonOffset() {
      assertThread(RenderSystem::isOnGameThread);
      MT.char_();
   }

   public static void disableCull() {
      assertThread(RenderSystem::isOnGameThread);
      MT.interface_();
   }

   public static void texParameter(int var0, int var1, int var2) {
      MT.break_(var0, var1, var2);
   }

   public static void bindTexture(int var0) {
      MT.super_(var0);
   }

   public static void defaultAlphaFunc() {
      alphaFunc(516, 0.1F);
   }

   @Deprecated
   public static void loadIdentity() {
      assertThread(RenderSystem::isOnGameThread);
      MT.boolean_();
   }

   @Deprecated
   public static void clearCurrentColor() {
      assertThread(RenderSystem::isOnGameThread);
      MT.double_();
   }

   public static void polygonOffset(float var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1);
   }

   public static void teardownOutline() {
      assertThread(RenderSystem::isOnGameThread);
      MT.synchronized_();
   }

   public static void setupOutline() {
      assertThread(RenderSystem::isOnGameThread);
      MT.else_();
   }

   @Deprecated
   public static void glMultiTexCoord2f(int var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1, var2);
   }

   public static void disableDepthTest() {
      assertThread(RenderSystem::isOnGameThread);
      MT.native_();
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
      MT.import_();
      MT.this_(7425);
      MT.class_(1.0);
      MT.volatile_();
      MT.break_(515);
      MT.throws_();
      MT.class_(516, 0.1F);
      MT.return_(5889);
      MT.boolean_();
      MT.return_(5888);
      MT.protected_(var0, var1, var2, var3);
   }

   public static void setupGuiFlatDiffuseLighting(rje_3 var0, rje_3 var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1);
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
      MT.class_(var0, var1);
   }

   public static void blendEquation(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.byte_(var0);
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
      MT.byte_();
   }

   @Deprecated
   public static void enableLighting() {
      assertThread(RenderSystem::isOnGameThread);
      MT.case_();
   }

   @Deprecated
   public static void disableLighting() {
      assertThread(RenderSystem::isOnGameThread);
      MT.catch_();
   }

   public static void stencilFunc(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.protected_(var0, var1, var2);
   }

   public static void renderCrosshair(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GLX._renderCrosshair(var0, true, true, true);
   }

   public static void clearTexGen() {
      assertThread(RenderSystem::isOnGameThread);
      MT.goto_();
   }

   public static void enableLineOffset() {
      assertThread(RenderSystem::isOnGameThread);
      MT.long_();
   }

   public static void deleteTexture(int var0) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      MT.continue_(var0);
   }

   public static void clearStencil(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.synchronized_(var0);
   }

   public static void stencilMask(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.else_(var0);
   }

   public static void glUniformMatrix4(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.byte_(var0, var1, var2);
   }

   public static void glUniformMatrix2(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.class_(var0, var1, var2);
   }

   public static void disableLineOffset() {
      assertThread(RenderSystem::isOnGameThread);
      MT.float_();
   }

   public static void activeTexture(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.new_(var0);
   }

   public static void glUniformMatrix3(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      MT.break_(var0, var1, var2);
   }

   public static void setupNvFogDistance() {
      assertThread(RenderSystem::isOnGameThread);
      GLX._setupNvFogDistance();
   }

   public static void glBindBuffer(int var0, Supplier<Integer> var1) {
      MT.catch_(var0, (Integer)var1.get());
   }

   public static void setupOverlayColor(IntSupplier var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.extends_(var0.getAsInt(), var1);
   }

   public static void enableColorLogicOp() {
      assertThread(RenderSystem::isOnGameThread);
      MT.void_();
   }

   public static void pixelTransfer(int var0, float var1) {
      MT.break_(var0, var1);
   }

   public static void glDeleteBuffers(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      MT.finally_(var0);
   }

   public static void glBufferData(int var0, ByteBuffer var1, int var2) {
      assertThread(RenderSystem::isOnRenderThreadOrInit);
      MT.class_(var0, var1, var2);
   }

   public static void glUniform1i(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.case_(var0, var1);
   }

   public static void glGenBuffers(Consumer<Integer> var0) {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> var0.accept(MT.new_()));
      } else {
         var0.accept(MT.new_());
      }
   }

   public static void polygonMode(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      MT.volatile_(var0, var1);
   }
}
