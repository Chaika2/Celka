package celestial;

import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mt_3 extends vm_3 {
   private static final AtomicInteger id_class = new AtomicInteger(0);
   static final Logger id_throws = LogManager.getLogger();
   rud_3 id_case;
   boolean id_catch;
   final vm_3 id_private;
   private rgP_2 id_implements = new rgn_3("connect.connecting");
   private long id_finally = -1L;

   public mt_3(vm_3 var1, QY var2, String var3, int var4) {
      super(rgN_2.id_byte);
      this.id_volatile = var2;
      this.id_private = var1;
      var2.id_transient();
      this.id_class(var3, var4);
   }

   public mt_3(vm_3 var1, QY var2, Ak_1 var3, int var4) {
      super(rgN_2.id_byte);
      this.id_volatile = var2;
      this.id_private = var1;
      Ad_1 var5 = Ad_1.id_class(var3.id_break);
      var2.id_transient();
      var2.id_class(var3);
      rrft_3.id_class(() -> this.id_class(var5.id_class(), var5.id_break()), var4);
   }

   public mt_3(vm_3 var1, QY var2, Ak_1 var3) {
      super(rgN_2.id_byte);
      this.id_volatile = var2;
      this.id_private = var1;
      Ad_1 var4 = Ad_1.id_class(var3.id_break);
      var2.id_transient();
      var2.id_class(var3);
      this.id_class(var4.id_class(), var4.id_break());
   }

   private void id_class(String var1, int var2) {
      ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0]).id_class((rrZr_1)rrQJ.id_class[5], var1);
      id_throws.info("Connecting to {}, {}", var1, var2);
      mw_3 var3 = new mw_3(this, "Server Connector #" + id_class.incrementAndGet(), var1, var2);
      var3.setUncaughtExceptionHandler(new rya_3(id_throws));
      var3.start();
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      long var5 = rqR_2.id_break();
      if (var5 - this.id_finally > 2000L) {
         this.id_finally = var5;
      }

      id_class(var1, this.id_super, this.id_implements, this.id_package / 2, this.id_int / 2 - 50, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   void id_break(rgP_2 var1) {
      this.id_implements = var1;
   }

   @Override
   public void id_private() {
      if (this.id_case != null) {
         if (this.id_case.id_case()) {
            this.id_case.id_class();
         } else {
            this.id_case.id_native();
         }
      }
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120 + 12, 200, 20, cN_2.id_protected, var1 -> {
         this.id_catch = true;
         if (this.id_case != null) {
            this.id_case.id_class(new rgn_3("connect.aborted"));
         }

         this.id_volatile.id_break(this.id_private);
      })));
   }
}
