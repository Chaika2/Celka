package celestial;

import java.util.HashSet;
import java.util.List;

public interface a_1 {
   rP_2 byte_();

   default a_1 class_(rP_2 var1) {
      throw new UnsupportedOperationException();
   }

   default double class_(int var1) {
      double var2 = 0.0;
      List var4 = this.catch_();

      for (int var5 = var1; var5 < var4.size(); var5++) {
         var2 += ((rd_3)var4.get(var5)).throws_();
      }

      return var2;
   }

   default a_1 class_(Object var1) {
      throw new UnsupportedOperationException();
   }

   default int class_() {
      return this.break_().size();
   }

   List<rU_2> break_();

   default void throws_() {
      List var1 = this.break_();
      List var2 = this.catch_();
      if (!this.implements_().equals(var1.get(0))) {
         throw new IllegalStateException("Start node does not equal first path element");
      } else if (!this.protected_().equals(var1.get(var1.size() - 1))) {
         throw new IllegalStateException("End node does not equal last path element");
      } else if (var1.size() != var2.size() + 1) {
         throw new IllegalStateException("Size of path array is unexpected");
      } else {
         HashSet var3 = new HashSet();

         for (int var4 = 0; var4 < var1.size() - 1; var4++) {
            rU_2 var5 = (rU_2)var1.get(var4);
            rU_2 var6 = (rU_2)var1.get(var4 + 1);
            rd_3 var7 = (rd_3)var2.get(var4);
            if (!var5.equals(var7.break_())) {
               throw new IllegalStateException("Path source is not equal to the movement source");
            }

            if (!var6.equals(var7.implements_())) {
               throw new IllegalStateException("Path destination is not equal to the movement destination");
            }

            if (var3.contains(var5)) {
               throw new IllegalStateException("Path doubles back on itself, making a loop");
            }

            var3.add(var5);
         }
      }
   }

   List<rd_3> catch_();

   int case_();

   default rU_2 implements_() {
      return this.break_().get(0);
   }

   default rU_2 protected_() {
      List var1 = this.break_();
      return (rU_2)var1.get(var1.size() - 1);
   }

   default a_1 private_() {
      throw new UnsupportedOperationException();
   }
}
