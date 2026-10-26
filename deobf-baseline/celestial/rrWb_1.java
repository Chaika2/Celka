package celestial;

public class rrWb_1 {
   private int id_class = 18;
   private int id_break = 128;
   private int id_byte = 18;
   private int id_protected = 0;
   private int id_throws = 0;
   private int id_case = 0;
   private byte[][][] id_catch = (byte[][][])null;
   private byte[] id_private = null;
   private int id_implements = 0;

   public rrWb_1(int var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_catch = new byte[var1][var2][var3];
      this.id_class();
   }

   public void id_class(byte var1) {
      try {
         this.id_private[this.id_implements] = var1;
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void id_class(int var1, int var2, int var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_class();
   }

   public void id_class() {
      for (int var1 = 0; var1 < this.id_class; var1++) {
         byte[][] var2 = this.id_catch[var1];

         for (int var3 = 0; var3 < this.id_break; var3++) {
            byte[] var4 = var2[var3];

            for (int var5 = 0; var5 < this.id_byte; var5++) {
               var4[var5] = -1;
            }
         }
      }
   }

   public byte id_break(int var1, int var2, int var3) {
      try {
         this.id_private = this.id_catch[var1 - this.id_protected][var2 - this.id_throws];
         this.id_implements = var3 - this.id_case;
         return this.id_private[this.id_implements];
      } catch (ArrayIndexOutOfBoundsException var5) {
         var5.printStackTrace();
         return -1;
      }
   }
}
