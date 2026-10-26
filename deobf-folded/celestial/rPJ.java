package celestial;

import com.google.common.collect.ImmutableMap;

public class rPJ<E extends is_3 & aY_2, T extends iB_2> extends rPm_1<E> {
   private int id_class;
   private rPx_1 id_byte = rPx_1.UNCHARGED;

   protected void id_byte(rrEm_1 var1, E var2, long var3) {
      if (var2.id_return()) {
         var2.id_throw();
      }

      if (var2.id_class(rdy_3.kU)) {
         ((aY_2)var2).id_break(false);
         rxm_3.id_class(var2.sX(), false);
      }
   }

   public rPJ() {
      super(ImmutableMap.of(il_3.id_final, iC_2.REGISTERED, il_3.id_package, iC_2.VALUE_PRESENT), 1200);
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      iB_2 var3 = id_class(var2);
      return var2.id_class(rdy_3.kU) && iA_2.id_byte(var2, var3) && iA_2.id_class(var2, var3, 0);
   }

   private static iB_2 id_class(iB_2 var0) {
      return var0.SF().id_byte(il_3.id_package).get();
   }

   protected boolean id_class(rrEm_1 var1, E var2, long var3) {
      return var2.SF().id_class(il_3.id_package) && this.id_class(var1, (E)var2);
   }

   private void id_class(E var1, iB_2 var2) {
      if (this.id_byte == rPx_1.UNCHARGED) {
         var1.id_break(rhj_3.id_class(var1, rdy_3.kU));
         this.id_byte = rPx_1.CHARGING;
         ((aY_2)var1).id_break(true);
      } else if (this.id_byte == rPx_1.CHARGING) {
         if (!var1.id_return()) {
            this.id_byte = rPx_1.UNCHARGED;
         }

         int var3 = var1.SU();
         rdn_3 var4 = var1.sX();
         if (var3 >= rxm_3.id_private(var4)) {
            var1.SC();
            this.id_byte = rPx_1.CHARGED;
            this.id_class = 20 + var1.Sa().nextInt(20);
            ((aY_2)var1).id_break(false);
         }
      } else if (this.id_byte == rPx_1.CHARGED) {
         this.id_class--;
         if (this.id_class == 0) {
            this.id_byte = rPx_1.READY_TO_ATTACK;
         }
      } else if (this.id_byte == rPx_1.READY_TO_ATTACK) {
         ((aa_3)var1).id_break(var2, 1.0F);
         rdn_3 var5 = var1.id_protected(rhj_3.id_class(var1, rdy_3.kU));
         rxm_3.id_class(var5, false);
         this.id_byte = rPx_1.UNCHARGED;
      }
   }

   private void id_break(is_3 var1, iB_2 var2) {
      var1.SF().id_class(il_3.id_final, new rfY_2(var2, true));
   }

   protected void id_break(rrEm_1 var1, E var2, long var3) {
      iB_2 var5 = id_class(var2);
      this.id_break(var2, var5);
      this.id_class((E)var2, var5);
   }
}
