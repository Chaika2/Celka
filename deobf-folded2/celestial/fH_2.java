package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fH_2 extends ff_3 {
   static final Logger id_class = LogManager.getLogger();
   protected final rqO_2 id_byte;
   private rAL id_break;
   public rqO_2 id_protected;
   public boolean id_throws;

   public rqO_2 id_byte() {
      return this.id_byte;
   }

   public fH_2(rqO_2 var1) {
      this.id_byte = var1;
   }

   protected fy_3 id_class(rAL var1) {
      return fy_3.id_class(var1, this.id_byte);
   }

   private void id_class(fN_2 var1, boolean var2, boolean var3) {
      fo_3.id_class(this.id_new(), 0, var1.id_class(), var1.id_break());
      var1.id_class(0, 0, 0, 0, 0, var1.id_class(), var1.id_break(), var2, var3, false, true);
      if (rrbb_3.rs()) {
         rrdA.id_class(this.id_new(), var1, var2, var3, this.id_break, this.id_byte, this.id_this());
      }

      if (rrbY_2.id_class()) {
         rrbY_2.id_class(this.id_byte, this);
      }
   }

   public fy_3 id_break() {
      return fy_3.id_class(QY.id_instanceof().F(), this.id_byte);
   }

   @Override
   public void a_(rAL var1) throws IOException {
      this.id_break = var1;
      fy_3 var2 = this.id_class(var1);
      var2.id_byte();
      Vs_1 var3 = var2.id_class();
      boolean var4;
      boolean var5;
      if (var3 != null) {
         var4 = var3.id_class();
         var5 = var3.id_break();
      } else {
         var4 = false;
         var5 = false;
      }

      fN_2 var6 = var2.id_break();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.id_class(var6, var4, var5));
      } else {
         this.id_class(var6, var4, var5);
      }
   }
}
