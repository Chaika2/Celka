package celestial;

import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mt_3 extends vm_3 {
   private static final AtomicInteger class_ = new AtomicInteger(0);
   static final Logger throws_ = LogManager.getLogger();
   rud_3 case_;
   boolean catch_;
   final vm_3 private_;
   private rgP_2 implements_ = new rgn_3("connect.connecting");
   private long finally_ = -1L;

   public mt_3(vm_3 var1, QY var2, String var3, int var4) {
      super(rgN_2.byte_);
      this.volatile_ = var2;
      this.private_ = var1;
      var2.transient_();
      this.class_(var3, var4);
   }

   public mt_3(vm_3 var1, QY var2, Ak_1 var3, int var4) {
      super(rgN_2.byte_);
      this.volatile_ = var2;
      this.private_ = var1;
      Ad_1 var5 = Ad_1.class_(var3.break_);
      var2.transient_();
      var2.class_(var3);
      rrft_3.class_(() -> this.class_(var5.class_(), var5.break_()), var4);
   }

   public mt_3(vm_3 var1, QY var2, Ak_1 var3) {
      super(rgN_2.byte_);
      this.volatile_ = var2;
      this.private_ = var1;
      Ad_1 var4 = Ad_1.class_(var3.break_);
      var2.transient_();
      var2.class_(var3);
      this.class_(var4.class_(), var4.break_());
   }

   private void class_(String var1, int var2) {
      ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0]).class_((rrZr_1)rrQJ.class_[5], var1);
      throws_.info("Connecting to {}, {}", var1, var2);
      mw_3 var3 = new mw_3(this, "Server Connector #" + class_.incrementAndGet(), var1, var2);
      var3.setUncaughtExceptionHandler(new rya_3(throws_));
      var3.start();
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      long var5 = rqR_2.break_();
      if (var5 - this.finally_ > 2000L) {
         this.finally_ = var5;
      }

      class_(var1, this.super_, this.implements_, this.package_ / 2, this.int_ / 2 - 50, 16777215);
      super.class_(var1, var2, var3, var4);
   }

   void break_(rgP_2 var1) {
      this.implements_ = var1;
   }

   @Override
   public void private_() {
      if (this.case_ != null) {
         if (this.case_.case_()) {
            this.case_.class_();
         } else {
            this.case_.native_();
         }
      }
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 120 + 12, 200, 20, cN_2.protected_, var1 -> {
         this.catch_ = true;
         if (this.case_ != null) {
            this.case_.class_(new rgn_3("connect.aborted"));
         }

         this.volatile_.break_(this.private_);
      })));
   }
}
