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
   private static final Logger class_ = LogManager.getLogger();
   private final GLFWErrorCallback break_ = GLFWErrorCallback.create(this::class_);
   private final Hk_1 byte_;
   private final HN protected_;
   private final long throws_;
   private int case_;
   private int catch_;
   private int private_;
   private int implements_;
   private Optional<yM_2> finally_;
   private boolean extends_;
   private boolean native_;
   private int volatile_;
   private int final_;
   private int package_;
   private int int_;
   private int new_;
   private int continue_;
   private int super_;
   private int this_;
   private double else_;
   private String synchronized_ = "";
   private boolean return_;
   private int public_;
   private boolean goto_;
   private boolean while_;

   private void byte_(long var1, int var3, int var4) {
      this.package_ = var3;
      this.int_ = var4;
   }

   private void byte_(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);

      try {
         this.instanceof_();
         this.byte_.v();
         this.class_(var1);
         this.throws_();
      } catch (Exception var3) {
         class_.error("Couldn't toggle fullscreen", var3);
      }
   }

   public void byte_() {
      GLFWErrorCallback var1 = GLFW.glfwSetErrorCallback(this.break_);
      if (var1 != null) {
         var1.free();
      }

      rrzJ_2.byte_();
   }

   public float int_() {
      return (float)this.this_() / 2.0F;
   }

   public Qg_1(Hk_1 var1, HN var2, ys_3 var3, String var4, String var5) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.protected_ = var2;
      this.while_();
      this.class_("Pre startup");
      this.byte_ = var1;
      Optional var6 = yM_2.class_(var4);
      if (var6.isPresent()) {
         this.finally_ = var6;
      } else if (var3.byte_.isPresent() && var3.protected_.isPresent()) {
         this.finally_ = Optional.of(new yM_2(var3.byte_.getAsInt(), var3.protected_.getAsInt(), 8, 8, 8, 60));
      } else {
         this.finally_ = Optional.empty();
      }

      this.native_ = this.extends_ = var3.throws_;
      Qa_1 var7 = var2.class_(GLFW.glfwGetPrimaryMonitor());
      this.private_ = this.package_ = var3.class_ > 0 ? var3.class_ : 1;
      this.implements_ = this.int_ = var3.break_ > 0 ? var3.break_ : 1;
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
      if (rrxr_3.abstract_.byte_()) {
         Object var10 = rrxr_3.class_(rrxr_3.char_);
         var8 = rrxr_3.protected_(
            var10,
            rrxr_3.abstract_,
            (IntSupplier)() -> this.package_,
            (IntSupplier)() -> this.int_,
            (Supplier<String>)() -> var5,
            (LongSupplier)() -> this.extends_ && var7 != null ? var7.case_() : 0L
         );
         if (rrbb_3.T()) {
            GLFW.glfwDestroyWindow(var8);
            var8 = 0L;
         }
      }

      if (var8 != 0L) {
         this.throws_ = var8;
      } else {
         this.throws_ = GLFW.glfwCreateWindow(this.package_, this.int_, var5, this.extends_ && var7 != null ? var7.case_() : 0L, 0L);
      }

      if (var7 != null) {
         yM_2 var12 = var7.class_(this.extends_ ? this.finally_ : Optional.empty());
         this.case_ = this.volatile_ = var7.byte_() + var12.class_() / 2 - this.package_ / 2;
         this.catch_ = this.final_ = var7.protected_() + var12.break_() / 2 - this.int_ / 2;
      } else {
         int[] var13 = new int[1];
         int[] var11 = new int[1];
         GLFW.glfwGetWindowPos(this.throws_, var13, var11);
         this.case_ = this.volatile_ = var13[0];
         this.catch_ = this.final_ = var11[0];
      }

      GLFW.glfwMakeContextCurrent(this.throws_);
      org.lwjgl.opengl.GL.createCapabilities();
      this.instanceof_();
      this.try_();
      GLFW.glfwSetFramebufferSizeCallback(this.throws_, this::break_);
      GLFW.glfwSetWindowPosCallback(this.throws_, this::class_);
      GLFW.glfwSetWindowSizeCallback(this.throws_, this::byte_);
      GLFW.glfwSetWindowFocusCallback(this.throws_, this::class_);
      GLFW.glfwSetCursorEnterCallback(this.throws_, this::break_);
   }

   public int this_() {
      return this.this_;
   }

   public void class_(Optional<yM_2> var1) {
      boolean var2 = !var1.equals(this.finally_);
      this.finally_ = var1;
      if (var2) {
         this.return_ = true;
      }
   }

   public void class_(int var1, int var2) {
      this.break_(this.throws_, var1, var2);
   }

   public void class_(int var1) {
      this.public_ = var1;
   }

   private void class_(long var1, boolean var3) {
      if (var1 == this.throws_) {
         this.byte_.class_(var3);
      }
   }

   public void class_(InputStream var1, InputStream var2) {
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
            ByteBuffer var8 = this.class_(var1, var4, var5, var6);
            if (var8 == null) {
               throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }

            var7.position(0);
            var7.width(var4.get(0));
            var7.height(var5.get(0));
            var7.pixels(var8);
            ByteBuffer var9 = this.class_(var2, var4, var5, var6);
            if (var9 == null) {
               throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }

            var7.position(1);
            var7.width(var4.get(0));
            var7.height(var5.get(0));
            var7.pixels(var9);
            var7.position(0);
            GLFW.glfwSetWindowIcon(this.throws_, var7);
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
         class_.error("Couldn't set icon", var12);
      }
   }

   private ByteBuffer class_(InputStream var1, IntBuffer var2, IntBuffer var3, IntBuffer var4) throws IOException {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      ByteBuffer var5 = null;

      ByteBuffer var6;
      try {
         var5 = fo_3.class_(var1);
         ((java.nio.Buffer)var5).rewind();
         var6 = STBImage.stbi_load_from_memory(var5, var2, var3, var4, 0);
      } finally {
         if (var5 != null) {
            MemoryUtil.memFree(var5);
         }
      }

      return var6;
   }

   public static void class_(BiConsumer<Integer, String> var0) {
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

   public void class_(double var1) {
      this.else_ = var1;
      int var3 = (int)((double)this.new_ / var1);
      this.super_ = (double)this.new_ / var1 > (double)var3 ? var3 + 1 : var3;
      int var4 = (int)((double)this.continue_ / var1);
      this.this_ = (double)this.continue_ / var1 > (double)var4 ? var4 + 1 : var4;
   }

   public int class_(int var1, boolean var2) {
      int var3 = 1;

      while (var3 != var1 && var3 < this.new_ && var3 < this.continue_ && this.new_ / (var3 + 1) >= 320 && this.continue_ / (var3 + 1) >= 240) {
         var3++;
      }

      if (var2 && var3 % 2 != 0) {
         var3++;
      }

      return var3;
   }

   public int class_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GLX._getRefreshRate(this);
   }

   public void class_(int var1, long var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      String var4 = MemoryUtil.memUTF8(var2);
      class_.error("########## GL ERROR ##########");
      class_.error("@ {}", this.synchronized_);
      class_.error("{}: {}", var1, var4);
   }

   public void class_(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.goto_ = var1;
      GLFW.glfwSwapInterval(var1 ? 1 : 0);
   }

   private void class_(long var1, int var3, int var4) {
      this.volatile_ = var3;
      this.final_ = var4;
   }

   public void class_(String var1) {
      this.synchronized_ = var1;
      if (var1.equals("Startup")) {
         rrzJ_2.protected_();
      }
   }

   @Override
   public void close() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.while_ = true;
      Callbacks.glfwFreeCallbacks(this.throws_);
      this.break_.close();
      GLFW.glfwDestroyWindow(this.throws_);
      GLFW.glfwTerminate();
   }

   public void break_(String var1) {
      GLFW.glfwSetWindowTitle(this.throws_, var1);
   }

   public void break_(boolean var1) {
      Ve_1.class_(this.throws_, var1);
   }

   public boolean break_() {
      return GLX._shouldClose(this);
   }

   private static void break_(int var0, long var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      String var3 = "GLFW error " + var0 + ": " + MemoryUtil.memUTF8(var1);
      TinyFileDialogs.tinyfd_messageBox(
         "Minecraft", var3 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false
      );
      throw new QR(var3);
   }

   private void break_(long var1, boolean var3) {
      if (var3) {
         this.byte_.break_();
      }
   }

   private void break_(long var1, int var3, int var4) {
      if (var1 == this.throws_) {
         int var5 = this.extends_();
         int var6 = this.native_();
         if (var3 != 0 && var4 != 0) {
            this.new_ = var3;
            this.continue_ = var4;
            if (this.extends_() != var5 || this.native_() != var6) {
               this.byte_.v();
            }
         }
      }
   }

   public void throws_() {
      RenderSystem.flipFrame(this.throws_);
      if (this.extends_ != this.native_) {
         this.native_ = this.extends_;
         this.byte_(this.goto_);
      }
   }

   public boolean finally_() {
      return this.extends_;
   }

   public void catch_() {
      if (this.extends_ && this.return_) {
         this.return_ = false;
         this.instanceof_();
         this.byte_.v();
      }
   }

   public int extends_() {
      return this.new_;
   }

   public boolean goto_() {
      return this.while_;
   }

   public Optional<yM_2> case_() {
      return this.finally_;
   }

   public int continue_() {
      return this.int_;
   }

   public int else_() {
      return this.volatile_;
   }

   public long implements_() {
      return this.throws_;
   }

   private void instanceof_() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      boolean var1 = GLFW.glfwGetWindowMonitor(this.throws_) != 0L;
      if (this.extends_) {
         Qa_1 var2 = this.protected_.class_(this);
         if (var2 == null) {
            class_.warn("Failed to find suitable monitor for fullscreen mode");
            this.extends_ = false;
         } else {
            yM_2 var3 = var2.class_(this.finally_);
            if (!var1) {
               this.case_ = this.volatile_;
               this.catch_ = this.final_;
               this.private_ = this.package_;
               this.implements_ = this.int_;
            }

            this.volatile_ = 0;
            this.final_ = 0;
            this.package_ = var3.class_();
            this.int_ = var3.break_();
            GLFW.glfwSetWindowMonitor(this.throws_, var2.case_(), this.volatile_, this.final_, this.package_, this.int_, var3.case_());
         }
      } else {
         this.volatile_ = this.case_;
         this.final_ = this.catch_;
         this.package_ = this.private_;
         this.int_ = this.implements_;
         GLFW.glfwSetWindowMonitor(this.throws_, 0L, this.volatile_, this.final_, this.package_, this.int_, -1);
      }
   }

   public int new_() {
      return this.package_;
   }

   public float package_() {
      return (float)this.super_() / 2.0F;
   }

   public double return_() {
      return this.else_;
   }

   public int super_() {
      return this.super_;
   }

   private void try_() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      int[] var1 = new int[1];
      int[] var2 = new int[1];
      GLFW.glfwGetFramebufferSize(this.throws_, var1, var2);
      this.new_ = var1[0];
      this.continue_ = var2[0];
      if (this.continue_ == 0 || this.new_ == 0) {
         rrGY.INSTANCE.class_(var1x -> this.new_ = var1x, var1x -> this.continue_ = var1x);
      }
   }

   private void while_() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      GLFW.glfwSetErrorCallback(Qg_1::break_);
   }

   public Qa_1 public_() {
      return this.protected_.class_(this);
   }

   public int protected_() {
      return this.public_;
   }

   public void private_() {
      this.extends_ = !this.extends_;
   }

   public float final_() {
      return (float)this.continue_ / 2.0F;
   }

   public float volatile_() {
      return (float)this.new_ / 2.0F;
   }

   public int synchronized_() {
      return this.final_;
   }

   public int native_() {
      return this.continue_;
   }
}
