package celestial;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWImage.Buffer;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public final class Qg_1 implements AutoCloseable {
   private static final Logger id_class = LogManager.getLogger();
   private final GLFWErrorCallback id_break = GLFWErrorCallback.create(this::id_class);
   private final Hk_1 id_byte;
   private final HN id_protected;
   private final long id_throws;
   private int id_case;
   private int id_catch;
   private int id_private;
   private int id_implements;
   private Optional<yM_2> id_finally;
   private boolean id_extends;
   private boolean id_native;
   private int id_volatile;
   private int id_final;
   private int id_package;
   private int id_int;
   private int id_new;
   private int id_continue;
   private int id_super;
   private int id_this;
   private double id_else;
   private String id_synchronized = "";
   private boolean id_return;
   private int id_public;
   private boolean id_goto;
   private boolean id_while;

   private void id_byte(long var1, int var3, int var4) {
      this.id_package = var3;
      this.id_int = var4;
   }

   private void id_byte(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);

      try {
         this.id_instanceof();
         this.id_byte.v();
         this.id_class(var1);
         this.id_throws();
      } catch (Exception var3) {
         id_class.error("Couldn't toggle fullscreen", var3);
      }
   }

   public void id_byte() {
      GLFWErrorCallback var1 = GLFW.glfwSetErrorCallback(this.id_break);
      if (var1 != null) {
         var1.free();
      }

      rrzJ_2.id_byte();
   }

   public float id_int() {
      return (float)this.id_this() / 2.0F;
   }

   public Qg_1(Hk_1 var1, HN var2, ys_3 var3, String var4, String var5) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.id_protected = var2;
      this.id_while();
      this.id_class("Pre startup");
      this.id_byte = var1;
      Optional var6 = yM_2.id_class(var4);
      if (var6.isPresent()) {
         this.id_finally = var6;
      } else if (var3.id_byte.isPresent() && var3.id_protected.isPresent()) {
         this.id_finally = Optional.of(new yM_2(var3.id_byte.getAsInt(), var3.id_protected.getAsInt(), 8, 8, 8, 60));
      } else {
         this.id_finally = Optional.empty();
      }

      this.id_native = this.id_extends = var3.id_throws;
      Qa_1 var7 = var2.id_class(GLFW.glfwGetPrimaryMonitor());
      this.id_private = this.id_package = var3.id_class > 0 ? var3.id_class : 1;
      this.id_implements = this.id_int = var3.id_break > 0 ? var3.id_break : 1;
      GLFW.glfwDefaultWindowHints();
      if (rrbb_3.T()) {
         GLFW.glfwWindowHint(135181, rrbb_3.q());
      }

      GLFW.glfwWindowHint(139265, 196609);
      GLFW.glfwWindowHint(139275, 221185);
      GLFW.glfwWindowHint(139266, 2);
      GLFW.glfwWindowHint(139267, 0);
      GLFW.glfwWindowHint(139272, 0);
      long var8 = 0L;
      if (rrxr_3.id_abstract.id_byte()) {
         Object var10 = rrxr_3.id_class(rrxr_3.id_char);
         var8 = rrxr_3.id_protected(
            var10,
            rrxr_3.id_abstract,
            (IntSupplier)() -> this.id_package,
            (IntSupplier)() -> this.id_int,
            (Supplier<String>)() -> var5,
            (LongSupplier)() -> this.id_extends && var7 != null ? var7.id_case() : 0L
         );
         if (rrbb_3.T()) {
            GLFW.glfwDestroyWindow(var8);
            var8 = 0L;
         }
      }

      if (var8 != 0L) {
         this.id_throws = var8;
      } else {
         this.id_throws = GLFW.glfwCreateWindow(this.id_package, this.id_int, var5, this.id_extends && var7 != null ? var7.id_case() : 0L, 0L);
      }

      if (var7 != null) {
         yM_2 var12 = var7.id_class(this.id_extends ? this.id_finally : Optional.empty());
         this.id_case = this.id_volatile = var7.id_byte() + var12.id_class() / 2 - this.id_package / 2;
         this.id_catch = this.id_final = var7.id_protected() + var12.id_break() / 2 - this.id_int / 2;
      } else {
         int[] var13 = new int[1];
         int[] var11 = new int[1];
         GLFW.glfwGetWindowPos(this.id_throws, var13, var11);
         this.id_case = this.id_volatile = var13[0];
         this.id_catch = this.id_final = var11[0];
      }

      GLFW.glfwMakeContextCurrent(this.id_throws);
      org.lwjgl.opengl.GL.createCapabilities();
      this.id_instanceof();
      this.id_try();
      GLFW.glfwSetFramebufferSizeCallback(this.id_throws, this::id_break);
      GLFW.glfwSetWindowPosCallback(this.id_throws, this::id_class);
      GLFW.glfwSetWindowSizeCallback(this.id_throws, this::id_byte);
      GLFW.glfwSetWindowFocusCallback(this.id_throws, this::id_class);
      GLFW.glfwSetCursorEnterCallback(this.id_throws, this::id_break);
   }

   public int id_this() {
      return this.id_this;
   }

   public void id_class(Optional<yM_2> var1) {
      boolean var2 = !var1.equals(this.id_finally);
      this.id_finally = var1;
      if (var2) {
         this.id_return = true;
      }
   }

   public void id_class(int var1, int var2) {
      this.id_break(this.id_throws, var1, var2);
   }

   public void id_class(int var1) {
      this.id_public = var1;
   }

   private void id_class(long var1, boolean var3) {
      if (var1 == this.id_throws) {
         this.id_byte.id_class(var3);
      }
   }

   public void id_class(InputStream var1, InputStream var2) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);

      try {
         MemoryStack var3 = MemoryStack.stackPush();

         try {
            if (var1 == null) {
               throw new FileNotFoundException("icons/icon_16x16.png");
            }

            if (var2 == null) {
               throw new FileNotFoundException("icons/icon_32x32.png");
            }

            IntBuffer var4 = var3.mallocInt(1);
            IntBuffer var5 = var3.mallocInt(1);
            IntBuffer var6 = var3.mallocInt(1);
            Buffer var7 = GLFWImage.mallocStack(2, var3);
            ByteBuffer var8 = this.id_class(var1, var4, var5, var6);
            if (var8 == null) {
               throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }

            var7.position(0);
            var7.width(var4.get(0));
            var7.height(var5.get(0));
            var7.pixels(var8);
            ByteBuffer var9 = this.id_class(var2, var4, var5, var6);
            if (var9 == null) {
               throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }

            var7.position(1);
            var7.width(var4.get(0));
            var7.height(var5.get(0));
            var7.pixels(var9);
            var7.position(0);
            GLFW.glfwSetWindowIcon(this.id_throws, var7);
            STBImage.stbi_image_free(var8);
            STBImage.stbi_image_free(var9);
         } catch (Throwable var11) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var3 != null) {
            var3.close();
         }
      } catch (IOException var12) {
         id_class.error("Couldn't set icon", var12);
      }
   }

   private ByteBuffer id_class(InputStream var1, IntBuffer var2, IntBuffer var3, IntBuffer var4) throws IOException {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      ByteBuffer var5 = null;

      ByteBuffer var6;
      try {
         var5 = fo_3.id_class(var1);
         ((java.nio.Buffer)var5).rewind();
         var6 = STBImage.stbi_load_from_memory(var5, var2, var3, var4, 0);
      } finally {
         if (var5 != null) {
            MemoryUtil.memFree(var5);
         }
      }

      return var6;
   }

   public static void id_class(BiConsumer<Integer, String> var0) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      MemoryStack var1 = MemoryStack.stackPush();

      try {
         PointerBuffer var2 = var1.mallocPointer(1);
         int var3 = GLFW.glfwGetError(var2);
         if (var3 != 0) {
            long var4 = var2.get();
            String var6 = var4 == 0L ? "" : MemoryUtil.memUTF8(var4);
            var0.accept(var3, var6);
         }
      } catch (Throwable var8) {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var1 != null) {
         var1.close();
      }
   }

   public void id_class(double var1) {
      this.id_else = var1;
      int var3 = (int)((double)this.id_new / var1);
      this.id_super = (double)this.id_new / var1 > (double)var3 ? var3 + 1 : var3;
      int var4 = (int)((double)this.id_continue / var1);
      this.id_this = (double)this.id_continue / var1 > (double)var4 ? var4 + 1 : var4;
   }

   public int id_class(int var1, boolean var2) {
      int var3 = 1;

      while (var3 != var1 && var3 < this.id_new && var3 < this.id_continue && this.id_new / (var3 + 1) >= 320 && this.id_continue / (var3 + 1) >= 240) {
         var3++;
      }

      if (var2 && var3 % 2 != 0) {
         var3++;
      }

      return var3;
   }

   public int id_class() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GLX._getRefreshRate(this);
   }

   public void id_class(int var1, long var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      String var4 = MemoryUtil.memUTF8(var2);
      id_class.error("########## GL ERROR ##########");
      id_class.error("@ {}", this.id_synchronized);
      id_class.error("{}: {}", var1, var4);
   }

   public void id_class(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.id_goto = var1;
      GLFW.glfwSwapInterval(var1 ? 1 : 0);
   }

   private void id_class(long var1, int var3, int var4) {
      this.id_volatile = var3;
      this.id_final = var4;
   }

   public void id_class(String var1) {
      this.id_synchronized = var1;
      if (var1.equals("Startup")) {
         rrzJ_2.id_protected();
      }
   }

   @Override
   public void close() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.id_while = true;
      Callbacks.glfwFreeCallbacks(this.id_throws);
      this.id_break.close();
      GLFW.glfwDestroyWindow(this.id_throws);
      GLFW.glfwTerminate();
   }

   public void id_break(String var1) {
      GLFW.glfwSetWindowTitle(this.id_throws, var1);
   }

   public void id_break(boolean var1) {
      Ve_1.id_class(this.id_throws, var1);
   }

   public boolean id_break() {
      return GLX._shouldClose(this);
   }

   private static void id_break(int var0, long var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      String var3 = "GLFW error " + var0 + ": " + MemoryUtil.memUTF8(var1);
      TinyFileDialogs.tinyfd_messageBox(
         "Minecraft", var3 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false
      );
      throw new QR(var3);
   }

   private void id_break(long var1, boolean var3) {
      if (var3) {
         this.id_byte.id_break();
      }
   }

   private void id_break(long var1, int var3, int var4) {
      if (var1 == this.id_throws) {
         int var5 = this.id_extends();
         int var6 = this.id_native();
         if (var3 != 0 && var4 != 0) {
            this.id_new = var3;
            this.id_continue = var4;
            if (this.id_extends() != var5 || this.id_native() != var6) {
               this.id_byte.v();
            }
         }
      }
   }

   public void id_throws() {
      RenderSystem.flipFrame(this.id_throws);
      if (this.id_extends != this.id_native) {
         this.id_native = this.id_extends;
         this.id_byte(this.id_goto);
      }
   }

   public boolean id_finally() {
      return this.id_extends;
   }

   public void id_catch() {
      if (this.id_extends && this.id_return) {
         this.id_return = false;
         this.id_instanceof();
         this.id_byte.v();
      }
   }

   public int id_extends() {
      return this.id_new;
   }

   public boolean id_goto() {
      return this.id_while;
   }

   public Optional<yM_2> id_case() {
      return this.id_finally;
   }

   public int id_continue() {
      return this.id_int;
   }

   public int id_else() {
      return this.id_volatile;
   }

   public long id_implements() {
      return this.id_throws;
   }

   private void id_instanceof() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      boolean var1 = GLFW.glfwGetWindowMonitor(this.id_throws) != 0L;
      if (this.id_extends) {
         Qa_1 var2 = this.id_protected.id_class(this);
         if (var2 == null) {
            id_class.warn("Failed to find suitable monitor for fullscreen mode");
            this.id_extends = false;
         } else {
            yM_2 var3 = var2.id_class(this.id_finally);
            if (!var1) {
               this.id_case = this.id_volatile;
               this.id_catch = this.id_final;
               this.id_private = this.id_package;
               this.id_implements = this.id_int;
            }

            this.id_volatile = 0;
            this.id_final = 0;
            this.id_package = var3.id_class();
            this.id_int = var3.id_break();
            GLFW.glfwSetWindowMonitor(this.id_throws, var2.id_case(), this.id_volatile, this.id_final, this.id_package, this.id_int, var3.id_case());
         }
      } else {
         this.id_volatile = this.id_case;
         this.id_final = this.id_catch;
         this.id_package = this.id_private;
         this.id_int = this.id_implements;
         GLFW.glfwSetWindowMonitor(this.id_throws, 0L, this.id_volatile, this.id_final, this.id_package, this.id_int, -1);
      }
   }

   public int id_new() {
      return this.id_package;
   }

   public float id_package() {
      return (float)this.id_super() / 2.0F;
   }

   public double id_return() {
      return this.id_else;
   }

   public int id_super() {
      return this.id_super;
   }

   private void id_try() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      int[] var1 = new int[1];
      int[] var2 = new int[1];
      GLFW.glfwGetFramebufferSize(this.id_throws, var1, var2);
      this.id_new = var1[0];
      this.id_continue = var2[0];
      if (this.id_continue == 0 || this.id_new == 0) {
         rrGY.INSTANCE.id_class(var1x -> this.id_new = var1x, var1x -> this.id_continue = var1x);
      }
   }

   private void id_while() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      GLFW.glfwSetErrorCallback(Qg_1::id_break);
   }

   public Qa_1 id_public() {
      return this.id_protected.id_class(this);
   }

   public int id_protected() {
      return this.id_public;
   }

   public void id_private() {
      this.id_extends = !this.id_extends;
   }

   public float id_final() {
      return (float)this.id_continue / 2.0F;
   }

   public float id_volatile() {
      return (float)this.id_new / 2.0F;
   }

   public int id_synchronized() {
      return this.id_final;
   }

   public int id_native() {
      return this.id_continue;
   }
}
