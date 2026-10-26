package celestial;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class rnB_2 extends rnM_2 {
   private final rns_3 class_;
   private final String break_;
   private final Set<String> byte_ = Sets.newHashSet();
   private rgP_2 protected_;
   private rgP_2 throws_ = rgN_2.byte_;
   private rgP_2 case_ = rgN_2.byte_;
   private boolean catch_ = true;
   private boolean private_ = true;
   private rnX_2 implements_ = rnX_2.ALWAYS;
   private rnX_2 finally_ = rnX_2.ALWAYS;
   private rgF_2 extends_ = rgF_2.RESET;
   private rnh_3 native_ = rnh_3.ALWAYS;
   private final rgc_3 volatile_;

   public rVi_1 byte_() {
      rVi_1 var1 = rgv_3.class_((rgP_2)this.protected_.case_().break_(this.volatile_));
      rgF_2 var2 = this.volatile_();
      if (var2 != rgF_2.RESET) {
         var1.class_(var2);
      }

      return var1;
   }

   public void byte_(rgP_2 var1) {
      rrLF var2 = rrLF.class_(this, var1);
      var1 = var2.class_();
      this.case_ = var1 == null ? rgN_2.byte_ : var1;
      this.class_.byte_(this);
   }

   public rnB_2(rns_3 var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.protected_ = new rgN_2(var2);
      this.volatile_ = rgc_3.class_.class_(var2).class_(new rgy_3(rgp_3.class_, new rgN_2(var2)));
   }

   @Override
   public String toString() {
      return "ScorePlayerTeam{scoreboard="
         + this.class_
         + ", name='"
         + this.break_
         + "', membershipSet="
         + this.byte_
         + ", displayName="
         + this.protected_
         + ", prefix="
         + this.throws_
         + ", suffix="
         + this.case_
         + ", allowFriendlyFire="
         + this.catch_
         + ", canSeeFriendlyInvisibles="
         + this.private_
         + ", nameTagVisibility="
         + this.implements_
         + ", deathMessageVisibility="
         + this.finally_
         + ", color="
         + this.extends_
         + ", collisionRule="
         + this.native_
         + ", field_237499_m_="
         + this.volatile_
         + "}";
   }

   public void class_(rgF_2 var1) {
      this.extends_ = var1;
      this.class_.byte_(this);
   }

   public static rVi_1 class_(rnM_2 var0, rgP_2 var1, rnO_2[] var2) {
      return var0 == null ? var1.case_() : var0.class_(var1, var2);
   }

   public void class_(boolean var1) {
      this.catch_ = var1;
      this.class_.byte_(this);
   }

   public void class_(int var1) {
      this.class_((var1 & 1) > 0);
      this.break_((var1 & 2) > 0);
   }

   public rVi_1 class_(rVi_1 var1, rgP_2 var2, rnO_2[] var3) {
      for (rnO_2 var7 : var3) {
         switch (var7) {
            case NAME:
               var1.class_(var2);
               break;
            case PREFIX:
               var1.class_(this.throws_);
               break;
            case SUFFIX:
               var1.class_(this.case_);
         }
      }

      return var1;
   }

   public void class_(rnh_3 var1) {
      this.native_ = var1;
      this.class_.byte_(this);
   }

   public void class_(rnX_2 var1) {
      this.implements_ = var1;
      this.class_.byte_(this);
   }

   public void class_(rgP_2 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.protected_ = var1;
         this.class_.byte_(this);
      }
   }

   @Override
   public String class_() {
      return this.break_;
   }

   @Override
   public rVi_1 class_(rgP_2 var1, rnO_2[] var2) {
      rgN_2 var3 = new rgN_2("");
      rVi_1 var5 = this.class_(var3, var1, var2);
      rgF_2 var4 = this.volatile_();
      if (var4 != rgF_2.RESET) {
         var5.class_(var4);
      }

      return var5;
   }

   public void break_(rgP_2 var1) {
      rrLv_1 var2 = rrLv_1.class_(this, var1);
      var1 = var2.class_();
      this.throws_ = var1 == null ? rgN_2.byte_ : var1;
      this.class_.byte_(this);
   }

   public void break_(rnX_2 var1) {
      this.finally_ = var1;
      this.class_.byte_(this);
   }

   public rgP_2 break_() {
      return this.protected_;
   }

   public void break_(boolean var1) {
      this.private_ = var1;
      this.class_.byte_(this);
   }

   public rgP_2 throws_() {
      return this.case_;
   }

   @Override
   public rnX_2 finally_() {
      return this.finally_;
   }

   @Override
   public boolean catch_() {
      return this.catch_;
   }

   @Override
   public rnh_3 extends_() {
      return this.native_;
   }

   @Override
   public Collection<String> case_() {
      return this.byte_;
   }

   @Override
   public rnX_2 implements_() {
      return this.implements_;
   }

   public rgP_2 protected_() {
      return this.throws_;
   }

   @Override
   public boolean private_() {
      return this.private_;
   }

   public rns_3 final_() {
      return this.class_;
   }

   @Override
   public rgF_2 volatile_() {
      return this.extends_;
   }

   public int native_() {
      byte var1 = 0;
      if (this.catch_()) {
         var1 |= 1;
      }

      if (this.private_()) {
         var1 |= 2;
      }

      return var1;
   }
}
