package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Random;

public final class rXE extends rCn_1<rXs_1, rXE> {
   public static final Codec<rXE> id_class = id_class(rVL.id_default, rXs_1::id_private).stable();

   public boolean id_byte() {
      return this.id_class().id_break();
   }

   public rjU_2 id_byte(rRq_1 var1, rfH_2 var2) {
      return this.id_class().id_class(var1, var2, this);
   }

   public rXE(rXs_1 var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<rXE> var3) {
      super(var1, var2, var3);
   }

   public void id_class(rYB var1, rfH_2 var2) {
      this.id_class().id_class(var1, var2, this);
   }

   public void id_class(rYB var1, rfH_2 var2, Random var3) {
      this.id_class().id_class(var1, var2, this, var3);
   }

   public rXs_1 id_class() {
      return this.id_byte;
   }

   public boolean id_class(rlb_3<rXs_1> var1) {
      return this.id_class().id_class(var1);
   }

   public boolean id_class(rRq_1 var1, rfH_2 var2, rXs_1 var3, rpr_3 var4) {
      return this.id_class().id_class(this, var1, var2, var3, var4);
   }

   public float id_class(rRq_1 var1, rfH_2 var2) {
      return this.id_class().id_class(this, var1, var2);
   }

   public boolean id_break(rRq_1 var1, rfH_2 var2) {
      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            rfH_2 var5 = var2.id_break(var3, 0, var4);
            rXE var6 = var1.id_break(var5);
            if (!var6.id_class().id_class(this.id_class()) && !var1.id_byte(var5).id_implements(var1, var5)) {
               return true;
            }
         }
      }

      return false;
   }

   public void id_break(rYB var1, rfH_2 var2, Random var3) {
      this.id_class().id_break(var1, var2, this, var3);
   }

   public boolean id_break() {
      return this.id_class().id_byte(this);
   }

   public int id_throws() {
      return this.id_class().id_protected(this);
   }

   public xc_3 id_catch() {
      return this.id_class().id_break(this);
   }

   public boolean id_case() {
      return this.id_class().id_finally();
   }

   public float id_implements() {
      return this.id_class().id_byte();
   }

   public rjC_2 id_protected(rRq_1 var1, rfH_2 var2) {
      return this.id_class().id_break(this, var1, var2);
   }

   public float id_protected() {
      return this.id_class().id_class(this);
   }

   public rLx_1 id_private() {
      return this.id_class().id_implements();
   }
}
