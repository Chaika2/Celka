package celestial;

import java.util.Objects;

public class rrGE {
   private final rfH_2 class_;
   private final rxL_2 break_;
   private final rgP_2 byte_;

   public rgP_2 byte_() {
      return this.byte_;
   }

   public rrGE(rfH_2 var1, rxL_2 var2, rgP_2 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrGE var2 = (rrGE)var1;
         return Objects.equals(this.class_, var2.class_) && this.break_ == var2.break_ && Objects.equals(this.byte_, var2.byte_);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.class_, this.break_, this.byte_);
   }

   public static rrGE class_(rcd_3 var0) {
      rfH_2 var1 = rco_3.break_(var0.int_("Pos"));
      rxL_2 var2 = rxL_2.class_(var0.native_("Color"), rxL_2.WHITE);
      rVi_1 var3 = var0.throws_("Name") ? rgB_2.class_(var0.native_("Name")) : null;
      return new rrGE(var1, var2, var3);
   }

   public static rrGE class_(rRq_1 var0, rfH_2 var1) {
      if (var0.class_(var1) instanceof rHb_1 var3) {
         rxL_2 var4 = var3.class_(() -> var0.byte_(var1));
         rgP_2 var5 = var3.Bk() ? var3.rD() : null;
         return new rrGE(var1, var4, var5);
      } else {
         return null;
      }
   }

   public rfH_2 class_() {
      return this.class_;
   }

   public rrGh_1 break_() {
      switch (this.break_) {
         case WHITE:
            return rrGh_1.BANNER_WHITE;
         case ORANGE:
            return rrGh_1.BANNER_ORANGE;
         case MAGENTA:
            return rrGh_1.BANNER_MAGENTA;
         case LIGHT_BLUE:
            return rrGh_1.BANNER_LIGHT_BLUE;
         case YELLOW:
            return rrGh_1.BANNER_YELLOW;
         case LIME:
            return rrGh_1.BANNER_LIME;
         case PINK:
            return rrGh_1.BANNER_PINK;
         case GRAY:
            return rrGh_1.BANNER_GRAY;
         case LIGHT_GRAY:
            return rrGh_1.BANNER_LIGHT_GRAY;
         case CYAN:
            return rrGh_1.BANNER_CYAN;
         case PURPLE:
            return rrGh_1.BANNER_PURPLE;
         case BLUE:
            return rrGh_1.BANNER_BLUE;
         case BROWN:
            return rrGh_1.BANNER_BROWN;
         case GREEN:
            return rrGh_1.BANNER_GREEN;
         case RED:
            return rrGh_1.BANNER_RED;
         case BLACK:
         default:
            return rrGh_1.BANNER_BLACK;
      }
   }

   public String throws_() {
      return "banner-" + this.class_.b_() + "," + this.class_.c_() + "," + this.class_.d_();
   }

   public rcd_3 protected_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("Pos", rco_3.class_(this.class_));
      var1.class_("Color", this.break_.byte_());
      if (this.byte_ != null) {
         var1.class_("Name", rgB_2.class_(this.byte_));
      }

      return var1;
   }
}
