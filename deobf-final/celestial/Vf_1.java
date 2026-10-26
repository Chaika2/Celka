package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class Vf_1 extends Vp_1 implements AutoCloseable {
   private static final Logger class_ = LogManager.getLogger();
   private int break_;
   private final int byte_;
   private final int protected_;
   private final IntBuffer throws_;
   private final FloatBuffer case_;
   private final String catch_;
   private boolean private_;
   private final VH implements_;

   private void byte_() {
      this.private_ = true;
      if (this.implements_ != null) {
         this.implements_.break_();
      }
   }

   public Vf_1(String var1, int var2, int var3, VH var4) {
      this.catch_ = var1;
      this.byte_ = var3;
      this.protected_ = var2;
      this.implements_ = var4;
      if (var2 <= 3) {
         this.throws_ = MemoryUtil.memAllocInt(var3);
         this.case_ = null;
      } else {
         this.throws_ = null;
         this.case_ = MemoryUtil.memAllocFloat(var3);
      }

      this.break_ = -1;
      this.byte_();
   }

   @Override
   public void class_(float var1, float var2, float var3) {
      ((Buffer)this.case_).position(0);
      this.case_.put(0, var1);
      this.case_.put(1, var2);
      this.case_.put(2, var3);
      this.byte_();
   }

   public static int class_(int var0, CharSequence var1) {
      return MT.break_(var0, var1);
   }

   @Override
   public void class_(float var1, float var2) {
      ((Buffer)this.case_).position(0);
      this.case_.put(0, var1);
      this.case_.put(1, var2);
      this.byte_();
   }

   @Override
   public void class_(float var1) {
      ((Buffer)this.case_).position(0);
      this.case_.put(0, var1);
      this.byte_();
   }

   @Override
   public void class_(int var1, int var2, int var3, int var4) {
      ((Buffer)this.throws_).position(0);
      if (this.protected_ >= 0) {
         this.throws_.put(0, var1);
      }

      if (this.protected_ >= 1) {
         this.throws_.put(1, var2);
      }

      if (this.protected_ >= 2) {
         this.throws_.put(2, var3);
      }

      if (this.protected_ >= 3) {
         this.throws_.put(3, var4);
      }

      this.byte_();
   }

   @Override
   public void class_(float[] var1) {
      if (var1.length < this.byte_) {
         class_.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.byte_, var1.length);
      } else {
         ((Buffer)this.case_).position(0);
         this.case_.put(var1);
         ((Buffer)this.case_).position(0);
         this.byte_();
      }
   }

   @Override
   public void class_(rjV_2 var1) {
      ((Buffer)this.case_).position(0);
      var1.class_(this.case_);
      this.byte_();
   }

   @Override
   public void class_(float var1, float var2, float var3, float var4) {
      ((Buffer)this.case_).position(0);
      this.case_.put(var1);
      this.case_.put(var2);
      this.case_.put(var3);
      this.case_.put(var4);
      ((Buffer)this.case_).flip();
      this.byte_();
   }

   public static void class_(int var0, int var1) {
      RenderSystem.glUniform1i(var0, var1);
   }

   public static int class_(String var0) {
      byte var1 = -1;
      if ("int".equals(var0)) {
         var1 = 0;
      } else if ("float".equals(var0)) {
         var1 = 4;
      } else if (var0.startsWith("matrix")) {
         if (var0.endsWith("2x2")) {
            var1 = 8;
         } else if (var0.endsWith("3x3")) {
            var1 = 9;
         } else if (var0.endsWith("4x4")) {
            var1 = 10;
         }
      }

      return var1;
   }

   public String class_() {
      return this.catch_;
   }

   public void class_(int var1) {
      this.break_ = var1;
   }

   @Override
   public void close() {
      if (this.throws_ != null) {
         MemoryUtil.memFree(this.throws_);
      }

      if (this.case_ != null) {
         MemoryUtil.memFree(this.case_);
      }
   }

   public void break_() {
      if (!this.private_) {
      }

      this.private_ = false;
      if (this.protected_ <= 3) {
         this.protected_();
      } else if (this.protected_ <= 7) {
         this.throws_();
      } else {
         if (this.protected_ > 10) {
            class_.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", this.protected_);
            return;
         }

         this.case_();
      }
   }

   public static int break_(int var0, CharSequence var1) {
      return MT.byte_(var0, var1);
   }

   @Override
   public void break_(float var1, float var2, float var3, float var4) {
      ((Buffer)this.case_).position(0);
      if (this.protected_ >= 4) {
         this.case_.put(0, var1);
      }

      if (this.protected_ >= 5) {
         this.case_.put(1, var2);
      }

      if (this.protected_ >= 6) {
         this.case_.put(2, var3);
      }

      if (this.protected_ >= 7) {
         this.case_.put(3, var4);
      }

      this.byte_();
   }

   private void throws_() {
      ((Buffer)this.case_).clear();
      switch (this.protected_) {
         case 4:
            RenderSystem.glUniform1(this.break_, this.case_);
            break;
         case 5:
            RenderSystem.glUniform2(this.break_, this.case_);
            break;
         case 6:
            RenderSystem.glUniform3(this.break_, this.case_);
            break;
         case 7:
            RenderSystem.glUniform4(this.break_, this.case_);
            break;
         default:
            class_.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", this.byte_);
      }
   }

   private void case_() {
      ((Buffer)this.case_).clear();
      switch (this.protected_) {
         case 8:
            RenderSystem.glUniformMatrix2(this.break_, false, this.case_);
            break;
         case 9:
            RenderSystem.glUniformMatrix3(this.break_, false, this.case_);
            break;
         case 10:
            RenderSystem.glUniformMatrix4(this.break_, false, this.case_);
      }
   }

   private void protected_() {
      ((Buffer)this.case_).clear();
      switch (this.protected_) {
         case 0:
            RenderSystem.glUniform1(this.break_, this.throws_);
            break;
         case 1:
            RenderSystem.glUniform2(this.break_, this.throws_);
            break;
         case 2:
            RenderSystem.glUniform3(this.break_, this.throws_);
            break;
         case 3:
            RenderSystem.glUniform4(this.break_, this.throws_);
            break;
         default:
            class_.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", this.byte_);
      }
   }
}
