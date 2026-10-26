package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class rrI_2 extends rPm_1<rsq_3> {
   private static final Map<rsT_2, rqO_2> id_class = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put(rsT_2.id_break, rzl_3.z);
      var0.put(rsT_2.id_byte, rzl_3.Q);
      var0.put(rsT_2.id_protected, rzl_3.N);
      var0.put(rsT_2.id_throws, rzl_3.c);
      var0.put(rsT_2.id_case, rzl_3.u);
      var0.put(rsT_2.id_catch, rzl_3.m);
      var0.put(rsT_2.id_private, rzl_3.Z);
      var0.put(rsT_2.id_implements, rzl_3.v);
      var0.put(rsT_2.id_finally, rzl_3.F);
      var0.put(rsT_2.id_extends, rzl_3.L);
      var0.put(rsT_2.id_volatile, rzl_3.A);
      var0.put(rsT_2.id_final, rzl_3.n);
      var0.put(rsT_2.id_package, rzl_3.C);
   });
   private int id_byte = 600;
   private boolean id_protected;
   private long id_throws;

   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      rhd_3 var5 = this.id_byte(var2).get();
      iA_2.id_class(var2, var5);
      if (this.id_class(var2, var5)) {
         if (var3 - this.id_throws > 20L) {
            this.id_class(var2, (iB_2)var5);
            this.id_protected = true;
         }
      } else {
         iA_2.id_class(var2, var5, 0.5F, 5);
      }
   }

   private Optional<rhd_3> id_byte(rsq_3 var1) {
      return var1.SF().id_byte(il_3.id_extends).filter(this::id_class);
   }

   public rrI_2(int var1) {
      super(
         ImmutableMap.of(il_3.id_volatile, iC_2.REGISTERED, il_3.id_final, iC_2.REGISTERED, il_3.id_new, iC_2.REGISTERED, il_3.id_extends, iC_2.VALUE_PRESENT),
         var1
      );
   }

   private boolean id_class(rsq_3 var1, rhd_3 var2) {
      rfH_2 var3 = var2.Bs();
      rfH_2 var4 = var1.Bs();
      return var4.id_class(var3, 5.0);
   }

   private boolean id_class(rhd_3 var1) {
      return var1.id_break(rLD.id_abstract);
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      if (!this.id_break(var2)) {
         return false;
      } else if (this.id_byte > 0) {
         this.id_byte--;
         return false;
      } else {
         return true;
      }
   }

   private List<rdn_3> id_class(rsq_3 var1) {
      if (var1.n_()) {
         return ImmutableList.of(new rdn_3(rdy_3.rd));
      } else {
         rsT_2 var2 = var1.su().id_break();
         if (id_class.containsKey(var2)) {
            rzL_2 var3 = ((rYB)var1.id_throws[7]).id_const().o().id_class(id_class.get(var2));
            rzP_2 var4 = new rzP_2((rrEm_1)((rYB)var1.id_throws[7])).id_class(rzQ_2.id_case, var1.Ps()).id_class(rzQ_2.id_class, var1).id_class(var1.Sa());
            return var3.id_class(var4.id_class(rzz_3.id_catch));
         } else {
            return ImmutableList.of(new rdn_3(rdy_3.hP));
         }
      }
   }

   private void id_class(rsq_3 var1, iB_2 var2) {
      for (rdn_3 var4 : this.id_class(var1)) {
         iA_2.id_class(var1, var4, var2.Ps());
      }
   }

   private static int id_class(rrEm_1 var0) {
      return 600 + var0.id_int.nextInt(6001);
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      this.id_protected = false;
      this.id_throws = var3;
      rhd_3 var5 = this.id_byte(var2).get();
      var2.SF().id_class(il_3.id_new, var5);
      iA_2.id_class(var2, var5);
   }

   protected boolean id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.id_break(var2) && !this.id_protected;
   }

   private boolean id_break(rsq_3 var1) {
      return this.id_byte(var1).isPresent();
   }

   protected void id_protected(rrEm_1 var1, rsq_3 var2, long var3) {
      this.id_byte = id_class(var1);
      var2.SF().id_break(il_3.id_new);
      var2.SF().id_break(il_3.id_volatile);
      var2.SF().id_break(il_3.id_final);
   }
}
