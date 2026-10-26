package celestial;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;

public class rBy_1 extends rBk_1 {
   protected final aA_2 id_class;
   private final double id_break;
   private rLC id_byte;
   private rfH_2 id_protected;
   private final boolean id_throws;
   private final List<rfH_2> id_case = Lists.newArrayList();
   private final int id_catch;
   private final BooleanSupplier id_private;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_class(this.id_byte, this.id_break);
   }

   public rBy_1(aA_2 var1, double var2, boolean var4, int var5, BooleanSupplier var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_throws = var4;
      this.id_catch = var5;
      this.id_private = var6;
      this.id_class(EnumSet.of(rBW.MOVE));
      if (!rpc_3.id_class(var1)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   private boolean id_class(rfH_2 var1) {
      for (rfH_2 var3 : this.id_case) {
         if (Objects.equals(var1, var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean id_class() {
      if (!rpc_3.id_class(this.id_class)) {
         return false;
      } else {
         this.id_catch();
         if (this.id_throws && ((rYB)this.id_class.id_throws[7]).id_strictfp()) {
            return false;
         } else {
            rrEm_1 var1 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
            rfH_2 var2 = this.id_class.Bs();
            if (!var1.id_byte(var2, 6)) {
               return false;
            } else {
               rjU_2 var3 = iX_2.id_class(this.id_class, 15, 7, var3x -> {
                  if (!var1.id_throw(var3x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional var4x = var1.d().id_byte(rRP.id_break, this::id_class, var3x, 10, rRr_1.IS_OCCUPIED);
                     return !var4x.isPresent() ? Double.NEGATIVE_INFINITY : -((rfH_2)var4x.get()).id_private(var2);
                  }
               });
               if (var3 == null) {
                  return false;
               } else {
                  Optional var4 = var1.d().id_byte(rRP.id_break, this::id_class, new rfH_2(var3), 10, rRr_1.IS_OCCUPIED);
                  if (!var4.isPresent()) {
                     return false;
                  } else {
                     this.id_protected = ((rfH_2)var4.get()).id_int();
                     rLA var5 = (rLA)this.id_class.id_public();
                     boolean var6 = var5.id_throws();
                     var5.id_class(this.id_private.getAsBoolean());
                     this.id_byte = var5.id_class(this.id_protected, 0);
                     var5.id_class(var6);
                     if (this.id_byte == null) {
                        rjU_2 var7 = iX_2.id_break(this.id_class, 10, 7, rjU_2.id_protected(this.id_protected));
                        if (var7 == null) {
                           return false;
                        }

                        var5.id_class(this.id_private.getAsBoolean());
                        this.id_byte = this.id_class.id_public().id_class(var7.id_break, var7.id_byte, var7.id_protected, 0);
                        var5.id_class(var6);
                        if (this.id_byte == null) {
                           return false;
                        }
                     }

                     for (int var10 = 0; var10 < this.id_byte.id_throws(); var10++) {
                        rLq_1 var8 = this.id_byte.id_class(var10);
                        rfH_2 var9 = new rfH_2(var8.id_class, var8.id_break + 1, var8.id_byte);
                        if (dN_2.id_class((rYB)this.id_class.id_throws[7], var9)) {
                           this.id_byte = this.id_class.id_public().id_class((double)var8.id_class, (double)var8.id_break, (double)var8.id_byte, 0);
                           break;
                        }
                     }

                     return this.id_byte != null;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean id_break() {
      return this.id_class.id_public().id_native()
         ? false
         : !this.id_protected.id_class(this.id_class.Ps(), (double)(this.id_class.PN() + (float)this.id_catch));
   }

   private void id_catch() {
      if (this.id_case.size() > 15) {
         this.id_case.remove(0);
      }
   }

   @Override
   public void id_protected() {
      if (this.id_class.id_public().id_native() || this.id_protected.id_class(this.id_class.Ps(), (double)this.id_catch)) {
         this.id_case.add(this.id_protected);
      }
   }
}
