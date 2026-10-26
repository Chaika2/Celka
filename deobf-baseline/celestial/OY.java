package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class OY {
   private final OT id_class;
   private final OY id_break;
   private final OY id_byte;
   private final int id_protected;
   private final List<OY> id_throws = Lists.newArrayList();
   private OY id_case;
   private OY id_catch;
   private int id_private;
   private float id_implements;
   private float id_finally;
   private float id_extends;
   private float id_native;

   private OY id_byte() {
      if (this.id_catch != null) {
         return this.id_catch;
      } else {
         return !this.id_throws.isEmpty() ? this.id_throws.get(0) : null;
      }
   }

   public OY(OT var1, OY var2, OY var3, int var4, int var5) {
      if (var1.id_byte() == null) {
         throw new IllegalArgumentException("Can't position an invisible advancement!");
      } else {
         this.id_class = var1;
         this.id_break = var2;
         this.id_byte = var3;
         this.id_protected = var4;
         this.id_case = this;
         this.id_private = var5;
         this.id_implements = -1.0F;
         OY var6 = null;

         for (OT var8 : var1.id_throws()) {
            var6 = this.id_class(var8, var6);
         }
      }
   }

   private OY id_class(OT var1, OY var2) {
      if (var1.id_byte() != null) {
         var2 = new OY(var1, this, var2, this.id_throws.size() + 1, this.id_private + 1);
         this.id_throws.add(var2);
      } else {
         for (OT var4 : var1.id_throws()) {
            var2 = this.id_class(var4, var2);
         }
      }

      return var2;
   }

   public static void id_class(OT var0) {
      if (var0.id_byte() == null) {
         throw new IllegalArgumentException("Can't position children of an invisible root!");
      } else {
         OY var1 = new OY(var0, (OY)null, (OY)null, 1, 0);
         var1.id_class();
         float var2 = var1.id_class(0.0F, 0, var1.id_implements);
         if (var2 < 0.0F) {
            var1.id_class(-var2);
         }

         var1.id_throws();
      }
   }

   private OY id_class(OY var1) {
      if (this.id_byte == null) {
         return var1;
      } else {
         OY var2 = this;
         OY var3 = this;
         OY var4 = this.id_byte;
         OY var5 = this.id_break.id_throws.get(0);
         float var6 = this.id_finally;
         float var7 = this.id_finally;
         float var8 = var4.id_finally;

         float var9;
         for (var9 = var5.id_finally; var4.id_protected() != null && var2.id_byte() != null; var7 += var3.id_finally) {
            var4 = var4.id_protected();
            var2 = var2.id_byte();
            var5 = var5.id_byte();
            var3 = var3.id_protected();
            var3.id_case = this;
            float var10 = var4.id_implements + var8 - (var2.id_implements + var6) + 1.0F;
            if (var10 > 0.0F) {
               var4.id_class(this, var1).id_class(this, var10);
               var6 += var10;
               var7 += var10;
            }

            var8 += var4.id_finally;
            var6 += var2.id_finally;
            var9 += var5.id_finally;
         }

         if (var4.id_protected() != null && var3.id_protected() == null) {
            var3.id_catch = var4.id_protected();
            var3.id_finally += var8 - var7;
         } else {
            if (var2.id_byte() != null && var5.id_byte() == null) {
               var5.id_catch = var2.id_byte();
               var5.id_finally += var6 - var9;
            }

            var1 = this;
         }

         return var1;
      }
   }

   private void id_class(OY var1, float var2) {
      float var3 = (float)(var1.id_protected - this.id_protected);
      if (var3 != 0.0F) {
         var1.id_extends -= var2 / var3;
         this.id_extends += var2 / var3;
      }

      var1.id_native += var2;
      var1.id_implements += var2;
      var1.id_finally += var2;
   }

   private OY id_class(OY var1, OY var2) {
      return this.id_case != null && var1.id_break.id_throws.contains(this.id_case) ? this.id_case : var2;
   }

   private float id_class(float var1, int var2, float var3) {
      this.id_implements += var1;
      this.id_private = var2;
      if (this.id_implements < var3) {
         var3 = this.id_implements;
      }

      for (OY var5 : this.id_throws) {
         var3 = var5.id_class(var1 + this.id_finally, var2 + 1, var3);
      }

      return var3;
   }

   private void id_class(float var1) {
      this.id_implements += var1;

      for (OY var3 : this.id_throws) {
         var3.id_class(var1);
      }
   }

   private void id_class() {
      if (this.id_throws.isEmpty()) {
         if (this.id_byte != null) {
            this.id_implements = this.id_byte.id_implements + 1.0F;
         } else {
            this.id_implements = 0.0F;
         }
      } else {
         OY var1 = null;

         for (OY var3 : this.id_throws) {
            var3.id_class();
            var1 = var3.id_class(var1 == null ? var3 : var1);
         }

         this.id_break();
         float var4 = (this.id_throws.get(0).id_implements + this.id_throws.get(this.id_throws.size() - 1).id_implements) / 2.0F;
         if (this.id_byte != null) {
            this.id_implements = this.id_byte.id_implements + 1.0F;
            this.id_finally = this.id_implements - var4;
         } else {
            this.id_implements = var4;
         }
      }
   }

   private void id_break() {
      float var1 = 0.0F;
      float var2 = 0.0F;

      for (int var3 = this.id_throws.size() - 1; var3 >= 0; var3--) {
         OY var4 = this.id_throws.get(var3);
         var4.id_implements += var1;
         var4.id_finally += var1;
         var2 += var4.id_extends;
         var1 += var4.id_native + var2;
      }
   }

   private void id_throws() {
      if (this.id_class.id_byte() != null) {
         this.id_class.id_byte().id_class((float)this.id_private, this.id_implements);
      }

      if (!this.id_throws.isEmpty()) {
         for (OY var2 : this.id_throws) {
            var2.id_throws();
         }
      }
   }

   private OY id_protected() {
      if (this.id_catch != null) {
         return this.id_catch;
      } else {
         return !this.id_throws.isEmpty() ? this.id_throws.get(this.id_throws.size() - 1) : null;
      }
   }
}
