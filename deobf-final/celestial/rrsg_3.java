package celestial;

public class rrsg_3 extends roH_2 {
   public rrsg_3() {
      super(128);
   }

   public rrsg_3(roH_2 var1, int var2) {
      super(128);
      System.arraycopy(var1.class_(), var2 * 128, this.class_, 0, 128);
   }

   @Override
   public byte[] class_() {
      byte[] var1 = new byte[2048];

      for (int var2 = 0; var2 < 16; var2++) {
         System.arraycopy(this.class_, 0, var1, var2 * 128, 128);
      }

      return var1;
   }

   @Override
   protected int break_(int var1, int var2, int var3) {
      return var3 << 4 | var1;
   }
}
