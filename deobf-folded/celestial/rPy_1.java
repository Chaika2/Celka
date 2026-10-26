package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPy_1 extends rPm_1<is_3> {
   private int id_class;
   private rLC id_byte;
   private rfH_2 id_protected;
   private float id_throws;

   protected void id_byte(rrEm_1 var1, is_3 var2, long var3) {
      var2.SF().id_class(il_3.id_this, this.id_byte);
      var2.id_public().id_class(this.id_byte, (double)this.id_throws);
   }

   public rPy_1() {
      this(150, 250);
   }

   public rPy_1(int var1, int var2) {
      super(ImmutableMap.of(il_3.id_interface, iC_2.REGISTERED, il_3.id_this, iC_2.VALUE_ABSENT, il_3.id_volatile, iC_2.VALUE_PRESENT), var1, var2);
   }

   private boolean id_class(is_3 var1, iH_2 var2) {
      return var2.id_class().id_break().id_implements(var1.Bs()) <= var2.id_byte();
   }

   private boolean id_class(is_3 var1, iH_2 var2, long var3) {
      rfH_2 var5 = var2.id_class().id_break();
      this.id_byte = var1.id_public().id_class(var5, 0);
      this.id_throws = var2.id_break();
      iZ_2 var6 = var1.SF();
      if (this.id_class(var1, var2)) {
         var6.id_break(il_3.id_interface);
      } else {
         boolean var7 = this.id_byte != null && this.id_byte.id_finally();
         if (var7) {
            var6.id_break(il_3.id_interface);
         } else if (!var6.id_class(il_3.id_interface)) {
            var6.id_class(il_3.id_interface, var3);
         }

         if (this.id_byte != null) {
            return true;
         }

         rjU_2 var8 = iX_2.id_break((aA_2)var1, 10, 7, rjU_2.id_protected(var5));
         if (var8 != null) {
            this.id_byte = var1.id_public().id_class(var8.id_break, var8.id_byte, var8.id_protected, 0);
            return this.id_byte != null;
         }
      }

      return false;
   }

   protected boolean id_class(rrEm_1 var1, is_3 var2) {
      if (this.id_class > 0) {
         this.id_class--;
         return false;
      } else {
         iZ_2 var3 = var2.SF();
         iH_2 var4 = var3.id_byte(il_3.id_volatile).get();
         boolean var5 = this.id_class(var2, var4);
         if (!var5 && this.id_class(var2, var4, var1.r())) {
            this.id_protected = var4.id_class().id_break();
            return true;
         } else {
            var3.id_break(il_3.id_volatile);
            if (var5) {
               var3.id_break(il_3.id_interface);
            }

            return false;
         }
      }
   }

   protected boolean id_class(rrEm_1 var1, is_3 var2, long var3) {
      if (this.id_byte != null && this.id_protected != null) {
         Optional var5 = var2.SF().id_byte(il_3.id_volatile);
         rLy_1 var6 = var2.id_public();
         return !var6.id_native() && var5.isPresent() && !this.id_class(var2, (iH_2)var5.get());
      } else {
         return false;
      }
   }

   protected void id_break(rrEm_1 var1, is_3 var2, long var3) {
      if (var2.SF().id_class(il_3.id_volatile) && !this.id_class(var2, var2.SF().id_byte(il_3.id_volatile).get()) && var2.id_public().id_continue()) {
         this.id_class = var1.id_long().nextInt(40);
      }

      var2.id_public().id_final();
      var2.SF().id_break(il_3.id_volatile);
      var2.SF().id_break(il_3.id_this);
      this.id_byte = null;
   }

   protected void id_protected(rrEm_1 var1, is_3 var2, long var3) {
      rLC var5 = var2.id_public().id_finally();
      iZ_2 var6 = var2.SF();
      if (this.id_byte != var5) {
         this.id_byte = var5;
         var6.id_class(il_3.id_this, var5);
      }

      if (var5 != null && this.id_protected != null) {
         iH_2 var7 = var6.id_byte(il_3.id_volatile).get();
         if (var7.id_class().id_break().id_private(this.id_protected) > 4.0 && this.id_class(var2, var7, var1.r())) {
            this.id_protected = var7.id_class().id_break();
            this.id_byte(var1, var2, var3);
         }
      }
   }
}
