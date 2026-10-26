package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class jm_3 implements AutoCloseable {
   private int id_class;
   private final jZ_2 id_break;
   private int id_byte;
   private rrxH_2 id_protected;
   private rrxl_3 id_throws;
   private int id_case;
   private rrxm_3 id_catch;

   private void id_byte(lD_2 var1) {
      Pair var2 = var1.id_extends();
      this.id_case = 0;
      lU_2 var3 = (lU_2)var2.getFirst();
      if (var3.id_protected() != 7) {
         this.id_case = var3.id_protected();
      }

      if (this.id_protected != null) {
         ByteBuffer var4 = (ByteBuffer)var2.getSecond();
         this.id_protected.id_class(var4, this.id_throws);
      } else {
         this.id_catch = var3.id_class();
         if (this.id_class != -1) {
            ByteBuffer var5 = (ByteBuffer)var2.getSecond();
            this.id_byte = var5.remaining() / this.id_break.id_break();
            this.id_class();
            RenderSystem.glBufferData(34962, var5, 35044);
            id_break();
         }
      }
   }

   public rrxH_2 id_byte() {
      return this.id_protected;
   }

   public jm_3(jZ_2 var1) {
      this.id_break = var1;
      RenderSystem.glGenBuffers(var1x -> this.id_class = var1x);
   }

   public void id_class(int var1) {
      if (this.id_case > 0) {
         var1 = this.id_case;
      }

      if (this.id_protected != null) {
         this.id_protected.id_class(var1, this.id_throws);
      } else if (this.id_catch != null) {
         rrxZ_2.id_class(var1, this.id_catch);
      } else {
         RenderSystem.drawArrays(var1, 0, this.id_byte);
      }
   }

   public void id_class(rrxH_2 var1) {
      if (var1 != null) {
         this.close();
         this.id_protected = var1;
         this.id_throws = new rrxl_3();
      }
   }

   public void id_class() {
      MT.id_catch(34962, this.id_class);
   }

   public void id_class(lD_2 var1) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.id_byte(var1));
      } else {
         this.id_byte(var1);
      }
   }

   public void id_class(rjV_2 var1, int var2) {
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(var1);
      if (this.id_case > 0) {
         var2 = this.id_case;
      }

      if (this.id_protected != null) {
         this.id_protected.id_class(var2, this.id_throws);
      } else if (this.id_catch != null) {
         rrxZ_2.id_class(var2, this.id_catch);
      } else {
         RenderSystem.drawArrays(var2, 0, this.id_byte);
      }

      RenderSystem.popMatrix();
   }

   @Override
   public void close() {
      if (this.id_class >= 0) {
         RenderSystem.glDeleteBuffers(this.id_class);
         this.id_class = -1;
      }
   }

   public static void id_break() {
      MT.id_catch(34962, 0);
   }

   public CompletableFuture<Void> id_break(lD_2 var1) {
      if (!RenderSystem.isOnRenderThread()) {
         return CompletableFuture.runAsync(() -> this.id_byte(var1), var0 -> RenderSystem.recordRenderCall(var0::run));
      } else {
         this.id_byte(var1);
         return CompletableFuture.completedFuture((Void)null);
      }
   }
}
