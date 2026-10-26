package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ryR_2 {
   private final List<ryV_2> id_class = Lists.newArrayList();
   private final iB_2 id_break;
   private int id_byte;
   private int id_protected;
   private int id_throws;
   private boolean id_case;
   private boolean id_catch;
   private String id_private;

   public iB_2 id_byte() {
      iB_2 var1 = null;
      rhd_3 var2 = null;
      float var3 = 0.0F;
      float var4 = 0.0F;

      for (ryV_2 var6 : this.id_class) {
         if (var6.id_class().id_extends() instanceof rhd_3 && (var2 == null || var6.id_break() > var4)) {
            var4 = var6.id_break();
            var2 = (rhd_3)var6.id_class().id_extends();
         }

         if (var6.id_class().id_extends() instanceof iB_2 && (var1 == null || var6.id_break() > var3)) {
            var3 = var6.id_break();
            var1 = (iB_2)var6.id_class().id_extends();
         }
      }

      return (iB_2)(var2 != null && var4 >= var3 / 3.0F ? var2 : var1);
   }

   public ryR_2(iB_2 var1) {
      this.id_break = var1;
   }

   private String id_class(ryV_2 var1) {
      return var1.id_protected() == null ? "generic" : var1.id_protected();
   }

   public void id_class(rye_3 var1, float var2, float var3) {
      this.id_throws();
      this.id_class();
      ryV_2 var4 = new ryV_2(var1, (Integer)this.id_break.id_throws[41], var2, var3, this.id_private, (Float)this.id_break.id_throws[31]);
      this.id_class.add(var4);
      this.id_byte = (Integer)this.id_break.id_throws[41];
      this.id_catch = true;
      if (var4.id_byte() && !this.id_case && this.id_break.BM()) {
         this.id_case = true;
         this.id_protected = (Integer)this.id_break.id_throws[41];
         this.id_throws = this.id_protected;
         this.id_break.Sj();
      }
   }

   public void id_class() {
      this.id_private();
      Optional var1 = this.id_break.SP();
      if (var1.isPresent()) {
         xc_3 var2 = ((rYB)this.id_break.id_throws[7]).id_byte((rfH_2)var1.get());
         if (var2.id_class(xu_3.PJ) || var2.id_class(rls_3.id_static)) {
            this.id_private = "ladder";
         } else if (var2.id_class(xu_3.BD)) {
            this.id_private = "vines";
         } else if (var2.id_class(xu_3.XC) || var2.id_class(xu_3.Xl)) {
            this.id_private = "weeping_vines";
         } else if (var2.id_class(xu_3.XH) || var2.id_class(xu_3.Xy)) {
            this.id_private = "twisting_vines";
         } else if (var2.id_class(xu_3.hU)) {
            this.id_private = "scaffolding";
         } else {
            this.id_private = "other_climbable";
         }
      } else if (this.id_break.rT()) {
         this.id_private = "water";
      }
   }

   public rgP_2 id_break() {
      if (this.id_class.isEmpty()) {
         return new rgn_3("death.attack.generic", this.id_break.L_());
      } else {
         ryV_2 var1 = this.id_catch();
         ryV_2 var2 = this.id_class.get(this.id_class.size() - 1);
         rgP_2 var3 = var2.id_throws();
         an_3 var4 = var2.id_class().id_extends();
         Object var5;
         if (var1 != null && var2.id_class() == rye_3.id_extends) {
            rgP_2 var6 = var1.id_throws();
            if (var1.id_class() == rye_3.id_extends || var1.id_class() == rye_3.id_volatile) {
               var5 = new rgn_3("death.fell.accident." + this.id_class(var1), this.id_break.L_());
            } else if (var6 != null && (var3 == null || !var6.equals(var3))) {
               an_3 var9 = var1.id_class().id_extends();
               rdn_3 var8 = var9 instanceof iB_2 ? ((iB_2)var9).ss() : rdn_3.id_break;
               if (!var8.id_class() && var8.id_this()) {
                  var5 = new rgn_3("death.fell.assist.item", this.id_break.L_(), var6, var8.id_throw());
               } else {
                  var5 = new rgn_3("death.fell.assist", this.id_break.L_(), var6);
               }
            } else if (var3 != null) {
               rdn_3 var7 = var4 instanceof iB_2 ? ((iB_2)var4).ss() : rdn_3.id_break;
               if (!var7.id_class() && var7.id_this()) {
                  var5 = new rgn_3("death.fell.finish.item", this.id_break.L_(), var3, var7.id_throw());
               } else {
                  var5 = new rgn_3("death.fell.finish", this.id_break.L_(), var3);
               }
            } else {
               var5 = new rgn_3("death.fell.killer", this.id_break.L_());
            }
         } else {
            var5 = var2.id_class().id_class(this.id_break);
         }

         return (rgP_2)var5;
      }
   }

   public void id_throws() {
      int var1 = this.id_case ? 300 : 100;
      if (this.id_catch && (!this.id_break.BM() || (Integer)this.id_break.id_throws[41] - this.id_byte > var1)) {
         boolean var2 = this.id_case;
         this.id_catch = false;
         this.id_case = false;
         this.id_throws = (Integer)this.id_break.id_throws[41];
         if (var2) {
            this.id_break.sh();
         }

         this.id_class.clear();
      }
   }

   private ryV_2 id_catch() {
      ryV_2 var1 = null;
      ryV_2 var2 = null;
      float var3 = 0.0F;
      float var4 = 0.0F;

      for (int var5 = 0; var5 < this.id_class.size(); var5++) {
         ryV_2 var6 = this.id_class.get(var5);
         ryV_2 var7 = var5 > 0 ? this.id_class.get(var5 - 1) : null;
         if ((var6.id_class() == rye_3.id_extends || var6.id_class() == rye_3.id_volatile) && var6.id_case() > 0.0F && (var1 == null || var6.id_case() > var4)) {
            if (var5 > 0) {
               var1 = var7;
            } else {
               var1 = var6;
            }

            var4 = var6.id_case();
         }

         if (var6.id_protected() != null && (var2 == null || var6.id_break() > var3)) {
            var2 = var6;
            var3 = var6.id_break();
         }
      }

      if (var4 > 5.0F && var1 != null) {
         return var1;
      } else {
         return var3 > 5.0F && var2 != null ? var2 : null;
      }
   }

   public iB_2 id_case() {
      return this.id_break;
   }

   public int id_protected() {
      return this.id_case ? (Integer)this.id_break.id_throws[41] - this.id_protected : this.id_throws - this.id_protected;
   }

   private void id_private() {
      this.id_private = null;
   }
}
