package celestial;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.function.BooleanSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AO extends roX_2 {
   private static final Logger id_class = LogManager.getLogger();
   private final roJ_2 id_break;
   private final rrse_3 id_byte;
   private volatile Ah_1 id_protected;
   final gm_3 id_throws;

   @Override
   public String id_byte() {
      return "Client Chunk Cache: " + this.id_protected.id_break.length() + ", " + this.id_protected();
   }

   @Override
   public boolean id_byte(int var1, int var2) {
      return this.id_case(var1 >> 4, var2 >> 4);
   }

   public AO(gm_3 var1, int var2) {
      this.id_throws = var1;
      this.id_break = new ron_3(var1, new rfj_3(0, 0));
      this.id_byte = new rrse_3(this, true, var1.id_default().id_break());
      this.id_protected = new Ah_1(this, id_break(var2));
   }

   @Override
   public boolean id_class(rfH_2 var1) {
      return this.id_case(var1.b_() >> 4, var1.d_() >> 4);
   }

   @Override
   public void id_class(rRo_1 var1, rjh_3 var2) {
      ((yX_2)QY.id_instanceof().id_class[8]).id_break(var2.id_break(), var2.id_byte(), var2.id_protected());
   }

   public void id_class(int var1, int var2) {
      if (this.id_protected.id_break(var1, var2)) {
         int var3 = this.id_protected.id_class(var1, var2);
         roJ_2 var4 = this.id_protected.id_class(var3);
         if (id_class(var4, var1, var2)) {
            var4.id_class(false);
            this.id_protected.id_class(var3, var4, (roJ_2)null);
         }
      }
   }

   private static boolean id_class(roJ_2 var0, int var1, int var2) {
      if (var0 == null) {
         return false;
      } else {
         rfj_3 var3 = var0.id_private();
         return var3.id_break == var1 && var3.id_byte == var2;
      }
   }

   @Override
   public boolean id_class(rfj_3 var1) {
      return this.id_case(var1.id_break, var1.id_byte);
   }

   @Override
   public rrse_3 id_class() {
      return this.id_byte;
   }

   @Override
   public boolean id_class(an_3 var1) {
      return this.id_case(rfU_2.id_byte(var1.rx()) >> 4, rfU_2.id_byte(var1.BO()) >> 4);
   }

   public roJ_2 id_class(int var1, int var2, rYZ var3, ruu_3 var4, rcd_3 var5, int var6, boolean var7) {
      if (!this.id_protected.id_break(var1, var2)) {
         id_class.warn("Ignoring chunk since it's not in the view range: {}, {}", var1, var2);
         return null;
      } else {
         int var8 = this.id_protected.id_class(var1, var2);
         Object var9 = this.id_protected.id_break.get(var8);
         if (!var7 && id_class((roJ_2)var9, var1, var2)) {
            boolean var10 = false;
            if (var9 instanceof rrbS_2 var11 && var4.id_break("ChunkDataOF") instanceof rrbB_2 var13) {
               var11.id_class(var13);
               roQ_2.id_class.set(var13);
               var10 = true;
            }

            ((roJ_2)var9).id_class(var3, var4, var5, var6);
            if (var10) {
               roQ_2.id_class.set((rrbB_2)null);
            }
         } else {
            if (var3 == null) {
               id_class.warn("Ignoring chunk since we don't have complete data: {}, {}", var1, var2);
               return null;
            }

            if (var9 != null) {
               ((roJ_2)var9).id_class(false);
            }

            var9 = new rrbS_2(this.id_throws, new rfj_3(var1, var2), var3);
            ((roJ_2)var9).id_class(var3, var4, var5, var6);
            this.id_protected.id_class(var8, (roJ_2)var9);
         }

         roQ_2[] var14 = ((roJ_2)var9).id_byte();
         rrse_3 var15 = this.id_class();
         var15.id_class(new rfj_3(var1, var2), true);

         for (int var16 = 0; var16 < var14.length; var16++) {
            roQ_2 var17 = var14[var16];
            var15.id_class(rjh_3.id_class(var1, var16, var2), roQ_2.id_class(var17));
         }

         this.id_throws.id_class(var1, var2);
         ((roJ_2)var9).id_class(true);
         return (roJ_2)var9;
      }
   }

   public roJ_2 id_class(int var1, int var2, roN_2 var3, boolean var4) {
      if (this.id_protected.id_break(var1, var2)) {
         roJ_2 var5 = this.id_protected.id_class(this.id_protected.id_class(var1, var2));
         if (id_class(var5, var1, var2)) {
            return var5;
         }
      }

      return var4 ? this.id_break : null;
   }

   public void id_class(int var1) {
      int var2 = this.id_protected.id_byte;
      int var3 = id_break(var1);
      if (var2 != var3) {
         Ah_1 var4 = new Ah_1(this, var3);
         var4.id_throws = this.id_protected.id_throws;
         var4.id_case = this.id_protected.id_case;

         for (int var5 = 0; var5 < this.id_protected.id_break.length(); var5++) {
            roJ_2 var6 = this.id_protected.id_break.get(var5);
            if (var6 != null) {
               rfj_3 var7 = var6.id_private();
               if (var4.id_break(var7.id_break, var7.id_byte)) {
                  var4.id_class(var4.id_class(var7.id_break, var7.id_byte), var6);
               }
            }
         }

         this.id_protected = var4;
      }
   }

   public void id_class(BooleanSupplier var1) {
   }

   @Override
   public rRq_1 id_break() {
      return this.id_throws;
   }

   public void id_break(int var1, int var2) {
      this.id_protected.id_throws = var1;
      this.id_protected.id_case = var2;
   }

   private static int id_break(int var0) {
      return Math.max(2, var0) + 3;
   }

   public AO id_throws() {
      Ah_1 var1 = this.id_case();
      AO var2 = new AO(this.id_throws, var1.id_byte() - 3);
      Ah_1 var3 = var2.id_case();
      var3.id_class(var1);
      if (var3.id_byte() != var1.id_byte()) {
         throw new IllegalStateException(var3.id_byte() + " " + var1.id_byte());
      } else {
         return var2;
      }
   }

   public Ah_1 id_case() {
      for (Field var4 : AO.class.getDeclaredFields()) {
         if (Ah_1.class.isAssignableFrom(var4.getType())) {
            try {
               return (Ah_1)var4.get(this);
            } catch (IllegalAccessException var6) {
               throw new RuntimeException(var6);
            }
         }
      }

      throw new RuntimeException(Arrays.toString((Object[])AO.class.getDeclaredFields()));
   }

   public int id_protected() {
      return this.id_protected.id_catch;
   }
}
