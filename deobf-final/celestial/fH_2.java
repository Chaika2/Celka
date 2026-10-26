package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fH_2 extends ff_3 {
   static final Logger class_ = LogManager.getLogger();
   protected final rqO_2 byte_;
   private rAL break_;
   public rqO_2 protected_;
   public boolean throws_;

   public rqO_2 byte_() {
      return this.byte_;
   }

   public fH_2(rqO_2 var1) {
      this.byte_ = var1;
   }

   protected fy_3 class_(rAL var1) {
      return fy_3.class_(var1, this.byte_);
   }

   private void class_(fN_2 var1, boolean var2, boolean var3) {
      fo_3.class_(this.new_(), 0, var1.class_(), var1.break_());
      var1.class_(0, 0, 0, 0, 0, var1.class_(), var1.break_(), var2, var3, false, true);
      if (rrbb_3.rs()) {
         rrdA.class_(this.new_(), var1, var2, var3, this.break_, this.byte_, this.this_());
      }

      if (rrbY_2.class_()) {
         rrbY_2.class_(this.byte_, this);
      }
   }

   public fy_3 break_() {
      return fy_3.class_(QY.instanceof_().F(), this.byte_);
   }

   @Override
   public void a_(rAL var1) throws IOException {
      this.break_ = var1;
      fy_3 var2 = this.class_(var1);
      var2.byte_();
      Vs_1 var3 = var2.class_();
      boolean var4;
      boolean var5;
      if (var3 != null) {
         var4 = var3.class_();
         var5 = var3.break_();
      } else {
         var4 = false;
         var5 = false;
      }

      fN_2 var6 = var2.break_();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.class_(var6, var4, var5));
      } else {
         this.class_(var6, var4, var5);
      }
   }
}
