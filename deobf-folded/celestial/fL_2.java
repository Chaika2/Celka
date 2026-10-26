package celestial;

import java.io.IOException;

abstract class fL_2 implements AutoCloseable {
   protected boolean id_class;

   protected abstract void id_class(int var1) throws IOException;

   int id_class(long var1) {
      return this.id_class ? 1 : 0;
   }

   int id_class(long var1, long var3, int var5) {
      try {
         return this.id_break(var3, var5);
      } catch (IOException var7) {
         this.id_class = true;
         return 0;
      }
   }

   void id_class(long var1, int var3) {
      try {
         this.id_class(var3);
      } catch (IOException var5) {
         this.id_class = true;
      }
   }

   @Override
   public abstract void close() throws IOException;

   protected abstract int id_break(long var1, int var3) throws IOException;
}
