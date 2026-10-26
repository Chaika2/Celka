package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public abstract class ryO_2 implements ao_3 {
   private static final Logger id_class = LogManager.getLogger();
   private final ryW_2<?> id_break;
   protected rYB id_extends;
   protected rfH_2 id_native = rfH_2.id_protected;
   protected boolean id_volatile;
   private xc_3 id_byte;
   private boolean id_protected;

   public rfH_2 id_char() {
      return this.id_native;
   }

   public void id_byte(rfH_2 var1) {
      this.id_native = var1.id_int();
   }

   public void id_int() {
      this.id_volatile = false;
   }

   public boolean id_long() {
      return this.id_volatile;
   }

   public void id_float() {
      this.id_byte = null;
   }

   public ryO_2(ryW_2<?> var1) {
      this.id_break = var1;
   }

   public boolean id_interface() {
      return this.id_extends != null;
   }

   public void id_class(xc_3 var1, rcd_3 var2) {
      this.id_native = new rfH_2(var2.id_private("x"), var2.id_private("y"), var2.id_private("z"));
   }

   public void id_class(Ko_1 var1) {
      var1.id_class("Name", () -> rVL.r.id_break(this.id_void()) + " // " + this.getClass().getCanonicalName());
      if (this.id_extends != null) {
         Ko_1.id_class(var1, this.id_native, this.id_abstract());
         Ko_1.id_class(var1, this.id_native, this.id_extends.id_byte(this.id_native));
      }
   }

   public rcd_3 id_class(rcd_3 var1) {
      return this.id_break(var1);
   }

   public ryW_2<?> id_void() {
      return this.id_break;
   }

   public static ryO_2 id_break(xc_3 var0, rcd_3 var1) {
      String var2 = var1.id_native("id");
      return rVL.r.id_break(new rqO_2(var2)).map(var1x -> {
         try {
            return var1x.id_class();
         } catch (Throwable var3) {
            id_class.error("Failed to create block entity {}", var2, var3);
            return null;
         }
      }).map(var3 -> {
         try {
            var3.id_class(var0, var1);
            return (ryO_2)var3;
         } catch (Throwable var5) {
            id_class.error("Failed to load data for block entity {}", var2, var5);
            return null;
         }
      }).orElseGet(() -> {
         id_class.warn("Skipping BlockEntity with id {}", var2);
         return null;
      });
   }

   private rcd_3 id_break(rcd_3 var1) {
      rqO_2 var2 = ryW_2.id_class(this.id_void());
      if (var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.id_class("id", var2.toString());
         var1.id_break("x", this.id_native.b_());
         var1.id_break("y", this.id_native.c_());
         var1.id_break("z", this.id_native.d_());
         return var1;
      }
   }

   public void id_break(rpa_3 var1) {
   }

   public void id_break() {
      if (this.id_extends != null) {
         this.id_byte = this.id_extends.id_byte(this.id_native);
         this.id_extends.id_break(this.id_native, this);
         if (!this.id_byte.id_catch()) {
            this.id_extends.id_byte(this.id_native, this.id_byte.id_break());
         }
      }
   }

   public void id_break(rqd_3 var1) {
   }

   public void id_break(rYB var1, rfH_2 var2) {
      this.id_extends = var1;
      this.id_native = var2.id_int();
   }

   public double id_implements() {
      return 64.0;
   }

   public rYB id_while() {
      return this.id_extends;
   }

   public void id_static() {
      if (!this.id_protected) {
         this.id_protected = true;
         id_class.warn("Block entity invalid: {} @ {}", new Supplier[]{() -> rVL.r.id_break(this.id_void()), this::id_char});
      }
   }

   public xc_3 id_abstract() {
      if (this.id_byte == null) {
         this.id_byte = this.id_extends.id_byte(this.id_native);
      }

      return this.id_byte;
   }

   public void aa_() {
      this.id_volatile = true;
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
      return this.id_break(new rcd_3());
   }
}
