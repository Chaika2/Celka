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
   private IntSet throws_;
   private IntSet case_;
   private Int2IntMap catch_;

   public rwM_2(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   void class_(int var1, int var2, int var3) {
      Dynamic var4 = (Dynamic)this.break_.get(var2);
      String var5 = var4.get("Name").asString("");
      boolean var6 = Objects.equals(var4.get("Properties").get("persistent").asString(""), "true");
      int var7 = this.class_(var5, var6, var3);
      if (!this.catch_.containsKey(var7)) {
         int var8 = this.break_.size();
         this.throws_.add(var8);
         this.catch_.put(var7, var8);
         this.break_.add(this.class_(var4, var5, var6, var3));
      }

      int var11 = this.catch_.get(var7);
      if (1 << this.protected_.break_() <= var11) {
         ryv_3 var9 = new ryv_3(this.protected_.break_() + 1, 4096);

         for (int var10 = 0; var10 < 4096; var10++) {
            var9.class_(var10, this.protected_.class_(var10));
         }

         this.protected_ = var9;
      }

      this.protected_.class_(var1, var11);
   }

   public boolean class_(int var1) {
      return this.case_.contains(var1);
   }

   @Override
   protected boolean class_() {
      this.throws_ = new IntOpenHashSet();
      this.case_ = new IntOpenHashSet();
      this.catch_ = new Int2IntOpenHashMap();

      for (int var1 = 0; var1 < this.break_.size(); var1++) {
         Dynamic var2 = (Dynamic)this.break_.get(var1);
         String var3 = var2.get("Name").asString("");
         if (rwb_3.break_.containsKey(var3)) {
            boolean var4 = Objects.equals(var2.get("Properties").get("decayable").asString(""), "false");
            this.throws_.add(var1);
            this.catch_.put(this.class_(var3, var4, 7), var1);
            this.break_.set(var1, this.class_(var2, var3, var4, 7));
         }

         if (rwb_3.byte_.contains(var3)) {
            this.case_.add(var1);
         }
      }

      return this.throws_.isEmpty() && this.case_.isEmpty();
   }

   private Dynamic<?> class_(Dynamic<?> var1, String var2, boolean var3, int var4) {
      Dynamic var5 = var1.emptyMap();
      var5 = var5.set("persistent", var5.createString(var3 ? "true" : "false"));
      var5 = var5.set("distance", var5.createString(Integer.toString(var4)));
      Dynamic var6 = var1.emptyMap();
      var6 = var6.set("Properties", var5);
      return var6.set("Name", var6.createString(var2));
   }

   public boolean break_(int var1) {
      return this.throws_.contains(var1);
   }

   int protected_(int var1) {
      return this.class_(var1) ? 0 : Integer.parseInt(((Dynamic)this.break_.get(var1)).get("Properties").get("distance").asString(""));
   }
}
