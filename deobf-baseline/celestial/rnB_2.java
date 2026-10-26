package celestial;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class rnB_2 extends rnM_2 {
   private final rns_3 id_class;
   private final String id_break;
   private final Set<String> id_byte = Sets.newHashSet();
   private rgP_2 id_protected;
   private rgP_2 id_throws = rgN_2.id_byte;
   private rgP_2 id_case = rgN_2.id_byte;
   private boolean id_catch = true;
   private boolean id_private = true;
   private rnX_2 id_implements = rnX_2.ALWAYS;
   private rnX_2 id_finally = rnX_2.ALWAYS;
   private rgF_2 id_extends = rgF_2.RESET;
   private rnh_3 id_native = rnh_3.ALWAYS;
   private final rgc_3 id_volatile;

   public rVi_1 id_byte() {
      rVi_1 var1 = rgv_3.id_class((rgP_2)this.id_protected.id_case().id_break(this.id_volatile));
      rgF_2 var2 = this.id_volatile();
      if (var2 != rgF_2.RESET) {
         var1.id_class(var2);
      }

      return var1;
   }

   public void id_byte(rgP_2 var1) {
      rrLF var2 = rrLF.id_class(this, var1);
      var1 = var2.id_class();
      this.id_case = var1 == null ? rgN_2.id_byte : var1;
      this.id_class.id_byte(this);
   }

   public rnB_2(rns_3 var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_protected = new rgN_2(var2);
      this.id_volatile = rgc_3.id_class.id_class(var2).id_class(new rgy_3(rgp_3.id_class, new rgN_2(var2)));
   }

   @Override
   public String toString() {
      return "ScorePlayerTeam{scoreboard="
         + this.id_class
         + ", name='"
         + this.id_break
         + "', membershipSet="
         + this.id_byte
         + ", displayName="
         + this.id_protected
         + ", prefix="
         + this.id_throws
         + ", suffix="
         + this.id_case
         + ", allowFriendlyFire="
         + this.id_catch
         + ", canSeeFriendlyInvisibles="
         + this.id_private
         + ", nameTagVisibility="
         + this.id_implements
         + ", deathMessageVisibility="
         + this.id_finally
         + ", color="
         + this.id_extends
         + ", collisionRule="
         + this.id_native
         + ", field_237499_m_="
         + this.id_volatile
         + "}";
   }

   public void id_class(rgF_2 var1) {
      this.id_extends = var1;
      this.id_class.id_byte(this);
   }

   public static rVi_1 id_class(rnM_2 var0, rgP_2 var1, rnO_2[] var2) {
      return var0 == null ? var1.id_case() : var0.id_class(var1, var2);
   }

   public void id_class(boolean var1) {
      this.id_catch = var1;
      this.id_class.id_byte(this);
   }

   public void id_class(int var1) {
      this.id_class((var1 & 1) > 0);
      this.id_break((var1 & 2) > 0);
   }

   public rVi_1 id_class(rVi_1 var1, rgP_2 var2, rnO_2[] var3) {
      for (rnO_2 var7 : var3) {
         switch (var7) {
            case NAME:
               var1.id_class(var2);
               break;
            case PREFIX:
               var1.id_class(this.id_throws);
               break;
            case SUFFIX:
               var1.id_class(this.id_case);
         }
      }

      return var1;
   }

   public void id_class(rnh_3 var1) {
      this.id_native = var1;
      this.id_class.id_byte(this);
   }

   public void id_class(rnX_2 var1) {
      this.id_implements = var1;
      this.id_class.id_byte(this);
   }

   public void id_class(rgP_2 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.id_protected = var1;
         this.id_class.id_byte(this);
      }
   }

   @Override
   public String id_class() {
      return this.id_break;
   }

   @Override
   public rVi_1 id_class(rgP_2 var1, rnO_2[] var2) {
      rgN_2 var3 = new rgN_2("");
      rVi_1 var5 = this.id_class(var3, var1, var2);
      rgF_2 var4 = this.id_volatile();
      if (var4 != rgF_2.RESET) {
         var5.id_class(var4);
      }

      return var5;
   }

   public void id_break(rgP_2 var1) {
      rrLv_1 var2 = rrLv_1.id_class(this, var1);
      var1 = var2.id_class();
      this.id_throws = var1 == null ? rgN_2.id_byte : var1;
      this.id_class.id_byte(this);
   }

   public void id_break(rnX_2 var1) {
      this.id_finally = var1;
      this.id_class.id_byte(this);
   }

   public rgP_2 id_break() {
      return this.id_protected;
   }

   public void id_break(boolean var1) {
      this.id_private = var1;
      this.id_class.id_byte(this);
   }

   public rgP_2 id_throws() {
      return this.id_case;
   }

   @Override
   public rnX_2 id_finally() {
      return this.id_finally;
   }

   @Override
   public boolean id_catch() {
      return this.id_catch;
   }

   @Override
   public rnh_3 id_extends() {
      return this.id_native;
   }

   @Override
   public Collection<String> id_case() {
      return this.id_byte;
   }

   @Override
   public rnX_2 id_implements() {
      return this.id_implements;
   }

   public rgP_2 id_protected() {
      return this.id_throws;
   }

   @Override
   public boolean id_private() {
      return this.id_private;
   }

   public rns_3 id_final() {
      return this.id_class;
   }

   @Override
   public rgF_2 id_volatile() {
      return this.id_extends;
   }

   public int id_native() {
      byte var1 = 0;
      if (this.id_catch()) {
         var1 |= 1;
      }

      if (this.id_private()) {
         var1 |= 2;
      }

      return var1;
   }
}
