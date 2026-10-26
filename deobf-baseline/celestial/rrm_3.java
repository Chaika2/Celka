package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;

public class rrm_3 extends rPm_1<rsq_3> {
   private rfH_2 id_class;
   private long id_byte;
   private int id_protected;
   private final List<rfH_2> id_throws = Lists.newArrayList();

   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      if (this.id_class == null || this.id_class.id_class(var2.Ps(), 1.0)) {
         if (this.id_class != null && var3 > this.id_byte) {
            xc_3 var5 = var1.id_byte(this.id_class);
            xd_3 var6 = var5.id_break();
            xd_3 var7 = var1.id_byte(this.id_class.id_break()).id_break();
            if (var6 instanceof dO_2 && ((dO_2)var6).id_implements(var5)) {
               var1.id_class(this.id_class, true, var2);
            }

            if (var5.id_catch() && var7 instanceof dy_3 && var2.sF()) {
               rXA var8 = var2.sd();

               for (int var9 = 0; var9 < var8.id_else(); var9++) {
                  rdn_3 var10 = var8.id_extends(var9);
                  boolean var11 = false;
                  if (!var10.id_class()) {
                     if (var10.id_break() == rdy_3.hP) {
                        var1.id_class(this.id_class, xu_3.PB.id_continue(), 3);
                        var11 = true;
                     } else if (var10.id_break() == rdy_3.dE) {
                        var1.id_class(this.id_class, xu_3.sP.id_continue(), 3);
                        var11 = true;
                     } else if (var10.id_break() == rdy_3.ds) {
                        var1.id_class(this.id_class, xu_3.sr.id_continue(), 3);
                        var11 = true;
                     } else if (var10.id_break() == rdy_3.kJ) {
                        var1.id_class(this.id_class, xu_3.bT.id_continue(), 3);
                        var11 = true;
                     }
                  }

                  if (var11) {
                     var1.id_class(
                        (rhd_3)null, (double)this.id_class.b_(), (double)this.id_class.c_(), (double)this.id_class.d_(), rqn_3.PZ, rqL_2.BLOCKS, 1.0F, 1.0F
                     );
                     var10.id_catch(1);
                     if (var10.id_class()) {
                        var8.id_break(var9, rdn_3.id_break);
                     }
                     break;
                  }
               }
            }

            if (var6 instanceof dO_2 && !((dO_2)var6).id_implements(var5)) {
               this.id_throws.remove(this.id_class);
               this.id_class = this.id_class(var1);
               if (this.id_class != null) {
                  this.id_byte = var3 + 20L;
                  var2.SF().id_class(il_3.id_volatile, new iH_2(new rfI_2(this.id_class), 0.5F, 1));
                  var2.SF().id_class(il_3.id_final, new rfI_2(this.id_class));
               }
            }
         }

         this.id_protected++;
      }
   }

   public rrm_3() {
      super(ImmutableMap.of(il_3.id_final, iC_2.VALUE_ABSENT, il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_case, iC_2.VALUE_PRESENT));
   }

   private rfH_2 id_class(rrEm_1 var1) {
      return this.id_throws.isEmpty() ? null : this.id_throws.get(var1.id_long().nextInt(this.id_throws.size()));
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      if (!var1.B().id_break(rRu_1.id_break)) {
         return false;
      } else if (var2.su().id_break() != rsT_2.id_case) {
         return false;
      } else {
         rfw_3 var3 = var2.Bs().id_new();
         this.id_throws.clear();

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               for (int var6 = -1; var6 <= 1; var6++) {
                  var3.id_break(var2.rx() + (double)var4, var2.re() + (double)var5, var2.BO() + (double)var6);
                  if (this.id_class(var3, var1)) {
                     this.id_throws.add(new rfH_2(var3));
                  }
               }
            }
         }

         this.id_class = this.id_class(var1);
         return this.id_class != null;
      }
   }

   private boolean id_class(rfH_2 var1, rrEm_1 var2) {
      xc_3 var3 = var2.id_byte(var1);
      xd_3 var4 = var3.id_break();
      xd_3 var5 = var2.id_byte(var1.id_break()).id_break();
      return var4 instanceof dO_2 && ((dO_2)var4).id_implements(var3) || var3.id_catch() && var5 instanceof dy_3;
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      if (var3 > this.id_byte && this.id_class != null) {
         var2.SF().id_class(il_3.id_final, new rfI_2(this.id_class));
         var2.SF().id_class(il_3.id_volatile, new iH_2(new rfI_2(this.id_class), 0.5F, 1));
      }
   }

   protected void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      var2.SF().id_break(il_3.id_final);
      var2.SF().id_break(il_3.id_volatile);
      this.id_protected = 0;
      this.id_byte = var3 + 40L;
   }

   protected boolean id_protected(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.id_protected < 200;
   }
}
