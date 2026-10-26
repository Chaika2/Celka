package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class Vf_1 extends Vp_1 implements AutoCloseable {
   private static final Logger id_class = LogManager.getLogger();
   private int id_break;
   private final int id_byte;
   private final int id_protected;
   private final IntBuffer id_throws;
   private final FloatBuffer id_case;
   private final String id_catch;
   private boolean id_private;
   private final VH id_implements;

   private void id_byte() {
      this.id_private = true;
      if (this.id_implements != null) {
         this.id_implements.id_break();
      }
   }

   public Vf_1(String var1, int var2, int var3, VH var4) {
      this.id_catch = var1;
      this.id_byte = var3;
      this.id_protected = var2;
      this.id_implements = var4;
      if (var2 <= 3) {
         this.id_throws = MemoryUtil.memAllocInt(var3);
         this.id_case = null;
      } else {
         this.id_throws = null;
         this.id_case = MemoryUtil.memAllocFloat(var3);
      }

      this.id_break = -1;
      this.id_byte();
   }

   @Override
   public void id_class(float var1, float var2, float var3) {
      ((Buffer)this.id_case).position(0);
      this.id_case.put(0, var1);
      this.id_case.put(1, var2);
      this.id_case.put(2, var3);
      this.id_byte();
   }

   public static int id_class(int var0, CharSequence var1) {
      return MT.id_break(var0, var1);
   }

   @Override
   public void id_class(float var1, float var2) {
      ((Buffer)this.id_case).position(0);
      this.id_case.put(0, var1);
      this.id_case.put(1, var2);
      this.id_byte();
   }

   @Override
   public void id_class(float var1) {
      ((Buffer)this.id_case).position(0);
      this.id_case.put(0, var1);
      this.id_byte();
   }

   @Override
   public void id_class(int var1, int var2, int var3, int var4) {
      ((Buffer)this.id_throws).position(0);
      if (this.id_protected >= 0) {
         this.id_throws.put(0, var1);
      }

      if (this.id_protected >= 1) {
         this.id_throws.put(1, var2);
      }

      if (this.id_protected >= 2) {
         this.id_throws.put(2, var3);
      }

      if (this.id_protected >= 3) {
         this.id_throws.put(3, var4);
      }

      this.id_byte();
   }

   @Override
   public void id_class(float[] var1) {
      if (var1.length < this.id_byte) {
         id_class.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.id_byte, var1.length);
      } else {
         ((Buffer)this.id_case).position(0);
         this.id_case.put(var1);
         ((Buffer)this.id_case).position(0);
         this.id_byte();
      }
   }

   @Override
   public void id_class(rjV_2 var1) {
      ((Buffer)this.id_case).position(0);
      var1.id_class(this.id_case);
      this.id_byte();
   }

   @Override
   public void id_class(float var1, float var2, float var3, float var4) {
      ((Buffer)this.id_case).position(0);
      this.id_case.put(var1);
      this.id_case.put(var2);
      this.id_case.put(var3);
      this.id_case.put(var4);
      ((Buffer)this.id_case).flip();
      this.id_byte();
   }

   public static void id_class(int var0, int var1) {
      RenderSystem.glUniform1i(var0, var1);
   }

   public static int id_class(String var0) {
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

   public String id_class() {
      return this.id_catch;
   }

   public void id_class(int var1) {
      this.id_break = var1;
   }

   @Override
   public void close() {
      if (this.id_throws != null) {
         MemoryUtil.memFree(this.id_throws);
      }

      if (this.id_case != null) {
         MemoryUtil.memFree(this.id_case);
      }
   }

   public void id_break() {
      if (!this.id_private) {
      }

      this.id_private = false;
      if (this.id_protected <= 3) {
         this.id_protected();
      } else if (this.id_protected <= 7) {
         this.id_throws();
      } else {
         if (this.id_protected > 10) {
            id_class.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", this.id_protected);
            return;
         }

         this.id_case();
      }
   }

   public static int id_break(int var0, CharSequence var1) {
      return MT.id_byte(var0, var1);
   }

   @Override
   public void id_break(float var1, float var2, float var3, float var4) {
      ((Buffer)this.id_case).position(0);
      if (this.id_protected >= 4) {
         this.id_case.put(0, var1);
      }

      if (this.id_protected >= 5) {
         this.id_case.put(1, var2);
      }

      if (this.id_protected >= 6) {
         this.id_case.put(2, var3);
      }

      if (this.id_protected >= 7) {
         this.id_case.put(3, var4);
      }

      this.id_byte();
   }

   private void id_throws() {
      ((Buffer)this.id_case).clear();
      switch (this.id_protected) {
         case 4:
            RenderSystem.glUniform1(this.id_break, this.id_case);
            break;
         case 5:
            RenderSystem.glUniform2(this.id_break, this.id_case);
            break;
         case 6:
            RenderSystem.glUniform3(this.id_break, this.id_case);
            break;
         case 7:
            RenderSystem.glUniform4(this.id_break, this.id_case);
            break;
         default:
            id_class.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", this.id_byte);
      }
   }

   private void id_case() {
      ((Buffer)this.id_case).clear();
      switch (this.id_protected) {
         case 8:
            RenderSystem.glUniformMatrix2(this.id_break, false, this.id_case);
            break;
         case 9:
            RenderSystem.glUniformMatrix3(this.id_break, false, this.id_case);
            break;
         case 10:
            RenderSystem.glUniformMatrix4(this.id_break, false, this.id_case);
      }
   }

   private void id_protected() {
      ((Buffer)this.id_case).clear();
      switch (this.id_protected) {
         case 0:
            RenderSystem.glUniform1(this.id_break, this.id_throws);
            break;
         case 1:
            RenderSystem.glUniform2(this.id_break, this.id_throws);
            break;
         case 2:
            RenderSystem.glUniform3(this.id_break, this.id_throws);
            break;
         case 3:
            RenderSystem.glUniform4(this.id_break, this.id_throws);
            break;
         default:
            id_class.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", this.id_byte);
      }
   }
}
