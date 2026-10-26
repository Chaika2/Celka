package celestial;

import java.util.List;

public class rav_3 extends rrrH<rUt_1> {
   public rav_3(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void id_class(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      rac_3 var8 = new rac_3(this.id_protected, (var4 << 4) + 2, (var5 << 4) + 2);
      this.id_break.add(var8);
      var8.id_class(var8, this.id_break, this.id_protected);
      List var9 = var8.id_protected;

      while (!var9.isEmpty()) {
         int var10 = this.id_protected.nextInt(var9.size());
         rrrn_1 var11 = (rrrn_1)var9.remove(var10);
         var11.id_class(var8, this.id_break, this.id_protected);
      }

      this.id_break();
      this.id_class(this.id_protected, 48, 70);
   }
}
