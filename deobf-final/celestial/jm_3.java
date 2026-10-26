package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class jm_3 implements AutoCloseable {
   private int class_;
   private final jZ_2 break_;
   private int byte_;
   private rrxH_2 protected_;
   private rrxl_3 throws_;
   private int case_;
   private rrxm_3 catch_;

   private void byte_(lD_2 var1) {
      Pair var2 = var1.extends_();
      this.case_ = 0;
      lU_2 var3 = (lU_2)var2.getFirst();
      if (var3.protected_() != 7) {
         this.case_ = var3.protected_();
      }

      if (this.protected_ != null) {
         ByteBuffer var4 = (ByteBuffer)var2.getSecond();
         this.protected_.class_(var4, this.throws_);
      } else {
         this.catch_ = var3.class_();
         if (this.class_ != -1) {
            ByteBuffer var5 = (ByteBuffer)var2.getSecond();
            this.byte_ = var5.remaining() / this.break_.break_();
            this.class_();
            RenderSystem.glBufferData(34962, var5, 35044);
            break_();
         }
      }
   }

   public rrxH_2 byte_() {
      return this.protected_;
   }

   public jm_3(jZ_2 var1) {
      this.break_ = var1;
      RenderSystem.glGenBuffers(var1x -> this.class_ = var1x);
   }

   public void class_(int var1) {
      if (this.case_ > 0) {
         var1 = this.case_;
      }

      if (this.protected_ != null) {
         this.protected_.class_(var1, this.throws_);
      } else if (this.catch_ != null) {
         rrxZ_2.class_(var1, this.catch_);
      } else {
         RenderSystem.drawArrays(var1, 0, this.byte_);
      }
   }

   public void class_(rrxH_2 var1) {
      if (var1 != null) {
         this.close();
         this.protected_ = var1;
         this.throws_ = new rrxl_3();
      }
   }

   public void class_() {
      MT.catch_(34962, this.class_);
   }

   public void class_(lD_2 var1) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.byte_(var1));
      } else {
         this.byte_(var1);
      }
   }

   public void class_(rjV_2 var1, int var2) {
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(var1);
      if (this.case_ > 0) {
         var2 = this.case_;
      }

      if (this.protected_ != null) {
         this.protected_.class_(var2, this.throws_);
      } else if (this.catch_ != null) {
         rrxZ_2.class_(var2, this.catch_);
      } else {
         RenderSystem.drawArrays(var2, 0, this.byte_);
      }

      RenderSystem.popMatrix();
   }

   @Override
   public void close() {
      if (this.class_ >= 0) {
         RenderSystem.glDeleteBuffers(this.class_);
         this.class_ = -1;
      }
   }

   public static void break_() {
      MT.catch_(34962, 0);
   }

   public CompletableFuture<Void> break_(lD_2 var1) {
      if (!RenderSystem.isOnRenderThread()) {
         return CompletableFuture.runAsync(() -> this.byte_(var1), var0 -> RenderSystem.recordRenderCall(var0::run));
      } else {
         this.byte_(var1);
         return CompletableFuture.completedFuture((Void)null);
      }
   }
}
