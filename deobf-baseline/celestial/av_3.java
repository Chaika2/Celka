package celestial;

import java.util.Random;

public class av_3 {
   private final rmE_2 id_protected;
   private final rut_3<Integer> id_throws;
   private final rut_3<Boolean> id_case;
   public boolean id_class;
   public int id_break;
   public int id_byte;

   public av_3(rmE_2 var1, rut_3<Integer> var2, rut_3<Boolean> var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
   }

   public void id_class(boolean var1) {
      this.id_protected.id_break(this.id_case, var1);
   }

   public void id_class(rcd_3 var1) {
      var1.id_class("Saddle", this.id_break());
   }

   public void id_class() {
      this.id_class = true;
      this.id_break = 0;
      this.id_byte = this.id_protected.id_class(this.id_throws);
   }

   public boolean id_class(Random var1) {
      if (this.id_class) {
         return false;
      } else {
         this.id_class = true;
         this.id_break = 0;
         this.id_byte = var1.nextInt(841) + 140;
         this.id_protected.id_break(this.id_throws, this.id_byte);
         return true;
      }
   }

   public void id_break(rcd_3 var1) {
      this.id_class(var1.id_new("Saddle"));
   }

   public boolean id_break() {
      return this.id_protected.id_class(this.id_case);
   }
}
