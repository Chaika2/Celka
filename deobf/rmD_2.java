package celestial;

import java.io.IOException;

public class rmD_2 implements ruS_2<rmH_2> {
   private int id_protected;
   private rmU_2 id_throws;
   private int id_case;
   public static rmU_2 id_class;
   public static boolean id_break;
   public static boolean id_byte;

   public int id_byte() {
      return this.id_case;
   }

   public rmD_2(an_3 var1, rmU_2 var2, int var3) {
      this.id_protected = var1.V();
      this.id_throws = var2;
      this.id_case = var3;
      id_class = var2;
      if (var2 == rmU_2.START_SPRINTING) {
         id_break = true;
      } else if (var2 == rmU_2.STOP_SPRINTING) {
         id_break = false;
      }

      if (var2 == rmU_2.PRESS_SHIFT_KEY) {
         id_byte = true;
      } else if (var2 == rmU_2.RELEASE_SHIFT_KEY) {
         id_byte = false;
      }

   }

   public rmD_2(an_3 var1, rmU_2 var2) {
      this(var1, var2, 0);
   }

   public rmD_2() {
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   public void id_class(ruu_3 var1) throws IOException {
      this.id_protected = var1.id_case();
      this.id_throws = (rmU_2)var1.id_class(rmU_2.class);
      this.id_case = var1.id_case();
   }

   public rmU_2 id_break() {
      return this.id_throws;
   }

   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_protected);
      var1.id_class(this.id_throws);
      var1.id_protected(this.id_case);
   }
}
