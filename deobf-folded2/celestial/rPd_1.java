package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;

public class rPd_1 extends rPm_1<rsq_3> {
   private rdn_3 id_class;
   private final List<rdn_3> id_byte = Lists.newArrayList();
   private int id_protected;
   private int id_throws;
   private int id_case;

   private iB_2 id_byte(rsq_3 var1) {
      iZ_2 var2 = var1.SF();
      iB_2 var3 = var2.id_byte(il_3.id_new).get();
      var2.id_class(il_3.id_final, new rfY_2(var3, true));
      return var3;
   }

   public void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      iB_2 var5 = this.id_byte(var2);
      this.id_class(var5, var2);
      if (!this.id_byte.isEmpty()) {
         this.id_protected(var2);
      } else {
         var2.id_class(rXQ.MAINHAND, rdn_3.id_break);
         this.id_case = Math.min(this.id_case, 40);
      }

      this.id_case--;
   }

   public rPd_1(int var1, int var2) {
      super(ImmutableMap.of(il_3.id_new, iC_2.VALUE_PRESENT), var1, var2);
   }

   private void id_class(rsq_3 var1) {
      var1.id_class(rXQ.MAINHAND, this.id_byte.get(0));
   }

   private boolean id_class(rdI_2 var1) {
      return rdn_3.id_byte(this.id_class, var1.id_break()) || rdn_3.id_byte(this.id_class, var1.id_byte());
   }

   public boolean id_class(rrEm_1 var1, rsq_3 var2) {
      iZ_2 var3 = var2.SF();
      if (!var3.id_byte(il_3.id_new).isPresent()) {
         return false;
      } else {
         iB_2 var4 = var3.id_byte(il_3.id_new).get();
         return var4.BC() == aI_2.rM && var2.BM() && var4.BM() && !var2.n_() && var2.id_int(var4) <= 17.0;
      }
   }

   public boolean id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.id_class(var1, var2) && this.id_case > 0 && var2.SF().id_byte(il_3.id_new).isPresent();
   }

   private void id_class(iB_2 var1, rsq_3 var2) {
      boolean var3 = false;
      rdn_3 var4 = var1.ss();
      if (this.id_class == null || !rdn_3.id_byte(this.id_class, var4)) {
         this.id_class = var4;
         var3 = true;
         this.id_byte.clear();
      }

      if (var3 && !this.id_class.id_class()) {
         this.id_break(var2);
         if (!this.id_byte.isEmpty()) {
            this.id_case = 900;
            this.id_class(var2);
         }
      }
   }

   private void id_break(rsq_3 var1) {
      for (rdI_2 var3 : var1.id_break()) {
         if (!var3.id_int() && this.id_class(var3)) {
            this.id_byte.add(var3.id_protected());
         }
      }
   }

   public void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      super.id_protected(var1, var2, var3);
      this.id_byte(var2);
      this.id_protected = 0;
      this.id_throws = 0;
      this.id_case = 40;
   }

   public void id_protected(rrEm_1 var1, rsq_3 var2, long var3) {
      super.id_break(var1, var2, var3);
      var2.SF().id_break(il_3.id_new);
      var2.id_class(rXQ.MAINHAND, rdn_3.id_break);
      this.id_class = null;
   }

   private void id_protected(rsq_3 var1) {
      if (this.id_byte.size() >= 2 && ++this.id_protected >= 40) {
         this.id_throws++;
         this.id_protected = 0;
         if (this.id_throws > this.id_byte.size() - 1) {
            this.id_throws = 0;
         }

         var1.id_class(rXQ.MAINHAND, this.id_byte.get(this.id_throws));
      }
   }
}
