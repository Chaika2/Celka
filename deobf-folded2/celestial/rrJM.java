package celestial;

import java.util.List;

public class rrJM extends vm_3 {
   protected List<LZ> id_throws = this.id_new;
   protected cm_3 id_case = (cm_3)QY.id_instanceof().id_class[15];
   protected boolean id_catch = false;

   protected void id_byte(LZ var1) {
   }

   public rrJM(rgP_2 var1) {
      super(var1);
   }

   public static void id_class(Ml_1 var0, cm_3 var1, rpl_3 var2, int var3, int var4, int var5) {
      var1.id_class(var0, var2, (float)(var3 - var1.id_class(var2) / 2), (float)var4, var5);
   }

   public static LZ id_class(int var0, int var1, List<LZ> var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         LZ var4 = (LZ)var2.get(var3);
         if (var4.id_new) {
            int var5 = rrWl_1.id_class(var4);
            int var6 = rrWl_1.id_break(var4);
            if (var0 >= var4.id_volatile && var1 >= var4.id_final && var0 < var4.id_volatile + var5 && var1 < var4.id_final + var6) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      return !this.id_catch ? false : super.id_class(var1, var3, var5, var6, var8);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      if (!this.id_catch) {
         return false;
      } else {
         this.id_catch = false;
         this.id_class(false);
         return this.id_catch() != null && this.id_catch().id_class(var1, var3, var5) ? true : super.id_class(var1, var3, var5);
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      boolean var6 = super.id_break(var1, var3, var5);
      this.id_catch = true;
      LZ var7 = id_class((int)var1, (int)var3, this.id_throws);
      if (var7 != null && var7.id_int) {
         if (var5 == 1 && var7 instanceof rrJO var8 && var8.id_implements() == QF.id_public) {
            var7.id_class(super.id_volatile.c());
         }

         if (var5 == 0) {
            this.id_break(var7);
         } else if (var5 == 1) {
            this.id_byte(var7);
         }

         return true;
      } else {
         return var6;
      }
   }

   protected void id_break(LZ var1) {
   }
}
