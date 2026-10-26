package celestial;

import com.google.common.collect.Queues;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ml_1 {
   Deque<MH> class_ = new ArrayDeque<>();
   private final Deque<MH> break_ = rqR_2.class_(Queues.newArrayDeque(), var0 -> {
      rjV_2 var1 = new rjV_2();
      var1.class_();
      rjj_3 var2 = new rjj_3();
      var2.byte_();
      var0.add(new MH(var1, var2));
   });

   public MH byte_() {
      return this.break_.getLast();
   }

   @Override
   public String toString() {
      return this.byte_().toString();
   }

   public void class_(double var1, double var3, double var5) {
      MH var7 = this.break_.getLast();
      rjV_2 var8 = var7.class_();
      var8.class_((float)var1, (float)var3, (float)var5);
   }

   public void class_(rjY_2 var1) {
      MH var2 = this.break_.getLast();
      rjV_2 var3 = var2.class_();
      var3.class_(var1);
      rjj_3 var4 = var2.break_();
      var4.class_(var1);
   }

   public void class_() {
      MH var1 = this.break_.getLast();
      MH var2 = this.class_.pollLast();
      if (var2 == null) {
         var2 = new MH(var1.class_.case_(), var1.break_.case_());
      } else {
         var2.class_.break_(var1.class_);
         var2.break_.class_(var1.break_);
      }

      this.break_.addLast(var2);
   }

   public void class_(float var1, float var2, float var3) {
      MH var4 = this.break_.getLast();
      var4.class_.private_(var1, var2, var3);
      if (var1 == var2 && var2 == var3) {
         if (var1 > 0.0F) {
            return;
         }

         var4.break_.class_(-1.0F);
      }

      float var5 = 1.0F / var1;
      float var6 = 1.0F / var2;
      float var7 = 1.0F / var3;
      float var8 = rfU_2.finally_(var5 * var6 * var7);
      var4.break_.break_(rjj_3.protected_(var8 * var5, var8 * var6, var8 * var7));
   }

   public void break_(rjY_2 var1) {
      MH var2 = this.break_.getLast();
      var2.class_.break_(var1);
      var2.break_.break_(var1);
   }

   public void break_() {
      MH var1 = this.break_.removeLast();
      if (var1 != null) {
         this.class_.add(var1);
      }
   }

   public float throws_() {
      return this.break_.getLast().class_.catch_();
   }

   public boolean protected_() {
      return this.break_.size() == 1;
   }
}
