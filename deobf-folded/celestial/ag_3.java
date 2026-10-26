package celestial;

import java.util.Objects;
import java.util.UUID;

public interface ag_3 {
   void id_byte(iB_2 var1);

   UUID id_byte();

   default void id_class(rhd_3 var1) {
      if (((rYB)var1.id_throws[7]).B().id_break(rRu_1.id_abstract) && var1.ro().equals(this.id_byte())) {
         this.S_();
      }
   }

   default void id_class(rrEm_1 var1, rcd_3 var2) {
      this.id_class(var2.id_private("AngerTime"));
      if (!var2.id_break("AngryAt")) {
         this.id_class((UUID)null);
      } else {
         UUID var3 = var2.id_class("AngryAt");
         this.id_class(var3);
         an_3 var4 = var1.id_break(var3);
         if (var4 != null) {
            if (var4 instanceof is_3) {
               this.id_break((is_3)var4);
            }

            if (var4.BC() == aI_2.rM) {
               this.id_break((rhd_3)var4);
            }
         }
      }
   }

   default void id_class(rrEm_1 var1, boolean var2) {
      iB_2 var3 = this.I_();
      UUID var4 = this.id_byte();
      if ((var3 == null || var3.Sl()) && var4 != null && var1.id_break(var4) instanceof is_3) {
         this.S_();
      } else {
         if (var3 != null && !Objects.equals(var4, var3.ro())) {
            this.id_class(var3.ro());
            this.id_protected();
         }

         if (this.id_class() > 0 && (var3 == null || var3.BC() != aI_2.rM || !var2)) {
            this.id_class(this.id_class() - 1);
            if (this.id_class() == 0) {
               this.S_();
            }
         }
      }
   }

   void id_class(int var1);

   void id_class(UUID var1);

   int id_class();

   void id_break(iB_2 var1);

   void id_break(rhd_3 var1);

   default void id_case() {
      this.S_();
      this.id_protected();
   }

   void id_protected();

   iB_2 I_();

   default void S_() {
      this.id_break((iB_2)null);
      this.id_class((UUID)null);
      this.id_byte((iB_2)null);
      this.id_class(0);
   }

   default void a_(rcd_3 var1) {
      var1.id_break("AngerTime", this.id_class());
      if (this.id_byte() != null) {
         var1.id_class("AngryAt", this.id_byte());
      }
   }

   default boolean a_(rYB var1) {
      return var1.B().id_break(rRu_1.id_long) && this.T_() && this.id_byte() == null;
   }

   default boolean T_() {
      return this.id_class() > 0;
   }

   default boolean b_(iB_2 var1) {
      if (!rpJ_2.id_case.test(var1)) {
         return false;
      } else {
         return var1.BC() == aI_2.rM && this.a_((rYB)var1.id_throws[7]) ? true : var1.ro().equals(this.id_byte());
      }
   }
}
