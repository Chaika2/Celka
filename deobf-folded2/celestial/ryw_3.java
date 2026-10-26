package celestial;

import java.util.function.Predicate;

public class ryw_3 {
   private final rRR id_class;
   private final rfH_2 id_break;
   private final boolean id_byte;
   private xc_3 id_protected;
   private ryO_2 id_throws;
   private boolean id_case;

   public rRR id_byte() {
      return this.id_class;
   }

   public ryw_3(rRR var1, rfH_2 var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2.id_int();
      this.id_byte = var3;
   }

   public xc_3 id_class() {
      if (this.id_protected == null && (this.id_byte || this.id_class.id_int(this.id_break))) {
         this.id_protected = this.id_class.id_byte(this.id_break);
      }

      return this.id_protected;
   }

   public static Predicate<ryw_3> id_class(Predicate<xc_3> var0) {
      return var1 -> var1 != null && var0.test(var1.id_class());
   }

   public ryO_2 id_break() {
      if (this.id_throws == null && !this.id_case) {
         this.id_throws = this.id_class.id_class(this.id_break);
         this.id_case = true;
      }

      return this.id_throws;
   }

   public rfH_2 id_protected() {
      return this.id_break;
   }
}
