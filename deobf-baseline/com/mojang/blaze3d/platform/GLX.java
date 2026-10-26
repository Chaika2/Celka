package com.mojang.blaze3d.platform;

import celestial.HX;
import celestial.MT;
import celestial.Qg_1;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rrbb_3;
import celestial.yb_3;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import oshi.SystemInfo;
import oshi.hardware.Processor;

public class GLX {
   private static final Logger LOGGER = LogManager.getLogger();
   private static String capsString = "";
   private static String cpuInfo;
   private static final Map<Integer, String> LOOKUP_MAP = make(Maps.newHashMap(), var0 -> {
      var0.put(0, "No error");
      var0.put(1280, "Enum parameter is invalid for this function");
      var0.put(1281, "Parameter is invalid for this function");
      var0.put(1282, "Current state is invalid for this function");
      var0.put(1283, "Stack overflow");
      var0.put(1284, "Stack underflow");
      var0.put(1285, "Out of memory");
      var0.put(1286, "Operation on incomplete framebuffer");
      var0.put(1286, "Operation on incomplete framebuffer");
   });

   public static <T> T make(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T make(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return (T)var0;
   }

   public static void _init(int var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      GLCapabilities var2 = GL.getCapabilities();
      capsString = "Using framebuffer using " + MT.id_class(var2);

      try {
         Processor[] var3 = new SystemInfo().getHardware().getProcessors();
         cpuInfo = String.format("%dx %s", var3.length, var3[0]).replaceAll("\\s+", " ");
      } catch (Throwable var4) {
      }

      HX.id_class(var0, var1);
   }

   public static LongSupplier _initGlfw() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      Qg_1.id_class((var0x, var1x) -> {
         throw new IllegalStateException(String.format("GLFW error before init: [0x%X]%s", var0x, var1x));
      });
      ArrayList var0 = Lists.newArrayList();
      GLFWErrorCallback var1 = GLFW.glfwSetErrorCallback((var1x, var2x) -> var0.add(String.format("GLFW error during init: [0x%X]%s", var1x, var2x)));
      if (!GLFW.glfwInit()) {
         throw new IllegalStateException("Failed to initialize GLFW, errors: " + Joiner.on(",").join(var0));
      } else {
         LongSupplier var2 = () -> (long)(GLFW.glfwGetTime() * 1.0E9);

         for (String var4 : var0) {
            LOGGER.error("GLFW error collected during initialization: {}", var4);
         }

         RenderSystem.setErrorCallback(var1);
         return var2;
      }
   }

   public static boolean useVbo() {
      return true;
   }

   public static void _setupNvFogDistance() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (GL.getCapabilities().GL_NV_fog_distance) {
         if (rrbb_3.id_this()) {
            MT.id_native(34138, 34139);
         }

         if (rrbb_3.id_else()) {
            MT.id_native(34138, 34140);
         }
      }
   }

   public static void _setGlfwErrorCallback(GLFWErrorCallbackI var0) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      GLFWErrorCallback var1 = GLFW.glfwSetErrorCallback(var0);
      if (var1 != null) {
         var1.free();
      }
   }

   public static String getOpenGLVersionString() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GLFW.glfwGetCurrentContext() == 0L
         ? "NO CONTEXT"
         : MT.id_instanceof(7937) + " GL version " + MT.id_instanceof(7938) + ", " + MT.id_instanceof(7936);
   }

   public static boolean isUsingFBOs() {
      return !rrbb_3.T();
   }

   public static boolean _shouldClose(Qg_1 var0) {
      return GLFW.glfwWindowShouldClose(var0.id_implements());
   }

   public static int _getRefreshRate(Qg_1 var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      long var1 = GLFW.glfwGetWindowMonitor(var0.id_implements());
      if (var1 == 0L) {
         var1 = GLFW.glfwGetPrimaryMonitor();
      }

      GLFWVidMode var3 = var1 == 0L ? null : GLFW.glfwGetVideoMode(var1);
      return var3 == null ? 0 : var3.refreshRate();
   }

   public static String _getCpuInfo() {
      return cpuInfo == null ? "<unknown>" : cpuInfo;
   }

   public static String getErrorString(int var0) {
      return LOOKUP_MAP.get(var0);
   }

   public static String _getLWJGLVersion() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return Version.getVersion();
   }

   public static void _renderCrosshair(int var0, boolean var1, boolean var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      MT.id_short();
      MT.id_class(false);
      yb_3 var4 = RenderSystem.renderThreadTesselator();
      lD_2 var5 = var4.id_byte();
      GL11.glLineWidth(4.0F);
      var5.id_class(1, ju_3.id_this);
      if (var1) {
         var5.id_class(0.0, 0.0, 0.0).id_break(0, 0, 0, 255).id_class();
         var5.id_class((double)var0, 0.0, 0.0).id_break(0, 0, 0, 255).id_class();
      }

      if (var2) {
         var5.id_class(0.0, 0.0, 0.0).id_break(0, 0, 0, 255).id_class();
         var5.id_class(0.0, (double)var0, 0.0).id_break(0, 0, 0, 255).id_class();
      }

      if (var3) {
         var5.id_class(0.0, 0.0, 0.0).id_break(0, 0, 0, 255).id_class();
         var5.id_class(0.0, 0.0, (double)var0).id_break(0, 0, 0, 255).id_class();
      }

      var4.id_break();
      GL11.glLineWidth(2.0F);
      var5.id_class(1, ju_3.id_this);
      if (var1) {
         var5.id_class(0.0, 0.0, 0.0).id_break(255, 0, 0, 255).id_class();
         var5.id_class((double)var0, 0.0, 0.0).id_break(255, 0, 0, 255).id_class();
      }

      if (var2) {
         var5.id_class(0.0, 0.0, 0.0).id_break(0, 255, 0, 255).id_class();
         var5.id_class(0.0, (double)var0, 0.0).id_break(0, 255, 0, 255).id_class();
      }

      if (var3) {
         var5.id_class(0.0, 0.0, 0.0).id_break(127, 127, 255, 255).id_class();
         var5.id_class(0.0, 0.0, (double)var0).id_break(127, 127, 255, 255).id_class();
      }

      var4.id_break();
      GL11.glLineWidth(1.0F);
      MT.id_class(true);
      MT.id_import();
   }

   public static String _getCapsString() {
      return capsString;
   }
}
