package celestial;

import java.util.List;
import java.util.Random;

public class rrrG extends rrrc_1 {
   public rrrG(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_return, var1);
      this.id_class(var4);
      this.id_protected = this.id_class(var2);
      this.id_final = var3;
   }

   public rrrG(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_return, var2);
   }

   public static rrrG id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return id_class(var7) && rrrn_1.id_class(var0, var7) == null ? new rrrG(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 4, 4, 4, true, var4, rii_3.id_throws);
      this.id_class(var1, var4, var5, this.id_protected, 1, 1, 0);
      rpr_3 var8 = this.id_implements();
      if (var8 != rpr_3.NORTH && var8 != rpr_3.EAST) {
         this.id_class(var1, var5, 4, 1, 1, 4, 3, 3, id_volatile, id_volatile, false);
      } else {
         this.id_class(var1, var5, 0, 1, 1, 0, 3, 3, id_volatile, id_volatile, false);
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      rpr_3 var4 = this.id_implements();
      if (var4 != rpr_3.NORTH && var4 != rpr_3.EAST) {
         this.id_byte((rrrd_1)var1, var2, var3, 1, 1);
      } else {
         this.id_break((rrrd_1)var1, var2, var3, 1, 1);
      }
   }
}
