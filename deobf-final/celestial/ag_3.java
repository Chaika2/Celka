package celestial;

import java.util.Objects;
import java.util.UUID;

public interface ag_3 {
   void byte_(iB_2 var1);

   UUID byte_();

   default void class_(rhd_3 var1) {
      if (((rYB)var1.throws_[7]).B().break_(rRu_1.abstract_) && var1.ro().equals(this.byte_())) {
         this.S_();
      }
   }

   default void class_(rrEm_1 var1, rcd_3 var2) {
      this.class_(var2.private_("AngerTime"));
      if (!var2.break_("AngryAt")) {
         this.class_((UUID)null);
      } else {
         UUID var3 = var2.class_("AngryAt");
         this.class_(var3);
         an_3 var4 = var1.break_(var3);
         if (var4 != null) {
            if (var4 instanceof is_3) {
               this.break_((is_3)var4);
            }

            if (var4.BC() == aI_2.rM) {
               this.break_((rhd_3)var4);
            }
         }
      }
   }

   default void class_(rrEm_1 var1, boolean var2) {
      iB_2 var3 = this.I_();
      UUID var4 = this.byte_();
      if ((var3 == null || var3.Sl()) && var4 != null && var1.break_(var4) instanceof is_3) {
         this.S_();
      } else {
         if (var3 != null && !Objects.equals(var4, var3.ro())) {
            this.class_(var3.ro());
            this.protected_();
         }

         if (this.class_() > 0 && (var3 == null || var3.BC() != aI_2.rM || !var2)) {
            this.class_(this.class_() - 1);
            if (this.class_() == 0) {
               this.S_();
            }
         }
      }
   }

   void class_(int var1);

   void class_(UUID var1);

   int class_();

   void break_(iB_2 var1);

   void break_(rhd_3 var1);

   default void case_() {
      this.S_();
      this.protected_();
   }

   void protected_();

   iB_2 I_();

   default void S_() {
      this.break_((iB_2)null);
      this.class_((UUID)null);
      this.byte_((iB_2)null);
      this.class_(0);
   }

   default void a_(rcd_3 var1) {
      var1.break_("AngerTime", this.class_());
      if (this.byte_() != null) {
         var1.class_("AngryAt", this.byte_());
      }
   }

   default boolean a_(rYB var1) {
      return var1.B().break_(rRu_1.long_) && this.T_() && this.byte_() == null;
   }

   default boolean T_() {
      return this.class_() > 0;
   }

   default boolean b_(iB_2 var1) {
      if (!rpJ_2.case_.test(var1)) {
         return false;
      } else {
         return var1.BC() == aI_2.rM && this.a_((rYB)var1.throws_[7]) ? true : var1.ro().equals(this.byte_());
      }
   }
}
