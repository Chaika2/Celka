package celestial;

import java.util.List;

public class rrrm_1 extends rrrH<rUt_1> {
   private final long id_throws;

   public rrrm_1(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.id_throws = var6;
   }

   public void id_class(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      int var8 = 0;

      rrrd_1 var9;
      do {
         this.id_break.clear();
         this.id_byte = rfi_3.id_class();
         this.id_protected.id_byte(this.id_throws + (long)(var8++), var4, var5);
         rii_3.id_class();
         var9 = new rrrd_1(this.id_protected, (var4 << 4) + 2, (var5 << 4) + 2);
         this.id_break.add(var9);
         var9.id_class(var9, this.id_break, this.id_protected);
         List var10 = var9.id_byte;

         while (!var10.isEmpty()) {
            int var11 = this.id_protected.nextInt(var10.size());
            rrrn_1 var12 = (rrrn_1)var10.remove(var11);
            var12.id_class(var9, this.id_break, this.id_protected);
         }

         this.id_break();
         this.id_class(var2.id_case(), this.id_protected, 10);
      } while (this.id_break.isEmpty() || var9.id_break == null);
   }
}
