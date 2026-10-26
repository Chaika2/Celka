package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSF extends rSp_1 {
   private static final Logger id_break = LogManager.getLogger();
   private rjU_2 id_byte;
   private int id_protected;

   @Override
   public void id_byte() {
      this.id_byte = null;
      this.id_protected = 0;
   }

   public rSF(rSu_1 var1) {
      super(var1);
   }

   public void id_class(rjU_2 var1) {
      this.id_byte = var1;
   }

   @Override
   public void id_break() {
      if (this.id_byte == null) {
         id_break.warn("Aborting charge player as no target was set.");
         this.id_class.L().id_class(rST.id_class);
      } else if (this.id_protected > 0 && this.id_protected++ >= 10) {
         this.id_class.L().id_class(rST.id_class);
      } else {
         double var1 = this.id_byte.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
         if (var1 < 100.0 || var1 > 22500.0 || (Boolean)this.id_class.id_throws[23] || (Boolean)this.id_class.id_throws[24]) {
            this.id_protected++;
         }
      }
   }

   @Override
   public float id_throws() {
      return 3.0F;
   }

   @Override
   public rjU_2 id_case() {
      return this.id_byte;
   }

   @Override
   public rST<rSF> id_protected() {
      return rST.id_implements;
   }
}
