package celestial;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;

public abstract class ev_3 {
   private final rXQ[] id_class;
   private final eF_2 id_protected;
   public final eC_2 id_break;
   protected String id_byte;

   public boolean id_byte() {
      return false;
   }

   public static ev_3 id_byte(int var0) {
      return rVL.id_boolean.id_class(var0);
   }

   protected ev_3(eF_2 var1, eC_2 var2, rXQ[] var3) {
      this.id_protected = var1;
      this.id_break = var2;
      this.id_class = var3;
   }

   public float id_class(int var1, aL_2 var2) {
      return 0.0F;
   }

   protected boolean id_class(ev_3 var1) {
      return this != var1;
   }

   public int id_class(int var1, rye_3 var2) {
      return 0;
   }

   public boolean id_class(rdn_3 var1) {
      return this.id_break.id_class(var1.id_break());
   }

   public void id_class(iB_2 var1, an_3 var2, int var3) {
   }

   public int id_class() {
      return 1;
   }

   public int id_class(int var1) {
      return 1 + var1 * 10;
   }

   public Map<rXQ, rdn_3> id_class(iB_2 var1) {
      EnumMap var2 = Maps.newEnumMap(rXQ.class);

      for (rXQ var6 : this.id_class) {
         rdn_3 var7 = var1.id_class(var6);
         if (!var7.id_class()) {
            var2.put(var6, var7);
         }
      }

      return var2;
   }

   public boolean id_break() {
      return false;
   }

   public void id_break(iB_2 var1, an_3 var2, int var3) {
   }

   public int id_break(int var1) {
      return this.id_class(var1) + 5;
   }

   public final boolean id_break(ev_3 var1) {
      return this.id_class(var1) && var1.id_class(this);
   }

   public int id_throws() {
      return 1;
   }

   public String id_catch() {
      return this.id_case();
   }

   protected String id_case() {
      if (this.id_byte == null) {
         this.id_byte = rqR_2.id_class("enchantment", rVL.id_boolean.id_break(this));
      }

      return this.id_byte;
   }

   public boolean id_implements() {
      return true;
   }

   public rgP_2 id_protected(int var1) {
      rgn_3 var2 = new rgn_3(this.id_catch());
      if (this.id_byte()) {
         var2.id_class(rgF_2.RED);
      } else {
         var2.id_class(rgF_2.GRAY);
      }

      if (var1 != 1 || this.id_class() != 1) {
         var2.id_break(" ").id_class(new rgn_3("enchantment.level." + var1));
      }

      return var2;
   }

   public eF_2 id_protected() {
      return this.id_protected;
   }

   public boolean id_private() {
      return true;
   }
}
