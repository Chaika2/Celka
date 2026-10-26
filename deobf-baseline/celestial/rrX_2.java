package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrX_2 extends rPm_1<rsq_3> {
   private long id_class;
   private long id_byte;
   private int id_protected;
   private Optional<rfH_2> id_throws = Optional.empty();

   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      var2.id_class(rXQ.MAINHAND, rdn_3.id_break);
      this.id_byte = (long)((Integer)var2.id_throws[41]).intValue();
   }

   public rrX_2() {
      super(ImmutableMap.of(il_3.id_final, iC_2.VALUE_ABSENT, il_3.id_volatile, iC_2.VALUE_ABSENT));
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.id_protected < 80 && this.id_throws.isPresent();
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      if ((Integer)var2.id_throws[41] % 10 == 0 && (this.id_byte == 0L || this.id_byte + 160L <= (long)((Integer)var2.id_throws[41]).intValue())) {
         if (var2.sd().id_class(rdy_3.Xg) <= 0) {
            return false;
         } else {
            this.id_throws = this.id_break(var1, var2);
            return this.id_throws.isPresent();
         }
      } else {
         return false;
      }
   }

   private boolean id_class(rfH_2 var1, rrEm_1 var2) {
      xc_3 var3 = var2.id_byte(var1);
      xd_3 var4 = var3.id_break();
      return var4 instanceof dO_2 && !((dO_2)var4).id_implements(var3);
   }

   private void id_class(rsq_3 var1) {
      this.id_throws.ifPresent(var1x -> {
         rfI_2 var2 = new rfI_2(var1x);
         var1.SF().id_class(il_3.id_final, var2);
         var1.SF().id_class(il_3.id_volatile, new iH_2(var2, 0.5F, 1));
      });
   }

   private Optional<rfH_2> id_break(rrEm_1 var1, rsq_3 var2) {
      rfw_3 var3 = new rfw_3();
      Optional var4 = Optional.empty();
      int var5 = 0;

      for (int var6 = -1; var6 <= 1; var6++) {
         for (int var7 = -1; var7 <= 1; var7++) {
            for (int var8 = -1; var8 <= 1; var8++) {
               var3.id_class(var2.Bs(), var6, var7, var8);
               if (this.id_class(var3, var1)) {
                  if (var1.id_int.nextInt(++var5) == 0) {
                     var4 = Optional.of(var3.id_int());
                  }
               }
            }
         }
      }

      return var4;
   }

   protected void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      this.id_class(var2);
      var2.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Xg));
      this.id_class = var3;
      this.id_protected = 0;
   }

   protected void id_protected(rrEm_1 var1, rsq_3 var2, long var3) {
      rfH_2 var5 = this.id_throws.get();
      if (var3 >= this.id_class && var5.id_class(var2.Ps(), 1.0)) {
         rdn_3 var6 = rdn_3.id_break;
         rXA var7 = var2.sd();
         int var8 = var7.id_else();

         for (int var9 = 0; var9 < var8; var9++) {
            rdn_3 var10 = var7.id_extends(var9);
            if (var10.id_break() == rdy_3.Xg) {
               var6 = var10;
               break;
            }
         }

         if (!var6.id_class() && rxW_2.id_class(var6, var1, var5)) {
            var1.id_byte(2005, var5, 0);
            this.id_throws = this.id_break(var1, var2);
            this.id_class(var2);
            this.id_class = var3 + 40L;
         }

         this.id_protected++;
      }
   }
}
