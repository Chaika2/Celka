package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

public class rLR {
   private final Map<iJ_2, ix_3> id_class = Maps.newHashMap();
   private final rLo_1 id_break;
   private final int id_byte;
   private String id_protected;

   public String id_byte() {
      return this.id_break();
   }

   protected rLR(rLo_1 var1, int var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public boolean id_class() {
      return false;
   }

   public static rLR id_class(int var0) {
      return rVL.id_const.id_class(var0);
   }

   public double id_class(int var1, ix_3 var2) {
      return var2.id_protected() * (double)(var1 + 1);
   }

   public rLR id_class(iJ_2 var1, String var2, double var3, id_3 var5) {
      ix_3 var6 = new ix_3(UUID.fromString(var2), this::id_byte, var3, var5);
      this.id_class.put(var1, var6);
      return this;
   }

   public void id_class(iB_2 var1, ik_3 var2, int var3) {
      for (Entry var5 : this.id_class.entrySet()) {
         ic_3 var6 = var2.id_class((iJ_2)var5.getKey());
         if (var6 != null) {
            var6.id_protected((ix_3)var5.getValue());
         }
      }
   }

   public void id_class(iB_2 var1, int var2) {
      if (this == rLD.id_finally) {
         if (var1.Ss() < var1.SK()) {
            var1.id_protected(1.0F);
         }
      } else if (this == rLD.id_super) {
         if (var1.Ss() > 1.0F) {
            var1.id_break(rye_3.id_package, 1.0F);
         }
      } else if (this == rLD.id_this) {
         var1.id_break(rye_3.id_int, 1.0F);
      } else if (this == rLD.id_new && var1 instanceof rhd_3) {
         ((rhd_3)var1).id_while(0.005F * (float)(var2 + 1));
      } else if (this == rLD.id_return && var1 instanceof rhd_3) {
         if (!((rYB)var1.id_throws[7]).id_continue) {
            ((rhd_3)var1).sk().id_class(var2 + 1, 1.0F);
         }
      } else if ((this != rLD.id_case || var1.BR()) && (this != rLD.id_catch || !var1.BR())) {
         if (this == rLD.id_catch && !var1.BR() || this == rLD.id_case && var1.BR()) {
            var1.id_break(rye_3.id_package, (float)(6 << var2));
         }
      } else {
         var1.id_protected((float)Math.max(4 << var2, 0));
      }
   }

   public void id_class(an_3 var1, an_3 var2, iB_2 var3, int var4, double var5) {
      if ((this != rLD.id_case || var3.BR()) && (this != rLD.id_catch || !var3.BR())) {
         if (this == rLD.id_catch && !var3.BR() || this == rLD.id_case && var3.BR()) {
            int var8 = (int)(var5 * (double)(6 << var4) + 0.5);
            if (var1 == null) {
               var3.id_break(rye_3.id_package, (float)var8);
            } else {
               var3.id_break(rye_3.id_byte(var1, var2), (float)var8);
            }
         } else {
            this.id_class(var3, var4);
         }
      } else {
         int var7 = (int)(var5 * (double)(4 << var4) + 0.5);
         var3.id_protected((float)var7);
      }
   }

   public boolean id_class(int var1, int var2) {
      if (this == rLD.id_finally) {
         int var5 = 50 >> var2;
         return var5 > 0 ? var1 % var5 == 0 : true;
      } else if (this == rLD.id_super) {
         int var4 = 25 >> var2;
         return var4 > 0 ? var1 % var4 == 0 : true;
      } else if (this == rLD.id_this) {
         int var3 = 40 >> var2;
         return var3 > 0 ? var1 % var3 == 0 : true;
      } else {
         return this == rLD.id_new;
      }
   }

   public static int id_class(rLR var0) {
      return rVL.id_const.id_class(var0);
   }

   public void id_break(iB_2 var1, ik_3 var2, int var3) {
      for (Entry var5 : this.id_class.entrySet()) {
         ic_3 var6 = var2.id_class((iJ_2)var5.getKey());
         if (var6 != null) {
            ix_3 var7 = (ix_3)var5.getValue();
            var6.id_protected(var7);
            var6.id_byte(new ix_3(var7.id_class(), this.id_byte() + " " + var3, this.id_class(var3, var7), var7.id_byte()));
         }
      }
   }

   protected String id_break() {
      if (this.id_protected == null) {
         this.id_protected = rqR_2.id_class("effect", rVL.id_const.id_break(this));
      }

      return this.id_protected;
   }

   public rLo_1 id_throws() {
      return this.id_break;
   }

   public Map<iJ_2, ix_3> id_catch() {
      return this.id_class;
   }

   public int id_case() {
      return this.id_byte;
   }

   public boolean id_implements() {
      return this.id_break == rLo_1.HARMFUL;
   }

   public rgP_2 id_protected() {
      return new rgn_3(this.id_byte());
   }

   public boolean id_private() {
      return this.id_break == rLo_1.BENEFICIAL;
   }
}
