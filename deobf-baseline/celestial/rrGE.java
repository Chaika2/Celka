package celestial;

import java.util.Objects;

public class rrGE {
   private final rfH_2 id_class;
   private final rxL_2 id_break;
   private final rgP_2 id_byte;

   public rgP_2 id_byte() {
      return this.id_byte;
   }

   public rrGE(rfH_2 var1, rxL_2 var2, rgP_2 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrGE var2 = (rrGE)var1;
         return Objects.equals(this.id_class, var2.id_class) && this.id_break == var2.id_break && Objects.equals(this.id_byte, var2.id_byte);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_class, this.id_break, this.id_byte);
   }

   public static rrGE id_class(rcd_3 var0) {
      rfH_2 var1 = rco_3.id_break(var0.id_int("Pos"));
      rxL_2 var2 = rxL_2.id_class(var0.id_native("Color"), rxL_2.WHITE);
      rVi_1 var3 = var0.id_throws("Name") ? rgB_2.id_class(var0.id_native("Name")) : null;
      return new rrGE(var1, var2, var3);
   }

   public static rrGE id_class(rRq_1 var0, rfH_2 var1) {
      if (var0.id_class(var1) instanceof rHb_1 var3) {
         rxL_2 var4 = var3.id_class(() -> var0.id_byte(var1));
         rgP_2 var5 = var3.Bk() ? var3.rD() : null;
         return new rrGE(var1, var4, var5);
      } else {
         return null;
      }
   }

   public rfH_2 id_class() {
      return this.id_class;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rrGh_1 id_break() {
      switch (this.id_break) {
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

   public String id_throws() {
      return "banner-" + this.id_class.b_() + "," + this.id_class.c_() + "," + this.id_class.d_();
   }

   public rcd_3 id_protected() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("Pos", rco_3.id_class(this.id_class));
      var1.id_class("Color", this.id_break.id_byte());
      if (this.id_byte != null) {
         var1.id_class("Name", rgB_2.id_class(this.id_byte));
      }

      return var1;
   }
}
