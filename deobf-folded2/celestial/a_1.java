package celestial;

import java.util.HashSet;
import java.util.List;

public interface a_1 {
   rP_2 id_byte();

   default a_1 id_class(rP_2 var1) {
      throw new UnsupportedOperationException();
   }

   default double id_class(int var1) {
      double var2 = 0.0;
      List var4 = this.id_catch();

      for (int var5 = var1; var5 < var4.size(); var5++) {
         var2 += ((rd_3)var4.get(var5)).id_throws();
      }

      return var2;
   }

   default a_1 id_class(Object var1) {
      throw new UnsupportedOperationException();
   }

   default int id_class() {
      return this.id_break().size();
   }

   List<rU_2> id_break();

   default void id_throws() {
      List var1 = this.id_break();
      List var2 = this.id_catch();
      if (!this.id_implements().equals(var1.get(0))) {
         throw new IllegalStateException("Start node does not equal first path element");
      } else if (!this.id_protected().equals(var1.get(var1.size() - 1))) {
         throw new IllegalStateException("End node does not equal last path element");
      } else if (var1.size() != var2.size() + 1) {
         throw new IllegalStateException("Size of path array is unexpected");
      } else {
         HashSet var3 = new HashSet();

         for (int var4 = 0; var4 < var1.size() - 1; var4++) {
            rU_2 var5 = (rU_2)var1.get(var4);
            rU_2 var6 = (rU_2)var1.get(var4 + 1);
            rd_3 var7 = (rd_3)var2.get(var4);
            if (!var5.equals(var7.id_break())) {
               throw new IllegalStateException("Path source is not equal to the movement source");
            }

            if (!var6.equals(var7.id_implements())) {
               throw new IllegalStateException("Path destination is not equal to the movement destination");
            }

            if (var3.contains(var5)) {
               throw new IllegalStateException("Path doubles back on itself, making a loop");
            }

            var3.add(var5);
         }
      }
   }

   List<rd_3> id_catch();

   int id_case();

   default rU_2 id_implements() {
      return this.id_break().get(0);
   }

   default rU_2 id_protected() {
      List var1 = this.id_break();
      return (rU_2)var1.get(var1.size() - 1);
   }

   default a_1 id_private() {
      throw new UnsupportedOperationException();
   }
}
