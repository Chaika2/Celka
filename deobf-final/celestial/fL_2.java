package celestial;

import java.io.IOException;

abstract class fL_2 implements AutoCloseable {
   protected boolean class_;

   protected abstract void class_(int var1) throws IOException;

   int class_(long var1) {
      return this.class_ ? 1 : 0;
   }

   int class_(long var1, long var3, int var5) {
      try {
         return this.break_(var3, var5);
      } catch (IOException var7) {
         this.class_ = true;
         return 0;
      }
   }

   void class_(long var1, int var3) {
      try {
         this.class_(var3);
      } catch (IOException var5) {
         this.class_ = true;
      }
   }

   @Override
   public abstract void close() throws IOException;

   protected abstract int break_(long var1, int var3) throws IOException;
}
