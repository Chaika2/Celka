package celestial;

public class rrsg_3 extends roH_2 {
   public rrsg_3() {
      super(128);
   }

   public rrsg_3(roH_2 var1, int var2) {
      super(128);
      System.arraycopy(var1.id_class(), var2 * 128, this.id_class, 0, 128);
   }

   @Override
   public byte[] id_class() {
      byte[] var1 = new byte[2048];

      for (int var2 = 0; var2 < 16; var2++) {
         System.arraycopy(this.id_class, 0, var1, var2 * 128, 128);
      }

      return var1;
   }

   @Override
   protected int id_break(int var1, int var2, int var3) {
      return var3 << 4 | var1;
   }
}
