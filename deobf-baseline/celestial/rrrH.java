package celestial;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class rrrH<C extends rUv_1> {
   public static final rrrH<?> id_class = new rrry_1(rrrZ.id_byte, 0, 0, rfi_3.id_class(), 0, 0L);
   private final rrrZ<C> id_throws;
   protected final List<rrrn_1> id_break = Lists.newArrayList();
   protected rfi_3 id_byte;
   private final int id_case;
   private final int id_catch;
   private int id_private;
   protected final rqm_3 id_protected;

   public rfi_3 id_byte() {
      return this.id_byte;
   }

   public rrrH(rrrZ<C> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      this.id_throws = var1;
      this.id_case = var2;
      this.id_catch = var3;
      this.id_private = var5;
      this.id_protected = new rqm_3();
      this.id_protected.id_byte(var6, var2, var3);
      this.id_byte = var4;
   }

   public rcd_3 id_class(int var1, int var2) {
      rcd_3 var3 = new rcd_3();
      if (this.id_throws()) {
         var3.id_class("id", rVL.t.id_break(this.id_native()).toString());
         var3.id_break("ChunkX", var1);
         var3.id_break("ChunkZ", var2);
         var3.id_break("references", this.id_private);
         var3.id_class("BB", this.id_byte.id_private());
         rcy_3 var4 = new rcy_3();
         synchronized (this.id_break) {
            for (rrrn_1 var7 : this.id_break) {
               var4.add(var7.id_case());
            }
         }

         var3.id_class("Children", var4);
         return var3;
      } else {
         var3.id_class("id", "INVALID");
         return var3;
      }
   }

   public rfH_2 id_class() {
      return new rfH_2(this.id_case << 4, 0, this.id_catch << 4);
   }

   protected void id_class(Random var1, int var2, int var3) {
      int var4 = var3 - var2 + 1 - this.id_byte.id_throws();
      int var5;
      if (var4 > 1) {
         var5 = var2 + var1.nextInt(var4);
      } else {
         var5 = var2;
      }

      int var6 = var5 - this.id_byte.id_break;
      this.id_byte.id_class(0, var6, 0);

      for (rrrn_1 var8 : this.id_break) {
         var8.id_class(0, var6, 0);
      }
   }

   public abstract void id_class(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, C var7);

   protected void id_class(int var1, Random var2, int var3) {
      int var4 = var1 - var3;
      int var5 = this.id_byte.id_throws() + 1;
      if (var5 < var4) {
         var5 += var2.nextInt(var4 - var5);
      }

      int var6 = var5 - this.id_byte.id_throws;
      this.id_byte.id_class(0, var6, 0);

      for (rrrn_1 var8 : this.id_break) {
         var8.id_class(0, var6, 0);
      }
   }

   public void id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6) {
      synchronized (this.id_break) {
         if (!this.id_break.isEmpty()) {
            rfi_3 var8 = this.id_break.get(0).id_final;
            rja_3 var9 = var8.id_catch();
            rfH_2 var10 = new rfH_2(var9.b_(), var8.id_break, var9.d_());
            Iterator var11 = this.id_break.iterator();

            while (var11.hasNext()) {
               rrrn_1 var12 = (rrrn_1)var11.next();
               if (var12.id_catch().id_class(var5) && !var12.id_class(var1, var2, var3, var4, var5, var6, var10)) {
                  var11.remove();
               }
            }

            this.id_break();
         }
      }
   }

   protected void id_break() {
      this.id_byte = rfi_3.id_class();

      for (rrrn_1 var2 : this.id_break) {
         this.id_byte.id_break(var2.id_catch());
      }
   }

   public boolean id_throws() {
      return !this.id_break.isEmpty();
   }

   public int id_finally() {
      return this.id_private;
   }

   public int id_catch() {
      return this.id_catch;
   }

   protected int id_extends() {
      return 1;
   }

   public int id_case() {
      return this.id_case;
   }

   public void id_implements() {
      this.id_private++;
   }

   public List<rrrn_1> id_protected() {
      return this.id_break;
   }

   public boolean id_private() {
      return this.id_private < this.id_extends();
   }

   public rrrZ<?> id_native() {
      return this.id_throws;
   }
}
