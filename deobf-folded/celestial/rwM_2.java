package celestial;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class rwM_2 extends rwO_2 {
   private IntSet id_throws;
   private IntSet id_case;
   private Int2IntMap id_catch;

   public rwM_2(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   void id_class(int var1, int var2, int var3) {
      Dynamic var4 = (Dynamic)this.id_break.get(var2);
      String var5 = var4.get("Name").asString("");
      boolean var6 = Objects.equals(var4.get("Properties").get("persistent").asString(""), "true");
      int var7 = this.id_class(var5, var6, var3);
      if (!this.id_catch.containsKey(var7)) {
         int var8 = this.id_break.size();
         this.id_throws.add(var8);
         this.id_catch.put(var7, var8);
         this.id_break.add(this.id_class(var4, var5, var6, var3));
      }

      int var11 = this.id_catch.get(var7);
      if (1 << this.id_protected.id_break() <= var11) {
         ryv_3 var9 = new ryv_3(this.id_protected.id_break() + 1, 4096);

         for (int var10 = 0; var10 < 4096; var10++) {
            var9.id_class(var10, this.id_protected.id_class(var10));
         }

         this.id_protected = var9;
      }

      this.id_protected.id_class(var1, var11);
   }

   public boolean id_class(int var1) {
      return this.id_case.contains(var1);
   }

   @Override
   protected boolean id_class() {
      this.id_throws = new IntOpenHashSet();
      this.id_case = new IntOpenHashSet();
      this.id_catch = new Int2IntOpenHashMap();

      for (int var1 = 0; var1 < this.id_break.size(); var1++) {
         Dynamic var2 = (Dynamic)this.id_break.get(var1);
         String var3 = var2.get("Name").asString("");
         if (rwb_3.id_break.containsKey(var3)) {
            boolean var4 = Objects.equals(var2.get("Properties").get("decayable").asString(""), "false");
            this.id_throws.add(var1);
            this.id_catch.put(this.id_class(var3, var4, 7), var1);
            this.id_break.set(var1, this.id_class(var2, var3, var4, 7));
         }

         if (rwb_3.id_byte.contains(var3)) {
            this.id_case.add(var1);
         }
      }

      return this.id_throws.isEmpty() && this.id_case.isEmpty();
   }

   private Dynamic<?> id_class(Dynamic<?> var1, String var2, boolean var3, int var4) {
      Dynamic var5 = var1.emptyMap();
      var5 = var5.set("persistent", var5.createString(var3 ? "true" : "false"));
      var5 = var5.set("distance", var5.createString(Integer.toString(var4)));
      Dynamic var6 = var1.emptyMap();
      var6 = var6.set("Properties", var5);
      return var6.set("Name", var6.createString(var2));
   }

   public boolean id_break(int var1) {
      return this.id_throws.contains(var1);
   }

   int id_protected(int var1) {
      return this.id_class(var1) ? 0 : Integer.parseInt(((Dynamic)this.id_break.get(var1)).get("Properties").get("distance").asString(""));
   }
}
