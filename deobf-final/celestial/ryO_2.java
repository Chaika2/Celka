package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public abstract class ryO_2 implements ao_3 {
   private static final Logger class_ = LogManager.getLogger();
   private final ryW_2<?> break_;
   protected rYB extends_;
   protected rfH_2 native_ = rfH_2.protected_;
   protected boolean volatile_;
   private xc_3 byte_;
   private boolean protected_;

   public rfH_2 char_() {
      return this.native_;
   }

   public void byte_(rfH_2 var1) {
      this.native_ = var1.int_();
   }

   public void int_() {
      this.volatile_ = false;
   }

   public boolean long_() {
      return this.volatile_;
   }

   public void float_() {
      this.byte_ = null;
   }

   public ryO_2(ryW_2<?> var1) {
      this.break_ = var1;
   }

   public boolean interface_() {
      return this.extends_ != null;
   }

   public void class_(xc_3 var1, rcd_3 var2) {
      this.native_ = new rfH_2(var2.private_("x"), var2.private_("y"), var2.private_("z"));
   }

   public void class_(Ko_1 var1) {
      var1.class_("Name", () -> rVL.r.break_(this.void_()) + " // " + this.getClass().getCanonicalName());
      if (this.extends_ != null) {
         Ko_1.class_(var1, this.native_, this.abstract_());
         Ko_1.class_(var1, this.native_, this.extends_.byte_(this.native_));
      }
   }

   public rcd_3 class_(rcd_3 var1) {
      return this.break_(var1);
   }

   public ryW_2<?> void_() {
      return this.break_;
   }

   public static ryO_2 break_(xc_3 var0, rcd_3 var1) {
      String var2 = var1.native_("id");
      return rVL.r.break_(new rqO_2(var2)).map(var1x -> {
         try {
            return var1x.class_();
         } catch (Throwable var3) {
            class_.error("Failed to create block entity {}", var2, var3);
            return null;
         }
      }).map(var3 -> {
         try {
            var3.class_(var0, var1);
            return (ryO_2)var3;
         } catch (Throwable var5) {
            class_.error("Failed to load data for block entity {}", var2, var5);
            return null;
         }
      }).orElseGet(() -> {
         class_.warn("Skipping BlockEntity with id {}", var2);
         return null;
      });
   }

   private rcd_3 break_(rcd_3 var1) {
      rqO_2 var2 = ryW_2.class_(this.void_());
      if (var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.class_("id", var2.toString());
         var1.break_("x", this.native_.b_());
         var1.break_("y", this.native_.c_());
         var1.break_("z", this.native_.d_());
         return var1;
      }
   }

   public void break_(rpa_3 var1) {
   }

   public void break_() {
      if (this.extends_ != null) {
         this.byte_ = this.extends_.byte_(this.native_);
         this.extends_.break_(this.native_, this);
         if (!this.byte_.catch_()) {
            this.extends_.byte_(this.native_, this.byte_.break_());
         }
      }
   }

   public void break_(rqd_3 var1) {
   }

   public void break_(rYB var1, rfH_2 var2) {
      this.extends_ = var1;
      this.native_ = var2.int_();
   }

   public double implements_() {
      return 64.0;
   }

   public rYB while_() {
      return this.extends_;
   }

   public void static_() {
      if (!this.protected_) {
         this.protected_ = true;
         class_.warn("Block entity invalid: {} @ {}", new Supplier[]{() -> rVL.r.break_(this.void_()), this::char_});
      }
   }

   public xc_3 abstract_() {
      if (this.byte_ == null) {
         this.byte_ = this.extends_.byte_(this.native_);
      }

      return this.byte_;
   }

   public void aa_() {
      this.volatile_ = true;
   }

   public boolean ac_() {
      return false;
   }

   public boolean a_(int var1, int var2) {
      return false;
   }

   public rFy_1 Y_() {
      return null;
   }

   public rcd_3 Z_() {
      return this.break_(new rcd_3());
   }
}
