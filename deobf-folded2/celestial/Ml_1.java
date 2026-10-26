package celestial;

import com.google.common.collect.Queues;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ml_1 {
   Deque<MH> id_class = new ArrayDeque<>();
   private final Deque<MH> id_break = rqR_2.id_class(Queues.newArrayDeque(), var0 -> {
      rjV_2 var1 = new rjV_2();
      var1.id_class();
      rjj_3 var2 = new rjj_3();
      var2.id_byte();
      var0.add(new MH(var1, var2));
   });

   public MH id_byte() {
      return this.id_break.getLast();
   }

   @Override
   public String toString() {
      return this.id_byte().toString();
   }

   public void id_class(double var1, double var3, double var5) {
      MH var7 = this.id_break.getLast();
      rjV_2 var8 = var7.id_class();
      var8.id_class((float)var1, (float)var3, (float)var5);
   }

   public void id_class(rjY_2 var1) {
      MH var2 = this.id_break.getLast();
      rjV_2 var3 = var2.id_class();
      var3.id_class(var1);
      rjj_3 var4 = var2.id_break();
      var4.id_class(var1);
   }

   public void id_class() {
      MH var1 = this.id_break.getLast();
      MH var2 = this.id_class.pollLast();
      if (var2 == null) {
         var2 = new MH(var1.id_class.id_case(), var1.id_break.id_case());
      } else {
         var2.id_class.id_break(var1.id_class);
         var2.id_break.id_class(var1.id_break);
      }

      this.id_break.addLast(var2);
   }

   public void id_class(float var1, float var2, float var3) {
      MH var4 = this.id_break.getLast();
      var4.id_class.id_private(var1, var2, var3);
      if (var1 == var2 && var2 == var3) {
         if (var1 > 0.0F) {
            return;
         }

         var4.id_break.id_class(-1.0F);
      }

      float var5 = 1.0F / var1;
      float var6 = 1.0F / var2;
      float var7 = 1.0F / var3;
      float var8 = rfU_2.id_finally(var5 * var6 * var7);
      var4.id_break.id_break(rjj_3.id_protected(var8 * var5, var8 * var6, var8 * var7));
   }

   public void id_break(rjY_2 var1) {
      MH var2 = this.id_break.getLast();
      var2.id_class.id_break(var1);
      var2.id_break.id_break(var1);
   }

   public void id_break() {
      MH var1 = this.id_break.removeLast();
      if (var1 != null) {
         this.id_class.add(var1);
      }
   }

   public float id_throws() {
      return this.id_break.getLast().id_class.id_catch();
   }

   public boolean id_protected() {
      return this.id_break.size() == 1;
   }
}
